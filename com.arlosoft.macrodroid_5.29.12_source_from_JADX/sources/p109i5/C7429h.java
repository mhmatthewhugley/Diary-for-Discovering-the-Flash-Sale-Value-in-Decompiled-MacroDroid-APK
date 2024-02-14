package p109i5;

import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.C6807i;
import com.fasterxml.jackson.core.C6821j;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p072io.C6809b;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.p072io.C6816i;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import org.apache.commons.p353io.IOUtils;

/* renamed from: i5.h */
/* compiled from: WriterBasedJsonGenerator */
public final class C7429h extends C7421b {

    /* renamed from: I */
    protected static final char[] f18176I = C6809b.m25589d();

    /* renamed from: B */
    protected final Writer f18177B;

    /* renamed from: C */
    protected char[] f18178C;

    /* renamed from: D */
    protected int f18179D = 0;

    /* renamed from: E */
    protected int f18180E = 0;

    /* renamed from: F */
    protected int f18181F;

    /* renamed from: G */
    protected char[] f18182G;

    /* renamed from: H */
    protected C6821j f18183H;

    public C7429h(C6811d dVar, int i, C6806h hVar, Writer writer) {
        super(dVar, i, hVar);
        this.f18177B = writer;
        char[] a = dVar.mo33900a();
        this.f18178C = a;
        this.f18181F = a.length;
    }

    /* renamed from: I */
    private char[] m30788I() {
        char[] cArr = new char[14];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[2] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[9] = 'u';
        this.f18182G = cArr;
        return cArr;
    }

