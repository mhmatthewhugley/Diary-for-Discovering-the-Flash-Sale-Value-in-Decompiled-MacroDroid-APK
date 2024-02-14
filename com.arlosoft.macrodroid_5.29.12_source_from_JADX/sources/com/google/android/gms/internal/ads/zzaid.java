package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaid {

    /* renamed from: a */
    private final List f24723a;

    /* renamed from: b */
    private final zzaap[] f24724b;

    public zzaid(List list) {
        this.f24723a = list;
        this.f24724b = new zzaap[list.size()];
    }

    /* renamed from: a */
    public final void mo41509a(long j, zzef zzef) {
        zzyv.m55470a(j, zzef, this.f24724b);
    }

    /* renamed from: b */
    public final void mo41510b(zzzl zzzl, zzaio zzaio) {
        for (int i = 0; i < this.f24724b.length; i++) {
            zzaio.mo41517c();
            zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 3);
            zzaf zzaf = (zzaf) this.f24723a.get(i);
            String str = zzaf.f24213l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.m47211e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = zzaf.f24202a;
            if (str2 == null) {
                str2 = zzaio.mo41516b();
            }
            zzad zzad = new zzad();
            zzad.mo41331h(str2);
            zzad.mo41343s(str);
            zzad.mo41345u(zzaf.f24205d);
            zzad.mo41335k(zzaf.f24204c);
            zzad.mo41322c0(zzaf.f24199D);
            zzad.mo41333i(zzaf.f24215n);
            k.mo41214d(zzad.mo41349y());
            this.f24724b[i] = k;
        }
    }
}
