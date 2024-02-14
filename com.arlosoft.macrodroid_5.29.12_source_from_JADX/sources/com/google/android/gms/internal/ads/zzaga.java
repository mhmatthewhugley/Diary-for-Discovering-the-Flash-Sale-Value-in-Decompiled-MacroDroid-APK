package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaga implements zzaal {

    /* renamed from: a */
    final /* synthetic */ zzagb f24378a;

    /* synthetic */ zzaga(zzagb zzagb, zzafz zzafz) {
        this.f24378a = zzagb;
    }

    /* renamed from: b */
    public final long mo41193b() {
        zzagb zzagb = this.f24378a;
        return zzagb.f24382d.mo41461e(zzagb.f24384f);
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        zzagb zzagb = this.f24378a;
        long f = zzagb.f24382d.mo41462f(j);
        long e = zzagb.f24380b;
        long d = f * (zzagb.f24381c - zzagb.f24380b);
        zzaam zzaam = new zzaam(j, zzen.m49155b0(-30000 + e + (d / zzagb.f24384f), zzagb.f24380b, zzagb.f24381c - 1));
        return new zzaaj(zzaam, zzaam);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }
}
