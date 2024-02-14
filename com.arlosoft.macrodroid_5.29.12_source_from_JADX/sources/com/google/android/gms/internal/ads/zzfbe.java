package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfbe implements zzgxi {

    /* renamed from: a */
    private final zzgxv f35356a;

    /* renamed from: b */
    private final zzgxv f35357b;

    /* renamed from: c */
    private final zzgxv f35358c;

    public zzfbe(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3) {
        this.f35356a = zzgxv;
        this.f35357b = zzgxv2;
        this.f35358c = zzgxv3;
    }

    /* renamed from: a */
    public final zzfaz zzb() {
        zzcfs zzcfs;
        Context context = (Context) this.f35356a.zzb();
        zzffm zzffm = (zzffm) this.f35357b.zzb();
        zzfge zzfge = (zzfge) this.f35358c.zzb();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27267u5)).booleanValue()) {
            zzcfs = zzt.m2904q().mo43494h().mo20365e();
        } else {
            zzcfs = zzt.m2904q().mo43494h().mo20369g();
        }
        boolean z = false;
        if (zzcfs != null && zzcfs.mo43483h()) {
            z = true;
        }
        if (((Integer) zzay.m1924c().mo42663b(zzbjc.f27287w5)).intValue() > 0) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27257t5)).booleanValue() || z) {
                zzfgd a = zzfge.mo45711a(zzffu.Rewarded, context, zzffm, new zzfad(new zzfaa()));
                zzfap zzfap = new zzfap(new zzfao());
                zzffq zzffq = a.f35735a;
                zzfzq zzfzq = zzchc.f28456a;
                return new zzfaf(zzfap, new zzfal(zzffq, zzfzq), a.f35736b, a.f35735a.zza().f35726s, zzfzq);
            }
        }
        return new zzfao();
    }
}
