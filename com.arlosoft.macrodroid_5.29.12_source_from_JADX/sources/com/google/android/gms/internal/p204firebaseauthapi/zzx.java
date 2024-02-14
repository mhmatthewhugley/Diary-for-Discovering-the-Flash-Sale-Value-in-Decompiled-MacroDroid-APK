package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzx {

    /* renamed from: a */
    private static final Logger f40575a = Logger.getLogger(zzx.class.getName());

    /* renamed from: b */
    private static final zzw f40576b = new zzw((zzv) null);

    private zzx() {
    }

    /* renamed from: a */
    static zzq m58308a(String str) {
        return new zzt(Pattern.compile("[.-]"));
    }

    /* renamed from: b */
    static String m58309b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    static boolean m58310c(String str) {
        return str == null || str.isEmpty();
    }
}
