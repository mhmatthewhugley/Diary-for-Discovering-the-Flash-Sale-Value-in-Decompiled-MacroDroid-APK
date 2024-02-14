package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeom implements zzeou {

    /* renamed from: a */
    final /* synthetic */ zzeon f34593a;

    zzeom(zzeon zzeon) {
        this.f34593a = zzeon;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo45391c(Object obj) {
        zzdlg zzdlg = (zzdlg) obj;
        synchronized (this.f34593a) {
            this.f34593a.f34601s = zzdlg;
            this.f34593a.f34601s.mo44461b();
        }
    }

    public final void zza() {
        synchronized (this.f34593a) {
            this.f34593a.f34601s = null;
        }
    }
}
