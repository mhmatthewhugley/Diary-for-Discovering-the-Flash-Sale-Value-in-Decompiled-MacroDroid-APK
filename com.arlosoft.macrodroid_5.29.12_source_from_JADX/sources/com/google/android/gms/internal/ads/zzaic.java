package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaic implements zzaip {

    /* renamed from: a */
    private final zzaib f24717a;

    /* renamed from: b */
    private final zzef f24718b = new zzef(32);

    /* renamed from: c */
    private int f24719c;

    /* renamed from: d */
    private int f24720d;

    /* renamed from: e */
    private boolean f24721e;

    /* renamed from: f */
    private boolean f24722f;

    public zzaic(zzaib zzaib) {
        this.f24717a = zzaib;
    }

    /* renamed from: a */
    public final void mo41498a() {
        this.f24722f = true;
    }

    /* renamed from: b */
    public final void mo41499b(zzel zzel, zzzl zzzl, zzaio zzaio) {
        this.f24717a.mo41496b(zzel, zzzl, zzaio);
        this.f24722f = true;
    }

    /* renamed from: c */
    public final void mo41500c(zzef zzef, int i) {
        int i2 = i & 1;
        int k = i2 != 0 ? zzef.mo45235k() + zzef.mo45243s() : -1;
        if (this.f24722f) {
            if (i2 != 0) {
                this.f24722f = false;
                zzef.mo45230f(k);
                this.f24720d = 0;
            } else {
                return;
            }
        }
        while (zzef.mo45233i() > 0) {
            int i3 = this.f24720d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s = zzef.mo45243s();
                    zzef.mo45230f(zzef.mo45235k() - 1);
                    if (s == 255) {
                        this.f24722f = true;
                        return;
                    }
                }
                int min = Math.min(zzef.mo45233i(), 3 - this.f24720d);
                zzef.mo45226b(this.f24718b.mo45232h(), this.f24720d, min);
                int i4 = this.f24720d + min;
                this.f24720d = i4;
                if (i4 == 3) {
                    this.f24718b.mo45230f(0);
                    this.f24718b.mo45229e(3);
                    this.f24718b.mo45231g(1);
                    int s2 = this.f24718b.mo45243s();
                    int s3 = this.f24718b.mo45243s();
                    this.f24721e = (s2 & 128) != 0;
                    this.f24719c = (((s2 & 15) << 8) | s3) + 3;
                    int j = this.f24718b.mo45234j();
                    int i5 = this.f24719c;
                    if (j < i5) {
                        int j2 = this.f24718b.mo45234j();
                        this.f24718b.mo45224H(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, j2 + j2)));
                    }
                }
            } else {
                int min2 = Math.min(zzef.mo45233i(), this.f24719c - i3);
                zzef.mo45226b(this.f24718b.mo45232h(), this.f24720d, min2);
                int i6 = this.f24720d + min2;
                this.f24720d = i6;
                int i7 = this.f24719c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f24721e) {
                        this.f24718b.mo45229e(i7);
                    } else if (zzen.m49142Q(this.f24718b.mo45232h(), 0, i7, -1) != 0) {
                        this.f24722f = true;
                        return;
                    } else {
                        this.f24718b.mo45229e(this.f24719c - 4);
                    }
                    this.f24718b.mo45230f(0);
                    this.f24717a.mo41497c(this.f24718b);
                    this.f24720d = 0;
                }
            }
        }
    }
}
