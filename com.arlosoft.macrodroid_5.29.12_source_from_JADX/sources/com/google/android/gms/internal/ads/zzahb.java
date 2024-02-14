package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahb implements zzahc {

    /* renamed from: a */
    private final List f24522a;

    /* renamed from: b */
    private final zzaap[] f24523b;

    /* renamed from: c */
    private boolean f24524c;

    /* renamed from: d */
    private int f24525d;

    /* renamed from: e */
    private int f24526e;

    /* renamed from: f */
    private long f24527f = -9223372036854775807L;

    public zzahb(List list) {
        this.f24522a = list;
        this.f24523b = new zzaap[list.size()];
    }

    /* renamed from: f */
    private final boolean m41407f(zzef zzef, int i) {
        if (zzef.mo45233i() == 0) {
            return false;
        }
        if (zzef.mo45243s() != i) {
            this.f24524c = false;
        }
        this.f24525d--;
        return this.f24524c;
    }

    /* renamed from: a */
    public final void mo41466a() {
        if (this.f24524c) {
            if (this.f24527f != -9223372036854775807L) {
                for (zzaap f : this.f24523b) {
                    f.mo41216f(this.f24527f, 1, this.f24526e, 0, (zzaao) null);
                }
            }
            this.f24524c = false;
        }
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24524c = false;
        this.f24527f = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) {
        if (!this.f24524c) {
            return;
        }
        if (this.f24525d != 2 || m41407f(zzef, 32)) {
            if (this.f24525d != 1 || m41407f(zzef, 0)) {
                int k = zzef.mo45235k();
                int i = zzef.mo45233i();
                for (zzaap e : this.f24523b) {
                    zzef.mo45230f(k);
                    e.mo41215e(zzef, i);
                }
                this.f24526e += i;
            }
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        for (int i = 0; i < this.f24523b.length; i++) {
            zzail zzail = (zzail) this.f24522a.get(i);
            zzaio.mo41517c();
            zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 3);
            zzad zzad = new zzad();
            zzad.mo41331h(zzaio.mo41516b());
            zzad.mo41343s("application/dvbsubs");
            zzad.mo41333i(Collections.singletonList(zzail.f24762b));
            zzad.mo41335k(zzail.f24761a);
            k.mo41214d(zzad.mo41349y());
            this.f24523b[i] = k;
        }
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if ((i & 4) != 0) {
            this.f24524c = true;
            if (j != -9223372036854775807L) {
                this.f24527f = j;
            }
            this.f24526e = 0;
            this.f24525d = 2;
        }
    }
}
