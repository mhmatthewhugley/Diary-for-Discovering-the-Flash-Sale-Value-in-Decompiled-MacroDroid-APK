package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfal implements zzfaz {

    /* renamed from: a */
    private final zzffq f35333a;

    /* renamed from: b */
    private final Executor f35334b;

    /* renamed from: c */
    private final zzfzc f35335c = new zzfaj(this);

    public zzfal(zzffq zzffq, Executor executor) {
        this.f35333a = zzffq;
        this.f35334b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo45552a(zzfba zzfba, zzfay zzfay, Object obj) {
        return mo45566c(zzfba, zzfay, (zzdcj) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45565b(zzdcj zzdcj, zzfau zzfau) throws Exception {
        zzfga zzfga = zzfau.f35343b;
        zzcbc zzcbc = zzfau.f35342a;
        zzffz d = zzfga != null ? this.f35333a.mo45690d(zzfga) : null;
        if (zzfga == null) {
            return zzfzg.m51414i((Object) null);
        }
        if (!(d == null || zzcbc == null)) {
            zzfzg.m51423r(zzdcj.zzb().mo44529g(zzcbc), this.f35335c, this.f35334b);
        }
        return zzfzg.m51414i(new zzfak(zzfga, zzcbc, d));
    }

    /* renamed from: c */
    public final zzfzp mo45566c(zzfba zzfba, zzfay zzfay, zzdcj zzdcj) {
        return zzfzg.m51411f(zzfzg.m51419n(zzfyx.m51389C(new zzfav(this.f35333a, zzdcj, this.f35334b).mo45571c()), new zzfah(this, zzdcj), this.f35334b), Exception.class, new zzfai(this), this.f35334b);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo45555d() {
        return null;
    }
}
