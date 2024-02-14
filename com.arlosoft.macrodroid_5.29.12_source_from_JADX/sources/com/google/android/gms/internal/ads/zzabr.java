package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzabr implements zzzi {

    /* renamed from: q */
    public static final zzzp f23854q = zzabq.f23853b;

    /* renamed from: a */
    private final zzef f23855a = new zzef(4);

    /* renamed from: b */
    private final zzef f23856b = new zzef(9);

    /* renamed from: c */
    private final zzef f23857c = new zzef(11);

    /* renamed from: d */
    private final zzef f23858d = new zzef();

    /* renamed from: e */
    private final zzabs f23859e = new zzabs();

    /* renamed from: f */
    private zzzl f23860f;

    /* renamed from: g */
    private int f23861g = 1;

    /* renamed from: h */
    private boolean f23862h;

    /* renamed from: i */
    private long f23863i;

    /* renamed from: j */
    private int f23864j;

    /* renamed from: k */
    private int f23865k;

    /* renamed from: l */
    private int f23866l;

    /* renamed from: m */
    private long f23867m;

    /* renamed from: n */
    private boolean f23868n;

    /* renamed from: o */
    private zzabp f23869o;

    /* renamed from: p */
    private zzabv f23870p;

    /* renamed from: b */
    private final zzef m41004b(zzzj zzzj) throws IOException {
        if (this.f23866l > this.f23858d.mo45234j()) {
            zzef zzef = this.f23858d;
            int j = zzef.mo45234j();
            zzef.mo45228d(new byte[Math.max(j + j, this.f23866l)], 0);
        } else {
            this.f23858d.mo45230f(0);
        }
        this.f23858d.mo45229e(this.f23866l);
        ((zzyy) zzzj).mo48453i(this.f23858d.mo45232h(), 0, this.f23866l, false);
        return this.f23858d;
    }

    /* renamed from: c */
    private final void m41005c() {
        if (!this.f23868n) {
            this.f23860f.mo41254h(new zzaak(-9223372036854775807L, 0));
            this.f23868n = true;
        }
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        zzyy zzyy = (zzyy) zzzj;
        zzyy.mo48454j(this.f23855a.mo45232h(), 0, 3, false);
        this.f23855a.mo45230f(0);
        if (this.f23855a.mo45245u() != 4607062) {
            return false;
        }
        zzyy.mo48454j(this.f23855a.mo45232h(), 0, 2, false);
        this.f23855a.mo45230f(0);
        if ((this.f23855a.mo45247w() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzyy.mo48454j(this.f23855a.mo45232h(), 0, 4, false);
        this.f23855a.mo45230f(0);
        int m = this.f23855a.mo45237m();
        zzzj.mo48452h();
        zzyy zzyy2 = (zzyy) zzzj;
        zzyy2.mo48458o(m, false);
        zzyy2.mo48454j(this.f23855a.mo45232h(), 0, 4, false);
        this.f23855a.mo45230f(0);
        if (this.f23855a.mo45237m() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f23860f = zzzl;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        if (j == 0) {
            this.f23861g = 1;
            this.f23862h = false;
        } else {
            this.f23861g = 3;
        }
        this.f23864j = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r17, com.google.android.gms.internal.ads.zzaai r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzzl r2 = r0.f23860f
            com.google.android.gms.internal.ads.zzdd.m47208b(r2)
        L_0x0009:
            int r2 = r0.f23861g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x011f
            r10 = 3
            if (r2 == r6) goto L_0x0111
            if (r2 == r10) goto L_0x00c9
            if (r2 != r7) goto L_0x00c3
            boolean r2 = r0.f23862h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f23863i
            long r14 = r0.f23867m
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.zzabs r2 = r0.f23859e
            long r2 = r2.mo41247d()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f23867m
        L_0x003b:
            int r14 = r0.f23865k
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.zzabp r14 = r0.f23869o
            if (r14 == 0) goto L_0x0053
            r16.m41005c()
            com.google.android.gms.internal.ads.zzabp r4 = r0.f23869o
            com.google.android.gms.internal.ads.zzef r5 = r16.m41004b(r17)
            boolean r2 = r4.mo41250c(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a2
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.zzabv r4 = r0.f23870p
            if (r4 == 0) goto L_0x0098
            r16.m41005c()
            com.google.android.gms.internal.ads.zzabv r4 = r0.f23870p
            com.google.android.gms.internal.ads.zzef r5 = r16.m41004b(r17)
            boolean r2 = r4.mo41250c(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x0098
            boolean r4 = r0.f23868n
            if (r4 != 0) goto L_0x0098
            com.google.android.gms.internal.ads.zzabs r4 = r0.f23859e
            com.google.android.gms.internal.ads.zzef r5 = r16.m41004b(r17)
            boolean r2 = r4.mo41250c(r5, r2)
            com.google.android.gms.internal.ads.zzabs r3 = r0.f23859e
            long r4 = r3.mo41247d()
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzzl r14 = r0.f23860f
            com.google.android.gms.internal.ads.zzaaa r15 = new com.google.android.gms.internal.ads.zzaaa
            long[] r10 = r3.mo41248e()
            long[] r3 = r3.mo41249f()
            r15.<init>(r10, r3, r4)
            r14.mo41254h(r15)
            r0.f23868n = r9
            goto L_0x0050
        L_0x0098:
            int r2 = r0.f23866l
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.mo48459p(r2, r8)
            r2 = 0
            r3 = 0
        L_0x00a2:
            boolean r4 = r0.f23862h
            if (r4 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            r0.f23862h = r9
            com.google.android.gms.internal.ads.zzabs r2 = r0.f23859e
            long r4 = r2.mo41247d()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b8
            long r4 = r0.f23867m
            long r10 = -r4
            goto L_0x00ba
        L_0x00b8:
            r10 = 0
        L_0x00ba:
            r0.f23863i = r10
        L_0x00bc:
            r0.f23864j = r7
            r0.f23861g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            byte[] r2 = r2.mo45232h()
            r4 = 11
            boolean r2 = r1.mo48453i(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00d8
            return r3
        L_0x00d8:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            r2.mo45230f(r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            int r2 = r2.mo45243s()
            r0.f23865k = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            int r2 = r2.mo45245u()
            r0.f23866l = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            int r2 = r2.mo45245u()
            long r2 = (long) r2
            r0.f23867m = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            int r2 = r2.mo45243s()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f23867m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f23867m = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f23857c
            r2.mo45231g(r10)
            r0.f23861g = r7
            goto L_0x0009
        L_0x0111:
            int r2 = r0.f23864j
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.mo48459p(r2, r8)
            r0.f23864j = r8
            r0.f23861g = r10
            goto L_0x0009
        L_0x011f:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23856b
            byte[] r2 = r2.mo45232h()
            boolean r2 = r1.mo48453i(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x012c
            return r3
        L_0x012c:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23856b
            r2.mo45230f(r8)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23856b
            r2.mo45231g(r7)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23856b
            int r2 = r2.mo45243s()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzabp r2 = r0.f23869o
            if (r2 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzabp r2 = new com.google.android.gms.internal.ads.zzabp
            com.google.android.gms.internal.ads.zzzl r7 = r0.f23860f
            com.google.android.gms.internal.ads.zzaap r4 = r7.mo41256k(r4, r9)
            r2.<init>(r4)
            r0.f23869o = r2
        L_0x0152:
            if (r3 == 0) goto L_0x0165
            com.google.android.gms.internal.ads.zzabv r2 = r0.f23870p
            if (r2 != 0) goto L_0x0165
            com.google.android.gms.internal.ads.zzabv r2 = new com.google.android.gms.internal.ads.zzabv
            com.google.android.gms.internal.ads.zzzl r3 = r0.f23860f
            com.google.android.gms.internal.ads.zzaap r3 = r3.mo41256k(r5, r6)
            r2.<init>(r3)
            r0.f23870p = r2
        L_0x0165:
            com.google.android.gms.internal.ads.zzzl r2 = r0.f23860f
            r2.mo41255j0()
            com.google.android.gms.internal.ads.zzef r2 = r0.f23856b
            int r2 = r2.mo45237m()
            int r2 = r2 + -5
            r0.f23864j = r2
            r0.f23861g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabr.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}
