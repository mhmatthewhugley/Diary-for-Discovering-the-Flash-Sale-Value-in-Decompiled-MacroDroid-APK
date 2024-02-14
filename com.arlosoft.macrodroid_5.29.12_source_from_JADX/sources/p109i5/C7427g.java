package p109i5;

import com.android.p023dx.p026io.Opcodes;
import com.fasterxml.jackson.core.C6802e;
import com.fasterxml.jackson.core.C6805g;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p072io.C6809b;
import com.fasterxml.jackson.core.p072io.C6811d;
import java.io.IOException;
import java.io.InputStream;
import p103h5.C7389b;
import p115j5.C7457a;
import p115j5.C7465f;

/* renamed from: i5.g */
/* compiled from: UTF8StreamJsonParser */
public final class C7427g extends C7389b {

    /* renamed from: j0 */
    private static final int[] f18166j0 = C6809b.m25594i();

    /* renamed from: k0 */
    private static final int[] f18167k0 = C6809b.m25592g();

    /* renamed from: c0 */
    protected final C7457a f18168c0;

    /* renamed from: d0 */
    protected int[] f18169d0 = new int[16];

    /* renamed from: e0 */
    protected boolean f18170e0 = false;

    /* renamed from: f0 */
    private int f18171f0;

    /* renamed from: g0 */
    protected InputStream f18172g0;

    /* renamed from: h0 */
    protected byte[] f18173h0;

    /* renamed from: i0 */
    protected boolean f18174i0;

