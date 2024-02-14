package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzap {

    /* renamed from: a */
    private final Object f41941a;

    /* renamed from: b */
    private final Object f41942b;

    /* renamed from: c */
    private final Object f41943c;

    zzap(Object obj, Object obj2, Object obj3) {
        this.f41941a = obj;
        this.f41942b = obj2;
        this.f41943c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo51760a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f41941a + "=" + this.f41942b + " and " + this.f41941a + "=" + this.f41943c);
    }
}
