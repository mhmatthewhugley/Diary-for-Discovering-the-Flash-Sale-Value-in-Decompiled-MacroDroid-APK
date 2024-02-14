package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfao implements zzfaz {
    @Nullable

    /* renamed from: a */
    private zzdcj f35336a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo45552a(zzfba zzfba, zzfay zzfay, @Nullable Object obj) {
        return mo45568c(zzfba, zzfay, (zzdcj) null);
    }

    /* renamed from: b */
    public final synchronized zzdcj mo45555d() {
        return this.f35336a;
    }

    /* renamed from: c */
    public final synchronized zzfzp mo45568c(zzfba zzfba, zzfay zzfay, @Nullable zzdcj zzdcj) {
        zzdah zzb;
        if (zzdcj != null) {
            this.f35336a = zzdcj;
        } else {
            this.f35336a = (zzdcj) zzfay.mo45519a(zzfba.f35349b).mo44238e();
        }
        zzb = this.f35336a.zzb();
        return zzb.mo44530h(zzb.mo44531i());
    }
}
