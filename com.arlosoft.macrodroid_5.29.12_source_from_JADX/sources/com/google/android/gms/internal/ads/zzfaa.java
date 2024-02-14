package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfaa implements zzfaz {

    /* renamed from: a */
    private zzdcj f35305a;

    /* renamed from: b */
    private final Executor f35306b = zzfzw.m51438b();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo45552a(zzfba zzfba, zzfay zzfay, @Nullable Object obj) {
        return mo45554c(zzfba, zzfay, (zzdcj) null);
    }

    /* renamed from: b */
    public final zzdcj mo45553b() {
        return this.f35305a;
    }

    /* renamed from: c */
    public final zzfzp mo45554c(zzfba zzfba, zzfay zzfay, @Nullable zzdcj zzdcj) {
        zzdci a = zzfay.mo45519a(zzfba.f35349b);
        a.mo44245r(new zzfbf(true));
        zzdcj zzdcj2 = (zzdcj) a.mo44238e();
        this.f35305a = zzdcj2;
        zzdah zzb = zzdcj2.zzb();
        zzffz zzffz = new zzffz();
        return zzfzg.m51418m(zzfzg.m51419n(zzfyx.m51389C(zzb.mo44531i()), new zzezy(this, zzffz, zzb), this.f35306b), new zzezz(zzffz), this.f35306b);
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo45555d() {
        return this.f35305a;
    }
}
