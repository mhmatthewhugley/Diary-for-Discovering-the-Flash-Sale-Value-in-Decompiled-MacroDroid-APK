package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzega implements zzfii {

    /* renamed from: a */
    private final zzefo f33932a;

    /* renamed from: c */
    private final zzefs f33933c;

    zzega(zzefo zzefo, zzefs zzefs) {
        this.f33932a = zzefo;
        this.f33933c = zzefs;
    }

    /* renamed from: a */
    public final void mo45028a(zzfib zzfib, String str) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue()) {
            if (zzfib.RENDERER == zzfib) {
                this.f33932a.mo45264g(zzt.m2889b().mo21952c());
            } else if (zzfib.PRELOADED_LOADER == zzfib || zzfib.SERVER_TRANSACTION == zzfib) {
                this.f33932a.mo45265h(zzt.m2889b().mo21952c());
                zzefs zzefs = this.f33933c;
                zzefs.f33926b.mo45256a(new zzefr(zzefs, this.f33932a.mo45261d()));
            }
        }
    }

    /* renamed from: b */
    public final void mo45029b(zzfib zzfib, String str) {
    }

    /* renamed from: c */
    public final void mo45030c(zzfib zzfib, String str) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue() && zzfib.RENDERER == zzfib && this.f33932a.mo45260c() != 0) {
            this.f33932a.mo45263f(zzt.m2889b().mo21952c() - this.f33932a.mo45260c());
        }
    }

    /* renamed from: e */
    public final void mo45031e(zzfib zzfib, String str, Throwable th) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue() && zzfib.RENDERER == zzfib && this.f33932a.mo45260c() != 0) {
            this.f33932a.mo45263f(zzt.m2889b().mo21952c() - this.f33932a.mo45260c());
        }
    }
}
