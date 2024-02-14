package com.google.android.gms.internal.mlkit_translate;

import java.util.List;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzu extends zzv {

    /* renamed from: d */
    final transient int f44515d;

    /* renamed from: f */
    final transient int f44516f;
    final /* synthetic */ zzv zzc;

    zzu(zzv zzv, int i, int i2) {
        this.zzc = zzv;
        this.f44515d = i;
        this.f44516f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo52032d() {
        return this.zzc.mo52033f() + this.f44515d + this.f44516f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo52033f() {
        return this.zzc.mo52033f() + this.f44515d;
    }

    public final Object get(int i) {
        zzj.m61888a(i, this.f44516f, "index");
        return this.zzc.get(i + this.f44515d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo52035i() {
        return this.zzc.mo52035i();
    }

    /* renamed from: j */
    public final zzv mo52484j(int i, int i2) {
        zzj.m61892e(i, i2, this.f44516f);
        zzv zzv = this.zzc;
        int i3 = this.f44515d;
        return zzv.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f44516f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
