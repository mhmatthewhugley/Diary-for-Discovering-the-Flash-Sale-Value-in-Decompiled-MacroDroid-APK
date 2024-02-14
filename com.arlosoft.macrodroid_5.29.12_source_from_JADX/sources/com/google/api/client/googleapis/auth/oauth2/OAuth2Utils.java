package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.Beta;
import java.nio.charset.Charset;
import java.util.logging.Logger;

@Beta
public class OAuth2Utils {

    /* renamed from: a */
    static final Charset f52263a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Logger f52264b = Logger.getLogger(OAuth2Utils.class.getName());

    /* renamed from: a */
    public static String m71811a() {
        return m71812b(SystemEnvironmentProvider.f52265a);
    }

    /* renamed from: b */
    static String m71812b(SystemEnvironmentProvider systemEnvironmentProvider) {
        String a = systemEnvironmentProvider.mo60253a("GCE_METADATA_HOST");
        if (a != null) {
            return a.length() != 0 ? "http://".concat(a) : new String("http://");
        }
        return "http://169.254.169.254";
    }
}
