package twitter4j.media;

import twitter4j.HttpParameter;
import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.TwitterException;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

class MobypictureUpload extends AbstractImageUploadImpl {
    public MobypictureUpload(Configuration configuration, String str, OAuthAuthorization oAuthAuthorization) {
        super(configuration, str, oAuthAuthorization);
    }

    /* access modifiers changed from: protected */
    public String postUpload() throws TwitterException {
        if (this.httpResponse.getStatusCode() == 200) {
            String asString = this.httpResponse.asString();
            try {
                JSONObject jSONObject = new JSONObject(asString);
                if (!jSONObject.isNull("media")) {
                    return jSONObject.getJSONObject("media").getString("mediaurl");
                }
                throw new TwitterException("Unknown Mobypic response", this.httpResponse);
            } catch (JSONException e) {
                throw new TwitterException("Invalid Mobypic response: " + asString, (Throwable) e);
            }
        } else {
            throw new TwitterException("Mobypic image upload returned invalid status code", this.httpResponse);
        }
    }

    /* access modifiers changed from: protected */
    public void preUpload() throws TwitterException {
        this.uploadUrl = "https://api.mobypicture.com/2.0/upload.json";
        String generateVerifyCredentialsAuthorizationHeader = generateVerifyCredentialsAuthorizationHeader();
        this.headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1.1/account/verify_credentials.json");
        this.headers.put("X-Verify-Credentials-Authorization", generateVerifyCredentialsAuthorizationHeader);
        String str = this.apiKey;
        if (str != null) {
            HttpParameter[] httpParameterArr = {new HttpParameter("key", str), this.image};
            HttpParameter httpParameter = this.message;
            if (httpParameter != null) {
                httpParameterArr = appendHttpParameters(new HttpParameter[]{httpParameter}, httpParameterArr);
            }
            this.postParameter = httpParameterArr;
            return;
        }
        throw new IllegalStateException("No API Key for Mobypic specified. put media.providerAPIKey in twitter4j.properties.");
    }
}
