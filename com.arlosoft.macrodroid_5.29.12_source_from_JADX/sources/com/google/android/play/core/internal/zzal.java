package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzal extends zzah {

    /* renamed from: c */
    final /* synthetic */ zzas f51666c;

    zzal(zzas zzas) {
        this.f51666c = zzas;
    }

    /* renamed from: a */
    public final void mo59556a() {
        zzas zzas = this.f51666c;
        if (zzas.f51685n != null) {
            zzas.f51673b.mo59808d("Unbind from service.", new Object[0]);
            zzas zzas2 = this.f51666c;
            zzas2.f51672a.unbindService(zzas2.f51684m);
            this.f51666c.f51678g = false;
            this.f51666c.f51685n = null;
            this.f51666c.f51684m = null;
        }
        this.f51666c.m70823u();
    }
}
