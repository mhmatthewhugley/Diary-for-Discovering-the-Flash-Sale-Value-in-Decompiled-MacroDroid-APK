package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfap implements zzfaz {

    /* renamed from: a */
    private final zzfaz f35337a;
    @Nullable

    /* renamed from: b */
    private zzdcj f35338b;

    public zzfap(zzfaz zzfaz) {
        this.f35337a = zzfaz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo45552a(zzfba zzfba, zzfay zzfay, @Nullable Object obj) {
        return mo45570c(zzfba, zzfay, (zzdcj) null);
    }

    /* renamed from: b */
    public final synchronized zzdcj mo45555d() {
        return this.f35338b;
    }

    /* renamed from: c */
    public final synchronized zzfzp mo45570c(zzfba zzfba, zzfay zzfay, @Nullable zzdcj zzdcj) {
        this.f35338b = zzdcj;
        if (zzfba.f35348a != null) {
            zzdah zzb = zzdcj.zzb();
            return zzb.mo44530h(zzb.mo44532j(zzfzg.m51414i(zzfba.f35348a)));
        }
        return ((zzfao) this.f35337a).mo45568c(zzfba, zzfay, zzdcj);
    }
}
