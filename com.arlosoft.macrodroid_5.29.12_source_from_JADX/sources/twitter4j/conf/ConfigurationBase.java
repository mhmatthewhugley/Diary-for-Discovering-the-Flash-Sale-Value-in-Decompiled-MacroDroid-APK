package twitter4j.conf;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.webkit.ProxyConfig;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import twitter4j.HttpClientConfiguration;
import twitter4j.Logger;

class ConfigurationBase implements Configuration, Serializable {
    private static final List<ConfigurationBase> instances = new ArrayList();
    private static final long serialVersionUID = 6175546394599249696L;
    private boolean applicationOnlyAuthEnabled = false;
    private int asyncNumThreads = 1;
    private long contributingTo = -1;
    private boolean daemonEnabled = true;
    private boolean debug = false;
    private String dispatcherImpl = "twitter4j.DispatcherImpl";
    private HttpClientConfiguration httpConf = new MyHttpClientConfiguration((String) null, (String) null, (String) null, -1, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 120000, false, true);
    /* access modifiers changed from: private */
    public int httpRetryCount = 0;
    /* access modifiers changed from: private */
    public int httpRetryIntervalSeconds = 5;
    private int httpStreamingReadTimeout = SamsungIrisUnlockModule.IRIS_ONE_EYE;
    private boolean includeEntitiesEnabled = true;
    private boolean includeMyRetweetEnabled = true;
    private boolean jsonStoreEnabled = false;
    private String loggerFactory = null;
    private boolean mbeanEnabled = false;
    private String mediaProvider = "TWITTER";
    private String mediaProviderAPIKey = null;
    private Properties mediaProviderParameters = null;
    private String oAuth2AccessToken;
    private String oAuth2InvalidateTokenURL = "https://api.twitter.com/oauth2/invalidate_token";
    private String oAuth2Scope;
    private String oAuth2TokenType;
    private String oAuth2TokenURL = "https://api.twitter.com/oauth2/token";
    private String oAuthAccessToken = null;
    private String oAuthAccessTokenSecret = null;
    private String oAuthAccessTokenURL = "https://api.twitter.com/oauth/access_token";
    private String oAuthAuthenticationURL = "https://api.twitter.com/oauth/authenticate";
    private String oAuthAuthorizationURL = "https://api.twitter.com/oauth/authorize";
    private String oAuthConsumerKey = null;
    private String oAuthConsumerSecret = null;
    private String oAuthRequestTokenURL = "https://api.twitter.com/oauth/request_token";
    private String password = null;
    private String restBaseURL = "https://api.twitter.com/1.1/";
    private String siteStreamBaseURL = "https://sitestream.twitter.com/1.1/";
    private boolean stallWarningsEnabled = true;
    private String streamBaseURL = "https://stream.twitter.com/1.1/";
    private boolean trimUserEnabled = false;
    private String uploadBaseURL = "https://upload.twitter.com/1.1/";
    private String user = null;
    private String userStreamBaseURL = "https://userstream.twitter.com/1.1/";
    private boolean userStreamRepliesAllEnabled = false;
    private boolean userStreamWithFollowingsEnabled = true;

    class MyHttpClientConfiguration implements HttpClientConfiguration, Serializable {
        private static final long serialVersionUID = 8226866124868861058L;
        private boolean gzipEnabled;
        private int httpConnectionTimeout;
        private String httpProxyHost;
        private String httpProxyPassword;
        private int httpProxyPort;
        private String httpProxyUser;
        private int httpReadTimeout;
        private boolean prettyDebug;

