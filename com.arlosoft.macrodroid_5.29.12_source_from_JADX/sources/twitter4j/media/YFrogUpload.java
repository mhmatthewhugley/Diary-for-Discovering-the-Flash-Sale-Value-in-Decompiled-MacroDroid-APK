package twitter4j.media;

import androidx.core.app.NotificationCompat;
import twitter4j.HttpParameter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.Authorization;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

class YFrogUpload extends AbstractImageUploadImpl {
    public YFrogUpload(Configuration configuration, OAuthAuthorization oAuthAuthorization) {
        super(configuration, oAuthAuthorization);
    }

    /* access modifiers changed from: protected */
    public String postUpload() throws TwitterException {
        if (this.httpResponse.getStatusCode() == 200) {
            String asString = this.httpResponse.asString();
            if (asString.contains("<rsp stat=\"fail\">")) {
                String substring = asString.substring(asString.indexOf(NotificationCompat.CATEGORY_MESSAGE) + 5, asString.lastIndexOf("\""));
                throw new TwitterException("YFrog image upload failed with this error message: " + substring, this.httpResponse);
            } else if (asString.contains("<rsp stat=\"ok\">")) {
                return asString.substring(asString.indexOf("<mediaurl>") + 10, asString.indexOf("</mediaurl>"));
            } else {
                throw new TwitterException("Unknown YFrog response", this.httpResponse);
            }
        } else {
            throw new TwitterException("YFrog image upload returned invalid status code", this.httpResponse);
        }
    }

    /* access modifiers changed from: protected */
    public void preUpload() throws TwitterException {
        this.uploadUrl = "https://yfrog.com/api/xauth_upload";
        String generateVerifyCredentialsAuthorizationURL = generateVerifyCredentialsAuthorizationURL("https://api.twitter.com/1.1/account/verify_credentials.xml");
        HttpParameter[] httpParameterArr = {new HttpParameter("auth", "oauth"), new HttpParameter("username", new TwitterFactory().getInstance((Authorization) this.oauth).verifyCredentials().getScreenName()), new HttpParameter("verify_url", generateVerifyCredentialsAuthorizationURL), this.image};
        HttpParameter httpParameter = this.message;
        if (httpParameter != null) {
            httpParameterArr = appendHttpParameters(new HttpParameter[]{httpParameter}, httpParameterArr);
        }
        this.postParameter = httpParameterArr;
    }
}
