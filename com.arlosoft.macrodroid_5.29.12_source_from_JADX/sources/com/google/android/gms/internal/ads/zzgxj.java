package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxj implements zzgxi, zzgxc {

    /* renamed from: b */
    private static final zzgxj f37416b = new zzgxj((Object) null);

    /* renamed from: a */
    private final Object f37417a;

    private zzgxj(Object obj) {
        this.f37417a = obj;
    }

    /* renamed from: a */
    public static zzgxi m53647a(Object obj) {
        zzgxq.m53657a(obj, "instance cannot be null");
        return new zzgxj(obj);
    }

    /* renamed from: b */
    public static zzgxi m53648b(Object obj) {
        return obj == null ? f37416b : new zzgxj(obj);
    }

    public final Object zzb() {
        return this.f37417a;
    }
}
