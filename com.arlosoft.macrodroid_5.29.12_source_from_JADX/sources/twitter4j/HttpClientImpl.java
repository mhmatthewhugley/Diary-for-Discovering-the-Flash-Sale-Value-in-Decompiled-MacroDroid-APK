package twitter4j;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.auth.AUTH;
import twitter4j.auth.Authorization;
import twitter4j.conf.ConfigurationContext;

class HttpClientImpl extends HttpClientBase implements HttpResponseCode {
    private static final Map<HttpClientConfiguration, HttpClient> instanceMap = new HashMap(1);
    private static final Logger logger = Logger.getLogger(HttpClientImpl.class);
    private static final long serialVersionUID = -403500272719330534L;

    static {
        try {
            if (Integer.parseInt((String) Class.forName("android.os.Build$VERSION").getField("SDK").get((Object) null)) < 8) {
                System.setProperty("http.keepAlive", "false");
            }
        } catch (Exception unused) {
        }
    }

    public HttpClientImpl() {
        super(ConfigurationContext.getInstance().getHttpClientConfiguration());
    }

    public static HttpClient getInstance(HttpClientConfiguration httpClientConfiguration) {
        Map<HttpClientConfiguration, HttpClient> map = instanceMap;
        HttpClient httpClient = map.get(httpClientConfiguration);
        if (httpClient != null) {
            return httpClient;
        }
        HttpClientImpl httpClientImpl = new HttpClientImpl(httpClientConfiguration);
        map.put(httpClientConfiguration, httpClientImpl);
        return httpClientImpl;
    }

