package twitter4j.media;

import twitter4j.auth.Authorization;
import twitter4j.auth.AuthorizationFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

public class ImageUploadFactory {
    private final String apiKey;
    private final Configuration conf;
    private final MediaProvider defaultMediaProvider;

    public ImageUploadFactory() {
        this(ConfigurationContext.getInstance());
    }

    public ImageUpload getInstance() {
        return getInstance(this.defaultMediaProvider);
    }

    public ImageUploadFactory(Configuration configuration) {
        String lowerCase = configuration.getMediaProvider().toLowerCase();
        if ("twitter".equals(lowerCase)) {
            this.defaultMediaProvider = MediaProvider.TWITTER;
        } else if ("imgly".equals(lowerCase) || "img_ly".equals(lowerCase)) {
            this.defaultMediaProvider = MediaProvider.IMG_LY;
        } else if ("twipple".equals(lowerCase)) {
            this.defaultMediaProvider = MediaProvider.TWIPPLE;
        } else if ("yfrog".equals(lowerCase)) {
            this.defaultMediaProvider = MediaProvider.YFROG;
        } else if ("mobypicture".equals(lowerCase)) {
            this.defaultMediaProvider = MediaProvider.MOBYPICTURE;
        } else {
            throw new IllegalArgumentException("unsupported media provider:" + lowerCase);
        }
        this.conf = configuration;
        this.apiKey = configuration.getMediaProviderAPIKey();
    }

    public ImageUpload getInstance(Authorization authorization) {
        return getInstance(this.defaultMediaProvider, authorization);
    }

    public ImageUpload getInstance(MediaProvider mediaProvider) {
        return getInstance(mediaProvider, AuthorizationFactory.getInstance(this.conf));
    }

    public ImageUpload getInstance(MediaProvider mediaProvider, Authorization authorization) {
        if (authorization instanceof OAuthAuthorization) {
            OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) authorization;
            if (mediaProvider == MediaProvider.TWITTER) {
                return new TwitterUpload(this.conf, oAuthAuthorization);
            }
            if (mediaProvider == MediaProvider.IMG_LY) {
                return new ImgLyUpload(this.conf, oAuthAuthorization);
            }
            if (mediaProvider == MediaProvider.TWIPPLE) {
                return new TwippleUpload(this.conf, oAuthAuthorization);
            }
            if (mediaProvider == MediaProvider.YFROG) {
                return new YFrogUpload(this.conf, oAuthAuthorization);
            }
            if (mediaProvider == MediaProvider.MOBYPICTURE) {
                return new MobypictureUpload(this.conf, this.apiKey, oAuthAuthorization);
            }
            throw new AssertionError("Unknown provider");
        }
        throw new IllegalArgumentException("OAuth authorization is required.");
    }
}
