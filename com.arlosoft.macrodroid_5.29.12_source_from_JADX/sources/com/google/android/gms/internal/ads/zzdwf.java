package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdwf implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33258a;

    /* renamed from: b */
    private final zzgxv f33259b;

    public zzdwf(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f33258a = zzgxv;
        this.f33259b = zzgxv2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        zzdwx a = ((zzdwy) this.f33259b).zzb();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27066a4)).booleanValue()) {
            set = Collections.singleton(new zzdkg(a, zzfzq));
        } else {
            set = Collections.emptySet();
        }
        zzgxq.m53658b(set);
        return set;
    }
}
