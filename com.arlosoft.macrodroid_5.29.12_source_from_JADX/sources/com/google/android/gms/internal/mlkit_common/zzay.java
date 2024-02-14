package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzay extends zzao {

    /* renamed from: d */
    private final transient Object[] f41959d;

    /* renamed from: f */
    private final transient int f41960f;

    /* renamed from: g */
    private final transient int f41961g;

    zzay(Object[] objArr, int i, int i2) {
        this.f41959d = objArr;
        this.f41960f = i;
        this.f41961g = i2;
    }

    public final Object get(int i) {
        zzac.m61133a(i, this.f41961g, "index");
        Object obj = this.f41959d[i + i + this.f41960f];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f41961g;
    }
}
