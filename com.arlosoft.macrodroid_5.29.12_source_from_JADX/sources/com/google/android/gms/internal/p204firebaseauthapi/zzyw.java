package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyw {
    @Nullable
    /* renamed from: a */
    public static String m58509a(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
