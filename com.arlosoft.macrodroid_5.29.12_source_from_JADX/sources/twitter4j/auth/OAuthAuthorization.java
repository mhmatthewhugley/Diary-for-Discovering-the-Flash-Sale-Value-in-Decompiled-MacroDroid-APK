package twitter4j.auth;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import twitter4j.BASE64Encoder;
import twitter4j.HttpClient;
import twitter4j.HttpClientFactory;
import twitter4j.HttpParameter;
import twitter4j.HttpRequest;
import twitter4j.HttpResponseListener;
import twitter4j.Logger;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;

public class OAuthAuthorization implements Authorization, Serializable, OAuthSupport {
    private static final String HMAC_SHA1 = "HmacSHA1";
    private static final HttpParameter OAUTH_SIGNATURE_METHOD = new HttpParameter("oauth_signature_method", "HMAC-SHA1");
    private static final Random RAND = new Random();
    private static transient HttpClient http = null;
    private static final Logger logger = Logger.getLogger(OAuthAuthorization.class);
    private static final long serialVersionUID = -886869424811858868L;
    private final Configuration conf;
    private String consumerKey = "";
    private String consumerSecret;
    private OAuthToken oauthToken = null;
    private String realm = null;

    public OAuthAuthorization(Configuration configuration) {
        this.conf = configuration;
        http = HttpClientFactory.getInstance(configuration.getHttpClientConfiguration());
        setOAuthConsumer(configuration.getOAuthConsumerKey(), configuration.getOAuthConsumerSecret());
        if (configuration.getOAuthAccessToken() != null && configuration.getOAuthAccessTokenSecret() != null) {
            setOAuthAccessToken(new AccessToken(configuration.getOAuthAccessToken(), configuration.getOAuthAccessTokenSecret()));
        }
    }

    static String constructRequestURL(String str) {
        int indexOf = str.indexOf("?");
        if (-1 != indexOf) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf("/", 8);
        String lowerCase = str.substring(0, indexOf2).toLowerCase();
        int indexOf3 = lowerCase.indexOf(":", 8);
        if (-1 != indexOf3) {
            if (lowerCase.startsWith("http://") && lowerCase.endsWith(":80")) {
                lowerCase = lowerCase.substring(0, indexOf3);
            } else if (lowerCase.startsWith("https://") && lowerCase.endsWith(":443")) {
                lowerCase = lowerCase.substring(0, indexOf3);
            }
        }
        return lowerCase + str.substring(indexOf2);
    }

    public static String encodeParameters(List<HttpParameter> list) {
        return encodeParameters(list, "&", false);
    }

    private void ensureTokenIsAvailable() {
        if (this.oauthToken == null) {
            throw new IllegalStateException("No Token available.");
        }
    }

    static String normalizeRequestParameters(HttpParameter[] httpParameterArr) {
        return normalizeRequestParameters(toParamList(httpParameterArr));
    }

