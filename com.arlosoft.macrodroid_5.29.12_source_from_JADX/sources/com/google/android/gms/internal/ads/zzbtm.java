package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbtm implements zzchj {

    /* renamed from: a */
    final /* synthetic */ zzbtv f27750a;

    /* renamed from: b */
    final /* synthetic */ zzfjj f27751b;

    /* renamed from: c */
    final /* synthetic */ zzbtw f27752c;

    zzbtm(zzbtw zzbtw, zzbtv zzbtv, zzfjj zzfjj) {
        this.f27752c = zzbtw;
        this.f27750a = zzbtv;
        this.f27751b = zzfjj;
    }

    public final void zza() {
        synchronized (this.f27752c.f27767a) {
            this.f27752c.f27775i = 1;
            zze.m2645k("Failed loading new engine. Marking new engine destroyable.");
            this.f27750a.mo42986g();
            if (((Boolean) zzbkl.f27409d.mo42728e()).booleanValue()) {
                zzbtw zzbtw = this.f27752c;
                if (zzbtw.f27771e != null) {
                    zzfjw e = zzbtw.f27771e;
                    zzfjj zzfjj = this.f27751b;
                    zzfjj.mo45801o0(false);
                    e.mo45831b(zzfjj.mo45799h());
                }
            }
        }
    }
}
