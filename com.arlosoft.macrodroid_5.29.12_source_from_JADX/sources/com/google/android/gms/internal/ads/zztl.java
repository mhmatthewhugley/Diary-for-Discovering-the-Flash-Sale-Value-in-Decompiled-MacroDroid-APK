package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zztl implements zzsg, zzzl, zzwo, zzwt, zztx {
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final Map f38505c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final zzaf f38506d0;

    /* renamed from: A */
    private final zzdg f38507A;

    /* renamed from: B */
    private final Runnable f38508B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Runnable f38509C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Handler f38510D;
    @Nullable

    /* renamed from: E */
    private zzsf f38511E;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: F */
    public zzacm f38512F;

    /* renamed from: G */
    private zzty[] f38513G;

    /* renamed from: H */
    private zztj[] f38514H;

    /* renamed from: I */
    private boolean f38515I;

    /* renamed from: J */
    private boolean f38516J;

    /* renamed from: K */
    private boolean f38517K;

    /* renamed from: L */
    private zztk f38518L;

    /* renamed from: M */
    private zzaal f38519M;

    /* renamed from: N */
    private long f38520N;

    /* renamed from: O */
    private boolean f38521O;

    /* renamed from: P */
    private int f38522P;

    /* renamed from: Q */
    private boolean f38523Q;

    /* renamed from: R */
    private boolean f38524R;

    /* renamed from: S */
    private int f38525S;

    /* renamed from: T */
    private boolean f38526T;

    /* renamed from: U */
    private long f38527U;

    /* renamed from: V */
    private long f38528V;

    /* renamed from: W */
    private boolean f38529W;

    /* renamed from: X */
    private int f38530X;

    /* renamed from: Y */
    private boolean f38531Y;

    /* renamed from: Z */
    private boolean f38532Z;

    /* renamed from: a */
    private final Uri f38533a;

    /* renamed from: a0 */
    private final zzwm f38534a0;

    /* renamed from: b0 */
    private final zzwi f38535b0;

    /* renamed from: c */
    private final zzex f38536c;

    /* renamed from: d */
    private final zzpq f38537d;

    /* renamed from: f */
    private final zzsr f38538f;

    /* renamed from: g */
    private final zzpk f38539g;

    /* renamed from: o */
    private final zzth f38540o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final long f38541p;

    /* renamed from: s */
    private final zzww f38542s = new zzww("ProgressiveMediaPeriod");

    /* renamed from: z */
    private final zztb f38543z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f38505c0 = Collections.unmodifiableMap(hashMap);
        zzad zzad = new zzad();
        zzad.mo41331h("icy");
        zzad.mo41343s("application/x-icy");
        f38506d0 = zzad.mo41349y();
    }

    public zztl(Uri uri, zzex zzex, zztb zztb, zzpq zzpq, zzpk zzpk, zzwm zzwm, zzsr zzsr, zzth zzth, zzwi zzwi, @Nullable String str, int i, byte[] bArr) {
        this.f38533a = uri;
        this.f38536c = zzex;
        this.f38537d = zzpq;
        this.f38539g = zzpk;
        this.f38534a0 = zzwm;
        this.f38538f = zzsr;
        this.f38540o = zzth;
        this.f38535b0 = zzwi;
        this.f38541p = (long) i;
        this.f38543z = zztb;
        this.f38507A = new zzdg(zzde.f32179a);
        this.f38508B = new zztc(this);
        this.f38509C = new zztd(this);
        this.f38510D = zzen.m49158d((Handler.Callback) null);
        this.f38514H = new zztj[0];
        this.f38513G = new zzty[0];
        this.f38528V = -9223372036854775807L;
        this.f38520N = -9223372036854775807L;
        this.f38522P = 1;
    }

    /* renamed from: A */
    private final int m54994A() {
        int i = 0;
        for (zzty u : this.f38513G) {
            i += u.mo48242u();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final long m54995B(boolean z) {
        long j = Long.MIN_VALUE;
        int i = 0;
        while (true) {
            zzty[] zztyArr = this.f38513G;
            if (i >= zztyArr.length) {
                return j;
            }
            if (!z) {
                zztk zztk = this.f38518L;
                Objects.requireNonNull(zztk);
                if (!zztk.f38503c[i]) {
                    i++;
                }
            }
            j = Math.max(j, zztyArr[i].mo48244w());
            i++;
        }
    }

    /* renamed from: C */
    private final zzaap m54996C(zztj zztj) {
        int length = this.f38513G.length;
        for (int i = 0; i < length; i++) {
            if (zztj.equals(this.f38514H[i])) {
                return this.f38513G[i];
            }
        }
        zzwi zzwi = this.f38535b0;
        zzpq zzpq = this.f38537d;
        zzpk zzpk = this.f38539g;
        Objects.requireNonNull(zzpq);
        zzty zzty = new zzty(zzwi, zzpq, zzpk, (byte[]) null);
        zzty.mo48235G(this);
        int i2 = length + 1;
        zztj[] zztjArr = (zztj[]) Arrays.copyOf(this.f38514H, i2);
        zztjArr[length] = zztj;
        this.f38514H = (zztj[]) zzen.m49129D(zztjArr);
        zzty[] zztyArr = (zzty[]) Arrays.copyOf(this.f38513G, i2);
        zztyArr[length] = zzty;
        this.f38513G = (zzty[]) zzen.m49129D(zztyArr);
        return zzty;
    }

    /* renamed from: D */
    private final void m54997D() {
        zzdd.m47212f(this.f38516J);
        Objects.requireNonNull(this.f38518L);
        Objects.requireNonNull(this.f38519M);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m54998E() {
        int i;
        zzbq zzbq;
        if (!this.f38532Z && !this.f38516J && this.f38515I && this.f38519M != null) {
            zzty[] zztyArr = this.f38513G;
            int length = zztyArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (zztyArr[i2].mo48245x() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.f38507A.mo44616c();
            int length2 = this.f38513G.length;
            zzcp[] zzcpArr = new zzcp[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                zzaf x = this.f38513G[i3].mo48245x();
                Objects.requireNonNull(x);
                String str = x.f24213l;
                boolean g = zzbt.m44094g(str);
                boolean z = g || zzbt.m44095h(str);
                zArr[i3] = z;
                this.f38517K = z | this.f38517K;
                zzacm zzacm = this.f38512F;
                if (zzacm != null) {
                    if (g || this.f38514H[i3].f38500b) {
                        zzbq zzbq2 = x.f24211j;
                        if (zzbq2 == null) {
                            zzbq = new zzbq(-9223372036854775807L, zzacm);
                        } else {
                            zzbq = zzbq2.mo42877c(zzacm);
                        }
                        zzad b = x.mo41422b();
                        b.mo41337m(zzbq);
                        x = b.mo41349y();
                    }
                    if (g && x.f24207f == -1 && x.f24208g == -1 && (i = zzacm.f23925a) != -1) {
                        zzad b2 = x.mo41422b();
                        b2.mo41324d0(i);
                        x = b2.mo41349y();
                    }
                }
                zzcpArr[i3] = new zzcp(Integer.toString(i3), x.mo41423c(this.f38537d.mo48015d(x)));
            }
            this.f38518L = new zztk(new zzuh(zzcpArr), zArr);
            this.f38516J = true;
            zzsf zzsf = this.f38511E;
            Objects.requireNonNull(zzsf);
            zzsf.mo47686g(this);
        }
    }

    /* renamed from: G */
    private final void m54999G(int i) {
        m54997D();
        zztk zztk = this.f38518L;
        boolean[] zArr = zztk.f38504d;
        if (!zArr[i]) {
            zzaf b = zztk.f38501a.mo48265b(i).mo44231b(0);
            this.f38538f.mo48170d(zzbt.m44089b(b.f24213l), b, 0, (Object) null, this.f38527U);
            zArr[i] = true;
        }
    }

    /* renamed from: H */
    private final void m55000H(int i) {
        m54997D();
        boolean[] zArr = this.f38518L.f38502b;
        if (this.f38529W && zArr[i] && !this.f38513G[i].mo48238J(false)) {
            this.f38528V = 0;
            this.f38529W = false;
            this.f38524R = true;
            this.f38527U = 0;
            this.f38530X = 0;
            for (zzty E : this.f38513G) {
                E.mo48233E(false);
            }
            zzsf zzsf = this.f38511E;
            Objects.requireNonNull(zzsf);
            zzsf.mo47685f(this);
        }
    }

    /* renamed from: I */
    private final void m55001I() {
        zztg zztg = new zztg(this, this.f38533a, this.f38536c, this.f38543z, this, this.f38507A);
        if (this.f38516J) {
            zzdd.m47212f(m55002J());
            long j = this.f38520N;
            if (j == -9223372036854775807L || this.f38528V <= j) {
                zzaal zzaal = this.f38519M;
                Objects.requireNonNull(zzaal);
                zztg.m54983h(zztg, zzaal.mo41194c(this.f38528V).f23734a.f23740b, this.f38528V);
                for (zzty F : this.f38513G) {
                    F.mo48234F(this.f38528V);
                }
                this.f38528V = -9223372036854775807L;
            } else {
                this.f38531Y = true;
                this.f38528V = -9223372036854775807L;
                return;
            }
        }
        this.f38530X = m54994A();
        long a = this.f38542s.mo48352a(zztg, this, zzwm.m55276a(this.f38522P));
        zzfc d = zztg.f38493k;
        this.f38538f.mo48178l(new zzrz(zztg.f38483a, d, d.f35396a, Collections.emptyMap(), a, 0, 0), 1, -1, (zzaf) null, 0, (Object) null, zztg.f38492j, this.f38520N);
    }

    /* renamed from: J */
    private final boolean m55002J() {
        return this.f38528V != -9223372036854775807L;
    }

    /* renamed from: K */
    private final boolean m55003K() {
        return this.f38524R || m55002J();
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
    }

    /* renamed from: L */
    public final void mo48200L() {
        for (zzty D : this.f38513G) {
            D.mo48232D();
        }
        this.f38543z.mo48118b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo48201M(int i, zzjg zzjg, zzgi zzgi, int i2) {
        if (m55003K()) {
            return -3;
        }
        m54999G(i);
        int v = this.f38513G[i].mo48243v(zzjg, zzgi, i2, this.f38531Y);
        if (v == -3) {
            m55000H(i);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final int mo48202N(int i, long j) {
        if (m55003K()) {
            return 0;
        }
        m54999G(i);
        zzty zzty = this.f38513G[i];
        int t = zzty.mo48241t(j, this.f38531Y);
        zzty.mo48236H(t);
        if (t != 0) {
            return t;
        }
        m55000H(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final zzaap mo48203S() {
        return m54996C(new zztj(0, true));
    }

    /* renamed from: a */
    public final long mo48129a() {
        return zzb();
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        if (this.f38531Y || this.f38542s.mo48357k() || this.f38529W) {
            return false;
        }
        if (this.f38516J && this.f38525S == 0) {
            return false;
        }
        boolean e = this.f38507A.mo44618e();
        if (this.f38542s.mo48358l()) {
            return e;
        }
        m55001I();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r2 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo48131c(com.google.android.gms.internal.ads.zzvt[] r8, boolean[] r9, com.google.android.gms.internal.ads.zztz[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.m54997D()
            com.google.android.gms.internal.ads.zztk r0 = r7.f38518L
            com.google.android.gms.internal.ads.zzuh r1 = r0.f38501a
            boolean[] r0 = r0.f38503c
            int r2 = r7.f38525S
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.zzti r5 = (com.google.android.gms.internal.ads.zzti) r5
            int r5 = r5.f38497a
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzdd.m47212f(r6)
            int r6 = r7.f38525S
            int r6 = r6 + -1
            r7.f38525S = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.f38523Q
            r4 = 0
            r6 = 1
            if (r9 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x0046
            goto L_0x0043
        L_0x003f:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0045
        L_0x0043:
            r9 = 1
            goto L_0x0047
        L_0x0045:
            r12 = r4
        L_0x0046:
            r9 = 0
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a1
            r4 = r10[r2]
            if (r4 != 0) goto L_0x009e
            r4 = r8[r2]
            if (r4 == 0) goto L_0x009e
            int r5 = r4.mo48182a()
            if (r5 != r6) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            com.google.android.gms.internal.ads.zzdd.m47212f(r5)
            int r5 = r4.mo48186v(r3)
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            com.google.android.gms.internal.ads.zzdd.m47212f(r5)
            com.google.android.gms.internal.ads.zzcp r4 = r4.mo48183b()
            int r4 = r1.mo48264a(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.zzdd.m47212f(r5)
            int r5 = r7.f38525S
            int r5 = r5 + r6
            r7.f38525S = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.zzti r5 = new com.google.android.gms.internal.ads.zzti
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzty[] r9 = r7.f38513G
            r9 = r9[r4]
            boolean r4 = r9.mo48239K(r12, r6)
            if (r4 != 0) goto L_0x009d
            int r9 = r9.mo48240s()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00a1:
            int r8 = r7.f38525S
            if (r8 != 0) goto L_0x00d2
            r7.f38529W = r3
            r7.f38524R = r3
            com.google.android.gms.internal.ads.zzww r8 = r7.f38542s
            boolean r8 = r8.mo48358l()
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzty[] r8 = r7.f38513G
            int r9 = r8.length
        L_0x00b4:
            if (r3 >= r9) goto L_0x00be
            r10 = r8[r3]
            r10.mo48247z()
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00be:
            com.google.android.gms.internal.ads.zzww r8 = r7.f38542s
            r8.mo48353g()
            goto L_0x00e4
        L_0x00c4:
            com.google.android.gms.internal.ads.zzty[] r8 = r7.f38513G
            int r9 = r8.length
            r10 = 0
        L_0x00c8:
            if (r10 >= r9) goto L_0x00e4
            r11 = r8[r10]
            r11.mo48233E(r3)
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00d2:
            if (r9 == 0) goto L_0x00e4
            long r12 = r7.mo48139n(r12)
        L_0x00d8:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e4
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e1
            r11[r3] = r6
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00e4:
            r7.f38523Q = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.mo48131c(com.google.android.gms.internal.ads.zzvt[], boolean[], com.google.android.gms.internal.ads.zztz[], boolean[], long):long");
    }

    /* renamed from: d */
    public final long mo48132d() {
        if (!this.f38524R) {
            return -9223372036854775807L;
        }
        if (!this.f38531Y && m54994A() <= this.f38530X) {
            return -9223372036854775807L;
        }
        this.f38524R = false;
        return this.f38527U;
    }

    /* renamed from: e */
    public final zzuh mo48133e() {
        m54997D();
        return this.f38518L.f38501a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzwq mo48204f(com.google.android.gms.internal.ads.zzws r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.zztg r1 = (com.google.android.gms.internal.ads.zztg) r1
            com.google.android.gms.internal.ads.zzfy r2 = r1.f38485c
            com.google.android.gms.internal.ads.zzrz r15 = new com.google.android.gms.internal.ads.zzrz
            long r4 = r1.f38483a
            com.google.android.gms.internal.ads.zzfc r6 = r1.f38493k
            android.net.Uri r7 = r2.mo46577p()
            java.util.Map r8 = r2.mo46578q()
            long r13 = r2.mo46576o()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.zzse r2 = new com.google.android.gms.internal.ads.zzse
            long r3 = r1.f38492j
            long r22 = com.google.android.gms.internal.ads.zzen.m49171j0(r3)
            long r3 = r0.f38520N
            long r24 = com.google.android.gms.internal.ads.zzen.m49171j0(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.zzwn r3 = new com.google.android.gms.internal.ads.zzwn
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.f38803c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzbu
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzfp
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwv
            if (r4 != 0) goto L_0x008a
        L_0x0067:
            if (r2 == 0) goto L_0x007c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzey
            if (r4 == 0) goto L_0x0077
            r4 = r2
            com.google.android.gms.internal.ads.zzey r4 = (com.google.android.gms.internal.ads.zzey) r4
            int r4 = r4.zza
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x0077
            goto L_0x008a
        L_0x0077:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x0067
        L_0x007c:
            int r2 = r3.f38804d
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008b
        L_0x008a:
            r2 = r5
        L_0x008b:
            r4 = 1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.f38820g
            goto L_0x00df
        L_0x0093:
            int r7 = r26.m54994A()
            int r8 = r0.f38530X
            r9 = 0
            if (r7 <= r8) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            boolean r10 = r0.f38526T
            if (r10 != 0) goto L_0x00d9
            com.google.android.gms.internal.ads.zzaal r10 = r0.f38519M
            if (r10 == 0) goto L_0x00b0
            long r10 = r10.mo41193b()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00b0
            goto L_0x00d9
        L_0x00b0:
            boolean r5 = r0.f38516J
            if (r5 == 0) goto L_0x00bf
            boolean r6 = r26.m55003K()
            if (r6 != 0) goto L_0x00bf
            r0.f38529W = r4
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.f38819f
            goto L_0x00df
        L_0x00bf:
            r0.f38524R = r5
            r5 = 0
            r0.f38527U = r5
            r0.f38530X = r9
            com.google.android.gms.internal.ads.zzty[] r7 = r0.f38513G
            int r10 = r7.length
            r11 = 0
        L_0x00cb:
            if (r11 >= r10) goto L_0x00d5
            r12 = r7[r11]
            r12.mo48233E(r9)
            int r11 = r11 + 1
            goto L_0x00cb
        L_0x00d5:
            com.google.android.gms.internal.ads.zztg.m54983h(r1, r5, r5)
            goto L_0x00db
        L_0x00d9:
            r0.f38530X = r7
        L_0x00db:
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.m55290b(r8, r2)
        L_0x00df:
            boolean r3 = r2.mo48345c()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.zzsr r3 = r0.f38538f
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f38492j
            long r12 = r0.f38520N
            r4 = r15
            r14 = r32
            r15 = r16
            r3.mo48176j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x00ff
            long unused = r1.f38483a
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.mo48204f(com.google.android.gms.internal.ads.zzws, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzwq");
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo48205g(zzws zzws, long j, long j2) {
        zzaal zzaal;
        if (this.f38520N == -9223372036854775807L && (zzaal = this.f38519M) != null) {
            boolean e = zzaal.mo41195e();
            long B = m54995B(true);
            long j3 = B == Long.MIN_VALUE ? 0 : B + WorkRequest.MIN_BACKOFF_MILLIS;
            this.f38520N = j3;
            this.f38540o.mo48197b(j3, e, this.f38521O);
        }
        zztg zztg = (zztg) zzws;
        zzfy g = zztg.f38485c;
        zzrz zzrz = new zzrz(zztg.f38483a, zztg.f38493k, g.mo46577p(), g.mo46578q(), j, j2, g.mo46576o());
        long unused = zztg.f38483a;
        this.f38538f.mo48174h(zzrz, 1, -1, (zzaf) null, 0, (Object) null, zztg.f38492j, this.f38520N);
        this.f38531Y = true;
        zzsf zzsf = this.f38511E;
        Objects.requireNonNull(zzsf);
        zzsf.mo47685f(this);
    }

    /* renamed from: h */
    public final void mo41254h(zzaal zzaal) {
        this.f38510D.post(new zztf(this, zzaal));
    }

    /* renamed from: i */
    public final void mo48135i() throws IOException {
        mo48211w();
        if (this.f38531Y && !this.f38516J) {
            throw zzbu.m44135a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: j */
    public final void mo48206j(zzaf zzaf) {
        this.f38510D.post(this.f38508B);
    }

    /* renamed from: j0 */
    public final void mo41255j0() {
        this.f38515I = true;
        this.f38510D.post(this.f38508B);
    }

    /* renamed from: k */
    public final zzaap mo41256k(int i, int i2) {
        return m54996C(new zztj(i, false));
    }

    /* renamed from: l */
    public final long mo48137l(long j, zzkd zzkd) {
        long j2;
        long j3 = j;
        zzkd zzkd2 = zzkd;
        m54997D();
        if (!this.f38519M.mo41195e()) {
            return 0;
        }
        zzaaj c = this.f38519M.mo41194c(j3);
        long j4 = c.f23734a.f23739a;
        long j5 = c.f23735b.f23739a;
        long j6 = zzkd2.f37738a;
        if (j6 != 0) {
            j2 = j6;
        } else if (zzkd2.f37739b == 0) {
            return j3;
        } else {
            j2 = 0;
        }
        long j7 = j;
        long h0 = zzen.m49167h0(j7, j2, Long.MIN_VALUE);
        long a0 = zzen.m49153a0(j7, zzkd2.f37739b, LocationRequestCompat.PASSIVE_INTERVAL);
        boolean z = true;
        boolean z2 = h0 <= j4 && j4 <= a0;
        if (h0 > j5 || j5 > a0) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j5 : h0;
            }
        } else if (Math.abs(j4 - j3) > Math.abs(j5 - j3)) {
            return j5;
        }
        return j4;
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        return this.f38542s.mo48358l() && this.f38507A.mo44617d();
    }

    /* renamed from: n */
    public final long mo48139n(long j) {
        m54997D();
        boolean[] zArr = this.f38518L.f38502b;
        if (true != this.f38519M.mo41195e()) {
            j = 0;
        }
        this.f38524R = false;
        this.f38527U = j;
        if (m55002J()) {
            this.f38528V = j;
            return j;
        }
        if (this.f38522P != 7) {
            int length = this.f38513G.length;
            int i = 0;
            while (i < length) {
                if (this.f38513G[i].mo48239K(j, false) || (!zArr[i] && this.f38517K)) {
                    i++;
                }
            }
            return j;
        }
        this.f38529W = false;
        this.f38528V = j;
        this.f38531Y = false;
        zzww zzww = this.f38542s;
        if (zzww.mo48358l()) {
            for (zzty z : this.f38513G) {
                z.mo48247z();
            }
            this.f38542s.mo48353g();
        } else {
            zzww.mo48354h();
            for (zzty E : this.f38513G) {
                E.mo48233E(false);
            }
        }
        return j;
    }

    /* renamed from: o */
    public final void mo48140o(long j, boolean z) {
        m54997D();
        if (!m55002J()) {
            boolean[] zArr = this.f38518L.f38503c;
            int length = this.f38513G.length;
            for (int i = 0; i < length; i++) {
                this.f38513G[i].mo48246y(j, false, zArr[i]);
            }
        }
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo48207p(zzws zzws, long j, long j2, boolean z) {
        zztg zztg = (zztg) zzws;
        zzfy g = zztg.f38485c;
        zzrz zzrz = new zzrz(zztg.f38483a, zztg.f38493k, g.mo46577p(), g.mo46578q(), j, j2, g.mo46576o());
        long unused = zztg.f38483a;
        this.f38538f.mo48172f(zzrz, 1, -1, (zzaf) null, 0, (Object) null, zztg.f38492j, this.f38520N);
        if (!z) {
            for (zzty E : this.f38513G) {
                E.mo48233E(false);
            }
            if (this.f38525S > 0) {
                zzsf zzsf = this.f38511E;
                Objects.requireNonNull(zzsf);
                zzsf.mo47685f(this);
            }
        }
    }

    /* renamed from: q */
    public final void mo48141q(zzsf zzsf, long j) {
        this.f38511E = zzsf;
        this.f38507A.mo44618e();
        m55001I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo48208t() {
        if (!this.f38532Z) {
            zzsf zzsf = this.f38511E;
            Objects.requireNonNull(zzsf);
            zzsf.mo47685f(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo48209u() {
        this.f38526T = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo48210v(zzaal zzaal) {
        zzaal zzaal2;
        if (this.f38512F == null) {
            zzaal2 = zzaal;
        } else {
            zzaal2 = new zzaak(-9223372036854775807L, 0);
        }
        this.f38519M = zzaal2;
        this.f38520N = zzaal.mo41193b();
        boolean z = false;
        int i = 1;
        if (!this.f38526T && zzaal.mo41193b() == -9223372036854775807L) {
            z = true;
        }
        this.f38521O = z;
        if (true == z) {
            i = 7;
        }
        this.f38522P = i;
        this.f38540o.mo48197b(this.f38520N, zzaal.mo41195e(), this.f38521O);
        if (!this.f38516J) {
            m54998E();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo48211w() throws IOException {
        this.f38542s.mo48355i(zzwm.m55276a(this.f38522P));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo48212x(int i) throws IOException {
        this.f38513G[i].mo48230B();
        mo48211w();
    }

    /* renamed from: y */
    public final void mo48213y() {
        if (this.f38516J) {
            for (zzty C : this.f38513G) {
                C.mo48231C();
            }
        }
        this.f38542s.mo48356j(this);
        this.f38510D.removeCallbacksAndMessages((Object) null);
        this.f38511E = null;
        this.f38532Z = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo48214z(int i) {
        return !m55003K() && this.f38513G[i].mo48238J(this.f38531Y);
    }

    public final long zzb() {
        long j;
        m54997D();
        if (this.f38531Y || this.f38525S == 0) {
            return Long.MIN_VALUE;
        }
        if (m55002J()) {
            return this.f38528V;
        }
        if (this.f38517K) {
            int length = this.f38513G.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztk zztk = this.f38518L;
                if (zztk.f38502b[i] && zztk.f38503c[i] && !this.f38513G[i].mo48237I()) {
                    j = Math.min(j, this.f38513G[i].mo48244w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            j = m54995B(false);
        }
        return j == Long.MIN_VALUE ? this.f38527U : j;
    }
}
