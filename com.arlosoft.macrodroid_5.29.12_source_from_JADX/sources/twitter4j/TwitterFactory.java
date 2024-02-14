package twitter4j;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.AuthorizationFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

public final class TwitterFactory implements Serializable {
    static final Authorization DEFAULT_AUTHORIZATION = AuthorizationFactory.getInstance(ConfigurationContext.getInstance());
    private static final Twitter SINGLETON;
    private static final Constructor<Twitter> TWITTER_CONSTRUCTOR;
    private static final long serialVersionUID = -563983536986910054L;
    private final Configuration conf;

    static {
        boolean z;
        try {
            Class.forName("com.google.appengine.api.urlfetch.URLFetchService");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        String str = null;
        if (z) {
            try {
                Class.forName("twitter4j.AppEngineTwitterImpl");
                str = "twitter4j.AppEngineTwitterImpl";
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (str == null) {
            str = "twitter4j.TwitterImpl";
        }
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[]{Configuration.class, Authorization.class});
            TWITTER_CONSTRUCTOR = declaredConstructor;
            try {
                SINGLETON = (Twitter) declaredConstructor.newInstance(new Object[]{ConfigurationContext.getInstance(), DEFAULT_AUTHORIZATION});
            } catch (InstantiationException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new AssertionError(e4);
        } catch (ClassNotFoundException e5) {
            throw new AssertionError(e5);
        }
    }

    public TwitterFactory() {
        this(ConfigurationContext.getInstance());
    }

    public static Twitter getSingleton() {
        return SINGLETON;
    }

    public Twitter getInstance() {
        return getInstance(AuthorizationFactory.getInstance(this.conf));
    }

    public TwitterFactory(Configuration configuration) {
        Objects.requireNonNull(configuration, "configuration cannot be null");
        this.conf = configuration;
    }

    public Twitter getInstance(AccessToken accessToken) {
        String oAuthConsumerKey = this.conf.getOAuthConsumerKey();
        String oAuthConsumerSecret = this.conf.getOAuthConsumerSecret();
        if (oAuthConsumerKey == null && oAuthConsumerSecret == null) {
            throw new IllegalStateException("Consumer key and Consumer secret not supplied.");
        }
        OAuthAuthorization oAuthAuthorization = new OAuthAuthorization(this.conf);
        oAuthAuthorization.setOAuthAccessToken(accessToken);
        return getInstance((Authorization) oAuthAuthorization);
    }

    public TwitterFactory(String str) {
        this(ConfigurationContext.getInstance(str));
    }

    public Twitter getInstance(Authorization authorization) {
        try {
            return TWITTER_CONSTRUCTOR.newInstance(new Object[]{this.conf, authorization});
        } catch (InstantiationException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }
}
