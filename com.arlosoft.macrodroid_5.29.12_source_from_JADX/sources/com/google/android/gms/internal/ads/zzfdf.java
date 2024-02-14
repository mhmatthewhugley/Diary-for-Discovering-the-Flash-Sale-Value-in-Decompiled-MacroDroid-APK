package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfdf implements zzeou {

    /* renamed from: a */
    final /* synthetic */ zzfdh f35478a;

    zzfdf(zzfdh zzfdh) {
        this.f35478a = zzfdh;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo45391c(Object obj) {
        zzduc zzduc = (zzduc) obj;
        synchronized (this.f35478a) {
            this.f35478a.f35484f = zzduc;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26899J2)).booleanValue()) {
                zzduc.mo44990j().f35593a = this.f35478a.f35483d;
            }
            this.f35478a.f35484f.mo44461b();
        }
    }

    public final void zza() {
        synchronized (this.f35478a) {
            this.f35478a.f35484f = null;
        }
    }
}
