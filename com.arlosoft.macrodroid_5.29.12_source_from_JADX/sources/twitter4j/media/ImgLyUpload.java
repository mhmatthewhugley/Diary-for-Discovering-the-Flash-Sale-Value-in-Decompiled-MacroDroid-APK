package twitter4j.media;

import twitter4j.HttpParameter;
import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.TwitterException;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

class ImgLyUpload extends AbstractImageUploadImpl {
    public ImgLyUpload(Configuration configuration, OAuthAuthorization oAuthAuthorization) {
        super(configuration, oAuthAuthorization);
    }

    /* access modifiers changed from: protected */
    public String postUpload() throws TwitterException {
        if (this.httpResponse.getStatusCode() == 200) {
            String asString = this.httpResponse.asString();
            try {
                JSONObject jSONObject = new JSONObject(asString);
                if (!jSONObject.isNull("url")) {
                    return jSONObject.getString("url");
                }
                throw new TwitterException("Unknown ImgLy response", this.httpResponse);
            } catch (JSONException e) {
                throw new TwitterException("Invalid ImgLy response: " + asString, (Throwable) e);
            }
        } else {
            throw new TwitterException("ImgLy image upload returned invalid status code", this.httpResponse);
        }
    }

    /* access modifiers changed from: protected */
    public void preUpload() throws TwitterException {
        this.uploadUrl = "http://img.ly/api/2/upload.json";
        String generateVerifyCredentialsAuthorizationHeader = generateVerifyCredentialsAuthorizationHeader();
        this.headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1.1/account/verify_credentials.json");
        this.headers.put("X-Verify-Credentials-Authorization", generateVerifyCredentialsAuthorizationHeader);
        HttpParameter[] httpParameterArr = {this.image};
        HttpParameter httpParameter = this.message;
        if (httpParameter != null) {
            httpParameterArr = appendHttpParameters(new HttpParameter[]{httpParameter}, httpParameterArr);
        }
        this.postParameter = httpParameterArr;
    }
}
