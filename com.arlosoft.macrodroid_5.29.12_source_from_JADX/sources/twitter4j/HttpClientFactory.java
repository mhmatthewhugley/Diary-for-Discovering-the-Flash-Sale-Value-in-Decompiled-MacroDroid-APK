package twitter4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import twitter4j.conf.ConfigurationContext;

public final class HttpClientFactory {
    private static final Constructor<?> HTTP_CLIENT_CONSTRUCTOR;
    private static final String HTTP_CLIENT_IMPLEMENTATION = "twitter4j.http.httpClient";
    private static final HashMap<HttpClientConfiguration, HttpClient> confClientMap = new HashMap<>();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    static {
        /*
            java.lang.String r0 = "twitter4j.http.httpClient"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "twitter4j.AlternativeHttpClientImpl"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
        L_0x0018:
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "twitter4j.HttpClientImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0028:
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x003e }
            r2 = 0
            java.lang.Class<twitter4j.HttpClientConfiguration> r3 = twitter4j.HttpClientConfiguration.class
            r1[r2] = r3     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x003e }
            HTTP_CLIENT_CONSTRUCTOR = r0     // Catch:{ NoSuchMethodException -> 0x003e }
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            confClientMap = r0
            return
        L_0x003e:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.HttpClientFactory.<clinit>():void");
    }

    public static HttpClient getInstance() {
        return getInstance(ConfigurationContext.getInstance().getHttpClientConfiguration());
    }

    public static HttpClient getInstance(HttpClientConfiguration httpClientConfiguration) {
        HashMap<HttpClientConfiguration, HttpClient> hashMap = confClientMap;
        HttpClient httpClient = hashMap.get(httpClientConfiguration);
        if (httpClient != null) {
            return httpClient;
        }
        try {
            HttpClient httpClient2 = (HttpClient) HTTP_CLIENT_CONSTRUCTOR.newInstance(new Object[]{httpClientConfiguration});
            hashMap.put(httpClientConfiguration, httpClient2);
            return httpClient2;
        } catch (InstantiationException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }
}
