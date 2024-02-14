package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbpl implements zzbpu {
    zzbpl() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        if (zzcmp.mo44075u0() != null) {
            zzcmp.mo44075u0().zza();
        }
        zzl M = zzcmp.mo44020M();
        if (M != null) {
            M.zzb();
            return;
        }
        zzl a0 = zzcmp.mo44039a0();
        if (a0 != null) {
            a0.zzb();
        } else {
            zzcgp.m45229g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
