package twitter4j;

import org.apache.http.cookie.ClientCookie;
import twitter4j.conf.Configuration;

public class OEmbedJSONImpl extends TwitterResponseImpl implements OEmbed {
    private static final long serialVersionUID = -2207801480251709819L;
    private String authorName;
    private String authorURL;
    private long cacheAge;
    private String html;
    private String url;
    private String version;
    private int width;

    OEmbedJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        super(httpResponse);
        JSONObject asJSONObject = httpResponse.asJSONObject();
        init(asJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, asJSONObject);
        }
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            this.html = jSONObject.getString("html");
            this.authorName = jSONObject.getString("author_name");
            this.url = jSONObject.getString("url");
            this.version = jSONObject.getString(ClientCookie.VERSION_ATTR);
            this.cacheAge = jSONObject.getLong("cache_age");
            this.authorURL = jSONObject.getString("author_url");
            this.width = jSONObject.getInt("width");
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OEmbedJSONImpl oEmbedJSONImpl = (OEmbedJSONImpl) obj;
        if (this.cacheAge != oEmbedJSONImpl.cacheAge || this.width != oEmbedJSONImpl.width) {
            return false;
        }
        String str = this.authorName;
        if (str == null ? oEmbedJSONImpl.authorName != null : !str.equals(oEmbedJSONImpl.authorName)) {
            return false;
        }
        String str2 = this.authorURL;
        if (str2 == null ? oEmbedJSONImpl.authorURL != null : !str2.equals(oEmbedJSONImpl.authorURL)) {
            return false;
        }
        String str3 = this.html;
        if (str3 == null ? oEmbedJSONImpl.html != null : !str3.equals(oEmbedJSONImpl.html)) {
            return false;
        }
        String str4 = this.url;
        if (str4 == null ? oEmbedJSONImpl.url != null : !str4.equals(oEmbedJSONImpl.url)) {
            return false;
        }
        String str5 = this.version;
        String str6 = oEmbedJSONImpl.version;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public /* bridge */ /* synthetic */ int getAccessLevel() {
        return super.getAccessLevel();
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorURL() {
        return this.authorURL;
    }

    public long getCacheAge() {
        return this.cacheAge;
    }

    public String getHtml() {
        return this.html;
    }

    public /* bridge */ /* synthetic */ RateLimitStatus getRateLimitStatus() {
        return super.getRateLimitStatus();
    }

    public String getURL() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.html;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.authorName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.version;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.cacheAge;
        int i2 = (((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str5 = this.authorURL;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((i2 + i) * 31) + this.width;
    }

    public String toString() {
        return "OEmbedJSONImpl{html='" + this.html + '\'' + ", authorName='" + this.authorName + '\'' + ", url='" + this.url + '\'' + ", version='" + this.version + '\'' + ", cacheAge=" + this.cacheAge + ", authorURL='" + this.authorURL + '\'' + ", width=" + this.width + '}';
    }

    OEmbedJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }
}
