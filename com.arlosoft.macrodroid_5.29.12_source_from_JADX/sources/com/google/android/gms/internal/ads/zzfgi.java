package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfgi implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzfgl f35740a;

    /* renamed from: b */
    final /* synthetic */ zzfgm f35741b;

    zzfgi(zzfgm zzfgm, zzfgl zzfgl) {
        this.f35741b = zzfgm;
        this.f35740a = zzfgl;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        synchronized (this.f35741b) {
            this.f35741b.f35748e = null;
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f35741b) {
            this.f35741b.f35748e = null;
            this.f35741b.f35747d.addFirst(this.f35740a);
            zzfgm zzfgm = this.f35741b;
            if (zzfgm.f35749f == 1) {
                zzfgm.m50137h();
            }
        }
    }
}
