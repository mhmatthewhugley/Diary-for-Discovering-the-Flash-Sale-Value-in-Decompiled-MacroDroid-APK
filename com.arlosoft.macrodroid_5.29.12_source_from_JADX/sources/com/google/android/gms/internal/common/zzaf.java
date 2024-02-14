package com.google.android.gms.internal.common;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzaf extends zzag {

    /* renamed from: d */
    final transient int f39286d;

    /* renamed from: f */
    final transient int f39287f;
    final /* synthetic */ zzag zzc;

    zzaf(zzag zzag, int i, int i2) {
        this.zzc = zzag;
        this.f39286d = i;
        this.f39287f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo48618d() {
        return this.zzc.mo48619f() + this.f39286d + this.f39287f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo48619f() {
        return this.zzc.mo48619f() + this.f39286d;
    }

    public final Object get(int i) {
        zzs.m55918a(i, this.f39287f, "index");
        return this.zzc.get(i + this.f39286d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo48623j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo48624k() {
        return this.zzc.mo48624k();
    }

    /* renamed from: l */
    public final zzag mo48632l(int i, int i2) {
        zzs.m55920c(i, i2, this.f39287f);
        zzag zzag = this.zzc;
        int i3 = this.f39286d;
        return zzag.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f39287f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
