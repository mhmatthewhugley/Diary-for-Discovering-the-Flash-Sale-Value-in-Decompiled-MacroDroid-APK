package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcow implements zzgxi {

    /* renamed from: a */
    private final zzgxv f29170a;

    /* renamed from: b */
    private final zzgxv f29171b;

    public zzcow(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f29170a = zzgxv;
        this.f29171b = zzgxv2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzeew zzeew = (zzeew) this.f29170a.zzb();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26938N1)).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
                set = Collections.singleton(new zzdkg(zzeew, zzfzq));
                zzgxq.m53658b(set);
                return set;
            }
        }
        set = Collections.emptySet();
        zzgxq.m53658b(set);
        return set;
    }
}