        MyHttpClientConfiguration(String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
            this.httpProxyHost = str;
            this.httpProxyUser = str2;
            this.httpProxyPassword = str3;
            this.httpProxyPort = i;
            this.httpConnectionTimeout = i2;
            this.httpReadTimeout = i3;
            this.prettyDebug = z;
            this.gzipEnabled = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MyHttpClientConfiguration myHttpClientConfiguration = (MyHttpClientConfiguration) obj;
            if (this.gzipEnabled != myHttpClientConfiguration.gzipEnabled || this.httpConnectionTimeout != myHttpClientConfiguration.httpConnectionTimeout || this.httpProxyPort != myHttpClientConfiguration.httpProxyPort || this.httpReadTimeout != myHttpClientConfiguration.httpReadTimeout || this.prettyDebug != myHttpClientConfiguration.prettyDebug) {
                return false;
            }
            String str = this.httpProxyHost;
            if (str == null ? myHttpClientConfiguration.httpProxyHost != null : !str.equals(myHttpClientConfiguration.httpProxyHost)) {
                return false;
            }
            String str2 = this.httpProxyPassword;
            if (str2 == null ? myHttpClientConfiguration.httpProxyPassword != null : !str2.equals(myHttpClientConfiguration.httpProxyPassword)) {
                return false;
            }
            String str3 = this.httpProxyUser;
            String str4 = myHttpClientConfiguration.httpProxyUser;
            return str3 == null ? str4 == null : str3.equals(str4);
        }

        public int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        public String getHttpProxyHost() {
            return this.httpProxyHost;
        }

        public String getHttpProxyPassword() {
            return this.httpProxyPassword;
        }

        public int getHttpProxyPort() {
            return this.httpProxyPort;
        }

        public String getHttpProxyUser() {
            return this.httpProxyUser;
        }

        public int getHttpReadTimeout() {
            return this.httpReadTimeout;
        }

        public int getHttpRetryCount() {
            return ConfigurationBase.this.httpRetryCount;
        }

        public int getHttpRetryIntervalSeconds() {
            return ConfigurationBase.this.httpRetryIntervalSeconds;
        }

        public int hashCode() {
            String str = this.httpProxyHost;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.httpProxyUser;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.httpProxyPassword;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((((((((((hashCode2 + i) * 31) + this.httpProxyPort) * 31) + this.httpConnectionTimeout) * 31) + this.httpReadTimeout) * 31) + (this.prettyDebug ? 1 : 0)) * 31) + (this.gzipEnabled ? 1 : 0);
        }

        public boolean isGZIPEnabled() {
            return this.gzipEnabled;
        }

        public boolean isPrettyDebugEnabled() {
            return this.prettyDebug;
        }

        public String toString() {
            return "MyHttpClientConfiguration{httpProxyHost='" + this.httpProxyHost + '\'' + ", httpProxyUser='" + this.httpProxyUser + '\'' + ", httpProxyPassword='" + this.httpProxyPassword + '\'' + ", httpProxyPort=" + this.httpProxyPort + ", httpConnectionTimeout=" + this.httpConnectionTimeout + ", httpReadTimeout=" + this.httpReadTimeout + ", prettyDebug=" + this.prettyDebug + ", gzipEnabled=" + this.gzipEnabled + '}';
        }
    }

    protected ConfigurationBase() {
    }

    private static void cacheInstance(ConfigurationBase configurationBase) {
        List<ConfigurationBase> list = instances;
        if (!list.contains(configurationBase)) {
            list.add(configurationBase);
        }
    }

    static String fixURL(boolean z, String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("://");
        if (-1 != indexOf) {
            String substring = str.substring(indexOf + 3);
            if (z) {
                return "https://" + substring;
            }
            return "http://" + substring;
        }
        throw new IllegalArgumentException("url should contain '://'");
    }

    private static ConfigurationBase getInstance(ConfigurationBase configurationBase) {
        List<ConfigurationBase> list = instances;
        int indexOf = list.indexOf(configurationBase);
        if (indexOf != -1) {
            return list.get(indexOf);
        }
        list.add(configurationBase);
        return configurationBase;
    }

