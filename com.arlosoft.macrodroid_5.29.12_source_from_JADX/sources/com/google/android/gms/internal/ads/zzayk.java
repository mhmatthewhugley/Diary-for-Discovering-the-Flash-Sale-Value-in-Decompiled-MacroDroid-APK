package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzayk {

    /* renamed from: a */
    private int f26274a = 1000;

    /* renamed from: b */
    private int[] f26275b = new int[1000];

    /* renamed from: c */
    private long[] f26276c = new long[1000];

    /* renamed from: d */
    private int[] f26277d = new int[1000];

    /* renamed from: e */
    private int[] f26278e = new int[1000];

    /* renamed from: f */
    private long[] f26279f = new long[1000];

    /* renamed from: g */
    private zzavh[] f26280g = new zzavh[1000];

    /* renamed from: h */
    private zzasw[] f26281h = new zzasw[1000];

    /* renamed from: i */
    private int f26282i;

    /* renamed from: j */
    private int f26283j;

    /* renamed from: k */
    private int f26284k;

    /* renamed from: l */
    private int f26285l;

    /* renamed from: m */
    private long f26286m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f26287n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f26288o = true;

    /* renamed from: p */
    private boolean f26289p = true;

    /* renamed from: q */
    private zzasw f26290q;

    /* renamed from: a */
    public final int mo42231a() {
        return this.f26283j + this.f26282i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return -3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo42232b(com.google.android.gms.internal.ads.zzasx r5, com.google.android.gms.internal.ads.zzaur r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzasw r9, com.google.android.gms.internal.ads.zzayj r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo42242l()     // Catch:{ all -> 0x0092 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0020
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo42066c(r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzasw r6 = r4.f26290q     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x001e
            if (r7 != 0) goto L_0x001a
            if (r6 == r9) goto L_0x001e
        L_0x001a:
            r5.f25531a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            if (r7 != 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzasw[] r7 = r4.f26281h     // Catch:{ all -> 0x0092 }
            int r8 = r4.f26284k     // Catch:{ all -> 0x0092 }
            r7 = r7[r8]     // Catch:{ all -> 0x0092 }
            if (r7 == r9) goto L_0x002b
            goto L_0x0088
        L_0x002b:
            java.nio.ByteBuffer r5 = r6.f25709c     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0086
            long[] r5 = r4.f26279f     // Catch:{ all -> 0x0092 }
            r0 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.f25710d = r0     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f26278e     // Catch:{ all -> 0x0092 }
            r5 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.mo42066c(r5)     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f26277d     // Catch:{ all -> 0x0092 }
            int r7 = r4.f26284k     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f26270a = r5     // Catch:{ all -> 0x0092 }
            long[] r5 = r4.f26276c     // Catch:{ all -> 0x0092 }
            r8 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f26271b = r8     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzavh[] r5 = r4.f26280g     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f26273d = r5     // Catch:{ all -> 0x0092 }
            long r7 = r4.f26286m     // Catch:{ all -> 0x0092 }
            long r5 = r6.f25710d     // Catch:{ all -> 0x0092 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0092 }
            r4.f26286m = r5     // Catch:{ all -> 0x0092 }
            int r5 = r4.f26282i     // Catch:{ all -> 0x0092 }
            int r5 = r5 + -1
            r4.f26282i = r5     // Catch:{ all -> 0x0092 }
            int r6 = r4.f26284k     // Catch:{ all -> 0x0092 }
            int r6 = r6 + 1
            r4.f26284k = r6     // Catch:{ all -> 0x0092 }
            int r7 = r4.f26283j     // Catch:{ all -> 0x0092 }
            int r7 = r7 + 1
            r4.f26283j = r7     // Catch:{ all -> 0x0092 }
            int r7 = r4.f26274a     // Catch:{ all -> 0x0092 }
            r8 = 0
            if (r6 != r7) goto L_0x0074
            r4.f26284k = r8     // Catch:{ all -> 0x0092 }
            r6 = 0
        L_0x0074:
            if (r5 <= 0) goto L_0x007b
            long[] r5 = r4.f26276c     // Catch:{ all -> 0x0092 }
            r6 = r5[r6]     // Catch:{ all -> 0x0092 }
            goto L_0x0082
        L_0x007b:
            long r5 = r10.f26271b     // Catch:{ all -> 0x0092 }
            int r7 = r10.f26270a     // Catch:{ all -> 0x0092 }
            long r7 = (long) r7     // Catch:{ all -> 0x0092 }
            long r6 = r5 + r7
        L_0x0082:
            r10.f26272c = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0086:
            monitor-exit(r4)
            return r2
        L_0x0088:
            com.google.android.gms.internal.ads.zzasw[] r6 = r4.f26281h     // Catch:{ all -> 0x0092 }
            int r7 = r4.f26284k     // Catch:{ all -> 0x0092 }
            r6 = r6[r7]     // Catch:{ all -> 0x0092 }
            r5.f25531a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x0092:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayk.mo42232b(com.google.android.gms.internal.ads.zzasx, com.google.android.gms.internal.ads.zzaur, boolean, boolean, com.google.android.gms.internal.ads.zzasw, com.google.android.gms.internal.ads.zzayj):int");
    }

    /* renamed from: c */
    public final synchronized long mo42233c() {
        return Math.max(this.f26286m, this.f26287n);
    }

    /* renamed from: d */
    public final synchronized long mo42234d() {
        if (!mo42242l()) {
            return -1;
        }
        int i = this.f26284k;
        int i2 = this.f26282i;
        int i3 = i + i2;
        int i4 = this.f26274a;
        int i5 = (i3 - 1) % i4;
        this.f26284k = i3 % i4;
        this.f26283j += i2;
        this.f26282i = 0;
        return this.f26276c[i5] + ((long) this.f26277d[i5]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo42235e(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mo42242l()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r9.f26279f     // Catch:{ all -> 0x005e }
            int r3 = r9.f26284k     // Catch:{ all -> 0x005e }
            r4 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r4 = r9.f26287n     // Catch:{ all -> 0x005e }
            r0 = 0
            r6 = -1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0021
            if (r12 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r9)
            return r1
        L_0x0021:
            r12 = -1
        L_0x0022:
            int r4 = r9.f26285l     // Catch:{ all -> 0x005e }
            if (r3 == r4) goto L_0x0040
            long[] r4 = r9.f26279f     // Catch:{ all -> 0x005e }
            r7 = r4[r3]     // Catch:{ all -> 0x005e }
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            int[] r4 = r9.f26278e     // Catch:{ all -> 0x005e }
            r4 = r4[r3]     // Catch:{ all -> 0x005e }
            r5 = 1
            r4 = r4 & r5
            if (r5 != r4) goto L_0x0038
            r12 = r0
        L_0x0038:
            int r3 = r3 + 1
            int r4 = r9.f26274a     // Catch:{ all -> 0x005e }
            int r3 = r3 % r4
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0040:
            if (r12 != r6) goto L_0x0044
            monitor-exit(r9)
            return r1
        L_0x0044:
            int r10 = r9.f26284k     // Catch:{ all -> 0x005e }
            int r10 = r10 + r12
            int r11 = r9.f26274a     // Catch:{ all -> 0x005e }
            int r10 = r10 % r11
            r9.f26284k = r10     // Catch:{ all -> 0x005e }
            int r11 = r9.f26283j     // Catch:{ all -> 0x005e }
            int r11 = r11 + r12
            r9.f26283j = r11     // Catch:{ all -> 0x005e }
            int r11 = r9.f26282i     // Catch:{ all -> 0x005e }
            int r11 = r11 - r12
            r9.f26282i = r11     // Catch:{ all -> 0x005e }
            long[] r11 = r9.f26276c     // Catch:{ all -> 0x005e }
            r10 = r11[r10]     // Catch:{ all -> 0x005e }
            monitor-exit(r9)
            return r10
        L_0x005c:
            monitor-exit(r9)
            return r1
        L_0x005e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayk.mo42235e(long, boolean):long");
    }

    /* renamed from: f */
    public final synchronized zzasw mo42236f() {
        if (this.f26289p) {
            return null;
        }
        return this.f26290q;
    }

    /* renamed from: g */
    public final void mo42237g() {
        this.f26283j = 0;
        this.f26284k = 0;
        this.f26285l = 0;
        this.f26282i = 0;
        this.f26288o = true;
    }

    /* renamed from: h */
    public final synchronized void mo42238h(long j, int i, long j2, int i2, zzavh zzavh) {
        if (this.f26288o) {
            if ((i & 1) != 0) {
                this.f26288o = false;
            } else {
                return;
            }
        }
        zzbac.m42926e(!this.f26289p);
        mo42239i(j);
        long[] jArr = this.f26279f;
        int i3 = this.f26285l;
        jArr[i3] = j;
        long[] jArr2 = this.f26276c;
        jArr2[i3] = j2;
        this.f26277d[i3] = i2;
        this.f26278e[i3] = i;
        this.f26280g[i3] = zzavh;
        this.f26281h[i3] = this.f26290q;
        this.f26275b[i3] = 0;
        int i4 = this.f26282i + 1;
        this.f26282i = i4;
        int i5 = this.f26274a;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr3 = new long[i6];
            long[] jArr4 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            zzavh[] zzavhArr = new zzavh[i6];
            zzasw[] zzaswArr = new zzasw[i6];
            int i7 = this.f26284k;
            int i8 = i5 - i7;
            System.arraycopy(jArr2, i7, jArr3, 0, i8);
            System.arraycopy(this.f26279f, this.f26284k, jArr4, 0, i8);
            System.arraycopy(this.f26278e, this.f26284k, iArr2, 0, i8);
            System.arraycopy(this.f26277d, this.f26284k, iArr3, 0, i8);
            System.arraycopy(this.f26280g, this.f26284k, zzavhArr, 0, i8);
            System.arraycopy(this.f26281h, this.f26284k, zzaswArr, 0, i8);
            System.arraycopy(this.f26275b, this.f26284k, iArr, 0, i8);
            int i9 = this.f26284k;
            System.arraycopy(this.f26276c, 0, jArr3, i8, i9);
            System.arraycopy(this.f26279f, 0, jArr4, i8, i9);
            System.arraycopy(this.f26278e, 0, iArr2, i8, i9);
            System.arraycopy(this.f26277d, 0, iArr3, i8, i9);
            System.arraycopy(this.f26280g, 0, zzavhArr, i8, i9);
            System.arraycopy(this.f26281h, 0, zzaswArr, i8, i9);
            System.arraycopy(this.f26275b, 0, iArr, i8, i9);
            this.f26276c = jArr3;
            this.f26279f = jArr4;
            this.f26278e = iArr2;
            this.f26277d = iArr3;
            this.f26280g = zzavhArr;
            this.f26281h = zzaswArr;
            this.f26275b = iArr;
            this.f26284k = 0;
            int i10 = this.f26274a;
            this.f26285l = i10;
            this.f26282i = i10;
            this.f26274a = i6;
            return;
        }
        int i11 = i3 + 1;
        this.f26285l = i11;
        if (i11 == i5) {
            this.f26285l = 0;
        }
    }

    /* renamed from: i */
    public final synchronized void mo42239i(long j) {
        this.f26287n = Math.max(this.f26287n, j);
    }

    /* renamed from: j */
    public final void mo42240j() {
        this.f26286m = Long.MIN_VALUE;
        this.f26287n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean mo42241k(zzasw zzasw) {
        if (zzasw == null) {
            this.f26289p = true;
            return false;
        }
        this.f26289p = false;
        if (zzbar.m42999o(zzasw, this.f26290q)) {
            return false;
        }
        this.f26290q = zzasw;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean mo42242l() {
        return this.f26282i != 0;
    }
}
