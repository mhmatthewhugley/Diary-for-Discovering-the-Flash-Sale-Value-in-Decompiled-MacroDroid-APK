package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfis implements zzgxi {

    /* renamed from: a */
    private final zzgxv f35851a;

    /* renamed from: b */
    private final zzgxv f35852b;

    /* renamed from: c */
    private final zzgxv f35853c;

    public zzfis(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3) {
        this.f35851a = zzgxv;
        this.f35852b = zzgxv2;
        this.f35853c = zzgxv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgxc a = zzgxh.m53645a(this.f35851a);
        zzgxc a2 = zzgxh.m53645a(this.f35852b);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f35853c.zzb();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27259t7)).booleanValue()) {
            obj = new zzfiu((zzfir) a.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfir) a2.zzb();
        }
        zzgxq.m53658b(obj);
        return obj;
    }
}
