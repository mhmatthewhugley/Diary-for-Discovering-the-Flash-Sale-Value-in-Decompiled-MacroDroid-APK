package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgoy {
    /* renamed from: a */
    public static int m52492a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m52493b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
