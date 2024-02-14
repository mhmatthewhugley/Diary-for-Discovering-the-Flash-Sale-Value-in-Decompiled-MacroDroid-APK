package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzah extends zzv {

    /* renamed from: d */
    private final transient Object[] f43095d;

    /* renamed from: f */
    private final transient int f43096f;

    /* renamed from: g */
    private final transient int f43097g;

    zzah(Object[] objArr, int i, int i2) {
        this.f43095d = objArr;
        this.f43096f = i;
        this.f43097g = i2;
    }

    public final Object get(int i) {
        zzj.m61888a(i, this.f43097g, "index");
        Object obj = this.f43095d[i + i + this.f43096f];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f43097g;
    }
}
