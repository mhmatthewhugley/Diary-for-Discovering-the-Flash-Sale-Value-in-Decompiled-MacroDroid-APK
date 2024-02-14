package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxy implements zzayc, zzava, zzazw, zzaym {

    /* renamed from: A */
    private final zzbae f26201A;

    /* renamed from: B */
    private final Runnable f26202B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Runnable f26203C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Handler f26204D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final SparseArray f26205E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public zzayb f26206F;

    /* renamed from: G */
    private zzavg f26207G;

    /* renamed from: H */
    private boolean f26208H;

    /* renamed from: I */
    private boolean f26209I;

    /* renamed from: J */
    private boolean f26210J;

    /* renamed from: K */
    private boolean f26211K;

    /* renamed from: L */
    private int f26212L;

    /* renamed from: M */
    private zzayt f26213M;

    /* renamed from: N */
    private long f26214N;

    /* renamed from: O */
    private boolean[] f26215O;

    /* renamed from: P */
    private boolean[] f26216P;

    /* renamed from: Q */
    private boolean f26217Q;

    /* renamed from: R */
    private long f26218R;

    /* renamed from: S */
    private long f26219S;

    /* renamed from: T */
    private long f26220T;

    /* renamed from: U */
    private int f26221U;

    /* renamed from: V */
    private boolean f26222V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f26223W;

    /* renamed from: X */
    private final zzazp f26224X;

    /* renamed from: a */
    private final Uri f26225a;

    /* renamed from: c */
    private final zzazm f26226c;

    /* renamed from: d */
    private final int f26227d;

    /* renamed from: f */
    private final Handler f26228f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzaxz f26229g;

    /* renamed from: o */
    private final zzayd f26230o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final long f26231p;

    /* renamed from: s */
    private final zzbaa f26232s = new zzbaa("Loader:ExtractorMediaPeriod");

    /* renamed from: z */
    private final zzaxw f26233z;

    public zzaxy(Uri uri, zzazm zzazm, zzauz[] zzauzArr, int i, Handler handler, zzaxz zzaxz, zzayd zzayd, zzazp zzazp, String str, int i2, byte[] bArr) {
        this.f26225a = uri;
        this.f26226c = zzazm;
        this.f26227d = i;
        this.f26228f = handler;
        this.f26229g = zzaxz;
        this.f26230o = zzayd;
        this.f26224X = zzazp;
        this.f26231p = (long) i2;
        this.f26233z = new zzaxw(zzauzArr, this);
        this.f26201A = new zzbae();
        this.f26202B = new zzaxr(this);
        this.f26203C = new zzaxs(this);
        this.f26204D = new Handler();
        this.f26220T = -9223372036854775807L;
        this.f26205E = new SparseArray();
        this.f26218R = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: C */
    static /* bridge */ /* synthetic */ void m42743C(com.google.android.gms.internal.ads.zzaxy r8) {
        /*
            boolean r0 = r8.f26223W
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.f26209I
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzavg r0 = r8.f26207G
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.f26208H
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray r0 = r8.f26205E
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray r3 = r8.f26205E
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzayn r3 = (com.google.android.gms.internal.ads.zzayn) r3
            com.google.android.gms.internal.ads.zzasw r3 = r3.mo42246h()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.zzbae r2 = r8.f26201A
            r2.mo42309b()
            com.google.android.gms.internal.ads.zzays[] r2 = new com.google.android.gms.internal.ads.zzays[r0]
            boolean[] r3 = new boolean[r0]
            r8.f26216P = r3
            boolean[] r3 = new boolean[r0]
            r8.f26215O = r3
            com.google.android.gms.internal.ads.zzavg r3 = r8.f26207G
            long r3 = r3.zza()
            r8.f26214N = r3
            r3 = 0
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray r5 = r8.f26205E
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzayn r5 = (com.google.android.gms.internal.ads.zzayn) r5
            com.google.android.gms.internal.ads.zzasw r5 = r5.mo42246h()
            com.google.android.gms.internal.ads.zzays r6 = new com.google.android.gms.internal.ads.zzays
            com.google.android.gms.internal.ads.zzasw[] r7 = new com.google.android.gms.internal.ads.zzasw[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f25527o
            boolean r6 = com.google.android.gms.internal.ads.zzbah.m42942b(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.zzbah.m42941a(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean[] r5 = r8.f26216P
            r5[r3] = r4
            boolean r5 = r8.f26217Q
            r4 = r4 | r5
            r8.f26217Q = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.zzayt r0 = new com.google.android.gms.internal.ads.zzayt
            r0.<init>(r2)
            r8.f26213M = r0
            r8.f26209I = r4
            com.google.android.gms.internal.ads.zzayd r0 = r8.f26230o
            com.google.android.gms.internal.ads.zzayr r1 = new com.google.android.gms.internal.ads.zzayr
            long r2 = r8.f26214N
            com.google.android.gms.internal.ads.zzavg r4 = r8.f26207G
            boolean r4 = r4.mo42090a()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo41954b(r1, r2)
            com.google.android.gms.internal.ads.zzayb r0 = r8.f26206F
            r0.mo41956h(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxy.m42743C(com.google.android.gms.internal.ads.zzaxy):void");
    }

    /* renamed from: q */
    private final int m42745q() {
        int size = this.f26205E.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzayn) this.f26205E.valueAt(i2)).mo42243e();
        }
        return i;
    }

    /* renamed from: r */
    private final long m42746r() {
        int size = this.f26205E.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((zzayn) this.f26205E.valueAt(i)).mo42245g());
        }
        return j;
    }

    /* renamed from: s */
    private final void m42747s(zzaxv zzaxv) {
        if (this.f26218R == -1) {
            this.f26218R = zzaxv.f26194i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = r11.f26207G;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42748t() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzaxv r6 = new com.google.android.gms.internal.ads.zzaxv
            android.net.Uri r2 = r11.f26225a
            com.google.android.gms.internal.ads.zzazm r3 = r11.f26226c
            com.google.android.gms.internal.ads.zzaxw r4 = r11.f26233z
            com.google.android.gms.internal.ads.zzbae r5 = r11.f26201A
            r0 = r6
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r11.f26209I
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r11.m42749u()
            com.google.android.gms.internal.ads.zzbac.m42926e(r0)
            long r3 = r11.f26214N
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            long r7 = r11.f26220T
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r0 = 1
            r11.f26222V = r0
            r11.f26220T = r1
            return
        L_0x0032:
            com.google.android.gms.internal.ads.zzavg r0 = r11.f26207G
            long r3 = r11.f26220T
            long r3 = r0.mo42091c(r3)
            long r7 = r11.f26220T
            r6.mo42198d(r3, r7)
            r11.f26220T = r1
        L_0x0041:
            int r0 = r11.m42745q()
            r11.f26221U = r0
            int r0 = r11.f26227d
            r3 = -1
            r4 = 6
            r5 = 3
            if (r0 != r3) goto L_0x006a
            boolean r0 = r11.f26209I
            if (r0 == 0) goto L_0x0069
            long r7 = r11.f26218R
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzavg r0 = r11.f26207G
            if (r0 == 0) goto L_0x0067
            long r7 = r0.zza()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 6
            goto L_0x006a
        L_0x0069:
            r0 = 3
        L_0x006a:
            com.google.android.gms.internal.ads.zzbaa r1 = r11.f26232s
            r1.mo42301a(r6, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxy.m42748t():void");
    }

    /* renamed from: u */
    private final boolean m42749u() {
        return this.f26220T != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo42206D() throws IOException {
        this.f26232s.mo42303g(Integer.MIN_VALUE);
    }

    /* renamed from: E */
    public final void mo42207E() {
        this.f26232s.mo42304h(new zzaxt(this, this.f26233z));
        this.f26204D.removeCallbacksAndMessages((Object) null);
        this.f26223W = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo42208F(int i, long j) {
        zzayn zzayn = (zzayn) this.f26205E.valueAt(i);
        if (!this.f26222V || j <= zzayn.mo42245g()) {
            zzayn.mo42252n(j, true);
        } else {
            zzayn.mo42250l();
        }
    }

    /* renamed from: a */
    public final boolean mo42190a(long j) {
        if (this.f26222V) {
            return false;
        }
        if (this.f26209I && this.f26212L == 0) {
            return false;
        }
        boolean c = this.f26201A.mo42310c();
        if (this.f26232s.mo42305i()) {
            return c;
        }
        m42748t();
        return true;
    }

    /* renamed from: b */
    public final void mo42106b(zzavg zzavg) {
        this.f26207G = zzavg;
        this.f26204D.post(this.f26202B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if (r1 != false) goto L_0x00c5;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo42209c(com.google.android.gms.internal.ads.zzayx[] r7, boolean[] r8, com.google.android.gms.internal.ads.zzayo[] r9, boolean[] r10, long r11) {
        /*
            r6 = this;
            boolean r0 = r6.f26209I
            com.google.android.gms.internal.ads.zzbac.m42926e(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x003e
            r2 = r9[r1]
            if (r2 == 0) goto L_0x003b
            r3 = r7[r1]
            if (r3 == 0) goto L_0x0016
            boolean r3 = r8[r1]
            if (r3 != 0) goto L_0x003b
        L_0x0016:
            com.google.android.gms.internal.ads.zzaxx r2 = (com.google.android.gms.internal.ads.zzaxx) r2
            int r2 = r2.f26199a
            boolean[] r3 = r6.f26215O
            boolean r3 = r3[r2]
            com.google.android.gms.internal.ads.zzbac.m42926e(r3)
            int r3 = r6.f26212L
            int r3 = r3 + -1
            r6.f26212L = r3
            boolean[] r3 = r6.f26215O
            r3[r2] = r0
            android.util.SparseArray r3 = r6.f26205E
            java.lang.Object r2 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzayn r2 = (com.google.android.gms.internal.ads.zzayn) r2
            r2.mo42247i()
            r2 = 0
            r9[r1] = r2
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003e:
            r8 = 0
            r1 = 0
        L_0x0040:
            int r2 = r7.length
            r3 = 1
            if (r8 >= r2) goto L_0x0083
            r2 = r9[r8]
            if (r2 != 0) goto L_0x0080
            r2 = r7[r8]
            if (r2 == 0) goto L_0x0080
            r2.mo42263b()
            int r1 = r2.mo42262a(r0)
            if (r1 != 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.google.android.gms.internal.ads.zzbac.m42926e(r1)
            com.google.android.gms.internal.ads.zzayt r1 = r6.f26213M
            com.google.android.gms.internal.ads.zzays r2 = r2.mo42265d()
            int r1 = r1.mo42257a(r2)
            boolean[] r2 = r6.f26215O
            boolean r2 = r2[r1]
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.zzbac.m42926e(r2)
            int r2 = r6.f26212L
            int r2 = r2 + r3
            r6.f26212L = r2
            boolean[] r2 = r6.f26215O
            r2[r1] = r3
            com.google.android.gms.internal.ads.zzaxx r2 = new com.google.android.gms.internal.ads.zzaxx
            r2.<init>(r6, r1)
            r9[r8] = r2
            r10[r8] = r3
            r1 = 1
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x0040
        L_0x0083:
            boolean r7 = r6.f26210J
            if (r7 != 0) goto L_0x00a4
            android.util.SparseArray r7 = r6.f26205E
            int r7 = r7.size()
            r8 = 0
        L_0x008e:
            if (r8 >= r7) goto L_0x00a4
            boolean[] r2 = r6.f26215O
            boolean r2 = r2[r8]
            if (r2 != 0) goto L_0x00a1
            android.util.SparseArray r2 = r6.f26205E
            java.lang.Object r2 = r2.valueAt(r8)
            com.google.android.gms.internal.ads.zzayn r2 = (com.google.android.gms.internal.ads.zzayn) r2
            r2.mo42247i()
        L_0x00a1:
            int r8 = r8 + 1
            goto L_0x008e
        L_0x00a4:
            int r7 = r6.f26212L
            r4 = 0
            if (r7 != 0) goto L_0x00b8
            r6.f26211K = r0
            com.google.android.gms.internal.ads.zzbaa r7 = r6.f26232s
            boolean r8 = r7.mo42305i()
            if (r8 == 0) goto L_0x00d5
            r7.mo42302f()
            goto L_0x00d5
        L_0x00b8:
            boolean r7 = r6.f26210J
            if (r7 == 0) goto L_0x00bf
            if (r1 == 0) goto L_0x00d5
            goto L_0x00c5
        L_0x00bf:
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00c5
            r11 = r4
            goto L_0x00d5
        L_0x00c5:
            long r11 = r6.mo42213g(r11)
        L_0x00c9:
            int r7 = r9.length
            if (r0 >= r7) goto L_0x00d5
            r7 = r9[r0]
            if (r7 == 0) goto L_0x00d2
            r10[r0] = r3
        L_0x00d2:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00d5:
            r6.f26210J = r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxy.mo42209c(com.google.android.gms.internal.ads.zzayx[], boolean[], com.google.android.gms.internal.ads.zzayo[], boolean[], long):long");
    }

    /* renamed from: d */
    public final void mo42210d(zzayb zzayb, long j) {
        this.f26206F = zzayb;
        this.f26201A.mo42310c();
        m42748t();
    }

    /* renamed from: e */
    public final long mo42211e() {
        if (!this.f26211K) {
            return -9223372036854775807L;
        }
        this.f26211K = false;
        return this.f26219S;
    }

    /* renamed from: f */
    public final long mo42212f() {
        long j;
        if (this.f26222V) {
            return Long.MIN_VALUE;
        }
        if (m42749u()) {
            return this.f26220T;
        }
        if (this.f26217Q) {
            int size = this.f26205E.size();
            j = LocationRequestCompat.PASSIVE_INTERVAL;
            for (int i = 0; i < size; i++) {
                if (this.f26216P[i]) {
                    j = Math.min(j, ((zzayn) this.f26205E.valueAt(i)).mo42245g());
                }
            }
        } else {
            j = m42746r();
        }
        return j == Long.MIN_VALUE ? this.f26219S : j;
    }

    /* renamed from: g */
    public final long mo42213g(long j) {
        if (true != this.f26207G.mo42090a()) {
            j = 0;
        }
        this.f26219S = j;
        int size = this.f26205E.size();
        boolean u = true ^ m42749u();
        int i = 0;
        while (true) {
            if (u) {
                if (i >= size) {
                    break;
                }
                if (this.f26215O[i]) {
                    u = ((zzayn) this.f26205E.valueAt(i)).mo42252n(j, false);
                }
                i++;
            } else {
                this.f26220T = j;
                this.f26222V = false;
                zzbaa zzbaa = this.f26232s;
                if (zzbaa.mo42305i()) {
                    zzbaa.mo42302f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((zzayn) this.f26205E.valueAt(i2)).mo42248j(this.f26215O[i2]);
                    }
                }
            }
        }
        this.f26211K = false;
        return j;
    }

    /* renamed from: h */
    public final zzavi mo42107h(int i, int i2) {
        zzayn zzayn = (zzayn) this.f26205E.get(i);
        if (zzayn != null) {
            return zzayn;
        }
        zzayn zzayn2 = new zzayn(this.f26224X, (byte[]) null);
        zzayn2.mo42249k(this);
        this.f26205E.put(i, zzayn2);
        return zzayn2;
    }

    /* renamed from: i */
    public final void mo42214i(zzasw zzasw) {
        this.f26204D.post(this.f26202B);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo42215j(zzazy zzazy, long j, long j2, boolean z) {
        m42747s((zzaxv) zzazy);
        if (!z && this.f26212L > 0) {
            int size = this.f26205E.size();
            for (int i = 0; i < size; i++) {
                ((zzayn) this.f26205E.valueAt(i)).mo42248j(this.f26215O[i]);
            }
            this.f26206F.mo41958i(this);
        }
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo42216k(zzazy zzazy, long j, long j2) {
        m42747s((zzaxv) zzazy);
        this.f26222V = true;
        if (this.f26214N == -9223372036854775807L) {
            long r = m42746r();
            long j3 = r == Long.MIN_VALUE ? 0 : r + WorkRequest.MIN_BACKOFF_MILLIS;
            this.f26214N = j3;
            this.f26230o.mo41954b(new zzayr(j3, this.f26207G.mo42090a()), (Object) null);
        }
        this.f26206F.mo41958i(this);
    }

    /* renamed from: l */
    public final void mo42217l(long j) {
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ int mo42218m(zzazy zzazy, long j, long j2, IOException iOException) {
        zzavg zzavg;
        zzaxv zzaxv = (zzaxv) zzazy;
        m42747s(zzaxv);
        Handler handler = this.f26228f;
        if (handler != null) {
            handler.post(new zzaxu(this, iOException));
        }
        if (iOException instanceof zzayu) {
            return 3;
        }
        int q = m42745q();
        int i = this.f26221U;
        if (this.f26218R == -1 && ((zzavg = this.f26207G) == null || zzavg.zza() == -9223372036854775807L)) {
            this.f26219S = 0;
            this.f26211K = this.f26209I;
            int size = this.f26205E.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzayn) this.f26205E.valueAt(i2)).mo42248j(!this.f26209I || this.f26215O[i2]);
            }
            zzaxv.mo42198d(0, 0);
        }
        this.f26221U = m42745q();
        if (q <= i) {
            return 0;
        }
        return 1;
    }

    /* renamed from: n */
    public final zzayt mo42219n() {
        return this.f26213M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo42220o(int i) {
        return this.f26222V || (!m42749u() && ((zzayn) this.f26205E.valueAt(i)).mo42251m());
    }

    /* renamed from: p */
    public final void mo42221p() throws IOException {
        this.f26232s.mo42303g(Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final int mo42222v(int i, zzasx zzasx, zzaur zzaur, boolean z) {
        if (this.f26211K || m42749u()) {
            return -3;
        }
        return ((zzayn) this.f26205E.valueAt(i)).mo42244f(zzasx, zzaur, z, this.f26222V, this.f26219S);
    }

    public final long zza() {
        if (this.f26212L == 0) {
            return Long.MIN_VALUE;
        }
        return mo42212f();
    }

    public final void zzb() {
        this.f26208H = true;
        this.f26204D.post(this.f26202B);
    }
}
