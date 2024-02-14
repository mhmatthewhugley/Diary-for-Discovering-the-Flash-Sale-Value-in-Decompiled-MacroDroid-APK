package com.google.api.client.http.apache;

import androidx.webkit.ProxyConfig;
import com.google.api.client.http.HttpTransport;
import java.net.ProxySelector;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class ApacheHttpTransport extends HttpTransport {

    /* renamed from: c */
    private final HttpClient f52510c;

    public static final class Builder {

        /* renamed from: a */
        private SSLSocketFactory f52511a = SSLSocketFactory.getSocketFactory();

        /* renamed from: b */
        private HttpParams f52512b = ApacheHttpTransport.m72204i();

        /* renamed from: c */
        private ProxySelector f52513c = ProxySelector.getDefault();
    }

    public ApacheHttpTransport() {
        this(m72202g());
    }

    /* renamed from: g */
    public static DefaultHttpClient m72202g() {
        return m72203h(SSLSocketFactory.getSocketFactory(), m72204i(), ProxySelector.getDefault());
    }

    /* renamed from: h */
    static DefaultHttpClient m72203h(SSLSocketFactory sSLSocketFactory, HttpParams httpParams, ProxySelector proxySelector) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(ProxyConfig.MATCH_HTTPS, sSLSocketFactory, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        return defaultHttpClient;
    }

    /* renamed from: i */
    static HttpParams m72204i() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        return basicHttpParams;
    }

    /* renamed from: e */
    public boolean mo60469e(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public ApacheHttpRequest mo60266b(String str, String str2) {
        HttpRequestBase httpRequestBase;
        if (str.equals(HttpDelete.METHOD_NAME)) {
            httpRequestBase = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            httpRequestBase = new HttpGet(str2);
        } else if (str.equals(HttpHead.METHOD_NAME)) {
            httpRequestBase = new HttpHead(str2);
        } else if (str.equals("POST")) {
            httpRequestBase = new HttpPost(str2);
        } else if (str.equals(HttpPut.METHOD_NAME)) {
            httpRequestBase = new HttpPut(str2);
        } else if (str.equals(HttpTrace.METHOD_NAME)) {
            httpRequestBase = new HttpTrace(str2);
        } else if (str.equals(HttpOptions.METHOD_NAME)) {
            httpRequestBase = new HttpOptions(str2);
        } else {
            httpRequestBase = new HttpExtensionMethod(str, str2);
        }
        return new ApacheHttpRequest(this.f52510c, httpRequestBase);
    }

    public ApacheHttpTransport(HttpClient httpClient) {
        this.f52510c = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
    }
}
