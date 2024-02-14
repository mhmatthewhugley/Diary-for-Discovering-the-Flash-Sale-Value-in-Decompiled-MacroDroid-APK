package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfaf implements zzfaz {

    /* renamed from: a */
    private final zzfaz f35321a;

    /* renamed from: b */
    private final zzfaz f35322b;

    /* renamed from: c */
    private final zzfgm f35323c;

    /* renamed from: d */
    private final String f35324d;

    /* renamed from: e */
    private zzdcj f35325e;

    /* renamed from: f */
    private final Executor f35326f;

    public zzfaf(zzfaz zzfaz, zzfaz zzfaz2, zzfgm zzfgm, String str, Executor executor) {
        this.f35321a = zzfaz;
        this.f35322b = zzfaz2;
        this.f35323c = zzfgm;
        this.f35324d = str;
        this.f35326f = executor;
    }

    /* renamed from: g */
    private final zzfzp m49775g(zzffz zzffz, zzfba zzfba) {
        zzdcj zzdcj = zzffz.f35728a;
        this.f35325e = zzdcj;
        if (zzffz.f35730c != null) {
            if (zzdcj.mo44265c() != null) {
                zzffz.f35730c.mo44499f().mo45524c(zzffz.f35728a.mo44265c());
            }
            return zzfzg.m51414i(zzffz.f35730c);
        }
        zzdcj.zzb().mo44533k(zzffz.f35729b);
        return ((zzfap) this.f35321a).mo45570c(zzfba, (zzfay) null, zzffz.f35728a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo45552a(zzfba zzfba, zzfay zzfay, Object obj) {
        return mo45563f(zzfba, zzfay, (zzdcj) null);
    }

    /* renamed from: b */
    public final synchronized zzdcj mo45555d() {
        return this.f35325e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45561c(zzfba zzfba, zzfae zzfae, zzfay zzfay, zzdcj zzdcj, zzfak zzfak) throws Exception {
        if (zzfak != null) {
            zzfae zzfae2 = new zzfae(zzfae.f35314a, zzfae.f35315b, zzfae.f35316c, zzfae.f35317d, zzfae.f35318e, zzfae.f35319f, zzfak.f35330a);
            if (zzfak.f35332c != null) {
                this.f35325e = null;
                this.f35323c.mo45713e(zzfae2);
                return m49775g(zzfak.f35332c, zzfba);
            }
            zzfzp a = this.f35323c.mo45712a(zzfae2);
            if (a != null) {
                this.f35325e = null;
                return zzfzg.m51419n(a, new zzfab(this), this.f35326f);
            }
            this.f35323c.mo45713e(zzfae2);
            zzfba = new zzfba(zzfba.f35349b, zzfak.f35331b);
        }
        zzfzp c = ((zzfap) this.f35321a).mo45570c(zzfba, zzfay, zzdcj);
        this.f35325e = zzdcj;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ zzfzp mo45562e(zzfgj zzfgj) throws Exception {
        zzfgl zzfgl;
        if (zzfgj == null || zzfgj.f35742a == null || (zzfgl = zzfgj.f35743b) == null) {
            throw new zzebh(1, "Empty prefetch");
        }
        zzbfe F = zzbfk.m43295F();
        zzbfc F2 = zzbfd.m43270F();
        F2.mo42565v(2);
        F2.mo42563o(zzbfh.m43282H());
        F.mo42566n(F2);
        zzfgj.f35742a.f35728a.zzb().mo44525c().mo44534E((zzbfk) F.mo47341h());
        return m49775g(zzfgj.f35742a, ((zzfae) zzfgl).f35315b);
    }

    /* renamed from: f */
    public final synchronized zzfzp mo45563f(zzfba zzfba, zzfay zzfay, zzdcj zzdcj) {
        zzfba zzfba2 = zzfba;
        zzfay zzfay2 = zzfay;
        synchronized (this) {
            zzdci a = zzfay2.mo45519a(zzfba2.f35349b);
            a.mo44244q(new zzfag(this.f35324d));
            zzdcj zzdcj2 = (zzdcj) a.mo44238e();
            zzdcj2.mo44267f();
            zzdcj2.mo44267f();
            zzl zzl = zzdcj2.mo44267f().f35629d;
            if (zzl.f1991J == null) {
                if (zzl.f1996O == null) {
                    zzfef f = zzdcj2.mo44267f();
                    zzfay zzfay3 = zzfay;
                    zzfba zzfba3 = zzfba;
                    zzfzp n = zzfzg.m51419n(zzfyx.m51389C(((zzfal) this.f35322b).mo45566c(zzfba2, zzfay2, zzdcj2)), new zzfac(this, zzfba, new zzfae(zzfay3, zzfba3, f.f35629d, f.f35631f, this.f35326f, f.f35635j, (zzfga) null), zzfay, zzdcj2), this.f35326f);
                    return n;
                }
            }
            this.f35325e = zzdcj2;
            zzfzp c = ((zzfap) this.f35321a).mo45570c(zzfba2, zzfay2, zzdcj2);
            return c;
        }
    }
}