    public void dumpConfiguration() {
        Logger logger = Logger.getLogger(ConfigurationBase.class);
        if (this.debug) {
            for (Field field : ConfigurationBase.class.getDeclaredFields()) {
                try {
                    Object obj = field.get(this);
                    String valueOf = String.valueOf(obj);
                    if (obj != null && field.getName().matches("oAuthConsumerSecret|oAuthAccessTokenSecret|password")) {
                        valueOf = String.valueOf(obj).replaceAll(".", ProxyConfig.MATCH_ALL_SCHEMES);
                    }
                    logger.debug(field.getName() + ": " + valueOf);
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationBase configurationBase = (ConfigurationBase) obj;
        if (this.applicationOnlyAuthEnabled != configurationBase.applicationOnlyAuthEnabled || this.asyncNumThreads != configurationBase.asyncNumThreads || this.contributingTo != configurationBase.contributingTo || this.daemonEnabled != configurationBase.daemonEnabled || this.debug != configurationBase.debug || this.httpRetryCount != configurationBase.httpRetryCount || this.httpRetryIntervalSeconds != configurationBase.httpRetryIntervalSeconds || this.httpStreamingReadTimeout != configurationBase.httpStreamingReadTimeout || this.includeEntitiesEnabled != configurationBase.includeEntitiesEnabled || this.includeMyRetweetEnabled != configurationBase.includeMyRetweetEnabled || this.jsonStoreEnabled != configurationBase.jsonStoreEnabled || this.mbeanEnabled != configurationBase.mbeanEnabled || this.stallWarningsEnabled != configurationBase.stallWarningsEnabled || this.trimUserEnabled != configurationBase.trimUserEnabled || this.userStreamRepliesAllEnabled != configurationBase.userStreamRepliesAllEnabled || this.userStreamWithFollowingsEnabled != configurationBase.userStreamWithFollowingsEnabled) {
            return false;
        }
        String str = this.dispatcherImpl;
        if (str == null ? configurationBase.dispatcherImpl != null : !str.equals(configurationBase.dispatcherImpl)) {
            return false;
        }
        HttpClientConfiguration httpClientConfiguration = this.httpConf;
        if (httpClientConfiguration == null ? configurationBase.httpConf != null : !httpClientConfiguration.equals(configurationBase.httpConf)) {
            return false;
        }
        String str2 = this.loggerFactory;
        if (str2 == null ? configurationBase.loggerFactory != null : !str2.equals(configurationBase.loggerFactory)) {
            return false;
        }
        String str3 = this.mediaProvider;
        if (str3 == null ? configurationBase.mediaProvider != null : !str3.equals(configurationBase.mediaProvider)) {
            return false;
        }
        String str4 = this.mediaProviderAPIKey;
        if (str4 == null ? configurationBase.mediaProviderAPIKey != null : !str4.equals(configurationBase.mediaProviderAPIKey)) {
            return false;
        }
        Properties properties = this.mediaProviderParameters;
        if (properties == null ? configurationBase.mediaProviderParameters != null : !properties.equals(configurationBase.mediaProviderParameters)) {
            return false;
        }
        String str5 = this.oAuth2AccessToken;
        if (str5 == null ? configurationBase.oAuth2AccessToken != null : !str5.equals(configurationBase.oAuth2AccessToken)) {
            return false;
        }
        String str6 = this.oAuth2InvalidateTokenURL;
        if (str6 == null ? configurationBase.oAuth2InvalidateTokenURL != null : !str6.equals(configurationBase.oAuth2InvalidateTokenURL)) {
            return false;
        }
        String str7 = this.oAuth2TokenType;
        if (str7 == null ? configurationBase.oAuth2TokenType != null : !str7.equals(configurationBase.oAuth2TokenType)) {
            return false;
        }
        String str8 = this.oAuth2TokenURL;
        if (str8 == null ? configurationBase.oAuth2TokenURL != null : !str8.equals(configurationBase.oAuth2TokenURL)) {
            return false;
        }
        String str9 = this.oAuth2Scope;
        if (str9 == null ? configurationBase.oAuth2Scope != null : !str9.equals(configurationBase.oAuth2Scope)) {
            return false;
        }
        String str10 = this.oAuthAccessToken;
        if (str10 == null ? configurationBase.oAuthAccessToken != null : !str10.equals(configurationBase.oAuthAccessToken)) {
            return false;
        }
        String str11 = this.oAuthAccessTokenSecret;
        if (str11 == null ? configurationBase.oAuthAccessTokenSecret != null : !str11.equals(configurationBase.oAuthAccessTokenSecret)) {
            return false;
        }
        String str12 = this.oAuthAccessTokenURL;
        if (str12 == null ? configurationBase.oAuthAccessTokenURL != null : !str12.equals(configurationBase.oAuthAccessTokenURL)) {
            return false;
        }
        String str13 = this.oAuthAuthenticationURL;
        if (str13 == null ? configurationBase.oAuthAuthenticationURL != null : !str13.equals(configurationBase.oAuthAuthenticationURL)) {
            return false;
        }
        String str14 = this.oAuthAuthorizationURL;
        if (str14 == null ? configurationBase.oAuthAuthorizationURL != null : !str14.equals(configurationBase.oAuthAuthorizationURL)) {
            return false;
        }
        String str15 = this.oAuthConsumerKey;
        if (str15 == null ? configurationBase.oAuthConsumerKey != null : !str15.equals(configurationBase.oAuthConsumerKey)) {
            return false;
        }
        String str16 = this.oAuthConsumerSecret;
        if (str16 == null ? configurationBase.oAuthConsumerSecret != null : !str16.equals(configurationBase.oAuthConsumerSecret)) {
            return false;
        }
        String str17 = this.oAuthRequestTokenURL;
        if (str17 == null ? configurationBase.oAuthRequestTokenURL != null : !str17.equals(configurationBase.oAuthRequestTokenURL)) {
            return false;
        }
        String str18 = this.password;
        if (str18 == null ? configurationBase.password != null : !str18.equals(configurationBase.password)) {
            return false;
        }
        String str19 = this.restBaseURL;
        if (str19 == null ? configurationBase.restBaseURL != null : !str19.equals(configurationBase.restBaseURL)) {
            return false;
        }
        String str20 = this.uploadBaseURL;
        if (str20 == null ? configurationBase.uploadBaseURL != null : !str20.equals(configurationBase.uploadBaseURL)) {
            return false;
        }
        String str21 = this.siteStreamBaseURL;
        if (str21 == null ? configurationBase.siteStreamBaseURL != null : !str21.equals(configurationBase.siteStreamBaseURL)) {
            return false;
        }
        String str22 = this.streamBaseURL;
        if (str22 == null ? configurationBase.streamBaseURL != null : !str22.equals(configurationBase.streamBaseURL)) {
            return false;
        }
        String str23 = this.user;
        if (str23 == null ? configurationBase.user != null : !str23.equals(configurationBase.user)) {
            return false;
        }
        String str24 = this.userStreamBaseURL;
        String str25 = configurationBase.userStreamBaseURL;
        return str24 == null ? str25 == null : str24.equals(str25);
    }

    public final int getAsyncNumThreads() {
        return this.asyncNumThreads;
    }

    public final long getContributingTo() {
        return this.contributingTo;
    }

    public String getDispatcherImpl() {
        return this.dispatcherImpl;
    }

    public HttpClientConfiguration getHttpClientConfiguration() {
        return this.httpConf;
    }

    public int getHttpStreamingReadTimeout() {
        return this.httpStreamingReadTimeout;
    }

    public String getLoggerFactory() {
        return this.loggerFactory;
    }

    public String getMediaProvider() {
        return this.mediaProvider;
    }

    public String getMediaProviderAPIKey() {
        return this.mediaProviderAPIKey;
    }

    public Properties getMediaProviderParameters() {
        return this.mediaProviderParameters;
    }

    public String getOAuth2AccessToken() {
        return this.oAuth2AccessToken;
    }

    public String getOAuth2InvalidateTokenURL() {
        return this.oAuth2InvalidateTokenURL;
    }

    public String getOAuth2Scope() {
        return this.oAuth2Scope;
    }

    public String getOAuth2TokenType() {
        return this.oAuth2TokenType;
    }

    public String getOAuth2TokenURL() {
        return this.oAuth2TokenURL;
    }

    public String getOAuthAccessToken() {
        return this.oAuthAccessToken;
    }

    public String getOAuthAccessTokenSecret() {
        return this.oAuthAccessTokenSecret;
    }

    public String getOAuthAccessTokenURL() {
        return this.oAuthAccessTokenURL;
    }

    public String getOAuthAuthenticationURL() {
        return this.oAuthAuthenticationURL;
    }

    public String getOAuthAuthorizationURL() {
        return this.oAuthAuthorizationURL;
    }

    public final String getOAuthConsumerKey() {
        return this.oAuthConsumerKey;
    }

    public final String getOAuthConsumerSecret() {
        return this.oAuthConsumerSecret;
    }

    public String getOAuthRequestTokenURL() {
        return this.oAuthRequestTokenURL;
    }

    public final String getPassword() {
        return this.password;
    }

    public String getRestBaseURL() {
        return this.restBaseURL;
    }

    public String getSiteStreamBaseURL() {
        return this.siteStreamBaseURL;
    }

    public String getStreamBaseURL() {
        return this.streamBaseURL;
    }

    public String getUploadBaseURL() {
        return this.uploadBaseURL;
    }

    public final String getUser() {
        return this.user;
    }

    public String getUserStreamBaseURL() {
        return this.userStreamBaseURL;
    }

    public int hashCode() {
        int i = (this.debug ? 1 : 0) * true;
        String str = this.user;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.password;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HttpClientConfiguration httpClientConfiguration = this.httpConf;
        int hashCode3 = (((((((hashCode2 + (httpClientConfiguration != null ? httpClientConfiguration.hashCode() : 0)) * 31) + this.httpStreamingReadTimeout) * 31) + this.httpRetryCount) * 31) + this.httpRetryIntervalSeconds) * 31;
        String str3 = this.oAuthConsumerKey;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.oAuthConsumerSecret;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.oAuthAccessToken;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.oAuthAccessTokenSecret;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.oAuth2TokenType;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.oAuth2AccessToken;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.oAuth2Scope;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.oAuthRequestTokenURL;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.oAuthAuthorizationURL;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.oAuthAccessTokenURL;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.oAuthAuthenticationURL;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.oAuth2TokenURL;
        int hashCode15 = (hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.oAuth2InvalidateTokenURL;
        int hashCode16 = (hashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.restBaseURL;
        int hashCode17 = (hashCode16 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.uploadBaseURL;
        int hashCode18 = (hashCode17 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.streamBaseURL;
        int hashCode19 = (hashCode18 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.userStreamBaseURL;
        int hashCode20 = (hashCode19 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.siteStreamBaseURL;
        int hashCode21 = (hashCode20 + (str20 != null ? str20.hashCode() : 0)) * 31;
        String str21 = this.dispatcherImpl;
        int hashCode22 = (((hashCode21 + (str21 != null ? str21.hashCode() : 0)) * 31) + this.asyncNumThreads) * 31;
        String str22 = this.loggerFactory;
        int hashCode23 = str22 != null ? str22.hashCode() : 0;
        long j = this.contributingTo;
        int i3 = (((((((((((((((((((((hashCode22 + hashCode23) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.includeMyRetweetEnabled ? 1 : 0)) * 31) + (this.includeEntitiesEnabled ? 1 : 0)) * 31) + (this.trimUserEnabled ? 1 : 0)) * 31) + (this.jsonStoreEnabled ? 1 : 0)) * 31) + (this.mbeanEnabled ? 1 : 0)) * 31) + (this.userStreamRepliesAllEnabled ? 1 : 0)) * 31) + (this.userStreamWithFollowingsEnabled ? 1 : 0)) * 31) + (this.stallWarningsEnabled ? 1 : 0)) * 31) + (this.applicationOnlyAuthEnabled ? 1 : 0)) * 31;
        String str23 = this.mediaProvider;
        int hashCode24 = (i3 + (str23 != null ? str23.hashCode() : 0)) * 31;
        String str24 = this.mediaProviderAPIKey;
        int hashCode25 = (hashCode24 + (str24 != null ? str24.hashCode() : 0)) * 31;
        Properties properties = this.mediaProviderParameters;
        if (properties != null) {
            i2 = properties.hashCode();
        }
        return ((hashCode25 + i2) * 31) + (this.daemonEnabled ? 1 : 0);
    }

    public boolean isApplicationOnlyAuthEnabled() {
        return this.applicationOnlyAuthEnabled;
    }

    public boolean isDaemonEnabled() {
        return this.daemonEnabled;
    }

    public final boolean isDebugEnabled() {
        return this.debug;
    }

    public boolean isIncludeEntitiesEnabled() {
        return this.includeEntitiesEnabled;
    }

    public boolean isIncludeMyRetweetEnabled() {
        return this.includeMyRetweetEnabled;
    }

    public boolean isJSONStoreEnabled() {
        return this.jsonStoreEnabled;
    }

    public boolean isMBeanEnabled() {
        return this.mbeanEnabled;
    }

    public boolean isStallWarningsEnabled() {
        return this.stallWarningsEnabled;
    }

    public boolean isTrimUserEnabled() {
        return this.trimUserEnabled;
    }

    public boolean isUserStreamRepliesAllEnabled() {
        return this.userStreamRepliesAllEnabled;
    }

    public boolean isUserStreamWithFollowingsEnabled() {
        return this.userStreamWithFollowingsEnabled;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() throws ObjectStreamException {
        return getInstance(this);
    }

    /* access modifiers changed from: protected */
    public final void setApplicationOnlyAuthEnabled(boolean z) {
        this.applicationOnlyAuthEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setAsyncNumThreads(int i) {
        this.asyncNumThreads = i;
    }

    /* access modifiers changed from: protected */
    public final void setContributingTo(long j) {
        this.contributingTo = j;
    }

    /* access modifiers changed from: protected */
    public void setDaemonEnabled(boolean z) {
        this.daemonEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setDebug(boolean z) {
        this.debug = z;
    }

    /* access modifiers changed from: protected */
    public final void setDispatcherImpl(String str) {
        this.dispatcherImpl = str;
    }

    /* access modifiers changed from: protected */
    public final void setGZIPEnabled(boolean z) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), z);
    }

    /* access modifiers changed from: protected */
    public final void setHttpConnectionTimeout(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), i, this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpProxyHost(String str) {
        this.httpConf = new MyHttpClientConfiguration(str, this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpProxyPassword(String str) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), str, this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpProxyPort(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), i, this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpProxyUser(String str) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), str, this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpReadTimeout(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), i, this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setHttpRetryCount(int i) {
        this.httpRetryCount = i;
    }

    /* access modifiers changed from: protected */
    public final void setHttpRetryIntervalSeconds(int i) {
        this.httpRetryIntervalSeconds = i;
    }

    /* access modifiers changed from: protected */
    public final void setHttpStreamingReadTimeout(int i) {
        this.httpStreamingReadTimeout = i;
    }

    /* access modifiers changed from: protected */
    public void setIncludeEntitiesEnabled(boolean z) {
        this.includeEntitiesEnabled = z;
    }

    public void setIncludeMyRetweetEnabled(boolean z) {
        this.includeMyRetweetEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setJSONStoreEnabled(boolean z) {
        this.jsonStoreEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setLoggerFactory(String str) {
        this.loggerFactory = str;
    }

    /* access modifiers changed from: protected */
    public final void setMBeanEnabled(boolean z) {
        this.mbeanEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setMediaProvider(String str) {
        this.mediaProvider = str;
    }

    /* access modifiers changed from: protected */
    public final void setMediaProviderAPIKey(String str) {
        this.mediaProviderAPIKey = str;
    }

    /* access modifiers changed from: protected */
    public final void setMediaProviderParameters(Properties properties) {
        this.mediaProviderParameters = properties;
    }

    /* access modifiers changed from: protected */
    public final void setOAuth2AccessToken(String str) {
        this.oAuth2AccessToken = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuth2InvalidateTokenURL(String str) {
        this.oAuth2InvalidateTokenURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuth2Scope(String str) {
        this.oAuth2Scope = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuth2TokenType(String str) {
        this.oAuth2TokenType = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuth2TokenURL(String str) {
        this.oAuth2TokenURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthAccessToken(String str) {
        this.oAuthAccessToken = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthAccessTokenSecret(String str) {
        this.oAuthAccessTokenSecret = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthAccessTokenURL(String str) {
        this.oAuthAccessTokenURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthAuthenticationURL(String str) {
        this.oAuthAuthenticationURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthAuthorizationURL(String str) {
        this.oAuthAuthorizationURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthConsumerKey(String str) {
        this.oAuthConsumerKey = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthConsumerSecret(String str) {
        this.oAuthConsumerSecret = str;
    }

    /* access modifiers changed from: protected */
    public final void setOAuthRequestTokenURL(String str) {
        this.oAuthRequestTokenURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setPassword(String str) {
        this.password = str;
    }

    /* access modifiers changed from: protected */
    public final void setPrettyDebugEnabled(boolean z) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), z, this.httpConf.isGZIPEnabled());
    }

    /* access modifiers changed from: protected */
    public final void setRestBaseURL(String str) {
        this.restBaseURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setSiteStreamBaseURL(String str) {
        this.siteStreamBaseURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setStallWarningsEnabled(boolean z) {
        this.stallWarningsEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setStreamBaseURL(String str) {
        this.streamBaseURL = str;
    }

    public void setTrimUserEnabled(boolean z) {
        this.trimUserEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setUploadBaseURL(String str) {
        this.uploadBaseURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setUser(String str) {
        this.user = str;
    }

    /* access modifiers changed from: protected */
    public final void setUserStreamBaseURL(String str) {
        this.userStreamBaseURL = str;
    }

    /* access modifiers changed from: protected */
    public final void setUserStreamRepliesAllEnabled(boolean z) {
        this.userStreamRepliesAllEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final void setUserStreamWithFollowingsEnabled(boolean z) {
        this.userStreamWithFollowingsEnabled = z;
    }

    public String toString() {
        return "ConfigurationBase{debug=" + this.debug + ", user='" + this.user + '\'' + ", password='" + this.password + '\'' + ", httpConf=" + this.httpConf + ", httpStreamingReadTimeout=" + this.httpStreamingReadTimeout + ", httpRetryCount=" + this.httpRetryCount + ", httpRetryIntervalSeconds=" + this.httpRetryIntervalSeconds + ", oAuthConsumerKey='" + this.oAuthConsumerKey + '\'' + ", oAuthConsumerSecret='" + this.oAuthConsumerSecret + '\'' + ", oAuthAccessToken='" + this.oAuthAccessToken + '\'' + ", oAuthAccessTokenSecret='" + this.oAuthAccessTokenSecret + '\'' + ", oAuth2TokenType='" + this.oAuth2TokenType + '\'' + ", oAuth2AccessToken='" + this.oAuth2AccessToken + '\'' + ", oAuth2Scope='" + this.oAuth2Scope + '\'' + ", oAuthRequestTokenURL='" + this.oAuthRequestTokenURL + '\'' + ", oAuthAuthorizationURL='" + this.oAuthAuthorizationURL + '\'' + ", oAuthAccessTokenURL='" + this.oAuthAccessTokenURL + '\'' + ", oAuthAuthenticationURL='" + this.oAuthAuthenticationURL + '\'' + ", oAuth2TokenURL='" + this.oAuth2TokenURL + '\'' + ", oAuth2InvalidateTokenURL='" + this.oAuth2InvalidateTokenURL + '\'' + ", restBaseURL='" + this.restBaseURL + '\'' + ", uploadBaseURL='" + this.uploadBaseURL + '\'' + ", streamBaseURL='" + this.streamBaseURL + '\'' + ", userStreamBaseURL='" + this.userStreamBaseURL + '\'' + ", siteStreamBaseURL='" + this.siteStreamBaseURL + '\'' + ", dispatcherImpl='" + this.dispatcherImpl + '\'' + ", asyncNumThreads=" + this.asyncNumThreads + ", loggerFactory='" + this.loggerFactory + '\'' + ", contributingTo=" + this.contributingTo + ", includeMyRetweetEnabled=" + this.includeMyRetweetEnabled + ", includeEntitiesEnabled=" + this.includeEntitiesEnabled + ", trimUserEnabled=" + this.trimUserEnabled + ", jsonStoreEnabled=" + this.jsonStoreEnabled + ", mbeanEnabled=" + this.mbeanEnabled + ", userStreamRepliesAllEnabled=" + this.userStreamRepliesAllEnabled + ", userStreamWithFollowingsEnabled=" + this.userStreamWithFollowingsEnabled + ", stallWarningsEnabled=" + this.stallWarningsEnabled + ", applicationOnlyAuthEnabled=" + this.applicationOnlyAuthEnabled + ", mediaProvider='" + this.mediaProvider + '\'' + ", mediaProviderAPIKey='" + this.mediaProviderAPIKey + '\'' + ", mediaProviderParameters=" + this.mediaProviderParameters + ", daemonEnabled=" + this.daemonEnabled + '}';
    }

    /* access modifiers changed from: protected */
    public void cacheInstance() {
        cacheInstance(this);
    }
}
