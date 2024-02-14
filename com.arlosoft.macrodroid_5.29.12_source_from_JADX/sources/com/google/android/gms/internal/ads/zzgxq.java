package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxq {
    /* renamed from: a */
    public static Object m53657a(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: b */
    public static Object m53658b(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    /* renamed from: c */
    public static void m53659c(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
