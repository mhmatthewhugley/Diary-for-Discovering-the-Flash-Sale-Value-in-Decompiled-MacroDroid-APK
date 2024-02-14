package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzezn implements zzeou {

    /* renamed from: a */
    final /* synthetic */ zzezo f35250a;

    zzezn(zzezo zzezo) {
        this.f35250a = zzezo;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo45391c(Object obj) {
        zzcwv zzcwv = (zzcwv) obj;
        synchronized (this.f35250a) {
            zzcwv zzcwv2 = this.f35250a.f35251A;
            if (zzcwv2 != null) {
                zzcwv2.mo44439a();
            }
            zzezo zzezo = this.f35250a;
            zzezo.f35251A = zzcwv;
            zzcwv.mo44441i(zzezo);
            zzezo zzezo2 = this.f35250a;
            zzezo2.f35257o.mo45525g(new zzcww(zzcwv, zzezo2, zzezo2.f35257o));
            zzcwv.mo44461b();
        }
    }

    public final void zza() {
        synchronized (this.f35250a) {
            this.f35250a.f35251A = null;
        }
    }
}
