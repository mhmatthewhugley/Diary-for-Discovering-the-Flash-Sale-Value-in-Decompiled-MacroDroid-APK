package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfav {

    /* renamed from: a */
    private final zzffq f35344a;

    /* renamed from: b */
    private final zzdcj f35345b;

    /* renamed from: c */
    private final Executor f35346c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzfau f35347d;

    public zzfav(zzffq zzffq, zzdcj zzdcj, Executor executor) {
        this.f35344a = zzffq;
        this.f35345b = zzdcj;
        this.f35346c = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    /* renamed from: e */
    public final zzfga m49803e() {
        zzfef f = this.f35345b.mo44267f();
        return this.f35344a.mo45689c(f.f35629d, f.f35631f, f.f35635j);
    }

    /* renamed from: c */
    public final zzfzp mo45571c() {
        zzfzp zzfzp;
        zzfau zzfau = this.f35347d;
        if (zzfau != null) {
            return zzfzg.m51414i(zzfau);
        }
        if (!((Boolean) zzbky.f27477a.mo42728e()).booleanValue()) {
            zzfau zzfau2 = new zzfau((zzcbc) null, m49803e(), (zzfat) null);
            this.f35347d = zzfau2;
            zzfzp = zzfzg.m51414i(zzfau2);
        } else {
            zzfzp = zzfzg.m51411f(zzfzg.m51418m(zzfyx.m51389C(this.f35345b.zzb().mo44527e(this.f35344a.zza())), new zzfas(this), this.f35346c), zzedj.class, new zzfar(this), this.f35346c);
        }
        return zzfzg.m51418m(zzfzp, zzfaq.f35339a, this.f35346c);
    }
}
