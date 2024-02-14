package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
final class zzo extends zzp {

    /* renamed from: d */
    final transient int f45485d;

    /* renamed from: f */
    final transient int f45486f;
    final /* synthetic */ zzp zzc;

    zzo(zzp zzp, int i, int i2) {
        this.zzc = zzp;
        this.f45485d = i;
        this.f45486f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo53708d() {
        return this.zzc.mo53709f() + this.f45485d + this.f45486f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo53709f() {
        return this.zzc.mo53709f() + this.f45485d;
    }

    public final Object get(int i) {
        zzj.m63926a(i, this.f45486f, "index");
        return this.zzc.get(i + this.f45485d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo53711i() {
        return this.zzc.mo53711i();
    }

    /* renamed from: j */
    public final zzp mo53719j(int i, int i2) {
        zzj.m63928c(i, i2, this.f45486f);
        zzp zzp = this.zzc;
        int i3 = this.f45485d;
        return zzp.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f45486f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
