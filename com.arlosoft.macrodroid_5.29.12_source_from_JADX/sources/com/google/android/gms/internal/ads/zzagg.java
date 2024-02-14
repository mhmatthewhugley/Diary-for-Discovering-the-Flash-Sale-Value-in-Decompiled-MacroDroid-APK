package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagg {

    /* renamed from: a */
    private final zzagh f24402a = new zzagh();

    /* renamed from: b */
    private final zzef f24403b = new zzef(new byte[65025], 0);

    /* renamed from: c */
    private int f24404c = -1;

    /* renamed from: d */
    private int f24405d;

    /* renamed from: e */
    private boolean f24406e;

    zzagg() {
    }

    /* renamed from: f */
    private final int m41327f(int i) {
        int i2;
        int i3 = 0;
        this.f24405d = 0;
        do {
            int i4 = this.f24405d;
            int i5 = i + i4;
            zzagh zzagh = this.f24402a;
            if (i5 >= zzagh.f24409c) {
                break;
            }
            int[] iArr = zzagh.f24412f;
            this.f24405d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final zzef mo41452a() {
        return this.f24403b;
    }

    /* renamed from: b */
    public final zzagh mo41453b() {
        return this.f24402a;
    }

    /* renamed from: c */
    public final void mo41454c() {
        this.f24402a.mo41457a();
        this.f24403b.mo45227c(0);
        this.f24404c = -1;
        this.f24406e = false;
    }

    /* renamed from: d */
    public final void mo41455d() {
        zzef zzef = this.f24403b;
        if (zzef.mo45232h().length != 65025) {
            zzef.mo45228d(Arrays.copyOf(zzef.mo45232h(), Math.max(65025, zzef.mo45236l())), this.f24403b.mo45236l());
        }
    }

    /* renamed from: e */
    public final boolean mo41456e(zzzj zzzj) throws IOException {
        if (this.f24406e) {
            this.f24406e = false;
            this.f24403b.mo45227c(0);
        }
        while (true) {
            boolean z = true;
            if (this.f24406e) {
                return true;
            }
            int i = this.f24404c;
            if (i < 0) {
                if (!this.f24402a.mo41459c(zzzj, -1) || !this.f24402a.mo41458b(zzzj, true)) {
                    return false;
                }
                zzagh zzagh = this.f24402a;
                int i2 = zzagh.f24410d;
                if ((zzagh.f24407a & 1) == 1 && this.f24403b.mo45236l() == 0) {
                    i2 += m41327f(0);
                    i = this.f24405d;
                } else {
                    i = 0;
                }
                if (!zzzm.m55543e(zzzj, i2)) {
                    return false;
                }
                this.f24404c = i;
            }
            int f = m41327f(i);
            int i3 = this.f24404c + this.f24405d;
            if (f > 0) {
                zzef zzef = this.f24403b;
                zzef.mo45224H(zzef.mo45236l() + f);
                zzef zzef2 = this.f24403b;
                if (!zzzm.m55542d(zzzj, zzef2.mo45232h(), zzef2.mo45236l(), f)) {
                    return false;
                }
                zzef zzef3 = this.f24403b;
                zzef3.mo45229e(zzef3.mo45236l() + f);
                if (this.f24402a.f24412f[i3 - 1] == 255) {
                    z = false;
                }
                this.f24406e = z;
            }
            if (i3 == this.f24402a.f24409c) {
                i3 = -1;
            }
            this.f24404c = i3;
        }
        return false;
    }
}
