package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaho implements zzahc {

    /* renamed from: a */
    private final zzef f24630a = new zzef(10);

    /* renamed from: b */
    private zzaap f24631b;

    /* renamed from: c */
    private boolean f24632c;

    /* renamed from: d */
    private long f24633d = -9223372036854775807L;

    /* renamed from: e */
    private int f24634e;

    /* renamed from: f */
    private int f24635f;

    /* renamed from: a */
    public final void mo41466a() {
        int i;
        zzdd.m47208b(this.f24631b);
        if (this.f24632c && (i = this.f24634e) != 0 && this.f24635f == i) {
            long j = this.f24633d;
            if (j != -9223372036854775807L) {
                this.f24631b.mo41216f(j, 1, i, 0, (zzaao) null);
            }
            this.f24632c = false;
        }
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24632c = false;
        this.f24633d = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) {
        zzdd.m47208b(this.f24631b);
        if (this.f24632c) {
            int i = zzef.mo45233i();
            int i2 = this.f24635f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(zzef.mo45232h(), zzef.mo45235k(), this.f24630a.mo45232h(), this.f24635f, min);
                if (this.f24635f + min == 10) {
                    this.f24630a.mo45230f(0);
                    if (this.f24630a.mo45243s() == 73 && this.f24630a.mo45243s() == 68 && this.f24630a.mo45243s() == 51) {
                        this.f24630a.mo45231g(3);
                        this.f24634e = this.f24630a.mo45242r() + 10;
                    } else {
                        zzdw.m48255e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f24632c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f24634e - this.f24635f);
            this.f24631b.mo41215e(zzef, min2);
            this.f24635f += min2;
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 5);
        this.f24631b = k;
        zzad zzad = new zzad();
        zzad.mo41331h(zzaio.mo41516b());
        zzad.mo41343s("application/id3");
        k.mo41214d(zzad.mo41349y());
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if ((i & 4) != 0) {
            this.f24632c = true;
            if (j != -9223372036854775807L) {
                this.f24633d = j;
            }
            this.f24634e = 0;
            this.f24635f = 0;
        }
    }
}
