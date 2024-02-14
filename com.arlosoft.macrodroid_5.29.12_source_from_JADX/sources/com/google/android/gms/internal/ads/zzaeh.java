package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaeh {

    /* renamed from: A */
    public int f24025A = -1;

    /* renamed from: B */
    public int f24026B = 1000;

    /* renamed from: C */
    public int f24027C = 200;

    /* renamed from: D */
    public float f24028D = -1.0f;

    /* renamed from: E */
    public float f24029E = -1.0f;

    /* renamed from: F */
    public float f24030F = -1.0f;

    /* renamed from: G */
    public float f24031G = -1.0f;

    /* renamed from: H */
    public float f24032H = -1.0f;

    /* renamed from: I */
    public float f24033I = -1.0f;

    /* renamed from: J */
    public float f24034J = -1.0f;

    /* renamed from: K */
    public float f24035K = -1.0f;

    /* renamed from: L */
    public float f24036L = -1.0f;

    /* renamed from: M */
    public float f24037M = -1.0f;

    /* renamed from: N */
    public byte[] f24038N;

    /* renamed from: O */
    public int f24039O = 1;

    /* renamed from: P */
    public int f24040P = -1;

    /* renamed from: Q */
    public int f24041Q = 8000;

    /* renamed from: R */
    public long f24042R = 0;

    /* renamed from: S */
    public long f24043S = 0;

    /* renamed from: T */
    public zzaaq f24044T;

    /* renamed from: U */
    public boolean f24045U;

    /* renamed from: V */
    public boolean f24046V = true;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f24047W = "eng";

    /* renamed from: X */
    public zzaap f24048X;

    /* renamed from: Y */
    public int f24049Y;

    /* renamed from: a */
    public String f24050a;

    /* renamed from: b */
    public String f24051b;

    /* renamed from: c */
    public int f24052c;

    /* renamed from: d */
    public int f24053d;

    /* renamed from: e */
    public int f24054e;

    /* renamed from: f */
    public int f24055f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f24056g;

    /* renamed from: h */
    public boolean f24057h;

    /* renamed from: i */
    public byte[] f24058i;

    /* renamed from: j */
    public zzaao f24059j;

    /* renamed from: k */
    public byte[] f24060k;

    /* renamed from: l */
    public zzx f24061l;

    /* renamed from: m */
    public int f24062m = -1;

    /* renamed from: n */
    public int f24063n = -1;

    /* renamed from: o */
    public int f24064o = -1;

    /* renamed from: p */
    public int f24065p = -1;

    /* renamed from: q */
    public int f24066q = 0;

    /* renamed from: r */
    public int f24067r = -1;

    /* renamed from: s */
    public float f24068s = 0.0f;

    /* renamed from: t */
    public float f24069t = 0.0f;

    /* renamed from: u */
    public float f24070u = 0.0f;

    /* renamed from: v */
    public byte[] f24071v = null;

    /* renamed from: w */
    public int f24072w = -1;

    /* renamed from: x */
    public boolean f24073x = false;

    /* renamed from: y */
    public int f24074y = -1;

    /* renamed from: z */
    public int f24075z = -1;

    protected zzaeh() {
    }

    /* renamed from: f */
    private static Pair m41143f(zzef zzef) throws zzbu {
        try {
            zzef.mo45231g(16);
            long y = zzef.mo45249y();
            if (y == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (y == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (y == 826496599) {
                int k = zzef.mo45235k() + 20;
                byte[] h = zzef.mo45232h();
                while (true) {
                    int length = h.length;
                    if (k >= length - 4) {
                        throw zzbu.m44135a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (h[k] == 0 && h[k + 1] == 0 && h[k + 2] == 1 && h[k + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(h, k, length)));
                    } else {
                        k++;
                    }
                }
            } else {
                zzdw.m48255e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m44135a("Error parsing FourCC private data", (Throwable) null);
        }
    }

    /* renamed from: g */
    private static List m41144g(byte[] bArr) throws zzbu {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i] & 255;
                    if (b != 255) {
                        break;
                    }
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbu.m44135a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzbu.m44135a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzbu.m44135a("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzbu.m44135a("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m44135a("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    /* renamed from: h */
    private static boolean m41145h(zzef zzef) throws zzbu {
        try {
            int q = zzef.mo45241q();
            if (q == 1) {
                return true;
            }
            if (q == 65534) {
                zzef.mo45230f(24);
                return zzef.mo45250z() == zzaei.f24081h0.getMostSignificantBits() && zzef.mo45250z() == zzaei.f24081h0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m44135a("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    /* renamed from: i */
    private final byte[] m41146i(String str) throws zzbu {
        byte[] bArr = this.f24060k;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.m44135a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.android.gms.internal.ads.zzq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028e, code lost:
        r1 = null;
        r2 = null;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c0, code lost:
        r1 = null;
        r2 = null;
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0351, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0382, code lost:
        r3 = -1;
        r9 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a2, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a4, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a5, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03a6, code lost:
        r4 = r0.f24038N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a8, code lost:
        if (r4 == null) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03aa, code lost:
        r4 = com.google.android.gms.internal.ads.zzze.m55505a(new com.google.android.gms.internal.ads.zzef(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b3, code lost:
        if (r4 == null) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b5, code lost:
        r2 = r4.f39035a;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b9, code lost:
        r4 = r17;
        r5 = r0.f24046V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bf, code lost:
        if (true == r0.f24045U) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c1, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c3, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c4, code lost:
        r5 = r5 | r8;
        r8 = new com.google.android.gms.internal.ads.zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ce, code lost:
        if (com.google.android.gms.internal.ads.zzbt.m44094g(r4) == false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d0, code lost:
        r8.mo41326e0(r0.f24039O);
        r8.mo41344t(r0.f24041Q);
        r8.mo41338n(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e3, code lost:
        if (com.google.android.gms.internal.ads.zzbt.m44095h(r4) == false) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e7, code lost:
        if (r0.f24066q != 0) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e9, code lost:
        r6 = r0.f24064o;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ec, code lost:
        if (r6 != -1) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ee, code lost:
        r6 = r0.f24062m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03f0, code lost:
        r0.f24064o = r6;
        r6 = r0.f24065p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03f4, code lost:
        if (r6 != -1) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f6, code lost:
        r6 = r0.f24063n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03f8, code lost:
        r0.f24065p = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03fb, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03fc, code lost:
        r6 = r0.f24064o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0400, code lost:
        if (r6 == r7) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0402, code lost:
        r11 = r0.f24065p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0404, code lost:
        if (r11 == r7) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0406, code lost:
        r6 = ((float) (r0.f24063n * r6)) / ((float) (r0.f24062m * r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0412, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0416, code lost:
        if (r0.f24073x == false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x041c, code lost:
        if (r0.f24028D == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0422, code lost:
        if (r0.f24029E == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0428, code lost:
        if (r0.f24030F == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x042e, code lost:
        if (r0.f24031G == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0434, code lost:
        if (r0.f24032H == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x043a, code lost:
        if (r0.f24033I == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0440, code lost:
        if (r0.f24034J == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0446, code lost:
        if (r0.f24035K == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x044c, code lost:
        if (r0.f24036L == -1.0f) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0452, code lost:
        if (r0.f24037M != -1.0f) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0456, code lost:
        r12 = new byte[25];
        r9 = java.nio.ByteBuffer.wrap(r12).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r9.put((byte) 0);
        r9.putShort((short) ((int) ((r0.f24028D * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24029E * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24030F * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24031G * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24032H * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24033I * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24034J * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) ((r0.f24035K * 50000.0f) + 0.5f)));
        r9.putShort((short) ((int) (r0.f24036L + 0.5f)));
        r9.putShort((short) ((int) (r0.f24037M + 0.5f)));
        r9.putShort((short) r0.f24026B);
        r9.putShort((short) r0.f24027C);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04d8, code lost:
        r12 = new com.google.android.gms.internal.ads.zzq(r0.f24074y, r0.f24025A, r0.f24075z, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04e6, code lost:
        if (r0.f24050a == null) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04f2, code lost:
        if (com.google.android.gms.internal.ads.zzaei.f24082i0.containsKey(r0.f24050a) == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04f4, code lost:
        r7 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzaei.f24082i0.get(r0.f24050a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0506, code lost:
        if (r0.f24067r != 0) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x050f, code lost:
        if (java.lang.Float.compare(r0.f24068s, 0.0f) != 0) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0517, code lost:
        if (java.lang.Float.compare(r0.f24069t, 0.0f) != 0) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051f, code lost:
        if (java.lang.Float.compare(r0.f24070u, 0.0f) != 0) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052a, code lost:
        if (java.lang.Float.compare(r0.f24069t, 90.0f) != 0) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x052c, code lost:
        r10 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0537, code lost:
        if (java.lang.Float.compare(r0.f24069t, -180.0f) == 0) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0541, code lost:
        if (java.lang.Float.compare(r0.f24069t, 180.0f) != 0) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054c, code lost:
        if (java.lang.Float.compare(r0.f24069t, -90.0f) != 0) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x054e, code lost:
        r10 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0551, code lost:
        r10 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0554, code lost:
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0555, code lost:
        r8.mo41348x(r0.f24062m);
        r8.mo41327f(r0.f24063n);
        r8.mo41340p(r6);
        r8.mo41342r(r10);
        r8.mo41341q(r0.f24071v);
        r8.mo41346v(r0.f24072w);
        r8.mo41330g0(r12);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0578, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x057e, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0584, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x058c, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0594, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x059c, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05a5, code lost:
        throw com.google.android.gms.internal.ads.zzbu.m44135a("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05a6, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05a9, code lost:
        if (r0.f24050a == null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05b5, code lost:
        if (com.google.android.gms.internal.ads.zzaei.f24082i0.containsKey(r0.f24050a) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05b7, code lost:
        r8.mo41334j(r0.f24050a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05bc, code lost:
        r8.mo41329g(r22);
        r8.mo41343s(r4);
        r8.mo41336l(r3);
        r8.mo41335k(r0.f24047W);
        r8.mo41345u(r5);
        r8.mo41333i(r1);
        r8.mo41328f0(r2);
        r8.mo41320b(r0.f24061l);
        r1 = r8.mo41349y();
        r2 = r21.mo41256k(r0.f24052c, r6);
        r0.f24048X = r2;
        r2.mo41214d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05eb, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41401e(com.google.android.gms.internal.ads.zzzl r21, int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.f24051b
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 32
            r6 = 1
            r8 = 8
            r9 = 4
            r10 = 0
            r11 = 3
            switch(r2) {
                case -2095576542: goto L_0x0188;
                case -2095575984: goto L_0x017e;
                case -1985379776: goto L_0x0173;
                case -1784763192: goto L_0x0168;
                case -1730367663: goto L_0x015d;
                case -1482641358: goto L_0x0152;
                case -1482641357: goto L_0x0147;
                case -1373388978: goto L_0x013c;
                case -933872740: goto L_0x0131;
                case -538363189: goto L_0x0126;
                case -538363109: goto L_0x011b;
                case -425012669: goto L_0x010f;
                case -356037306: goto L_0x0103;
                case 62923557: goto L_0x00f7;
                case 62923603: goto L_0x00eb;
                case 62927045: goto L_0x00df;
                case 82318131: goto L_0x00d4;
                case 82338133: goto L_0x00c9;
                case 82338134: goto L_0x00be;
                case 99146302: goto L_0x00b2;
                case 444813526: goto L_0x00a6;
                case 542569478: goto L_0x009a;
                case 635596514: goto L_0x008e;
                case 725948237: goto L_0x0082;
                case 725957860: goto L_0x0076;
                case 738597099: goto L_0x006a;
                case 855502857: goto L_0x005e;
                case 1045209816: goto L_0x0052;
                case 1422270023: goto L_0x0046;
                case 1809237540: goto L_0x003b;
                case 1950749482: goto L_0x002f;
                case 1950789798: goto L_0x0023;
                case 1951062397: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0192
        L_0x0017:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 12
            goto L_0x0193
        L_0x0023:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 22
            goto L_0x0193
        L_0x002f:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 17
            goto L_0x0193
        L_0x003b:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 3
            goto L_0x0193
        L_0x0046:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 27
            goto L_0x0193
        L_0x0052:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 29
            goto L_0x0193
        L_0x005e:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 8
            goto L_0x0193
        L_0x006a:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 28
            goto L_0x0193
        L_0x0076:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 24
            goto L_0x0193
        L_0x0082:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 25
            goto L_0x0193
        L_0x008e:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 26
            goto L_0x0193
        L_0x009a:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 20
            goto L_0x0193
        L_0x00a6:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 10
            goto L_0x0193
        L_0x00b2:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 31
            goto L_0x0193
        L_0x00be:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 1
            goto L_0x0193
        L_0x00c9:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 0
            goto L_0x0193
        L_0x00d4:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 2
            goto L_0x0193
        L_0x00df:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 19
            goto L_0x0193
        L_0x00eb:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 16
            goto L_0x0193
        L_0x00f7:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 13
            goto L_0x0193
        L_0x0103:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 21
            goto L_0x0193
        L_0x010f:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 30
            goto L_0x0193
        L_0x011b:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 7
            goto L_0x0193
        L_0x0126:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 5
            goto L_0x0193
        L_0x0131:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 32
            goto L_0x0193
        L_0x013c:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 9
            goto L_0x0193
        L_0x0147:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 15
            goto L_0x0193
        L_0x0152:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 14
            goto L_0x0193
        L_0x015d:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 11
            goto L_0x0193
        L_0x0168:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 18
            goto L_0x0193
        L_0x0173:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 23
            goto L_0x0193
        L_0x017e:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 4
            goto L_0x0193
        L_0x0188:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 6
            goto L_0x0193
        L_0x0192:
            r2 = -1
        L_0x0193:
            java.lang.String r13 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r14 = "text/vtt"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            r12 = 0
            switch(r2) {
                case 0: goto L_0x03a0;
                case 1: goto L_0x039d;
                case 2: goto L_0x039a;
                case 3: goto L_0x0397;
                case 4: goto L_0x038a;
                case 5: goto L_0x038a;
                case 6: goto L_0x038a;
                case 7: goto L_0x036b;
                case 8: goto L_0x0353;
                case 9: goto L_0x033a;
                case 10: goto L_0x0336;
                case 11: goto L_0x0325;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02c6;
                case 14: goto L_0x02be;
                case 15: goto L_0x02bb;
                case 16: goto L_0x02b7;
                case 17: goto L_0x02b3;
                case 18: goto L_0x02a8;
                case 19: goto L_0x02a4;
                case 20: goto L_0x02a4;
                case 21: goto L_0x02a0;
                case 22: goto L_0x0294;
                case 23: goto L_0x0258;
                case 24: goto L_0x0231;
                case 25: goto L_0x020a;
                case 26: goto L_0x01ec;
                case 27: goto L_0x01e8;
                case 28: goto L_0x01d5;
                case 29: goto L_0x01cf;
                case 30: goto L_0x01c3;
                case 31: goto L_0x01bf;
                case 32: goto L_0x01ae;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r12)
            throw r1
        L_0x01ae:
            byte[] r2 = new byte[r9]
            byte[] r1 = r0.m41146i(r1)
            java.lang.System.arraycopy(r1, r10, r2, r10, r9)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.m51136z(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0351
        L_0x01bf:
            java.lang.String r17 = "application/pgs"
            goto L_0x03a2
        L_0x01c3:
            byte[] r1 = r0.m41146i(r1)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.m51136z(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x0351
        L_0x01cf:
            r1 = r12
            r2 = r1
            r17 = r14
            goto L_0x03a4
        L_0x01d5:
            byte[] r1 = com.google.android.gms.internal.ads.zzaei.f24078e0
            java.lang.String r2 = r0.f24051b
            byte[] r2 = r0.m41146i(r2)
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.m51125B(r1, r2)
            r2 = r12
            r17 = r15
            goto L_0x03a4
        L_0x01e8:
            r17 = r7
            goto L_0x03a2
        L_0x01ec:
            int r1 = r0.f24040P
            if (r1 != r5) goto L_0x01f1
            goto L_0x0253
        L_0x01f1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r1)
            goto L_0x028e
        L_0x020a:
            int r1 = r0.f24040P
            if (r1 != r8) goto L_0x0214
            r1 = r12
            r2 = r1
            r3 = -1
            r9 = 3
            goto L_0x03a6
        L_0x0214:
            if (r1 != r4) goto L_0x0219
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0253
        L_0x0219:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r1)
            goto L_0x028e
        L_0x0231:
            int r1 = r0.f24040P
            int r9 = com.google.android.gms.internal.ads.zzen.m49149X(r1)
            if (r9 != 0) goto L_0x0253
            int r1 = r0.f24040P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r1)
            goto L_0x028e
        L_0x0253:
            r1 = r12
            r2 = r1
            r3 = -1
            goto L_0x03a6
        L_0x0258:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.m41146i(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = m41145h(r2)
            if (r1 == 0) goto L_0x0289
            int r1 = r0.f24040P
            int r9 = com.google.android.gms.internal.ads.zzen.m49149X(r1)
            if (r9 != 0) goto L_0x0253
            int r1 = r0.f24040P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r1)
            goto L_0x028e
        L_0x0289:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r1)
        L_0x028e:
            r1 = r12
            r2 = r1
            r17 = r18
            goto L_0x03a4
        L_0x0294:
            byte[] r1 = r0.m41146i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0351
        L_0x02a0:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03a2
        L_0x02a4:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03a2
        L_0x02a8:
            com.google.android.gms.internal.ads.zzaaq r1 = new com.google.android.gms.internal.ads.zzaaq
            r1.<init>()
            r0.f24044T = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03a2
        L_0x02b3:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03a2
        L_0x02b7:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03a2
        L_0x02bb:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02c0
        L_0x02be:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02c0:
            r1 = r12
            r2 = r1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a5
        L_0x02c6:
            byte[] r1 = r0.m41146i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f24060k
            com.google.android.gms.internal.ads.zzyf r2 = com.google.android.gms.internal.ads.zzyg.m55423a(r2)
            int r3 = r2.f38958a
            r0.f24041Q = r3
            int r3 = r2.f38959b
            r0.f24039O = r3
            java.lang.String r2 = r2.f38960c
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x03a4
        L_0x02e2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.lang.String r2 = r0.f24051b
            byte[] r2 = r0.m41146i(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r4 = r0.f24042R
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.f24043S
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            r2 = r12
            r3 = 5760(0x1680, float:8.071E-42)
            goto L_0x03a5
        L_0x0325:
            byte[] r1 = r0.m41146i(r1)
            java.util.List r1 = m41144g(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
            r2 = r12
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a5
        L_0x0336:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03a2
        L_0x033a:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.m41146i(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = m41143f(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0351:
            r2 = r12
            goto L_0x03a4
        L_0x0353:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.m41146i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzzy r1 = com.google.android.gms.internal.ads.zzzy.m55582a(r2)
            java.util.List r2 = r1.f39066a
            int r3 = r1.f39067b
            r0.f24049Y = r3
            java.lang.String r1 = r1.f39069d
            java.lang.String r17 = "video/hevc"
            goto L_0x0382
        L_0x036b:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            byte[] r1 = r0.m41146i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzyn r1 = com.google.android.gms.internal.ads.zzyn.m55435a(r2)
            java.util.List r2 = r1.f38981a
            int r3 = r1.f38982b
            r0.f24049Y = r3
            java.lang.String r1 = r1.f38986f
            java.lang.String r17 = "video/avc"
        L_0x0382:
            r3 = -1
            r9 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x03a6
        L_0x038a:
            byte[] r1 = r0.f24060k
            if (r1 != 0) goto L_0x0390
            r1 = r12
            goto L_0x0394
        L_0x0390:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0394:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0351
        L_0x0397:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03a2
        L_0x039a:
            java.lang.String r17 = "video/av01"
            goto L_0x03a2
        L_0x039d:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x03a2
        L_0x03a0:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03a2:
            r1 = r12
            r2 = r1
        L_0x03a4:
            r3 = -1
        L_0x03a5:
            r9 = -1
        L_0x03a6:
            byte[] r4 = r0.f24038N
            if (r4 == 0) goto L_0x03b9
            com.google.android.gms.internal.ads.zzef r5 = new com.google.android.gms.internal.ads.zzef
            r5.<init>((byte[]) r4)
            com.google.android.gms.internal.ads.zzze r4 = com.google.android.gms.internal.ads.zzze.m55505a(r5)
            if (r4 == 0) goto L_0x03b9
            java.lang.String r2 = r4.f39035a
            java.lang.String r17 = "video/dolby-vision"
        L_0x03b9:
            r4 = r17
            boolean r5 = r0.f24046V
            boolean r8 = r0.f24045U
            if (r6 == r8) goto L_0x03c3
            r8 = 0
            goto L_0x03c4
        L_0x03c3:
            r8 = 2
        L_0x03c4:
            r5 = r5 | r8
            com.google.android.gms.internal.ads.zzad r8 = new com.google.android.gms.internal.ads.zzad
            r8.<init>()
            boolean r13 = com.google.android.gms.internal.ads.zzbt.m44094g(r4)
            if (r13 == 0) goto L_0x03df
            int r7 = r0.f24039O
            r8.mo41326e0(r7)
            int r7 = r0.f24041Q
            r8.mo41344t(r7)
            r8.mo41338n(r9)
            goto L_0x05a7
        L_0x03df:
            boolean r6 = com.google.android.gms.internal.ads.zzbt.m44095h(r4)
            if (r6 == 0) goto L_0x0574
            int r6 = r0.f24066q
            if (r6 != 0) goto L_0x03fb
            int r6 = r0.f24064o
            r7 = -1
            if (r6 != r7) goto L_0x03f0
            int r6 = r0.f24062m
        L_0x03f0:
            r0.f24064o = r6
            int r6 = r0.f24065p
            if (r6 != r7) goto L_0x03f8
            int r6 = r0.f24063n
        L_0x03f8:
            r0.f24065p = r6
            goto L_0x03fc
        L_0x03fb:
            r7 = -1
        L_0x03fc:
            int r6 = r0.f24064o
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r7) goto L_0x0412
            int r11 = r0.f24065p
            if (r11 == r7) goto L_0x0412
            int r13 = r0.f24063n
            int r13 = r13 * r6
            float r6 = (float) r13
            int r13 = r0.f24062m
            int r13 = r13 * r11
            float r11 = (float) r13
            float r6 = r6 / r11
            goto L_0x0414
        L_0x0412:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0414:
            boolean r11 = r0.f24073x
            if (r11 == 0) goto L_0x04e4
            float r11 = r0.f24028D
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24029E
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24030F
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24031G
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24032H
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24033I
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24034J
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24035K
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24036L
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x04d8
            float r11 = r0.f24037M
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0456
            goto L_0x04d8
        L_0x0456:
            r9 = 25
            byte[] r12 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r9 = r9.order(r11)
            r9.put(r10)
            float r11 = r0.f24028D
            r13 = 1195593728(0x47435000, float:50000.0)
            float r11 = r11 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24029E
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24030F
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24031G
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24032H
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24033I
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24034J
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24035K
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24036L
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            float r11 = r0.f24037M
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r9.putShort(r11)
            int r11 = r0.f24026B
            short r11 = (short) r11
            r9.putShort(r11)
            int r11 = r0.f24027C
            short r11 = (short) r11
            r9.putShort(r11)
        L_0x04d8:
            com.google.android.gms.internal.ads.zzq r9 = new com.google.android.gms.internal.ads.zzq
            int r11 = r0.f24074y
            int r13 = r0.f24025A
            int r14 = r0.f24075z
            r9.<init>(r11, r13, r14, r12)
            r12 = r9
        L_0x04e4:
            java.lang.String r9 = r0.f24050a
            if (r9 == 0) goto L_0x0504
            java.util.Map r9 = com.google.android.gms.internal.ads.zzaei.f24082i0
            java.lang.String r11 = r0.f24050a
            boolean r9 = r9.containsKey(r11)
            if (r9 == 0) goto L_0x0504
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaei.f24082i0
            java.lang.String r9 = r0.f24050a
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0504:
            int r9 = r0.f24067r
            if (r9 != 0) goto L_0x0554
            float r9 = r0.f24068s
            r11 = 0
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x0554
            float r9 = r0.f24069t
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x0554
            float r9 = r0.f24070u
            int r9 = java.lang.Float.compare(r9, r11)
            if (r9 != 0) goto L_0x0522
            goto L_0x0555
        L_0x0522:
            float r9 = r0.f24069t
            r10 = 1119092736(0x42b40000, float:90.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x052f
            r10 = 90
            goto L_0x0555
        L_0x052f:
            float r9 = r0.f24069t
            r10 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 == 0) goto L_0x0551
            float r9 = r0.f24069t
            r10 = 1127481344(0x43340000, float:180.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x0544
            goto L_0x0551
        L_0x0544:
            float r9 = r0.f24069t
            r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r9 = java.lang.Float.compare(r9, r10)
            if (r9 != 0) goto L_0x0554
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x0555
        L_0x0551:
            r10 = 180(0xb4, float:2.52E-43)
            goto L_0x0555
        L_0x0554:
            r10 = r7
        L_0x0555:
            int r7 = r0.f24062m
            r8.mo41348x(r7)
            int r7 = r0.f24063n
            r8.mo41327f(r7)
            r8.mo41340p(r6)
            r8.mo41342r(r10)
            byte[] r6 = r0.f24071v
            r8.mo41341q(r6)
            int r6 = r0.f24072w
            r8.mo41346v(r6)
            r8.mo41330g0(r12)
            r6 = 2
            goto L_0x05a7
        L_0x0574:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L_0x05a6
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L_0x05a6
            boolean r6 = r14.equals(r4)
            if (r6 != 0) goto L_0x05a6
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05a6
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05a6
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x059f
            goto L_0x05a6
        L_0x059f:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r12)
            throw r1
        L_0x05a6:
            r6 = 3
        L_0x05a7:
            java.lang.String r7 = r0.f24050a
            if (r7 == 0) goto L_0x05bc
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaei.f24082i0
            java.lang.String r9 = r0.f24050a
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L_0x05bc
            java.lang.String r7 = r0.f24050a
            r8.mo41334j(r7)
        L_0x05bc:
            r7 = r22
            r8.mo41329g(r7)
            r8.mo41343s(r4)
            r8.mo41336l(r3)
            java.lang.String r3 = r0.f24047W
            r8.mo41335k(r3)
            r8.mo41345u(r5)
            r8.mo41333i(r1)
            r8.mo41328f0(r2)
            com.google.android.gms.internal.ads.zzx r1 = r0.f24061l
            r8.mo41320b(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r8.mo41349y()
            int r2 = r0.f24052c
            r3 = r21
            com.google.android.gms.internal.ads.zzaap r2 = r3.mo41256k(r2, r6)
            r0.f24048X = r2
            r2.mo41214d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeh.mo41401e(com.google.android.gms.internal.ads.zzzl, int):void");
    }
}
