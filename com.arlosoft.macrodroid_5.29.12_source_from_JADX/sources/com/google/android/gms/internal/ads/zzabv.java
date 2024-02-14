package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabv extends zzabu {

    /* renamed from: b */
    private final zzef f23875b = new zzef(zzaaf.f23725a);

    /* renamed from: c */
    private final zzef f23876c = new zzef(4);

    /* renamed from: d */
    private int f23877d;

    /* renamed from: e */
    private boolean f23878e;

    /* renamed from: f */
    private boolean f23879f;

    /* renamed from: g */
    private int f23880g;

    public zzabv(zzaap zzaap) {
        super(zzaap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo41245a(zzef zzef) throws zzabt {
        int s = zzef.mo45243s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.f23880g = i;
            return i != 5;
        }
        throw new zzabt("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41246b(zzef zzef, long j) throws zzbu {
        int s = zzef.mo45243s();
        long n = j + (((long) zzef.mo45238n()) * 1000);
        if (s == 0) {
            if (!this.f23878e) {
                zzef zzef2 = new zzef(new byte[zzef.mo45233i()]);
                zzef.mo45226b(zzef2.mo45232h(), 0, zzef.mo45233i());
                zzyn a = zzyn.m55435a(zzef2);
                this.f23877d = a.f38982b;
                zzad zzad = new zzad();
                zzad.mo41343s("video/avc");
                zzad.mo41328f0(a.f38986f);
                zzad.mo41348x(a.f38983c);
                zzad.mo41327f(a.f38984d);
                zzad.mo41340p(a.f38985e);
                zzad.mo41333i(a.f38981a);
                this.f23874a.mo41214d(zzad.mo41349y());
                this.f23878e = true;
                return false;
            }
        } else if (s == 1 && this.f23878e) {
            int i = this.f23880g == 1 ? 1 : 0;
            if (!this.f23879f && i == 0) {
                return false;
            }
            byte[] h = this.f23876c.mo45232h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i2 = 4 - this.f23877d;
            int i3 = 0;
            while (zzef.mo45233i() > 0) {
                zzef.mo45226b(this.f23876c.mo45232h(), i2, this.f23877d);
                this.f23876c.mo45230f(0);
                int v = this.f23876c.mo45246v();
                this.f23875b.mo45230f(0);
                this.f23874a.mo41215e(this.f23875b, 4);
                this.f23874a.mo41215e(zzef, v);
                i3 = i3 + 4 + v;
            }
            this.f23874a.mo41216f(n, i, i3, 0, (zzaao) null);
            this.f23879f = true;
            return true;
        }
        return false;
    }
}
