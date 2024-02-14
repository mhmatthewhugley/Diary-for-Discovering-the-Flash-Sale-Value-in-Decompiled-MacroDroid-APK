package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzair {

    /* renamed from: a */
    private final List f24772a;

    /* renamed from: b */
    private final zzaap[] f24773b;

    public zzair(List list) {
        this.f24772a = list;
        this.f24773b = new zzaap[list.size()];
    }

    /* renamed from: a */
    public final void mo41518a(long j, zzef zzef) {
        if (zzef.mo45233i() >= 9) {
            int m = zzef.mo45237m();
            int m2 = zzef.mo45237m();
            int s = zzef.mo45243s();
            if (m == 434 && m2 == 1195456820 && s == 3) {
                zzyv.m55471b(j, zzef, this.f24773b);
            }
        }
    }

    /* renamed from: b */
    public final void mo41519b(zzzl zzzl, zzaio zzaio) {
        for (int i = 0; i < this.f24773b.length; i++) {
            zzaio.mo41517c();
            zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 3);
            zzaf zzaf = (zzaf) this.f24772a.get(i);
            String str = zzaf.f24213l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.m47211e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzad zzad = new zzad();
            zzad.mo41331h(zzaio.mo41516b());
            zzad.mo41343s(str);
            zzad.mo41345u(zzaf.f24205d);
            zzad.mo41335k(zzaf.f24204c);
            zzad.mo41322c0(zzaf.f24199D);
            zzad.mo41333i(zzaf.f24215n);
            k.mo41214d(zzad.mo41349y());
            this.f24773b[i] = k;
        }
    }
}
