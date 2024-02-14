package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.p023dx.p026io.Opcodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaei implements zzzi {

    /* renamed from: c0 */
    public static final zzzp f24076c0 = zzaee.f24023b;

    /* renamed from: d0 */
    private static final byte[] f24077d0 = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final byte[] f24078e0 = zzen.m49127B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    private static final byte[] f24079f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    private static final byte[] f24080g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final UUID f24081h0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final Map f24082i0;

    /* renamed from: A */
    private long f24083A;

    /* renamed from: B */
    private long f24084B;
    @Nullable

    /* renamed from: C */
    private zzdx f24085C;
    @Nullable

    /* renamed from: D */
    private zzdx f24086D;

    /* renamed from: E */
    private boolean f24087E;

    /* renamed from: F */
    private boolean f24088F;

    /* renamed from: G */
    private int f24089G;

    /* renamed from: H */
    private long f24090H;

    /* renamed from: I */
    private long f24091I;

    /* renamed from: J */
    private int f24092J;

    /* renamed from: K */
    private int f24093K;

    /* renamed from: L */
    private int[] f24094L;

    /* renamed from: M */
    private int f24095M;

    /* renamed from: N */
    private int f24096N;

    /* renamed from: O */
    private int f24097O;

    /* renamed from: P */
    private int f24098P;

    /* renamed from: Q */
    private boolean f24099Q;

    /* renamed from: R */
    private long f24100R;

    /* renamed from: S */
    private int f24101S;

    /* renamed from: T */
    private int f24102T;

    /* renamed from: U */
    private int f24103U;

    /* renamed from: V */
    private boolean f24104V;

    /* renamed from: W */
    private boolean f24105W;

    /* renamed from: X */
    private boolean f24106X;

    /* renamed from: Y */
    private int f24107Y;

    /* renamed from: Z */
    private byte f24108Z;

    /* renamed from: a */
    private final zzaed f24109a;

    /* renamed from: a0 */
    private boolean f24110a0;

    /* renamed from: b */
    private final zzaek f24111b;

    /* renamed from: b0 */
    private zzzl f24112b0;

    /* renamed from: c */
    private final SparseArray f24113c;

    /* renamed from: d */
    private final boolean f24114d;

    /* renamed from: e */
    private final zzef f24115e;

    /* renamed from: f */
    private final zzef f24116f;

    /* renamed from: g */
    private final zzef f24117g;

    /* renamed from: h */
    private final zzef f24118h;

    /* renamed from: i */
    private final zzef f24119i;

    /* renamed from: j */
    private final zzef f24120j;

    /* renamed from: k */
    private final zzef f24121k;

    /* renamed from: l */
    private final zzef f24122l;

    /* renamed from: m */
    private final zzef f24123m;

    /* renamed from: n */
    private final zzef f24124n;

    /* renamed from: o */
    private ByteBuffer f24125o;

    /* renamed from: p */
    private long f24126p;

    /* renamed from: q */
    private long f24127q;

    /* renamed from: r */
    private long f24128r;

    /* renamed from: s */
    private long f24129s;

    /* renamed from: t */
    private long f24130t;
    @Nullable

    /* renamed from: u */
    private zzaeh f24131u;

    /* renamed from: v */
    private boolean f24132v;

    /* renamed from: w */
    private int f24133w;

    /* renamed from: x */
    private long f24134x;

    /* renamed from: y */
    private boolean f24135y;

    /* renamed from: z */
    private long f24136z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f24082i0 = Collections.unmodifiableMap(hashMap);
    }

    public zzaei() {
        this(0);
    }

    @CallSuper
    /* renamed from: n */
    protected static final int m41151n(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case Opcodes.XOR_INT_LIT16:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case Opcodes.SHL_INT_LIT8:
            case Opcodes.SHR_INT_LIT8:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @CallSuper
    /* renamed from: o */
    protected static final boolean m41152o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: p */
    private final int m41153p(zzzj zzzj, zzaeh zzaeh, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaeh.f24051b)) {
            m41161x(zzzj, f24077d0, i);
            int i3 = this.f24102T;
            m41160w();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzaeh.f24051b)) {
            m41161x(zzzj, f24079f0, i);
            int i4 = this.f24102T;
            m41160w();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzaeh.f24051b)) {
            m41161x(zzzj, f24080g0, i);
            int i5 = this.f24102T;
            m41160w();
            return i5;
        } else {
            zzaap zzaap = zzaeh.f24048X;
            boolean z2 = true;
            if (!this.f24104V) {
                if (zzaeh.f24057h) {
                    this.f24097O &= -1073741825;
                    int i6 = 128;
                    if (!this.f24105W) {
                        ((zzyy) zzzj).mo48453i(this.f24117g.mo45232h(), 0, 1, false);
                        this.f24101S++;
                        if ((this.f24117g.mo45232h()[0] & 128) != 128) {
                            this.f24108Z = this.f24117g.mo45232h()[0];
                            this.f24105W = true;
                        } else {
                            throw zzbu.m44135a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f24108Z;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f24097O |= BasicMeasure.EXACTLY;
                        if (!this.f24110a0) {
                            ((zzyy) zzzj).mo48453i(this.f24122l.mo45232h(), 0, 8, false);
                            this.f24101S += 8;
                            this.f24110a0 = true;
                            byte[] h = this.f24117g.mo45232h();
                            if (b2 != 2) {
                                i6 = 0;
                            }
                            h[0] = (byte) (i6 | 8);
                            this.f24117g.mo45230f(0);
                            zzaap.mo41213c(this.f24117g, 1, 1);
                            this.f24102T++;
                            this.f24122l.mo45230f(0);
                            zzaap.mo41213c(this.f24122l, 8, 1);
                            this.f24102T += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f24106X) {
                                ((zzyy) zzzj).mo48453i(this.f24117g.mo45232h(), 0, 1, false);
                                this.f24101S++;
                                this.f24117g.mo45230f(0);
                                this.f24107Y = this.f24117g.mo45243s();
                                this.f24106X = true;
                            }
                            int i7 = this.f24107Y * 4;
                            this.f24117g.mo45227c(i7);
                            ((zzyy) zzzj).mo48453i(this.f24117g.mo45232h(), 0, i7, false);
                            this.f24101S += i7;
                            int i8 = (this.f24107Y >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.f24125o;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.f24125o = ByteBuffer.allocate(i9);
                            }
                            this.f24125o.position(0);
                            this.f24125o.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.f24107Y;
                                if (i10 >= i2) {
                                    break;
                                }
                                int v = this.f24117g.mo45246v();
                                if (i10 % 2 == 0) {
                                    this.f24125o.putShort((short) (v - i11));
                                } else {
                                    this.f24125o.putInt(v - i11);
                                }
                                i10++;
                                i11 = v;
                            }
                            int i12 = (i - this.f24101S) - i11;
                            if ((i2 & 1) == 1) {
                                this.f24125o.putInt(i12);
                            } else {
                                this.f24125o.putShort((short) i12);
                                this.f24125o.putInt(0);
                            }
                            this.f24123m.mo45228d(this.f24125o.array(), i9);
                            zzaap.mo41213c(this.f24123m, i9, 1);
                            this.f24102T += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzaeh.f24058i;
                    if (bArr != null) {
                        this.f24120j.mo45228d(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzaeh.f24051b) ? zzaeh.f24055f > 0 : z) {
                    this.f24097O |= 268435456;
                    this.f24124n.mo45227c(0);
                    int l = (this.f24120j.mo45236l() + i) - this.f24101S;
                    this.f24117g.mo45227c(4);
                    this.f24117g.mo45232h()[0] = (byte) ((l >> 24) & 255);
                    this.f24117g.mo45232h()[1] = (byte) ((l >> 16) & 255);
                    this.f24117g.mo45232h()[2] = (byte) ((l >> 8) & 255);
                    this.f24117g.mo45232h()[3] = (byte) (l & 255);
                    zzaap.mo41213c(this.f24117g, 4, 2);
                    this.f24102T += 4;
                }
                this.f24104V = true;
            }
            int l2 = i + this.f24120j.mo45236l();
            if (!"V_MPEG4/ISO/AVC".equals(zzaeh.f24051b) && !"V_MPEGH/ISO/HEVC".equals(zzaeh.f24051b)) {
                if (zzaeh.f24044T != null) {
                    if (this.f24120j.mo45236l() != 0) {
                        z2 = false;
                    }
                    zzdd.m47212f(z2);
                    zzaeh.f24044T.mo41220d(zzzj);
                }
                while (true) {
                    int i13 = this.f24101S;
                    if (i13 >= l2) {
                        break;
                    }
                    int q = m41154q(zzzj, zzaap, l2 - i13);
                    this.f24101S += q;
                    this.f24102T += q;
                }
            } else {
                byte[] h2 = this.f24116f.mo45232h();
                h2[0] = 0;
                h2[1] = 0;
                h2[2] = 0;
                int i14 = zzaeh.f24049Y;
                int i15 = 4 - i14;
                while (this.f24101S < l2) {
                    int i16 = this.f24103U;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.f24120j.mo45233i());
                        ((zzyy) zzzj).mo48453i(h2, i15 + min, i14 - min, false);
                        if (min > 0) {
                            this.f24120j.mo45226b(h2, i15, min);
                        }
                        this.f24101S += i14;
                        this.f24116f.mo45230f(0);
                        this.f24103U = this.f24116f.mo45246v();
                        this.f24115e.mo45230f(0);
                        zzaan.m40938b(zzaap, this.f24115e, 4);
                        this.f24102T += 4;
                    } else {
                        int q2 = m41154q(zzzj, zzaap, i16);
                        this.f24101S += q2;
                        this.f24102T += q2;
                        this.f24103U -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzaeh.f24051b)) {
                this.f24118h.mo45230f(0);
                zzaan.m40938b(zzaap, this.f24118h, 4);
                this.f24102T += 4;
            }
            int i17 = this.f24102T;
            m41160w();
            return i17;
        }
    }

    /* renamed from: q */
    private final int m41154q(zzzj zzzj, zzaap zzaap, int i) throws IOException {
        int i2 = this.f24120j.mo45233i();
        if (i2 <= 0) {
            return zzaan.m40937a(zzaap, zzzj, i, false);
        }
        int min = Math.min(i, i2);
        zzaan.m40938b(zzaap, this.f24120j, min);
        return min;
    }

    /* renamed from: r */
    private final long m41155r(long j) throws zzbu {
        long j2 = this.f24128r;
        if (j2 != -9223372036854775807L) {
            return zzen.m49165g0(j, j2, 1000);
        }
        throw zzbu.m44135a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: s */
    private final void m41156s(int i) throws zzbu {
        if (this.f24085C == null || this.f24086D == null) {
            throw zzbu.m44135a("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: t */
    private final void m41157t(int i) throws zzbu {
        if (this.f24131u == null) {
            throw zzbu.m44135a("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[EDGE_INSN: B:59:0x00e0->B:48:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41158u(com.google.android.gms.internal.ads.zzaeh r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzaaq r2 = r1.f24044T
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzaap r3 = r1.f24048X
            com.google.android.gms.internal.ads.zzaao r8 = r1.f24059j
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.mo41219c(r2, r3, r5, r6, r7, r8)
            goto L_0x0121
        L_0x001c:
            java.lang.String r2 = r1.f24051b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.f24051b
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.f24051b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0058
        L_0x003c:
            int r2 = r0.f24093K
            java.lang.String r8 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0048
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.zzdw.m48255e(r8, r2)
            goto L_0x0058
        L_0x0048:
            long r10 = r0.f24091I
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.zzdw.m48255e(r8, r2)
        L_0x0058:
            r2 = r22
            goto L_0x00f3
        L_0x005c:
            java.lang.String r2 = r1.f24051b
            com.google.android.gms.internal.ads.zzef r8 = r0.f24121k
            byte[] r8 = r8.mo45232h()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L_0x0088
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L_0x0080
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L_0x0078
            goto L_0x0090
        L_0x0078:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0090
            r2 = 0
            goto L_0x0091
        L_0x0080:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0090
            r2 = 2
            goto L_0x0091
        L_0x0088:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00b3
            if (r2 == r9) goto L_0x00a8
            if (r2 != r7) goto L_0x00a2
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = m41162y(r10, r2, r3)
            r3 = 25
            goto L_0x00bb
        L_0x00a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a8:
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r2 = m41162y(r10, r4, r2)
            r3 = 21
            goto L_0x00bb
        L_0x00b3:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = m41162y(r10, r2, r3)
            r3 = 19
        L_0x00bb:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r6, r8, r3, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24121k
            int r2 = r2.mo45235k()
        L_0x00c5:
            com.google.android.gms.internal.ads.zzef r3 = r0.f24121k
            int r3 = r3.mo45236l()
            if (r2 >= r3) goto L_0x00e0
            com.google.android.gms.internal.ads.zzef r3 = r0.f24121k
            byte[] r3 = r3.mo45232h()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzef r3 = r0.f24121k
            r3.mo45229e(r2)
            goto L_0x00e0
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00e0:
            com.google.android.gms.internal.ads.zzaap r2 = r1.f24048X
            com.google.android.gms.internal.ads.zzef r3 = r0.f24121k
            int r4 = r3.mo45236l()
            com.google.android.gms.internal.ads.zzaan.m40938b(r2, r3, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24121k
            int r2 = r2.mo45236l()
            int r2 = r22 + r2
        L_0x00f3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x0111
            int r3 = r0.f24093K
            if (r3 <= r9) goto L_0x0103
            com.google.android.gms.internal.ads.zzef r3 = r0.f24124n
            r3.mo45227c(r6)
            goto L_0x0111
        L_0x0103:
            com.google.android.gms.internal.ads.zzef r3 = r0.f24124n
            int r3 = r3.mo45236l()
            com.google.android.gms.internal.ads.zzaap r4 = r1.f24048X
            com.google.android.gms.internal.ads.zzef r5 = r0.f24124n
            r4.mo41213c(r5, r3, r7)
            int r2 = r2 + r3
        L_0x0111:
            r14 = r2
            com.google.android.gms.internal.ads.zzaap r10 = r1.f24048X
            com.google.android.gms.internal.ads.zzaao r1 = r1.f24059j
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.mo41216f(r11, r13, r14, r15, r16)
        L_0x0121:
            r0.f24088F = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaei.m41158u(com.google.android.gms.internal.ads.zzaeh, long, int, int, int):void");
    }

    /* renamed from: v */
    private final void m41159v(zzzj zzzj, int i) throws IOException {
        if (this.f24117g.mo45236l() < i) {
            if (this.f24117g.mo45234j() < i) {
                zzef zzef = this.f24117g;
                int j = zzef.mo45234j();
                zzef.mo45224H(Math.max(j + j, i));
            }
            ((zzyy) zzzj).mo48453i(this.f24117g.mo45232h(), this.f24117g.mo45236l(), i - this.f24117g.mo45236l(), false);
            this.f24117g.mo45229e(i);
        }
    }

    /* renamed from: w */
    private final void m41160w() {
        this.f24101S = 0;
        this.f24102T = 0;
        this.f24103U = 0;
        this.f24104V = false;
        this.f24105W = false;
        this.f24106X = false;
        this.f24107Y = 0;
        this.f24108Z = 0;
        this.f24110a0 = false;
        this.f24120j.mo45227c(0);
    }

    /* renamed from: x */
    private final void m41161x(zzzj zzzj, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f24121k.mo45234j() < i2) {
            zzef zzef = this.f24121k;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzef.mo45228d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f24121k.mo45232h(), 0, length);
        }
        ((zzyy) zzzj).mo48453i(this.f24121k.mo45232h(), length, i, false);
        this.f24121k.mo45230f(0);
        this.f24121k.mo45229e(i2);
    }

    /* renamed from: y */
    private static byte[] m41162y(long j, String str, long j2) {
        zzdd.m47210d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return zzen.m49127B(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static int[] m41163z(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return new zzaej().mo41408a(zzzj);
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24112b0 = zzzl;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027f, code lost:
        throw com.google.android.gms.internal.ads.zzbu.m44135a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    @androidx.annotation.CallSuper
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41402e(int r19, int r20, com.google.android.gms.internal.ads.zzzj r21) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0112
            if (r0 == r5) goto L_0x0112
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00dc
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b2
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a2
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008d
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0067
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0057
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.m41157t(r19)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            byte[] r2 = new byte[r1]
            r0.f24071v = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48453i(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r3)
            throw r0
        L_0x0057:
            r18.m41157t(r19)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            byte[] r2 = new byte[r1]
            r0.f24060k = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48453i(r2, r10, r1, r10)
            return
        L_0x0067:
            com.google.android.gms.internal.ads.zzef r0 = r7.f24119i
            byte[] r0 = r0.mo45232h()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.zzef r0 = r7.f24119i
            byte[] r0 = r0.mo45232h()
            r2 = r8
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            int r3 = 4 - r1
            r2.mo48453i(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.zzef r0 = r7.f24119i
            r0.mo45230f(r10)
            com.google.android.gms.internal.ads.zzef r0 = r7.f24119i
            long r0 = r0.mo45217A()
            int r1 = (int) r0
            r7.f24133w = r1
            return
        L_0x008d:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.mo48453i(r2, r10, r1, r10)
            r18.m41157t(r19)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            com.google.android.gms.internal.ads.zzaao r1 = new com.google.android.gms.internal.ads.zzaao
            r1.<init>(r9, r2, r10, r10)
            r0.f24059j = r1
            return
        L_0x00a2:
            r18.m41157t(r19)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            byte[] r2 = new byte[r1]
            r0.f24058i = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48453i(r2, r10, r1, r10)
            return
        L_0x00b2:
            r18.m41157t(r19)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            int r2 = r0.f24056g
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d1
            int r2 = r0.f24056g
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48459p(r1, r10)
            return
        L_0x00d1:
            byte[] r2 = new byte[r1]
            r0.f24038N = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48453i(r2, r10, r1, r10)
            return
        L_0x00dc:
            int r0 = r7.f24089G
            if (r0 == r6) goto L_0x00e1
            return
        L_0x00e1:
            android.util.SparseArray r0 = r7.f24113c
            int r2 = r7.f24095M
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzaeh r0 = (com.google.android.gms.internal.ads.zzaeh) r0
            int r2 = r7.f24098P
            if (r2 != r4) goto L_0x010b
            java.lang.String r0 = r0.f24051b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010b
            com.google.android.gms.internal.ads.zzef r0 = r7.f24124n
            r0.mo45227c(r1)
            com.google.android.gms.internal.ads.zzef r0 = r7.f24124n
            byte[] r0 = r0.mo45232h()
            r2 = r8
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            r2.mo48453i(r0, r10, r1, r10)
            return
        L_0x010b:
            r0 = r8
            com.google.android.gms.internal.ads.zzyy r0 = (com.google.android.gms.internal.ads.zzyy) r0
            r0.mo48459p(r1, r10)
            return
        L_0x0112:
            int r2 = r7.f24089G
            r11 = 8
            if (r2 != 0) goto L_0x0137
            com.google.android.gms.internal.ads.zzaek r2 = r7.f24111b
            long r12 = r2.mo41410d(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.f24095M = r2
            com.google.android.gms.internal.ads.zzaek r2 = r7.f24111b
            int r2 = r2.mo41409a()
            r7.f24096N = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f24091I = r12
            r7.f24089G = r9
            com.google.android.gms.internal.ads.zzef r2 = r7.f24117g
            r2.mo45227c(r10)
        L_0x0137:
            android.util.SparseArray r2 = r7.f24113c
            int r12 = r7.f24095M
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.zzaeh r12 = (com.google.android.gms.internal.ads.zzaeh) r12
            if (r12 != 0) goto L_0x0151
            int r0 = r7.f24096N
            r2 = r8
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            int r0 = r1 - r0
            r2.mo48459p(r0, r10)
            r7.f24089G = r10
            return
        L_0x0151:
            java.util.Objects.requireNonNull(r12.f24048X)
            int r2 = r7.f24089G
            if (r2 != r9) goto L_0x02e0
            r2 = 3
            r7.m41159v(r8, r2)
            com.google.android.gms.internal.ads.zzef r13 = r7.f24117g
            byte[] r13 = r13.mo45232h()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x017e
            r7.f24093K = r9
            int[] r2 = r7.f24094L
            int[] r2 = m41163z(r2, r9)
            r7.f24094L = r2
            int r3 = r7.f24096N
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0290
        L_0x017e:
            r7.m41159v(r8, r4)
            com.google.android.gms.internal.ads.zzef r15 = r7.f24117g
            byte[] r15 = r15.mo45232h()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.f24093K = r15
            int[] r4 = r7.f24094L
            int[] r4 = m41163z(r4, r15)
            r7.f24094L = r4
            if (r13 != r6) goto L_0x01a4
            int r2 = r7.f24096N
            int r3 = r7.f24093K
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0290
        L_0x01a4:
            if (r13 != r9) goto L_0x01dc
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01a9:
            int r13 = r7.f24093K
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d1
            int[] r13 = r7.f24094L
            r13[r2] = r10
        L_0x01b3:
            int r4 = r4 + r9
            r7.m41159v(r8, r4)
            com.google.android.gms.internal.ads.zzef r13 = r7.f24117g
            byte[] r13 = r13.mo45232h()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.f24094L
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b3
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01a9
        L_0x01d1:
            int[] r2 = r7.f24094L
            int r15 = r7.f24096N
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0290
        L_0x01dc:
            if (r13 != r2) goto L_0x02d9
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e1:
            int r15 = r7.f24093K
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0287
            int[] r15 = r7.f24094L
            r15[r2] = r10
            int r4 = r4 + 1
            r7.m41159v(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.zzef r5 = r7.f24117g
            byte[] r5 = r5.mo45232h()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0280
            r5 = 0
        L_0x01fd:
            if (r5 >= r11) goto L_0x024f
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.zzef r9 = r7.f24117g
            byte[] r9 = r9.mo45232h()
            byte r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0245
            int r4 = r4 + r5
            r7.m41159v(r8, r4)
            int r9 = r15 + 1
            com.google.android.gms.internal.ads.zzef r10 = r7.f24117g
            byte[] r10 = r10.mo45232h()
            byte r10 = r10[r15]
            r10 = r10 & r14
            int r6 = ~r6
            r6 = r6 & r10
            long r14 = (long) r6
        L_0x0220:
            if (r9 >= r4) goto L_0x0236
            int r6 = r9 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.zzef r10 = r7.f24117g
            byte[] r10 = r10.mo45232h()
            byte r9 = r10[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            long r10 = (long) r9
            long r14 = r14 | r10
            r9 = r6
            r11 = 8
            goto L_0x0220
        L_0x0236:
            if (r2 <= 0) goto L_0x0251
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0251
        L_0x0245:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01fd
        L_0x024f:
            r14 = 0
        L_0x0251:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x0279
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0279
            int r5 = (int) r14
            int[] r6 = r7.f24094L
            if (r2 == 0) goto L_0x0269
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x0269:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e1
        L_0x0279:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r3)
            throw r0
        L_0x0280:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r3)
            throw r0
        L_0x0287:
            int[] r2 = r7.f24094L
            int r3 = r7.f24096N
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0290:
            com.google.android.gms.internal.ads.zzef r1 = r7.f24117g
            byte[] r1 = r1.mo45232h()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.zzef r2 = r7.f24117g
            byte[] r2 = r2.mo45232h()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f24084B
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m41155r(r1)
            long r3 = r3 + r1
            r7.f24090H = r3
            int r1 = r12.f24053d
            r2 = 2
            if (r1 == r2) goto L_0x02d0
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02ce
            com.google.android.gms.internal.ads.zzef r0 = r7.f24117g
            byte[] r0 = r0.mo45232h()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02cc
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d0
        L_0x02cc:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02ce:
            r1 = 0
            goto L_0x02d1
        L_0x02d0:
            r1 = 1
        L_0x02d1:
            r7.f24097O = r1
            r7.f24089G = r2
            r1 = 0
            r7.f24092J = r1
            goto L_0x02e0
        L_0x02d9:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r3)
            throw r0
        L_0x02e0:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0313
        L_0x02e4:
            int r0 = r7.f24092J
            int r1 = r7.f24093K
            if (r0 >= r1) goto L_0x030f
            int[] r1 = r7.f24094L
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.m41153p(r8, r12, r0, r1)
            long r0 = r7.f24090H
            int r2 = r7.f24092J
            int r3 = r12.f24054e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f24097O
            r6 = 0
            r0 = r18
            r1 = r12
            r0.m41158u(r1, r2, r4, r5, r6)
            int r0 = r7.f24092J
            r1 = 1
            int r0 = r0 + r1
            r7.f24092J = r0
            goto L_0x02e4
        L_0x030f:
            r0 = 0
            r7.f24089G = r0
            return
        L_0x0313:
            r1 = 1
        L_0x0314:
            int r0 = r7.f24092J
            int r2 = r7.f24093K
            if (r0 >= r2) goto L_0x032a
            int[] r2 = r7.f24094L
            r3 = r2[r0]
            int r3 = r7.m41153p(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.f24092J
            int r0 = r0 + r1
            r7.f24092J = r0
            goto L_0x0314
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaei.mo41402e(int, int, com.google.android.gms.internal.ads.zzzj):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0315;
     */
    @androidx.annotation.CallSuper
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41403f(int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzzl r1 = r7.f24112b0
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x0334
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L_0x018a
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0172
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013f
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0129
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x0111
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00fb
            if (r0 == r4) goto L_0x003d
            goto L_0x0181
        L_0x003d:
            boolean r0 = r7.f24132v
            if (r0 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzzl r0 = r7.f24112b0
            com.google.android.gms.internal.ads.zzdx r1 = r7.f24085C
            com.google.android.gms.internal.ads.zzdx r4 = r7.f24086D
            long r14 = r7.f24127q
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00e8
            long r2 = r7.f24130t
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00e8
            if (r1 == 0) goto L_0x00e8
            int r2 = r1.mo45033a()
            if (r2 == 0) goto L_0x00e8
            if (r4 == 0) goto L_0x00e8
            int r2 = r4.mo45033a()
            int r3 = r1.mo45033a()
            if (r2 == r3) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            int r2 = r1.mo45033a()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L_0x0076:
            if (r15 >= r2) goto L_0x008b
            long r16 = r1.mo45034b(r15)
            r14[r15] = r16
            long r8 = r7.f24127q
            long r18 = r4.mo45034b(r15)
            long r8 = r8 + r18
            r12[r15] = r8
            int r15 = r15 + 1
            goto L_0x0076
        L_0x008b:
            r9 = 0
        L_0x008c:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a6
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L_0x008c
        L_0x00a6:
            long r8 = r7.f24127q
            long r10 = r7.f24126p
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.f24130t
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Discarding last cue point with unexpected duration: "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MatroskaExtractor"
            com.google.android.gms.internal.ads.zzdw.m48255e(r4, r2)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00e2:
            com.google.android.gms.internal.ads.zzyw r1 = new com.google.android.gms.internal.ads.zzyw
            r1.<init>(r3, r12, r13, r14)
            goto L_0x00ef
        L_0x00e8:
            com.google.android.gms.internal.ads.zzaak r1 = new com.google.android.gms.internal.ads.zzaak
            long r2 = r7.f24130t
            r1.<init>(r2, r5)
        L_0x00ef:
            r0.mo41254h(r1)
            r0 = 1
            r7.f24132v = r0
        L_0x00f5:
            r0 = 0
            r7.f24085C = r0
            r7.f24086D = r0
            return
        L_0x00fb:
            r0 = 0
            android.util.SparseArray r1 = r7.f24113c
            int r1 = r1.size()
            if (r1 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.zzzl r0 = r7.f24112b0
            r0.mo41255j0()
            return
        L_0x010a:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r0)
            throw r0
        L_0x0111:
            long r0 = r7.f24128r
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x011c
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f24128r = r0
        L_0x011c:
            long r0 = r7.f24129s
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0181
            long r0 = r7.m41155r(r0)
            r7.f24130t = r0
            return
        L_0x0129:
            r21.m41157t(r22)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            boolean r1 = r0.f24057h
            if (r1 == 0) goto L_0x0181
            byte[] r0 = r0.f24058i
            if (r0 != 0) goto L_0x0137
            goto L_0x0181
        L_0x0137:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r1)
            throw r0
        L_0x013f:
            r21.m41157t(r22)
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            boolean r1 = r0.f24057h
            if (r1 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.zzaao r1 = r0.f24059j
            if (r1 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzx r1 = new com.google.android.gms.internal.ads.zzx
            r2 = 1
            com.google.android.gms.internal.ads.zzw[] r2 = new com.google.android.gms.internal.ads.zzw[r2]
            com.google.android.gms.internal.ads.zzw r3 = new com.google.android.gms.internal.ads.zzw
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzo.f37982a
            com.google.android.gms.internal.ads.zzaeh r5 = r7.f24131u
            com.google.android.gms.internal.ads.zzaao r5 = r5.f24059j
            byte[] r5 = r5.f23742b
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.f24061l = r1
            return
        L_0x016a:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r8)
            throw r0
        L_0x0172:
            int r0 = r7.f24133w
            r1 = -1
            if (r0 == r1) goto L_0x0182
            long r5 = r7.f24134x
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0182
            if (r0 != r4) goto L_0x0181
            r7.f24136z = r5
        L_0x0181:
            return
        L_0x0182:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r1)
            throw r0
        L_0x018a:
            r1 = -1
            com.google.android.gms.internal.ads.zzaeh r0 = r7.f24131u
            com.google.android.gms.internal.ads.zzdd.m47208b(r0)
            java.lang.String r5 = r0.f24051b
            if (r5 == 0) goto L_0x032c
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x030a;
                case -2095575984: goto L_0x0300;
                case -1985379776: goto L_0x02f5;
                case -1784763192: goto L_0x02ea;
                case -1730367663: goto L_0x02df;
                case -1482641358: goto L_0x02d4;
                case -1482641357: goto L_0x02c9;
                case -1373388978: goto L_0x02be;
                case -933872740: goto L_0x02b3;
                case -538363189: goto L_0x02a8;
                case -538363109: goto L_0x029d;
                case -425012669: goto L_0x0291;
                case -356037306: goto L_0x0285;
                case 62923557: goto L_0x0279;
                case 62923603: goto L_0x026d;
                case 62927045: goto L_0x0261;
                case 82318131: goto L_0x0256;
                case 82338133: goto L_0x024b;
                case 82338134: goto L_0x0240;
                case 99146302: goto L_0x0234;
                case 444813526: goto L_0x0228;
                case 542569478: goto L_0x021c;
                case 635596514: goto L_0x0210;
                case 725948237: goto L_0x0204;
                case 725957860: goto L_0x01f8;
                case 738597099: goto L_0x01ec;
                case 855502857: goto L_0x01e2;
                case 1045209816: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019d;
                default: goto L_0x019b;
            }
        L_0x019b:
            goto L_0x0314
        L_0x019d:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x0314
            r2 = 11
            goto L_0x0315
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 22
            goto L_0x0315
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 17
            goto L_0x0315
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 3
            goto L_0x0315
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 27
            goto L_0x0315
        L_0x01d6:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 29
            goto L_0x0315
        L_0x01e2:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0314
            goto L_0x0315
        L_0x01ec:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 28
            goto L_0x0315
        L_0x01f8:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 24
            goto L_0x0315
        L_0x0204:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 25
            goto L_0x0315
        L_0x0210:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 26
            goto L_0x0315
        L_0x021c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 20
            goto L_0x0315
        L_0x0228:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 10
            goto L_0x0315
        L_0x0234:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 31
            goto L_0x0315
        L_0x0240:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 1
            goto L_0x0315
        L_0x024b:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 0
            goto L_0x0315
        L_0x0256:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 2
            goto L_0x0315
        L_0x0261:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 19
            goto L_0x0315
        L_0x026d:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 16
            goto L_0x0315
        L_0x0279:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 13
            goto L_0x0315
        L_0x0285:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 21
            goto L_0x0315
        L_0x0291:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 30
            goto L_0x0315
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 7
            goto L_0x0315
        L_0x02a8:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 5
            goto L_0x0315
        L_0x02b3:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 32
            goto L_0x0315
        L_0x02be:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 9
            goto L_0x0315
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 15
            goto L_0x0315
        L_0x02d4:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 14
            goto L_0x0315
        L_0x02df:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 12
            goto L_0x0315
        L_0x02ea:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 18
            goto L_0x0315
        L_0x02f5:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 23
            goto L_0x0315
        L_0x0300:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 4
            goto L_0x0315
        L_0x030a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 6
            goto L_0x0315
        L_0x0314:
            r2 = -1
        L_0x0315:
            switch(r2) {
                case 0: goto L_0x031a;
                case 1: goto L_0x031a;
                case 2: goto L_0x031a;
                case 3: goto L_0x031a;
                case 4: goto L_0x031a;
                case 5: goto L_0x031a;
                case 6: goto L_0x031a;
                case 7: goto L_0x031a;
                case 8: goto L_0x031a;
                case 9: goto L_0x031a;
                case 10: goto L_0x031a;
                case 11: goto L_0x031a;
                case 12: goto L_0x031a;
                case 13: goto L_0x031a;
                case 14: goto L_0x031a;
                case 15: goto L_0x031a;
                case 16: goto L_0x031a;
                case 17: goto L_0x031a;
                case 18: goto L_0x031a;
                case 19: goto L_0x031a;
                case 20: goto L_0x031a;
                case 21: goto L_0x031a;
                case 22: goto L_0x031a;
                case 23: goto L_0x031a;
                case 24: goto L_0x031a;
                case 25: goto L_0x031a;
                case 26: goto L_0x031a;
                case 27: goto L_0x031a;
                case 28: goto L_0x031a;
                case 29: goto L_0x031a;
                case 30: goto L_0x031a;
                case 31: goto L_0x031a;
                case 32: goto L_0x031a;
                default: goto L_0x0318;
            }
        L_0x0318:
            r0 = 0
            goto L_0x0329
        L_0x031a:
            com.google.android.gms.internal.ads.zzzl r1 = r7.f24112b0
            int r2 = r0.f24052c
            r0.mo41401e(r1, r2)
            android.util.SparseArray r1 = r7.f24113c
            int r2 = r0.f24052c
            r1.put(r2, r0)
            goto L_0x0318
        L_0x0329:
            r7.f24131u = r0
            return
        L_0x032c:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r0)
            throw r0
        L_0x0334:
            int r0 = r7.f24089G
            if (r0 == r4) goto L_0x0339
            return
        L_0x0339:
            android.util.SparseArray r0 = r7.f24113c
            int r1 = r7.f24095M
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzaeh r8 = (com.google.android.gms.internal.ads.zzaeh) r8
            java.util.Objects.requireNonNull(r8.f24048X)
            long r0 = r7.f24100R
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x036f
            java.lang.String r0 = r8.f24051b
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.zzef r0 = r7.f24124n
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.f24100R
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.mo45228d(r1, r2)
        L_0x036f:
            r0 = 0
            r4 = 0
        L_0x0371:
            int r1 = r7.f24093K
            if (r4 >= r1) goto L_0x037d
            int[] r1 = r7.f24094L
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x0371
        L_0x037d:
            r4 = 0
        L_0x037e:
            int r1 = r7.f24093K
            if (r4 >= r1) goto L_0x03ae
            long r1 = r7.f24090H
            int r3 = r8.f24054e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.f24097O
            if (r4 != 0) goto L_0x039a
            boolean r4 = r7.f24099Q
            if (r4 != 0) goto L_0x0397
            r1 = r1 | 1
        L_0x0397:
            r4 = r1
            r9 = 0
            goto L_0x039c
        L_0x039a:
            r9 = r4
            r4 = r1
        L_0x039c:
            int[] r1 = r7.f24094L
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.m41158u(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x037e
        L_0x03ae:
            r1 = 0
            r7.f24089G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaei.mo41403f(int):void");
    }

    @CallSuper
    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24084B = -9223372036854775807L;
        this.f24089G = 0;
        this.f24109a.zzb();
        this.f24111b.mo41411e();
        m41160w();
        for (int i = 0; i < this.f24113c.size(); i++) {
            zzaaq zzaaq = ((zzaeh) this.f24113c.valueAt(i)).f24044T;
            if (zzaaq != null) {
                zzaaq.mo41218b();
            }
        }
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        this.f24088F = false;
        while (!this.f24088F) {
            if (this.f24109a.mo41398a(zzzj)) {
                long c = zzzj.mo41252c();
                if (this.f24135y) {
                    this.f24083A = c;
                    zzaai.f23733a = this.f24136z;
                    this.f24135y = false;
                    return 1;
                } else if (this.f24132v) {
                    long j = this.f24083A;
                    if (j != -1) {
                        zzaai.f23733a = j;
                        this.f24083A = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f24113c.size(); i++) {
                    zzaeh zzaeh = (zzaeh) this.f24113c.valueAt(i);
                    Objects.requireNonNull(zzaeh.f24048X);
                    zzaaq zzaaq = zzaeh.f24044T;
                    if (zzaaq != null) {
                        zzaaq.mo41217a(zzaeh.f24048X, zzaeh.f24059j);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: i */
    public final void mo41404i(int i, double d) throws zzbu {
        if (i == 181) {
            m41157t(i);
            this.f24131u.f24041Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m41157t(i);
                    this.f24131u.f24028D = (float) d;
                    return;
                case 21970:
                    m41157t(i);
                    this.f24131u.f24029E = (float) d;
                    return;
                case 21971:
                    m41157t(i);
                    this.f24131u.f24030F = (float) d;
                    return;
                case 21972:
                    m41157t(i);
                    this.f24131u.f24031G = (float) d;
                    return;
                case 21973:
                    m41157t(i);
                    this.f24131u.f24032H = (float) d;
                    return;
                case 21974:
                    m41157t(i);
                    this.f24131u.f24033I = (float) d;
                    return;
                case 21975:
                    m41157t(i);
                    this.f24131u.f24034J = (float) d;
                    return;
                case 21976:
                    m41157t(i);
                    this.f24131u.f24035K = (float) d;
                    return;
                case 21977:
                    m41157t(i);
                    this.f24131u.f24036L = (float) d;
                    return;
                case 21978:
                    m41157t(i);
                    this.f24131u.f24037M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m41157t(i);
                            this.f24131u.f24068s = (float) d;
                            return;
                        case 30324:
                            m41157t(i);
                            this.f24131u.f24069t = (float) d;
                            return;
                        case 30325:
                            m41157t(i);
                            this.f24131u.f24070u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f24129s = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: j */
    public final void mo41405j(int i, long j) throws zzbu {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m41157t(i);
                        this.f24131u.f24053d = (int) j;
                        return;
                    case 136:
                        m41157t(i);
                        zzaeh zzaeh = this.f24131u;
                        if (j == 1) {
                            z = true;
                        }
                        zzaeh.f24046V = z;
                        return;
                    case 155:
                        this.f24091I = m41155r(j);
                        return;
                    case 159:
                        m41157t(i);
                        this.f24131u.f24039O = (int) j;
                        return;
                    case 176:
                        m41157t(i);
                        this.f24131u.f24062m = (int) j;
                        return;
                    case 179:
                        m41156s(i);
                        this.f24085C.mo45035c(m41155r(j));
                        return;
                    case 186:
                        m41157t(i);
                        this.f24131u.f24063n = (int) j;
                        return;
                    case Opcodes.XOR_INT_LIT16:
                        m41157t(i);
                        this.f24131u.f24052c = (int) j;
                        return;
                    case 231:
                        this.f24084B = m41155r(j);
                        return;
                    case 238:
                        this.f24098P = (int) j;
                        return;
                    case 241:
                        if (!this.f24087E) {
                            m41156s(i);
                            this.f24086D.mo45035c(j);
                            this.f24087E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f24099Q = true;
                        return;
                    case 16871:
                        m41157t(i);
                        this.f24131u.f24056g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw zzbu.m44135a("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw zzbu.m44135a("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw zzbu.m44135a("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw zzbu.m44135a("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw zzbu.m44135a("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f24134x = j + this.f24127q;
                        return;
                    case 21432:
                        m41157t(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f24131u.f24072w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f24131u.f24072w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f24131u.f24072w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f24131u.f24072w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m41157t(i);
                        this.f24131u.f24064o = (int) j;
                        return;
                    case 21682:
                        m41157t(i);
                        this.f24131u.f24066q = (int) j;
                        return;
                    case 21690:
                        m41157t(i);
                        this.f24131u.f24065p = (int) j;
                        return;
                    case 21930:
                        m41157t(i);
                        zzaeh zzaeh2 = this.f24131u;
                        if (j == 1) {
                            z = true;
                        }
                        zzaeh2.f24045U = z;
                        return;
                    case 21998:
                        m41157t(i);
                        this.f24131u.f24055f = (int) j;
                        return;
                    case 22186:
                        m41157t(i);
                        this.f24131u.f24042R = j;
                        return;
                    case 22203:
                        m41157t(i);
                        this.f24131u.f24043S = j;
                        return;
                    case 25188:
                        m41157t(i);
                        this.f24131u.f24040P = (int) j;
                        return;
                    case 30114:
                        this.f24100R = j;
                        return;
                    case 30321:
                        m41157t(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f24131u.f24067r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f24131u.f24067r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f24131u.f24067r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f24131u.f24067r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m41157t(i);
                        this.f24131u.f24054e = (int) j;
                        return;
                    case 2807729:
                        this.f24128r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m41157t(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f24131u.f24025A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f24131u.f24025A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m41157t(i);
                                int b = zzq.m54583b((int) j);
                                if (b != -1) {
                                    this.f24131u.f24075z = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m41157t(i);
                                zzaeh zzaeh3 = this.f24131u;
                                zzaeh3.f24073x = true;
                                int a = zzq.m54582a((int) j);
                                if (a != -1) {
                                    zzaeh3.f24074y = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m41157t(i);
                                this.f24131u.f24026B = (int) j;
                                return;
                            case 21949:
                                m41157t(i);
                                this.f24131u.f24027C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw zzbu.m44135a("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw zzbu.m44135a("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: k */
    public final void mo41406k(int i, long j, long j2) throws zzbu {
        zzdd.m47208b(this.f24112b0);
        if (i == 160) {
            this.f24099Q = false;
            this.f24100R = 0;
        } else if (i == 174) {
            this.f24131u = new zzaeh();
        } else if (i == 187) {
            this.f24087E = false;
        } else if (i == 19899) {
            this.f24133w = -1;
            this.f24134x = -1;
        } else if (i == 20533) {
            m41157t(i);
            this.f24131u.f24057h = true;
        } else if (i == 21968) {
            m41157t(i);
            this.f24131u.f24073x = true;
        } else if (i == 408125543) {
            long j3 = this.f24127q;
            if (j3 == -1 || j3 == j) {
                this.f24127q = j;
                this.f24126p = j2;
                return;
            }
            throw zzbu.m44135a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f24085C = new zzdx(32);
            this.f24086D = new zzdx(32);
        } else if (i != 524531317 || this.f24132v) {
        } else {
            if (!this.f24114d || this.f24136z == -1) {
                this.f24112b0.mo41254h(new zzaak(this.f24130t, 0));
                this.f24132v = true;
                return;
            }
            this.f24135y = true;
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: l */
    public final void mo41407l(int i, String str) throws zzbu {
        if (i == 134) {
            m41157t(i);
            this.f24131u.f24051b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m41157t(i);
                this.f24131u.f24050a = str;
            } else if (i == 2274716) {
                m41157t(i);
                this.f24131u.f24047W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw zzbu.m44135a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public zzaei(int i) {
        zzaeb zzaeb = new zzaeb();
        this.f24127q = -1;
        this.f24128r = -9223372036854775807L;
        this.f24129s = -9223372036854775807L;
        this.f24130t = -9223372036854775807L;
        this.f24136z = -1;
        this.f24083A = -1;
        this.f24084B = -9223372036854775807L;
        this.f24109a = zzaeb;
        zzaeb.mo41399b(new zzaeg(this, (zzaef) null));
        this.f24114d = true;
        this.f24111b = new zzaek();
        this.f24113c = new SparseArray();
        this.f24117g = new zzef(4);
        this.f24118h = new zzef(ByteBuffer.allocate(4).putInt(-1).array());
        this.f24119i = new zzef(4);
        this.f24115e = new zzef(zzaaf.f23725a);
        this.f24116f = new zzef(4);
        this.f24120j = new zzef();
        this.f24121k = new zzef();
        this.f24122l = new zzef(8);
        this.f24123m = new zzef();
        this.f24124n = new zzef();
        this.f24094L = new int[1];
    }
}
