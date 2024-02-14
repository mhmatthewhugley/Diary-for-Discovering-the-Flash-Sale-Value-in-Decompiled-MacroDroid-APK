package twitter4j.media;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import twitter4j.HttpClient;
import twitter4j.HttpClientFactory;
import twitter4j.HttpParameter;
import twitter4j.HttpRequest;
import twitter4j.HttpResponse;
import twitter4j.HttpResponseListener;
import twitter4j.Logger;
import twitter4j.RequestMethod;
import twitter4j.TwitterException;
import twitter4j.auth.Authorization;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

abstract class AbstractImageUploadImpl implements ImageUpload {
    static final String TWITTER_VERIFY_CREDENTIALS_JSON_V1_1 = "https://api.twitter.com/1.1/account/verify_credentials.json";
    private static final Logger logger = Logger.getLogger(AbstractImageUploadImpl.class);
    protected String apiKey;
    private HttpParameter[] appendParameter;
    private HttpClient client;
    private Configuration conf;
    final Map<String, String> headers;
    HttpResponse httpResponse;
    HttpParameter image;
    HttpParameter message;
    OAuthAuthorization oauth;
    HttpParameter[] postParameter;
    String uploadUrl;

    AbstractImageUploadImpl(Configuration configuration, OAuthAuthorization oAuthAuthorization) {
        this.conf = null;
        this.apiKey = null;
        this.oauth = null;
        this.uploadUrl = null;
        this.postParameter = null;
        this.appendParameter = null;
        this.image = null;
        this.message = null;
        this.headers = new HashMap();
        this.httpResponse = null;
        this.oauth = oAuthAuthorization;
        this.conf = configuration;
        this.client = HttpClientFactory.getInstance(configuration.getHttpClientConfiguration());
    }

