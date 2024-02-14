package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.p023dx.p026io.Opcodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzavr implements zzauz {

    /* renamed from: Z */
    public static final zzavb f25791Z = new zzavm();

    /* renamed from: a0 */
    private static final byte[] f25792a0 = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0 */
    private static final byte[] f25793b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final UUID f25794c0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private zzbaf f25795A;

    /* renamed from: B */
    private zzbaf f25796B;

    /* renamed from: C */
    private boolean f25797C;

    /* renamed from: D */
    private int f25798D;

    /* renamed from: E */
    private long f25799E;

    /* renamed from: F */
    private long f25800F;

    /* renamed from: G */
    private int f25801G;

    /* renamed from: H */
    private int f25802H;

    /* renamed from: I */
    private int[] f25803I;

    /* renamed from: J */
    private int f25804J;

    /* renamed from: K */
    private int f25805K;

    /* renamed from: L */
    private int f25806L;

    /* renamed from: M */
    private int f25807M;

    /* renamed from: N */
    private boolean f25808N;

    /* renamed from: O */
    private boolean f25809O;

    /* renamed from: P */
    private boolean f25810P;

    /* renamed from: Q */
    private boolean f25811Q;

    /* renamed from: R */
    private byte f25812R;

    /* renamed from: S */
    private int f25813S;

    /* renamed from: T */
    private int f25814T;

    /* renamed from: U */
    private int f25815U;

    /* renamed from: V */
    private boolean f25816V;

    /* renamed from: W */
    private boolean f25817W;

    /* renamed from: X */
    private zzava f25818X;

    /* renamed from: Y */
    private final zzavl f25819Y;

    /* renamed from: a */
    private final zzavt f25820a;

    /* renamed from: b */
    private final SparseArray f25821b;

    /* renamed from: c */
    private final boolean f25822c;

    /* renamed from: d */
    private final zzbak f25823d;

    /* renamed from: e */
    private final zzbak f25824e;

    /* renamed from: f */
    private final zzbak f25825f;

    /* renamed from: g */
    private final zzbak f25826g;

    /* renamed from: h */
    private final zzbak f25827h;

    /* renamed from: i */
    private final zzbak f25828i;

    /* renamed from: j */
    private final zzbak f25829j;

    /* renamed from: k */
    private final zzbak f25830k;

    /* renamed from: l */
    private final zzbak f25831l;

    /* renamed from: m */
    private ByteBuffer f25832m;

    /* renamed from: n */
    private long f25833n;

    /* renamed from: o */
    private long f25834o;

    /* renamed from: p */
    private long f25835p;

    /* renamed from: q */
    private long f25836q;

    /* renamed from: r */
    private long f25837r;

    /* renamed from: s */
    private zzavq f25838s;

    /* renamed from: t */
    private boolean f25839t;

    /* renamed from: u */
    private int f25840u;

    /* renamed from: v */
    private long f25841v;

    /* renamed from: w */
    private boolean f25842w;

    /* renamed from: x */
    private long f25843x;

    /* renamed from: y */
    private long f25844y;

    /* renamed from: z */
    private long f25845z;

    public zzavr() {
        this(0);
    }

    /* renamed from: l */
    static final int m42603l(int i) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case Opcodes.SHL_INT_LIT8:
            case Opcodes.SHR_INT_LIT8:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static final boolean m42604m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: n */
    private final long m42605n(long j) throws zzasz {
        long j2 = this.f25835p;
        if (j2 != -9223372036854775807L) {
            return zzbar.m42994j(j, j2, 1000);
        }
        throw new zzasz("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m42606o(zzavq zzavq, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzavq.f25765a)) {
            byte[] bArr2 = this.f25829j.f26406a;
            long j2 = this.f25800F;
            if (j2 == -9223372036854775807L) {
                bArr = f25793b0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzbar.m43001q(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzavi zzavi = zzavq.f25763O;
            zzbak zzbak = this.f25829j;
            zzavi.mo42115b(zzbak, zzbak.mo42318d());
            this.f25815U += this.f25829j.mo42318d();
        }
        zzavq.f25763O.mo42114a(j, this.f25806L, this.f25815U, 0, zzavq.f25771g);
        this.f25816V = true;
        m42607p();
    }

    /* renamed from: p */
    private final void m42607p() {
        this.f25807M = 0;
        this.f25815U = 0;
        this.f25814T = 0;
        this.f25808N = false;
        this.f25809O = false;
        this.f25811Q = false;
        this.f25813S = 0;
        this.f25812R = 0;
        this.f25810P = false;
        this.f25828i.mo42332r();
    }

    /* renamed from: q */
    private static int[] m42608q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: r */
    private final int m42609r(zzauy zzauy, zzavi zzavi, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f25828i.mo42315a();
        if (a > 0) {
            i2 = Math.min(i, a);
            zzavi.mo42115b(this.f25828i, i2);
        } else {
            i2 = zzavi.mo42116c(zzauy, i, false);
        }
        this.f25807M += i2;
        this.f25815U += i2;
        return i2;
    }

    /* renamed from: s */
    private final void m42610s(zzauy zzauy, int i) throws IOException, InterruptedException {
        if (this.f25825f.mo42318d() < i) {
            if (this.f25825f.mo42316b() < i) {
                zzbak zzbak = this.f25825f;
                byte[] bArr = zzbak.f26406a;
                int length = bArr.length;
                zzbak.mo42334t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f25825f.mo42318d());
            }
            zzbak zzbak2 = this.f25825f;
            zzauy.mo42100h(zzbak2.f26406a, zzbak2.mo42318d(), i - this.f25825f.mo42318d(), false);
            this.f25825f.mo42335u(i);
        }
    }

    /* renamed from: t */
    private final void m42611t(zzauy zzauy, zzavq zzavq, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzavq.f25765a)) {
            int i3 = i + 32;
            if (this.f25829j.mo42316b() < i3) {
                this.f25829j.f26406a = Arrays.copyOf(f25792a0, i3 + i);
            }
            zzauy.mo42100h(this.f25829j.f26406a, 32, i, false);
            this.f25829j.mo42336v(0);
            this.f25829j.mo42335u(i3);
            return;
        }
        zzavi zzavi = zzavq.f25763O;
        if (!this.f25808N) {
            if (zzavq.f25769e) {
                this.f25806L &= -1073741825;
                int i4 = 128;
                if (!this.f25809O) {
                    zzauy.mo42100h(this.f25825f.f26406a, 0, 1, false);
                    this.f25807M++;
                    byte b = this.f25825f.f26406a[0];
                    if ((b & 128) != 128) {
                        this.f25812R = b;
                        this.f25809O = true;
                    } else {
                        throw new zzasz("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f25812R;
                if ((b2 & 1) == 1) {
                    byte b3 = b2 & 2;
                    this.f25806L |= BasicMeasure.EXACTLY;
                    if (!this.f25810P) {
                        zzauy.mo42100h(this.f25830k.f26406a, 0, 8, false);
                        this.f25807M += 8;
                        this.f25810P = true;
                        zzbak zzbak = this.f25825f;
                        byte[] bArr = zzbak.f26406a;
                        if (b3 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        zzbak.mo42336v(0);
                        zzavi.mo42115b(this.f25825f, 1);
                        this.f25815U++;
                        this.f25830k.mo42336v(0);
                        zzavi.mo42115b(this.f25830k, 8);
                        this.f25815U += 8;
                    }
                    if (b3 == 2) {
                        if (!this.f25811Q) {
                            zzauy.mo42100h(this.f25825f.f26406a, 0, 1, false);
                            this.f25807M++;
                            this.f25825f.mo42336v(0);
                            this.f25813S = this.f25825f.mo42321g();
                            this.f25811Q = true;
                        }
                        int i5 = this.f25813S * 4;
                        this.f25825f.mo42333s(i5);
                        zzauy.mo42100h(this.f25825f.f26406a, 0, i5, false);
                        this.f25807M += i5;
                        int i6 = (this.f25813S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f25832m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f25832m = ByteBuffer.allocate(i7);
                        }
                        this.f25832m.position(0);
                        this.f25832m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f25813S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f25825f.mo42323i();
                            if (i8 % 2 == 0) {
                                this.f25832m.putShort((short) (i10 - i9));
                            } else {
                                this.f25832m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.f25807M) - i9;
                        if ((i2 & 1) == 1) {
                            this.f25832m.putInt(i11);
                        } else {
                            this.f25832m.putShort((short) i11);
                            this.f25832m.putInt(0);
                        }
                        this.f25831l.mo42334t(this.f25832m.array(), i7);
                        zzavi.mo42115b(this.f25831l, i7);
                        this.f25815U += i7;
                    }
                }
            } else {
                byte[] bArr2 = zzavq.f25770f;
                if (bArr2 != null) {
                    this.f25828i.mo42334t(bArr2, bArr2.length);
                }
            }
            this.f25808N = true;
        }
        int d = i + this.f25828i.mo42318d();
        if (!"V_MPEG4/ISO/AVC".equals(zzavq.f25765a) && !"V_MPEGH/ISO/HEVC".equals(zzavq.f25765a)) {
            while (true) {
                int i12 = this.f25807M;
                if (i12 >= d) {
                    break;
                }
                m42609r(zzauy, zzavi, d - i12);
            }
        } else {
            byte[] bArr3 = this.f25824e.f26406a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = zzavq.f25764P;
            int i14 = 4 - i13;
            while (this.f25807M < d) {
                int i15 = this.f25814T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f25828i.mo42315a());
                    zzauy.mo42100h(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.f25828i.mo42331q(bArr3, i14, min);
                    }
                    this.f25807M += i13;
                    this.f25824e.mo42336v(0);
                    this.f25814T = this.f25824e.mo42323i();
                    this.f25823d.mo42336v(0);
                    zzavi.mo42115b(this.f25823d, 4);
                    this.f25815U += 4;
                } else {
                    this.f25814T = i15 - m42609r(zzauy, zzavi, i15);
                }
            }
        }
        if ("A_VORBIS".equals(zzavq.f25765a)) {
            this.f25826g.mo42336v(0);
            zzavi.mo42115b(this.f25826g, 4);
            this.f25815U += 4;
        }
    }

    /* renamed from: b */
    public final int mo42102b(zzauy zzauy, zzave zzave) throws IOException, InterruptedException {
        this.f25816V = false;
        while (!this.f25816V) {
            if (!this.f25819Y.mo42120c(zzauy)) {
                return -1;
            }
            long d = zzauy.mo42096d();
            if (this.f25842w) {
                this.f25844y = d;
                zzave.f25735a = this.f25843x;
                this.f25842w = false;
                return 1;
            } else if (this.f25839t) {
                long j = this.f25844y;
                if (j != -1) {
                    zzave.f25735a = j;
                    this.f25844y = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo42122c(int i) throws zzasz {
        zzavg zzavg;
        zzbaf zzbaf;
        zzbaf zzbaf2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f25838s.f25765a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    zzavq zzavq = this.f25838s;
                    zzavq.mo42121b(this.f25818X, zzavq.f25766b);
                    SparseArray sparseArray = this.f25821b;
                    zzavq zzavq2 = this.f25838s;
                    sparseArray.put(zzavq2.f25766b, zzavq2);
                }
                this.f25838s = null;
            } else if (i == 19899) {
                int i4 = this.f25840u;
                if (i4 != -1) {
                    long j = this.f25841v;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f25843x = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzasz("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                zzavq zzavq3 = this.f25838s;
                if (!zzavq3.f25769e) {
                    return;
                }
                if (zzavq3.f25771g != null) {
                    zzavq3.f25773i = new zzauv(new zzauu(zzash.f25407b, "video/webm", this.f25838s.f25771g.f25738b, false));
                    return;
                }
                throw new zzasz("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                zzavq zzavq4 = this.f25838s;
                if (zzavq4.f25769e && zzavq4.f25770f != null) {
                    throw new zzasz("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f25835p == -9223372036854775807L) {
                    this.f25835p = 1000000;
                }
                long j2 = this.f25836q;
                if (j2 != -9223372036854775807L) {
                    this.f25837r = m42605n(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f25839t) {
                    zzava zzava = this.f25818X;
                    if (this.f25834o == -1 || this.f25837r == -9223372036854775807L || (zzbaf = this.f25795A) == null || zzbaf.mo42311a() == 0 || (zzbaf2 = this.f25796B) == null || zzbaf2.mo42311a() != zzbaf.mo42311a()) {
                        this.f25795A = null;
                        this.f25796B = null;
                        zzavg = new zzavf(this.f25837r);
                    } else {
                        int a = zzbaf.mo42311a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f25795A.mo42312b(i5);
                            jArr[i5] = this.f25834o + this.f25796B.mo42312b(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f25834o + this.f25833n) - jArr[i2]);
                        jArr2[i2] = this.f25837r - jArr3[i2];
                        this.f25795A = null;
                        this.f25796B = null;
                        zzavg = new zzaux(iArr, jArr, jArr2, jArr3);
                    }
                    zzava.mo42106b(zzavg);
                    this.f25839t = true;
                }
            } else if (this.f25821b.size() != 0) {
                this.f25818X.zzb();
            } else {
                throw new zzasz("No valid tracks were found");
            }
        } else if (this.f25798D == 2) {
            if (!this.f25817W) {
                this.f25806L |= 1;
            }
            m42606o((zzavq) this.f25821b.get(this.f25804J), this.f25799E);
            this.f25798D = 0;
        }
    }

    /* renamed from: d */
    public final void mo42103d(long j, long j2) {
        this.f25845z = -9223372036854775807L;
        this.f25798D = 0;
        this.f25819Y.mo42118a();
        this.f25820a.mo42130d();
        m42607p();
    }

    /* renamed from: e */
    public final void mo42104e(zzava zzava) {
        this.f25818X = zzava;
    }

    /* renamed from: f */
    public final boolean mo42105f(zzauy zzauy) throws IOException, InterruptedException {
        return new zzavs().mo42128a(zzauy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo42123g(int i, double d) {
        if (i == 181) {
            this.f25838s.f25757I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f25838s.f25787w = (float) d;
                    return;
                case 21970:
                    this.f25838s.f25788x = (float) d;
                    return;
                case 21971:
                    this.f25838s.f25789y = (float) d;
                    return;
                case 21972:
                    this.f25838s.f25790z = (float) d;
                    return;
                case 21973:
                    this.f25838s.f25749A = (float) d;
                    return;
                case 21974:
                    this.f25838s.f25750B = (float) d;
                    return;
                case 21975:
                    this.f25838s.f25751C = (float) d;
                    return;
                case 21976:
                    this.f25838s.f25752D = (float) d;
                    return;
                case 21977:
                    this.f25838s.f25753E = (float) d;
                    return;
                case 21978:
                    this.f25838s.f25754F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f25836q = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo42124h(int i, long j) throws zzasz {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f25838s.f25767c = (int) j;
                        return;
                    case 136:
                        zzavq zzavq = this.f25838s;
                        if (j == 1) {
                            z = true;
                        }
                        zzavq.f25760L = z;
                        return;
                    case 155:
                        this.f25800F = m42605n(j);
                        return;
                    case 159:
                        this.f25838s.f25755G = (int) j;
                        return;
                    case 176:
                        this.f25838s.f25774j = (int) j;
                        return;
                    case 179:
                        this.f25795A.mo42313c(m42605n(j));
                        return;
                    case 186:
                        this.f25838s.f25775k = (int) j;
                        return;
                    case Opcodes.XOR_INT_LIT16:
                        this.f25838s.f25766b = (int) j;
                        return;
                    case 231:
                        this.f25845z = m42605n(j);
                        return;
                    case 241:
                        if (!this.f25797C) {
                            this.f25796B.mo42313c(j);
                            this.f25797C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f25817W = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new zzasz("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new zzasz("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new zzasz("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new zzasz("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new zzasz("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f25841v = j + this.f25834o;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f25838s.f25780p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f25838s.f25780p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f25838s.f25780p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f25838s.f25780p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f25838s.f25776l = (int) j;
                        return;
                    case 21682:
                        this.f25838s.f25778n = (int) j;
                        return;
                    case 21690:
                        this.f25838s.f25777m = (int) j;
                        return;
                    case 21930:
                        zzavq zzavq2 = this.f25838s;
                        if (j == 1) {
                            z = true;
                        }
                        zzavq2.f25761M = z;
                        return;
                    case 22186:
                        this.f25838s.f25758J = j;
                        return;
                    case 22203:
                        this.f25838s.f25759K = j;
                        return;
                    case 25188:
                        this.f25838s.f25756H = (int) j;
                        return;
                    case 2352003:
                        this.f25838s.f25768d = (int) j;
                        return;
                    case 2807729:
                        this.f25835p = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f25838s.f25784t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f25838s.f25784t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f25838s.f25783s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f25838s.f25783s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f25838s.f25783s = 3;
                                return;
                            case 21947:
                                zzavq zzavq3 = this.f25838s;
                                zzavq3.f25781q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    zzavq3.f25782r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    zzavq3.f25782r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    zzavq3.f25782r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f25838s.f25785u = (int) j;
                                return;
                            case 21949:
                                this.f25838s.f25786v = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new zzasz("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new zzasz("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo42125i(int i, long j, long j2) throws zzasz {
        if (i == 160) {
            this.f25817W = false;
        } else if (i == 174) {
            this.f25838s = new zzavq((zzavp) null);
        } else if (i == 187) {
            this.f25797C = false;
        } else if (i == 19899) {
            this.f25840u = -1;
            this.f25841v = -1;
        } else if (i == 20533) {
            this.f25838s.f25769e = true;
        } else if (i == 21968) {
            this.f25838s.f25781q = true;
        } else if (i == 408125543) {
            long j3 = this.f25834o;
            if (j3 == -1 || j3 == j) {
                this.f25834o = j;
                this.f25833n = j2;
                return;
            }
            throw new zzasz("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f25795A = new zzbaf(32);
            this.f25796B = new zzbaf(32);
        } else if (i != 524531317 || this.f25839t) {
        } else {
            if (!this.f25822c || this.f25843x == -1) {
                this.f25818X.mo42106b(new zzavf(this.f25837r));
                this.f25839t = true;
                return;
            }
            this.f25842w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo42126j(int i, String str) throws zzasz {
        if (i == 134) {
            this.f25838s.f25765a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f25838s.f25762N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new zzasz("DocType " + str + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.zzasz("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023c  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42127k(int r19, int r20, com.google.android.gms.internal.ads.zzauy r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x0089
            if (r1 == r5) goto L_0x0089
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x007f
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0070
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0051
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0047
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.zzavq r1 = r0.f25838s
            byte[] r4 = new byte[r2]
            r1.f25779o = r4
            r3.mo42100h(r4, r7, r2, r7)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.zzasz r2 = new com.google.android.gms.internal.ads.zzasz
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0047:
            com.google.android.gms.internal.ads.zzavq r1 = r0.f25838s
            byte[] r4 = new byte[r2]
            r1.f25772h = r4
            r3.mo42100h(r4, r7, r2, r7)
            return
        L_0x0051:
            com.google.android.gms.internal.ads.zzbak r1 = r0.f25827h
            byte[] r1 = r1.f26406a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzbak r1 = r0.f25827h
            byte[] r1 = r1.f26406a
            int r4 = 4 - r2
            r3.mo42100h(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.zzbak r1 = r0.f25827h
            r1.mo42336v(r7)
            com.google.android.gms.internal.ads.zzbak r1 = r0.f25827h
            long r1 = r1.mo42327m()
            int r2 = (int) r1
            r0.f25840u = r2
            return
        L_0x0070:
            byte[] r1 = new byte[r2]
            r3.mo42100h(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.zzavq r2 = r0.f25838s
            com.google.android.gms.internal.ads.zzavh r3 = new com.google.android.gms.internal.ads.zzavh
            r3.<init>(r6, r1)
            r2.f25771g = r3
            return
        L_0x007f:
            com.google.android.gms.internal.ads.zzavq r1 = r0.f25838s
            byte[] r4 = new byte[r2]
            r1.f25770f = r4
            r3.mo42100h(r4, r7, r2, r7)
            return
        L_0x0089:
            int r4 = r0.f25798D
            r8 = 8
            if (r4 != 0) goto L_0x00ae
            com.google.android.gms.internal.ads.zzavt r4 = r0.f25820a
            long r9 = r4.mo42131e(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.f25804J = r4
            com.google.android.gms.internal.ads.zzavt r4 = r0.f25820a
            int r4 = r4.mo42129a()
            r0.f25805K = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f25800F = r9
            r0.f25798D = r6
            com.google.android.gms.internal.ads.zzbak r4 = r0.f25825f
            r4.mo42332r()
        L_0x00ae:
            android.util.SparseArray r4 = r0.f25821b
            int r9 = r0.f25804J
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.zzavq r4 = (com.google.android.gms.internal.ads.zzavq) r4
            if (r4 != 0) goto L_0x00c4
            int r1 = r0.f25805K
            int r1 = r2 - r1
            r3.mo42101i(r1, r7)
            r0.f25798D = r7
            return
        L_0x00c4:
            int r9 = r0.f25798D
            if (r9 != r6) goto L_0x0256
            r9 = 3
            r0.m42610s(r3, r9)
            com.google.android.gms.internal.ads.zzbak r10 = r0.f25825f
            byte[] r10 = r10.f26406a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ed
            r0.f25802H = r6
            int[] r9 = r0.f25803I
            int[] r9 = m42608q(r9, r6)
            r0.f25803I = r9
            int r10 = r0.f25805K
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x01fd
        L_0x00ed:
            if (r1 != r5) goto L_0x024e
            r13 = 4
            r0.m42610s(r3, r13)
            com.google.android.gms.internal.ads.zzbak r14 = r0.f25825f
            byte[] r14 = r14.f26406a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.f25802H = r14
            int[] r15 = r0.f25803I
            int[] r14 = m42608q(r15, r14)
            r0.f25803I = r14
            if (r10 != r11) goto L_0x0114
            int r9 = r0.f25805K
            int r10 = r0.f25802H
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x01fd
        L_0x0114:
            if (r10 != r6) goto L_0x0149
            r9 = 0
            r10 = 0
        L_0x0118:
            int r14 = r0.f25802H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x013e
            int[] r14 = r0.f25803I
            r14[r9] = r7
        L_0x0122:
            int r13 = r13 + r6
            r0.m42610s(r3, r13)
            com.google.android.gms.internal.ads.zzbak r14 = r0.f25825f
            byte[] r14 = r14.f26406a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f25803I
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0122
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x0118
        L_0x013e:
            int[] r9 = r0.f25803I
            int r15 = r0.f25805K
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x01fd
        L_0x0149:
            if (r10 != r9) goto L_0x0246
            r9 = 0
            r10 = 0
        L_0x014d:
            int r14 = r0.f25802H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01f4
            int[] r14 = r0.f25803I
            r14[r9] = r7
            int r13 = r13 + 1
            r0.m42610s(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.zzbak r15 = r0.f25825f
            byte[] r15 = r15.f26406a
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01ec
            r15 = 0
        L_0x0167:
            if (r15 >= r8) goto L_0x01bb
            int r16 = 7 - r15
            int r5 = r6 << r16
            com.google.android.gms.internal.ads.zzbak r11 = r0.f25825f
            byte[] r11 = r11.f26406a
            byte r11 = r11[r14]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b0
            int r13 = r13 + r15
            r0.m42610s(r3, r13)
            int r11 = r14 + 1
            com.google.android.gms.internal.ads.zzbak r6 = r0.f25825f
            byte[] r6 = r6.f26406a
            byte r6 = r6[r14]
            r6 = r6 & r12
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
        L_0x0186:
            if (r11 >= r13) goto L_0x019e
            int r14 = r11 + 1
            long r5 = r5 << r8
            com.google.android.gms.internal.ads.zzbak r8 = r0.f25825f
            byte[] r8 = r8.f26406a
            byte r8 = r8[r11]
            r8 = r8 & r12
            r17 = r13
            long r12 = (long) r8
            long r5 = r5 | r12
            r11 = r14
            r13 = r17
            r8 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0186
        L_0x019e:
            r17 = r13
            if (r9 <= 0) goto L_0x01ad
            r12 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r12 = r12 << r15
            r14 = -1
            long r12 = r12 + r14
            long r5 = r5 - r12
        L_0x01ad:
            r13 = r17
            goto L_0x01bd
        L_0x01b0:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0167
        L_0x01bb:
            r5 = 0
        L_0x01bd:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x01e4
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x01e4
            int r6 = (int) r5
            int[] r5 = r0.f25803I
            if (r9 == 0) goto L_0x01d5
            int r8 = r9 + -1
            r8 = r5[r8]
            int r6 = r6 + r8
        L_0x01d5:
            r5[r9] = r6
            int r10 = r10 + r6
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014d
        L_0x01e4:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            int[] r5 = r0.f25803I
            int r6 = r0.f25805K
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x01fd:
            com.google.android.gms.internal.ads.zzbak r2 = r0.f25825f
            byte[] r2 = r2.f26406a
            byte r5 = r2[r7]
            r6 = 1
            byte r2 = r2[r6]
            long r8 = r0.f25845z
            r6 = 8
            int r5 = r5 << r6
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.m42605n(r5)
            long r8 = r8 + r5
            r0.f25799E = r8
            com.google.android.gms.internal.ads.zzbak r2 = r0.f25825f
            byte[] r2 = r2.f26406a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r8 = r4.f25767c
            if (r8 == r5) goto L_0x0234
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0232
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0230
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0234
        L_0x0230:
            r1 = 163(0xa3, float:2.28E-43)
        L_0x0232:
            r2 = 0
            goto L_0x0235
        L_0x0234:
            r2 = 1
        L_0x0235:
            r5 = 8
            if (r6 != r5) goto L_0x023c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x023d
        L_0x023c:
            r5 = 0
        L_0x023d:
            r2 = r2 | r5
            r0.f25806L = r2
            r2 = 2
            r0.f25798D = r2
            r0.f25801G = r7
            goto L_0x0256
        L_0x0246:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x024e:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0256:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0280
        L_0x025a:
            int r1 = r0.f25801G
            int r2 = r0.f25802H
            if (r1 >= r2) goto L_0x027d
            int[] r2 = r0.f25803I
            r1 = r2[r1]
            r0.m42611t(r3, r4, r1)
            long r1 = r0.f25799E
            int r5 = r0.f25801G
            int r6 = r4.f25768d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m42606o(r4, r1)
            int r1 = r0.f25801G
            r2 = 1
            int r1 = r1 + r2
            r0.f25801G = r1
            goto L_0x025a
        L_0x027d:
            r0.f25798D = r7
            return
        L_0x0280:
            int[] r1 = r0.f25803I
            r1 = r1[r7]
            r0.m42611t(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavr.mo42127k(int, int, com.google.android.gms.internal.ads.zzauy):void");
    }

    public zzavr(int i) {
        zzavl zzavl = new zzavl();
        this.f25834o = -1;
        this.f25835p = -9223372036854775807L;
        this.f25836q = -9223372036854775807L;
        this.f25837r = -9223372036854775807L;
        this.f25843x = -1;
        this.f25844y = -1;
        this.f25845z = -9223372036854775807L;
        this.f25819Y = zzavl;
        zzavl.mo42119b(new zzavo(this, (zzavn) null));
        this.f25822c = true;
        this.f25820a = new zzavt();
        this.f25821b = new SparseArray();
        this.f25825f = new zzbak(4);
        this.f25826g = new zzbak(ByteBuffer.allocate(4).putInt(-1).array());
        this.f25827h = new zzbak(4);
        this.f25823d = new zzbak(zzbai.f26399a);
        this.f25824e = new zzbak(4);
        this.f25828i = new zzbak();
        this.f25829j = new zzbak();
        this.f25830k = new zzbak(8);
        this.f25831l = new zzbak();
    }
}
