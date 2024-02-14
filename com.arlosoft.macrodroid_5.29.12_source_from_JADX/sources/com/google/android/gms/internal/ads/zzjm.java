package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjm {

    /* renamed from: a */
    private final zzck f37653a = new zzck();

    /* renamed from: b */
    private final zzcm f37654b = new zzcm();

    /* renamed from: c */
    private final zzko f37655c;

    /* renamed from: d */
    private final Handler f37656d;

    /* renamed from: e */
    private long f37657e;

    /* renamed from: f */
    private int f37658f;

    /* renamed from: g */
    private boolean f37659g;
    @Nullable

    /* renamed from: h */
    private zzjj f37660h;
    @Nullable

    /* renamed from: i */
    private zzjj f37661i;
    @Nullable

    /* renamed from: j */
    private zzjj f37662j;

    /* renamed from: k */
    private int f37663k;
    @Nullable

    /* renamed from: l */
    private Object f37664l;

    /* renamed from: m */
    private long f37665m;

    public zzjm(zzko zzko, Handler handler) {
        this.f37655c = zzko;
        this.f37656d = handler;
    }

    /* renamed from: A */
    private static zzsi m53909A(zzcn zzcn, Object obj, long j, long j2, zzcm zzcm, zzck zzck) {
        zzcn.mo44134n(obj, zzck);
        zzcn.mo43603e(zzck.f28721c, zzcm, 0);
        zzcn.mo43599a(obj);
        if (zzck.f28722d == 0) {
            zzck.mo43848b();
        }
        zzcn.mo44134n(obj, zzck);
        int d = zzck.mo43850d(j);
        if (d == -1) {
            return new zzsi(obj, j2, zzck.mo43849c(j));
        }
        return new zzsi(obj, d, zzck.mo43851e(d), j2);
    }

    /* renamed from: B */
    private final void m53910B() {
        zzsi zzsi;
        zzfvk m = zzfvn.m51129m();
        for (zzjj zzjj = this.f37660h; zzjj != null; zzjj = zzjj.mo47695g()) {
            m.mo46428f(zzjj.f37631f.f37641a);
        }
        zzjj zzjj2 = this.f37661i;
        if (zzjj2 == null) {
            zzsi = null;
        } else {
            zzsi = zzjj2.f37631f.f37641a;
        }
        this.f37656d.post(new zzjl(this, m, zzsi));
    }

    /* renamed from: C */
    private final boolean m53911C(zzcn zzcn, zzsi zzsi, boolean z) {
        int a = zzcn.mo43599a(zzsi.f27569a);
        if (!zzcn.mo43603e(zzcn.mo43602d(a, this.f37653a, false).f28721c, this.f37654b, 0).f28941g) {
            if (zzcn.mo44129i(a, this.f37653a, this.f37654b, this.f37658f, this.f37659g) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m53912a(zzcn zzcn, zzsi zzsi) {
        if (!m53914c(zzsi)) {
            return false;
        }
        int i = zzcn.mo44134n(zzsi.f27569a, this.f37653a).f28721c;
        if (zzcn.mo43603e(i, this.f37654b, 0).f28948n == zzcn.mo43599a(zzsi.f27569a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m53913b(zzcn zzcn) {
        zzjj zzjj = this.f37660h;
        if (zzjj == null) {
            return true;
        }
        int a = zzcn.mo43599a(zzjj.f37627b);
        while (true) {
            a = zzcn.mo44129i(a, this.f37653a, this.f37654b, this.f37658f, this.f37659g);
            while (zzjj.mo47695g() != null && !zzjj.f37631f.f37647g) {
                zzjj = zzjj.mo47695g();
            }
            zzjj g = zzjj.mo47695g();
            if (a == -1 || g == null || zzcn.mo43599a(g.f37627b) != a) {
                boolean p = mo47724p(zzjj);
                zzjj.f37631f = mo47718j(zzcn, zzjj.f37631f);
            } else {
                zzjj = g;
            }
        }
        boolean p2 = mo47724p(zzjj);
        zzjj.f37631f = mo47718j(zzcn, zzjj.f37631f);
        if (!p2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m53914c(zzsi zzsi) {
        return !zzsi.mo42817b() && zzsi.f27573e == -1;
    }

    /* renamed from: v */
    private final long m53915v(zzcn zzcn, Object obj, int i) {
        zzcn.mo44134n(obj, this.f37653a);
        this.f37653a.mo43855h(i);
        this.f37653a.mo43858j(i);
        return 0;
    }

    @Nullable
    /* renamed from: w */
    private final zzjk m53916w(zzcn zzcn, zzjj zzjj, long j) {
        long j2;
        zzcn zzcn2 = zzcn;
        zzjk zzjk = zzjj.f37631f;
        long e = (zzjj.mo47693e() + zzjk.f37645e) - j;
        if (zzjk.f37647g) {
            long j3 = 0;
            int i = zzcn.mo44129i(zzcn2.mo43599a(zzjk.f37641a.f27569a), this.f37653a, this.f37654b, this.f37658f, this.f37659g);
            if (i == -1) {
                return null;
            }
            int i2 = zzcn2.mo43602d(i, this.f37653a, true).f28721c;
            Object obj = this.f37653a.f28720b;
            Objects.requireNonNull(obj);
            long j4 = zzjk.f37641a.f27572d;
            if (zzcn2.mo43603e(i2, this.f37654b, 0).f28947m == i) {
                Pair m = zzcn.mo44133m(this.f37654b, this.f37653a, i2, -9223372036854775807L, Math.max(0, e));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                zzjj g = zzjj.mo47695g();
                if (g == null || !g.f37627b.equals(obj)) {
                    j4 = this.f37657e;
                    this.f37657e = 1 + j4;
                } else {
                    j4 = g.f37631f.f37641a.f27572d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            zzsi A = m53909A(zzcn, obj, j2, j4, this.f37654b, this.f37653a);
            if (!(j3 == -9223372036854775807L || zzjk.f37643c == -9223372036854775807L)) {
                zzcn2.mo44134n(zzjk.f37641a.f27569a, this.f37653a).mo43848b();
            }
            return m53917x(zzcn, A, j3, j2);
        }
        zzsi zzsi = zzjk.f37641a;
        zzcn2.mo44134n(zzsi.f27569a, this.f37653a);
        if (zzsi.mo42817b()) {
            int i3 = zzsi.f27570b;
            if (this.f37653a.mo43847a(i3) == -1) {
                return null;
            }
            int f = this.f37653a.mo43853f(i3, zzsi.f27571c);
            if (f < 0) {
                return m53918y(zzcn, zzsi.f27569a, i3, f, zzjk.f37643c, zzsi.f27572d);
            }
            long j5 = zzjk.f37643c;
            if (j5 == -9223372036854775807L) {
                zzcm zzcm = this.f37654b;
                zzck zzck = this.f37653a;
                Pair m2 = zzcn.mo44133m(zzcm, zzck, zzck.f28721c, -9223372036854775807L, Math.max(0, e));
                if (m2 == null) {
                    return null;
                }
                j5 = ((Long) m2.second).longValue();
            }
            m53915v(zzcn2, zzsi.f27569a, zzsi.f27570b);
            return m53919z(zzcn, zzsi.f27569a, Math.max(0, j5), zzjk.f37643c, zzsi.f27572d);
        }
        int e2 = this.f37653a.mo43851e(zzsi.f27573e);
        this.f37653a.mo43860l(zzsi.f27573e);
        if (e2 != this.f37653a.mo43847a(zzsi.f27573e)) {
            return m53918y(zzcn, zzsi.f27569a, zzsi.f27573e, e2, zzjk.f37645e, zzsi.f27572d);
        }
        m53915v(zzcn2, zzsi.f27569a, zzsi.f27573e);
        return m53919z(zzcn, zzsi.f27569a, 0, zzjk.f37645e, zzsi.f27572d);
    }

    @Nullable
    /* renamed from: x */
    private final zzjk m53917x(zzcn zzcn, zzsi zzsi, long j, long j2) {
        zzsi zzsi2 = zzsi;
        zzcn zzcn2 = zzcn;
        zzcn.mo44134n(zzsi2.f27569a, this.f37653a);
        if (zzsi.mo42817b()) {
            return m53918y(zzcn, zzsi2.f27569a, zzsi2.f27570b, zzsi2.f27571c, j, zzsi2.f27572d);
        }
        return m53919z(zzcn, zzsi2.f27569a, j2, j, zzsi2.f27572d);
    }

    /* renamed from: y */
    private final zzjk m53918y(zzcn zzcn, Object obj, int i, int i2, long j, long j2) {
        zzsi zzsi = new zzsi(obj, i, i2, j2);
        long g = zzcn.mo44134n(zzsi.f27569a, this.f37653a).mo43854g(zzsi.f27570b, zzsi.f27571c);
        if (i2 == this.f37653a.mo43851e(i)) {
            this.f37653a.mo43857i();
        }
        this.f37653a.mo43860l(zzsi.f27570b);
        long j3 = 0;
        if (g != -9223372036854775807L && g <= 0) {
            j3 = Math.max(0, -1 + g);
        }
        return new zzjk(zzsi, j3, j, -9223372036854775807L, g, false, false, false, false);
    }

    /* renamed from: z */
    private final zzjk m53919z(zzcn zzcn, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        zzcn zzcn2 = zzcn;
        Object obj2 = obj;
        long j7 = j;
        zzcn2.mo44134n(obj2, this.f37653a);
        int c = this.f37653a.mo43849c(j7);
        if (c == -1) {
            this.f37653a.mo43848b();
        } else {
            this.f37653a.mo43860l(c);
        }
        zzsi zzsi = new zzsi(obj2, j3, c);
        boolean c2 = m53914c(zzsi);
        boolean a = m53912a(zzcn2, zzsi);
        boolean C = m53911C(zzcn2, zzsi, c2);
        if (c != -1) {
            this.f37653a.mo43860l(c);
        }
        if (c != -1) {
            this.f37653a.mo43855h(c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.f37653a.f28722d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzjk(zzsi, j7, j2, j6, j5, false, c2, a, C);
    }

    @Nullable
    /* renamed from: d */
    public final zzjj mo47712d() {
        zzjj zzjj = this.f37660h;
        if (zzjj == null) {
            return null;
        }
        if (zzjj == this.f37661i) {
            this.f37661i = zzjj.mo47695g();
        }
        zzjj.mo47702n();
        int i = this.f37663k - 1;
        this.f37663k = i;
        if (i == 0) {
            this.f37662j = null;
            zzjj zzjj2 = this.f37660h;
            this.f37664l = zzjj2.f37627b;
            this.f37665m = zzjj2.f37631f.f37641a.f27572d;
        }
        this.f37660h = this.f37660h.mo47695g();
        m53910B();
        return this.f37660h;
    }

    /* renamed from: e */
    public final zzjj mo47713e() {
        zzjj zzjj = this.f37661i;
        boolean z = false;
        if (!(zzjj == null || zzjj.mo47695g() == null)) {
            z = true;
        }
        zzdd.m47212f(z);
        this.f37661i = this.f37661i.mo47695g();
        m53910B();
        return this.f37661i;
    }

    @Nullable
    /* renamed from: f */
    public final zzjj mo47714f() {
        return this.f37662j;
    }

    @Nullable
    /* renamed from: g */
    public final zzjj mo47715g() {
        return this.f37660h;
    }

    @Nullable
    /* renamed from: h */
    public final zzjj mo47716h() {
        return this.f37661i;
    }

    @Nullable
    /* renamed from: i */
    public final zzjk mo47717i(long j, zzju zzju) {
        zzjj zzjj = this.f37662j;
        if (zzjj != null) {
            return m53916w(zzju.f37692a, zzjj, j);
        }
        return m53917x(zzju.f37692a, zzju.f37693b, zzju.f37694c, zzju.f37709r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzjk mo47718j(com.google.android.gms.internal.ads.zzcn r19, com.google.android.gms.internal.ads.zzjk r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsi r3 = r2.f37641a
            boolean r12 = m53914c(r3)
            boolean r13 = r0.m53912a(r1, r3)
            boolean r14 = r0.m53911C(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsi r4 = r2.f37641a
            java.lang.Object r4 = r4.f27569a
            com.google.android.gms.internal.ads.zzck r5 = r0.f37653a
            r1.mo44134n(r4, r5)
            boolean r1 = r3.mo42817b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.f27573e
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzck r9 = r0.f37653a
            r9.mo43855h(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.mo42817b()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzck r1 = r0.f37653a
            int r5 = r3.f27570b
            int r6 = r3.f27571c
            long r5 = r1.mo43854g(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzck r1 = r0.f37653a
            long r5 = r1.f28722d
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.mo42817b()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzck r1 = r0.f37653a
            int r4 = r3.f27570b
            r1.mo43860l(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.f27573e
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzck r4 = r0.f37653a
            r4.mo43860l(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzjk r15 = new com.google.android.gms.internal.ads.zzjk
            long r4 = r2.f37642b
            long r1 = r2.f37643c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.mo47718j(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzjk):com.google.android.gms.internal.ads.zzjk");
    }

    /* renamed from: k */
    public final zzsi mo47719k(zzcn zzcn, Object obj, long j) {
        long j2;
        int a;
        int i = zzcn.mo44134n(obj, this.f37653a).f28721c;
        Object obj2 = this.f37664l;
        if (obj2 == null || (a = zzcn.mo43599a(obj2)) == -1 || zzcn.mo43602d(a, this.f37653a, false).f28721c != i) {
            zzjj zzjj = this.f37660h;
            while (true) {
                if (zzjj == null) {
                    zzjj zzjj2 = this.f37660h;
                    while (true) {
                        if (zzjj2 != null) {
                            int a2 = zzcn.mo43599a(zzjj2.f37627b);
                            if (a2 != -1 && zzcn.mo43602d(a2, this.f37653a, false).f28721c == i) {
                                j2 = zzjj2.f37631f.f37641a.f27572d;
                                break;
                            }
                            zzjj2 = zzjj2.mo47695g();
                        } else {
                            j2 = this.f37657e;
                            this.f37657e = 1 + j2;
                            if (this.f37660h == null) {
                                this.f37664l = obj;
                                this.f37665m = j2;
                            }
                        }
                    }
                } else if (zzjj.f37627b.equals(obj)) {
                    j2 = zzjj.f37631f.f37641a.f27572d;
                    break;
                } else {
                    zzjj = zzjj.mo47695g();
                }
            }
        } else {
            j2 = this.f37665m;
        }
        long j3 = j2;
        zzcn.mo44134n(obj, this.f37653a);
        zzcn.mo43603e(this.f37653a.f28721c, this.f37654b, 0);
        int a3 = zzcn.mo43599a(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcm = this.f37654b;
            if (a3 < zzcm.f28947m) {
                return m53909A(zzcn, obj3, j, j3, zzcm, this.f37653a);
            }
            zzcn.mo43602d(a3, this.f37653a, true);
            this.f37653a.mo43848b();
            zzck zzck = this.f37653a;
            if (zzck.mo43850d(zzck.f28722d) != -1) {
                obj3 = this.f37653a.f28720b;
                Objects.requireNonNull(obj3);
            }
            a3--;
        }
    }

    /* renamed from: l */
    public final void mo47720l() {
        if (this.f37663k != 0) {
            zzjj zzjj = this.f37660h;
            zzdd.m47208b(zzjj);
            this.f37664l = zzjj.f37627b;
            this.f37665m = zzjj.f37631f.f37641a.f27572d;
            while (zzjj != null) {
                zzjj.mo47702n();
                zzjj = zzjj.mo47695g();
            }
            this.f37660h = null;
            this.f37662j = null;
            this.f37661i = null;
            this.f37663k = 0;
            m53910B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo47721m(zzfvk zzfvk, zzsi zzsi) {
        this.f37655c.mo47819i(zzfvk.mo46430h(), zzsi);
    }

    /* renamed from: n */
    public final void mo47722n(long j) {
        zzjj zzjj = this.f37662j;
        if (zzjj != null) {
            zzjj.mo47701m(j);
        }
    }

    /* renamed from: o */
    public final boolean mo47723o(zzsg zzsg) {
        zzjj zzjj = this.f37662j;
        return zzjj != null && zzjj.f37626a == zzsg;
    }

    /* renamed from: p */
    public final boolean mo47724p(zzjj zzjj) {
        boolean z = false;
        zzdd.m47212f(zzjj != null);
        if (zzjj.equals(this.f37662j)) {
            return false;
        }
        this.f37662j = zzjj;
        while (zzjj.mo47695g() != null) {
            zzjj = zzjj.mo47695g();
            if (zzjj == this.f37661i) {
                this.f37661i = this.f37660h;
                z = true;
            }
            zzjj.mo47702n();
            this.f37663k--;
        }
        this.f37662j.mo47703o((zzjj) null);
        m53910B();
        return z;
    }

    /* renamed from: q */
    public final boolean mo47725q() {
        zzjj zzjj = this.f37662j;
        if (zzjj != null) {
            return !zzjj.f37631f.f37649i && zzjj.mo47706r() && this.f37662j.f37631f.f37645e != -9223372036854775807L && this.f37663k < 100;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo47726r(zzcn zzcn, long j, long j2) {
        zzjk zzjk;
        long j3;
        boolean z;
        zzcn zzcn2 = zzcn;
        zzjj zzjj = this.f37660h;
        zzjj zzjj2 = null;
        while (zzjj != null) {
            zzjk zzjk2 = zzjj.f37631f;
            if (zzjj2 == null) {
                zzjk = mo47718j(zzcn2, zzjk2);
                long j4 = j;
            } else {
                zzjk w = m53916w(zzcn2, zzjj2, j);
                if (w == null) {
                    return !mo47724p(zzjj2);
                }
                if (zzjk2.f37642b != w.f37642b || !zzjk2.f37641a.equals(w.f37641a)) {
                    return !mo47724p(zzjj2);
                }
                zzjk = w;
            }
            zzjj.f37631f = zzjk.mo47707a(zzjk2.f37643c);
            long j5 = zzjk2.f37645e;
            long j6 = zzjk.f37645e;
            if (j5 == -9223372036854775807L || j5 == j6) {
                zzjj2 = zzjj;
                zzjj = zzjj.mo47695g();
            } else {
                zzjj.mo47705q();
                long j7 = zzjk.f37645e;
                if (j7 == -9223372036854775807L) {
                    j3 = LocationRequestCompat.PASSIVE_INTERVAL;
                } else {
                    j3 = j7 + zzjj.mo47693e();
                }
                if (zzjj == this.f37661i) {
                    boolean z2 = zzjj.f37631f.f37646f;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return mo47724p(zzjj) && !z;
                    }
                }
                z = false;
                if (mo47724p(zzjj)) {
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo47727s(zzcn zzcn, int i) {
        this.f37658f = i;
        return m53913b(zzcn);
    }

    /* renamed from: t */
    public final boolean mo47728t(zzcn zzcn, boolean z) {
        this.f37659g = z;
        return m53913b(zzcn);
    }

    /* renamed from: u */
    public final zzjj mo47729u(zzkb[] zzkbArr, zzvz zzvz, zzwi zzwi, zzjt zzjt, zzjk zzjk, zzwa zzwa) {
        long j;
        zzjj zzjj = this.f37662j;
        if (zzjj == null) {
            j = 1000000000000L;
            zzjk zzjk2 = zzjk;
        } else {
            j = (zzjj.mo47693e() + zzjj.f37631f.f37645e) - zzjk.f37642b;
        }
        zzjj zzjj2 = new zzjj(zzkbArr, j, zzvz, zzwi, zzjt, zzjk, zzwa, (byte[]) null);
        zzjj zzjj3 = this.f37662j;
        if (zzjj3 != null) {
            zzjj3.mo47703o(zzjj2);
        } else {
            this.f37660h = zzjj2;
            this.f37661i = zzjj2;
        }
        this.f37664l = null;
        this.f37662j = zzjj2;
        this.f37663k++;
        m53910B();
        return zzjj2;
    }
}
