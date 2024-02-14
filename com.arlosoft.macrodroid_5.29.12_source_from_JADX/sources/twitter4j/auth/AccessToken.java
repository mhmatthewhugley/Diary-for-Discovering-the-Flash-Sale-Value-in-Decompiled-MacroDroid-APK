package twitter4j.auth;

import org.apache.commons.cli.HelpFormatter;
import twitter4j.HttpResponse;
import twitter4j.TwitterException;

public class AccessToken extends OAuthToken {
    private static final long serialVersionUID = 2470022129505774772L;
    private String screenName;
    private long userId;

    AccessToken(HttpResponse httpResponse) throws TwitterException {
        this(httpResponse.asString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.userId != accessToken.userId) {
            return false;
        }
        String str = this.screenName;
        String str2 = accessToken.screenName;
        return str == null ? str2 == null : str.equals(str2);
    }

    public /* bridge */ /* synthetic */ String getParameter(String str) {
        return super.getParameter(str);
    }

    public String getScreenName() {
        return this.screenName;
    }

    public /* bridge */ /* synthetic */ String getToken() {
        return super.getToken();
    }

    public /* bridge */ /* synthetic */ String getTokenSecret() {
        return super.getTokenSecret();
    }

    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.screenName;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.userId;
        return ((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "AccessToken{screenName='" + this.screenName + '\'' + ", userId=" + this.userId + '}';
    }

    AccessToken(String str) {
        super(str);
        this.userId = -1;
        this.screenName = getParameter("screen_name");
        String parameter = getParameter("user_id");
        if (parameter != null) {
            this.userId = Long.parseLong(parameter);
        }
    }

    public AccessToken(String str, String str2) {
        super(str, str2);
        this.userId = -1;
        int indexOf = str.indexOf(HelpFormatter.DEFAULT_OPT_PREFIX);
        if (indexOf != -1) {
            try {
                this.userId = Long.parseLong(str.substring(0, indexOf));
            } catch (NumberFormatException unused) {
            }
        }
    }

    public AccessToken(String str, String str2, long j) {
        super(str, str2);
        this.userId = j;
    }
}
