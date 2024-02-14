package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzenl implements zzeou {

    /* renamed from: a */
    final /* synthetic */ zzenm f34550a;

    zzenl(zzenm zzenm) {
        this.f34550a = zzenm;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo45391c(Object obj) {
        zzcxc zzcxc = (zzcxc) obj;
        synchronized (this.f34550a) {
            zzenm zzenm = this.f34550a;
            if (zzenm.f34558s != null) {
                zzenm.f34558s.mo44439a();
            }
            this.f34550a.f34558s = zzcxc;
            this.f34550a.f34558s.mo44461b();
        }
    }

    public final void zza() {
        synchronized (this.f34550a) {
            this.f34550a.f34558s = null;
        }
    }
}
