package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahs implements zzaib {

    /* renamed from: a */
    private zzaf f24674a;

    /* renamed from: b */
    private zzel f24675b;

    /* renamed from: c */
    private zzaap f24676c;

    public zzahs(String str) {
        zzad zzad = new zzad();
        zzad.mo41343s(str);
        this.f24674a = zzad.mo41349y();
    }

    /* renamed from: b */
    public final void mo41496b(zzel zzel, zzzl zzzl, zzaio zzaio) {
        this.f24675b = zzel;
        zzaio.mo41517c();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 5);
        this.f24676c = k;
        k.mo41214d(this.f24674a);
    }

    /* renamed from: c */
    public final void mo41497c(zzef zzef) {
        zzdd.m47208b(this.f24675b);
        int i = zzen.f34500a;
        long d = this.f24675b.mo45359d();
        long e = this.f24675b.mo45360e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            zzaf zzaf = this.f24674a;
            if (e != zzaf.f24217p) {
                zzad b = zzaf.mo41422b();
                b.mo41347w(e);
                zzaf y = b.mo41349y();
                this.f24674a = y;
                this.f24676c.mo41214d(y);
            }
            int i2 = zzef.mo45233i();
            this.f24676c.mo41215e(zzef, i2);
            this.f24676c.mo41216f(d, 1, i2, 0, (zzaao) null);
        }
    }
}
