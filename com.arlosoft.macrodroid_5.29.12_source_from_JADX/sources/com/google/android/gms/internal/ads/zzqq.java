package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzqq extends zzgr {

    /* renamed from: R0 */
    private static final byte[] f38265R0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, Framer.STDOUT_FRAME_PREFIX, -61, 39, 93, Framer.EXIT_FRAME_PREFIX};

    /* renamed from: A0 */
    private int f38266A0;

    /* renamed from: B0 */
    private int f38267B0;

    /* renamed from: C0 */
    private int f38268C0;

    /* renamed from: D */
    private final zzqk f38269D;

    /* renamed from: D0 */
    private boolean f38270D0;

    /* renamed from: E */
    private final zzqs f38271E;

    /* renamed from: E0 */
    private boolean f38272E0;

    /* renamed from: F */
    private final float f38273F;

    /* renamed from: F0 */
    private boolean f38274F0;

    /* renamed from: G */
    private final zzgi f38275G = new zzgi(0, 0);

    /* renamed from: G0 */
    private long f38276G0;

    /* renamed from: H */
    private final zzgi f38277H = new zzgi(0, 0);

    /* renamed from: H0 */
    private long f38278H0;

    /* renamed from: I */
    private final zzgi f38279I = new zzgi(2, 0);

    /* renamed from: I0 */
    private boolean f38280I0;

    /* renamed from: J */
    private final zzqf f38281J;

    /* renamed from: J0 */
    private boolean f38282J0;

    /* renamed from: K */
    private final zzek f38283K;

    /* renamed from: K0 */
    private boolean f38284K0;

    /* renamed from: L */
    private final ArrayList f38285L;

    /* renamed from: L0 */
    protected zzgs f38286L0;

    /* renamed from: M */
    private final MediaCodec.BufferInfo f38287M;

    /* renamed from: M0 */
    private long f38288M0;

    /* renamed from: N */
    private final long[] f38289N;

    /* renamed from: N0 */
    private long f38290N0;

    /* renamed from: O */
    private final long[] f38291O;

    /* renamed from: O0 */
    private int f38292O0;

    /* renamed from: P */
    private final long[] f38293P;
    @Nullable

    /* renamed from: P0 */
    private zzpr f38294P0;
    @Nullable

    /* renamed from: Q */
    private zzaf f38295Q;
    @Nullable

    /* renamed from: Q0 */
    private zzpr f38296Q0;
    @Nullable

    /* renamed from: R */
    private zzaf f38297R;
    @Nullable

    /* renamed from: S */
    private MediaCrypto f38298S;

    /* renamed from: T */
    private boolean f38299T;

    /* renamed from: U */
    private long f38300U;

    /* renamed from: V */
    private float f38301V;

    /* renamed from: W */
    private float f38302W;
    @Nullable

    /* renamed from: X */
    private zzql f38303X;
    @Nullable

    /* renamed from: Y */
    private zzaf f38304Y;
    @Nullable

    /* renamed from: Z */
    private MediaFormat f38305Z;

    /* renamed from: a0 */
    private boolean f38306a0;

    /* renamed from: b0 */
    private float f38307b0;
    @Nullable

    /* renamed from: c0 */
    private ArrayDeque f38308c0;
    @Nullable

    /* renamed from: d0 */
    private zzqp f38309d0;
    @Nullable

    /* renamed from: e0 */
    private zzqn f38310e0;

    /* renamed from: f0 */
    private int f38311f0;

    /* renamed from: g0 */
    private boolean f38312g0;

    /* renamed from: h0 */
    private boolean f38313h0;

    /* renamed from: i0 */
    private boolean f38314i0;

    /* renamed from: j0 */
    private boolean f38315j0;

    /* renamed from: k0 */
    private boolean f38316k0;

    /* renamed from: l0 */
    private boolean f38317l0;

    /* renamed from: m0 */
    private boolean f38318m0;

    /* renamed from: n0 */
    private boolean f38319n0;

    /* renamed from: o0 */
    private boolean f38320o0;
    @Nullable

    /* renamed from: p0 */
    private zzqg f38321p0;

    /* renamed from: q0 */
    private long f38322q0;

    /* renamed from: r0 */
    private int f38323r0;

    /* renamed from: s0 */
    private int f38324s0;
    @Nullable

    /* renamed from: t0 */
    private ByteBuffer f38325t0;

    /* renamed from: u0 */
    private boolean f38326u0;

    /* renamed from: v0 */
    private boolean f38327v0;

    /* renamed from: w0 */
    private boolean f38328w0;

    /* renamed from: x0 */
    private boolean f38329x0;

    /* renamed from: y0 */
    private boolean f38330y0;

    /* renamed from: z0 */
    private boolean f38331z0;

    public zzqq(int i, zzqk zzqk, zzqs zzqs, boolean z, float f) {
        super(i);
        this.f38269D = zzqk;
        Objects.requireNonNull(zzqs);
        this.f38271E = zzqs;
        this.f38273F = f;
        zzqf zzqf = new zzqf();
        this.f38281J = zzqf;
        this.f38283K = new zzek(10);
        this.f38285L = new ArrayList();
        this.f38287M = new MediaCodec.BufferInfo();
        this.f38301V = 1.0f;
        this.f38302W = 1.0f;
        this.f38300U = -9223372036854775807L;
        this.f38289N = new long[10];
        this.f38291O = new long[10];
        this.f38293P = new long[10];
        this.f38288M0 = -9223372036854775807L;
        this.f38290N0 = -9223372036854775807L;
        zzqf.mo46830i(0);
        zzqf.f36861c.order(ByteOrder.nativeOrder());
        this.f38307b0 = -1.0f;
        this.f38311f0 = 0;
        this.f38266A0 = 0;
        this.f38323r0 = -1;
        this.f38324s0 = -1;
        this.f38322q0 = -9223372036854775807L;
        this.f38276G0 = -9223372036854775807L;
        this.f38278H0 = -9223372036854775807L;
        this.f38267B0 = 0;
        this.f38268C0 = 0;
    }

    /* renamed from: E0 */
    protected static boolean m54649E0(zzaf zzaf) {
        return zzaf.f24200E == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0196, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a6, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0285 A[SYNTHETIC, Splitter:B:149:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b8  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m54650F0(com.google.android.gms.internal.ads.zzqn r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.f38257a
            int r3 = com.google.android.gms.internal.ads.zzen.f34500a
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r3 >= r5) goto L_0x0013
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001f
        L_0x0013:
            float r6 = r8.f38302W
            com.google.android.gms.internal.ads.zzaf r7 = r8.f38295Q
            com.google.android.gms.internal.ads.zzaf[] r9 = r16.mo47318j()
            float r6 = r8.mo47982C(r6, r7, r9)
        L_0x001f:
            float r7 = r8.f38273F
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r6
        L_0x0027:
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzaf r9 = r8.f38295Q
            r10 = 0
            com.google.android.gms.internal.ads.zzqj r9 = r8.mo47986K(r0, r9, r10, r4)
            r11 = 31
            if (r3 < r11) goto L_0x003d
            com.google.android.gms.internal.ads.zznb r12 = r16.mo47329u()
            com.google.android.gms.internal.ads.zzqo.m54647a(r9, r12)
        L_0x003d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0289 }
            r12.<init>()     // Catch:{ all -> 0x0289 }
            r12.append(r1)     // Catch:{ all -> 0x0289 }
            r12.append(r2)     // Catch:{ all -> 0x0289 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0289 }
            android.os.Trace.beginSection(r12)     // Catch:{ all -> 0x0289 }
            r12 = 0
            if (r3 < r5) goto L_0x0075
            if (r3 < r11) goto L_0x0075
            com.google.android.gms.internal.ads.zzaf r1 = r9.f38253c     // Catch:{ all -> 0x0289 }
            java.lang.String r1 = r1.f24213l     // Catch:{ all -> 0x0289 }
            int r1 = com.google.android.gms.internal.ads.zzbt.m44089b(r1)     // Catch:{ all -> 0x0289 }
            java.lang.String r10 = "DMCodecAdapterFactory"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzen.m49176o(r1)     // Catch:{ all -> 0x0289 }
            java.lang.String r13 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r11 = r13.concat(r11)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.zzdw.m48254d(r10, r11)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.zzpw r10 = new com.google.android.gms.internal.ads.zzpw     // Catch:{ all -> 0x0289 }
            r10.<init>(r1, r12)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.zzpy r1 = r10.mo48017c(r9)     // Catch:{ all -> 0x0289 }
            goto L_0x00ae
        L_0x0075:
            com.google.android.gms.internal.ads.zzqn r11 = r9.f38251a     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.util.Objects.requireNonNull(r11)
            java.lang.String r11 = r11.f38257a     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r1 = r1.concat(r13)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r11)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r11 = "configureCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.media.MediaFormat r11 = r9.f38252b     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.view.Surface r13 = r9.f38254d     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1.configure(r11, r13, r10, r12)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            java.lang.String r11 = "startCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1.start()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            com.google.android.gms.internal.ads.zzrh r11 = new com.google.android.gms.internal.ads.zzrh     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1 = r11
        L_0x00ae:
            r8.f38303X = r1     // Catch:{ all -> 0x0289 }
            android.os.Trace.endSection()
            long r10 = android.os.SystemClock.elapsedRealtime()
            r8.f38310e0 = r0
            r8.f38307b0 = r4
            com.google.android.gms.internal.ads.zzaf r1 = r8.f38295Q
            r8.f38304Y = r1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r4 = 25
            if (r3 > r4) goto L_0x00ef
            boolean r15 = r1.equals(r2)
            if (r15 == 0) goto L_0x00ef
            java.lang.String r15 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r12 = "SM-T585"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-A510"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-A520"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-J700"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x00ef
        L_0x00ed:
            r12 = 2
            goto L_0x0128
        L_0x00ef:
            r12 = 24
            if (r3 >= r12) goto L_0x0127
            java.lang.String r12 = "OMX.Nvidia.h264.decode"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0103
            java.lang.String r12 = "OMX.Nvidia.h264.decode.secure"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0127
        L_0x0103:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "tilapia"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x0127
        L_0x0125:
            r12 = 1
            goto L_0x0128
        L_0x0127:
            r12 = 0
        L_0x0128:
            r8.f38311f0 = r12
            com.google.android.gms.internal.ads.zzaf r12 = r8.f38304Y
            r15 = 21
            if (r3 >= r15) goto L_0x0142
            java.util.List r12 = r12.f24215n
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0142
            java.lang.String r12 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0142
            r12 = 1
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            r8.f38312g0 = r12
            r12 = 19
            if (r3 != r12) goto L_0x0163
            java.lang.String r14 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r13 = "SM-G800"
            boolean r13 = r14.startsWith(r13)
            if (r13 == 0) goto L_0x0163
            java.lang.String r13 = "OMX.Exynos.avc.dec"
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x0161
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0163
        L_0x0161:
            r1 = 1
            goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            r8.f38313h0 = r1
            r1 = 29
            if (r3 != r1) goto L_0x0174
            java.lang.String r13 = "c2.android.aac.decoder"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x0174
            r13 = 1
            goto L_0x0175
        L_0x0174:
            r13 = 0
        L_0x0175:
            r8.f38314i0 = r13
            if (r3 > r5) goto L_0x0184
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r5 = 1
            goto L_0x01aa
        L_0x0184:
            if (r3 > r12) goto L_0x01a9
            java.lang.String r5 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r12 = "hb2000"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0198
            java.lang.String r12 = "stvm8"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01a9
        L_0x0198:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0182
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01a9
            goto L_0x0182
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            r8.f38315j0 = r5
            if (r3 != r15) goto L_0x01b8
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01b8
            r5 = 1
            goto L_0x01b9
        L_0x01b8:
            r5 = 0
        L_0x01b9:
            r8.f38316k0 = r5
            if (r3 >= r15) goto L_0x0203
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0203
            java.lang.String r5 = com.google.android.gms.internal.ads.zzen.f34502c
            java.lang.String r12 = "samsung"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0203
            java.lang.String r5 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r12 = "baffin"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "grand"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "fortuna"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "gprimelte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "j2y18lte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "ms01"
            boolean r5 = r5.startsWith(r12)
            if (r5 == 0) goto L_0x0203
        L_0x0201:
            r5 = 1
            goto L_0x0204
        L_0x0203:
            r5 = 0
        L_0x0204:
            r8.f38317l0 = r5
            java.lang.String r5 = r0.f38257a
            if (r3 > r4) goto L_0x0215
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0213
            goto L_0x0215
        L_0x0213:
            r12 = 1
            goto L_0x0241
        L_0x0215:
            if (r3 > r1) goto L_0x0227
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0213
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0213
        L_0x0227:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.f34502c
            java.lang.String r3 = "Amazon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0240
            java.lang.String r1 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r3 = "AFTS"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0240
            boolean r1 = r0.f38262f
            if (r1 == 0) goto L_0x0240
            goto L_0x0213
        L_0x0240:
            r12 = 0
        L_0x0241:
            r8.f38320o0 = r12
            com.google.android.gms.internal.ads.zzql r1 = r8.f38303X
            r1.mo48029q()
            java.lang.String r0 = r0.f38257a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0259
            com.google.android.gms.internal.ads.zzqg r0 = new com.google.android.gms.internal.ads.zzqg
            r0.<init>()
            r8.f38321p0 = r0
        L_0x0259:
            int r0 = r16.mo47305Q()
            r1 = 2
            if (r0 != r1) goto L_0x0269
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.f38322q0 = r0
        L_0x0269:
            com.google.android.gms.internal.ads.zzgs r0 = r8.f38286L0
            int r1 = r0.f37194a
            r3 = 1
            int r1 = r1 + r3
            r0.f37194a = r1
            long r6 = r10 - r6
            r1 = r16
            r3 = r9
            r4 = r10
            r1.mo47989Z(r2, r3, r4, r6)
            return
        L_0x027b:
            r0 = move-exception
            goto L_0x027e
        L_0x027d:
            r0 = move-exception
        L_0x027e:
            r10 = r1
            goto L_0x0283
        L_0x0280:
            r0 = move-exception
            goto L_0x0283
        L_0x0282:
            r0 = move-exception
        L_0x0283:
            if (r10 == 0) goto L_0x0288
            r10.release()     // Catch:{ all -> 0x0289 }
        L_0x0288:
            throw r0     // Catch:{ all -> 0x0289 }
        L_0x0289:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.m54650F0(com.google.android.gms.internal.ads.zzqn, android.media.MediaCrypto):void");
    }

    /* renamed from: G0 */
    private final void m54651G0() throws zzha {
        int i = this.f38268C0;
        if (i == 1) {
            mo47992k0();
        } else if (i == 2) {
            mo47992k0();
            m54656b0();
        } else if (i != 3) {
            this.f38282J0 = true;
            mo47995n0();
        } else {
            mo48085y0();
            mo48083w0();
        }
    }

    /* renamed from: H */
    private final void m54652H() {
        this.f38330y0 = false;
        this.f38281J.mo46720b();
        this.f38279I.mo46720b();
        this.f38329x0 = false;
        this.f38328w0 = false;
    }

    /* renamed from: H0 */
    private final void m54653H0() {
        this.f38323r0 = -1;
        this.f38277H.f36861c = null;
    }

    /* renamed from: I */
    private final void m54654I() throws zzha {
        if (this.f38270D0) {
            this.f38267B0 = 1;
            this.f38268C0 = 3;
            return;
        }
        mo48085y0();
        mo48083w0();
    }

    /* renamed from: I0 */
    private final void m54655I0() {
        this.f38324s0 = -1;
        this.f38325t0 = null;
    }

    @RequiresApi(23)
    /* renamed from: b0 */
    private final void m54656b0() throws zzha {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo47323o(e, this.f38295Q, false, 6006);
        }
    }

    /* renamed from: c0 */
    private final boolean m54657c0() throws zzha {
        if (this.f38270D0) {
            this.f38267B0 = 1;
            if (this.f38313h0 || this.f38315j0) {
                this.f38268C0 = 3;
                return false;
            }
            this.f38268C0 = 2;
        } else {
            m54656b0();
        }
        return true;
    }

    /* renamed from: d0 */
    private final boolean m54658d0() throws zzha {
        zzql zzql = this.f38303X;
        if (zzql == null || this.f38267B0 == 2 || this.f38280I0) {
            return false;
        }
        if (this.f38323r0 < 0) {
            int zza = zzql.zza();
            this.f38323r0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f38277H.f36861c = this.f38303X.mo48031y(zza);
            this.f38277H.mo46720b();
        }
        if (this.f38267B0 == 1) {
            if (!this.f38320o0) {
                this.f38272E0 = true;
                this.f38303X.mo48021h(this.f38323r0, 0, 0, 0, 4);
                m54653H0();
            }
            this.f38267B0 = 2;
            return false;
        } else if (this.f38318m0) {
            this.f38318m0 = false;
            this.f38277H.f36861c.put(f38265R0);
            this.f38303X.mo48021h(this.f38323r0, 0, 38, 0, 0);
            m54653H0();
            this.f38270D0 = true;
            return true;
        } else {
            if (this.f38266A0 == 1) {
                for (int i = 0; i < this.f38304Y.f24215n.size(); i++) {
                    this.f38277H.f36861c.put((byte[]) this.f38304Y.f24215n.get(i));
                }
                this.f38266A0 = 2;
            }
            int position = this.f38277H.f36861c.position();
            zzjg r = mo47326r();
            try {
                int m = mo47321m(r, this.f38277H, 0);
                if (mo47303J()) {
                    this.f38278H0 = this.f38276G0;
                }
                if (m == -3) {
                    return false;
                }
                if (m == -5) {
                    if (this.f38266A0 == 2) {
                        this.f38277H.mo46720b();
                        this.f38266A0 = 1;
                    }
                    mo47985G(r);
                    return true;
                }
                zzgi zzgi = this.f38277H;
                if (zzgi.mo46725g()) {
                    if (this.f38266A0 == 2) {
                        zzgi.mo46720b();
                        this.f38266A0 = 1;
                    }
                    this.f38280I0 = true;
                    if (!this.f38270D0) {
                        m54651G0();
                        return false;
                    }
                    try {
                        if (!this.f38320o0) {
                            this.f38272E0 = true;
                            this.f38303X.mo48021h(this.f38323r0, 0, 0, 0, 4);
                            m54653H0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo47323o(e, this.f38295Q, false, zzen.m49147V(e.getErrorCode()));
                    }
                } else if (this.f38270D0 || zzgi.mo46726h()) {
                    boolean k = zzgi.mo46832k();
                    if (k) {
                        zzgi.f36860b.mo46769b(position);
                    }
                    if (this.f38312g0 && !k) {
                        ByteBuffer byteBuffer = this.f38277H.f36861c;
                        byte[] bArr = zzaaf.f23725a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f38277H.f36861c.position() == 0) {
                            return true;
                        }
                        this.f38312g0 = false;
                    }
                    zzgi zzgi2 = this.f38277H;
                    long j = zzgi2.f36863e;
                    zzqg zzqg = this.f38321p0;
                    if (zzqg != null) {
                        j = zzqg.mo48060b(this.f38295Q, zzgi2);
                        this.f38276G0 = Math.max(this.f38276G0, this.f38321p0.mo48059a(this.f38295Q));
                    }
                    long j2 = j;
                    if (this.f38277H.mo46724f()) {
                        this.f38285L.add(Long.valueOf(j2));
                    }
                    if (this.f38284K0) {
                        this.f38283K.mo45346d(j2, this.f38295Q);
                        this.f38284K0 = false;
                    }
                    this.f38276G0 = Math.max(this.f38276G0, j2);
                    this.f38277H.mo46831j();
                    zzgi zzgi3 = this.f38277H;
                    if (zzgi3.mo46723e()) {
                        mo48082v0(zzgi3);
                    }
                    mo47994m0(this.f38277H);
                    if (k) {
                        try {
                            this.f38303X.mo48024k(this.f38323r0, 0, this.f38277H.f36860b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo47323o(e2, this.f38295Q, false, zzen.m49147V(e2.getErrorCode()));
                        }
                    } else {
                        this.f38303X.mo48021h(this.f38323r0, 0, this.f38277H.f36861c.limit(), j2, 0);
                    }
                    m54653H0();
                    this.f38270D0 = true;
                    this.f38266A0 = 0;
                    this.f38286L0.f37196c++;
                    return true;
                } else {
                    zzgi.mo46720b();
                    if (this.f38266A0 == 2) {
                        this.f38266A0 = 1;
                    }
                    return true;
                }
            } catch (zzgh e3) {
                mo47988O(e3);
                m54660f0(0);
                mo47992k0();
                return true;
            }
        }
    }

    /* renamed from: e0 */
    private final boolean m54659e0() {
        return this.f38324s0 >= 0;
    }

    /* renamed from: f0 */
    private final boolean m54660f0(int i) throws zzha {
        zzjg r = mo47326r();
        this.f38275G.mo46720b();
        int m = mo47321m(r, this.f38275G, i | 4);
        if (m == -5) {
            mo47985G(r);
            return true;
        } else if (m != -4 || !this.f38275G.mo46725g()) {
            return false;
        } else {
            this.f38280I0 = true;
            m54651G0();
            return false;
        }
    }

    /* renamed from: g0 */
    private final boolean m54661g0(long j) {
        return this.f38300U == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f38300U;
    }

    /* renamed from: h0 */
    private final boolean m54662h0(zzaf zzaf) throws zzha {
        if (!(zzen.f34500a < 23 || this.f38303X == null || this.f38268C0 == 3 || mo47305Q() == 0)) {
            float C = mo47982C(this.f38302W, zzaf, mo47318j());
            float f = this.f38307b0;
            if (f == C) {
                return true;
            }
            if (C == -1.0f) {
                m54654I();
                return false;
            } else if (f == -1.0f && C <= this.f38273F) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", C);
                this.f38303X.mo48028n0(bundle);
                this.f38307b0 = C;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    private final void mo47992k0() {
        try {
            this.f38303X.mo48020g();
        } finally {
            mo48086z0();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: A0 */
    public final void mo48073A0() {
        mo48086z0();
        this.f38321p0 = null;
        this.f38308c0 = null;
        this.f38310e0 = null;
        this.f38304Y = null;
        this.f38305Z = null;
        this.f38306a0 = false;
        this.f38274F0 = false;
        this.f38307b0 = -1.0f;
        this.f38311f0 = 0;
        this.f38312g0 = false;
        this.f38313h0 = false;
        this.f38314i0 = false;
        this.f38315j0 = false;
        this.f38316k0 = false;
        this.f38317l0 = false;
        this.f38320o0 = false;
        this.f38331z0 = false;
        this.f38266A0 = 0;
        this.f38299T = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo47301B(zzaf[] zzafArr, long j, long j2) throws zzha {
        boolean z = true;
        if (this.f38290N0 == -9223372036854775807L) {
            if (this.f38288M0 != -9223372036854775807L) {
                z = false;
            }
            zzdd.m47212f(z);
            this.f38288M0 = j;
            this.f38290N0 = j2;
            return;
        }
        int i = this.f38292O0;
        if (i == 10) {
            zzdw.m48255e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f38291O[9]);
        } else {
            this.f38292O0 = i + 1;
        }
        long[] jArr = this.f38289N;
        int i2 = this.f38292O0 - 1;
        jArr[i2] = j;
        this.f38291O[i2] = j2;
        this.f38293P[i2] = this.f38276G0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final boolean mo48074B0() throws zzha {
        boolean C0 = mo48075C0();
        if (C0) {
            mo48083w0();
        }
        return C0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public float mo47982C(float f, zzaf zzaf, zzaf[] zzafArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final boolean mo48075C0() {
        if (this.f38303X == null) {
            return false;
        }
        int i = this.f38268C0;
        if (i == 3 || this.f38313h0 || ((this.f38314i0 && !this.f38274F0) || (this.f38315j0 && this.f38272E0))) {
            mo48085y0();
            return true;
        }
        if (i == 2) {
            int i2 = zzen.f34500a;
            zzdd.m47212f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m54656b0();
                } catch (zzha e) {
                    zzdw.m48256f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    mo48085y0();
                    return true;
                }
            }
        }
        mo47992k0();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract int mo47983D(zzqs zzqs, zzaf zzaf) throws zzqz;

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public boolean mo48076D0(zzqn zzqn) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public zzgt mo47984E(zzqn zzqn, zzaf zzaf, zzaf zzaf2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (m54657c0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (m54657c0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (m54657c0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0 A[RETURN] */
    @androidx.annotation.CallSuper
    @androidx.annotation.Nullable
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzgt mo47985G(com.google.android.gms.internal.ads.zzjg r13) throws com.google.android.gms.internal.ads.zzha {
        /*
            r12 = this;
            r0 = 1
            r12.f38284K0 = r0
            com.google.android.gms.internal.ads.zzaf r4 = r13.f37624a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.f24213l
            r2 = 0
            if (r1 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzpr r13 = r13.f37625b
            r12.f38296Q0 = r13
            r12.f38295Q = r4
            boolean r1 = r12.f38328w0
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.f38330y0 = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.zzql r1 = r12.f38303X
            if (r1 != 0) goto L_0x0025
            r12.f38308c0 = r3
            r12.mo48083w0()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.zzqn r3 = r12.f38310e0
            com.google.android.gms.internal.ads.zzaf r5 = r12.f38304Y
            com.google.android.gms.internal.ads.zzpr r6 = r12.f38294P0
            r7 = 23
            if (r6 != r13) goto L_0x00d1
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            com.google.android.gms.internal.ads.zzdd.m47212f(r7)
            com.google.android.gms.internal.ads.zzgt r7 = r12.mo47984E(r3, r5, r4)
            int r8 = r7.f37254d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b4
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.m54662h0(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.f38304Y = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m54657c0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x005e:
            boolean r8 = r12.m54662h0(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.f38331z0 = r0
            r12.f38266A0 = r0
            int r8 = r12.f38311f0
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.f24218q
            int r10 = r5.f24218q
            if (r8 != r10) goto L_0x007c
            int r8 = r4.f24219r
            int r10 = r5.f24219r
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r12.f38318m0 = r0
            r12.f38304Y = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m54657c0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x008a:
            boolean r8 = r12.m54662h0(r4)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r6 = 16
            goto L_0x00b8
        L_0x0093:
            r12.f38304Y = r4
            if (r13 == r6) goto L_0x009f
            boolean r13 = r12.m54657c0()
            if (r13 != 0) goto L_0x00b7
        L_0x009d:
            r6 = 2
            goto L_0x00b8
        L_0x009f:
            boolean r13 = r12.f38270D0
            if (r13 == 0) goto L_0x00b7
            r12.f38267B0 = r0
            boolean r13 = r12.f38313h0
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r12.f38315j0
            if (r13 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r12.f38268C0 = r0
            goto L_0x00b7
        L_0x00b1:
            r12.f38268C0 = r9
            goto L_0x009d
        L_0x00b4:
            r12.m54654I()
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            int r13 = r7.f37254d
            if (r13 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzql r13 = r12.f38303X
            if (r13 != r1) goto L_0x00c4
            int r13 = r12.f38268C0
            if (r13 != r9) goto L_0x00d0
        L_0x00c4:
            com.google.android.gms.internal.ads.zzgt r13 = new com.google.android.gms.internal.ads.zzgt
            java.lang.String r2 = r3.f38257a
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00d0:
            return r7
        L_0x00d1:
            if (r13 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            int r13 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r13 < r7) goto L_0x00e7
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzo.f37986e
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzo.f37982a
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e7
            r13.equals(r0)
        L_0x00e7:
            r12.m54654I()
            com.google.android.gms.internal.ads.zzgt r13 = new com.google.android.gms.internal.ads.zzgt
            java.lang.String r2 = r3.f38257a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzha r13 = r12.mo47323o(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.mo47985G(com.google.android.gms.internal.ads.zzjg):com.google.android.gms.internal.ads.zzgt");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract zzqj mo47986K(zzqn zzqn, zzaf zzaf, @Nullable MediaCrypto mediaCrypto, float f);

    /* renamed from: M */
    public boolean mo47771M() {
        if (this.f38295Q != null) {
            if (mo47317i() || m54659e0()) {
                return true;
            }
            if (this.f38322q0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f38322q0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract List mo47987N(zzqs zzqs, zzaf zzaf, boolean z) throws zzqz;

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo47988O(Exception exc) {
        throw null;
    }

    /* renamed from: T */
    public boolean mo47772T() {
        return this.f38282J0;
    }

    /* renamed from: U */
    public void mo47308U(float f, float f2) throws zzha {
        this.f38301V = f;
        this.f38302W = f2;
        m54662h0(this.f38304Y);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.google.android.gms.internal.ads.zzql} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.zzqq} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|260|(1:195)|199|210|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r15.f38297R != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ac, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        m54651G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02af, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b1, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b3, code lost:
        if (r15.f38282J0 != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b5, code lost:
        mo48085y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b8, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x032d, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        m54651G0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r15.f38282J0 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        mo48085y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015a, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0150 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3 A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030e A[Catch:{ IllegalStateException -> 0x034f }, LOOP:2: B:75:0x0139->B:193:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0318 A[Catch:{ IllegalStateException -> 0x034f }, LOOP:4: B:195:0x0318->B:198:0x0322, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x030d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0315 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016a A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47773Y(long r24, long r26) throws com.google.android.gms.internal.ads.zzha {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.f38282J0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x000c
            r23.mo47995n0()     // Catch:{ IllegalStateException -> 0x0352 }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzaf r0 = r15.f38295Q     // Catch:{ IllegalStateException -> 0x0352 }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m54660f0(r11)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.mo48083w0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f38328w0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ IllegalStateException -> 0x0352 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0027:
            boolean r0 = r15.f38282J0     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdd.m47212f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.mo48058q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.f36861c     // Catch:{ IllegalStateException -> 0x0352 }
            int r8 = r15.f38324s0     // Catch:{ IllegalStateException -> 0x0352 }
            int r10 = r0.mo48054m()     // Catch:{ IllegalStateException -> 0x0352 }
            long r11 = r0.f36863e     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r16 = r0.mo46724f()     // Catch:{ IllegalStateException -> 0x0352 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo46725g()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r4 = r15.f38297R     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.mo47996o0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.mo48055n()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.mo48084x0(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            r0.mo46720b()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0121
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02be
        L_0x007b:
            boolean r0 = r15.f38280I0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.f38282J0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            goto L_0x0121
        L_0x0085:
            r14 = 1
            boolean r0 = r15.f38329x0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo48057p(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzdd.m47212f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            r15.f38329x0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.f38330y0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo48058q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            r23.m54652H()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f38330y0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            r23.mo48083w0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f38328w0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
        L_0x00b2:
            boolean r0 = r15.f38280I0     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdd.m47212f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzjg r0 = r23.mo47326r()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo46720b()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00c1:
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo46720b()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.mo47321m(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = -5
            if (r1 == r2) goto L_0x0101
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.mo46725g()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00de
            r15.f38280I0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x00de:
            boolean r1 = r15.f38284K0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzaf r1 = r15.f38295Q     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.Objects.requireNonNull(r1)
            r15.f38297R = r1     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 0
            r15.mo47991i0(r1, r2)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f38284K0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00ef:
            com.google.android.gms.internal.ads.zzgi r1 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo46831j()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqf r1 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgi r2 = r15.f38279I     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.mo48057p(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != 0) goto L_0x00c1
            r15.f38329x0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x0101:
            r15.mo47985G(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0104:
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.mo48058q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x010f
            r0.mo46831j()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x010f:
            com.google.android.gms.internal.ads.zzqf r0 = r15.f38281J     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo48058q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.f38280I0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.f38330y0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
            goto L_0x0027
        L_0x0121:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0347
        L_0x012a:
            com.google.android.gms.internal.ads.zzql r0 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0335
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0330 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ IllegalStateException -> 0x0330 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0330 }
        L_0x0139:
            boolean r0 = r23.m54659e0()     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.f38316k0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            boolean r0 = r15.f38272E0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzql r0 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0150 }
            android.media.MediaCodec$BufferInfo r1 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0150 }
            int r0 = r0.mo48027n(r1)     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0168
        L_0x0150:
            r23.m54651G0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f38282J0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            r23.mo48085y0()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x015a:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0318
        L_0x0160:
            com.google.android.gms.internal.ads.zzql r0 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            int r0 = r0.mo48027n(r1)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0168:
            if (r0 >= 0) goto L_0x01a3
            r1 = -2
            if (r0 != r1) goto L_0x0193
            r15.f38274F0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzql r0 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r0 = r0.mo48018a()     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.f38311f0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 32
            if (r1 != r2) goto L_0x018e
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != r2) goto L_0x018e
            r15.f38319n0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x018e:
            r15.f38305Z = r0     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f38306a0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x0193:
            boolean r0 = r15.f38320o0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r15.f38280I0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x019f
            int r0 = r15.f38267B0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != r11) goto L_0x015a
        L_0x019f:
            r23.m54651G0()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01a3:
            boolean r1 = r15.f38319n0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x01b6
            r15.f38319n0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzql r1 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo48026m(r0, r13)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01ae:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0307
        L_0x01b6:
            android.media.MediaCodec$BufferInfo r1 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            if (r2 != 0) goto L_0x01c6
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01c6
            r23.m54651G0()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01c6:
            r15.f38324s0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzql r1 = r15.f38303X     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r1.mo48030x(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f38325t0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x01e5
            android.media.MediaCodec$BufferInfo r1 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r15.f38325t0     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01e5:
            boolean r0 = r15.f38317l0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0206
            android.media.MediaCodec$BufferInfo r0 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0206
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0206
            long r1 = r15.f38276G0     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0206
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0206:
            android.media.MediaCodec$BufferInfo r0 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.ArrayList r2 = r15.f38285L     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
        L_0x0211:
            if (r3 >= r2) goto L_0x022d
            java.util.ArrayList r4 = r15.f38285L     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x0352 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x0352 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            java.util.ArrayList r0 = r15.f38285L     // Catch:{ IllegalStateException -> 0x0352 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = 1
            goto L_0x022e
        L_0x022a:
            int r3 = r3 + 1
            goto L_0x0211
        L_0x022d:
            r0 = 0
        L_0x022e:
            r15.f38326u0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r15.f38278H0     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r2 = r15.f38287M     // Catch:{ IllegalStateException -> 0x0352 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x023c
            r0 = 1
            goto L_0x023d
        L_0x023c:
            r0 = 0
        L_0x023d:
            r15.f38327v0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzek r0 = r15.f38283K     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.mo45345c(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0255
            boolean r1 = r15.f38306a0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x0255
            com.google.android.gms.internal.ads.zzek r0 = r15.f38283K     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.mo45344b()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0255:
            if (r0 == 0) goto L_0x025a
            r15.f38297R = r0     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0262
        L_0x025a:
            boolean r0 = r15.f38306a0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzaf r0 = r15.f38297R     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            com.google.android.gms.internal.ads.zzaf r0 = r15.f38297R     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r1 = r15.f38305Z     // Catch:{ IllegalStateException -> 0x0352 }
            r15.mo47991i0(r0, r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f38306a0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x026b:
            boolean r0 = r15.f38316k0     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r15.f38272E0     // Catch:{ IllegalStateException -> 0x02c2 }
            if (r0 == 0) goto L_0x02c7
            com.google.android.gms.internal.ads.zzql r6 = r15.f38303X     // Catch:{ IllegalStateException -> 0x02a8 }
            java.nio.ByteBuffer r7 = r15.f38325t0     // Catch:{ IllegalStateException -> 0x02a8 }
            int r8 = r15.f38324s0     // Catch:{ IllegalStateException -> 0x02a8 }
            android.media.MediaCodec$BufferInfo r0 = r15.f38287M     // Catch:{ IllegalStateException -> 0x02a8 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02a8 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r0 = r15.f38326u0     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r2 = r15.f38327v0     // Catch:{ IllegalStateException -> 0x02a8 }
            com.google.android.gms.internal.ads.zzaf r3 = r15.f38297R     // Catch:{ IllegalStateException -> 0x02a8 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.mo47996o0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02ac }
            goto L_0x02eb
        L_0x02a8:
            r21 = r9
            r19 = 0
        L_0x02ac:
            r23.m54651G0()     // Catch:{ IllegalStateException -> 0x02bc }
            r15 = r23
            boolean r0 = r15.f38282J0     // Catch:{ IllegalStateException -> 0x032d }
            if (r0 == 0) goto L_0x02b8
            r23.mo48085y0()     // Catch:{ IllegalStateException -> 0x032d }
        L_0x02b8:
            r1 = r15
        L_0x02b9:
            r2 = r21
            goto L_0x0318
        L_0x02bc:
            r0 = move-exception
            r2 = 1
        L_0x02be:
            r1 = r23
            goto L_0x0357
        L_0x02c2:
            r0 = move-exception
            r19 = 0
            goto L_0x032e
        L_0x02c7:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.zzql r6 = r15.f38303X     // Catch:{ IllegalStateException -> 0x032d }
            java.nio.ByteBuffer r7 = r15.f38325t0     // Catch:{ IllegalStateException -> 0x032d }
            int r8 = r15.f38324s0     // Catch:{ IllegalStateException -> 0x032d }
            android.media.MediaCodec$BufferInfo r0 = r15.f38287M     // Catch:{ IllegalStateException -> 0x032d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x032d }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x032d }
            boolean r13 = r15.f38326u0     // Catch:{ IllegalStateException -> 0x032d }
            boolean r14 = r15.f38327v0     // Catch:{ IllegalStateException -> 0x032d }
            com.google.android.gms.internal.ads.zzaf r0 = r15.f38297R     // Catch:{ IllegalStateException -> 0x032d }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.mo47996o0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0329 }
        L_0x02eb:
            if (r0 == 0) goto L_0x0315
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.f38287M     // Catch:{ IllegalStateException -> 0x034f }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x034f }
            r1.mo48084x0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            android.media.MediaCodec$BufferInfo r0 = r1.f38287M     // Catch:{ IllegalStateException -> 0x034f }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x034f }
            r23.m54655I0()     // Catch:{ IllegalStateException -> 0x034f }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0305
            r23.m54651G0()     // Catch:{ IllegalStateException -> 0x034f }
            goto L_0x02b9
        L_0x0305:
            r2 = r21
        L_0x0307:
            boolean r0 = r1.m54661g0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x030e
            goto L_0x0318
        L_0x030e:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x0139
        L_0x0315:
            r1 = r23
            goto L_0x02b9
        L_0x0318:
            boolean r0 = r23.m54658d0()     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 == 0) goto L_0x0324
            boolean r0 = r1.m54661g0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x0318
        L_0x0324:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            goto L_0x0347
        L_0x0329:
            r0 = move-exception
            r1 = r23
            goto L_0x0350
        L_0x032d:
            r0 = move-exception
        L_0x032e:
            r1 = r15
            goto L_0x0350
        L_0x0330:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x0350
        L_0x0335:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.zzgs r0 = r1.f38286L0     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r0.f37197d     // Catch:{ IllegalStateException -> 0x034f }
            int r3 = r23.mo47324p(r24)     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r2 + r3
            r0.f37197d = r2     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            r1.m54660f0(r2)     // Catch:{ IllegalStateException -> 0x034d }
        L_0x0347:
            com.google.android.gms.internal.ads.zzgs r0 = r1.f38286L0     // Catch:{ IllegalStateException -> 0x034d }
            r0.mo47387a()     // Catch:{ IllegalStateException -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            goto L_0x0357
        L_0x034f:
            r0 = move-exception
        L_0x0350:
            r2 = 1
            goto L_0x0357
        L_0x0352:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0357:
            int r3 = com.google.android.gms.internal.ads.zzen.f34500a
            r4 = 21
            if (r3 < r4) goto L_0x0362
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0362
            goto L_0x0377
        L_0x0362:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03a0
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03a0
        L_0x0377:
            r1.mo47988O(r0)
            if (r3 < r4) goto L_0x038b
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x038b
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x038b
            r14 = 1
            goto L_0x038c
        L_0x038b:
            r14 = 0
        L_0x038c:
            if (r14 == 0) goto L_0x0391
            r23.mo48085y0()
        L_0x0391:
            com.google.android.gms.internal.ads.zzqn r2 = r1.f38310e0
            com.google.android.gms.internal.ads.zzqm r0 = r1.mo48080t0(r0, r2)
            com.google.android.gms.internal.ads.zzaf r2 = r1.f38295Q
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzha r0 = r1.mo47323o(r0, r2, r14, r3)
            throw r0
        L_0x03a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.mo47773Y(long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo47989Z(String str, zzqj zzqj, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo47990a0(String str) {
        throw null;
    }

    /* renamed from: b */
    public final int mo47312b() {
        return 8;
    }

    /* renamed from: d */
    public final int mo47775d(zzaf zzaf) throws zzha {
        try {
            return mo47983D(this.f38271E, zzaf);
        } catch (zzqz e) {
            throw mo47323o(e, zzaf, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo47991i0(zzaf zzaf, @Nullable MediaFormat mediaFormat) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void mo47993l0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo47994m0(zzgi zzgi) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public void mo47995n0() throws zzha {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public abstract boolean mo47996o0(long j, long j2, @Nullable zzql zzql, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzaf) throws zzha;

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public boolean mo47997p0(zzaf zzaf) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final float mo48077q0() {
        return this.f38301V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final long mo48078r0() {
        return this.f38290N0;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: s0 */
    public final zzql mo48079s0() {
        return this.f38303X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public zzqm mo48080t0(Throwable th, @Nullable zzqn zzqn) {
        return new zzqm(th, zzqn);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: u0 */
    public final zzqn mo48081u0() {
        return this.f38310e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo47330v() {
        this.f38295Q = null;
        this.f38288M0 = -9223372036854775807L;
        this.f38290N0 = -9223372036854775807L;
        this.f38292O0 = 0;
        mo48075C0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo48082v0(zzgi zzgi) throws zzha {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo47331w(boolean z, boolean z2) throws zzha {
        this.f38286L0 = new zzgs();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public final void mo48083w0() throws zzha {
        zzaf zzaf;
        if (this.f38303X == null && !this.f38328w0 && (zzaf = this.f38295Q) != null) {
            if (this.f38296Q0 != null || !mo47997p0(zzaf)) {
                zzpr zzpr = this.f38296Q0;
                this.f38294P0 = zzpr;
                zzaf zzaf2 = this.f38295Q;
                String str = zzaf2.f24213l;
                if (zzpr == null || !zzps.f38195a) {
                    try {
                        if (this.f38308c0 == null) {
                            List N = mo47987N(this.f38271E, zzaf2, false);
                            N.isEmpty();
                            this.f38308c0 = new ArrayDeque();
                            if (!N.isEmpty()) {
                                this.f38308c0.add((zzqn) N.get(0));
                            }
                            this.f38309d0 = null;
                        }
                        if (!this.f38308c0.isEmpty()) {
                            zzqn zzqn = (zzqn) this.f38308c0.peekFirst();
                            while (this.f38303X == null) {
                                zzqn zzqn2 = (zzqn) this.f38308c0.peekFirst();
                                if (mo48076D0(zzqn2)) {
                                    try {
                                        m54650F0(zzqn2, (MediaCrypto) null);
                                    } catch (Exception e) {
                                        if (zzqn2 == zzqn) {
                                            zzdw.m48255e("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                            Thread.sleep(50);
                                            m54650F0(zzqn2, (MediaCrypto) null);
                                        } else {
                                            throw e;
                                        }
                                    } catch (Exception e2) {
                                        zzdw.m48256f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqn2)), e2);
                                        this.f38308c0.removeFirst();
                                        zzqp zzqp = new zzqp(this.f38295Q, (Throwable) e2, false, zzqn2);
                                        mo47988O(zzqp);
                                        zzqp zzqp2 = this.f38309d0;
                                        if (zzqp2 == null) {
                                            this.f38309d0 = zzqp;
                                        } else {
                                            this.f38309d0 = zzqp.m54648a(zzqp2, zzqp);
                                        }
                                        if (this.f38308c0.isEmpty()) {
                                            throw this.f38309d0;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.f38308c0 = null;
                            return;
                        }
                        throw new zzqp(this.f38295Q, (Throwable) null, false, -49999);
                    } catch (zzqz e3) {
                        throw new zzqp(this.f38295Q, (Throwable) e3, false, -49998);
                    } catch (zzqp e4) {
                        throw mo47323o(e4, this.f38295Q, false, 4001);
                    }
                } else {
                    zzpi a = zzpr.mo48016a();
                    throw mo47323o(a, this.f38295Q, false, a.zza);
                }
            } else {
                zzaf zzaf3 = this.f38295Q;
                m54652H();
                String str2 = zzaf3.f24213l;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.f38281J.mo48056o(32);
                } else {
                    this.f38281J.mo48056o(1);
                }
                this.f38328w0 = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo47332x(long j, boolean z) throws zzha {
        this.f38280I0 = false;
        this.f38282J0 = false;
        if (this.f38328w0) {
            this.f38281J.mo46720b();
            this.f38279I.mo46720b();
            this.f38329x0 = false;
        } else {
            mo48074B0();
        }
        zzek zzek = this.f38283K;
        if (zzek.mo45343a() > 0) {
            this.f38284K0 = true;
        }
        zzek.mo45347e();
        int i = this.f38292O0;
        if (i != 0) {
            int i2 = i - 1;
            this.f38290N0 = this.f38291O[i2];
            this.f38288M0 = this.f38289N[i2];
            this.f38292O0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: x0 */
    public void mo48084x0(long j) {
        while (true) {
            int i = this.f38292O0;
            if (i != 0 && j >= this.f38293P[0]) {
                long[] jArr = this.f38289N;
                this.f38288M0 = jArr[0];
                this.f38290N0 = this.f38291O[0];
                int i2 = i - 1;
                this.f38292O0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f38291O;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f38292O0);
                long[] jArr3 = this.f38293P;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f38292O0);
                mo47993l0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo47333y() {
        try {
            m54652H();
            mo48085y0();
        } finally {
            this.f38296Q0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final void mo48085y0() {
        try {
            zzql zzql = this.f38303X;
            if (zzql != null) {
                zzql.mo48023j();
                this.f38286L0.f37195b++;
                mo47990a0(this.f38310e0.f38257a);
            }
        } finally {
            this.f38303X = null;
            this.f38298S = null;
            this.f38294P0 = null;
            mo48073A0();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: z0 */
    public void mo48086z0() {
        m54653H0();
        m54655I0();
        this.f38322q0 = -9223372036854775807L;
        this.f38272E0 = false;
        this.f38270D0 = false;
        this.f38318m0 = false;
        this.f38319n0 = false;
        this.f38326u0 = false;
        this.f38327v0 = false;
        this.f38285L.clear();
        this.f38276G0 = -9223372036854775807L;
        this.f38278H0 = -9223372036854775807L;
        zzqg zzqg = this.f38321p0;
        if (zzqg != null) {
            zzqg.mo48061c();
        }
        this.f38267B0 = 0;
        this.f38268C0 = 0;
        this.f38266A0 = this.f38331z0 ? 1 : 0;
    }
}
