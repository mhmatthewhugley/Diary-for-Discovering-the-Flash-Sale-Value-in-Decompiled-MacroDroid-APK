package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvr implements zzgxi {

    /* renamed from: a */
    private final zzgxv f31694a;

    /* renamed from: b */
    private final zzgxv f31695b;

    /* renamed from: c */
    private final zzgxv f31696c;

    public zzcvr(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3) {
        this.f31694a = zzgxv;
        this.f31695b = zzgxv2;
        this.f31696c = zzgxv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcvk zzcvk = (zzcvk) this.f31694a.zzb();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        if (((JSONObject) this.f31696c.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzdkg(zzcvk, zzfzq));
        }
        zzgxq.m53658b(set);
        return set;
    }
}
