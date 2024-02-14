package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzasu implements Handler.Callback, zzayb, zzazg, zzayd {

    /* renamed from: A */
    private final zzatf f25466A;

    /* renamed from: B */
    private zzasr f25467B;

    /* renamed from: C */
    private zzata f25468C;

    /* renamed from: D */
    private zzatb f25469D;

    /* renamed from: E */
    private zzbag f25470E;

    /* renamed from: F */
    private zzaye f25471F;

    /* renamed from: G */
    private zzatb[] f25472G;

    /* renamed from: H */
    private boolean f25473H;

    /* renamed from: I */
    private boolean f25474I;

    /* renamed from: J */
    private boolean f25475J;

    /* renamed from: K */
    private boolean f25476K;

    /* renamed from: L */
    private int f25477L;

    /* renamed from: M */
    private int f25478M = 0;

    /* renamed from: N */
    private int f25479N;

    /* renamed from: O */
    private int f25480O;

    /* renamed from: P */
    private long f25481P;

    /* renamed from: Q */
    private int f25482Q;

    /* renamed from: R */
    private zzass f25483R;

    /* renamed from: S */
    private long f25484S;

    /* renamed from: T */
    private zzasq f25485T;

    /* renamed from: U */
    private zzasq f25486U;

    /* renamed from: V */
    private zzasq f25487V;

    /* renamed from: W */
    private zzath f25488W;

    /* renamed from: X */
    private boolean f25489X;

    /* renamed from: Y */
    private boolean f25490Y;

    /* renamed from: Z */
    private int f25491Z;

    /* renamed from: a */
    private final zzatb[] f25492a;

    /* renamed from: a0 */
    private volatile int f25493a0;

    /* renamed from: b0 */
    private volatile int f25494b0;

    /* renamed from: c */
    private final zzatc[] f25495c;

    /* renamed from: c0 */
    private final zzcjv f25496c0;

    /* renamed from: d */
    private final zzazh f25497d;

    /* renamed from: f */
    private final zzban f25498f;

    /* renamed from: g */
    private final Handler f25499g;

    /* renamed from: o */
    private final HandlerThread f25500o;

    /* renamed from: p */
    private final Handler f25501p;

    /* renamed from: s */
    private final zzasm f25502s;

    /* renamed from: z */
    private final zzatg f25503z;

    public zzasu(zzatb[] zzatbArr, zzazh zzazh, zzcjv zzcjv, boolean z, int i, Handler handler, zzasr zzasr, zzasm zzasm, byte[] bArr) {
        this.f25492a = zzatbArr;
        this.f25497d = zzazh;
        this.f25496c0 = zzcjv;
        this.f25474I = z;
        this.f25501p = handler;
        this.f25477L = 1;
        this.f25467B = zzasr;
        this.f25502s = zzasm;
        this.f25495c = new zzatc[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzatbArr[i2].mo41884R(i2);
            this.f25495c[i2] = zzatbArr[i2].mo41891c();
        }
        this.f25498f = new zzban();
        this.f25472G = new zzatb[0];
        this.f25503z = new zzatg();
        this.f25466A = new zzatf();
        zzazh.mo42278c(this);
        this.f25468C = zzata.f25533d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f25500o = handlerThread;
        handlerThread.start();
        this.f25499g = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: L */
    private final int m42326L(int i, zzath zzath, zzath zzath2) {
        int b = zzath.mo41986b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = zzath.mo41990f(i, this.f25466A, this.f25503z, this.f25478M);
            i2 = zzath2.mo41985a(zzath.mo41988d(i, this.f25466A, true).f25540b);
        }
        return i2;
    }

    /* renamed from: M */
    private final long m42327M(int i, long j) throws zzasi {
        zzasq zzasq;
        m42345q();
        this.f25475J = false;
        m42342n(2);
        zzasq zzasq2 = this.f25487V;
        if (zzasq2 == null) {
            zzasq zzasq3 = this.f25485T;
            if (zzasq3 != null) {
                zzasq3.mo41940c();
            }
            zzasq = null;
        } else {
            zzasq = null;
            while (zzasq2 != null) {
                if (zzasq2.f25442g != i || !zzasq2.f25445j) {
                    zzasq2.mo41940c();
                } else {
                    zzasq = zzasq2;
                }
                zzasq2 = zzasq2.f25447l;
            }
        }
        zzasq zzasq4 = this.f25487V;
        if (!(zzasq4 == zzasq && zzasq4 == this.f25486U)) {
            for (zzatb h : this.f25472G) {
                h.mo41895h();
            }
            this.f25472G = new zzatb[0];
            this.f25470E = null;
            this.f25469D = null;
            this.f25487V = null;
        }
        if (zzasq != null) {
            zzasq.f25447l = null;
            this.f25485T = zzasq;
            this.f25486U = zzasq;
            m42341m(zzasq);
            zzasq zzasq5 = this.f25487V;
            if (zzasq5.f25446k) {
                j = zzasq5.f25436a.mo42213g(j);
            }
            m42338j(j);
            m42334c();
        } else {
            this.f25485T = null;
            this.f25486U = null;
            this.f25487V = null;
            m42338j(j);
        }
        this.f25499g.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: N */
    private final Pair m42328N(int i, long j) {
        return m42329O(this.f25488W, 0, -9223372036854775807L);
    }

    /* renamed from: O */
    private final Pair m42329O(zzath zzath, int i, long j) {
        return m42330P(zzath, 0, j, 0);
    }

    /* renamed from: P */
    private final Pair m42330P(zzath zzath, int i, long j, long j2) {
        zzbac.m42922a(0, 0, zzath.mo41987c());
        zzath.mo41989e(0, this.f25503z, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = zzath.mo41988d(0, this.f25466A, false).f25541c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: Q */
    private final Pair m42331Q(zzass zzass) {
        zzath zzath = zzass.f25459a;
        if (zzath.mo41992h()) {
            zzath = this.f25488W;
        }
        try {
            Pair O = m42329O(zzath, 0, zzass.f25461c);
            zzath zzath2 = this.f25488W;
            if (zzath2 == zzath) {
                return O;
            }
            if (zzath2.mo41985a(zzath.mo41988d(((Integer) O.first).intValue(), this.f25466A, true).f25540b) != -1) {
                return Pair.create(0, (Long) O.second);
            }
            if (m42326L(((Integer) O.first).intValue(), zzath, this.f25488W) == -1) {
                return null;
            }
            this.f25488W.mo41988d(0, this.f25466A, false);
            return m42328N(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzasy(this.f25488W, 0, zzass.f25461c);
        }
    }

    /* renamed from: R */
    private final void m42332R(boolean[] zArr, int i) throws zzasi {
        int i2;
        this.f25472G = new zzatb[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            zzatb zzatb = this.f25492a[i3];
            zzayx a = this.f25487V.f25448m.f26346b.mo42274a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.f25472G[i4] = zzatb;
                if (zzatb.zzb() == 0) {
                    zzatd zzatd = this.f25487V.f25448m.f26348d[i3];
                    boolean z = this.f25474I && this.f25477L == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.mo42263b();
                    zzasw[] zzaswArr = new zzasw[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzaswArr[i6] = a.mo42264c(i6);
                    }
                    zzasq zzasq = this.f25487V;
                    i2 = i3;
                    zzatb.mo41888Y(zzatd, zzaswArr, zzasq.f25439d[i3], this.f25484S, z2, zzasq.f25441f - zzasq.f25443h);
                    zzbag g = zzatb.mo41894g();
                    if (g != null) {
                        if (this.f25470E == null) {
                            this.f25470E = g;
                            this.f25469D = zzatb;
                            g.mo42051X(this.f25468C);
                        } else {
                            throw zzasi.m42277c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        zzatb.mo41882H();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: a */
    private final void m42333a(Object obj, int i) {
        this.f25467B = new zzasr(0, 0);
        m42336f(obj, i);
        this.f25467B = new zzasr(0, -9223372036854775807L);
        m42342n(4);
        m42337g(false);
    }

    /* renamed from: c */
    private final void m42334c() {
        long j;
        zzasq zzasq = this.f25485T;
        if (!zzasq.f25445j) {
            j = 0;
        } else {
            j = zzasq.f25436a.zza();
        }
        if (j == Long.MIN_VALUE) {
            m42340l(false);
            return;
        }
        zzasq zzasq2 = this.f25485T;
        long j2 = this.f25484S - (zzasq2.f25441f - zzasq2.f25443h);
        boolean j3 = this.f25496c0.mo43844j(j - j2);
        m42340l(j3);
        if (j3) {
            this.f25485T.f25436a.mo42190a(j2);
        }
    }

    /* renamed from: d */
    private final void m42335d() throws IOException {
        zzasq zzasq = this.f25485T;
        if (zzasq != null && !zzasq.f25445j) {
            zzasq zzasq2 = this.f25486U;
            if (zzasq2 == null || zzasq2.f25447l == zzasq) {
                zzatb[] zzatbArr = this.f25472G;
                int length = zzatbArr.length;
                int i = 0;
                while (i < length) {
                    if (zzatbArr[i].mo41881F()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f25485T.f25436a.mo42221p();
            }
        }
    }

    /* renamed from: f */
    private final void m42336f(Object obj, int i) {
        this.f25501p.obtainMessage(6, new zzast(this.f25488W, obj, this.f25467B, i)).sendToTarget();
    }

    /* renamed from: g */
    private final void m42337g(boolean z) {
        this.f25499g.removeMessages(2);
        this.f25475J = false;
        this.f25498f.mo42345c();
        this.f25470E = null;
        this.f25469D = null;
        this.f25484S = 60000000;
        for (zzatb zzatb : this.f25472G) {
            try {
                m42349u(zzatb);
                zzatb.mo41895h();
            } catch (zzasi | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f25472G = new zzatb[0];
        zzasq zzasq = this.f25487V;
        if (zzasq == null) {
            zzasq = this.f25485T;
        }
        m42350v(zzasq);
        this.f25485T = null;
        this.f25486U = null;
        this.f25487V = null;
        m42340l(false);
        if (z) {
            zzaye zzaye = this.f25471F;
            if (zzaye != null) {
                zzaye.mo42228d();
                this.f25471F = null;
            }
            this.f25488W = null;
        }
    }

    /* renamed from: j */
    private final void m42338j(long j) throws zzasi {
        long j2;
        zzasq zzasq = this.f25487V;
        if (zzasq == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + (zzasq.f25441f - zzasq.f25443h);
        }
        this.f25484S = j2;
        this.f25498f.mo42343a(j2);
        for (zzatb U : this.f25472G) {
            U.mo41886U(this.f25484S);
        }
    }

    /* renamed from: k */
    private final void m42339k(long j, long j2) {
        this.f25499g.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f25499g.sendEmptyMessage(2);
        } else {
            this.f25499g.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: l */
    private final void m42340l(boolean z) {
        if (this.f25476K != z) {
            this.f25476K = z;
            this.f25501p.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: m */
    private final void m42341m(zzasq zzasq) throws zzasi {
        if (this.f25487V != zzasq) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                zzatb zzatb = this.f25492a[i2];
                zArr[i2] = zzatb.zzb() != 0;
                zzayx a = zzasq.f25448m.f26346b.mo42274a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (zzatb.mo41887V() && zzatb.mo41892e() == this.f25487V.f25439d[i2]))) {
                    if (zzatb == this.f25469D) {
                        this.f25498f.mo42346d(this.f25470E);
                        this.f25470E = null;
                        this.f25469D = null;
                    }
                    m42349u(zzatb);
                    zzatb.mo41895h();
                }
            }
            this.f25487V = zzasq;
            this.f25501p.obtainMessage(3, zzasq.f25448m).sendToTarget();
            m42332R(zArr, i);
        }
    }

    /* renamed from: n */
    private final void m42342n(int i) {
        if (this.f25477L != i) {
            this.f25477L = i;
            this.f25501p.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: o */
    private final void m42343o() throws zzasi {
        this.f25475J = false;
        this.f25498f.mo42344b();
        for (zzatb H : this.f25472G) {
            H.mo41882H();
        }
    }

    /* renamed from: p */
    private final void m42344p() {
        m42337g(true);
        this.f25496c0.mo43837c();
        m42342n(1);
    }

    /* renamed from: q */
    private final void m42345q() throws zzasi {
        this.f25498f.mo42345c();
        for (zzatb u : this.f25472G) {
            m42349u(u);
        }
    }

    /* renamed from: r */
    private final void m42346r() throws zzasi {
        long j;
        zzasq zzasq = this.f25487V;
        if (zzasq != null) {
            long e = zzasq.f25436a.mo42211e();
            if (e != -9223372036854775807L) {
                m42338j(e);
            } else {
                zzatb zzatb = this.f25469D;
                if (zzatb == null || zzatb.mo41979P()) {
                    this.f25484S = this.f25498f.mo42050S();
                } else {
                    long S = this.f25470E.mo42050S();
                    this.f25484S = S;
                    this.f25498f.mo42343a(S);
                }
                zzasq zzasq2 = this.f25487V;
                e = this.f25484S - (zzasq2.f25441f - zzasq2.f25443h);
            }
            this.f25467B.f25457c = e;
            this.f25481P = SystemClock.elapsedRealtime() * 1000;
            if (this.f25472G.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f25487V.f25436a.mo42212f();
            }
            zzasr zzasr = this.f25467B;
            if (j == Long.MIN_VALUE) {
                j = this.f25488W.mo41988d(this.f25487V.f25442g, this.f25466A, false).f25541c;
            }
            zzasr.f25458d = j;
        }
    }

    /* renamed from: s */
    private final boolean m42347s(int i) {
        this.f25488W.mo41988d(i, this.f25466A, false);
        this.f25488W.mo41991g(0, this.f25503z, false);
        if (this.f25488W.mo41990f(i, this.f25466A, this.f25503z, this.f25478M) == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.f25487V.f25447l;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m42348t(long r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzasr r2 = r5.f25467B
            long r2 = r2.f25457c
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzasq r6 = r5.f25487V
            com.google.android.gms.internal.ads.zzasq r6 = r6.f25447l
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f25445j
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.m42348t(long):boolean");
    }

    /* renamed from: u */
    private static final void m42349u(zzatb zzatb) throws zzasi {
        if (zzatb.zzb() == 2) {
            zzatb.mo41883I();
        }
    }

    /* renamed from: v */
    private static final void m42350v(zzasq zzasq) {
        while (zzasq != null) {
            zzasq.mo41940c();
            zzasq = zzasq.f25447l;
        }
    }

    /* renamed from: A */
    public final void mo41943A(zzaye zzaye, boolean z) {
        this.f25499g.obtainMessage(0, 1, 0, zzaye).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41944B() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f25473H     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f25499g     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f25473H     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f25500o     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.mo41944B():void");
    }

    /* renamed from: C */
    public final void mo41945C(zzath zzath, int i, long j) {
        this.f25499g.obtainMessage(3, new zzass(zzath, 0, j)).sendToTarget();
    }

    /* renamed from: D */
    public final void mo41946D(zzasl... zzaslArr) {
        if (this.f25473H) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f25479N++;
        this.f25499g.obtainMessage(11, zzaslArr).sendToTarget();
    }

    /* renamed from: E */
    public final void mo41947E(int i) {
        this.f25494b0 = i;
    }

    /* renamed from: F */
    public final void mo41948F(int i) {
        this.f25493a0 = i;
    }

    /* renamed from: G */
    public final void mo41949G(boolean z) {
        this.f25499g.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: H */
    public final void mo41950H() {
        this.f25499g.sendEmptyMessage(5);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41951I(com.google.android.gms.internal.ads.zzasl... r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f25473H     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r9)
            return r1
        L_0x0008:
            int r0 = r9.f25479N     // Catch:{ all -> 0x0044 }
            int r2 = r0 + 1
            r9.f25479N = r2     // Catch:{ all -> 0x0044 }
            android.os.Handler r2 = r9.f25499g     // Catch:{ all -> 0x0044 }
            r3 = 11
            android.os.Message r10 = r2.obtainMessage(r3, r10)     // Catch:{ all -> 0x0044 }
            r10.sendToTarget()     // Catch:{ all -> 0x0044 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            int r10 = r9.f25491Z     // Catch:{ all -> 0x0044 }
            long r4 = (long) r10     // Catch:{ all -> 0x0044 }
            long r2 = r2 + r4
        L_0x0021:
            int r10 = r9.f25480O     // Catch:{ all -> 0x0044 }
            if (r10 > r0) goto L_0x003d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x003d
            r9.wait(r4)     // Catch:{ InterruptedException -> 0x002f }
            goto L_0x0036
        L_0x002f:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0044 }
            r10.interrupt()     // Catch:{ all -> 0x0044 }
        L_0x0036:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r2 - r4
            goto L_0x0021
        L_0x003d:
            if (r0 >= r10) goto L_0x0041
            monitor-exit(r9)
            return r1
        L_0x0041:
            r10 = 0
            monitor-exit(r9)
            return r10
        L_0x0044:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.mo41951I(com.google.android.gms.internal.ads.zzasl[]):boolean");
    }

    /* renamed from: J */
    public final boolean mo41952J() {
        return this.f25490Y && this.f25491Z > 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|27|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41953K() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f25473H     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0008
            r0 = 1
            monitor-exit(r7)
            return r0
        L_0x0008:
            android.os.Handler r0 = r7.f25499g     // Catch:{ all -> 0x003b }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x003b }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            int r2 = r7.f25491Z     // Catch:{ all -> 0x003b }
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            long r0 = r0 + r2
        L_0x0016:
            boolean r4 = r7.f25473H     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0032
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0037
            r7.wait(r2)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003b }
            r2.interrupt()     // Catch:{ all -> 0x003b }
        L_0x002b:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            long r2 = r0 - r2
            goto L_0x0016
        L_0x0032:
            android.os.HandlerThread r0 = r7.f25500o     // Catch:{ all -> 0x003b }
            r0.quit()     // Catch:{ all -> 0x003b }
        L_0x0037:
            boolean r0 = r7.f25473H     // Catch:{ all -> 0x003b }
            monitor-exit(r7)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.mo41953K():boolean");
    }

    /* renamed from: b */
    public final void mo41954b(zzath zzath, Object obj) {
        this.f25499g.obtainMessage(7, Pair.create(zzath, (Object) null)).sendToTarget();
    }

    /* renamed from: e */
    public final void mo41955e() {
        this.f25499g.sendEmptyMessage(10);
    }

    /* renamed from: h */
    public final void mo41956h(zzayc zzayc) {
        this.f25499g.obtainMessage(8, zzayc).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0798, code lost:
        if (m42348t(r1) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x087f, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f25501p.obtainMessage(8, com.google.android.gms.internal.ads.zzasi.m42277c(r1)).sendToTarget();
        m42344p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x089b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x089c, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08b9, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0268 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026c A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0271 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ea A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0508 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050b A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0558 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0572 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }, LOOP:8: B:317:0x0572->B:321:0x0582, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c7 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x087e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ zzasi -> 0x08b8, IOException -> 0x089b, RuntimeException -> 0x087e }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x083d;
                case 1: goto L_0x080e;
                case 2: goto L_0x0429;
                case 3: goto L_0x038a;
                case 4: goto L_0x036c;
                case 5: goto L_0x0368;
                case 6: goto L_0x0351;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25478M = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.zzasq r4 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.zzath r11 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r13 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatg r14 = r8.f25503z     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.mo41990f(r12, r13, r14, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0042:
            com.google.android.gms.internal.ads.zzasq r12 = r2.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r11 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatg r14 = r8.f25503z     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r2.mo41990f(r13, r11, r14, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            m42350v(r12)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f25447l = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x006f:
            int r5 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r5 = r8.m42347s(r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f25444i = r5     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != 0) goto L_0x007b
            r8.f25485T = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r3 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r8.m42327M(r2, r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r5 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r2, r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r5     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0092:
            int r2 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.m42342n(r7)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasl[] r1 = (com.google.android.gms.internal.ads.zzasl[]) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.zzask r4 = r3.f25411a     // Catch:{ all -> 0x00c9 }
            int r5 = r3.f25412b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f25413c     // Catch:{ all -> 0x00c9 }
            r4.mo41893f(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.zzaye r1 = r8.f25471F     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.f25499g     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r8.f25480O     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.f25480O = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.f25480O     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.f25480O = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00da:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x01b5
            r2 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x01b5
            boolean r3 = r1.f25445j     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b5
        L_0x00e7:
            boolean r3 = r1.mo41942e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            com.google.android.gms.internal.ads.zzasq r3 = r3.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m42350v(r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f25447l = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25485T = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25486U = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean[] r4 = new boolean[r7]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r5 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r3.mo41939b(r11, r2, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r5 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzasr r5 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.f25457c = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42338j(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 0
            r5 = 0
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.zzatb[] r11 = r8.f25492a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r11[r3]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.zzb()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r2[r3] = r12     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r13 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayo[] r13 = r13.f25439d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r3]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzayo r12 = r11.mo41892e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.zzatb r12 = r8.f25469D     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzban r12 = r8.f25498f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzbag r13 = r8.f25470E     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.mo42346d(r13)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0152:
            r8.f25470E = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25469D = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0156:
            m42349u(r11)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo41895h()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo41886U(r12)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazi r1 = r1.f25448m     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42332R(r2, r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x019d
        L_0x0178:
            r8.f25485T = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            r1.mo41940c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x017c
        L_0x0184:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.f25447l = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.f25445j     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x019d
            long r2 = r1.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo41938a(r1, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x019d:
            r33.m42334c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42346r()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f25499g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r7)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x01b5
        L_0x01a9:
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != r3) goto L_0x01af
            r3 = 0
            goto L_0x01b0
        L_0x01af:
            r3 = 1
        L_0x01b0:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.zzasq r1 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x00df
        L_0x01b5:
            return r10
        L_0x01b6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayc r1 = (com.google.android.gms.internal.ads.zzayc) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.zzayc r2 = r2.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r1) goto L_0x01c5
            r33.m42334c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01c5:
            return r10
        L_0x01c6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayc r1 = (com.google.android.gms.internal.ads.zzayc) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.zzayc r3 = r2.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == r1) goto L_0x01d3
            goto L_0x01f5
        L_0x01d3:
            r2.f25445j = r10     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41942e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.mo41938a(r3, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f25443h = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x01f2
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25486U = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42338j(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42341m(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f2:
            r33.m42334c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f5:
            return r10
        L_0x01f6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r1.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r3 = (com.google.android.gms.internal.ads.zzath) r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25488W = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0263
            int r4 = r8.f25482Q     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 <= 0) goto L_0x0235
            com.google.android.gms.internal.ads.zzass r3 = r8.f25483R     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r3 = r8.m42331Q(r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r8.f25482Q     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25482Q = r9     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25483R = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x021d
            r8.m42333a(r1, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x021d:
            com.google.android.gms.internal.ads.zzasr r7 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.intValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7.<init>(r11, r14)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r7     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0264
        L_0x0235:
            com.google.android.gms.internal.ads.zzasr r4 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r4.f25456b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0263
            boolean r3 = r3.mo41992h()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0248
            r8.m42333a(r1, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0248:
            android.util.Pair r3 = r8.m42328N(r9, r12)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r4 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r7 = r3.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.intValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4.<init>(r7, r14)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r4     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0263:
            r4 = 0
        L_0x0264:
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x026a
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x026a:
            if (r3 != 0) goto L_0x0271
            r8.m42336f(r1, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0271:
            com.google.android.gms.internal.ads.zzath r7 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.f25437b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.mo41985a(r11)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != r5) goto L_0x02d4
            int r6 = r3.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r7 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.m42326L(r6, r2, r7)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r5) goto L_0x028a
            r8.m42333a(r1, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x028a:
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r6 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41988d(r9, r6, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r2 = r8.m42328N(r9, r12)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r6 = r2.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = r6.intValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r2.longValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r7 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41988d(r6, r7, r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r2 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.f25540b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f25442g = r5     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02b2:
            com.google.android.gms.internal.ads.zzasq r3 = r3.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r7 = r3.f25437b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r7.equals(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r10 == r7) goto L_0x02c0
            r7 = -1
            goto L_0x02c1
        L_0x02c0:
            r7 = r6
        L_0x02c1:
            r3.f25442g = r7     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x02b2
        L_0x02c4:
            long r2 = r8.m42327M(r6, r11)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r5 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r6, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r5     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42336f(r1, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x02d4:
            boolean r2 = r8.m42347s(r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f25442g = r9     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f25444i = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != r2) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            com.google.android.gms.internal.ads.zzasr r11 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.f25455a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.zzasr r12 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f25456b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.<init>(r9, r13)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f25457c = r13     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f25458d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f25458d = r13     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r12     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02fa:
            com.google.android.gms.internal.ads.zzasq r11 = r3.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 == 0) goto L_0x034d
            com.google.android.gms.internal.ads.zzath r12 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r13 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatg r14 = r8.f25503z     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f25478M     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r12.mo41990f(r7, r13, r14, r15)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == r5) goto L_0x0330
            java.lang.Object r12 = r11.f25437b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r13 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r14 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r13 = r13.mo41988d(r7, r14, r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r13 = r13.f25540b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r12 = r12.equals(r13)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0330
            boolean r3 = r8.m42347s(r7)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f25442g = r7     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f25444i = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r3) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02fa
        L_0x0330:
            if (r2 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r3 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r3.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r8.m42327M(r2, r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r3 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.<init>(r2, r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x034d
        L_0x0346:
            r8.f25485T = r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f25447l = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m42350v(r11)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x034d:
            r8.m42336f(r1, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0350:
            return r10
        L_0x0351:
            r8.m42337g(r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcjv r1 = r8.f25496c0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo43836b()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42342n(r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            monitor-enter(r33)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25473H = r10     // Catch:{ all -> 0x0364 }
            r33.notifyAll()     // Catch:{ all -> 0x0364 }
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            return r10
        L_0x0364:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            throw r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0368:
            r33.m42344p()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzata r1 = (com.google.android.gms.internal.ads.zzata) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzbag r2 = r8.f25470E     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0379
            com.google.android.gms.internal.ads.zzata r1 = r2.mo42051X(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x037e
        L_0x0379:
            com.google.android.gms.internal.ads.zzban r2 = r8.f25498f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo42051X(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x037e:
            r8.f25468C = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzass r1 = (com.google.android.gms.internal.ads.zzass) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x039b
            int r2 = r8.f25482Q     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r8.f25482Q = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25483R = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x039b:
            android.util.Pair r2 = r8.m42331Q(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.zzasr r1 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r1 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r12)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42342n(r15)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42337g(r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03bf:
            long r3 = r1.f25461c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            r1 = 1
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            java.lang.Object r3 = r2.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.intValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.longValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r2 = r8.f25467B     // Catch:{ all -> 0x0416 }
            int r6 = r2.f25455a     // Catch:{ all -> 0x0416 }
            if (r3 != r6) goto L_0x03fb
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.f25457c     // Catch:{ all -> 0x0416 }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03fb
            com.google.android.gms.internal.ads.zzasr r2 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x03f7:
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03fb:
            long r6 = r8.m42327M(r3, r4)     // Catch:{ all -> 0x0416 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0405
            r2 = 1
            goto L_0x0406
        L_0x0405:
            r2 = 0
        L_0x0406:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzasr r2 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r6)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x03f7
        L_0x0415:
            return r10
        L_0x0416:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzasr r6 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6.<init>(r3, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r6     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            throw r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0429:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r1 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.zzaye r1 = r8.f25471F     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r5
            goto L_0x0677
        L_0x043b:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0444
            com.google.android.gms.internal.ads.zzasr r1 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f25455a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0479
        L_0x0444:
            int r2 = r1.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r1.f25444i     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0553
            boolean r1 = r1.mo41941d()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.zzath r1 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r7 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r1 = r1.mo41988d(r2, r7, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f25541c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x046d
            com.google.android.gms.internal.ads.zzasq r7 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.f25438c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f25438c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0553
        L_0x046d:
            com.google.android.gms.internal.ads.zzath r1 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r7 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatg r14 = r8.f25503z     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f25478M     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.mo41990f(r2, r7, r14, r15)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0479:
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.mo41986b()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 < r2) goto L_0x0488
            com.google.android.gms.internal.ads.zzaye r1 = r8.f25471F     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0553
        L_0x0488:
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0493
            com.google.android.gms.internal.ads.zzasr r2 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0490:
            r11 = r5
            r15 = 2
            goto L_0x04e6
        L_0x0493:
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r7 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41988d(r1, r7, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatg r7 = r8.f25503z     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41991g(r9, r7, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x04a4
            goto L_0x0490
        L_0x04a4:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r7 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r1 = r2.mo41988d(r1, r7, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f25541c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 + r1
            long r1 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.m42330P(r2, r3, r4, r6)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0554
            java.lang.Object r2 = r1.first     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.intValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r1.longValue()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r2
        L_0x04e6:
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x04f1
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04ee:
            r21 = r5
            goto L_0x0504
        L_0x04f1:
            long r5 = r2.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.zzath r7 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r13 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r2 = r7.mo41988d(r2, r13, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f25541c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 + r13
            goto L_0x04ee
        L_0x0504:
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x050b
            r27 = 0
            goto L_0x0510
        L_0x050b:
            int r2 = r2.f25438c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r27 = r2
        L_0x0510:
            boolean r29 = r8.m42347s(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzath r2 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r5 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo41988d(r1, r5, r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = new com.google.android.gms.internal.ads.zzasq     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatb[] r5 = r8.f25492a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatc[] r6 = r8.f25495c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazh r7 = r8.f25497d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcjv r13 = r8.f25496c0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaye r14 = r8.f25471F     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r15 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r15 = r15.f25540b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0548
            r1.f25447l = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0548:
            r8.f25485T = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayc r1 = r2.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo42210d(r8, r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42340l(r10)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0554
        L_0x0553:
            r11 = r5
        L_0x0554:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056b
            boolean r1 = r1.mo41941d()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x055f
            goto L_0x056b
        L_0x055f:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056e
            boolean r1 = r8.f25476K     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x056e
            r33.m42334c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x056e
        L_0x056b:
            r8.m42340l(r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x056e:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0677
        L_0x0572:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == r2) goto L_0x05a9
            long r3 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r5 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05a9
            r1.mo41940c()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42341m(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r1 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r3, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42346r()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 5
            com.google.android.gms.internal.ads.zzasr r3 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0572
        L_0x05a9:
            boolean r1 = r2.f25444i     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x05cf
            r1 = 0
        L_0x05ae:
            r2 = 2
            if (r1 >= r2) goto L_0x0677
            com.google.android.gms.internal.ads.zzatb[] r2 = r8.f25492a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayo[] r3 = r3.f25439d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            com.google.android.gms.internal.ads.zzayo r4 = r2.mo41892e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x05cc
            boolean r3 = r2.mo41881F()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            r2.mo41908w()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05ae
        L_0x05cf:
            r1 = 0
        L_0x05d0:
            r2 = 2
            if (r1 >= r2) goto L_0x05ee
            com.google.android.gms.internal.ads.zzatb[] r2 = r8.f25492a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayo[] r3 = r3.f25439d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayo r4 = r2.mo41892e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x0677
            if (r3 == 0) goto L_0x05eb
            boolean r2 = r2.mo41881F()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
        L_0x05eb:
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05ee:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r1.f25447l     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
            boolean r3 = r2.f25445j     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0677
            com.google.android.gms.internal.ads.zzazi r1 = r1.f25448m     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25486U = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazi r3 = r2.f25448m     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayc r2 = r2.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.mo42211e()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 0
            r6 = 2
        L_0x0606:
            if (r2 >= r6) goto L_0x0677
            com.google.android.gms.internal.ads.zzatb[] r6 = r8.f25492a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6 = r6[r2]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazf r7 = r1.f26346b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayx r7 = r7.mo42274a(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0619
        L_0x0614:
            r19 = r3
            r20 = r4
            goto L_0x066d
        L_0x0619:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0626
            r6.mo41908w()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0614
        L_0x0626:
            boolean r7 = r6.mo41887V()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0614
            com.google.android.gms.internal.ads.zzazf r7 = r3.f26346b     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayx r7 = r7.mo42274a(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatd[] r13 = r1.f26348d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r2]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatd[] r14 = r3.f26348d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == 0) goto L_0x0666
            boolean r13 = r14.equals(r13)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x0666
            r7.mo42263b()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasw[] r13 = new com.google.android.gms.internal.ads.zzasw[r10]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = 0
        L_0x0648:
            if (r14 > 0) goto L_0x0653
            com.google.android.gms.internal.ads.zzasw r15 = r7.mo42264c(r14)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13[r14] = r15     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r14 = r14 + 1
            goto L_0x0648
        L_0x0653:
            com.google.android.gms.internal.ads.zzasq r7 = r8.f25486U     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayo[] r14 = r7.f25439d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r7.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r19 = r3
            r20 = r4
            long r3 = r7.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r3
            r6.mo41885T(r13, r14, r9)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x066d
        L_0x0666:
            r19 = r3
            r20 = r4
            r6.mo41908w()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x066d:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x0606
        L_0x0677:
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 10
            if (r1 != 0) goto L_0x0686
            r33.m42335d()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m42339k(r11, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0683:
            r1 = 1
            goto L_0x080d
        L_0x0686:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzbap.m42983a(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42346r()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r1 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayc r1 = r1.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r4 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r4.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo42217l(r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatb[] r1 = r8.f25472G     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r1.length     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x069f:
            if (r7 >= r4) goto L_0x06d6
            r9 = r1[r7]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r8.f25481P     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9.mo41980W(r13, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x06b4
            boolean r2 = r9.mo41979P()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06b4
            r6 = 1
            goto L_0x06b5
        L_0x06b4:
            r6 = 0
        L_0x06b5:
            boolean r2 = r9.mo41981t()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06c4
            boolean r2 = r9.mo41979P()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06c2
            goto L_0x06c4
        L_0x06c2:
            r2 = 0
            goto L_0x06c5
        L_0x06c4:
            r2 = 1
        L_0x06c5:
            if (r2 != 0) goto L_0x06ca
            r9.mo41898k()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06ca:
            if (r5 == 0) goto L_0x06d0
            if (r2 == 0) goto L_0x06d0
            r5 = 1
            goto L_0x06d1
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x069f
        L_0x06d6:
            if (r5 != 0) goto L_0x06db
            r33.m42335d()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06db:
            com.google.android.gms.internal.ads.zzbag r1 = r8.f25470E     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.zzata r1 = r1.mo42049Q()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzata r2 = r8.f25468C     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.equals(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06fe
            r8.f25468C = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzban r2 = r8.f25498f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzbag r3 = r8.f25470E     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo42346d(r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06fe:
            com.google.android.gms.internal.ads.zzath r1 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r3 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            com.google.android.gms.internal.ads.zzatf r1 = r1.mo41988d(r2, r3, r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f25541c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x072f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0720
            com.google.android.gms.internal.ads.zzasr r3 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f25457c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x072f
        L_0x0720:
            com.google.android.gms.internal.ads.zzasq r3 = r8.f25487V     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r3.f25444i     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x072f
            r3 = 4
            r8.m42342n(r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42345q()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x072f:
            int r3 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 2
            if (r3 != r4) goto L_0x07a6
            com.google.android.gms.internal.ads.zzatb[] r3 = r8.f25472G     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x0794
            if (r5 == 0) goto L_0x07c0
            boolean r1 = r8.f25475J     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f25445j     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x0746
            long r2 = r2.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x074c
        L_0x0746:
            com.google.android.gms.internal.ads.zzayc r2 = r2.f25436a     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.mo42212f()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x074c:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0766
            com.google.android.gms.internal.ads.zzasq r2 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f25444i     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0759
            goto L_0x079a
        L_0x0759:
            com.google.android.gms.internal.ads.zzath r3 = r8.f25488W     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f25442g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzatf r4 = r8.f25466A     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 0
            com.google.android.gms.internal.ads.zzatf r2 = r3.mo41988d(r2, r4, r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.f25541c     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0766:
            boolean r4 = r8.f25489X     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 == 0) goto L_0x0780
            com.google.android.gms.internal.ads.zzcjv r2 = r8.f25496c0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasr r3 = r8.f25467B     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f25458d     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r5 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.mo43845k(r3, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0791
        L_0x0780:
            com.google.android.gms.internal.ads.zzcjv r4 = r8.f25496c0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasq r5 = r8.f25485T     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f25484S     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f25441f     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f25443h     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.mo43845k(r2, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0791:
            if (r1 == 0) goto L_0x07c0
            goto L_0x079a
        L_0x0794:
            boolean r1 = r8.m42348t(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
        L_0x079a:
            r1 = 3
            r8.m42342n(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r1 = r8.f25474I     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
            r33.m42343o()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x07a6:
            r4 = 3
            if (r3 != r4) goto L_0x07c0
            com.google.android.gms.internal.ads.zzatb[] r3 = r8.f25472G     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x07af
            goto L_0x07b3
        L_0x07af:
            boolean r5 = r8.m42348t(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07b3:
            if (r5 != 0) goto L_0x07c0
            boolean r1 = r8.f25474I     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25475J = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m42342n(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42345q()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07c0:
            int r1 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07d3
            com.google.android.gms.internal.ads.zzatb[] r1 = r8.f25472G     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9 = 0
        L_0x07c9:
            if (r9 >= r2) goto L_0x07d3
            r3 = r1[r9]     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo41898k()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07d3:
            boolean r1 = r8.f25474I     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07dc
            int r1 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 == r2) goto L_0x07e1
        L_0x07dc:
            int r1 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07ef
        L_0x07e1:
            int r1 = r8.f25493a0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07e9
            int r1 = r8.f25493a0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = (long) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07eb
        L_0x07e9:
            r2 = 10
        L_0x07eb:
            r8.m42339k(r11, r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x07ef:
            com.google.android.gms.internal.ads.zzatb[] r1 = r8.f25472G     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.length     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0802
            int r1 = r8.f25494b0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07fc
            int r1 = r8.f25494b0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = (long) r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07fe
        L_0x07fc:
            r1 = r16
        L_0x07fe:
            r8.m42339k(r11, r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x0802:
            android.os.Handler r1 = r8.f25499g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0808:
            com.google.android.gms.internal.ads.zzbap.m42984b()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0683
        L_0x080d:
            return r1
        L_0x080e:
            int r1 = r1.arg1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0814
            r1 = 1
            goto L_0x0815
        L_0x0814:
            r1 = 0
        L_0x0815:
            r2 = 0
            r8.f25475J = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25474I = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0824
            r33.m42345q()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m42346r()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0822:
            r1 = 1
            goto L_0x083c
        L_0x0824:
            int r1 = r8.f25477L     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 != r2) goto L_0x0833
            r33.m42343o()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f25499g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x0833:
            r2 = 2
            if (r1 != r2) goto L_0x0822
            android.os.Handler r1 = r8.f25499g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r2)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x083c:
            return r1
        L_0x083d:
            java.lang.Object r2 = r1.obj     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaye r2 = (com.google.android.gms.internal.ads.zzaye) r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.arg1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f25501p     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r8.m42337g(r3)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcjv r3 = r8.f25496c0     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo43835a()     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0860
            com.google.android.gms.internal.ads.zzasr r1 = new com.google.android.gms.internal.ads.zzasr     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f25467B = r1     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0860:
            r8.f25471F = r2     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasm r1 = r8.f25502s     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r2.mo42227c(r1, r3, r8)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m42342n(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f25499g     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.sendEmptyMessage(r1)     // Catch:{ zzasi -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r3
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08a0
        L_0x0878:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08bd
        L_0x087e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f25501p
            com.google.android.gms.internal.ads.zzasi r1 = com.google.android.gms.internal.ads.zzasi.m42277c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.m42344p()
            r1 = 1
            return r1
        L_0x089b:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08a0:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f25501p
            com.google.android.gms.internal.ads.zzasi r2 = com.google.android.gms.internal.ads.zzasi.m42276b(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m42344p()
            return r1
        L_0x08b8:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08bd:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f25501p
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m42344p()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo41958i(zzayq zzayq) {
        this.f25499g.obtainMessage(9, (zzayc) zzayq).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41959w(com.google.android.gms.internal.ads.zzasl... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f25473H     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f25479N     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f25479N = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f25499g     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f25480O     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasu.mo41959w(com.google.android.gms.internal.ads.zzasl[]):void");
    }

    /* renamed from: x */
    public final void mo41960x() {
        this.f25489X = true;
    }

    /* renamed from: y */
    public final void mo41961y(int i) {
        this.f25491Z = i;
    }

    /* renamed from: z */
    public final void mo41962z() {
        this.f25490Y = true;
    }
}
