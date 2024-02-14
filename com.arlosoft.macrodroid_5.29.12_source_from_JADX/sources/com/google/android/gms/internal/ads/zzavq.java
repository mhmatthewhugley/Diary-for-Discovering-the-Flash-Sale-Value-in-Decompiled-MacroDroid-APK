package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavq {

    /* renamed from: A */
    public float f25749A = -1.0f;

    /* renamed from: B */
    public float f25750B = -1.0f;

    /* renamed from: C */
    public float f25751C = -1.0f;

    /* renamed from: D */
    public float f25752D = -1.0f;

    /* renamed from: E */
    public float f25753E = -1.0f;

    /* renamed from: F */
    public float f25754F = -1.0f;

    /* renamed from: G */
    public int f25755G = 1;

    /* renamed from: H */
    public int f25756H = -1;

    /* renamed from: I */
    public int f25757I = 8000;

    /* renamed from: J */
    public long f25758J = 0;

    /* renamed from: K */
    public long f25759K = 0;

    /* renamed from: L */
    public boolean f25760L;

    /* renamed from: M */
    public boolean f25761M = true;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f25762N = "eng";

    /* renamed from: O */
    public zzavi f25763O;

    /* renamed from: P */
    public int f25764P;

    /* renamed from: a */
    public String f25765a;

    /* renamed from: b */
    public int f25766b;

    /* renamed from: c */
    public int f25767c;

    /* renamed from: d */
    public int f25768d;

    /* renamed from: e */
    public boolean f25769e;

    /* renamed from: f */
    public byte[] f25770f;

    /* renamed from: g */
    public zzavh f25771g;

    /* renamed from: h */
    public byte[] f25772h;

    /* renamed from: i */
    public zzauv f25773i;

    /* renamed from: j */
    public int f25774j = -1;

    /* renamed from: k */
    public int f25775k = -1;

    /* renamed from: l */
    public int f25776l = -1;

    /* renamed from: m */
    public int f25777m = -1;

    /* renamed from: n */
    public int f25778n = 0;

    /* renamed from: o */
    public byte[] f25779o = null;

    /* renamed from: p */
    public int f25780p = -1;

    /* renamed from: q */
    public boolean f25781q = false;

    /* renamed from: r */
    public int f25782r = -1;

    /* renamed from: s */
    public int f25783s = -1;

    /* renamed from: t */
    public int f25784t = -1;

    /* renamed from: u */
    public int f25785u = 1000;

    /* renamed from: v */
    public int f25786v = 200;

    /* renamed from: w */
    public float f25787w = -1.0f;

    /* renamed from: x */
    public float f25788x = -1.0f;

    /* renamed from: y */
    public float f25789y = -1.0f;

    /* renamed from: z */
    public float f25790z = -1.0f;

    private zzavq() {
    }

    /* synthetic */ zzavq(zzavp zzavp) {
    }

    /* renamed from: c */
    private static List m42598c(zzbak zzbak) throws zzasz {
        try {
            zzbak.mo42337w(16);
            if (zzbak.mo42325k() != 826496599) {
                return null;
            }
            int c = zzbak.mo42317c() + 20;
            byte[] bArr = zzbak.f26406a;
            while (true) {
                int length = bArr.length;
                if (c >= length - 4) {
                    throw new zzasz("Failed to find FourCC VC1 initialization data");
                } else if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, c, length));
                } else {
                    c++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: d */
    private static List m42599d(byte[] bArr) throws zzasz {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i];
                    if (b != -1) {
                        break;
                    }
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3];
                    if (b2 != -1) {
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
                        throw new zzasz("Error parsing vorbis codec private");
                    }
                    throw new zzasz("Error parsing vorbis codec private");
                }
                throw new zzasz("Error parsing vorbis codec private");
            }
            throw new zzasz("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing vorbis codec private");
        }
    }

    /* renamed from: e */
    private static boolean m42600e(zzbak zzbak) throws zzasz {
        try {
            int f = zzbak.mo42320f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                zzbak.mo42336v(24);
                return zzbak.mo42326l() == zzavr.f25794c0.getMostSignificantBits() && zzbak.mo42326l() == zzavr.f25794c0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f9, code lost:
        r12 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0220, code lost:
        r1 = null;
        r27 = -1;
        r32 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c9, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e1, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e3, code lost:
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e5, code lost:
        r32 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e7, code lost:
        r2 = r0.f25761M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02eb, code lost:
        if (true == r0.f25760L) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ed, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ef, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f0, code lost:
        r2 = r2 | r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f5, code lost:
        if (com.google.android.gms.internal.ads.zzbah.m42941a(r12) == false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f7, code lost:
        r1 = com.google.android.gms.internal.ads.zzasw.m42371h(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r32, r0.f25755G, r0.f25757I, r27, -1, -1, r1, r0.f25773i, r2 ? 1 : 0, r0.f25762N, (com.google.android.gms.internal.ads.zzaxh) null);
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0328, code lost:
        if (com.google.android.gms.internal.ads.zzbah.m42942b(r12) == false) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032c, code lost:
        if (r0.f25778n != 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032e, code lost:
        r2 = r0.f25776l;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0331, code lost:
        if (r2 != -1) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0333, code lost:
        r2 = r0.f25774j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0335, code lost:
        r0.f25776l = r2;
        r2 = r0.f25777m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0339, code lost:
        if (r2 != -1) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x033b, code lost:
        r2 = r0.f25775k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033d, code lost:
        r0.f25777m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0340, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0341, code lost:
        r2 = r0.f25776l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0345, code lost:
        if (r2 == r3) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0347, code lost:
        r5 = r0.f25777m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0349, code lost:
        if (r5 == r3) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034b, code lost:
        r38 = ((float) (r0.f25775k * r2)) / ((float) (r0.f25774j * r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0359, code lost:
        r38 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035d, code lost:
        if (r0.f25781q == false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0363, code lost:
        if (r0.f25787w == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0369, code lost:
        if (r0.f25788x == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x036f, code lost:
        if (r0.f25789y == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0375, code lost:
        if (r0.f25790z == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x037b, code lost:
        if (r0.f25749A == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0381, code lost:
        if (r0.f25750B == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0387, code lost:
        if (r0.f25751C == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x038d, code lost:
        if (r0.f25752D == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0393, code lost:
        if (r0.f25753E == -1.0f) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0399, code lost:
        if (r0.f25754F != -1.0f) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x039d, code lost:
        r2 = new byte[25];
        r3 = java.nio.ByteBuffer.wrap(r2);
        r3.put((byte) 0);
        r3.putShort((short) ((int) ((r0.f25787w * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25788x * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25789y * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25790z * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25749A * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25750B * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25751C * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f25752D * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) (r0.f25753E + 0.5f)));
        r3.putShort((short) ((int) (r0.f25754F + 0.5f)));
        r3.putShort((short) r0.f25785u);
        r3.putShort((short) r0.f25786v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x041a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041c, code lost:
        r41 = new com.google.android.gms.internal.ads.zzbau(r0.f25782r, r0.f25784t, r0.f25783s, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x042a, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x042c, code lost:
        r1 = com.google.android.gms.internal.ads.zzasw.m42375l(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r32, r0.f25774j, r0.f25775k, -1.0f, r1, -1, r38, r0.f25779o, r0.f25780p, r41, r0.f25773i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0459, code lost:
        if ("application/x-subrip".equals(r12) == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045b, code lost:
        r1 = com.google.android.gms.internal.ads.zzasw.m42374k(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r2 ? 1 : 0, r0.f25762N, -1, r0.f25773i, androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL, java.util.Collections.emptyList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x047e, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0484, code lost:
        if ("application/vobsub".equals(r12) != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x048a, code lost:
        if ("application/pgs".equals(r12) != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0490, code lost:
        if ("application/dvbsubs".equals(r12) == false) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x049a, code lost:
        throw new com.google.android.gms.internal.ads.zzasz("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x049b, code lost:
        r1 = com.google.android.gms.internal.ads.zzasw.m42372i(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r1, r0.f25762N, r0.f25773i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04b4, code lost:
        r2 = r44.mo42107h(r0.f25766b, r6);
        r0.f25763O = r2;
        r2.mo42117d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c1, code lost:
        r27 = r1;
        r1 = null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42121b(com.google.android.gms.internal.ads.zzava r44, int r45) throws com.google.android.gms.internal.ads.zzasz {
        /*
            r43 = this;
            r0 = r43
            java.lang.String r1 = r0.f25765a
            int r2 = r1.hashCode()
            r4 = 4
            r5 = 8
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 3
            switch(r2) {
                case -2095576542: goto L_0x0149;
                case -2095575984: goto L_0x013f;
                case -1985379776: goto L_0x0134;
                case -1784763192: goto L_0x0129;
                case -1730367663: goto L_0x011e;
                case -1482641358: goto L_0x0113;
                case -1482641357: goto L_0x0108;
                case -1373388978: goto L_0x00fd;
                case -933872740: goto L_0x00f2;
                case -538363189: goto L_0x00e7;
                case -538363109: goto L_0x00dc;
                case -425012669: goto L_0x00d0;
                case -356037306: goto L_0x00c4;
                case 62923557: goto L_0x00b8;
                case 62923603: goto L_0x00ac;
                case 62927045: goto L_0x00a0;
                case 82338133: goto L_0x0095;
                case 82338134: goto L_0x008a;
                case 99146302: goto L_0x007e;
                case 444813526: goto L_0x0072;
                case 542569478: goto L_0x0066;
                case 725957860: goto L_0x005a;
                case 855502857: goto L_0x004f;
                case 1422270023: goto L_0x0043;
                case 1809237540: goto L_0x0038;
                case 1950749482: goto L_0x002c;
                case 1950789798: goto L_0x0020;
                case 1951062397: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0153
        L_0x0014:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 11
            goto L_0x0154
        L_0x0020:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 21
            goto L_0x0154
        L_0x002c:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 16
            goto L_0x0154
        L_0x0038:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 2
            goto L_0x0154
        L_0x0043:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 24
            goto L_0x0154
        L_0x004f:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 7
            goto L_0x0154
        L_0x005a:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 23
            goto L_0x0154
        L_0x0066:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 19
            goto L_0x0154
        L_0x0072:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 9
            goto L_0x0154
        L_0x007e:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 26
            goto L_0x0154
        L_0x008a:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 1
            goto L_0x0154
        L_0x0095:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 0
            goto L_0x0154
        L_0x00a0:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 18
            goto L_0x0154
        L_0x00ac:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 15
            goto L_0x0154
        L_0x00b8:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 12
            goto L_0x0154
        L_0x00c4:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 20
            goto L_0x0154
        L_0x00d0:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 25
            goto L_0x0154
        L_0x00dc:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 6
            goto L_0x0154
        L_0x00e7:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 4
            goto L_0x0154
        L_0x00f2:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 27
            goto L_0x0154
        L_0x00fd:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 8
            goto L_0x0154
        L_0x0108:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 14
            goto L_0x0154
        L_0x0113:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 13
            goto L_0x0154
        L_0x011e:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 10
            goto L_0x0154
        L_0x0129:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 17
            goto L_0x0154
        L_0x0134:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 22
            goto L_0x0154
        L_0x013f:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 3
            goto L_0x0154
        L_0x0149:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 5
            goto L_0x0154
        L_0x0153:
            r1 = -1
        L_0x0154:
            java.lang.String r2 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r11 = "Unsupported PCM bit depth: "
            java.lang.String r12 = "audio/raw"
            java.lang.String r13 = "application/dvbsubs"
            java.lang.String r14 = "application/pgs"
            java.lang.String r15 = "application/vobsub"
            java.lang.String r3 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "video/x-unknown"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r10 = "MatroskaExtractor"
            r19 = 0
            switch(r1) {
                case 0: goto L_0x02df;
                case 1: goto L_0x02dc;
                case 2: goto L_0x02d9;
                case 3: goto L_0x02cb;
                case 4: goto L_0x02cb;
                case 5: goto L_0x02cb;
                case 6: goto L_0x02b6;
                case 7: goto L_0x02a2;
                case 8: goto L_0x028a;
                case 9: goto L_0x0287;
                case 10: goto L_0x0278;
                case 11: goto L_0x0232;
                case 12: goto L_0x0228;
                case 13: goto L_0x021e;
                case 14: goto L_0x021b;
                case 15: goto L_0x0217;
                case 16: goto L_0x0213;
                case 17: goto L_0x020f;
                case 18: goto L_0x020b;
                case 19: goto L_0x020b;
                case 20: goto L_0x0207;
                case 21: goto L_0x01fd;
                case 22: goto L_0x01c7;
                case 23: goto L_0x01a1;
                case 24: goto L_0x019e;
                case 25: goto L_0x0195;
                case 26: goto L_0x0192;
                case 27: goto L_0x0177;
                default: goto L_0x016f;
            }
        L_0x016f:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x0177:
            byte[] r1 = new byte[r4]
            byte[] r2 = r0.f25772h
            byte r4 = r2[r8]
            r1[r8] = r4
            byte r4 = r2[r7]
            r1[r7] = r4
            byte r4 = r2[r6]
            r1[r6] = r4
            byte r2 = r2[r9]
            r1[r9] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r12 = r13
            goto L_0x02e3
        L_0x0192:
            r12 = r14
            goto L_0x02e1
        L_0x0195:
            byte[] r1 = r0.f25772h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r12 = r15
            goto L_0x02e3
        L_0x019e:
            r12 = r3
            goto L_0x02e1
        L_0x01a1:
            int r1 = r0.f25756H
            int r1 = com.google.android.gms.internal.ads.zzbar.m42992h(r1)
            if (r1 != 0) goto L_0x01c1
            int r1 = r0.f25756H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r10, r1)
            goto L_0x01f9
        L_0x01c1:
            r27 = r1
            r1 = r19
            goto L_0x02e5
        L_0x01c7:
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak
            byte[] r4 = r0.f25772h
            r1.<init>((byte[]) r4)
            boolean r1 = m42600e(r1)
            if (r1 == 0) goto L_0x01f4
            int r1 = r0.f25756H
            int r1 = com.google.android.gms.internal.ads.zzbar.m42992h(r1)
            if (r1 != 0) goto L_0x01c1
            int r1 = r0.f25756H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r10, r1)
            goto L_0x01f9
        L_0x01f4:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            android.util.Log.w(r10, r1)
        L_0x01f9:
            r12 = r18
            goto L_0x02e1
        L_0x01fd:
            byte[] r1 = r0.f25772h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r12 = "audio/x-flac"
            goto L_0x02e3
        L_0x0207:
            java.lang.String r12 = "audio/vnd.dts.hd"
            goto L_0x02e1
        L_0x020b:
            java.lang.String r12 = "audio/vnd.dts"
            goto L_0x02e1
        L_0x020f:
            java.lang.String r12 = "audio/true-hd"
            goto L_0x02e1
        L_0x0213:
            java.lang.String r12 = "audio/eac3"
            goto L_0x02e1
        L_0x0217:
            java.lang.String r12 = "audio/ac3"
            goto L_0x02e1
        L_0x021b:
            java.lang.String r12 = "audio/mpeg"
            goto L_0x0220
        L_0x021e:
            java.lang.String r12 = "audio/mpeg-L2"
        L_0x0220:
            r1 = r19
            r27 = -1
            r32 = 4096(0x1000, float:5.74E-42)
            goto L_0x02e7
        L_0x0228:
            byte[] r1 = r0.f25772h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r12 = "audio/mp4a-latm"
            goto L_0x02e3
        L_0x0232:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            byte[] r2 = r0.f25772h
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r10 = r0.f25758J
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r4 = r0.f25759K
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r12 = "audio/opus"
            r27 = -1
            r32 = 5760(0x1680, float:8.071E-42)
            goto L_0x02e7
        L_0x0278:
            byte[] r1 = r0.f25772h
            java.util.List r1 = m42599d(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r12 = "audio/vorbis"
            r27 = -1
            r32 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02e7
        L_0x0287:
            r12 = r17
            goto L_0x02e1
        L_0x028a:
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak
            byte[] r2 = r0.f25772h
            r1.<init>((byte[]) r2)
            java.util.List r1 = m42598c(r1)
            if (r1 == 0) goto L_0x029a
            java.lang.String r12 = "video/wvc1"
            goto L_0x02e3
        L_0x029a:
            java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r10, r2)
            r12 = r17
            goto L_0x02e3
        L_0x02a2:
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak
            byte[] r2 = r0.f25772h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzbay r1 = com.google.android.gms.internal.ads.zzbay.m43008a(r1)
            java.util.List r2 = r1.f26444a
            int r1 = r1.f26445b
            r0.f25764P = r1
            java.lang.String r12 = "video/hevc"
            goto L_0x02c9
        L_0x02b6:
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak
            byte[] r2 = r0.f25772h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzbas r1 = com.google.android.gms.internal.ads.zzbas.m43002a(r1)
            java.util.List r2 = r1.f26426a
            int r1 = r1.f26427b
            r0.f25764P = r1
            java.lang.String r12 = "video/avc"
        L_0x02c9:
            r1 = r2
            goto L_0x02e3
        L_0x02cb:
            byte[] r1 = r0.f25772h
            if (r1 != 0) goto L_0x02d2
            r1 = r19
            goto L_0x02d6
        L_0x02d2:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02d6:
            java.lang.String r12 = "video/mp4v-es"
            goto L_0x02e3
        L_0x02d9:
            java.lang.String r12 = "video/mpeg2"
            goto L_0x02e1
        L_0x02dc:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            goto L_0x02e1
        L_0x02df:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
        L_0x02e1:
            r1 = r19
        L_0x02e3:
            r27 = -1
        L_0x02e5:
            r32 = -1
        L_0x02e7:
            boolean r2 = r0.f25761M
            boolean r4 = r0.f25760L
            if (r7 == r4) goto L_0x02ef
            r4 = 0
            goto L_0x02f0
        L_0x02ef:
            r4 = 2
        L_0x02f0:
            r2 = r2 | r4
            boolean r4 = com.google.android.gms.internal.ads.zzbah.m42941a(r12)
            if (r4 == 0) goto L_0x0324
            java.lang.String r20 = java.lang.Integer.toString(r45)
            r22 = 0
            r23 = -1
            int r3 = r0.f25755G
            int r4 = r0.f25757I
            r28 = -1
            r29 = -1
            com.google.android.gms.internal.ads.zzauv r5 = r0.f25773i
            java.lang.String r6 = r0.f25762N
            r34 = 0
            r21 = r12
            r24 = r32
            r25 = r3
            r26 = r4
            r30 = r1
            r31 = r5
            r32 = r2
            r33 = r6
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42371h(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 1
            goto L_0x04b4
        L_0x0324:
            boolean r4 = com.google.android.gms.internal.ads.zzbah.m42942b(r12)
            if (r4 == 0) goto L_0x0455
            int r2 = r0.f25778n
            if (r2 != 0) goto L_0x0340
            int r2 = r0.f25776l
            r3 = -1
            if (r2 != r3) goto L_0x0335
            int r2 = r0.f25774j
        L_0x0335:
            r0.f25776l = r2
            int r2 = r0.f25777m
            if (r2 != r3) goto L_0x033d
            int r2 = r0.f25775k
        L_0x033d:
            r0.f25777m = r2
            goto L_0x0341
        L_0x0340:
            r3 = -1
        L_0x0341:
            int r2 = r0.f25776l
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r3) goto L_0x0359
            int r5 = r0.f25777m
            if (r5 == r3) goto L_0x0359
            int r3 = r0.f25775k
            int r3 = r3 * r2
            float r2 = (float) r3
            int r3 = r0.f25774j
            int r3 = r3 * r5
            float r3 = (float) r3
            float r2 = r2 / r3
            r38 = r2
            goto L_0x035b
        L_0x0359:
            r38 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x035b:
            boolean r2 = r0.f25781q
            if (r2 == 0) goto L_0x042a
            float r2 = r0.f25787w
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25788x
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25789y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25790z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25749A
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25750B
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25751C
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25752D
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25753E
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x041a
            float r2 = r0.f25754F
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x039d
            goto L_0x041a
        L_0x039d:
            r2 = 25
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)
            r3.put(r8)
            float r4 = r0.f25787w
            r5 = 1195593728(0x47435000, float:50000.0)
            float r4 = r4 * r5
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25788x
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25789y
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25790z
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25749A
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25750B
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25751C
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25752D
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25753E
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f25754F
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            int r4 = r0.f25785u
            short r4 = (short) r4
            r3.putShort(r4)
            int r4 = r0.f25786v
            short r4 = (short) r4
            r3.putShort(r4)
            goto L_0x041c
        L_0x041a:
            r2 = r19
        L_0x041c:
            com.google.android.gms.internal.ads.zzbau r3 = new com.google.android.gms.internal.ads.zzbau
            int r4 = r0.f25782r
            int r5 = r0.f25784t
            int r7 = r0.f25783s
            r3.<init>(r4, r5, r7, r2)
            r41 = r3
            goto L_0x042c
        L_0x042a:
            r41 = r19
        L_0x042c:
            java.lang.String r28 = java.lang.Integer.toString(r45)
            r30 = 0
            r31 = -1
            int r2 = r0.f25774j
            int r3 = r0.f25775k
            r35 = -1082130432(0xffffffffbf800000, float:-1.0)
            r37 = -1
            byte[] r4 = r0.f25779o
            int r5 = r0.f25780p
            com.google.android.gms.internal.ads.zzauv r7 = r0.f25773i
            r29 = r12
            r33 = r2
            r34 = r3
            r36 = r1
            r39 = r4
            r40 = r5
            r42 = r7
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42375l(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x04b4
        L_0x0455:
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0480
            java.lang.String r28 = java.lang.Integer.toString(r45)
            r30 = 0
            r31 = -1
            java.lang.String r1 = r0.f25762N
            r34 = -1
            com.google.android.gms.internal.ads.zzauv r3 = r0.f25773i
            r36 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r38 = java.util.Collections.emptyList()
            r29 = r12
            r32 = r2
            r33 = r1
            r35 = r3
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42374k(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
        L_0x047e:
            r6 = 3
            goto L_0x04b4
        L_0x0480:
            boolean r2 = r15.equals(r12)
            if (r2 != 0) goto L_0x049b
            boolean r2 = r14.equals(r12)
            if (r2 != 0) goto L_0x049b
            boolean r2 = r13.equals(r12)
            if (r2 == 0) goto L_0x0493
            goto L_0x049b
        L_0x0493:
            com.google.android.gms.internal.ads.zzasz r1 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x049b:
            java.lang.String r20 = java.lang.Integer.toString(r45)
            r22 = 0
            r23 = -1
            java.lang.String r2 = r0.f25762N
            com.google.android.gms.internal.ads.zzauv r3 = r0.f25773i
            r21 = r12
            r24 = r1
            r25 = r2
            r26 = r3
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42372i(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x047e
        L_0x04b4:
            int r2 = r0.f25766b
            r3 = r44
            com.google.android.gms.internal.ads.zzavi r2 = r3.mo42107h(r2, r6)
            r0.f25763O = r2
            r2.mo42117d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavq.mo42121b(com.google.android.gms.internal.ads.zzava, int):void");
    }
}
