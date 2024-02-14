package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaii implements zzaib {

    /* renamed from: a */
    private final zzee f24737a = new zzee(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ zzaik f24738b;

    public zzaii(zzaik zzaik) {
        this.f24738b = zzaik;
    }

    /* renamed from: b */
    public final void mo41496b(zzel zzel, zzzl zzzl, zzaio zzaio) {
    }

    /* renamed from: c */
    public final void mo41497c(zzef zzef) {
        if (zzef.mo45243s() == 0 && (zzef.mo45243s() & 128) != 0) {
            zzef.mo45231g(6);
            int i = zzef.mo45233i() / 4;
            for (int i2 = 0; i2 < i; i2++) {
                zzef.mo45225a(this.f24737a, 4);
                int c = this.f24737a.mo45198c(16);
                this.f24737a.mo45205j(3);
                if (c == 0) {
                    this.f24737a.mo45205j(13);
                } else {
                    int c2 = this.f24737a.mo45198c(13);
                    if (this.f24738b.f24749e.get(c2) == null) {
                        zzaik zzaik = this.f24738b;
                        zzaik.f24749e.put(c2, new zzaic(new zzaij(zzaik, c2)));
                        zzaik zzaik2 = this.f24738b;
                        zzaik2.f24755k = zzaik2.f24755k + 1;
                    }
                }
            }
            this.f24738b.f24749e.remove(0);
        }
    }
}
