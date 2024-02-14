package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzpa extends zzqq implements zzji {

    /* renamed from: S0 */
    private final Context f38119S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public final zznr f38120T0;

    /* renamed from: U0 */
    private final zzny f38121U0;

    /* renamed from: V0 */
    private int f38122V0;

    /* renamed from: W0 */
    private boolean f38123W0;
    @Nullable

    /* renamed from: X0 */
    private zzaf f38124X0;

    /* renamed from: Y0 */
    private long f38125Y0;

    /* renamed from: Z0 */
    private boolean f38126Z0;

    /* renamed from: a1 */
    private boolean f38127a1;

    /* renamed from: b1 */
    private boolean f38128b1;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c1 */
    public zzjz f38129c1;

    public zzpa(Context context, zzqk zzqk, zzqs zzqs, boolean z, @Nullable Handler handler, @Nullable zzns zzns, zzny zzny) {
        super(1, zzqk, zzqs, false, 44100.0f);
        this.f38119S0 = context.getApplicationContext();
        this.f38121U0 = zzny;
        this.f38120T0 = new zznr(handler, zzns);
        zzny.mo47928n(new zzoz(this, (zzoy) null));
    }

    /* renamed from: H0 */
    private final void m54475H0() {
        long I0 = this.f38121U0.mo47914I0(mo47772T());
        if (I0 != Long.MIN_VALUE) {
            if (!this.f38127a1) {
                I0 = Math.max(this.f38125Y0, I0);
            }
            this.f38125Y0 = I0;
            this.f38127a1 = false;
        }
    }

    /* renamed from: L0 */
    private final int m54478L0(zzqn zzqn, zzaf zzaf) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzqn.f38257a) || (i = zzen.f34500a) >= 24 || (i == 23 && zzen.m49185x(this.f38119S0))) {
            return zzaf.f24214m;
        }
        return -1;
    }

    /* renamed from: M0 */
    private static List m54479M0(zzqs zzqs, zzaf zzaf, boolean z, zzny zzny) throws zzqz {
        zzqn d;
        String str = zzaf.f24213l;
        if (str == null) {
            return zzfvn.m51135w();
        }
        if (zzny.mo47933s(zzaf) && (d = zzrf.m54725d()) != null) {
            return zzfvn.m51136z(d);
        }
        List f = zzrf.m54727f(str, false, false);
        String e = zzrf.m54726e(zzaf);
        if (e == null) {
            return zzfvn.m51133t(f);
        }
        List f2 = zzrf.m54727f(e, false, false);
        zzfvk m = zzfvn.m51129m();
        m.mo46429g(f);
        m.mo46429g(f2);
        return m.mo46430h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo47300A() {
        m54475H0();
        this.f38121U0.mo47920f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final float mo47982C(float f, zzaf zzaf, zzaf[] zzafArr) {
        int i = -1;
        for (zzaf zzaf2 : zzafArr) {
            int i2 = zzaf2.f24227z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final int mo47983D(zzqs zzqs, zzaf zzaf) throws zzqz {
        boolean z;
        int i = 128;
        if (!zzbt.m44094g(zzaf.f24213l)) {
            return 128;
        }
        int i2 = zzen.f34500a >= 21 ? 32 : 0;
        int i3 = zzaf.f24200E;
        boolean E0 = zzqq.m54649E0(zzaf);
        if (E0 && this.f38121U0.mo47933s(zzaf) && (i3 == 0 || zzrf.m54725d() != null)) {
            return i2 | 140;
        }
        if (("audio/raw".equals(zzaf.f24213l) && !this.f38121U0.mo47933s(zzaf)) || !this.f38121U0.mo47933s(zzen.m49162f(2, zzaf.f24226y, zzaf.f24227z))) {
            return 129;
        }
        List M0 = m54479M0(zzqs, zzaf, false, this.f38121U0);
        if (M0.isEmpty()) {
            return 129;
        }
        if (!E0) {
            return 130;
        }
        zzqn zzqn = (zzqn) M0.get(0);
        boolean d = zzqn.mo48068d(zzaf);
        if (!d) {
            int i4 = 1;
            while (true) {
                if (i4 >= M0.size()) {
                    break;
                }
                zzqn zzqn2 = (zzqn) M0.get(i4);
                if (zzqn2.mo48068d(zzaf)) {
                    zzqn = zzqn2;
                    z = false;
                    d = true;
                    break;
                }
                i4++;
            }
        }
        z = true;
        int i5 = true != d ? 3 : 4;
        int i6 = 8;
        if (d && zzqn.mo48069e(zzaf)) {
            i6 = 16;
        }
        int i7 = true != zzqn.f38263g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        return i5 | i6 | i2 | i7 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final zzgt mo47984E(zzqn zzqn, zzaf zzaf, zzaf zzaf2) {
        int i;
        int i2;
        zzgt b = zzqn.mo48067b(zzaf, zzaf2);
        int i3 = b.f37255e;
        if (m54478L0(zzqn, zzaf2) > this.f38122V0) {
            i3 |= 64;
        }
        String str = zzqn.f38257a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f37254d;
            i = 0;
        }
        return new zzgt(str, zzaf, zzaf2, i2, i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: G */
    public final zzgt mo47985G(zzjg zzjg) throws zzha {
        zzgt G = super.mo47985G(zzjg);
        this.f38120T0.mo47897g(zzjg.f37624a, G);
        return G;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqj mo47986K(com.google.android.gms.internal.ads.zzqn r8, com.google.android.gms.internal.ads.zzaf r9, @androidx.annotation.Nullable android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaf[] r10 = r7.mo47318j()
            int r0 = r7.m54478L0(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.zzgt r6 = r8.mo48067b(r9, r5)
            int r6 = r6.f37254d
            if (r6 == 0) goto L_0x0023
            int r5 = r7.m54478L0(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.f38122V0 = r0
            java.lang.String r10 = r8.f38257a
            int r0 = com.google.android.gms.internal.ads.zzen.f34500a
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.f34502c
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.f38123W0 = r10
            java.lang.String r10 = r8.f38259c
            int r4 = r7.f38122V0
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.f24226y
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.f24227z
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.f24215n
            com.google.android.gms.internal.ads.zzdy.m48350b(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.zzdy.m48349a(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.f24213l
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.zzny r10 = r7.f38121U0
            int r11 = r9.f24226y
            int r1 = r9.f24227z
            r2 = 4
            com.google.android.gms.internal.ads.zzaf r11 = com.google.android.gms.internal.ads.zzen.m49162f(r2, r11, r1)
            int r10 = r10.mo47918d(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r2)
        L_0x00db:
            r10 = 32
            if (r0 < r10) goto L_0x00e6
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L_0x00e6:
            java.lang.String r10 = r8.f38258b
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r9.f24213l
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fb
            r10 = r9
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            r7.f38124X0 = r10
            com.google.android.gms.internal.ads.zzqj r8 = com.google.android.gms.internal.ads.zzqj.m54621a(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpa.mo47986K(com.google.android.gms.internal.ads.zzqn, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqj");
    }

    /* renamed from: L */
    public final String mo47770L() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: M */
    public final boolean mo47771M() {
        return this.f38121U0.mo47932r() || super.mo47771M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final List mo47987N(zzqs zzqs, zzaf zzaf, boolean z) throws zzqz {
        return zzrf.m54728g(m54479M0(zzqs, zzaf, false, this.f38121U0), zzaf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo47988O(Exception exc) {
        zzdw.m48253c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f38120T0.mo47891a(exc);
    }

    /* renamed from: T */
    public final boolean mo47772T() {
        return super.mo47772T() && this.f38121U0.mo47934u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo47989Z(String str, zzqj zzqj, long j, long j2) {
        this.f38120T0.mo47893c(str, j, j2);
    }

    /* renamed from: a */
    public final zzby mo47609a() {
        return this.f38121U0.mo47915a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void mo47990a0(String str) {
        this.f38120T0.mo47894d(str);
    }

    /* renamed from: e */
    public final void mo47314e(int i, @Nullable Object obj) throws zzha {
        if (i == 2) {
            this.f38121U0.mo47931q(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f38121U0.mo47929o((zzk) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f38121U0.mo47913G(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f38121U0.mo47930p(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f38129c1 = (zzjz) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f38121U0.mo47924j((zzl) obj);
        }
    }

    /* renamed from: f */
    public final void mo47614f(zzby zzby) {
        this.f38121U0.mo47925k(zzby);
    }

    @Nullable
    /* renamed from: g */
    public final zzji mo47315g() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo47991i0(zzaf zzaf, @Nullable MediaFormat mediaFormat) throws zzha {
        int i;
        int i2;
        zzaf zzaf2 = this.f38124X0;
        int[] iArr = null;
        if (zzaf2 != null) {
            zzaf = zzaf2;
        } else if (mo48079s0() != null) {
            if ("audio/raw".equals(zzaf.f24213l)) {
                i = zzaf.f24196A;
            } else if (zzen.f34500a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? zzen.m49149X(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzad zzad = new zzad();
            zzad.mo41343s("audio/raw");
            zzad.mo41338n(i);
            zzad.mo41321c(zzaf.f24197B);
            zzad.mo41323d(zzaf.f24198C);
            zzad.mo41326e0(mediaFormat.getInteger("channel-count"));
            zzad.mo41344t(mediaFormat.getInteger("sample-rate"));
            zzaf y = zzad.mo41349y();
            if (this.f38123W0 && y.f24226y == 6 && (i2 = zzaf.f24226y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzaf.f24226y; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzaf = y;
        }
        try {
            this.f38121U0.mo47923i(zzaf, 0, iArr);
        } catch (zznt e) {
            throw mo47323o(e, e.zza, false, 5001);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: k0 */
    public final void mo47992k0() {
        this.f38127a1 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final void mo47993l0() {
        this.f38121U0.mo47917c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final void mo47994m0(zzgi zzgi) {
        if (this.f38126Z0 && !zzgi.mo46724f()) {
            if (Math.abs(zzgi.f36863e - this.f38125Y0) > 500000) {
                this.f38125Y0 = zzgi.f36863e;
            }
            this.f38126Z0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo47995n0() throws zzha {
        try {
            this.f38121U0.mo47921g();
        } catch (zznx e) {
            throw mo47323o(e, e.zzc, e.zzb, 5002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final boolean mo47996o0(long j, long j2, @Nullable zzql zzql, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzaf) throws zzha {
        Objects.requireNonNull(byteBuffer);
        if (this.f38124X0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zzql);
            zzql.mo48026m(i, false);
            return true;
        } else if (z) {
            if (zzql != null) {
                zzql.mo48026m(i, false);
            }
            this.f38286L0.f37199f += i3;
            this.f38121U0.mo47917c();
            return true;
        } else {
            try {
                if (!this.f38121U0.mo47926l(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzql != null) {
                    zzql.mo48026m(i, false);
                }
                this.f38286L0.f37198e += i3;
                return true;
            } catch (zznu e) {
                throw mo47323o(e, e.zzc, e.zzb, 5001);
            } catch (zznx e2) {
                throw mo47323o(e2, zzaf, e2.zzb, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final boolean mo47997p0(zzaf zzaf) {
        return this.f38121U0.mo47933s(zzaf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo47330v() {
        this.f38128b1 = true;
        try {
            this.f38121U0.mo47916b();
            try {
                super.mo47330v();
            } finally {
                this.f38120T0.mo47895e(this.f38286L0);
            }
        } catch (Throwable th) {
            super.mo47330v();
            throw th;
        } finally {
            this.f38120T0.mo47895e(this.f38286L0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo47331w(boolean z, boolean z2) throws zzha {
        super.mo47331w(z, z2);
        this.f38120T0.mo47896f(this.f38286L0);
        mo47327s();
        this.f38121U0.mo47927m(mo47329u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo47332x(long j, boolean z) throws zzha {
        super.mo47332x(j, z);
        this.f38121U0.mo47916b();
        this.f38125Y0 = j;
        this.f38126Z0 = true;
        this.f38127a1 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo47333y() {
        try {
            super.mo47333y();
            if (this.f38128b1) {
                this.f38128b1 = false;
                this.f38121U0.mo47922h();
            }
        } catch (Throwable th) {
            if (this.f38128b1) {
                this.f38128b1 = false;
                this.f38121U0.mo47922h();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo47334z() {
        this.f38121U0.mo47919e();
    }

    public final long zza() {
        if (mo47305Q() == 2) {
            m54475H0();
        }
        return this.f38125Y0;
    }
}
