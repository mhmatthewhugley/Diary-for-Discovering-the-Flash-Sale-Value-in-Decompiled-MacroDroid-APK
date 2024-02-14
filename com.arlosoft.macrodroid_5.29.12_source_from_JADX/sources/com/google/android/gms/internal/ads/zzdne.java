package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdne implements zzgxi {

    /* renamed from: a */
    private final zzgxv f32505a;

    public zzdne(zzgxv zzgxv) {
        this.f32505a = zzgxv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdnb) this.f32505a).mo44722a().mo44866e() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzgxq.m53658b(set);
        return set;
    }
}
