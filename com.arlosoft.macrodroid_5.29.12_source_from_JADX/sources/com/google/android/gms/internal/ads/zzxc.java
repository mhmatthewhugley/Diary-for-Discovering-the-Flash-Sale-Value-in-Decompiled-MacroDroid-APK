package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxc {

    /* renamed from: a */
    private long f38841a;

    /* renamed from: b */
    private long f38842b;

    /* renamed from: c */
    private long f38843c;

    /* renamed from: d */
    private long f38844d;

    /* renamed from: e */
    private long f38845e;

    /* renamed from: f */
    private long f38846f;

    /* renamed from: g */
    private final boolean[] f38847g = new boolean[15];

    /* renamed from: h */
    private int f38848h;

    /* renamed from: a */
    public final long mo48371a() {
        long j = this.f38845e;
        if (j == 0) {
            return 0;
        }
        return this.f38846f / j;
    }

    /* renamed from: b */
    public final long mo48372b() {
        return this.f38846f;
    }

    /* renamed from: c */
    public final void mo48373c(long j) {
        long j2 = this.f38844d;
        if (j2 == 0) {
            this.f38841a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f38841a;
            this.f38842b = j3;
            this.f38846f = j3;
            this.f38845e = 1;
        } else {
            long j4 = j - this.f38843c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f38842b) <= 1000000) {
                this.f38845e++;
                this.f38846f += j4;
                boolean[] zArr = this.f38847g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f38848h--;
                }
            } else {
                boolean[] zArr2 = this.f38847g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f38848h++;
                }
            }
        }
        this.f38844d++;
        this.f38843c = j;
    }

    /* renamed from: d */
    public final void mo48374d() {
        this.f38844d = 0;
        this.f38845e = 0;
        this.f38846f = 0;
        this.f38848h = 0;
        Arrays.fill(this.f38847g, false);
    }

    /* renamed from: e */
    public final boolean mo48375e() {
        long j = this.f38844d;
        if (j == 0) {
            return false;
        }
        return this.f38847g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean mo48376f() {
        return this.f38844d > 15 && this.f38848h == 0;
    }
}
