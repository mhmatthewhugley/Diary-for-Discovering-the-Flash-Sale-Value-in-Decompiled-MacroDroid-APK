package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzw {

    /* renamed from: a */
    private final Object f44518a;

    /* renamed from: b */
    private final Object f44519b;

    /* renamed from: c */
    private final Object f44520c;

    zzw(Object obj, Object obj2, Object obj3) {
        this.f44518a = obj;
        this.f44519b = obj2;
        this.f44520c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo52498a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f44518a + "=" + this.f44519b + " and " + this.f44518a + "=" + this.f44520c);
    }
}
