package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzdch;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzfih;
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzgxv;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzai implements zzgxi {

    /* renamed from: a */
    private final zzgxv f2517a;

    /* renamed from: b */
    private final zzgxv f2518b;

    /* renamed from: c */
    private final zzgxv f2519c;

    public zzai(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3) {
        this.f2517a = zzgxv;
        this.f2518b = zzgxv2;
        this.f2519c = zzgxv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfih) this.f2517a.zzb()).mo45752b(zzfib.GENERATE_SIGNALS, ((zzdch) this.f2519c).zzb().mo44552c()).mo45747f(((zzal) this.f2518b).zzb()).mo45750i((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26851E4)).intValue(), TimeUnit.SECONDS).mo45742a();
    }
}
