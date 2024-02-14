package twitter4j;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import twitter4j.auth.Authorization;

public abstract class HttpClientBase implements HttpClient, Serializable {
    private static final Logger logger = Logger.getLogger(HttpClientBase.class);
    private static final long serialVersionUID = -8016974810651763053L;
    protected final HttpClientConfiguration CONF;
    private final Map<String, String> requestHeaders;

    public HttpClientBase(HttpClientConfiguration httpClientConfiguration) {
        this.CONF = httpClientConfiguration;
        HashMap hashMap = new HashMap();
        this.requestHeaders = hashMap;
        hashMap.put("X-Twitter-Client-Version", Version.getVersion());
        hashMap.put("X-Twitter-Client-URL", "http://twitter4j.org/en/twitter4j-" + Version.getVersion() + ".xml");
        hashMap.put("X-Twitter-Client", "Twitter4J");
        hashMap.put(HTTP.USER_AGENT, "twitter4j http://twitter4j.org/ /" + Version.getVersion());
        if (httpClientConfiguration.isGZIPEnabled()) {
            hashMap.put("Accept-Encoding", "gzip");
        }
    }

    public void addDefaultRequestHeader(String str, String str2) {
        this.requestHeaders.put(str, str2);
    }

    public HttpResponse delete(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener) throws TwitterException {
        return request(new HttpRequest(RequestMethod.DELETE, str, httpParameterArr, authorization, this.requestHeaders), httpResponseListener);
    }

    public HttpResponse get(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener) throws TwitterException {
        return request(new HttpRequest(RequestMethod.GET, str, httpParameterArr, authorization, this.requestHeaders), httpResponseListener);
    }

    public Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    /* access modifiers changed from: package-private */
    public abstract HttpResponse handleRequest(HttpRequest httpRequest) throws TwitterException;

    public HttpResponse head(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.HEAD, str, (HttpParameter[]) null, (Authorization) null, this.requestHeaders));
    }

    /* access modifiers changed from: protected */
    public boolean isProxyConfigured() {
        return this.CONF.getHttpProxyHost() != null && !this.CONF.getHttpProxyHost().equals("");
    }

    public HttpResponse post(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener) throws TwitterException {
        return request(new HttpRequest(RequestMethod.POST, str, httpParameterArr, authorization, this.requestHeaders), httpResponseListener);
    }

    public HttpResponse put(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener) throws TwitterException {
        return request(new HttpRequest(RequestMethod.PUT, str, httpParameterArr, authorization, this.requestHeaders), httpResponseListener);
    }

    public final HttpResponse request(HttpRequest httpRequest) throws TwitterException {
        return handleRequest(httpRequest);
    }

    public void write(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        logger.debug(str);
    }

    public HttpResponse delete(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.DELETE, str, (HttpParameter[]) null, (Authorization) null, this.requestHeaders));
    }

    public HttpResponse get(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.GET, str, (HttpParameter[]) null, (Authorization) null, this.requestHeaders));
    }

    public HttpResponse post(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.POST, str, (HttpParameter[]) null, (Authorization) null, this.requestHeaders));
    }

    public HttpResponse put(String str) throws TwitterException {
        return request(new HttpRequest(RequestMethod.PUT, str, (HttpParameter[]) null, (Authorization) null, this.requestHeaders));
    }

    public final HttpResponse request(HttpRequest httpRequest, HttpResponseListener httpResponseListener) throws TwitterException {
        try {
            HttpResponse handleRequest = handleRequest(httpRequest);
            if (httpResponseListener != null) {
                httpResponseListener.httpResponseReceived(new HttpResponseEvent(httpRequest, handleRequest, (TwitterException) null));
            }
            return handleRequest;
        } catch (TwitterException e) {
            if (httpResponseListener != null) {
                httpResponseListener.httpResponseReceived(new HttpResponseEvent(httpRequest, (HttpResponse) null, e));
            }
            throw e;
        }
    }
}