    private void parseGetParameters(String str, List<HttpParameter> list) {
        int indexOf = str.indexOf("?");
        if (-1 != indexOf) {
            str.split("&");
            try {
                for (String split : str.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        list.add(new HttpParameter(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8")));
                    } else {
                        list.add(new HttpParameter(URLDecoder.decode(split2[0], "UTF-8"), ""));
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    private static List<HttpParameter> toParamList(HttpParameter[] httpParameterArr) {
        ArrayList arrayList = new ArrayList(httpParameterArr.length);
        arrayList.addAll(Arrays.asList(httpParameterArr));
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthSupport)) {
            return false;
        }
        OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) obj;
        String str = this.consumerKey;
        if (str == null ? oAuthAuthorization.consumerKey != null : !str.equals(oAuthAuthorization.consumerKey)) {
            return false;
        }
        String str2 = this.consumerSecret;
        if (str2 == null ? oAuthAuthorization.consumerSecret != null : !str2.equals(oAuthAuthorization.consumerSecret)) {
            return false;
        }
        OAuthToken oAuthToken = this.oauthToken;
        OAuthToken oAuthToken2 = oAuthAuthorization.oauthToken;
        return oAuthToken == null ? oAuthToken2 == null : oAuthToken.equals(oAuthToken2);
    }

    /* access modifiers changed from: package-private */
    public String generateAuthorizationHeader(String str, String str2, HttpParameter[] httpParameterArr, String str3, String str4, OAuthToken oAuthToken) {
        if (httpParameterArr == null) {
            httpParameterArr = new HttpParameter[0];
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new HttpParameter("oauth_consumer_key", this.consumerKey));
        arrayList.add(OAUTH_SIGNATURE_METHOD);
        arrayList.add(new HttpParameter("oauth_timestamp", str4));
        arrayList.add(new HttpParameter("oauth_nonce", str3));
        arrayList.add(new HttpParameter("oauth_version", "1.0"));
        if (oAuthToken != null) {
            arrayList.add(new HttpParameter("oauth_token", oAuthToken.getToken()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + httpParameterArr.length);
        arrayList2.addAll(arrayList);
        if (!HttpParameter.containsFile(httpParameterArr)) {
            arrayList2.addAll(toParamList(httpParameterArr));
        }
        parseGetParameters(str2, arrayList2);
        String str5 = str + "&" + HttpParameter.encode(constructRequestURL(str2)) + "&" + HttpParameter.encode(normalizeRequestParameters((List<HttpParameter>) arrayList2));
        Logger logger2 = logger;
        logger2.debug("OAuth base string: ", str5);
        String generateSignature = generateSignature(str5, oAuthToken);
        logger2.debug("OAuth signature: ", generateSignature);
        arrayList.add(new HttpParameter("oauth_signature", generateSignature));
        String str6 = this.realm;
        if (str6 != null) {
            arrayList.add(new HttpParameter("realm", str6));
        }
        return "OAuth " + encodeParameters(arrayList, ",", true);
    }

    public List<HttpParameter> generateOAuthSignatureHttpParams(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new HttpParameter("oauth_consumer_key", this.consumerKey));
        arrayList.add(OAUTH_SIGNATURE_METHOD);
        arrayList.add(new HttpParameter("oauth_timestamp", currentTimeMillis));
        arrayList.add(new HttpParameter("oauth_nonce", ((long) RAND.nextInt()) + currentTimeMillis));
        arrayList.add(new HttpParameter("oauth_version", "1.0"));
        OAuthToken oAuthToken = this.oauthToken;
        if (oAuthToken != null) {
            arrayList.add(new HttpParameter("oauth_token", oAuthToken.getToken()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        parseGetParameters(str2, arrayList2);
        arrayList.add(new HttpParameter("oauth_signature", generateSignature(str + "&" + HttpParameter.encode(constructRequestURL(str2)) + "&" + HttpParameter.encode(normalizeRequestParameters((List<HttpParameter>) arrayList2)), this.oauthToken)));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public String generateSignature(String str, OAuthToken oAuthToken) {
        SecretKeySpec secretKeySpec;
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            if (oAuthToken == null) {
                secretKeySpec = new SecretKeySpec((HttpParameter.encode(this.consumerSecret) + "&").getBytes(), "HmacSHA1");
            } else {
                SecretKeySpec secretKeySpec2 = oAuthToken.getSecretKeySpec();
                if (secretKeySpec2 == null) {
                    secretKeySpec2 = new SecretKeySpec((HttpParameter.encode(this.consumerSecret) + "&" + HttpParameter.encode(oAuthToken.getTokenSecret())).getBytes(), "HmacSHA1");
                    oAuthToken.setSecretKeySpec(secretKeySpec2);
                }
                secretKeySpec = secretKeySpec2;
            }
            instance.init(secretKeySpec);
            return BASE64Encoder.encode(instance.doFinal(str.getBytes()));
        } catch (InvalidKeyException e) {
            logger.error("Failed initialize \"Message Authentication Code\" (MAC)", e);
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            logger.error("Failed to get HmacSHA1 \"Message Authentication Code\" (MAC)", e2);
            throw new AssertionError(e2);
        }
    }

    public String getAuthorizationHeader(HttpRequest httpRequest) {
        return generateAuthorizationHeader(httpRequest.getMethod().name(), httpRequest.getURL(), httpRequest.getParameters(), this.oauthToken);
    }

    public AccessToken getOAuthAccessToken() throws TwitterException {
        ensureTokenIsAvailable();
        OAuthToken oAuthToken = this.oauthToken;
        if (oAuthToken instanceof AccessToken) {
            return (AccessToken) oAuthToken;
        }
        AccessToken accessToken = new AccessToken(http.post(this.conf.getOAuthAccessTokenURL(), (HttpParameter[]) null, this, (HttpResponseListener) null));
        this.oauthToken = accessToken;
        AccessToken accessToken2 = accessToken;
        return accessToken;
    }

    public RequestToken getOAuthRequestToken() throws TwitterException {
        return getOAuthRequestToken((String) null, (String) null, (String) null);
    }

    public int hashCode() {
        String str = this.consumerKey;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.consumerSecret;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        OAuthToken oAuthToken = this.oauthToken;
        if (oAuthToken != null) {
            i = oAuthToken.hashCode();
        }
        return hashCode2 + i;
    }

    public boolean isEnabled() {
        OAuthToken oAuthToken = this.oauthToken;
        return oAuthToken != null && (oAuthToken instanceof AccessToken);
    }

    public void setOAuthAccessToken(AccessToken accessToken) {
        this.oauthToken = accessToken;
    }

    public void setOAuthConsumer(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.consumerKey = str;
        if (str2 == null) {
            str2 = "";
        }
        this.consumerSecret = str2;
    }

    public void setOAuthRealm(String str) {
        this.realm = str;
    }

    public String toString() {
        return "OAuthAuthorization{consumerKey='" + this.consumerKey + '\'' + ", consumerSecret='******************************************'" + ", oauthToken=" + this.oauthToken + '}';
    }

    public static String encodeParameters(List<HttpParameter> list, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (HttpParameter next : list) {
            if (!next.isFile()) {
                if (sb.length() != 0) {
                    if (z) {
                        sb.append("\"");
                    }
                    sb.append(str);
                }
                sb.append(HttpParameter.encode(next.getName()));
                sb.append("=");
                if (z) {
                    sb.append("\"");
                }
                sb.append(HttpParameter.encode(next.getValue()));
            }
        }
        if (sb.length() != 0 && z) {
            sb.append("\"");
        }
        return sb.toString();
    }

    private static String normalizeRequestParameters(List<HttpParameter> list) {
        Collections.sort(list);
        return encodeParameters(list);
    }

    public RequestToken getOAuthRequestToken(String str) throws TwitterException {
        return getOAuthRequestToken(str, (String) null, (String) null);
    }

    public RequestToken getOAuthRequestToken(String str, String str2) throws TwitterException {
        return getOAuthRequestToken(str, str2, (String) null);
    }

    public RequestToken getOAuthRequestToken(String str, String str2, String str3) throws TwitterException {
        if (!(this.oauthToken instanceof AccessToken)) {
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(new HttpParameter("oauth_callback", str));
            }
            if (str2 != null) {
                arrayList.add(new HttpParameter("x_auth_access_type", str2));
            }
            if (str3 != null) {
                arrayList.add(new HttpParameter("x_auth_mode", str3));
            }
            RequestToken requestToken = new RequestToken(http.post(this.conf.getOAuthRequestTokenURL(), (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]), this, (HttpResponseListener) null), (OAuthSupport) this);
            this.oauthToken = requestToken;
            RequestToken requestToken2 = requestToken;
            return requestToken;
        }
        throw new IllegalStateException("Access token already available.");
    }

    public AccessToken getOAuthAccessToken(String str) throws TwitterException {
        ensureTokenIsAvailable();
        AccessToken accessToken = new AccessToken(http.post(this.conf.getOAuthAccessTokenURL(), new HttpParameter[]{new HttpParameter("oauth_verifier", str)}, this, (HttpResponseListener) null));
        this.oauthToken = accessToken;
        AccessToken accessToken2 = accessToken;
        return accessToken;
    }

    public AccessToken getOAuthAccessToken(RequestToken requestToken) throws TwitterException {
        this.oauthToken = requestToken;
        return getOAuthAccessToken();
    }

    public AccessToken getOAuthAccessToken(RequestToken requestToken, String str) throws TwitterException {
        this.oauthToken = requestToken;
        return getOAuthAccessToken(str);
    }

    public AccessToken getOAuthAccessToken(String str, String str2) throws TwitterException {
        try {
            String oAuthAccessTokenURL = this.conf.getOAuthAccessTokenURL();
            if (oAuthAccessTokenURL.indexOf("http://") == 0) {
                oAuthAccessTokenURL = "https://" + oAuthAccessTokenURL.substring(7);
            }
            AccessToken accessToken = new AccessToken(http.post(oAuthAccessTokenURL, new HttpParameter[]{new HttpParameter("x_auth_username", str), new HttpParameter("x_auth_password", str2), new HttpParameter("x_auth_mode", "client_auth")}, this, (HttpResponseListener) null));
            this.oauthToken = accessToken;
            AccessToken accessToken2 = accessToken;
            return accessToken;
        } catch (TwitterException e) {
            throw new TwitterException("The screen name / password combination seems to be invalid.", e, e.getStatusCode());
        }
    }

    /* access modifiers changed from: package-private */
    public String generateSignature(String str) {
        return generateSignature(str, (OAuthToken) null);
    }

    /* access modifiers changed from: package-private */
    public String generateAuthorizationHeader(String str, String str2, HttpParameter[] httpParameterArr, OAuthToken oAuthToken) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return generateAuthorizationHeader(str, str2, httpParameterArr, String.valueOf(((long) RAND.nextInt()) + currentTimeMillis), String.valueOf(currentTimeMillis), oAuthToken);
    }
}
