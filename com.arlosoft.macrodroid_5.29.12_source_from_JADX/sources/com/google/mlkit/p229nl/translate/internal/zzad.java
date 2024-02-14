package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.internal.mlkit_translate.zzaa;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.android.gms.internal.mlkit_translate.zzz;
import com.google.mlkit.p229nl.translate.TranslateLanguage;
import java.util.Arrays;

/* renamed from: com.google.mlkit.nl.translate.internal.zzad */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzad {

    /* renamed from: a */
    private static final zzv f56473a = zzv.m62259u("merged_dict_%1$s_%2$s_update.bin", "merged_dict_%1$s_%2$s_both.bin", "merged_dict_%1$s_%2$s_from_%3$s.bin", "merged_dict_%1$s_%2$s_from_%4$s.bin");

    /* renamed from: a */
    public static zzv m79184a(String str) {
        String[] g = m79190g(str);
        String str2 = g[0];
        String str3 = g[1];
        String[] strArr = new String[f56473a.size()];
        int i = 0;
        while (true) {
            zzv zzv = f56473a;
            if (i >= zzv.size()) {
                return zzv.m62255n(strArr);
            }
            strArr[i] = String.format((String) zzv.get(i), new Object[]{str, "25", str2, str3});
            i++;
        }
    }

    /* renamed from: b */
    public static zzv m79185b(String str, String str2) {
        if (str.equals(str2)) {
            return zzv.m62256p(str);
        }
        if (str.equals("en") || str2.equals("en")) {
            return zzv.m62257q(str, str2);
        }
        return zzv.m62258t(str, "en", str2);
    }

    /* renamed from: c */
    public static zzaa m79186c(@TranslateLanguage.Language String str, @TranslateLanguage.Language String str2) {
        if (str.equals(str2)) {
            return zzaa.m61555n();
        }
        zzz zzz = new zzz();
        if (!str.equals("en")) {
            zzz.mo52517d(str);
        }
        if (!str2.equals("en")) {
            zzz.mo52517d(str2);
        }
        return zzz.mo52518e();
    }

    /* renamed from: d */
    public static String m79187d(String str) {
        return String.format("dict.%1$s_%2$s", new Object[]{str, "25"});
    }

    /* renamed from: e */
    public static String m79188e(@TranslateLanguage.Language String str) {
        return m79189f("en", TranslateLanguage.m79144b(str));
    }

    /* renamed from: f */
    public static String m79189f(String str, String str2) {
        if ((str.equals("en") || str2.equals("en")) && !str.equals(str2)) {
            String[] strArr = {str, str2};
            Arrays.sort(strArr);
            return String.format("%s_%s", new Object[]{strArr[0], strArr[1]});
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    static String[] m79190g(String str) {
        if (str.matches("[a-z]{2,3}_[a-z]{2,3}")) {
            return str.split("_", -1);
        }
        throw new IllegalArgumentException(String.format("Model name expected to be matching %s", new Object[]{"[a-z]{2,3}_[a-z]{2,3}"}));
    }
}
