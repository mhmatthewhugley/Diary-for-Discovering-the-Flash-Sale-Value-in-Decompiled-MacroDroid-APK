package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzty implements zzaap {

    /* renamed from: A */
    private boolean f38578A;

    /* renamed from: B */
    private boolean f38579B;
    @Nullable

    /* renamed from: C */
    private zzpr f38580C;

    /* renamed from: a */
    private final zzts f38581a;

    /* renamed from: b */
    private final zztu f38582b = new zztu();

    /* renamed from: c */
    private final zzuf f38583c = new zzuf(zztt.f38572a);
    @Nullable

    /* renamed from: d */
    private final zzpq f38584d;
    @Nullable

    /* renamed from: e */
    private final zzpk f38585e;
    @Nullable

    /* renamed from: f */
    private zztx f38586f;
    @Nullable

    /* renamed from: g */
    private zzaf f38587g;

    /* renamed from: h */
    private int f38588h = 1000;

    /* renamed from: i */
    private int[] f38589i = new int[1000];

    /* renamed from: j */
    private long[] f38590j = new long[1000];

    /* renamed from: k */
    private int[] f38591k = new int[1000];

    /* renamed from: l */
    private int[] f38592l = new int[1000];

    /* renamed from: m */
    private long[] f38593m = new long[1000];

    /* renamed from: n */
    private zzaao[] f38594n = new zzaao[1000];

    /* renamed from: o */
    private int f38595o;

    /* renamed from: p */
    private int f38596p;

    /* renamed from: q */
    private int f38597q;

    /* renamed from: r */
    private int f38598r;

    /* renamed from: s */
    private long f38599s = Long.MIN_VALUE;

    /* renamed from: t */
    private long f38600t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f38601u = Long.MIN_VALUE;

    /* renamed from: v */
    private boolean f38602v;

    /* renamed from: w */
    private boolean f38603w = true;

    /* renamed from: x */
    private boolean f38604x = true;
    @Nullable

    /* renamed from: y */
    private zzaf f38605y;
    @Nullable

    /* renamed from: z */
    private zzaf f38606z;

    protected zzty(zzwi zzwi, @Nullable zzpq zzpq, @Nullable zzpk zzpk, byte[] bArr) {
        this.f38584d = zzpq;
        this.f38585e = zzpk;
        this.f38581a = new zzts(zzwi, (byte[]) null);
    }

    /* renamed from: A */
    static /* synthetic */ void m55076A(zztw zztw) {
        zzpp zzpp = zztw.f38577b;
        int i = zzpo.f38190a;
    }

    /* renamed from: L */
    private final int m55077L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f38593m[i] > j ? 1 : (this.f38593m[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.f38592l[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.f38588h) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: g */
    private final int m55078g(int i) {
        int i2 = this.f38597q + i;
        int i3 = this.f38588h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m55079h(com.google.android.gms.internal.ads.zzjg r6, com.google.android.gms.internal.ads.zzgi r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.zztu r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f36862d = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.m55087p()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.f38602v     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.zzaf r7 = r5.f38606z     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzaf r8 = r5.f38587g     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.m55084m(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.mo46721c(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.zzuf r9 = r5.f38583c     // Catch:{ all -> 0x0083 }
            int r0 = r5.f38596p     // Catch:{ all -> 0x0083 }
            int r4 = r5.f38598r     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.mo48258a(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zztw r9 = (com.google.android.gms.internal.ads.zztw) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaf r9 = r9.f38576a     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzaf r8 = r5.f38587g     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.f38598r     // Catch:{ all -> 0x0083 }
            int r6 = r5.m55078g(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.m55088q(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.f36862d = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.f38592l     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.mo46721c(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.f38593m     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.f36863e = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.f38599s     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mo46719a(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.f38591k     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f38573a = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.f38590j     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f38574b = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaao[] r7 = r5.f38594n     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f38575c = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.m55084m(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.m55079h(com.google.android.gms.internal.ads.zzjg, com.google.android.gms.internal.ads.zzgi, boolean, boolean, com.google.android.gms.internal.ads.zztu):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m55080i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f38595o     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f38593m     // Catch:{ all -> 0x002f }
            int r4 = r9.f38597q     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f38598r     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m55077L(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m55082k(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.m55080i(long, boolean, boolean):long");
    }

    /* renamed from: j */
    private final synchronized long m55081j() {
        int i = this.f38595o;
        if (i == 0) {
            return -1;
        }
        return m55082k(i);
    }

    @GuardedBy("this")
    /* renamed from: k */
    private final long m55082k(int i) {
        long j = this.f38600t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = m55078g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.f38593m[g]);
                if ((this.f38592l[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.f38588h - 1;
                }
            }
        }
        this.f38600t = Math.max(j, j2);
        this.f38595o -= i;
        int i3 = this.f38596p + i;
        this.f38596p = i3;
        int i4 = this.f38597q + i;
        this.f38597q = i4;
        int i5 = this.f38588h;
        if (i4 >= i5) {
            this.f38597q = i4 - i5;
        }
        int i6 = this.f38598r - i;
        this.f38598r = i6;
        if (i6 < 0) {
            this.f38598r = 0;
        }
        this.f38583c.mo48262e(i3);
        if (this.f38595o != 0) {
            return this.f38590j[this.f38597q];
        }
        int i7 = this.f38597q;
        if (i7 == 0) {
            i7 = this.f38588h;
        }
        int i8 = i7 - 1;
        return this.f38590j[i8] + ((long) this.f38591k[i8]);
    }

    /* renamed from: l */
    private final synchronized void m55083l(long j, int i, long j2, int i2, @Nullable zzaao zzaao) {
        int i3 = this.f38595o;
        if (i3 > 0) {
            int g = m55078g(i3 - 1);
            zzdd.m47210d(this.f38590j[g] + ((long) this.f38591k[g]) <= j2);
        }
        this.f38602v = (536870912 & i) != 0;
        this.f38601u = Math.max(this.f38601u, j);
        int g2 = m55078g(this.f38595o);
        this.f38593m[g2] = j;
        this.f38590j[g2] = j2;
        this.f38591k[g2] = i2;
        this.f38592l[g2] = i;
        this.f38594n[g2] = zzaao;
        this.f38589i[g2] = 0;
        if (this.f38583c.mo48263f() || !((zztw) this.f38583c.mo48259b()).f38576a.equals(this.f38606z)) {
            zzpp zzpp = zzpp.f38191a;
            zzuf zzuf = this.f38583c;
            int i4 = this.f38596p + this.f38595o;
            zzaf zzaf = this.f38606z;
            Objects.requireNonNull(zzaf);
            zzuf.mo48260c(i4, new zztw(zzaf, zzpp, (zztv) null));
        }
        int i5 = this.f38595o + 1;
        this.f38595o = i5;
        int i6 = this.f38588h;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzaao[] zzaaoArr = new zzaao[i7];
            int i8 = this.f38597q;
            int i9 = i6 - i8;
            System.arraycopy(this.f38590j, i8, jArr, 0, i9);
            System.arraycopy(this.f38593m, this.f38597q, jArr2, 0, i9);
            System.arraycopy(this.f38592l, this.f38597q, iArr2, 0, i9);
            System.arraycopy(this.f38591k, this.f38597q, iArr3, 0, i9);
            System.arraycopy(this.f38594n, this.f38597q, zzaaoArr, 0, i9);
            System.arraycopy(this.f38589i, this.f38597q, iArr, 0, i9);
            int i10 = this.f38597q;
            System.arraycopy(this.f38590j, 0, jArr, i9, i10);
            System.arraycopy(this.f38593m, 0, jArr2, i9, i10);
            System.arraycopy(this.f38592l, 0, iArr2, i9, i10);
            System.arraycopy(this.f38591k, 0, iArr3, i9, i10);
            System.arraycopy(this.f38594n, 0, zzaaoArr, i9, i10);
            System.arraycopy(this.f38589i, 0, iArr, i9, i10);
            this.f38590j = jArr;
            this.f38593m = jArr2;
            this.f38592l = iArr2;
            this.f38591k = iArr3;
            this.f38594n = zzaaoArr;
            this.f38589i = iArr;
            this.f38597q = 0;
            this.f38588h = i7;
        }
    }

    /* renamed from: m */
    private final void m55084m(zzaf zzaf, zzjg zzjg) {
        zzx zzx;
        zzaf zzaf2 = this.f38587g;
        zzpr zzpr = null;
        if (zzaf2 == null) {
            zzx = null;
        } else {
            zzx = zzaf2.f24216o;
        }
        this.f38587g = zzaf;
        zzx zzx2 = zzaf.f24216o;
        zzjg.f37624a = zzaf.mo41423c(this.f38584d.mo48015d(zzaf));
        zzjg.f37625b = this.f38580C;
        if (zzaf2 == null || !zzen.m49181t(zzx, zzx2)) {
            if (zzaf.f24216o != null) {
                zzpr = new zzpr(new zzpi(new zzpt(1), 6001));
            }
            this.f38580C = zzpr;
            zzjg.f37625b = zzpr;
        }
    }

    /* renamed from: n */
    private final void m55085n() {
        if (this.f38580C != null) {
            this.f38580C = null;
            this.f38587g = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m55086o() {
        this.f38598r = 0;
        this.f38581a.mo48228g();
    }

    /* renamed from: p */
    private final boolean m55087p() {
        return this.f38598r != this.f38595o;
    }

    /* renamed from: q */
    private final boolean m55088q(int i) {
        if (this.f38580C != null) {
            return (this.f38592l[i] & BasicMeasure.EXACTLY) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m55089r(zzaf zzaf) {
        this.f38604x = false;
        if (zzen.m49181t(zzaf, this.f38606z)) {
            return false;
        }
        if (this.f38583c.mo48263f() || !((zztw) this.f38583c.mo48259b()).f38576a.equals(zzaf)) {
            this.f38606z = zzaf;
        } else {
            this.f38606z = ((zztw) this.f38583c.mo48259b()).f38576a;
        }
        zzaf zzaf2 = this.f38606z;
        this.f38578A = zzbt.m44093f(zzaf2.f24213l, zzaf2.f24210i);
        this.f38579B = false;
        return true;
    }

    @CallSuper
    /* renamed from: B */
    public final void mo48230B() throws IOException {
        zzpr zzpr = this.f38580C;
        if (zzpr != null) {
            throw zzpr.mo48016a();
        }
    }

    @CallSuper
    /* renamed from: C */
    public final void mo48231C() {
        mo48247z();
        m55085n();
    }

    @CallSuper
    /* renamed from: D */
    public final void mo48232D() {
        mo48233E(true);
        m55085n();
    }

    @CallSuper
    /* renamed from: E */
    public final void mo48233E(boolean z) {
        this.f38581a.mo48227f();
        this.f38595o = 0;
        this.f38596p = 0;
        this.f38597q = 0;
        this.f38598r = 0;
        this.f38603w = true;
        this.f38599s = Long.MIN_VALUE;
        this.f38600t = Long.MIN_VALUE;
        this.f38601u = Long.MIN_VALUE;
        this.f38602v = false;
        this.f38583c.mo48261d();
        if (z) {
            this.f38605y = null;
            this.f38606z = null;
            this.f38604x = true;
        }
    }

    /* renamed from: F */
    public final void mo48234F(long j) {
        this.f38599s = j;
    }

    /* renamed from: G */
    public final void mo48235G(@Nullable zztx zztx) {
        this.f38586f = zztx;
    }

    /* renamed from: H */
    public final synchronized void mo48236H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f38598r + i <= this.f38595o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdd.m47210d(z);
        this.f38598r += i;
    }

    /* renamed from: I */
    public final synchronized boolean mo48237I() {
        return this.f38602v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    @androidx.annotation.CallSuper
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo48238J(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m55087p()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f38602v     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzaf r4 = r3.f38606z     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzaf r2 = r3.f38587g     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.zzuf r4 = r3.f38583c     // Catch:{ all -> 0x003e }
            int r0 = r3.f38596p     // Catch:{ all -> 0x003e }
            int r2 = r3.f38598r     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo48258a(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zztw r4 = (com.google.android.gms.internal.ads.zztw) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r4 = r4.f38576a     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r0 = r3.f38587g     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f38598r     // Catch:{ all -> 0x003e }
            int r4 = r3.m55078g(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m55088q(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.mo48238J(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo48239K(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m55086o()     // Catch:{ all -> 0x003d }
            int r0 = r8.f38598r     // Catch:{ all -> 0x003d }
            int r2 = r8.m55078g(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.m55087p()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.f38593m     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.f38601u     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.f38595o     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m55077L(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.f38599s = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.f38598r     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.f38598r = r9     // Catch:{ all -> 0x003d }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.mo48239K(long, boolean):boolean");
    }

    /* renamed from: a */
    public final /* synthetic */ int mo41211a(zzr zzr, int i, boolean z) {
        return zzaan.m40937a(this, zzr, i, z);
    }

    /* renamed from: b */
    public final int mo41212b(zzr zzr, int i, boolean z, int i2) throws IOException {
        return this.f38581a.mo48222a(zzr, i, z);
    }

    /* renamed from: c */
    public final void mo41213c(zzef zzef, int i, int i2) {
        this.f38581a.mo48229h(zzef, i);
    }

    /* renamed from: d */
    public final void mo41214d(zzaf zzaf) {
        this.f38605y = zzaf;
        boolean r = m55089r(zzaf);
        zztx zztx = this.f38586f;
        if (zztx != null && r) {
            zztx.mo48206j(zzaf);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo41215e(zzef zzef, int i) {
        zzaan.m40938b(this, zzef, i);
    }

    /* renamed from: f */
    public final void mo41216f(long j, int i, int i2, int i3, @Nullable zzaao zzaao) {
        int i4 = i & 1;
        if (this.f38603w) {
            if (i4 != 0) {
                this.f38603w = false;
            } else {
                return;
            }
        }
        if (this.f38578A) {
            if (j >= this.f38599s) {
                if (i4 == 0) {
                    if (!this.f38579B) {
                        zzdw.m48255e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f38606z)));
                        this.f38579B = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        m55083l(j, i, (this.f38581a.mo48223b() - ((long) i2)) - ((long) i3), i2, zzaao);
    }

    /* renamed from: s */
    public final int mo48240s() {
        return this.f38596p + this.f38598r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo48241t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f38598r     // Catch:{ all -> 0x0038 }
            int r2 = r8.m55078g(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.m55087p()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.f38593m     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.f38601u     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.f38595o     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.f38595o     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m55077L(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.mo48241t(long, boolean):int");
    }

    /* renamed from: u */
    public final int mo48242u() {
        return this.f38596p + this.f38595o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    @androidx.annotation.CallSuper
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48243v(com.google.android.gms.internal.ads.zzjg r9, com.google.android.gms.internal.ads.zzgi r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zztu r7 = r8.f38582b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m55079h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo46725g()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzts r9 = r8.f38581a
            com.google.android.gms.internal.ads.zztu r11 = r8.f38582b
            r9.mo48225d(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.zzts r9 = r8.f38581a
            com.google.android.gms.internal.ads.zztu r11 = r8.f38582b
            r9.mo48226e(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f38598r
            int r9 = r9 + r1
            r8.f38598r = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.mo48243v(com.google.android.gms.internal.ads.zzjg, com.google.android.gms.internal.ads.zzgi, int, boolean):int");
    }

    /* renamed from: w */
    public final synchronized long mo48244w() {
        return this.f38601u;
    }

    @Nullable
    /* renamed from: x */
    public final synchronized zzaf mo48245x() {
        if (this.f38604x) {
            return null;
        }
        return this.f38606z;
    }

    /* renamed from: y */
    public final void mo48246y(long j, boolean z, boolean z2) {
        this.f38581a.mo48224c(m55080i(j, false, z2));
    }

    /* renamed from: z */
    public final void mo48247z() {
        this.f38581a.mo48224c(m55081j());
    }
}