    /* renamed from: K */
    private int m30789K(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.f18182G;
                if (cArr2 == null) {
                    cArr2 = m30788I();
                }
                cArr2[1] = (char) i3;
                this.f18177B.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr[i5 + 1] = (char) i3;
            return i5;
        } else if (i3 == -2) {
            C6821j jVar = this.f18183H;
            Objects.requireNonNull(jVar);
            String value = jVar.getValue();
            this.f18183H = null;
            int length = value.length();
            if (i < length || i >= i2) {
                this.f18177B.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        } else if (i <= 5 || i >= i2) {
            char[] cArr3 = this.f18182G;
            if (cArr3 == null) {
                cArr3 = m30788I();
            }
            this.f18179D = this.f18180E;
            if (c > 255) {
                int i7 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = f18176I;
                cArr3[10] = cArr4[i7 >> 4];
                cArr3[11] = cArr4[i7 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this.f18177B.write(cArr3, 8, 6);
                return i;
            }
            char[] cArr5 = f18176I;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this.f18177B.write(cArr3, 2, 6);
            return i;
        } else {
            int i8 = i - 6;
            int i9 = i8 + 1;
            cArr[i8] = IOUtils.DIR_SEPARATOR_WINDOWS;
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c > 255) {
                int i11 = (c >> 8) & 255;
                int i12 = i10 + 1;
                char[] cArr6 = f18176I;
                cArr[i10] = cArr6[i11 >> 4];
                i4 = i12 + 1;
                cArr[i12] = cArr6[i11 & 15];
                c = (char) (c & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i4 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i4 + 1;
            char[] cArr7 = f18176I;
            cArr[i4] = cArr7[c >> 4];
            cArr[i14] = cArr7[c & 15];
            return i14 - 5;
        }
    }

    /* renamed from: L */
    private void m30790L(char c, int i) throws IOException, JsonGenerationException {
        int i2;
        if (i >= 0) {
            int i3 = this.f18180E;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f18179D = i4;
                char[] cArr = this.f18178C;
                cArr[i4] = IOUtils.DIR_SEPARATOR_WINDOWS;
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArr2 = this.f18182G;
            if (cArr2 == null) {
                cArr2 = m30788I();
            }
            this.f18179D = this.f18180E;
            cArr2[1] = (char) i;
            this.f18177B.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.f18180E;
            if (i5 >= 6) {
                char[] cArr3 = this.f18178C;
                int i6 = i5 - 6;
                this.f18179D = i6;
                cArr3[i6] = IOUtils.DIR_SEPARATOR_WINDOWS;
                int i7 = i6 + 1;
                cArr3[i7] = 'u';
                if (c > 255) {
                    int i8 = (c >> 8) & 255;
                    int i9 = i7 + 1;
                    char[] cArr4 = f18176I;
                    cArr3[i9] = cArr4[i8 >> 4];
                    i2 = i9 + 1;
                    cArr3[i2] = cArr4[i8 & 15];
                    c = (char) (c & 255);
                } else {
                    int i10 = i7 + 1;
                    cArr3[i10] = '0';
                    i2 = i10 + 1;
                    cArr3[i2] = '0';
                }
                int i11 = i2 + 1;
                char[] cArr5 = f18176I;
                cArr3[i11] = cArr5[c >> 4];
                cArr3[i11 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.f18182G;
            if (cArr6 == null) {
                cArr6 = m30788I();
            }
            this.f18179D = this.f18180E;
            if (c > 255) {
                int i12 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = f18176I;
                cArr6[10] = cArr7[i12 >> 4];
                cArr6[11] = cArr7[i12 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.f18177B.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = f18176I;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.f18177B.write(cArr6, 2, 6);
        } else {
            C6821j jVar = this.f18183H;
            Objects.requireNonNull(jVar);
            String value = jVar.getValue();
            this.f18183H = null;
            int length = value.length();
            int i13 = this.f18180E;
            if (i13 >= length) {
                int i14 = i13 - length;
                this.f18179D = i14;
                value.getChars(0, length, this.f18178C, i14);
                return;
            }
            this.f18179D = i13;
            this.f18177B.write(value);
        }
    }

    /* renamed from: S */
    private void m30791S(String str) throws IOException, JsonGenerationException {
        mo37540J();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.f18181F;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f18178C, 0);
            int i4 = this.f18138s;
            if (i4 != 0) {
                m30797h0(i2, i4);
            } else {
                m30796f0(i2);
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: U */
    private void m30792U() throws IOException {
        if (this.f18180E + 4 >= this.f18181F) {
            mo37540J();
        }
        int i = this.f18180E;
        char[] cArr = this.f18178C;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.f18180E = i4 + 1;
    }

    /* renamed from: Z */
    private void m30793Z(int i) throws IOException {
        if (this.f18180E + 13 >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i2 = this.f18180E;
        int i3 = i2 + 1;
        this.f18180E = i3;
        cArr[i2] = '\"';
        int e = C6816i.m25623e(i, cArr, i3);
        char[] cArr2 = this.f18178C;
        this.f18180E = e + 1;
        cArr2[e] = '\"';
    }

    /* renamed from: c0 */
    private void m30794c0(long j) throws IOException {
        if (this.f18180E + 23 >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        int i2 = i + 1;
        this.f18180E = i2;
        cArr[i] = '\"';
        int i3 = C6816i.m25627i(j, cArr, i2);
        char[] cArr2 = this.f18178C;
        this.f18180E = i3 + 1;
        cArr2[i3] = '\"';
    }

    /* renamed from: e0 */
    private void m30795e0(Object obj) throws IOException {
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        this.f18180E = i + 1;
        cArr[i] = '\"';
        mo33850x(obj.toString());
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr2 = this.f18178C;
        int i2 = this.f18180E;
        this.f18180E = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* renamed from: f0 */
    private void m30796f0(int i) throws IOException, JsonGenerationException {
        char[] cArr;
        char c;
        int[] iArr = this.f18137p;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                cArr = this.f18178C;
                c = cArr[i2];
                if ((c < length && iArr[c] != 0) || (i2 = i2 + 1) >= i) {
                    int i4 = i2 - i3;
                }
                cArr = this.f18178C;
                c = cArr[i2];
                break;
            } while ((i2 = i2 + 1) >= i);
            int i42 = i2 - i3;
            if (i42 > 0) {
                this.f18177B.write(cArr, i3, i42);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = m30789K(this.f18178C, i2, i, c, iArr[c]);
        }
    }

    /* renamed from: h0 */
    private void m30797h0(int i, int i2) throws IOException, JsonGenerationException {
        char[] cArr;
        char c;
        int[] iArr = this.f18137p;
        int min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                cArr = this.f18178C;
                c = cArr[i3];
                if (c >= min) {
                    if (c > i2) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f18177B.write(cArr, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = m30789K(this.f18178C, i3, i, c, i5);
        }
    }

    /* renamed from: j0 */
    private void m30798j0(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = this.f18181F;
        if (length > i) {
            m30791S(str);
            return;
        }
        if (this.f18180E + length > i) {
            mo37540J();
        }
        str.getChars(0, length, this.f18178C, this.f18180E);
        int i2 = this.f18138s;
        if (i2 != 0) {
            m30800l0(length, i2);
        } else {
            m30799k0(length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6.f18178C;
        r3 = r6.f18180E;
        r6.f18180E = r3 + 1;
        r2 = r2[r3];
        m30790L(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6.f18179D;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6.f18177B.write(r2, r4, r3);
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30799k0(int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r6 = this;
            int r0 = r6.f18180E
            int r0 = r0 + r7
            int[] r7 = r6.f18137p
            int r1 = r7.length
        L_0x0006:
            int r2 = r6.f18180E
            if (r2 >= r0) goto L_0x0036
        L_0x000a:
            char[] r2 = r6.f18178C
            int r3 = r6.f18180E
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6.f18179D
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6.f18177B
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6.f18178C
            int r3 = r6.f18180E
            int r4 = r3 + 1
            r6.f18180E = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.m30790L(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r3 = r3 + 1
            r6.f18180E = r3
            if (r3 < r0) goto L_0x000a
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7429h.m30799k0(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30800l0(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8.f18180E
            int r0 = r0 + r9
            int[] r9 = r8.f18137p
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8.f18180E
            if (r2 >= r0) goto L_0x003a
        L_0x0010:
            char[] r2 = r8.f18178C
            int r3 = r8.f18180E
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x001d
            r5 = r9[r4]
            if (r5 == 0) goto L_0x0034
            goto L_0x0020
        L_0x001d:
            if (r4 <= r10) goto L_0x0034
            r5 = -1
        L_0x0020:
            int r6 = r8.f18179D
            int r3 = r3 - r6
            if (r3 <= 0) goto L_0x002a
            java.io.Writer r7 = r8.f18177B
            r7.write(r2, r6, r3)
        L_0x002a:
            int r2 = r8.f18180E
            int r2 = r2 + 1
            r8.f18180E = r2
            r8.m30790L(r4, r5)
            goto L_0x000c
        L_0x0034:
            int r3 = r3 + 1
            r8.f18180E = r3
            if (r3 < r0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7429h.m30800l0(int, int):void");
    }

    /* renamed from: n0 */
    private void m30801n0(String str) throws IOException, JsonGenerationException {
        int i = this.f18181F;
        int i2 = this.f18180E;
        int i3 = i - i2;
        str.getChars(0, i3, this.f18178C, i2);
        this.f18180E += i3;
        mo37540J();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f18181F;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f18178C, 0);
                this.f18179D = 0;
                this.f18180E = i4;
                mo37540J();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f18178C, 0);
                this.f18179D = 0;
                this.f18180E = length;
                return;
            }
        }
    }

    /* renamed from: A */
    public void mo33831A() throws IOException, JsonGenerationException {
        mo37543O("start an object");
        this.f18053f = this.f18053f.mo37486i();
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33885a(this);
            return;
        }
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        this.f18180E = i + 1;
        cArr[i] = '{';
    }

    /* renamed from: B */
    public void mo33832B(String str) throws IOException, JsonGenerationException {
        mo37543O("write text value");
        if (str == null) {
            m30792U();
            return;
        }
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        this.f18180E = i + 1;
        cArr[i] = '\"';
        m30798j0(str);
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr2 = this.f18178C;
        int i2 = this.f18180E;
        this.f18180E = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo37540J() throws IOException {
        int i = this.f18180E;
        int i2 = this.f18179D;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f18179D = 0;
            this.f18180E = 0;
            this.f18177B.write(this.f18178C, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo37541M() {
        char[] cArr = this.f18178C;
        if (cArr != null) {
            this.f18178C = null;
            this.f18136o.mo33908i(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo37542N(String str, int i) throws IOException, JsonGenerationException {
        if (i != 0) {
            if (i == 1) {
                this.f15770a.mo33887c(this);
            } else if (i == 2) {
                this.f15770a.mo33892h(this);
            } else if (i != 3) {
                mo37387C();
            } else {
                this.f15770a.mo33886b(this);
            }
        } else if (this.f18053f.mo33881d()) {
            this.f15770a.mo33889e(this);
        } else if (this.f18053f.mo33882e()) {
            this.f15770a.mo33888d(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo37543O(String str) throws IOException, JsonGenerationException {
        char c;
        C6821j jVar;
        int n = this.f18053f.mo37489n();
        if (n == 5) {
            mo37388D("Can not " + str + ", expecting field name");
        }
        if (this.f15770a == null) {
            if (n == 1) {
                c = ',';
            } else if (n == 2) {
                c = ':';
            } else if (n == 3 && (jVar = this.f18139z) != null) {
                mo33850x(jVar.getValue());
                return;
            } else {
                return;
            }
            if (this.f18180E >= this.f18181F) {
                mo37540J();
            }
            char[] cArr = this.f18178C;
            int i = this.f18180E;
            cArr[i] = c;
            this.f18180E = i + 1;
            return;
        }
        mo37542N(str, n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo37544Q(String str, boolean z) throws IOException, JsonGenerationException {
        if (this.f15770a != null) {
            mo37545W(str, z);
            return;
        }
        if (this.f18180E + 1 >= this.f18181F) {
            mo37540J();
        }
        if (z) {
            char[] cArr = this.f18178C;
            int i = this.f18180E;
            this.f18180E = i + 1;
            cArr[i] = ',';
        }
        if (!mo37390F(C6799c.C6800a.QUOTE_FIELD_NAMES)) {
            m30798j0(str);
            return;
        }
        char[] cArr2 = this.f18178C;
        int i2 = this.f18180E;
        this.f18180E = i2 + 1;
        cArr2[i2] = '\"';
        m30798j0(str);
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr3 = this.f18178C;
        int i3 = this.f18180E;
        this.f18180E = i3 + 1;
        cArr3[i3] = '\"';
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo37545W(String str, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f15770a.mo33890f(this);
        } else {
            this.f15770a.mo33888d(this);
        }
        if (mo37390F(C6799c.C6800a.QUOTE_FIELD_NAMES)) {
            if (this.f18180E >= this.f18181F) {
                mo37540J();
            }
            char[] cArr = this.f18178C;
            int i = this.f18180E;
            this.f18180E = i + 1;
            cArr[i] = '\"';
            m30798j0(str);
            if (this.f18180E >= this.f18181F) {
                mo37540J();
            }
            char[] cArr2 = this.f18178C;
            int i2 = this.f18180E;
            this.f18180E = i2 + 1;
            cArr2[i2] = '\"';
            return;
        }
        m30798j0(str);
    }

    public void close() throws IOException {
        super.close();
        if (this.f18178C != null && mo37390F(C6799c.C6800a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C7423d E = mo37389E();
                if (!E.mo33881d()) {
                    if (!E.mo33882e()) {
                        break;
                    }
                    mo33839h();
                } else {
                    mo33838g();
                }
            }
        }
        mo37540J();
        if (this.f18177B != null) {
            if (this.f18136o.mo33907h() || mo37390F(C6799c.C6800a.AUTO_CLOSE_TARGET)) {
                this.f18177B.close();
            } else if (mo37390F(C6799c.C6800a.FLUSH_PASSED_TO_STREAM)) {
                this.f18177B.flush();
            }
        }
        mo37541M();
    }

    /* renamed from: f */
    public void mo33836f(boolean z) throws IOException, JsonGenerationException {
        int i;
        mo37543O("write boolean value");
        if (this.f18180E + 5 >= this.f18181F) {
            mo37540J();
        }
        int i2 = this.f18180E;
        char[] cArr = this.f18178C;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.f18180E = i + 1;
    }

    public void flush() throws IOException {
        mo37540J();
        if (this.f18177B != null && mo37390F(C6799c.C6800a.FLUSH_PASSED_TO_STREAM)) {
            this.f18177B.flush();
        }
    }

    /* renamed from: g */
    public void mo33838g() throws IOException, JsonGenerationException {
        if (!this.f18053f.mo33881d()) {
            mo37388D("Current context not an ARRAY but " + this.f18053f.mo33880c());
        }
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33891g(this, this.f18053f.mo33879b());
        } else {
            if (this.f18180E >= this.f18181F) {
                mo37540J();
            }
            char[] cArr = this.f18178C;
            int i = this.f18180E;
            this.f18180E = i + 1;
            cArr[i] = ']';
        }
        this.f18053f = this.f18053f.mo37487k();
    }

    /* renamed from: h */
    public void mo33839h() throws IOException, JsonGenerationException {
        if (!this.f18053f.mo33882e()) {
            mo37388D("Current context not an object but " + this.f18053f.mo33880c());
        }
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33893i(this, this.f18053f.mo33879b());
        } else {
            if (this.f18180E >= this.f18181F) {
                mo37540J();
            }
            char[] cArr = this.f18178C;
            int i = this.f18180E;
            this.f18180E = i + 1;
            cArr[i] = '}';
        }
        this.f18053f = this.f18053f.mo37487k();
    }

    /* renamed from: i */
    public void mo33840i(String str) throws IOException, JsonGenerationException {
        int m = this.f18053f.mo37488m(str);
        if (m == 4) {
            mo37388D("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (m != 1) {
            z = false;
        }
        mo37544Q(str, z);
    }

    /* renamed from: j */
    public void mo33841j() throws IOException, JsonGenerationException {
        mo37543O("write null value");
        m30792U();
    }

    /* renamed from: m */
    public void mo33842m(double d) throws IOException, JsonGenerationException {
        if (this.f18052d || ((Double.isNaN(d) || Double.isInfinite(d)) && mo37390F(C6799c.C6800a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo33832B(String.valueOf(d));
            return;
        }
        mo37543O("write number");
        mo33850x(String.valueOf(d));
    }

    /* renamed from: o */
    public void mo33843o(float f) throws IOException, JsonGenerationException {
        if (this.f18052d || ((Float.isNaN(f) || Float.isInfinite(f)) && mo37390F(C6799c.C6800a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo33832B(String.valueOf(f));
            return;
        }
        mo37543O("write number");
        mo33850x(String.valueOf(f));
    }

    /* renamed from: p */
    public void mo33844p(int i) throws IOException, JsonGenerationException {
        mo37543O("write number");
        if (this.f18052d) {
            m30793Z(i);
            return;
        }
        if (this.f18180E + 11 >= this.f18181F) {
            mo37540J();
        }
        this.f18180E = C6816i.m25623e(i, this.f18178C, this.f18180E);
    }

    /* renamed from: r */
    public void mo33845r(long j) throws IOException, JsonGenerationException {
        mo37543O("write number");
        if (this.f18052d) {
            m30794c0(j);
            return;
        }
        if (this.f18180E + 21 >= this.f18181F) {
            mo37540J();
        }
        this.f18180E = C6816i.m25627i(j, this.f18178C, this.f18180E);
    }

    /* renamed from: s */
    public void mo33846s(BigDecimal bigDecimal) throws IOException, JsonGenerationException {
        mo37543O("write number");
        if (bigDecimal == null) {
            m30792U();
        } else if (this.f18052d) {
            m30795e0(bigDecimal);
        } else {
            mo33850x(bigDecimal.toString());
        }
    }

    /* renamed from: u */
    public void mo33847u(BigInteger bigInteger) throws IOException, JsonGenerationException {
        mo37543O("write number");
        if (bigInteger == null) {
            m30792U();
        } else if (this.f18052d) {
            m30795e0(bigInteger);
        } else {
            mo33850x(bigInteger.toString());
        }
    }

    /* renamed from: v */
    public void mo33848v(char c) throws IOException, JsonGenerationException {
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        this.f18180E = i + 1;
        cArr[i] = c;
    }

    /* renamed from: w */
    public void mo33849w(C6821j jVar) throws IOException, JsonGenerationException {
        mo33850x(jVar.getValue());
    }

    /* renamed from: x */
    public void mo33850x(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = this.f18181F - this.f18180E;
        if (i == 0) {
            mo37540J();
            i = this.f18181F - this.f18180E;
        }
        if (i >= length) {
            str.getChars(0, length, this.f18178C, this.f18180E);
            this.f18180E += length;
            return;
        }
        m30801n0(str);
    }

    /* renamed from: y */
    public void mo33851y(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (i2 < 32) {
            if (i2 > this.f18181F - this.f18180E) {
                mo37540J();
            }
            System.arraycopy(cArr, i, this.f18178C, this.f18180E, i2);
            this.f18180E += i2;
            return;
        }
        mo37540J();
        this.f18177B.write(cArr, i, i2);
    }

    /* renamed from: z */
    public void mo33852z() throws IOException, JsonGenerationException {
        mo37543O("start an array");
        this.f18053f = this.f18053f.mo37485h();
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33894j(this);
            return;
        }
        if (this.f18180E >= this.f18181F) {
            mo37540J();
        }
        char[] cArr = this.f18178C;
        int i = this.f18180E;
        this.f18180E = i + 1;
        cArr[i] = '[';
    }
}
