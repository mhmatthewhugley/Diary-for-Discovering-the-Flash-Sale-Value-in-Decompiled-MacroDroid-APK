package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahz {

    /* renamed from: a */
    private final zzahc f24699a;

    /* renamed from: b */
    private final zzel f24700b;

    /* renamed from: c */
    private final zzee f24701c = new zzee(new byte[64], 64);

    /* renamed from: d */
    private boolean f24702d;

    /* renamed from: e */
    private boolean f24703e;

    /* renamed from: f */
    private boolean f24704f;

    public zzahz(zzahc zzahc, zzel zzel) {
        this.f24699a = zzahc;
        this.f24700b = zzel;
    }

    /* renamed from: a */
    public final void mo41505a(zzef zzef) throws zzbu {
        long j;
        zzef.mo45226b(this.f24701c.f33777a, 0, 3);
        this.f24701c.mo45203h(0);
        this.f24701c.mo45205j(8);
        this.f24702d = this.f24701c.mo45207l();
        this.f24703e = this.f24701c.mo45207l();
        this.f24701c.mo45205j(6);
        zzef.mo45226b(this.f24701c.f33777a, 0, this.f24701c.mo45198c(8));
        this.f24701c.mo45203h(0);
        if (this.f24702d) {
            this.f24701c.mo45205j(4);
            int c = this.f24701c.mo45198c(3);
            this.f24701c.mo45205j(1);
            int c2 = this.f24701c.mo45198c(15);
            this.f24701c.mo45205j(1);
            long c3 = (((long) c) << 30) | ((long) (c2 << 15)) | ((long) this.f24701c.mo45198c(15));
            this.f24701c.mo45205j(1);
            if (!this.f24704f && this.f24703e) {
                this.f24701c.mo45205j(4);
                int c4 = this.f24701c.mo45198c(3);
                this.f24701c.mo45205j(1);
                int c5 = this.f24701c.mo45198c(15);
                this.f24701c.mo45205j(1);
                int c6 = this.f24701c.mo45198c(15);
                this.f24701c.mo45205j(1);
                this.f24700b.mo45357b(((long) (c5 << 15)) | (((long) c4) << 30) | ((long) c6));
                this.f24704f = true;
            }
            j = this.f24700b.mo45357b(c3);
        } else {
            j = 0;
        }
        this.f24699a.mo41470e(j, 4);
        this.f24699a.mo41468c(zzef);
        this.f24699a.mo41466a();
    }

    /* renamed from: b */
    public final void mo41506b() {
        this.f24704f = false;
        this.f24699a.mo41467b();
    }
}
