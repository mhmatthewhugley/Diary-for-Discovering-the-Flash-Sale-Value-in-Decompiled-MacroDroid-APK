package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvq implements zzgxi {

    /* renamed from: a */
    private final zzgxv f31691a;

    /* renamed from: b */
    private final zzgxv f31692b;

    /* renamed from: c */
    private final zzgxv f31693c;

    public zzcvq(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3) {
        this.f31691a = zzgxv;
        this.f31692b = zzgxv2;
        this.f31693c = zzgxv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcvk zzcvk = (zzcvk) this.f31691a.zzb();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        if (((JSONObject) this.f31693c.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzdkg(zzcvk, zzfzq));
        }
        zzgxq.m53658b(set);
        return set;
    }
}
