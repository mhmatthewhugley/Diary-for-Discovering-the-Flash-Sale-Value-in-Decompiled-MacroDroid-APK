package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxr {
    /* renamed from: a */
    public static String m58409a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m58410b(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m58410b(sb, locale2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static void m58410b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                sb.append(country);
            }
        }
    }
}
