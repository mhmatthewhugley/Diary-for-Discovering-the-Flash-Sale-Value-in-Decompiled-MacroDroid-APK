package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfbb {
    /* renamed from: a */
    static zzfaz m49809a(Context context, zzffm zzffm, zzfge zzfge) {
        return m49811c(context, zzffm, zzfge);
    }

    /* renamed from: b */
    static zzfaz m49810b(Context context, zzffm zzffm, zzfge zzfge) {
        return m49811c(context, zzffm, zzfge);
    }

    /* renamed from: c */
    private static zzfaz m49811c(Context context, zzffm zzffm, zzfge zzfge) {
        zzcfs zzcfs;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27267u5)).booleanValue()) {
            zzcfs = zzt.m2904q().mo43494h().mo20365e();
        } else {
            zzcfs = zzt.m2904q().mo43494h().mo20369g();
        }
        boolean z = false;
        if (zzcfs != null && zzcfs.mo43483h()) {
            z = true;
        }
        if (((Integer) zzay.m1924c().mo42663b(zzbjc.f26912K5)).intValue() > 0) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27257t5)).booleanValue() || z) {
                zzfgd a = zzfge.mo45711a(zzffu.AppOpen, context, zzffm, new zzfad(new zzfaa()));
                zzfap zzfap = new zzfap(new zzfao());
                zzffq zzffq = a.f35735a;
                zzfzq zzfzq = zzchc.f28456a;
                return new zzfaf(zzfap, new zzfal(zzffq, zzfzq), a.f35736b, a.f35735a.zza().f35726s, zzfzq);
            }
        }
        return new zzfao();
    }
}
