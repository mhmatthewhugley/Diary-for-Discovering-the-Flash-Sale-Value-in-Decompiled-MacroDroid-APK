package twitter4j.media;

import androidx.core.app.NotificationCompat;
import twitter4j.HttpParameter;
import twitter4j.TwitterException;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

class TwippleUpload extends AbstractImageUploadImpl {
    public TwippleUpload(Configuration configuration, OAuthAuthorization oAuthAuthorization) {
        super(configuration, oAuthAuthorization);
    }

    /* access modifiers changed from: protected */
    public String postUpload() throws TwitterException {
        if (this.httpResponse.getStatusCode() == 200) {
            String asString = this.httpResponse.asString();
            if (asString.contains("<rsp stat=\"fail\">")) {
                String substring = asString.substring(asString.indexOf(NotificationCompat.CATEGORY_MESSAGE) + 5, asString.lastIndexOf("\""));
                throw new TwitterException("Twipple image upload failed with this error message: " + substring, this.httpResponse);
            } else if (asString.contains("<rsp stat=\"ok\">")) {
                return asString.substring(asString.indexOf("<mediaurl>") + 10, asString.indexOf("</mediaurl>"));
            } else {
                throw new TwitterException("Unknown Twipple response", this.httpResponse);
            }
        } else {
            throw new TwitterException("Twipple image upload returned invalid status code", this.httpResponse);
        }
    }

    /* access modifiers changed from: protected */
    public void preUpload() throws TwitterException {
        this.uploadUrl = "http://p.twipple.jp/api/upload";
        this.postParameter = new HttpParameter[]{new HttpParameter("verify_url", generateVerifyCredentialsAuthorizationURL("https://api.twitter.com/1.1/account/verify_credentials.json")), this.image};
    }
}
