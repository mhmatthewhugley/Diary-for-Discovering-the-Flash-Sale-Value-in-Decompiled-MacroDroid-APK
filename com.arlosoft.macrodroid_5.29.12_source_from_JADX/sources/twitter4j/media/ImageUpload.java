package twitter4j.media;

import java.io.File;
import java.io.InputStream;
import twitter4j.TwitterException;

public interface ImageUpload {
    String upload(File file) throws TwitterException;

    String upload(File file, String str) throws TwitterException;

    String upload(String str, InputStream inputStream) throws TwitterException;

    String upload(String str, InputStream inputStream, String str2) throws TwitterException;
}
