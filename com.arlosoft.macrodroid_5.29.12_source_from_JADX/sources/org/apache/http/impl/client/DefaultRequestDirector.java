package org.apache.http.impl.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@NotThreadSafe
public class DefaultRequestDirector implements RequestDirector {
    protected final ClientConnectionManager connManager;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    protected final AuthenticationHandler proxyAuthHandler;
    protected final AuthState proxyAuthState;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    protected final AuthenticationHandler targetAuthHandler;
    protected final AuthState targetAuthState;
    protected final UserTokenHandler userTokenHandler;
    private HttpHost virtualHost;

    DefaultRequestDirector(Log log2, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        if (log2 == null) {
            throw new IllegalArgumentException("Log may not be null.");
        } else if (httpRequestExecutor == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (clientConnectionManager == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (connectionReuseStrategy == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (connectionKeepAliveStrategy == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (httpRoutePlanner == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (httpProcessor2 == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (httpRequestRetryHandler == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (redirectHandler2 == null) {
            throw new IllegalArgumentException("Redirect handler may not be null.");
        } else if (authenticationHandler == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (authenticationHandler2 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (userTokenHandler2 == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (httpParams != null) {
            this.log = log2;
            this.requestExec = httpRequestExecutor;
            this.connManager = clientConnectionManager;
            this.reuseStrategy = connectionReuseStrategy;
            this.keepAliveStrategy = connectionKeepAliveStrategy;
            this.routePlanner = httpRoutePlanner;
            this.httpProcessor = httpProcessor2;
            this.retryHandler = httpRequestRetryHandler;
            this.redirectHandler = redirectHandler2;
            this.targetAuthHandler = authenticationHandler;
            this.proxyAuthHandler = authenticationHandler2;
            this.userTokenHandler = userTokenHandler2;
            this.params = httpParams;
            this.managedConn = null;
            this.redirectCount = 0;
            this.maxRedirects = httpParams.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
            this.targetAuthState = new AuthState();
            this.proxyAuthState = new AuthState();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(e.getMessage(), e);
                }
            }
            try {
                managedClientConnection.releaseConnection();
            } catch (IOException e2) {
                this.log.debug("Error releasing connection", e2);
            }
        }
    }

    private void processChallenges(Map<String, Header> map, AuthState authState, AuthenticationHandler authenticationHandler, HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException, AuthenticationException {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = authenticationHandler.selectScheme(map, httpResponse, httpContext);
            authState.setAuthScheme(authScheme);
        }
        String schemeName = authScheme.getSchemeName();
        Header header = map.get(schemeName.toLowerCase(Locale.ENGLISH));
        if (header != null) {
            authScheme.processChallenge(header);
            this.log.debug("Authorization challenge processed");
            return;
        }
        throw new AuthenticationException(schemeName + " authorization challenge expected, but not found");
    }

    private void updateAuthState(AuthState authState, HttpHost httpHost, CredentialsProvider credentialsProvider) {
        if (authState.isValid()) {
            String hostName = httpHost.getHostName();
            int port = httpHost.getPort();
            if (port < 0) {
                port = this.connManager.getSchemeRegistry().getScheme(httpHost).getDefaultPort();
            }
            AuthScheme authScheme = authState.getAuthScheme();
            AuthScope authScope = new AuthScope(hostName, port, authScheme.getRealm(), authScheme.getSchemeName());
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Authentication scope: " + authScope);
            }
            Credentials credentials = authState.getCredentials();
            if (credentials == null) {
                credentials = credentialsProvider.getCredentials(authScope);
                if (this.log.isDebugEnabled()) {
                    if (credentials != null) {
                        this.log.debug("Found credentials");
                    } else {
                        this.log.debug("Credentials not found");
                    }
                }
            } else if (authScheme.isComplete()) {
                this.log.debug("Authentication failed");
                credentials = null;
            }
            authState.setAuthScope(authScope);
            authState.setCredentials(credentials);
        }
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) throws ProtocolException {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            return new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
        }
        return new RequestWrapper(httpRequest);
    }

    /* access modifiers changed from: protected */
    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    /* access modifiers changed from: protected */
    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute r17, org.apache.http.protocol.HttpContext r18) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r16 = this;
            r7 = r16
            r8 = r18
            org.apache.http.HttpHost r9 = r17.getProxyHost()
            org.apache.http.HttpHost r10 = r17.getTargetHost()
            r11 = 0
            r12 = 0
            r1 = r11
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x012c
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L_0x0024
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            org.apache.http.params.HttpParams r1 = r7.params
            r14 = r17
            r0.open(r14, r8, r1)
            goto L_0x0026
        L_0x0024:
            r14 = r17
        L_0x0026:
            org.apache.http.HttpRequest r0 = r16.createConnectRequest(r17, r18)
            org.apache.http.params.HttpParams r1 = r7.params
            r0.setParams(r1)
            java.lang.String r1 = "http.target_host"
            r8.setAttribute(r1, r10)
            java.lang.String r1 = "http.proxy_host"
            r8.setAttribute(r1, r9)
            org.apache.http.conn.ManagedClientConnection r1 = r7.managedConn
            java.lang.String r2 = "http.connection"
            r8.setAttribute(r2, r1)
            org.apache.http.auth.AuthState r1 = r7.targetAuthState
            java.lang.String r2 = "http.auth.target-scope"
            r8.setAttribute(r2, r1)
            org.apache.http.auth.AuthState r1 = r7.proxyAuthState
            java.lang.String r2 = "http.auth.proxy-scope"
            r8.setAttribute(r2, r1)
            java.lang.String r1 = "http.request"
            r8.setAttribute(r1, r0)
            org.apache.http.protocol.HttpRequestExecutor r1 = r7.requestExec
            org.apache.http.protocol.HttpProcessor r2 = r7.httpProcessor
            r1.preProcess(r0, r2, r8)
            org.apache.http.protocol.HttpRequestExecutor r1 = r7.requestExec
            org.apache.http.conn.ManagedClientConnection r2 = r7.managedConn
            org.apache.http.HttpResponse r15 = r1.execute(r0, r2, r8)
            org.apache.http.params.HttpParams r0 = r7.params
            r15.setParams(r0)
            org.apache.http.protocol.HttpRequestExecutor r0 = r7.requestExec
            org.apache.http.protocol.HttpProcessor r1 = r7.httpProcessor
            r0.postProcess(r15, r1, r8)
            org.apache.http.StatusLine r0 = r15.getStatusLine()
            int r0 = r0.getStatusCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x0111
            java.lang.String r0 = "http.auth.credentials-provider"
            java.lang.Object r0 = r8.getAttribute(r0)
            r6 = r0
            org.apache.http.client.CredentialsProvider r6 = (org.apache.http.client.CredentialsProvider) r6
            if (r6 == 0) goto L_0x010d
            org.apache.http.params.HttpParams r0 = r7.params
            boolean r0 = org.apache.http.client.params.HttpClientParams.isAuthenticating(r0)
            if (r0 == 0) goto L_0x010d
            org.apache.http.client.AuthenticationHandler r0 = r7.proxyAuthHandler
            boolean r0 = r0.isAuthenticationRequested(r15, r8)
            if (r0 == 0) goto L_0x0108
            org.apache.commons.logging.Log r0 = r7.log
            java.lang.String r1 = "Proxy requested authentication"
            r0.debug(r1)
            org.apache.http.client.AuthenticationHandler r0 = r7.proxyAuthHandler
            java.util.Map r2 = r0.getChallenges(r15, r8)
            org.apache.http.auth.AuthState r3 = r7.proxyAuthState     // Catch:{ AuthenticationException -> 0x00b2 }
            org.apache.http.client.AuthenticationHandler r4 = r7.proxyAuthHandler     // Catch:{ AuthenticationException -> 0x00b2 }
            r1 = r16
            r5 = r15
            r13 = r6
            r6 = r18
            r1.processChallenges(r2, r3, r4, r5, r6)     // Catch:{ AuthenticationException -> 0x00b0 }
            goto L_0x00d8
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            r0 = move-exception
            r13 = r6
        L_0x00b4:
            org.apache.commons.logging.Log r1 = r7.log
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L_0x00d8
            org.apache.commons.logging.Log r1 = r7.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Authentication error: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.warn(r0)
            r1 = r15
            goto L_0x012c
        L_0x00d8:
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            r7.updateAuthState(r0, r9, r13)
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            org.apache.http.auth.Credentials r0 = r0.getCredentials()
            if (r0 == 0) goto L_0x0105
            org.apache.http.ConnectionReuseStrategy r0 = r7.reuseStrategy
            boolean r0 = r0.keepAlive(r15, r8)
            if (r0 == 0) goto L_0x00fe
            org.apache.commons.logging.Log r0 = r7.log
            java.lang.String r1 = "Connection kept alive"
            r0.debug(r1)
            org.apache.http.HttpEntity r0 = r15.getEntity()
            if (r0 == 0) goto L_0x0103
            r0.consumeContent()
            goto L_0x0103
        L_0x00fe:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.close()
        L_0x0103:
            r13 = 0
            goto L_0x0106
        L_0x0105:
            r13 = 1
        L_0x0106:
            r0 = r13
            goto L_0x010e
        L_0x0108:
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            r0.setAuthScope(r11)
        L_0x010d:
            r0 = 1
        L_0x010e:
            r1 = r15
            goto L_0x0010
        L_0x0111:
            org.apache.http.HttpException r0 = new org.apache.http.HttpException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected response to CONNECT request: "
            r1.append(r2)
            org.apache.http.StatusLine r2 = r15.getStatusLine()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x012c:
            org.apache.http.StatusLine r0 = r1.getStatusLine()
            int r0 = r0.getStatusCode()
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 <= r2) goto L_0x0166
            org.apache.http.HttpEntity r0 = r1.getEntity()
            if (r0 == 0) goto L_0x0146
            org.apache.http.entity.BufferedHttpEntity r2 = new org.apache.http.entity.BufferedHttpEntity
            r2.<init>(r0)
            r1.setEntity(r2)
        L_0x0146:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.close()
            org.apache.http.impl.client.TunnelRefusedException r0 = new org.apache.http.impl.client.TunnelRefusedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CONNECT refused by proxy: "
            r2.append(r3)
            org.apache.http.StatusLine r3 = r1.getStatusLine()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x0166:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.markReusable()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.createTunnelToTarget(org.apache.http.conn.routing.HttpRoute, org.apache.http.protocol.HttpContext):boolean");
    }

    /* access modifiers changed from: protected */
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        if (httpHost != null) {
            return this.routePlanner.determineRoute(httpHost, httpRequest, httpContext);
        }
        throw new IllegalStateException("Target host must not be null, or set in parameters.");
    }

    /* access modifiers changed from: protected */
    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        int nextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            nextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    throw new IllegalStateException("Unable to establish route.\nplanned = " + httpRoute + "\ncurrent = " + route);
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(httpRoute, httpContext);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(createTunnelToTarget, this.params);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpContext);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy, this.params);
                    continue;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ab, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e0, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e8, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02eb, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02aa A[Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa, InterruptedException -> 0x008a, HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }, ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b0 A[Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa, InterruptedException -> 0x008a, HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }, ExcHandler: HttpException (r0v0 'e' org.apache.http.HttpException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:2:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r22, org.apache.http.HttpRequest r23, org.apache.http.protocol.HttpContext r24) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            r3 = r24
            java.lang.String r4 = "http.user-token"
            org.apache.http.impl.client.RequestWrapper r5 = r1.wrapRequest(r2)
            org.apache.http.params.HttpParams r6 = r1.params
            r5.setParams(r6)
            r6 = r22
            org.apache.http.conn.routing.HttpRoute r6 = r1.determineRoute(r6, r5, r3)
            org.apache.http.params.HttpParams r7 = r23.getParams()
            java.lang.String r8 = "http.virtual-host"
            java.lang.Object r7 = r7.getParameter(r8)
            org.apache.http.HttpHost r7 = (org.apache.http.HttpHost) r7
            r1.virtualHost = r7
            org.apache.http.impl.client.RoutedRequest r7 = new org.apache.http.impl.client.RoutedRequest
            r7.<init>(r5, r6)
            org.apache.http.params.HttpParams r5 = r1.params
            long r5 = org.apache.http.conn.params.ConnManagerParams.getTimeout(r5)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0034:
            if (r10 != 0) goto L_0x02b3
            org.apache.http.impl.client.RequestWrapper r12 = r7.getRequest()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.routing.HttpRoute r14 = r7.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.Object r15 = r3.getAttribute(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 != 0) goto L_0x0095
            org.apache.http.conn.ClientConnectionManager r8 = r1.connManager     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ClientConnectionRequest r8 = r8.requestConnection(r14, r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r9 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r9 == 0) goto L_0x0056
            r9 = r2
            org.apache.http.client.methods.AbortableHttpRequest r9 = (org.apache.http.client.methods.AbortableHttpRequest) r9     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r9.setConnectionRequest(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0056:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x008a }
            org.apache.http.conn.ManagedClientConnection r8 = r8.getConnection(r5, r9)     // Catch:{ InterruptedException -> 0x008a }
            r1.managedConn = r8     // Catch:{ InterruptedException -> 0x008a }
            org.apache.http.params.HttpParams r8 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r8 = org.apache.http.params.HttpConnectionParams.isStaleCheckingEnabled(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 == 0) goto L_0x0095
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r8 = r8.isOpen()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 == 0) goto L_0x0095
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r9 = "Stale connection check"
            r8.debug(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r8 = r8.isStale()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 == 0) goto L_0x0095
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r9 = "Stale connection detected"
            r8.debug(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x0095
        L_0x008a:
            r0 = move-exception
            r2 = r0
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.<init>()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.initCause(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r3     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0095:
            boolean r8 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 == 0) goto L_0x00a1
            r8 = r2
            org.apache.http.client.methods.AbortableHttpRequest r8 = (org.apache.http.client.methods.AbortableHttpRequest) r8     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r9 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8.setReleaseTrigger(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00a1:
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r8 = r8.isOpen()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 != 0) goto L_0x00b1
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r9 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8.open(r14, r3, r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x00bc
        L_0x00b1:
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r9 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            int r9 = org.apache.http.params.HttpConnectionParams.getSoTimeout(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8.setSocketTimeout(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00bc:
            r1.establishRoute(r14, r3)     // Catch:{ TunnelRefusedException -> 0x0292 }
            r12.resetHeaders()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r1.rewriteRequestURI(r12, r14)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.HttpHost r8 = r1.virtualHost     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r8 != 0) goto L_0x00cd
            org.apache.http.HttpHost r8 = r14.getTargetHost()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00cd:
            org.apache.http.HttpHost r9 = r14.getProxyHost()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r2 = "http.target_host"
            r3.setAttribute(r2, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r2 = "http.proxy_host"
            r3.setAttribute(r2, r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r2 = "http.connection"
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r2, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r2 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r8 = r1.targetAuthState     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r2, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r2 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r8 = r1.proxyAuthState     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r2, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpProcessor r8 = r1.httpProcessor     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.preProcess(r12, r8, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8 = 0
            r9 = 1
            r16 = 0
        L_0x00fb:
            if (r9 == 0) goto L_0x01ed
            int r13 = r13 + 1
            r12.incrementExecCount()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            int r2 = r12.getExecCount()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r17 = r5
            r5 = 1
            if (r2 <= r5) goto L_0x012c
            boolean r2 = r12.isRepeatable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x012c
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r3 = "Cannot retry non-repeatable request"
            r2.debug(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2 = r16
            if (r2 == 0) goto L_0x0124
            org.apache.http.client.NonRepeatableRequestException r3 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = "Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed."
            r3.<init>(r4, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r3     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0124:
            org.apache.http.client.NonRepeatableRequestException r2 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r3 = "Cannot retry request with a non-repeatable request entity."
            r2.<init>(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r2     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x012c:
            r2 = r16
            org.apache.commons.logging.Log r6 = r1.log     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            if (r6 == 0) goto L_0x0154
            org.apache.commons.logging.Log r6 = r1.log     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r5.<init>()     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r16 = r2
            java.lang.String r2 = "Attempt "
            r5.append(r2)     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r5.append(r13)     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            java.lang.String r2 = " to execute request"
            r5.append(r2)     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r6.debug(r2)     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            goto L_0x0156
        L_0x0154:
            r16 = r2
        L_0x0156:
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            org.apache.http.HttpResponse r8 = r2.execute(r12, r5, r3)     // Catch:{ IOException -> 0x0162, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r5 = r17
            r9 = 0
            goto L_0x00fb
        L_0x0162:
            r0 = move-exception
            r2 = r0
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = "Closing the connection."
            r5.debug(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.client.HttpRequestRetryHandler r5 = r1.retryHandler     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r5 = r5.retryRequest(r2, r13, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 == 0) goto L_0x01ec
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r5 = r5.isInfoEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 == 0) goto L_0x01ad
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r6.<init>()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r16 = r9
            java.lang.String r9 = "I/O exception ("
            r6.append(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.Class r9 = r2.getClass()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r9 = r9.getName()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r6.append(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r9 = ") caught when processing request: "
            r6.append(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r9 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r6.append(r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.info(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x01af
        L_0x01ad:
            r16 = r9
        L_0x01af:
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 == 0) goto L_0x01c0
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.debug(r6, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x01c0:
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = "Retrying request"
            r5.info(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r5 = r14.isTunnelled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 != 0) goto L_0x01de
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = "Reopening the direct connection."
            r5.debug(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r6 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.open(r14, r3, r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r9 = r16
            goto L_0x01e6
        L_0x01de:
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r6 = "Proxied connection. Need to start over."
            r5.debug(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r9 = 0
        L_0x01e6:
            r16 = r2
            r5 = r17
            goto L_0x00fb
        L_0x01ec:
            throw r2     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x01ed:
            r17 = r5
            if (r8 != 0) goto L_0x01f8
        L_0x01f1:
            r2 = r23
            r12 = r8
            r5 = r17
            goto L_0x0034
        L_0x01f8:
            org.apache.http.params.HttpParams r2 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8.setParams(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpProcessor r5 = r1.httpProcessor     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.postProcess(r8, r5, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.ConnectionReuseStrategy r2 = r1.reuseStrategy     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r11 = r2.keepAlive(r8, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r11 == 0) goto L_0x024a
            org.apache.http.conn.ConnectionKeepAliveStrategy r2 = r1.keepAliveStrategy     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            long r5 = r2.getKeepAliveDuration(r8, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.setIdleDuration(r5, r9)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r2 = r2.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x024a
            r19 = 0
            int r2 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r2 < 0) goto L_0x0243
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r9.<init>()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r12 = "Connection can be kept alive for "
            r9.append(r12)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r9.append(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = " ms"
            r9.append(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = r9.toString()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.debug(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x024a
        L_0x0243:
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = "Connection can be kept alive indefinitely"
            r2.debug(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x024a:
            org.apache.http.impl.client.RoutedRequest r2 = r1.handleResponse(r7, r8, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x0252
            r10 = 1
            goto L_0x027a
        L_0x0252:
            if (r11 == 0) goto L_0x0263
            org.apache.http.HttpEntity r5 = r8.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 == 0) goto L_0x025d
            r5.consumeContent()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x025d:
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.markReusable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x0268
        L_0x0263:
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0268:
            org.apache.http.conn.routing.HttpRoute r5 = r2.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.routing.HttpRoute r6 = r7.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r5 = r5.equals(r6)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r5 != 0) goto L_0x0279
            r21.releaseConnection()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0279:
            r7 = r2
        L_0x027a:
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x01f1
            if (r15 != 0) goto L_0x01f1
            org.apache.http.client.UserTokenHandler r2 = r1.userTokenHandler     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.Object r2 = r2.getUserToken(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r4, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x01f1
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.setState(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x01f1
        L_0x0292:
            r0 = move-exception
            r2 = r0
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r3 = r3.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r3 == 0) goto L_0x02a5
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.debug(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02a5:
            org.apache.http.HttpResponse r12 = r2.getResponse()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x02b3
        L_0x02aa:
            r0 = move-exception
            r2 = r0
            goto L_0x02e0
        L_0x02ad:
            r0 = move-exception
            r2 = r0
            goto L_0x02e4
        L_0x02b0:
            r0 = move-exception
            r2 = r0
            goto L_0x02e8
        L_0x02b3:
            if (r12 == 0) goto L_0x02d5
            org.apache.http.HttpEntity r2 = r12.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x02d5
            org.apache.http.HttpEntity r2 = r12.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r2 = r2.isStreaming()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x02c6
            goto L_0x02d5
        L_0x02c6:
            org.apache.http.HttpEntity r2 = r12.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.BasicManagedEntity r3 = new org.apache.http.conn.BasicManagedEntity     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.<init>(r2, r4, r11)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r12.setEntity(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x02df
        L_0x02d5:
            if (r11 == 0) goto L_0x02dc
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.markReusable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02dc:
            r21.releaseConnection()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02df:
            return r12
        L_0x02e0:
            r21.abortConnection()
            throw r2
        L_0x02e4:
            r21.abortConnection()
            throw r2
        L_0x02e8:
            r21.abortConnection()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    /* access modifiers changed from: protected */
    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRoute route = routedRequest.getRoute();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params2 = request.getParams();
        if (!HttpClientParams.isRedirecting(params2) || !this.redirectHandler.isRedirectRequested(httpResponse, httpContext)) {
            CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(ClientContext.CREDS_PROVIDER);
            if (credentialsProvider != null && HttpClientParams.isAuthenticating(params2)) {
                if (this.targetAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    HttpHost httpHost = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
                    if (httpHost == null) {
                        httpHost = route.getTargetHost();
                    }
                    this.log.debug("Target requested authentication");
                    try {
                        processChallenges(this.targetAuthHandler.getChallenges(httpResponse, httpContext), this.targetAuthState, this.targetAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log2 = this.log;
                            log2.warn("Authentication error: " + e.getMessage());
                            return null;
                        }
                    }
                    updateAuthState(this.targetAuthState, httpHost, credentialsProvider);
                    if (this.targetAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.targetAuthState.setAuthScope((AuthScope) null);
                if (this.proxyAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    HttpHost proxyHost = route.getProxyHost();
                    this.log.debug("Proxy requested authentication");
                    try {
                        processChallenges(this.proxyAuthHandler.getChallenges(httpResponse, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e2) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn("Authentication error: " + e2.getMessage());
                            return null;
                        }
                    }
                    updateAuthState(this.proxyAuthState, proxyHost, credentialsProvider);
                    if (this.proxyAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.proxyAuthState.setAuthScope((AuthScope) null);
            }
            return null;
        }
        int i = this.redirectCount;
        if (i < this.maxRedirects) {
            this.redirectCount = i + 1;
            this.virtualHost = null;
            URI locationURI = this.redirectHandler.getLocationURI(httpResponse, httpContext);
            HttpHost httpHost2 = new HttpHost(locationURI.getHost(), locationURI.getPort(), locationURI.getScheme());
            this.targetAuthState.setAuthScope((AuthScope) null);
            this.proxyAuthState.setAuthScope((AuthScope) null);
            if (!route.getTargetHost().equals(httpHost2)) {
                this.targetAuthState.invalidate();
                AuthScheme authScheme = this.proxyAuthState.getAuthScheme();
                if (authScheme != null && authScheme.isConnectionBased()) {
                    this.proxyAuthState.invalidate();
                }
            }
            HttpRedirect httpRedirect = new HttpRedirect(request.getMethod(), locationURI);
            httpRedirect.setHeaders(request.getOriginal().getAllHeaders());
            RequestWrapper requestWrapper = new RequestWrapper(httpRedirect);
            requestWrapper.setParams(params2);
            HttpRoute determineRoute = determineRoute(httpHost2, requestWrapper, httpContext);
            RoutedRequest routedRequest2 = new RoutedRequest(requestWrapper, determineRoute);
            if (this.log.isDebugEnabled()) {
                Log log4 = this.log;
                log4.debug("Redirecting to '" + locationURI + "' via " + determineRoute);
            }
            return routedRequest2;
        }
        throw new RedirectException("Maximum redirects (" + this.maxRedirects + ") exceeded");
    }

    /* access modifiers changed from: protected */
    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException e) {
            this.log.debug("IOException releasing connection", e);
        }
        this.managedConn = null;
    }

    /* access modifiers changed from: protected */
    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri.isAbsolute()) {
                    requestWrapper.setURI(URIUtils.rewriteURI(uri, (HttpHost) null));
                }
            } else if (!uri.isAbsolute()) {
                requestWrapper.setURI(URIUtils.rewriteURI(uri, httpRoute.getTargetHost()));
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e);
        }
    }

    public DefaultRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        this(LogFactory.getLog(DefaultRequestDirector.class), httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor2, httpRequestRetryHandler, redirectHandler2, authenticationHandler, authenticationHandler2, userTokenHandler2, httpParams);
    }
}
