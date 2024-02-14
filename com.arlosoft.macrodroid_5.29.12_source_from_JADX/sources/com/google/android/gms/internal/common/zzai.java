package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzai extends zzag {

    /* renamed from: g */
    static final zzag f39289g = new zzai(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f39290d;

    /* renamed from: f */
    private final transient int f39291f;

    zzai(Object[] objArr, int i) {
        this.f39290d = objArr;
        this.f39291f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo48616c(Object[] objArr, int i) {
        System.arraycopy(this.f39290d, 0, objArr, 0, this.f39291f);
        return this.f39291f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo48618d() {
        return this.f39291f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo48619f() {
        return 0;
    }

    public final Object get(int i) {
        zzs.m55918a(i, this.f39291f, "index");
        Object obj = this.f39290d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo48623j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo48624k() {
        return this.f39290d;
    }

    public final int size() {
        return this.f39291f;
    }
}