    /* access modifiers changed from: package-private */
    public HttpParameter[] appendHttpParameters(HttpParameter[] httpParameterArr, HttpParameter[] httpParameterArr2) {
        int length = httpParameterArr.length;
        int length2 = httpParameterArr2.length;
        HttpParameter[] httpParameterArr3 = new HttpParameter[(length + length2)];
        System.arraycopy(httpParameterArr, 0, httpParameterArr3, 0, length);
        System.arraycopy(httpParameterArr2, 0, httpParameterArr3, length, length2);
        return httpParameterArr3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractImageUploadImpl abstractImageUploadImpl = (AbstractImageUploadImpl) obj;
        String str = this.apiKey;
        if (str == null ? abstractImageUploadImpl.apiKey != null : !str.equals(abstractImageUploadImpl.apiKey)) {
            return false;
        }
        if (!Arrays.equals(this.appendParameter, abstractImageUploadImpl.appendParameter)) {
            return false;
        }
        HttpClient httpClient = this.client;
        if (httpClient == null ? abstractImageUploadImpl.client != null : !httpClient.equals(abstractImageUploadImpl.client)) {
            return false;
        }
        Configuration configuration = this.conf;
        if (configuration == null ? abstractImageUploadImpl.conf != null : !configuration.equals(abstractImageUploadImpl.conf)) {
            return false;
        }
        Map<String, String> map = this.headers;
        if (map == null ? abstractImageUploadImpl.headers != null : !map.equals(abstractImageUploadImpl.headers)) {
            return false;
        }
        HttpResponse httpResponse2 = this.httpResponse;
        if (httpResponse2 == null ? abstractImageUploadImpl.httpResponse != null : !httpResponse2.equals(abstractImageUploadImpl.httpResponse)) {
            return false;
        }
        HttpParameter httpParameter = this.image;
        if (httpParameter == null ? abstractImageUploadImpl.image != null : !httpParameter.equals(abstractImageUploadImpl.image)) {
            return false;
        }
        HttpParameter httpParameter2 = this.message;
        if (httpParameter2 == null ? abstractImageUploadImpl.message != null : !httpParameter2.equals(abstractImageUploadImpl.message)) {
            return false;
        }
        OAuthAuthorization oAuthAuthorization = this.oauth;
        if (oAuthAuthorization == null ? abstractImageUploadImpl.oauth != null : !oAuthAuthorization.equals(abstractImageUploadImpl.oauth)) {
            return false;
        }
        if (!Arrays.equals(this.postParameter, abstractImageUploadImpl.postParameter)) {
            return false;
        }
        String str2 = this.uploadUrl;
        String str3 = abstractImageUploadImpl.uploadUrl;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    /* access modifiers changed from: package-private */
    public String generateVerifyCredentialsAuthorizationHeader() {
        List<HttpParameter> generateOAuthSignatureHttpParams = this.oauth.generateOAuthSignatureHttpParams("GET", TWITTER_VERIFY_CREDENTIALS_JSON_V1_1);
        return "OAuth realm=\"https://api.twitter.com/\"," + OAuthAuthorization.encodeParameters(generateOAuthSignatureHttpParams, ",", true);
    }

    /* access modifiers changed from: protected */
    public String generateVerifyCredentialsAuthorizationURL(String str) {
        List<HttpParameter> generateOAuthSignatureHttpParams = this.oauth.generateOAuthSignatureHttpParams("GET", str);
        return str + "?" + OAuthAuthorization.encodeParameters(generateOAuthSignatureHttpParams);
    }

    public int hashCode() {
        HttpClient httpClient = this.client;
        int i = 0;
        int hashCode = (httpClient != null ? httpClient.hashCode() : 0) * 31;
        Configuration configuration = this.conf;
        int hashCode2 = (hashCode + (configuration != null ? configuration.hashCode() : 0)) * 31;
        String str = this.apiKey;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        OAuthAuthorization oAuthAuthorization = this.oauth;
        int hashCode4 = (hashCode3 + (oAuthAuthorization != null ? oAuthAuthorization.hashCode() : 0)) * 31;
        String str2 = this.uploadUrl;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        HttpParameter[] httpParameterArr = this.postParameter;
        int hashCode6 = (hashCode5 + (httpParameterArr != null ? Arrays.hashCode(httpParameterArr) : 0)) * 31;
        HttpParameter[] httpParameterArr2 = this.appendParameter;
        int hashCode7 = (hashCode6 + (httpParameterArr2 != null ? Arrays.hashCode(httpParameterArr2) : 0)) * 31;
        HttpParameter httpParameter = this.image;
        int hashCode8 = (hashCode7 + (httpParameter != null ? httpParameter.hashCode() : 0)) * 31;
        HttpParameter httpParameter2 = this.message;
        int hashCode9 = (hashCode8 + (httpParameter2 != null ? httpParameter2.hashCode() : 0)) * 31;
        Map<String, String> map = this.headers;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        HttpResponse httpResponse2 = this.httpResponse;
        if (httpResponse2 != null) {
            i = httpResponse2.hashCode();
        }
        return hashCode10 + i;
    }

    /* access modifiers changed from: protected */
    public abstract String postUpload() throws TwitterException;

    /* access modifiers changed from: protected */
    public abstract void preUpload() throws TwitterException;

    public String toString() {
        List list;
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractImageUploadImpl{client=");
        sb.append(this.client);
        sb.append(", conf=");
        sb.append(this.conf);
        sb.append(", apiKey='");
        sb.append(this.apiKey);
        sb.append('\'');
        sb.append(", oauth=");
        sb.append(this.oauth);
        sb.append(", uploadUrl='");
        sb.append(this.uploadUrl);
        sb.append('\'');
        sb.append(", postParameter=");
        HttpParameter[] httpParameterArr = this.postParameter;
        List list2 = null;
        if (httpParameterArr == null) {
            list = null;
        } else {
            list = Arrays.asList(httpParameterArr);
        }
        sb.append(list);
        sb.append(", appendParameter=");
        HttpParameter[] httpParameterArr2 = this.appendParameter;
        if (httpParameterArr2 != null) {
            list2 = Arrays.asList(httpParameterArr2);
        }
        sb.append(list2);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", httpResponse=");
        sb.append(this.httpResponse);
        sb.append('}');
        return sb.toString();
    }

    public String upload(String str, InputStream inputStream) throws TwitterException {
        this.image = new HttpParameter("media", str, inputStream);
        return upload();
    }

    public String upload(String str, InputStream inputStream, String str2) throws TwitterException {
        this.image = new HttpParameter("media", str, inputStream);
        this.message = new HttpParameter("message", str2);
        return upload();
    }

    public String upload(File file, String str) throws TwitterException {
        this.image = new HttpParameter("media", file);
        this.message = new HttpParameter("message", str);
        return upload();
    }

    public String upload(File file) throws TwitterException {
        this.image = new HttpParameter("media", file);
        return upload();
    }

    private String upload() throws TwitterException {
        if (this.conf.getMediaProviderParameters() != null) {
            Set<String> keySet = this.conf.getMediaProviderParameters().keySet();
            HttpParameter[] httpParameterArr = new HttpParameter[keySet.size()];
            int i = 0;
            for (String str : keySet) {
                httpParameterArr[i] = new HttpParameter(str, this.conf.getMediaProviderParameters().getProperty(str));
                i++;
            }
            this.appendParameter = httpParameterArr;
        }
        preUpload();
        if (this.postParameter == null) {
            throw new AssertionError("Incomplete implementation. postParameter is not set.");
        } else if (this.uploadUrl != null) {
            if (this.conf.getMediaProviderParameters() != null) {
                HttpParameter[] httpParameterArr2 = this.appendParameter;
                if (httpParameterArr2.length > 0) {
                    this.postParameter = appendHttpParameters(this.postParameter, httpParameterArr2);
                }
            }
            new HashMap(this.client.getRequestHeaders()).putAll(this.headers);
            this.httpResponse = this.client.request(new HttpRequest(RequestMethod.POST, this.uploadUrl, this.postParameter, (Authorization) null, this.headers), (HttpResponseListener) null);
            String postUpload = postUpload();
            Logger logger2 = logger;
            logger2.debug("uploaded url [" + postUpload + "]");
            return postUpload;
        } else {
            throw new AssertionError("Incomplete implementation. uploadUrl is not set.");
        }
    }

    AbstractImageUploadImpl(Configuration configuration, String str, OAuthAuthorization oAuthAuthorization) {
        this(configuration, oAuthAuthorization);
        this.apiKey = str;
    }
}
