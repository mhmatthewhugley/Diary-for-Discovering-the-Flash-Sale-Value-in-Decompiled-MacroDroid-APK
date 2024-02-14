package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfvo {

    /* renamed from: a */
    private final Object f36474a;

    /* renamed from: b */
    private final Object f36475b;

    /* renamed from: c */
    private final Object f36476c;

    zzfvo(Object obj, Object obj2, Object obj3) {
        this.f36474a = obj;
        this.f36475b = obj2;
        this.f36476c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo46446a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f36474a + "=" + this.f36475b + " and " + this.f36474a + "=" + this.f36476c);
    }
}
