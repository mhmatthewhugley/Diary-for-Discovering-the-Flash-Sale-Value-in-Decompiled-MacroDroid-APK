package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfrs extends zzfro {

    /* renamed from: c */
    final /* synthetic */ zzfry f36310c;

    zzfrs(zzfry zzfry) {
        this.f36310c = zzfry;
    }

    /* renamed from: a */
    public final void mo46131a() {
        zzfry zzfry = this.f36310c;
        if (zzfry.f36328m != null) {
            zzfry.f36317b.mo46143d("Unbind from service.", new Object[0]);
            zzfry zzfry2 = this.f36310c;
            zzfry2.f36316a.unbindService(zzfry2.f36327l);
            this.f36310c.f36322g = false;
            this.f36310c.f36328m = null;
            this.f36310c.f36327l = null;
        }
        this.f36310c.m50903t();
    }
}