    private void setHeaders(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        String authorizationHeader;
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Request: ");
            logger2.debug(httpRequest.getMethod().name() + " ", httpRequest.getURL());
        }
        if (!(httpRequest.getAuthorization() == null || (authorizationHeader = httpRequest.getAuthorization().getAuthorizationHeader(httpRequest)) == null)) {
            if (logger2.isDebugEnabled()) {
                logger2.debug("Authorization: ", authorizationHeader.replaceAll(".", ProxyConfig.MATCH_ALL_SCHEMES));
            }
            httpURLConnection.addRequestProperty(AUTH.WWW_AUTH_RESP, authorizationHeader);
        }
        if (httpRequest.getRequestHeaders() != null) {
            for (String next : httpRequest.getRequestHeaders().keySet()) {
                httpURLConnection.addRequestProperty(next, httpRequest.getRequestHeaders().get(next));
                Logger logger3 = logger;
                logger3.debug(next + ": " + httpRequest.getRequestHeaders().get(next));
            }
        }
    }

    public HttpResponse get(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.GET, str, (HttpParameter[]) null, (Authorization) null, (Map<String, String>) null));
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection getConnection(String str) throws IOException {
        HttpURLConnection httpURLConnection;
        if (isProxyConfigured()) {
            if (this.CONF.getHttpProxyUser() != null && !this.CONF.getHttpProxyUser().equals("")) {
                Logger logger2 = logger;
                if (logger2.isDebugEnabled()) {
                    logger2.debug("Proxy AuthUser: " + this.CONF.getHttpProxyUser());
                    logger2.debug("Proxy AuthPassword: " + this.CONF.getHttpProxyPassword().replaceAll(".", ProxyConfig.MATCH_ALL_SCHEMES));
                }
                Authenticator.setDefault(new Authenticator() {
                    /* access modifiers changed from: protected */
                    public PasswordAuthentication getPasswordAuthentication() {
                        if (getRequestorType().equals(Authenticator.RequestorType.PROXY)) {
                            return new PasswordAuthentication(HttpClientImpl.this.CONF.getHttpProxyUser(), HttpClientImpl.this.CONF.getHttpProxyPassword().toCharArray());
                        }
                        return null;
                    }
                });
            }
            Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(this.CONF.getHttpProxyHost(), this.CONF.getHttpProxyPort()));
            Logger logger3 = logger;
            if (logger3.isDebugEnabled()) {
                logger3.debug("Opening proxied connection(" + this.CONF.getHttpProxyHost() + ":" + this.CONF.getHttpProxyPort() + ")");
            }
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        }
        if (this.CONF.getHttpConnectionTimeout() > 0) {
            httpURLConnection.setConnectTimeout(this.CONF.getHttpConnectionTimeout());
        }
        if (this.CONF.getHttpReadTimeout() > 0) {
            httpURLConnection.setReadTimeout(this.CONF.getHttpReadTimeout());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.io.OutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:28|29|113|119|120|121|122) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:103|104|127|128|(1:131)|132|140|133) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ba, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c1, code lost:
        if (r6 != r1.CONF.getHttpRetryCount()) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c3, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030e, code lost:
        throw new twitter4j.TwitterException(r2.getMessage(), r2, r8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02c5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public twitter4j.HttpResponse handleRequest(twitter4j.HttpRequest r20) throws twitter4j.TwitterException {
        /*
            r19 = this;
            r1 = r19
            twitter4j.HttpClientConfiguration r0 = r1.CONF
            int r0 = r0.getHttpRetryCount()
            r2 = 1
            int r3 = r0 + 1
            r6 = 0
            r7 = 0
        L_0x000d:
            if (r6 >= r3) goto L_0x030f
            java.lang.String r0 = r20.getURL()     // Catch:{ all -> 0x02aa }
            java.net.HttpURLConnection r0 = r1.getConnection(r0)     // Catch:{ all -> 0x02aa }
            r0.setDoInput(r2)     // Catch:{ all -> 0x02aa }
            r9 = r20
            r1.setHeaders(r9, r0)     // Catch:{ all -> 0x02a8 }
            twitter4j.RequestMethod r10 = r20.getMethod()     // Catch:{ all -> 0x02a8 }
            java.lang.String r10 = r10.name()     // Catch:{ all -> 0x02a8 }
            r0.setRequestMethod(r10)     // Catch:{ all -> 0x02a8 }
            twitter4j.RequestMethod r10 = r20.getMethod()     // Catch:{ all -> 0x02a8 }
            twitter4j.RequestMethod r11 = twitter4j.RequestMethod.POST     // Catch:{ all -> 0x02a8 }
            if (r10 != r11) goto L_0x01f9
            twitter4j.HttpParameter[] r10 = r20.getParameters()     // Catch:{ all -> 0x02a8 }
            boolean r10 = twitter4j.HttpParameter.containsFile((twitter4j.HttpParameter[]) r10)     // Catch:{ all -> 0x02a8 }
            java.lang.String r11 = "UTF-8"
            java.lang.String r12 = "Content-Type"
            if (r10 == 0) goto L_0x01bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r10.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r13 = "----Twitter4J-upload"
            r10.append(r13)     // Catch:{ all -> 0x01b2 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b2 }
            r10.append(r13)     // Catch:{ all -> 0x01b2 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r13.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r14 = "multipart/form-data; boundary="
            r13.append(r14)     // Catch:{ all -> 0x01b2 }
            r13.append(r10)     // Catch:{ all -> 0x01b2 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01b2 }
            r0.setRequestProperty(r12, r13)     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r12.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r13 = "--"
            r12.append(r13)     // Catch:{ all -> 0x01b2 }
            r12.append(r10)     // Catch:{ all -> 0x01b2 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x01b2 }
            r0.setDoOutput(r2)     // Catch:{ all -> 0x01b2 }
            java.io.OutputStream r12 = r0.getOutputStream()     // Catch:{ all -> 0x01b2 }
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ all -> 0x01a9 }
            r13.<init>(r12)     // Catch:{ all -> 0x01a9 }
            twitter4j.HttpParameter[] r14 = r20.getParameters()     // Catch:{ all -> 0x01a9 }
            int r15 = r14.length     // Catch:{ all -> 0x01a9 }
            r4 = 0
        L_0x008c:
            java.lang.String r2 = "\r\n"
            if (r4 >= r15) goto L_0x0189
            r16 = r14[r4]     // Catch:{ all -> 0x01a9 }
            boolean r17 = r16.isFile()     // Catch:{ all -> 0x01a9 }
            java.lang.String r5 = "\"\r\n"
            java.lang.String r8 = "Content-Disposition: form-data; name=\""
            if (r17 == 0) goto L_0x0135
            r17 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>()     // Catch:{ all -> 0x0132 }
            r3.append(r10)     // Catch:{ all -> 0x0132 }
            r3.append(r2)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            r1.write(r13, r3)     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>()     // Catch:{ all -> 0x0132 }
            r3.append(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = r16.getName()     // Catch:{ all -> 0x0132 }
            r3.append(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = "\"; filename=\""
            r3.append(r8)     // Catch:{ all -> 0x0132 }
            java.io.File r8 = r16.getFile()     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0132 }
            r3.append(r8)     // Catch:{ all -> 0x0132 }
            r3.append(r5)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            r1.write(r13, r3)     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.String r5 = "Content-Type: "
            r3.append(r5)     // Catch:{ all -> 0x0132 }
            java.lang.String r5 = r16.getContentType()     // Catch:{ all -> 0x0132 }
            r3.append(r5)     // Catch:{ all -> 0x0132 }
            java.lang.String r5 = "\r\n\r\n"
            r3.append(r5)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            r1.write(r13, r3)     // Catch:{ all -> 0x0132 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0132 }
            boolean r5 = r16.hasFileBody()     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x010a
            java.io.InputStream r5 = r16.getFileBody()     // Catch:{ all -> 0x0103 }
            goto L_0x0113
        L_0x0103:
            r0 = move-exception
            r18 = r7
            r3 = 1
            r7 = 0
            goto L_0x02a6
        L_0x010a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0132 }
            java.io.File r8 = r16.getFile()     // Catch:{ all -> 0x0132 }
            r5.<init>(r8)     // Catch:{ all -> 0x0132 }
        L_0x0113:
            r3.<init>(r5)     // Catch:{ all -> 0x0132 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0132 }
        L_0x011a:
            int r8 = r3.read(r5)     // Catch:{ all -> 0x0132 }
            r18 = r7
            r7 = -1
            if (r8 == r7) goto L_0x012a
            r7 = 0
            r13.write(r5, r7, r8)     // Catch:{ all -> 0x01a7 }
            r7 = r18
            goto L_0x011a
        L_0x012a:
            r7 = 0
            r1.write(r13, r2)     // Catch:{ all -> 0x01a7 }
            r3.close()     // Catch:{ all -> 0x01a7 }
            goto L_0x0181
        L_0x0132:
            r0 = move-exception
            goto L_0x01ac
        L_0x0135:
            r17 = r3
            r18 = r7
            r7 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            r3.append(r10)     // Catch:{ all -> 0x01a7 }
            r3.append(r2)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a7 }
            r1.write(r13, r3)     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            r3.append(r8)     // Catch:{ all -> 0x01a7 }
            java.lang.String r8 = r16.getName()     // Catch:{ all -> 0x01a7 }
            r3.append(r8)     // Catch:{ all -> 0x01a7 }
            r3.append(r5)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a7 }
            r1.write(r13, r3)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = "Content-Type: text/plain; charset=UTF-8\r\n\r\n"
            r1.write(r13, r3)     // Catch:{ all -> 0x01a7 }
            twitter4j.Logger r3 = logger     // Catch:{ all -> 0x01a7 }
            java.lang.String r5 = r16.getValue()     // Catch:{ all -> 0x01a7 }
            r3.debug(r5)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r16.getValue()     // Catch:{ all -> 0x01a7 }
            byte[] r3 = r3.getBytes(r11)     // Catch:{ all -> 0x01a7 }
            r13.write(r3)     // Catch:{ all -> 0x01a7 }
            r1.write(r13, r2)     // Catch:{ all -> 0x01a7 }
        L_0x0181:
            int r4 = r4 + 1
            r3 = r17
            r7 = r18
            goto L_0x008c
        L_0x0189:
            r17 = r3
            r18 = r7
            r7 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            r3.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "--\r\n"
            r3.append(r4)     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a7 }
            r1.write(r13, r3)     // Catch:{ all -> 0x01a7 }
            r1.write(r13, r2)     // Catch:{ all -> 0x01a7 }
            r3 = 1
            goto L_0x01ed
        L_0x01a7:
            r0 = move-exception
            goto L_0x01af
        L_0x01a9:
            r0 = move-exception
            r17 = r3
        L_0x01ac:
            r18 = r7
            r7 = 0
        L_0x01af:
            r3 = 1
            goto L_0x02a6
        L_0x01b2:
            r0 = move-exception
            r17 = r3
            r18 = r7
            r7 = 0
        L_0x01b8:
            r3 = 1
            goto L_0x02b3
        L_0x01bb:
            r17 = r3
            r18 = r7
            r7 = 0
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.setRequestProperty(r12, r2)     // Catch:{ all -> 0x01f7 }
            twitter4j.HttpParameter[] r2 = r20.getParameters()     // Catch:{ all -> 0x01f7 }
            java.lang.String r2 = twitter4j.HttpParameter.encodeParameters(r2)     // Catch:{ all -> 0x01f7 }
            twitter4j.Logger r3 = logger     // Catch:{ all -> 0x01f7 }
            java.lang.String r4 = "Post Params: "
            r3.debug(r4, r2)     // Catch:{ all -> 0x01f7 }
            byte[] r2 = r2.getBytes(r11)     // Catch:{ all -> 0x01f7 }
            java.lang.String r3 = "Content-Length"
            int r4 = r2.length     // Catch:{ all -> 0x01f7 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x01f7 }
            r0.setRequestProperty(r3, r4)     // Catch:{ all -> 0x01f7 }
            r3 = 1
            r0.setDoOutput(r3)     // Catch:{ all -> 0x01f4 }
            java.io.OutputStream r12 = r0.getOutputStream()     // Catch:{ all -> 0x01f4 }
            r12.write(r2)     // Catch:{ all -> 0x02a5 }
        L_0x01ed:
            r12.flush()     // Catch:{ all -> 0x02a5 }
            r12.close()     // Catch:{ all -> 0x02a5 }
            goto L_0x0200
        L_0x01f4:
            r0 = move-exception
            goto L_0x02b3
        L_0x01f7:
            r0 = move-exception
            goto L_0x01b8
        L_0x01f9:
            r17 = r3
            r18 = r7
            r3 = 1
            r7 = 0
            r12 = 0
        L_0x0200:
            twitter4j.HttpResponseImpl r2 = new twitter4j.HttpResponseImpl     // Catch:{ all -> 0x02a5 }
            twitter4j.HttpClientConfiguration r4 = r1.CONF     // Catch:{ all -> 0x02a5 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x02a5 }
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x02a1 }
            twitter4j.Logger r4 = logger     // Catch:{ all -> 0x029d }
            boolean r5 = r4.isDebugEnabled()     // Catch:{ all -> 0x029d }
            if (r5 == 0) goto L_0x0268
            java.lang.String r5 = "Response: "
            r4.debug(r5)     // Catch:{ all -> 0x029d }
            java.util.Map r0 = r0.getHeaderFields()     // Catch:{ all -> 0x029d }
            java.util.Set r4 = r0.keySet()     // Catch:{ all -> 0x029d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x029d }
        L_0x0224:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x029d }
            if (r5 == 0) goto L_0x0268
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x029d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x029d }
            java.lang.Object r10 = r0.get(r5)     // Catch:{ all -> 0x029d }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x029d }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x029d }
        L_0x023a:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x029d }
            if (r11 == 0) goto L_0x0224
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x029d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x029d }
            if (r5 == 0) goto L_0x0262
            twitter4j.Logger r13 = logger     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r14.<init>()     // Catch:{ all -> 0x029d }
            r14.append(r5)     // Catch:{ all -> 0x029d }
            java.lang.String r15 = ": "
            r14.append(r15)     // Catch:{ all -> 0x029d }
            r14.append(r11)     // Catch:{ all -> 0x029d }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x029d }
            r13.debug(r11)     // Catch:{ all -> 0x029d }
            goto L_0x023a
        L_0x0262:
            twitter4j.Logger r13 = logger     // Catch:{ all -> 0x029d }
            r13.debug(r11)     // Catch:{ all -> 0x029d }
            goto L_0x023a
        L_0x0268:
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 < r0) goto L_0x027b
            r0 = 302(0x12e, float:4.23E-43)
            if (r8 == r0) goto L_0x0275
            r0 = 300(0x12c, float:4.2E-43)
            if (r0 > r8) goto L_0x0275
            goto L_0x027b
        L_0x0275:
            r12.close()     // Catch:{ Exception -> 0x0278 }
        L_0x0278:
            r7 = r2
            goto L_0x0311
        L_0x027b:
            r0 = 420(0x1a4, float:5.89E-43)
            if (r8 == r0) goto L_0x0293
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x0293
            r0 = 500(0x1f4, float:7.0E-43)
            if (r8 < r0) goto L_0x0293
            twitter4j.HttpClientConfiguration r0 = r1.CONF     // Catch:{ all -> 0x029d }
            int r0 = r0.getHttpRetryCount()     // Catch:{ all -> 0x029d }
            if (r6 == r0) goto L_0x0293
            r12.close()     // Catch:{ Exception -> 0x02c5 }
            goto L_0x02c5
        L_0x0293:
            twitter4j.TwitterException r0 = new twitter4j.TwitterException     // Catch:{ all -> 0x029d }
            java.lang.String r4 = r2.asString()     // Catch:{ all -> 0x029d }
            r0.<init>((java.lang.String) r4, (twitter4j.HttpResponse) r2)     // Catch:{ all -> 0x029d }
            throw r0     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            r18 = r2
            goto L_0x02b5
        L_0x02a1:
            r0 = move-exception
            r18 = r2
            goto L_0x02a6
        L_0x02a5:
            r0 = move-exception
        L_0x02a6:
            r8 = -1
            goto L_0x02b5
        L_0x02a8:
            r0 = move-exception
            goto L_0x02ad
        L_0x02aa:
            r0 = move-exception
            r9 = r20
        L_0x02ad:
            r17 = r3
            r18 = r7
            r3 = 1
            r7 = 0
        L_0x02b3:
            r8 = -1
            r12 = 0
        L_0x02b5:
            r12.close()     // Catch:{ Exception -> 0x02b8 }
        L_0x02b8:
            throw r0     // Catch:{ IOException -> 0x02b9 }
        L_0x02b9:
            r0 = move-exception
            r2 = r0
            twitter4j.HttpClientConfiguration r0 = r1.CONF
            int r0 = r0.getHttpRetryCount()
            if (r6 == r0) goto L_0x0305
            r2 = r18
        L_0x02c5:
            twitter4j.Logger r0 = logger     // Catch:{ InterruptedException -> 0x02fd }
            boolean r4 = r0.isDebugEnabled()     // Catch:{ InterruptedException -> 0x02fd }
            if (r4 == 0) goto L_0x02d2
            if (r2 == 0) goto L_0x02d2
            r2.asString()     // Catch:{ InterruptedException -> 0x02fd }
        L_0x02d2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x02fd }
            r4.<init>()     // Catch:{ InterruptedException -> 0x02fd }
            java.lang.String r5 = "Sleeping "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x02fd }
            twitter4j.HttpClientConfiguration r5 = r1.CONF     // Catch:{ InterruptedException -> 0x02fd }
            int r5 = r5.getHttpRetryIntervalSeconds()     // Catch:{ InterruptedException -> 0x02fd }
            r4.append(r5)     // Catch:{ InterruptedException -> 0x02fd }
            java.lang.String r5 = " seconds until the next retry."
            r4.append(r5)     // Catch:{ InterruptedException -> 0x02fd }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x02fd }
            r0.debug(r4)     // Catch:{ InterruptedException -> 0x02fd }
            twitter4j.HttpClientConfiguration r0 = r1.CONF     // Catch:{ InterruptedException -> 0x02fd }
            int r0 = r0.getHttpRetryIntervalSeconds()     // Catch:{ InterruptedException -> 0x02fd }
            int r0 = r0 * 1000
            long r4 = (long) r0     // Catch:{ InterruptedException -> 0x02fd }
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x02fd }
        L_0x02fd:
            int r6 = r6 + 1
            r7 = r2
            r3 = r17
            r2 = 1
            goto L_0x000d
        L_0x0305:
            twitter4j.TwitterException r0 = new twitter4j.TwitterException
            java.lang.String r3 = r2.getMessage()
            r0.<init>(r3, r2, r8)
            throw r0
        L_0x030f:
            r18 = r7
        L_0x0311:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.HttpClientImpl.handleRequest(twitter4j.HttpRequest):twitter4j.HttpResponse");
    }

    public HttpResponse post(String str, HttpParameter[] httpParameterArr) throws TwitterException {
        return request(new HttpRequest(RequestMethod.POST, str, httpParameterArr, (Authorization) null, (Map<String, String>) null));
    }

    public HttpClientImpl(HttpClientConfiguration httpClientConfiguration) {
        super(httpClientConfiguration);
    }
}
