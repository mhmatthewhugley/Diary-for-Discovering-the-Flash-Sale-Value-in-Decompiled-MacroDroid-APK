package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdwu implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33272a;

    /* renamed from: b */
    private final zzgxv f33273b;

    /* renamed from: c */
    private final zzgxv f33274c;

    /* renamed from: d */
    private final zzgxv f33275d;

    public zzdwu(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f33272a = zzgxv;
        this.f33273b = zzgxv2;
        this.f33274c = zzgxv3;
        this.f33275d = zzgxv4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String a = ((zzexn) this.f33272a).mo45510a();
        Context a2 = ((zzcos) this.f33273b).mo44226a();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        Map c = ((zzgxm) this.f33275d).zzb();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27066a4)).booleanValue()) {
            zzbep zzbep = new zzbep(new zzbev(a2));
            zzbep.mo42550b(new zzdwv(a));
            set = Collections.singleton(new zzdkg(new zzdwx(zzbep, c), zzfzq));
        } else {
            set = Collections.emptySet();
        }
        zzgxq.m53658b(set);
        return set;
    }
}
