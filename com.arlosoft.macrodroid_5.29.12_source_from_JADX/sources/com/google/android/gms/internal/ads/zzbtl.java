package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbtl implements zzchl {

    /* renamed from: a */
    final /* synthetic */ zzbtv f27747a;

    /* renamed from: b */
    final /* synthetic */ zzfjj f27748b;

    /* renamed from: c */
    final /* synthetic */ zzbtw f27749c;

    zzbtl(zzbtw zzbtw, zzbtv zzbtv, zzfjj zzfjj) {
        this.f27749c = zzbtw;
        this.f27747a = zzbtv;
        this.f27748b = zzfjj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42976a(Object obj) {
        zzbsr zzbsr = (zzbsr) obj;
        synchronized (this.f27749c.f27767a) {
            this.f27749c.f27775i = 0;
            zzbtw zzbtw = this.f27749c;
            if (!(zzbtw.f27774h == null || this.f27747a == zzbtw.f27774h)) {
                zze.m2645k("New JS engine is loaded, marking previous one as destroyable.");
                this.f27749c.f27774h.mo42986g();
            }
            this.f27749c.f27774h = this.f27747a;
            if (((Boolean) zzbkl.f27409d.mo42728e()).booleanValue()) {
                zzbtw zzbtw2 = this.f27749c;
                if (zzbtw2.f27771e != null) {
                    zzfjw e = zzbtw2.f27771e;
                    zzfjj zzfjj = this.f27748b;
                    zzfjj.mo45801o0(true);
                    e.mo45831b(zzfjj.mo45799h());
                }
            }
        }
    }
}
