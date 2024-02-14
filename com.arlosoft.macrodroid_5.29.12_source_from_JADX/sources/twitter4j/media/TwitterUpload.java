package twitter4j.media;

import java.io.File;
import java.io.InputStream;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.Authorization;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

class TwitterUpload implements ImageUpload {
    private final Twitter twitter;

    public TwitterUpload(Configuration configuration, OAuthAuthorization oAuthAuthorization) {
        this.twitter = new TwitterFactory(configuration).getInstance((Authorization) oAuthAuthorization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Twitter twitter2 = this.twitter;
        Twitter twitter3 = ((TwitterUpload) obj).twitter;
        return twitter2 == null ? twitter3 == null : twitter2.equals(twitter3);
    }

    public int hashCode() {
        Twitter twitter2 = this.twitter;
        if (twitter2 != null) {
            return twitter2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TwitterUpload{twitter=" + this.twitter + '}';
    }

    public String upload(File file, String str) throws TwitterException {
        return this.twitter.updateStatus(new StatusUpdate(str).media(file)).getText();
    }

    public String upload(File file) throws TwitterException {
        return this.twitter.updateStatus(new StatusUpdate("").media(file)).getText();
    }

    public String upload(String str, InputStream inputStream) throws TwitterException {
        return this.twitter.updateStatus(new StatusUpdate("").media(str, inputStream)).getText();
    }

    public String upload(String str, InputStream inputStream, String str2) throws TwitterException {
        return this.twitter.updateStatus(new StatusUpdate(str2).media(str, inputStream)).getText();
    }
}
