package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbba extends zzawu {

    /* renamed from: Q */
    private final Context f26450Q;

    /* renamed from: R */
    private final zzbbc f26451R;

    /* renamed from: S */
    private final zzbbk f26452S;

    /* renamed from: T */
    private final boolean f26453T;

    /* renamed from: U */
    private final long[] f26454U;

    /* renamed from: V */
    private zzasw[] f26455V;

    /* renamed from: W */
    private zzbaz f26456W;

    /* renamed from: X */
    private Surface f26457X;

    /* renamed from: Y */
    private Surface f26458Y;

    /* renamed from: Z */
    private boolean f26459Z;

    /* renamed from: a0 */
    private long f26460a0;

    /* renamed from: b0 */
    private long f26461b0;

    /* renamed from: c0 */
    private int f26462c0;

    /* renamed from: d0 */
    private int f26463d0;

    /* renamed from: e0 */
    private int f26464e0;

    /* renamed from: f0 */
    private float f26465f0;

    /* renamed from: g0 */
    private int f26466g0;

    /* renamed from: h0 */
    private int f26467h0;

    /* renamed from: i0 */
    private int f26468i0;

    /* renamed from: j0 */
    private float f26469j0;

    /* renamed from: k0 */
    private int f26470k0;

    /* renamed from: l0 */
    private int f26471l0;

    /* renamed from: m0 */
    private int f26472m0;

    /* renamed from: n0 */
    private float f26473n0;

    /* renamed from: o0 */
    private long f26474o0;

    /* renamed from: p0 */
    private int f26475p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbba(Context context, zzaww zzaww, long j, Handler handler, zzbbl zzbbl, int i) {
        super(2, zzaww, (zzauw) null, false);
        boolean z = false;
        this.f26450Q = context.getApplicationContext();
        this.f26451R = new zzbbc(context);
        this.f26452S = new zzbbk(handler, zzbbl);
        if (zzbar.f26418a <= 22 && "foster".equals(zzbar.f26419b) && "NVIDIA".equals(zzbar.f26420c)) {
            z = true;
        }
        this.f26453T = z;
        this.f26454U = new long[10];
        this.f26474o0 = -9223372036854775807L;
        this.f26460a0 = -9223372036854775807L;
        this.f26466g0 = -1;
        this.f26467h0 = -1;
        this.f26469j0 = -1.0f;
        this.f26465f0 = -1.0f;
        m43010e0();
    }

    /* renamed from: d0 */
    private static int m43009d0(zzasw zzasw) {
        int i = zzasw.f25507D;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: e0 */
    private final void m43010e0() {
        this.f26470k0 = -1;
        this.f26471l0 = -1;
        this.f26473n0 = -1.0f;
        this.f26472m0 = -1;
    }

    /* renamed from: f0 */
    private final void m43011f0() {
        if (this.f26462c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f26452S.mo42380d(this.f26462c0, elapsedRealtime - this.f26461b0);
            this.f26462c0 = 0;
            this.f26461b0 = elapsedRealtime;
        }
    }

    /* renamed from: g0 */
    private final void m43012g0() {
        int i = this.f26470k0;
        int i2 = this.f26466g0;
        if (i != i2 || this.f26471l0 != this.f26467h0 || this.f26472m0 != this.f26468i0 || this.f26473n0 != this.f26469j0) {
            this.f26452S.mo42384h(i2, this.f26467h0, this.f26468i0, this.f26469j0);
            this.f26470k0 = this.f26466g0;
            this.f26471l0 = this.f26467h0;
            this.f26472m0 = this.f26468i0;
            this.f26473n0 = this.f26469j0;
        }
    }

    /* renamed from: h0 */
    private final void m43013h0() {
        if (this.f26470k0 != -1 || this.f26471l0 != -1) {
            this.f26452S.mo42384h(this.f26466g0, this.f26467h0, this.f26468i0, this.f26469j0);
        }
    }

    /* renamed from: i0 */
    private static boolean m43014i0(long j) {
        return j < -30000;
    }

    /* renamed from: j0 */
    private final boolean m43015j0(boolean z) {
        if (zzbar.f26418a < 23 || (z && !zzbax.m43007b(this.f26450Q))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42043A(com.google.android.gms.internal.ads.zzaws r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.zzasw r14, android.media.MediaCrypto r15) throws com.google.android.gms.internal.ads.zzawz {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzasw[] r15 = r11.f26455V
            int r0 = r14.f25504A
            int r1 = r14.f25505B
            int r2 = r14.f25528p
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0091
            java.lang.String r2 = r14.f25527o
            if (r0 == r4) goto L_0x0090
            if (r1 != r4) goto L_0x0014
            goto L_0x0090
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 5
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 4
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            if (r2 == 0) goto L_0x0088
            if (r2 == r7) goto L_0x0088
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0088
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008b
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbar.f26421d
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.zzbar.m42988d(r0, r2)
            int r2 = com.google.android.gms.internal.ads.zzbar.m42988d(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x008a
        L_0x0088:
            int r2 = r0 * r1
        L_0x008a:
            r8 = 2
        L_0x008b:
            int r2 = r2 * 3
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            int r15 = r15.length
            com.google.android.gms.internal.ads.zzbaz r15 = new com.google.android.gms.internal.ads.zzbaz
            r15.<init>(r0, r1, r2)
            r11.f26456W = r15
            boolean r0 = r11.f26453T
            android.media.MediaFormat r14 = r14.mo41966b()
            int r1 = r15.f26446a
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.f26447b
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.f26448c
            if (r15 == r4) goto L_0x00b6
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b6:
            if (r0 == 0) goto L_0x00bd
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bd:
            android.view.Surface r15 = r11.f26457X
            if (r15 != 0) goto L_0x00dc
            boolean r15 = r12.f26119d
            boolean r15 = r11.m43015j0(r15)
            com.google.android.gms.internal.ads.zzbac.m42926e(r15)
            android.view.Surface r15 = r11.f26458Y
            if (r15 != 0) goto L_0x00d8
            android.content.Context r15 = r11.f26450Q
            boolean r12 = r12.f26119d
            com.google.android.gms.internal.ads.zzbax r12 = com.google.android.gms.internal.ads.zzbax.m43006a(r15, r12)
            r11.f26458Y = r12
        L_0x00d8:
            android.view.Surface r12 = r11.f26458Y
            r11.f26457X = r12
        L_0x00dc:
            android.view.Surface r12 = r11.f26457X
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.zzbar.f26418a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbba.mo42043A(com.google.android.gms.internal.ads.zzaws, android.media.MediaCodec, com.google.android.gms.internal.ads.zzasw, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo42044B(String str, long j, long j2) {
        this.f26452S.mo42378b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo42045C(zzasw zzasw) throws zzasi {
        super.mo42045C(zzasw);
        this.f26452S.mo42382f(zzasw);
        float f = zzasw.f25508E;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f26465f0 = f;
        this.f26464e0 = m43009d0(zzasw);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo42046D(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f26466g0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f26467h0 = i2;
        float f = this.f26465f0;
        this.f26469j0 = f;
        if (zzbar.f26418a >= 21) {
            int i3 = this.f26464e0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f26466g0;
                this.f26466g0 = i2;
                this.f26467h0 = i4;
                this.f26469j0 = 1.0f / f;
            }
        } else {
            this.f26468i0 = this.f26464e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo42048G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f26475p0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f26454U;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.f26474o0 = j5;
            int i5 = i4 - 1;
            this.f26475p0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.f26474o0;
        if (z) {
            mo42362c0(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.f26457X == this.f26458Y) {
            if (!m43014i0(j7)) {
                return false;
            }
            mo42362c0(mediaCodec2, i3, j6);
            return true;
        } else if (!this.f26459Z) {
            if (zzbar.f26418a >= 21) {
                mo42361b0(mediaCodec, i, j6, System.nanoTime());
            } else {
                mo42360a0(mediaCodec2, i3, j6);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.f26451R.mo42368a(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (a - nanoTime) / 1000;
            if (m43014i0(j8)) {
                zzbap.m42983a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzbap.m42984b();
                zzauq zzauq = this.f26137O;
                zzauq.f25706f++;
                this.f26462c0++;
                int i6 = this.f26463d0 + 1;
                this.f26463d0 = i6;
                zzauq.f25707g = Math.max(i6, zzauq.f25707g);
                if (this.f26462c0 == -1) {
                    m43011f0();
                }
                return true;
            }
            if (zzbar.f26418a >= 21) {
                if (j8 < 50000) {
                    mo42361b0(mediaCodec, i, j6, a);
                    return true;
                }
            } else if (j8 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                mo42360a0(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo42156M(zzaur zzaur) {
        int i = zzbar.f26418a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo42157N() {
        try {
            super.mo42157N();
        } finally {
            Surface surface = this.f26458Y;
            if (surface != null) {
                if (this.f26457X == surface) {
                    this.f26457X = null;
                }
                surface.release();
                this.f26458Y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final boolean mo42158O(MediaCodec mediaCodec, boolean z, zzasw zzasw, zzasw zzasw2) {
        if (!zzasw.f25527o.equals(zzasw2.f25527o) || m43009d0(zzasw) != m43009d0(zzasw2)) {
            return false;
        }
        if (!z && (zzasw.f25504A != zzasw2.f25504A || zzasw.f25505B != zzasw2.f25505B)) {
            return false;
        }
        int i = zzasw2.f25504A;
        zzbaz zzbaz = this.f26456W;
        return i <= zzbaz.f26446a && zzasw2.f25505B <= zzbaz.f26447b && zzasw2.f25528p <= zzbaz.f26448c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final boolean mo42159Z(zzaws zzaws) {
        return this.f26457X != null || m43015j0(zzaws.f26119d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void mo42360a0(MediaCodec mediaCodec, int i, long j) {
        m43012g0();
        zzbap.m42983a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzbap.m42984b();
        this.f26137O.f25704d++;
        this.f26463d0 = 0;
        mo42363x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void mo42361b0(MediaCodec mediaCodec, int i, long j, long j2) {
        m43012g0();
        zzbap.m42983a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzbap.m42984b();
        this.f26137O.f25704d++;
        this.f26463d0 = 0;
        mo42363x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final void mo42362c0(MediaCodec mediaCodec, int i, long j) {
        zzbap.m42983a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzbap.m42984b();
        this.f26137O.f25705e++;
    }

    /* renamed from: f */
    public final void mo41893f(int i, Object obj) throws zzasi {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f26458Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzaws K = mo42154K();
                    if (K != null && m43015j0(K.f26119d)) {
                        surface = zzbax.m43006a(this.f26450Q, K.f26119d);
                        this.f26458Y = surface;
                    }
                }
            }
            if (this.f26457X != surface) {
                this.f26457X = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec J = mo42153J();
                    if (zzbar.f26418a < 23 || J == null || surface == null) {
                        mo42157N();
                        mo42155L();
                    } else {
                        J.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f26458Y) {
                    m43010e0();
                    this.f26459Z = false;
                    int i2 = zzbar.f26418a;
                    return;
                }
                m43013h0();
                this.f26459Z = false;
                int i3 = zzbar.f26418a;
                if (zzb == 2) {
                    this.f26460a0 = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f26458Y) {
                m43013h0();
                if (this.f26459Z) {
                    this.f26452S.mo42383g(this.f26457X);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo41901n() {
        this.f26466g0 = -1;
        this.f26467h0 = -1;
        this.f26469j0 = -1.0f;
        this.f26465f0 = -1.0f;
        this.f26474o0 = -9223372036854775807L;
        this.f26475p0 = 0;
        m43010e0();
        this.f26459Z = false;
        int i = zzbar.f26418a;
        this.f26451R.mo42369b();
        try {
            super.mo41901n();
        } finally {
            this.f26137O.mo42073a();
            this.f26452S.mo42379c(this.f26137O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo41902o(boolean z) throws zzasi {
        super.mo41902o(z);
        int i = mo41900m().f25538a;
        this.f26452S.mo42381e(this.f26137O);
        this.f26451R.mo42370c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo41903p(long j, boolean z) throws zzasi {
        super.mo41903p(j, z);
        this.f26459Z = false;
        int i = zzbar.f26418a;
        this.f26463d0 = 0;
        int i2 = this.f26475p0;
        if (i2 != 0) {
            this.f26474o0 = this.f26454U[i2 - 1];
            this.f26475p0 = 0;
        }
        this.f26460a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo41904q() {
        this.f26462c0 = 0;
        this.f26461b0 = SystemClock.elapsedRealtime();
        this.f26460a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo41905r() {
        m43011f0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo41906s(zzasw[] zzaswArr, long j) throws zzasi {
        this.f26455V = zzaswArr;
        if (this.f26474o0 == -9223372036854775807L) {
            this.f26474o0 = j;
            return;
        }
        int i = this.f26475p0;
        if (i == 10) {
            long j2 = this.f26454U[9];
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + j2);
        } else {
            this.f26475p0 = i + 1;
        }
        this.f26454U[this.f26475p0 - 1] = j;
    }

    /* renamed from: t */
    public final boolean mo41981t() {
        Surface surface;
        if (super.mo41981t() && (this.f26459Z || (((surface = this.f26458Y) != null && this.f26457X == surface) || mo42153J() == null))) {
            this.f26460a0 = -9223372036854775807L;
            return true;
        } else if (this.f26460a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f26460a0) {
                return true;
            }
            this.f26460a0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo42052v(zzaww zzaww, zzasw zzasw) throws zzawz {
        boolean z;
        int i;
        int i2;
        String str = zzasw.f25527o;
        int i3 = 0;
        if (!zzbah.m42942b(str)) {
            return 0;
        }
        zzauv zzauv = zzasw.f25530z;
        if (zzauv != null) {
            z = false;
            for (int i4 = 0; i4 < zzauv.f25718d; i4++) {
                z |= zzauv.mo42084a(i4).f25715g;
            }
        } else {
            z = false;
        }
        zzaws c = zzaxe.m42724c(str, z);
        if (c == null) {
            return 1;
        }
        boolean e = c.mo42150e(zzasw.f25524d);
        if (e && (i = zzasw.f25504A) > 0 && (i2 = zzasw.f25505B) > 0) {
            if (zzbar.f26418a >= 21) {
                e = c.mo42151f(i, i2, (double) zzasw.f25506C);
            } else {
                e = i * i2 <= zzaxe.m42722a();
                if (!e) {
                    int i5 = zzasw.f25504A;
                    int i6 = zzasw.f25505B;
                    String str2 = zzbar.f26422e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                }
            }
        }
        int i7 = true != c.f26117b ? 4 : 8;
        if (true == c.f26118c) {
            i3 = 16;
        }
        return (true != e ? 2 : 3) | i7 | i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo42363x() {
        if (!this.f26459Z) {
            this.f26459Z = true;
            this.f26452S.mo42383g(this.f26457X);
        }
    }
}
