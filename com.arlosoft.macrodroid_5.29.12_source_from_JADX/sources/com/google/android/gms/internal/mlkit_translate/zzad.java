package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzad extends zzv {

    /* renamed from: g */
    static final zzv f43087g = new zzad(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f43088d;

    /* renamed from: f */
    private final transient int f43089f;

    zzad(Object[] objArr, int i) {
        this.f43088d = objArr;
        this.f43089f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo52031c(Object[] objArr, int i) {
        System.arraycopy(this.f43088d, 0, objArr, 0, this.f43089f);
        return this.f43089f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo52032d() {
        return this.f43089f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo52033f() {
        return 0;
    }

    public final Object get(int i) {
        zzj.m61888a(i, this.f43089f, "index");
        Object obj = this.f43088d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo52035i() {
        return this.f43088d;
    }

    public final int size() {
        return this.f43089f;
    }
}
