package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahk {

    /* renamed from: a */
    private final zzaap f24576a;

    /* renamed from: b */
    private final SparseArray f24577b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f24578c = new SparseArray();

    /* renamed from: d */
    private final zzaah f24579d;

    /* renamed from: e */
    private final byte[] f24580e;

    /* renamed from: f */
    private int f24581f;

    /* renamed from: g */
    private long f24582g;

    /* renamed from: h */
    private long f24583h;

    /* renamed from: i */
    private final zzahj f24584i = new zzahj((zzahi) null);

    /* renamed from: j */
    private final zzahj f24585j = new zzahj((zzahi) null);

    /* renamed from: k */
    private boolean f24586k;

    /* renamed from: l */
    private long f24587l;

    /* renamed from: m */
    private long f24588m;

    /* renamed from: n */
    private boolean f24589n;

    public zzahk(zzaap zzaap, boolean z, boolean z2) {
        this.f24576a = zzaap;
        byte[] bArr = new byte[128];
        this.f24580e = bArr;
        this.f24579d = new zzaah(bArr, 0, 0);
        this.f24586k = false;
    }

    /* renamed from: a */
    public final void mo41482a(zzaad zzaad) {
        this.f24578c.append(zzaad.f23717a, zzaad);
    }

    /* renamed from: b */
    public final void mo41483b(zzaae zzaae) {
        this.f24577b.append(zzaae.f23721d, zzaae);
    }

    /* renamed from: c */
    public final void mo41484c() {
        this.f24586k = false;
    }

    /* renamed from: d */
    public final void mo41485d(long j, int i, long j2) {
        this.f24581f = i;
        this.f24583h = j2;
        this.f24582g = j;
    }

    /* renamed from: e */
    public final boolean mo41486e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f24581f == 9) {
            if (z && this.f24586k) {
                long j2 = this.f24582g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f24588m;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.f24589n;
                    long j4 = this.f24587l;
                    this.f24576a.mo41216f(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, (zzaao) null);
                }
            }
            this.f24587l = this.f24582g;
            this.f24588m = this.f24583h;
            this.f24589n = false;
            this.f24586k = true;
        }
        boolean z5 = this.f24589n;
        int i3 = this.f24581f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f24589n = z6;
        return z6;
    }
}