    /* renamed from: i5.g$a */
    /* compiled from: UTF8StreamJsonParser */
    static /* synthetic */ class C7428a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18175a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.g[] r0 = com.fasterxml.jackson.core.C6805g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18175a = r0
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18175a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18175a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18175a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18175a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18175a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p109i5.C7427g.C7428a.<clinit>():void");
        }
    }

    public C7427g(C6811d dVar, int i, InputStream inputStream, C6806h hVar, C7457a aVar, byte[] bArr, int i2, int i3, boolean z) {
        super(dVar, i);
        this.f18172g0 = inputStream;
        this.f18168c0 = aVar;
        this.f18173h0 = bArr;
        this.f18085g = i2;
        this.f18086o = i3;
        this.f18174i0 = z;
    }

    /* renamed from: A0 */
    private int m30733A0(int i) throws IOException, JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.f18173h0;
        int i3 = this.f18085g;
        int i4 = i3 + 1;
        this.f18085g = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i4);
        }
        byte b2 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.f18173h0;
        int i5 = this.f18085g;
        int i6 = i5 + 1;
        this.f18085g = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            mo37533h1(b3 & 255, i6);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: B0 */
    private int m30734B0(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i3);
        }
        byte b2 = ((i & 7) << 6) | (b & 63);
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr2 = this.f18173h0;
        int i4 = this.f18085g;
        int i5 = i4 + 1;
        this.f18085g = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            mo37533h1(b3 & 255, i5);
        }
        byte b4 = (b2 << 6) | (b3 & 63);
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr3 = this.f18173h0;
        int i6 = this.f18085g;
        int i7 = i6 + 1;
        this.f18085g = i7;
        byte b5 = bArr3[i6];
        if ((b5 & 192) != 128) {
            mo37533h1(b5 & 255, i7);
        }
        return ((b4 << 6) | (b5 & 63)) - 65536;
    }

    /* renamed from: D0 */
    private void m30735D0(char[] cArr, int i) throws IOException, JsonParseException {
        int[] iArr = f18166j0;
        byte[] bArr = this.f18173h0;
        while (true) {
            int i2 = this.f18085g;
            if (i2 >= this.f18086o) {
                mo37402f0();
                i2 = this.f18085g;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.f18068F.mo33966m();
                i = 0;
            }
            int min = Math.min(this.f18086o, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.f18085g = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (iArr[i5] != 0) {
                    this.f18085g = i4;
                    if (i5 == 34) {
                        this.f18068F.mo33977w(i);
                        return;
                    }
                    int i6 = iArr[i5];
                    if (i6 == 1) {
                        i5 = mo37539x0();
                    } else if (i6 == 2) {
                        i5 = m30756y0(i5);
                    } else if (i6 == 3) {
                        i5 = this.f18086o - i4 >= 2 ? m30733A0(i5) : m30757z0(i5);
                    } else if (i6 == 4) {
                        int B0 = m30734B0(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) (55296 | (B0 >> 10));
                        if (i7 >= cArr.length) {
                            cArr = this.f18068F.mo33966m();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (B0 & 1023) | 56320;
                    } else if (i5 < 32) {
                        mo37420I(i5, "string value");
                    } else {
                        mo37530e1(i5);
                    }
                    if (i >= cArr.length) {
                        cArr = this.f18068F.mo33966m();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    /* renamed from: D1 */
    private int m30736D1() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                byte[] bArr = this.f18173h0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b != 47) {
                        return b;
                    }
                    m30751n1();
                } else if (b != 32) {
                    if (b == 10) {
                        mo37536q1();
                    } else if (b == 13) {
                        mo37535l1();
                    } else if (b != 9) {
                        mo37419H(b);
                    }
                }
            } else {
                mo37411z();
                return -1;
            }
        }
    }

    /* renamed from: E1 */
    private int m30737E1() throws IOException, JsonParseException {
        byte b;
        if ((this.f18085g >= this.f18086o && !mo37401e0()) || (b = this.f18173h0[this.f18085g] & 255) < 48 || b > 57) {
            return 48;
        }
        if (!mo33873u(C6802e.C6803a.ALLOW_NUMERIC_LEADING_ZEROS)) {
            mo37403h0("Leading zeroes not allowed");
        }
        this.f18085g++;
        if (b == 48) {
            do {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    break;
                }
                byte[] bArr = this.f18173h0;
                int i = this.f18085g;
                b = bArr[i] & 255;
                if (b < 48 || b > 57) {
                    return 48;
                }
                this.f18085g = i + 1;
            } while (b == 48);
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p115j5.C7465f m30738F1(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            com.fasterxml.jackson.core.util.e r8 = r0.f18068F
            char[] r8 = r8.mo33964i()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00f2
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00df
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
        L_0x0042:
            r13 = 1
            goto L_0x005d
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x005d
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x0058
            r12 = r12 & 7
            r13 = 3
            goto L_0x005d
        L_0x0058:
            r0.mo37531f1(r12)
            r12 = 1
            goto L_0x0042
        L_0x005d:
            int r14 = r10 + r13
            if (r14 <= r4) goto L_0x0066
            java.lang.String r14 = " in field name"
            r0.mo37415D(r14)
        L_0x0066:
            int r14 = r10 >> 2
            r14 = r1[r14]
            r16 = r10 & 3
            int r16 = 3 - r16
            int r16 = r16 << 3
            int r14 = r14 >> r16
            int r10 = r10 + 1
            r6 = r14 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r6 == r15) goto L_0x007d
            r0.mo37532g1(r14)
        L_0x007d:
            int r6 = r12 << 6
            r12 = r14 & 63
            r6 = r6 | r12
            if (r13 <= r5) goto L_0x00bb
            int r5 = r10 >> 2
            r5 = r1[r5]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r5 = r5 >> r12
            int r10 = r10 + 1
            r12 = r5 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x0097
            r0.mo37532g1(r5)
        L_0x0097:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r13 <= r6) goto L_0x00b9
            int r6 = r10 >> 2
            r6 = r1[r6]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r6 = r6 >> r12
            int r10 = r10 + 1
            r12 = r6 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x00b4
            r12 = r6 & 255(0xff, float:3.57E-43)
            r0.mo37532g1(r12)
        L_0x00b4:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
        L_0x00b9:
            r12 = r5
            goto L_0x00bc
        L_0x00bb:
            r12 = r6
        L_0x00bc:
            r5 = 2
            if (r13 <= r5) goto L_0x00df
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00cc
            com.fasterxml.jackson.core.util.e r5 = r0.f18068F
            char[] r5 = r5.mo33965k()
            r8 = r5
        L_0x00cc:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
        L_0x00df:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00e9
            com.fasterxml.jackson.core.util.e r5 = r0.f18068F
            char[] r5 = r5.mo33965k()
            r8 = r5
        L_0x00e9:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00f2:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x00ff
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x00ff:
            j5.a r3 = r0.f18168c0
            j5.f r1 = r3.mo37586b(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7427g.m30738F1(int[], int, int):j5.f");
    }

    /* renamed from: H1 */
    private C7465f m30739H1(int i, int i2) throws JsonParseException {
        C7465f k = this.f18168c0.mo37590k(i);
        if (k != null) {
            return k;
        }
        int[] iArr = this.f18169d0;
        iArr[0] = i;
        return m30738F1(iArr, 1, i2);
    }

    /* renamed from: I1 */
    private C7465f m30740I1(int i, int i2, int i3) throws JsonParseException {
        C7465f l = this.f18168c0.mo37591l(i, i2);
        if (l != null) {
            return l;
        }
        int[] iArr = this.f18169d0;
        iArr[0] = i;
        iArr[1] = i2;
        return m30738F1(iArr, 2, i3);
    }

    /* renamed from: J1 */
    private C7465f m30741J1(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = m30742K1(iArr, iArr.length);
            this.f18169d0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = i2;
        C7465f m = this.f18168c0.mo37592m(iArr, i4);
        return m == null ? m30738F1(iArr, i4, i3) : m;
    }

    /* renamed from: K1 */
    public static int[] m30742K1(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        int[] iArr2 = new int[(i + length)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: N1 */
    private int m30743N1() throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: Q1 */
    private C7465f m30744Q1(int i, int i2, int i3) throws IOException, JsonParseException {
        return mo37522P1(this.f18169d0, 0, i, i2, i3);
    }

    /* renamed from: T1 */
    private C7465f m30745T1(int i, int i2, int i3, int i4) throws IOException, JsonParseException {
        int[] iArr = this.f18169d0;
        iArr[0] = i;
        return mo37522P1(iArr, 1, i2, i3, i4);
    }

    /* renamed from: U0 */
    private C6805g m30746U0() {
        this.f18070H = false;
        C6805g gVar = this.f18067E;
        this.f18067E = null;
        if (gVar == C6805g.START_ARRAY) {
            this.f18066D = this.f18066D.mo37475g(this.f18064B, this.f18065C);
        } else if (gVar == C6805g.START_OBJECT) {
            this.f18066D = this.f18066D.mo37476h(this.f18064B, this.f18065C);
        }
        this.f18090c = gVar;
        return gVar;
    }

    /* renamed from: V0 */
    private C6805g m30747V0(int i) throws IOException, JsonParseException {
        if (i == 34) {
            this.f18170e0 = true;
            C6805g gVar = C6805g.VALUE_STRING;
            this.f18090c = gVar;
            return gVar;
        }
        if (i != 45) {
            if (i != 91) {
                if (i != 93) {
                    if (i == 102) {
                        mo37523R0("false", 1);
                        C6805g gVar2 = C6805g.VALUE_FALSE;
                        this.f18090c = gVar2;
                        return gVar2;
                    } else if (i != 110) {
                        if (i != 116) {
                            if (i == 123) {
                                this.f18066D = this.f18066D.mo37476h(this.f18064B, this.f18065C);
                                C6805g gVar3 = C6805g.START_OBJECT;
                                this.f18090c = gVar3;
                                return gVar3;
                            } else if (i != 125) {
                                switch (i) {
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        break;
                                    default:
                                        C6805g K0 = mo37520K0(i);
                                        this.f18090c = K0;
                                        return K0;
                                }
                            }
                        }
                        mo37523R0("true", 1);
                        C6805g gVar4 = C6805g.VALUE_TRUE;
                        this.f18090c = gVar4;
                        return gVar4;
                    } else {
                        mo37523R0("null", 1);
                        C6805g gVar5 = C6805g.VALUE_NULL;
                        this.f18090c = gVar5;
                        return gVar5;
                    }
                }
                mo37417F(i, "expected a value");
                mo37523R0("true", 1);
                C6805g gVar42 = C6805g.VALUE_TRUE;
                this.f18090c = gVar42;
                return gVar42;
            }
            this.f18066D = this.f18066D.mo37475g(this.f18064B, this.f18065C);
            C6805g gVar6 = C6805g.START_ARRAY;
            this.f18090c = gVar6;
            return gVar6;
        }
        C6805g X1 = mo37526X1(i);
        this.f18090c = X1;
        return X1;
    }

    /* renamed from: c1 */
    private C6805g m30748c1(char[] cArr, int i, int i2, boolean z, int i3) throws IOException, JsonParseException {
        boolean z2;
        int i4;
        int i5 = 0;
        if (i2 == 46) {
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.f18173h0;
                int i6 = this.f18085g;
                this.f18085g = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = this.f18068F.mo33966m();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            if (i4 == 0) {
                mo37406l0(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.f18068F.mo33966m();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.f18085g >= this.f18086o) {
                mo37402f0();
            }
            byte[] bArr2 = this.f18173h0;
            int i8 = this.f18085g;
            this.f18085g = i8 + 1;
            byte b = bArr2[i8] & 255;
            if (b == 45 || b == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.f18068F.mo33966m();
                    i7 = 0;
                }
                int i9 = i7 + 1;
                cArr[i7] = (char) b;
                if (this.f18085g >= this.f18086o) {
                    mo37402f0();
                }
                byte[] bArr3 = this.f18173h0;
                int i10 = this.f18085g;
                this.f18085g = i10 + 1;
                b = bArr3[i10] & 255;
                i7 = i9;
            }
            int i11 = 0;
            while (true) {
                if (b <= 57 && b >= 48) {
                    i11++;
                    if (i7 >= cArr.length) {
                        cArr = this.f18068F.mo33966m();
                        i7 = 0;
                    }
                    int i12 = i7 + 1;
                    cArr[i7] = (char) b;
                    if (this.f18085g >= this.f18086o && !mo37401e0()) {
                        i5 = i11;
                        i7 = i12;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this.f18173h0;
                    int i13 = this.f18085g;
                    this.f18085g = i13 + 1;
                    b = bArr4[i13] & 255;
                    i7 = i12;
                } else {
                    i5 = i11;
                }
            }
            i5 = i11;
            if (i5 == 0) {
                mo37406l0(b, "Exponent indicator not followed by a digit");
            }
            i = i7;
        }
        if (!z2) {
            this.f18085g--;
        }
        this.f18068F.mo33977w(i);
        return mo37409q0(z, i3, i4, i5);
    }

    /* renamed from: d1 */
    private C6805g m30749d1(char[] cArr, int i, boolean z, int i2) throws IOException, JsonParseException {
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                byte[] bArr = this.f18173h0;
                int i6 = this.f18085g;
                i3 = i6 + 1;
                this.f18085g = i3;
                b = bArr[i6] & 255;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = this.f18068F.mo33966m();
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                this.f18068F.mo33977w(i4);
                return mo37410t0(z, i5);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return m30748c1(cArr2, i4, b, z, i5);
        }
        this.f18085g = i3 - 1;
        this.f18068F.mo33977w(i4);
        return mo37410t0(z, i5);
    }

    /* renamed from: k1 */
    private void m30750k1() throws IOException, JsonParseException {
        int[] f = C6809b.m25591f();
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                break;
            }
            byte[] bArr = this.f18173h0;
            int i = this.f18085g;
            int i2 = i + 1;
            this.f18085g = i2;
            byte b = bArr[i] & 255;
            int i3 = f[b];
            if (i3 != 0) {
                if (i3 == 2) {
                    m30753t1(b);
                } else if (i3 == 3) {
                    m30754u1(b);
                } else if (i3 == 4) {
                    m30755w1(b);
                } else if (i3 == 10) {
                    mo37536q1();
                } else if (i3 != 13) {
                    if (i3 == 42) {
                        if (i2 >= this.f18086o && !mo37401e0()) {
                            break;
                        }
                        byte[] bArr2 = this.f18173h0;
                        int i4 = this.f18085g;
                        if (bArr2[i4] == 47) {
                            this.f18085g = i4 + 1;
                            return;
                        }
                    } else {
                        mo37530e1(b);
                    }
                } else {
                    mo37535l1();
                }
            }
        }
        mo37415D(" in a comment");
    }

    /* renamed from: n1 */
    private void m30751n1() throws IOException, JsonParseException {
        if (!mo33873u(C6802e.C6803a.ALLOW_COMMENTS)) {
            mo37417F(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(" in a comment");
        }
        byte[] bArr = this.f18173h0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        byte b = bArr[i] & 255;
        if (b == 47) {
            m30752o1();
        } else if (b == 42) {
            m30750k1();
        } else {
            mo37417F(b, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: o1 */
    private void m30752o1() throws IOException, JsonParseException {
        int[] f = C6809b.m25591f();
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                byte[] bArr = this.f18173h0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                byte b = bArr[i] & 255;
                int i2 = f[b];
                if (i2 != 0) {
                    if (i2 == 2) {
                        m30753t1(b);
                    } else if (i2 == 3) {
                        m30754u1(b);
                    } else if (i2 == 4) {
                        m30755w1(b);
                    } else if (i2 == 10) {
                        mo37536q1();
                        return;
                    } else if (i2 == 13) {
                        mo37535l1();
                        return;
                    } else if (i2 != 42) {
                        mo37530e1(b);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: t1 */
    private void m30753t1(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i3);
        }
    }

    /* renamed from: u1 */
    private void m30754u1(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i3);
        }
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr2 = this.f18173h0;
        int i4 = this.f18085g;
        int i5 = i4 + 1;
        this.f18085g = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            mo37533h1(b2 & 255, i5);
        }
    }

    /* renamed from: w1 */
    private void m30755w1(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i3);
        }
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr2 = this.f18173h0;
        int i4 = this.f18085g;
        int i5 = i4 + 1;
        this.f18085g = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            mo37533h1(b2 & 255, i5);
        }
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr3 = this.f18173h0;
        int i6 = this.f18085g;
        int i7 = i6 + 1;
        this.f18085g = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            mo37533h1(b3 & 255, i7);
        }
    }

    /* renamed from: y0 */
    private int m30756y0(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    /* renamed from: z0 */
    private int m30757z0(int i) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        int i2 = i & 15;
        byte[] bArr = this.f18173h0;
        int i3 = this.f18085g;
        int i4 = i3 + 1;
        this.f18085g = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo37533h1(b & 255, i4);
        }
        byte b2 = (i2 << 6) | (b & 63);
        if (this.f18085g >= this.f18086o) {
            mo37402f0();
        }
        byte[] bArr2 = this.f18173h0;
        int i5 = this.f18085g;
        int i6 = i5 + 1;
        this.f18085g = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            mo37533h1(b3 & 255, i6);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: z1 */
    private int m30758z1() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                byte[] bArr = this.f18173h0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b != 47) {
                        return b;
                    }
                    m30751n1();
                } else if (b != 32) {
                    if (b == 10) {
                        mo37536q1();
                    } else if (b == 13) {
                        mo37535l1();
                    } else if (b != 9) {
                        mo37419H(b);
                    }
                }
            } else {
                throw mo33859b("Unexpected end-of-input within/between " + this.f18066D.mo33880c() + " entries");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public void mo37516C0() throws IOException, JsonParseException {
        int i = this.f18085g;
        if (i >= this.f18086o) {
            mo37402f0();
            i = this.f18085g;
        }
        int i2 = 0;
        char[] i3 = this.f18068F.mo33964i();
        int[] iArr = f18166j0;
        int min = Math.min(this.f18086o, i3.length + i);
        byte[] bArr = this.f18173h0;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                i3[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.f18085g = i + 1;
                this.f18068F.mo33977w(i2);
                return;
            }
        }
        this.f18085g = i;
        m30735D0(i3, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public String mo37517E0(C6805g gVar) {
        if (gVar == null) {
            return null;
        }
        int i = C7428a.f18175a[gVar.ordinal()];
        if (i == 1) {
            return this.f18066D.mo37478k();
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.f18068F.mo33963h();
        }
        return gVar.mo33884b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public C6805g mo37518G0() throws IOException, JsonParseException {
        char[] i = this.f18068F.mo33964i();
        int[] iArr = f18166j0;
        byte[] bArr = this.f18173h0;
        int i2 = 0;
        while (true) {
            if (this.f18085g >= this.f18086o) {
                mo37402f0();
            }
            if (i2 >= i.length) {
                i = this.f18068F.mo33966m();
                i2 = 0;
            }
            int i3 = this.f18086o;
            int length = this.f18085g + (i.length - i2);
            if (length < i3) {
                i3 = length;
            }
            while (true) {
                int i4 = this.f18085g;
                if (i4 >= i3) {
                    break;
                }
                int i5 = i4 + 1;
                this.f18085g = i5;
                int i6 = bArr[i4] & 255;
                if (i6 != 39 && iArr[i6] == 0) {
                    i[i2] = (char) i6;
                    i2++;
                } else if (i6 == 39) {
                    this.f18068F.mo33977w(i2);
                    return C6805g.VALUE_STRING;
                } else {
                    int i7 = iArr[i6];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            i6 = m30756y0(i6);
                        } else if (i7 == 3) {
                            i6 = this.f18086o - i5 >= 2 ? m30733A0(i6) : m30757z0(i6);
                        } else if (i7 != 4) {
                            if (i6 < 32) {
                                mo37420I(i6, "string value");
                            }
                            mo37530e1(i6);
                        } else {
                            int B0 = m30734B0(i6);
                            int i8 = i2 + 1;
                            i[i2] = (char) (55296 | (B0 >> 10));
                            if (i8 >= i.length) {
                                i = this.f18068F.mo33966m();
                                i2 = 0;
                            } else {
                                i2 = i8;
                            }
                            i6 = 56320 | (B0 & 1023);
                        }
                    } else if (i6 != 34) {
                        i6 = mo37539x0();
                    }
                    if (i2 >= i.length) {
                        i = this.f18068F.mo33966m();
                        i2 = 0;
                    }
                    i[i2] = (char) i6;
                    i2++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r9v0 ?, r9v1 ?, r9v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: I0 */
    protected com.fasterxml.jackson.core.C6805g mo37519I0(
/*
Method generation error in method: i5.g.I0(int, boolean):com.fasterxml.jackson.core.g, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo37392K() throws IOException {
        if (this.f18172g0 != null) {
            if (this.f18083d.mo33907h() || mo33873u(C6802e.C6803a.AUTO_CLOSE_SOURCE)) {
                this.f18172g0.close();
            }
            this.f18172g0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public C6805g mo37520K0(int i) throws IOException, JsonParseException {
        if (i != 39) {
            if (i == 43) {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    mo37416E();
                }
                byte[] bArr = this.f18173h0;
                int i2 = this.f18085g;
                this.f18085g = i2 + 1;
                return mo37519I0(bArr[i2] & 255, false);
            } else if (i == 78) {
                mo37523R0("NaN", 1);
                if (mo33873u(C6802e.C6803a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return mo37408p0("NaN", Double.NaN);
                }
                mo37413B("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        } else if (mo33873u(C6802e.C6803a.ALLOW_SINGLE_QUOTES)) {
            return mo37518G0();
        }
        mo37417F(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public C7465f mo37521N0(int i) throws IOException, JsonParseException {
        if (i == 39 && mo33873u(C6802e.C6803a.ALLOW_SINGLE_QUOTES)) {
            return mo37527Y0();
        }
        if (!mo33873u(C6802e.C6803a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            mo37417F(i, "was expecting double-quote to start field name");
        }
        int[] j = C6809b.m25595j();
        if (j[i] != 0) {
            mo37417F(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f18169d0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = m30742K1(iArr, iArr.length);
                    this.f18169d0 = iArr;
                }
                iArr[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in field name");
            }
            byte[] bArr = this.f18173h0;
            int i5 = this.f18085g;
            i = bArr[i5] & 255;
            if (j[i] != 0) {
                break;
            }
            this.f18085g = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] K1 = m30742K1(iArr, iArr.length);
                this.f18169d0 = K1;
                iArr = K1;
            }
            iArr[i3] = i4;
            i3++;
        }
        C7465f m = this.f18168c0.mo37592m(iArr, i3);
        return m == null ? m30738F1(iArr, i3, i2) : m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo37394O() throws IOException {
        byte[] bArr;
        super.mo37394O();
        if (this.f18174i0 && (bArr = this.f18173h0) != null) {
            this.f18173h0 = null;
            this.f18083d.mo33910k(bArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public C7465f mo37522P1(int[] iArr, int i, int i2, int i3, int i4) throws IOException, JsonParseException {
        int[] iArr2 = f18167k0;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    mo37420I(i3, "name");
                } else {
                    i3 = mo37539x0();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = m30742K1(iArr, iArr.length);
                            this.f18169d0 = iArr;
                        }
                        iArr[i] = r8;
                        i++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i6 = (r8 << 8) | (i3 >> 12) | Opcodes.SHL_INT_LIT8;
                        int i7 = r10 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = m30742K1(iArr, iArr.length);
                                this.f18169d0 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        r8 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = m30742K1(iArr, iArr.length);
                    this.f18169d0 = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in field name");
            }
            byte[] bArr = this.f18173h0;
            int i8 = this.f18085g;
            this.f18085g = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (r10 > 0) {
            if (i >= iArr.length) {
                iArr = m30742K1(iArr, iArr.length);
                this.f18169d0 = iArr;
            }
            iArr[i] = r8;
            i++;
        }
        C7465f m = this.f18168c0.mo37592m(iArr, i);
        return m == null ? m30738F1(iArr, i, r10) : m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37523R0(String str, int i) throws IOException, JsonParseException {
        int i2;
        byte b;
        int length = str.length();
        do {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in a value");
            }
            if (this.f18173h0[this.f18085g] != str.charAt(i)) {
                mo37534j1(str.substring(0, i), "'null', 'true', 'false' or NaN");
            }
            i2 = this.f18085g + 1;
            this.f18085g = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f18086o || mo37401e0()) && (b = this.f18173h0[this.f18085g] & 255) >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) mo37538w0(b))) {
            this.f18085g++;
            mo37534j1(str.substring(0, i), "'null', 'true', 'false' or NaN");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public C7465f mo37524V1(int i) throws IOException, JsonParseException {
        int[] iArr = f18167k0;
        int i2 = 2;
        while (true) {
            int i3 = this.f18086o;
            int i4 = this.f18085g;
            if (i3 - i4 < 4) {
                return mo37522P1(this.f18169d0, i2, 0, i, 0);
            }
            byte[] bArr = this.f18173h0;
            int i5 = i4 + 1;
            this.f18085g = i5;
            byte b = bArr[i4] & 255;
            if (iArr[b] == 0) {
                byte b2 = (i << 8) | b;
                int i6 = i5 + 1;
                this.f18085g = i6;
                byte b3 = bArr[i5] & 255;
                if (iArr[b3] == 0) {
                    byte b4 = (b2 << 8) | b3;
                    int i7 = i6 + 1;
                    this.f18085g = i7;
                    byte b5 = bArr[i6] & 255;
                    if (iArr[b5] == 0) {
                        int i8 = (b4 << 8) | b5;
                        this.f18085g = i7 + 1;
                        byte b6 = bArr[i7] & 255;
                        if (iArr[b6] == 0) {
                            int[] iArr2 = this.f18169d0;
                            if (i2 >= iArr2.length) {
                                this.f18169d0 = m30742K1(iArr2, i2);
                            }
                            this.f18169d0[i2] = i8;
                            i2++;
                            i = b6;
                        } else if (b6 == 34) {
                            return m30741J1(this.f18169d0, i2, i8, 4);
                        } else {
                            return mo37522P1(this.f18169d0, i2, i8, b6, 4);
                        }
                    } else if (b5 == 34) {
                        return m30741J1(this.f18169d0, i2, b4, 3);
                    } else {
                        return mo37522P1(this.f18169d0, i2, b4, b5, 3);
                    }
                } else if (b3 == 34) {
                    return m30741J1(this.f18169d0, i2, b2, 2);
                } else {
                    return mo37522P1(this.f18169d0, i2, b2, b3, 2);
                }
            } else if (b == 34) {
                return m30741J1(this.f18169d0, i2, i, 1);
            } else {
                return mo37522P1(this.f18169d0, i2, i, b, 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public C7465f mo37525W1(int i, int[] iArr) throws IOException, JsonParseException {
        byte[] bArr = this.f18173h0;
        int i2 = this.f18085g;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i4 = i3 + 1;
            this.f18085g = i4;
            byte b3 = bArr[i3] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i5 = i4 + 1;
                this.f18085g = i5;
                byte b5 = bArr[i4] & 255;
                if (iArr[b5] == 0) {
                    int i6 = (b4 << 8) | b5;
                    this.f18085g = i5 + 1;
                    byte b6 = bArr[i5] & 255;
                    if (iArr[b6] == 0) {
                        int[] iArr2 = this.f18169d0;
                        iArr2[0] = this.f18171f0;
                        iArr2[1] = i6;
                        return mo37524V1(b6);
                    } else if (b6 == 34) {
                        return m30740I1(this.f18171f0, i6, 4);
                    } else {
                        return m30745T1(this.f18171f0, i6, b6, 4);
                    }
                } else if (b5 == 34) {
                    return m30740I1(this.f18171f0, b4, 3);
                } else {
                    return m30745T1(this.f18171f0, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return m30740I1(this.f18171f0, b2, 2);
            } else {
                return m30745T1(this.f18171f0, b2, b3, 2);
            }
        } else if (b == 34) {
            return m30740I1(this.f18171f0, i, 1);
        } else {
            return m30745T1(this.f18171f0, i, b, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public C6805g mo37526X1(int i) throws IOException, JsonParseException {
        int i2;
        byte b;
        char[] i3 = this.f18068F.mo33964i();
        int i4 = 0;
        boolean z = i == 45;
        if (z) {
            i3[0] = '-';
            if (this.f18085g >= this.f18086o) {
                mo37402f0();
            }
            byte[] bArr = this.f18173h0;
            int i5 = this.f18085g;
            this.f18085g = i5 + 1;
            i = bArr[i5] & 255;
            if (i < 48 || i > 57) {
                return mo37519I0(i, true);
            }
            i4 = 1;
        }
        if (i == 48) {
            i = m30737E1();
        }
        int i6 = i4 + 1;
        i3[i4] = (char) i;
        int length = this.f18085g + i3.length;
        int i7 = this.f18086o;
        if (length > i7) {
            length = i7;
        }
        int i8 = 1;
        while (true) {
            int i9 = this.f18085g;
            if (i9 >= length) {
                return m30749d1(i3, i6, z, i8);
            }
            byte[] bArr2 = this.f18173h0;
            i2 = i9 + 1;
            this.f18085g = i2;
            b = bArr2[i9] & 255;
            if (b >= 48 && b <= 57) {
                i8++;
                i3[i6] = (char) b;
                i6++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return m30748c1(i3, i6, b, z, i8);
        }
        this.f18085g = i2 - 1;
        this.f18068F.mo33977w(i6);
        return mo37410t0(z, i8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public C7465f mo37527Y0() throws IOException, JsonParseException {
        int i;
        int i2;
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(": was expecting closing ''' for name");
        }
        byte[] bArr = this.f18173h0;
        int i3 = this.f18085g;
        this.f18085g = i3 + 1;
        char c = bArr[i3] & 255;
        if (c == '\'') {
            return C7457a.m30957n();
        }
        int[] iArr = this.f18169d0;
        int[] iArr2 = f18167k0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c != '\'') {
            if (!(c == '\"' || iArr2[c] == 0)) {
                if (c != '\\') {
                    mo37420I(c, "name");
                } else {
                    c = mo37539x0();
                }
                if (c > 127) {
                    if (i2 >= 4) {
                        if (i5 >= iArr.length) {
                            iArr = m30742K1(iArr, iArr.length);
                            this.f18169d0 = iArr;
                        }
                        iArr[i5] = i;
                        i5++;
                        i2 = 0;
                        i = 0;
                    }
                    if (c < 2048) {
                        i = (i << 8) | (c >> 6) | 192;
                        i2++;
                    } else {
                        int i7 = (i << 8) | (c >> 12) | Opcodes.SHL_INT_LIT8;
                        int i8 = i2 + 1;
                        if (i8 >= 4) {
                            if (i5 >= iArr.length) {
                                iArr = m30742K1(iArr, iArr.length);
                                this.f18169d0 = iArr;
                            }
                            iArr[i5] = i7;
                            i5++;
                            i8 = 0;
                            i7 = 0;
                        }
                        i = (i7 << 8) | ((c >> 6) & 63) | 128;
                        i2 = i8 + 1;
                    }
                    c = (c & '?') | 128;
                }
            }
            if (i2 < 4) {
                i4 = i2 + 1;
                i6 = c | (i << 8);
            } else {
                if (i5 >= iArr.length) {
                    iArr = m30742K1(iArr, iArr.length);
                    this.f18169d0 = iArr;
                }
                iArr[i5] = i;
                i6 = c;
                i5++;
                i4 = 1;
            }
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in field name");
            }
            byte[] bArr2 = this.f18173h0;
            int i9 = this.f18085g;
            this.f18085g = i9 + 1;
            c = bArr2[i9] & 255;
        }
        if (i2 > 0) {
            if (i5 >= iArr.length) {
                int[] K1 = m30742K1(iArr, iArr.length);
                this.f18169d0 = K1;
                iArr = K1;
            }
            iArr[i5] = i;
            i5++;
        }
        C7465f m = this.f18168c0.mo37592m(iArr, i5);
        return m == null ? m30738F1(iArr, i5, i2) : m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public C7465f mo37528Y1() throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(": was expecting closing '\"' for name");
        }
        byte[] bArr = this.f18173h0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        byte b = bArr[i] & 255;
        if (b == 34) {
            return C7457a.m30957n();
        }
        return mo37522P1(this.f18169d0, 0, 0, b, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z0 */
    public C7465f mo37529Z0(int i) throws IOException, JsonParseException {
        if (i != 34) {
            return mo37521N0(i);
        }
        int i2 = this.f18085g;
        if (i2 + 9 > this.f18086o) {
            return mo37528Y1();
        }
        byte[] bArr = this.f18173h0;
        int[] iArr = f18167k0;
        int i3 = i2 + 1;
        this.f18085g = i3;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            int i4 = i3 + 1;
            this.f18085g = i4;
            byte b2 = bArr[i3] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i5 = i4 + 1;
                this.f18085g = i5;
                byte b4 = bArr[i4] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i6 = i5 + 1;
                    this.f18085g = i6;
                    byte b6 = bArr[i5] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        this.f18085g = i6 + 1;
                        byte b8 = bArr[i6] & 255;
                        if (iArr[b8] == 0) {
                            this.f18171f0 = b7;
                            return mo37525W1(b8, iArr);
                        } else if (b8 == 34) {
                            return m30739H1(b7, 4);
                        } else {
                            return m30744Q1(b7, b8, 4);
                        }
                    } else if (b6 == 34) {
                        return m30739H1(b5, 3);
                    } else {
                        return m30744Q1(b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return m30739H1(b3, 2);
                } else {
                    return m30744Q1(b3, b4, 2);
                }
            } else if (b2 == 34) {
                return m30739H1(b, 1);
            } else {
                return m30744Q1(b, b2, 1);
            }
        } else if (b == 34) {
            return C7457a.m30957n();
        } else {
            return m30744Q1(0, b, 0);
        }
    }

    public void close() throws IOException {
        super.close();
        this.f18168c0.mo37595u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo37401e0() throws IOException {
        long j = this.f18087p;
        int i = this.f18086o;
        this.f18087p = j + ((long) i);
        this.f18089z -= i;
        InputStream inputStream = this.f18172g0;
        if (inputStream != null) {
            byte[] bArr = this.f18173h0;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.f18085g = 0;
                this.f18086o = read;
                return true;
            }
            mo37392K();
            if (read == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.f18173h0.length + " bytes");
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e1 */
    public void mo37530e1(int i) throws JsonParseException {
        if (i < 32) {
            mo37419H(i);
        }
        mo37531f1(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public void mo37531f1(int i) throws JsonParseException {
        mo37413B("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public void mo37532g1(int i) throws JsonParseException {
        mo37413B("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public void mo37533h1(int i, int i2) throws JsonParseException {
        this.f18085g = i2;
        mo37532g1(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo37534j1(String str, String str2) throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                break;
            }
            byte[] bArr = this.f18173h0;
            int i = this.f18085g;
            this.f18085g = i + 1;
            char w0 = (char) mo37538w0(bArr[i]);
            if (!Character.isJavaIdentifierPart(w0)) {
                break;
            }
            sb.append(w0);
        }
        mo37413B("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public void mo37535l1() throws IOException {
        if (this.f18085g < this.f18086o || mo37401e0()) {
            byte[] bArr = this.f18173h0;
            int i = this.f18085g;
            if (bArr[i] == 10) {
                this.f18085g = i + 1;
            }
        }
        this.f18088s++;
        this.f18089z = this.f18085g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public void mo37536q1() throws IOException {
        this.f18088s++;
        this.f18089z = this.f18085g;
    }

    /* renamed from: s */
    public String mo33872s() throws IOException, JsonParseException {
        C6805g gVar = this.f18090c;
        if (gVar != C6805g.VALUE_STRING) {
            return mo37517E0(gVar);
        }
        if (this.f18170e0) {
            this.f18170e0 = false;
            mo37516C0();
        }
        return this.f18068F.mo33963h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public void mo37537s1() throws IOException, JsonParseException {
        this.f18170e0 = false;
        int[] iArr = f18166j0;
        byte[] bArr = this.f18173h0;
        while (true) {
            int i = this.f18085g;
            int i2 = this.f18086o;
            if (i >= i2) {
                mo37402f0();
                i = this.f18085g;
                i2 = this.f18086o;
            }
            while (true) {
                if (i >= i2) {
                    this.f18085g = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                if (iArr[b] != 0) {
                    this.f18085g = i3;
                    if (b != 34) {
                        int i4 = iArr[b];
                        if (i4 == 1) {
                            mo37539x0();
                        } else if (i4 == 2) {
                            m30753t1(b);
                        } else if (i4 == 3) {
                            m30754u1(b);
                        } else if (i4 == 4) {
                            m30755w1(b);
                        } else if (b < 32) {
                            mo37420I(b, "string value");
                        } else {
                            mo37530e1(b);
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* renamed from: v */
    public C6805g mo33874v() throws IOException, JsonParseException {
        C6805g gVar;
        this.f18073K = 0;
        C6805g gVar2 = this.f18090c;
        C6805g gVar3 = C6805g.FIELD_NAME;
        if (gVar2 == gVar3) {
            return m30746U0();
        }
        if (this.f18170e0) {
            mo37537s1();
        }
        int D1 = m30736D1();
        if (D1 < 0) {
            close();
            this.f18090c = null;
            return null;
        }
        long j = this.f18087p;
        int i = this.f18085g;
        this.f18063A = (j + ((long) i)) - 1;
        this.f18064B = this.f18088s;
        this.f18065C = (i - this.f18089z) - 1;
        this.f18072J = null;
        if (D1 == 93) {
            if (!this.f18066D.mo33881d()) {
                mo37395Q(D1, '}');
            }
            this.f18066D = this.f18066D.mo37479l();
            C6805g gVar4 = C6805g.END_ARRAY;
            this.f18090c = gVar4;
            return gVar4;
        } else if (D1 == 125) {
            if (!this.f18066D.mo33882e()) {
                mo37395Q(D1, ']');
            }
            this.f18066D = this.f18066D.mo37479l();
            C6805g gVar5 = C6805g.END_OBJECT;
            this.f18090c = gVar5;
            return gVar5;
        } else {
            if (this.f18066D.mo37477j()) {
                if (D1 != 44) {
                    mo37417F(D1, "was expecting comma to separate " + this.f18066D.mo33880c() + " entries");
                }
                D1 = m30758z1();
            }
            if (!this.f18066D.mo33882e()) {
                return m30747V0(D1);
            }
            this.f18066D.mo37482o(mo37529Z0(D1).mo37617d());
            this.f18090c = gVar3;
            int z1 = m30758z1();
            if (z1 != 58) {
                mo37417F(z1, "was expecting a colon to separate field name and value");
            }
            int z12 = m30758z1();
            if (z12 == 34) {
                this.f18170e0 = true;
                this.f18067E = C6805g.VALUE_STRING;
                return this.f18090c;
            }
            if (z12 != 45) {
                if (z12 != 91) {
                    if (z12 != 93) {
                        if (z12 == 102) {
                            mo37523R0("false", 1);
                            gVar = C6805g.VALUE_FALSE;
                        } else if (z12 != 110) {
                            if (z12 != 116) {
                                if (z12 != 123) {
                                    if (z12 != 125) {
                                        switch (z12) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                break;
                                            default:
                                                gVar = mo37520K0(z12);
                                                break;
                                        }
                                    }
                                } else {
                                    gVar = C6805g.START_OBJECT;
                                }
                            }
                            mo37523R0("true", 1);
                            gVar = C6805g.VALUE_TRUE;
                        } else {
                            mo37523R0("null", 1);
                            gVar = C6805g.VALUE_NULL;
                        }
                    }
                    mo37417F(z12, "expected a value");
                    mo37523R0("true", 1);
                    gVar = C6805g.VALUE_TRUE;
                } else {
                    gVar = C6805g.START_ARRAY;
                }
                this.f18067E = gVar;
                return this.f18090c;
            }
            gVar = mo37526X1(z12);
            this.f18067E = gVar;
            return this.f18090c;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo37538w0(int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r6 = this;
            if (r7 >= 0) goto L_0x0064
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L_0x000e
            r7 = r7 & 31
        L_0x000c:
            r0 = 1
            goto L_0x0028
        L_0x000e:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L_0x0018
            r7 = r7 & 15
            r0 = 2
            goto L_0x0028
        L_0x0018:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L_0x0022
            r7 = r7 & 7
            r0 = 3
            goto L_0x0028
        L_0x0022:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6.mo37531f1(r0)
            goto L_0x000c
        L_0x0028:
            int r3 = r6.m30743N1()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0037
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.mo37532g1(r4)
        L_0x0037:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x0064
            int r2 = r6.m30743N1()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004b
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.mo37532g1(r3)
        L_0x004b:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x0064
            int r0 = r6.m30743N1()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x005f
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.mo37532g1(r1)
        L_0x005f:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7427g.mo37538w0(int):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public char mo37539x0() throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(" in character escape sequence");
        }
        byte[] bArr = this.f18173h0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return 8;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 117) {
            return mo37412A((char) mo37538w0(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in character escape sequence");
            }
            byte[] bArr2 = this.f18173h0;
            int i4 = this.f18085g;
            this.f18085g = i4 + 1;
            byte b2 = bArr2[i4];
            int b3 = C6809b.m25587b(b2);
            if (b3 < 0) {
                mo37417F(b2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b3;
        }
        return (char) i2;
    }
}
