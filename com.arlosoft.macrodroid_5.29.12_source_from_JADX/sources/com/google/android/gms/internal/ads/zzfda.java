package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfda implements zzeou {

    /* renamed from: a */
    final /* synthetic */ zzfdb f35463a;

    zzfda(zzfdb zzfdb) {
        this.f35463a = zzfdb;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo45391c(Object obj) {
        zzduc zzduc = (zzduc) obj;
        synchronized (this.f35463a) {
            this.f35463a.f35470p = zzduc;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26899J2)).booleanValue()) {
                zzduc.mo44990j().f35593a = this.f35463a.f35467f;
            }
            this.f35463a.f35470p.mo44461b();
        }
    }

    public final void zza() {
        synchronized (this.f35463a) {
            this.f35463a.f35470p = null;
        }
    }
}
