package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzawu extends zzasg {

    /* renamed from: P */
    private static final byte[] f26122P = zzbar.m43000p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f26123A;

    /* renamed from: B */
    private ByteBuffer[] f26124B;

    /* renamed from: C */
    private long f26125C;

    /* renamed from: D */
    private int f26126D;

    /* renamed from: E */
    private int f26127E;

    /* renamed from: F */
    private boolean f26128F;

    /* renamed from: G */
    private boolean f26129G;

    /* renamed from: H */
    private int f26130H;

    /* renamed from: I */
    private int f26131I;

    /* renamed from: J */
    private boolean f26132J;

    /* renamed from: K */
    private boolean f26133K;

    /* renamed from: L */
    private boolean f26134L;

    /* renamed from: M */
    private boolean f26135M;

    /* renamed from: N */
    private boolean f26136N;

    /* renamed from: O */
    protected zzauq f26137O;

    /* renamed from: i */
    private final zzaww f26138i;

    /* renamed from: j */
    private final zzaur f26139j;

    /* renamed from: k */
    private final zzaur f26140k;

    /* renamed from: l */
    private final zzasx f26141l;

    /* renamed from: m */
    private final List f26142m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f26143n;

    /* renamed from: o */
    private zzasw f26144o;

    /* renamed from: p */
    private MediaCodec f26145p;

    /* renamed from: q */
    private zzaws f26146q;

    /* renamed from: r */
    private boolean f26147r;

    /* renamed from: s */
    private boolean f26148s;

    /* renamed from: t */
    private boolean f26149t;

    /* renamed from: u */
    private boolean f26150u;

    /* renamed from: v */
    private boolean f26151v;

    /* renamed from: w */
    private boolean f26152w;

    /* renamed from: x */
    private boolean f26153x;

    /* renamed from: y */
    private boolean f26154y;

    /* renamed from: z */
    private boolean f26155z;

    public zzawu(int i, zzaww zzaww, zzauw zzauw, boolean z) {
        super(i);
        zzbac.m42926e(zzbar.f26418a >= 16);
        this.f26138i = zzaww;
        this.f26139j = new zzaur(0);
        this.f26140k = new zzaur(0);
        this.f26141l = new zzasx();
        this.f26142m = new ArrayList();
        this.f26143n = new MediaCodec.BufferInfo();
        this.f26130H = 0;
        this.f26131I = 0;
    }

    /* renamed from: x */
    private final void mo42363x() throws zzasi {
        if (this.f26131I == 2) {
            mo42157N();
            mo42155L();
            return;
        }
        this.f26135M = true;
        mo42047E();
    }

    /* renamed from: y */
    private final boolean m42688y() throws zzasi {
        MediaCodec mediaCodec = this.f26145p;
        if (mediaCodec == null || this.f26131I == 2 || this.f26134L) {
            return false;
        }
        if (this.f26126D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f26126D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzaur zzaur = this.f26139j;
            zzaur.f25709c = this.f26123A[dequeueInputBuffer];
            zzaur.mo42065b();
        }
        if (this.f26131I == 1) {
            if (!this.f26150u) {
                this.f26133K = true;
                this.f26145p.queueInputBuffer(this.f26126D, 0, 0, 0, 4);
                this.f26126D = -1;
            }
            this.f26131I = 2;
            return false;
        } else if (this.f26154y) {
            this.f26154y = false;
            ByteBuffer byteBuffer = this.f26139j.f25709c;
            byte[] bArr = f26122P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f26145p;
            int i = this.f26126D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.f26126D = -1;
            this.f26132J = true;
            return true;
        } else {
            if (this.f26130H == 1) {
                for (int i2 = 0; i2 < this.f26144o.f25529s.size(); i2++) {
                    this.f26139j.f25709c.put((byte[]) this.f26144o.f25529s.get(i2));
                }
                this.f26130H = 2;
            }
            int position = this.f26139j.f25709c.position();
            int l = mo41899l(this.f26141l, this.f26139j, false);
            if (l == -3) {
                return false;
            }
            if (l == -5) {
                if (this.f26130H == 2) {
                    this.f26139j.mo42065b();
                    this.f26130H = 1;
                }
                mo42045C(this.f26141l.f25531a);
                return true;
            }
            zzaur zzaur2 = this.f26139j;
            if (zzaur2.mo42069f()) {
                if (this.f26130H == 2) {
                    zzaur2.mo42065b();
                    this.f26130H = 1;
                }
                this.f26134L = true;
                if (!this.f26132J) {
                    mo42363x();
                    return false;
                }
                try {
                    if (!this.f26150u) {
                        this.f26133K = true;
                        this.f26145p.queueInputBuffer(this.f26126D, 0, 0, 0, 4);
                        this.f26126D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzasi.m42275a(e, mo41897j());
                }
            } else if (!this.f26136N || zzaur2.mo42070g()) {
                this.f26136N = false;
                boolean i3 = zzaur2.mo42075i();
                if (this.f26147r && !i3) {
                    ByteBuffer byteBuffer2 = zzaur2.f25709c;
                    byte[] bArr2 = zzbai.f26399a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (b == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i5++;
                        }
                        if (b != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.f26139j.f25709c.position() == 0) {
                        return true;
                    }
                    this.f26147r = false;
                }
                try {
                    zzaur zzaur3 = this.f26139j;
                    long j = zzaur3.f25710d;
                    if (zzaur3.mo42068e()) {
                        this.f26142m.add(Long.valueOf(j));
                    }
                    this.f26139j.f25709c.flip();
                    mo42156M(this.f26139j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.f26139j.f25708b.mo42071a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f26145p.queueSecureInputBuffer(this.f26126D, 0, a, j, 0);
                    } else {
                        this.f26145p.queueInputBuffer(this.f26126D, 0, this.f26139j.f25709c.limit(), j, 0);
                    }
                    this.f26126D = -1;
                    this.f26132J = true;
                    this.f26130H = 0;
                    this.f26137O.f25703c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzasi.m42275a(e2, mo41897j());
                }
            } else {
                zzaur2.mo42065b();
                if (this.f26130H == 2) {
                    this.f26130H = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo42043A(zzaws zzaws, MediaCodec mediaCodec, zzasw zzasw, MediaCrypto mediaCrypto) throws zzawz;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo42044B(String str, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.f25505B == r0.f25505B) goto L_0x0053;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42045C(com.google.android.gms.internal.ads.zzasw r6) throws com.google.android.gms.internal.ads.zzasi {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzasw r0 = r5.f26144o
            r5.f26144o = r6
            com.google.android.gms.internal.ads.zzauv r6 = r6.f25530z
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.zzauv r1 = r0.f25530z
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.zzbar.m42999o(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzasw r6 = r5.f26144o
            com.google.android.gms.internal.ads.zzauv r6 = r6.f25530z
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo41897j()
            com.google.android.gms.internal.ads.zzasi r6 = com.google.android.gms.internal.ads.zzasi.m42275a(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.f26145p
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzaws r2 = r5.f26146q
            boolean r2 = r2.f26117b
            com.google.android.gms.internal.ads.zzasw r3 = r5.f26144o
            boolean r6 = r5.mo42158O(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.f26129G = r1
            r5.f26130H = r1
            boolean r6 = r5.f26149t
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzasw r6 = r5.f26144o
            int r3 = r6.f25504A
            int r4 = r0.f25504A
            if (r3 != r4) goto L_0x0052
            int r6 = r6.f25505B
            int r0 = r0.f25505B
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r5.f26154y = r1
            return
        L_0x0056:
            boolean r6 = r5.f26132J
            if (r6 == 0) goto L_0x005d
            r5.f26131I = r1
            return
        L_0x005d:
            r5.mo42157N()
            r5.mo42155L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.mo42045C(com.google.android.gms.internal.ads.zzasw):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo42046D(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzasi {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo42047E() throws zzasi {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract boolean mo42048G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzasi;

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final MediaCodec mo42153J() {
        return this.f26145p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final zzaws mo42154K() {
        return this.f26146q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b5  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42155L() throws com.google.android.gms.internal.ads.zzasi {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f26145p
            if (r0 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzasw r0 = r11.f26144o
            if (r0 != 0) goto L_0x000a
            goto L_0x01dc
        L_0x000a:
            com.google.android.gms.internal.ads.zzaws r1 = r11.f26146q
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzaww r1 = r11.f26138i     // Catch:{ zzawz -> 0x002e }
            com.google.android.gms.internal.ads.zzaws r1 = r11.mo42053z(r1, r0, r3)     // Catch:{ zzawz -> 0x002e }
            r11.f26146q = r1     // Catch:{ zzawz -> 0x002e }
            if (r1 == 0) goto L_0x001b
            goto L_0x0042
        L_0x001b:
            com.google.android.gms.internal.ads.zzawt r0 = new com.google.android.gms.internal.ads.zzawt
            com.google.android.gms.internal.ads.zzasw r1 = r11.f26144o
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.gms.internal.ads.zzasw) r1, (java.lang.Throwable) r2, (boolean) r3, (int) r4)
            int r1 = r11.mo41897j()
            com.google.android.gms.internal.ads.zzasi r0 = com.google.android.gms.internal.ads.zzasi.m42275a(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzawt r1 = new com.google.android.gms.internal.ads.zzawt
            com.google.android.gms.internal.ads.zzasw r2 = r11.f26144o
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.zzasw) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r11.mo41897j()
            com.google.android.gms.internal.ads.zzasi r0 = com.google.android.gms.internal.ads.zzasi.m42275a(r1, r0)
            throw r0
        L_0x0042:
            boolean r0 = r11.mo42159Z(r1)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.google.android.gms.internal.ads.zzaws r0 = r11.f26146q
            java.lang.String r0 = r0.f26116a
            com.google.android.gms.internal.ads.zzasw r1 = r11.f26144o
            int r4 = com.google.android.gms.internal.ads.zzbar.f26418a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List r1 = r1.f25529s
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            r11.f26147r = r1
            r1 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r1) goto L_0x00a0
            java.lang.String r7 = com.google.android.gms.internal.ads.zzbar.f26421d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = 1
        L_0x00a3:
            r11.f26148s = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzbar.f26419b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = 1
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            r11.f26149t = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r11.f26150u = r7
            r7 = 23
            if (r4 > r7) goto L_0x0108
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r1 = 1
            goto L_0x0126
        L_0x0108:
            if (r4 > r1) goto L_0x0125
            java.lang.String r1 = com.google.android.gms.internal.ads.zzbar.f26419b
            java.lang.String r7 = "hb2000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            goto L_0x0106
        L_0x0125:
            r1 = 0
        L_0x0126:
            r11.f26151v = r1
            if (r4 != r5) goto L_0x0134
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = 1
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            r11.f26152w = r1
            com.google.android.gms.internal.ads.zzasw r1 = r11.f26144o
            if (r4 > r6) goto L_0x0149
            int r1 = r1.f25512I
            if (r1 != r10) goto L_0x0149
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0149
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            r11.f26153x = r1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cb }
            r1.<init>()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r6 = "createCodec:"
            r1.append(r6)     // Catch:{ Exception -> 0x01cb }
            r1.append(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzbap.m42983a(r1)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01cb }
            r11.f26145p = r1     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzbap.m42984b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = "configureCodec"
            com.google.android.gms.internal.ads.zzbap.m42983a(r1)     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzaws r1 = r11.f26146q     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r6 = r11.f26145p     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzasw r7 = r11.f26144o     // Catch:{ Exception -> 0x01cb }
            r11.mo42043A(r1, r6, r7, r2)     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzbap.m42984b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.zzbap.m42983a(r1)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f26145p     // Catch:{ Exception -> 0x01cb }
            r1.start()     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.zzbap.m42984b()     // Catch:{ Exception -> 0x01cb }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            long r8 = r6 - r4
            r4 = r11
            r5 = r0
            r4.mo42044B(r5, r6, r8)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f26145p     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.f26123A = r1     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f26145p     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.f26124B = r1     // Catch:{ Exception -> 0x01cb }
            int r0 = r11.zzb()
            r1 = 2
            if (r0 != r1) goto L_0x01b5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01ba
        L_0x01b5:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ba:
            r11.f26125C = r0
            r0 = -1
            r11.f26126D = r0
            r11.f26127E = r0
            r11.f26136N = r10
            com.google.android.gms.internal.ads.zzauq r0 = r11.f26137O
            int r1 = r0.f25701a
            int r1 = r1 + r10
            r0.f25701a = r1
            return
        L_0x01cb:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzawt r2 = new com.google.android.gms.internal.ads.zzawt
            com.google.android.gms.internal.ads.zzasw r4 = r11.f26144o
            r2.<init>((com.google.android.gms.internal.ads.zzasw) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r11.mo41897j()
            com.google.android.gms.internal.ads.zzasi r0 = com.google.android.gms.internal.ads.zzasi.m42275a(r2, r0)
            throw r0
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.mo42155L():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo42156M(zzaur zzaur) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo42157N() {
        this.f26125C = -9223372036854775807L;
        this.f26126D = -1;
        this.f26127E = -1;
        this.f26128F = false;
        this.f26142m.clear();
        this.f26123A = null;
        this.f26124B = null;
        this.f26146q = null;
        this.f26129G = false;
        this.f26132J = false;
        this.f26147r = false;
        this.f26148s = false;
        this.f26149t = false;
        this.f26150u = false;
        this.f26151v = false;
        this.f26153x = false;
        this.f26154y = false;
        this.f26155z = false;
        this.f26133K = false;
        this.f26130H = 0;
        this.f26131I = 0;
        this.f26139j.f25709c = null;
        MediaCodec mediaCodec = this.f26145p;
        if (mediaCodec != null) {
            this.f26137O.f25702b++;
            try {
                mediaCodec.stop();
                try {
                    this.f26145p.release();
                } finally {
                    this.f26145p = null;
                }
            } catch (Throwable th) {
                this.f26145p.release();
                throw th;
            } finally {
                this.f26145p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public boolean mo42158O(MediaCodec mediaCodec, boolean z, zzasw zzasw, zzasw zzasw2) {
        return false;
    }

    /* renamed from: P */
    public boolean mo41979P() {
        return this.f26135M;
    }

    /* renamed from: W */
    public final void mo41980W(long j, long j2) throws zzasi {
        boolean z;
        int i;
        boolean z2;
        if (this.f26135M) {
            mo42047E();
            return;
        }
        if (this.f26144o == null) {
            this.f26140k.mo42065b();
            int l = mo41899l(this.f26141l, this.f26140k, true);
            if (l == -5) {
                mo42045C(this.f26141l.f25531a);
            } else if (l == -4) {
                zzbac.m42926e(this.f26140k.mo42069f());
                this.f26134L = true;
                mo42363x();
                return;
            } else {
                return;
            }
        }
        mo42155L();
        if (this.f26145p != null) {
            zzbap.m42983a("drainAndFeed");
            while (true) {
                if (this.f26127E < 0) {
                    if (!this.f26152w || !this.f26133K) {
                        i = this.f26145p.dequeueOutputBuffer(this.f26143n, 0);
                        this.f26127E = i;
                    } else {
                        try {
                            i = this.f26145p.dequeueOutputBuffer(this.f26143n, 0);
                            this.f26127E = i;
                        } catch (IllegalStateException unused) {
                            mo42363x();
                            if (this.f26135M) {
                                mo42157N();
                            }
                        }
                    }
                    if (i >= 0) {
                        if (this.f26155z) {
                            this.f26155z = false;
                            this.f26145p.releaseOutputBuffer(i, false);
                            this.f26127E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f26143n;
                            if ((bufferInfo.flags & 4) != 0) {
                                mo42363x();
                                this.f26127E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f26124B[this.f26127E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f26143n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.f26143n.presentationTimeUs;
                            int size = this.f26142m.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z2 = false;
                                    break;
                                } else if (((Long) this.f26142m.get(i2)).longValue() == j3) {
                                    this.f26142m.remove(i2);
                                    z2 = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.f26128F = z2;
                        }
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f26145p.getOutputFormat();
                        if (this.f26149t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f26155z = true;
                        } else {
                            if (this.f26153x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo42046D(this.f26145p, outputFormat);
                        }
                    } else if (i == -3) {
                        this.f26124B = this.f26145p.getOutputBuffers();
                    } else if (this.f26150u && (this.f26134L || this.f26131I == 2)) {
                        mo42363x();
                    }
                }
                if (!this.f26152w || !this.f26133K) {
                    MediaCodec mediaCodec = this.f26145p;
                    ByteBuffer[] byteBufferArr = this.f26124B;
                    int i3 = this.f26127E;
                    ByteBuffer byteBuffer2 = byteBufferArr[i3];
                    MediaCodec.BufferInfo bufferInfo3 = this.f26143n;
                    z = mo42048G(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f26128F);
                } else {
                    try {
                        MediaCodec mediaCodec2 = this.f26145p;
                        ByteBuffer[] byteBufferArr2 = this.f26124B;
                        int i4 = this.f26127E;
                        ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                        MediaCodec.BufferInfo bufferInfo4 = this.f26143n;
                        z = mo42048G(j, j2, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f26128F);
                    } catch (IllegalStateException unused2) {
                        mo42363x();
                        if (this.f26135M) {
                            mo42157N();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                long j4 = this.f26143n.presentationTimeUs;
                this.f26127E = -1;
            }
            do {
            } while (m42688y());
            zzbap.m42984b();
        } else {
            mo41907u(j);
            this.f26140k.mo42065b();
            int l2 = mo41899l(this.f26141l, this.f26140k, false);
            if (l2 == -5) {
                mo42045C(this.f26141l.f25531a);
            } else if (l2 == -4) {
                zzbac.m42926e(this.f26140k.mo42069f());
                this.f26134L = true;
                mo42363x();
            }
        }
        this.f26137O.mo42073a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public boolean mo42159Z(zzaws zzaws) {
        return true;
    }

    /* renamed from: b */
    public final int mo41890b() {
        return 4;
    }

    /* renamed from: d */
    public final int mo41982d(zzasw zzasw) throws zzasi {
        try {
            return mo42052v(this.f26138i, zzasw);
        } catch (zzawz e) {
            throw zzasi.m42275a(e, mo41897j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo41901n() {
        this.f26144o = null;
        mo42157N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo41902o(boolean z) throws zzasi {
        this.f26137O = new zzauq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo41903p(long j, boolean z) throws zzasi {
        this.f26134L = false;
        this.f26135M = false;
        if (this.f26145p != null) {
            this.f26125C = -9223372036854775807L;
            this.f26126D = -1;
            this.f26127E = -1;
            this.f26136N = true;
            this.f26128F = false;
            this.f26142m.clear();
            this.f26154y = false;
            this.f26155z = false;
            if (this.f26148s || (this.f26151v && this.f26133K)) {
                mo42157N();
                mo42155L();
            } else if (this.f26131I != 0) {
                mo42157N();
                mo42155L();
            } else {
                this.f26145p.flush();
                this.f26132J = false;
            }
            if (this.f26129G && this.f26144o != null) {
                this.f26130H = 1;
            }
        }
    }

    /* renamed from: t */
    public boolean mo41981t() {
        if (this.f26144o != null) {
            if (mo41896i() || this.f26127E >= 0) {
                return true;
            }
            if (this.f26125C == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f26125C) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo42052v(zzaww zzaww, zzasw zzasw) throws zzawz;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public zzaws mo42053z(zzaww zzaww, zzasw zzasw, boolean z) throws zzawz {
        return zzaxe.m42724c(zzasw.f25527o, false);
    }
}
