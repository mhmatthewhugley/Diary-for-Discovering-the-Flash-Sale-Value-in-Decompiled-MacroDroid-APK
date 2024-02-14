package p109i5;

import com.android.p023dx.p026io.Opcodes;
import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.C6807i;
import com.fasterxml.jackson.core.C6821j;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p072io.C6809b;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.p072io.C6816i;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: i5.f */
/* compiled from: UTF8JsonGenerator */
public class C7426f extends C7421b {

    /* renamed from: J */
    static final byte[] f18154J = C6809b.m25588c();

    /* renamed from: K */
    private static final byte[] f18155K = {110, 117, 108, 108};

    /* renamed from: L */
    private static final byte[] f18156L = {116, 114, 117, 101};

    /* renamed from: M */
    private static final byte[] f18157M = {102, 97, 108, 115, 101};

    /* renamed from: B */
    protected final OutputStream f18158B;

    /* renamed from: C */
    protected byte[] f18159C;

    /* renamed from: D */
    protected int f18160D = 0;

    /* renamed from: E */
    protected final int f18161E;

    /* renamed from: F */
    protected final int f18162F;

    /* renamed from: G */
    protected char[] f18163G;

    /* renamed from: H */
    protected final int f18164H;

    /* renamed from: I */
    protected boolean f18165I;

    public C7426f(C6811d dVar, int i, C6806h hVar, OutputStream outputStream) {
        super(dVar, i, hVar);
        this.f18158B = outputStream;
        this.f18165I = true;
        byte[] d = dVar.mo33903d();
        this.f18159C = d;
        int length = d.length;
        this.f18161E = length;
        this.f18162F = length >> 3;
        char[] a = dVar.mo33900a();
        this.f18163G = a;
        this.f18164H = a.length;
        if (mo37390F(C6799c.C6800a.ESCAPE_NON_ASCII)) {
            mo37473G(127);
        }
    }

    /* renamed from: K */
    private int m30691K(int i, int i2) throws IOException {
        byte[] bArr = this.f18159C;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            bArr[i4] = (byte) ((i & 63) | 128);
            return i4 + 1;
        }
        int i5 = i2 + 1;
        bArr[i2] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        int i7 = i6 + 1;
        byte[] bArr2 = f18154J;
        bArr[i6] = bArr2[(i >> 12) & 15];
        int i8 = i7 + 1;
        bArr[i7] = bArr2[(i >> 8) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 4) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[i & 15];
        return i10;
    }

    /* renamed from: L */
    private int m30692L(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f18159C;
            int i4 = this.f18160D;
            int i5 = i4 + 1;
            this.f18160D = i5;
            bArr[i4] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            int i6 = i5 + 1;
            this.f18160D = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.f18160D = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3) {
            mo37388D("Split surrogate on writeRaw() input (last character)");
        }
        mo37510M(i, cArr[i2]);
        return i2 + 1;
    }

    /* renamed from: S */
    private final void m30693S(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f18160D + length > this.f18161E) {
            mo37509J();
            if (length > 512) {
                this.f18158B.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f18159C, this.f18160D, length);
        this.f18160D += length;
    }

    /* renamed from: W */
    private int m30694W(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.f18159C;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = f18154J;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = f18154J;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    /* renamed from: Z */
    private void m30695Z(String str) throws IOException, JsonGenerationException {
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 34;
        m30705t0(str);
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr2 = this.f18159C;
        int i2 = this.f18160D;
        this.f18160D = i2 + 1;
        bArr2[i2] = 34;
    }

    /* renamed from: c0 */
    private void m30696c0(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i3 = this.f18160D;
        this.f18160D = i3 + 1;
        bArr[i3] = 34;
        m30706w0(this.f18163G, 0, i2);
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr2 = this.f18159C;
        int i4 = this.f18160D;
        this.f18160D = i4 + 1;
        bArr2[i4] = 34;
    }

    /* renamed from: e0 */
    private void m30697e0() throws IOException {
        if (this.f18160D + 4 >= this.f18161E) {
            mo37509J();
        }
        System.arraycopy(f18155K, 0, this.f18159C, this.f18160D, 4);
        this.f18160D += 4;
    }

    /* renamed from: h0 */
    private void m30698h0(int i) throws IOException {
        if (this.f18160D + 13 >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i2 = this.f18160D;
        int i3 = i2 + 1;
        this.f18160D = i3;
        bArr[i2] = 34;
        int d = C6816i.m25622d(i, bArr, i3);
        byte[] bArr2 = this.f18159C;
        this.f18160D = d + 1;
        bArr2[d] = 34;
    }

    /* renamed from: j0 */
    private void m30699j0(long j) throws IOException {
        if (this.f18160D + 23 >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        int i2 = i + 1;
        this.f18160D = i2;
        bArr[i] = 34;
        int h = C6816i.m25626h(j, bArr, i2);
        byte[] bArr2 = this.f18159C;
        this.f18160D = h + 1;
        bArr2[h] = 34;
    }

    /* renamed from: k0 */
    private void m30700k0(Object obj) throws IOException {
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 34;
        mo33850x(obj.toString());
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr2 = this.f18159C;
        int i2 = this.f18160D;
        this.f18160D = i2 + 1;
        bArr2[i2] = 34;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        m30692L(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if ((r7.f18160D + 3) < r7.f18161E) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        mo37509J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r9 >= 2048) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r7.f18160D;
        r5 = r4 + 1;
        r7.f18160D = r5;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7.f18160D = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
     */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30701l0(char[] r8, int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r7 = this;
            int r0 = r7.f18161E
            byte[] r1 = r7.f18159C
        L_0x0004:
            if (r9 >= r10) goto L_0x0050
        L_0x0006:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003c
            int r2 = r7.f18160D
            int r2 = r2 + 3
            int r4 = r7.f18161E
            if (r2 < r4) goto L_0x0017
            r7.mo37509J()
        L_0x0017:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0037
            int r4 = r7.f18160D
            int r5 = r4 + 1
            r7.f18160D = r5
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7.f18160D = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            goto L_0x003a
        L_0x0037:
            r7.m30692L(r9, r8, r2, r10)
        L_0x003a:
            r9 = r2
            goto L_0x0004
        L_0x003c:
            int r3 = r7.f18160D
            if (r3 < r0) goto L_0x0043
            r7.mo37509J()
        L_0x0043:
            int r3 = r7.f18160D
            int r4 = r3 + 1
            r7.f18160D = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0006
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7426f.m30701l0(char[], int, int):void");
    }

    /* renamed from: n0 */
    private final void m30702n0(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 + i;
        int i4 = this.f18160D;
        byte[] bArr = this.f18159C;
        int[] iArr = this.f18137p;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.f18160D = i4;
        if (i >= i3) {
            return;
        }
        if (this.f18138s == 0) {
            m30703p0(cArr, i, i3);
        } else {
            m30704q0(cArr, i, i3);
        }
    }

    /* renamed from: p0 */
    private final void m30703p0(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f18160D + ((i2 - i) * 6) > this.f18161E) {
            mo37509J();
        }
        int i3 = this.f18160D;
        byte[] bArr = this.f18159C;
        int[] iArr = this.f18137p;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3++;
                } else {
                    int i5 = iArr[c];
                    if (i5 > 0) {
                        int i6 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i6 + 1;
                        bArr[i6] = (byte) i5;
                    } else {
                        i3 = m30694W(c, i3);
                    }
                }
            } else if (c <= 2047) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((c & '?') | 128);
            } else {
                i3 = m30691K(c, i3);
            }
            i = i4;
        }
        this.f18160D = i3;
    }

    /* renamed from: q0 */
    private final void m30704q0(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (this.f18160D + ((i2 - i) * 6) > this.f18161E) {
            mo37509J();
        }
        int i3 = this.f18160D;
        byte[] bArr = this.f18159C;
        int[] iArr = this.f18137p;
        int i4 = this.f18138s;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3++;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = m30694W(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = m30694W(c, i3);
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = m30691K(c, i3);
            }
            i = i5;
        }
        this.f18160D = i3;
    }

    /* renamed from: t0 */
    private final void m30705t0(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        char[] cArr = this.f18163G;
        int i = 0;
        while (length > 0) {
            int min = Math.min(this.f18162F, length);
            int i2 = i + min;
            str.getChars(i, i2, cArr, 0);
            if (this.f18160D + min > this.f18161E) {
                mo37509J();
            }
            m30702n0(cArr, 0, min);
            length -= min;
            i = i2;
        }
    }

    /* renamed from: w0 */
    private final void m30706w0(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        do {
            int min = Math.min(this.f18162F, i2);
            if (this.f18160D + min > this.f18161E) {
                mo37509J();
            }
            m30702n0(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: A */
    public final void mo33831A() throws IOException, JsonGenerationException {
        mo37513Q("start an object");
        this.f18053f = this.f18053f.mo37486i();
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33885a(this);
            return;
        }
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 123;
    }

    /* renamed from: B */
    public void mo33832B(String str) throws IOException, JsonGenerationException {
        mo37513Q("write text value");
        if (str == null) {
            m30697e0();
            return;
        }
        int length = str.length();
        if (length > this.f18164H) {
            m30695Z(str);
            return;
        }
        str.getChars(0, length, this.f18163G, 0);
        if (length > this.f18162F) {
            m30696c0(this.f18163G, 0, length);
            return;
        }
        if (this.f18160D + length >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 34;
        m30702n0(this.f18163G, 0, length);
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr2 = this.f18159C;
        int i2 = this.f18160D;
        this.f18160D = i2 + 1;
        bArr2[i2] = 34;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final int mo37508I(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            mo37388D("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo37509J() throws IOException {
        int i = this.f18160D;
        if (i > 0) {
            this.f18160D = 0;
            this.f18158B.write(this.f18159C, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo37510M(int i, int i2) throws IOException {
        int I = mo37508I(i, i2);
        if (this.f18160D + 4 > this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i3 = this.f18160D;
        int i4 = i3 + 1;
        this.f18160D = i4;
        bArr[i3] = (byte) ((I >> 18) | 240);
        int i5 = i4 + 1;
        this.f18160D = i5;
        bArr[i4] = (byte) (((I >> 12) & 63) | 128);
        int i6 = i5 + 1;
        this.f18160D = i6;
        bArr[i5] = (byte) (((I >> 6) & 63) | 128);
        this.f18160D = i6 + 1;
        bArr[i6] = (byte) ((I & 63) | 128);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo37511N() {
        byte[] bArr = this.f18159C;
        if (bArr != null && this.f18165I) {
            this.f18159C = null;
            this.f18136o.mo33912m(bArr);
        }
        char[] cArr = this.f18163G;
        if (cArr != null) {
            this.f18163G = null;
            this.f18136o.mo33908i(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo37512O(String str, int i) throws IOException, JsonGenerationException {
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
    /* renamed from: Q */
    public final void mo37513Q(String str) throws IOException, JsonGenerationException {
        byte b;
        C6821j jVar;
        int n = this.f18053f.mo37489n();
        if (n == 5) {
            mo37388D("Can not " + str + ", expecting field name");
        }
        if (this.f15770a == null) {
            if (n == 1) {
                b = 44;
            } else if (n == 2) {
                b = 58;
            } else if (n == 3 && (jVar = this.f18139z) != null) {
                byte[] a = jVar.mo33924a();
                if (a.length > 0) {
                    m30693S(a);
                    return;
                }
                return;
            } else {
                return;
            }
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr = this.f18159C;
            int i = this.f18160D;
            bArr[i] = b;
            this.f18160D = i + 1;
            return;
        }
        mo37512O(str, n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo37514U(String str) throws IOException, JsonGenerationException {
        if (!mo37390F(C6799c.C6800a.QUOTE_FIELD_NAMES)) {
            m30705t0(str);
            return;
        }
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 34;
        int length = str.length();
        if (length <= this.f18164H) {
            str.getChars(0, length, this.f18163G, 0);
            if (length <= this.f18162F) {
                if (this.f18160D + length > this.f18161E) {
                    mo37509J();
                }
                m30702n0(this.f18163G, 0, length);
            } else {
                m30706w0(this.f18163G, 0, length);
            }
        } else {
            m30705t0(str);
        }
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr2 = this.f18159C;
        int i2 = this.f18160D;
        this.f18160D = i2 + 1;
        bArr2[i2] = 34;
    }

    public void close() throws IOException {
        super.close();
        if (this.f18159C != null && mo37390F(C6799c.C6800a.AUTO_CLOSE_JSON_CONTENT)) {
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
        mo37509J();
        if (this.f18158B != null) {
            if (this.f18136o.mo33907h() || mo37390F(C6799c.C6800a.AUTO_CLOSE_TARGET)) {
                this.f18158B.close();
            } else if (mo37390F(C6799c.C6800a.FLUSH_PASSED_TO_STREAM)) {
                this.f18158B.flush();
            }
        }
        mo37511N();
    }

    /* renamed from: f */
    public void mo33836f(boolean z) throws IOException, JsonGenerationException {
        mo37513Q("write boolean value");
        if (this.f18160D + 5 >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = z ? f18156L : f18157M;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f18159C, this.f18160D, length);
        this.f18160D += length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void mo37515f0(String str, boolean z) throws IOException, JsonGenerationException {
        if (z) {
            this.f15770a.mo33890f(this);
        } else {
            this.f15770a.mo33888d(this);
        }
        if (mo37390F(C6799c.C6800a.QUOTE_FIELD_NAMES)) {
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr = this.f18159C;
            int i = this.f18160D;
            this.f18160D = i + 1;
            bArr[i] = 34;
            int length = str.length();
            if (length <= this.f18164H) {
                str.getChars(0, length, this.f18163G, 0);
                if (length <= this.f18162F) {
                    if (this.f18160D + length > this.f18161E) {
                        mo37509J();
                    }
                    m30702n0(this.f18163G, 0, length);
                } else {
                    m30706w0(this.f18163G, 0, length);
                }
            } else {
                m30705t0(str);
            }
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr2 = this.f18159C;
            int i2 = this.f18160D;
            this.f18160D = i2 + 1;
            bArr2[i2] = 34;
            return;
        }
        m30705t0(str);
    }

    public final void flush() throws IOException {
        mo37509J();
        if (this.f18158B != null && mo37390F(C6799c.C6800a.FLUSH_PASSED_TO_STREAM)) {
            this.f18158B.flush();
        }
    }

    /* renamed from: g */
    public final void mo33838g() throws IOException, JsonGenerationException {
        if (!this.f18053f.mo33881d()) {
            mo37388D("Current context not an ARRAY but " + this.f18053f.mo33880c());
        }
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33891g(this, this.f18053f.mo33879b());
        } else {
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr = this.f18159C;
            int i = this.f18160D;
            this.f18160D = i + 1;
            bArr[i] = 93;
        }
        this.f18053f = this.f18053f.mo37487k();
    }

    /* renamed from: h */
    public final void mo33839h() throws IOException, JsonGenerationException {
        if (!this.f18053f.mo33882e()) {
            mo37388D("Current context not an object but " + this.f18053f.mo33880c());
        }
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33893i(this, this.f18053f.mo33879b());
        } else {
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr = this.f18159C;
            int i = this.f18160D;
            this.f18160D = i + 1;
            bArr[i] = 125;
        }
        this.f18053f = this.f18053f.mo37487k();
    }

    /* renamed from: i */
    public final void mo33840i(String str) throws IOException, JsonGenerationException {
        int m = this.f18053f.mo37488m(str);
        if (m == 4) {
            mo37388D("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (this.f15770a != null) {
            if (m != 1) {
                z = false;
            }
            mo37515f0(str, z);
            return;
        }
        if (m == 1) {
            if (this.f18160D >= this.f18161E) {
                mo37509J();
            }
            byte[] bArr = this.f18159C;
            int i = this.f18160D;
            this.f18160D = i + 1;
            bArr[i] = 44;
        }
        mo37514U(str);
    }

    /* renamed from: j */
    public void mo33841j() throws IOException, JsonGenerationException {
        mo37513Q("write null value");
        m30697e0();
    }

    /* renamed from: m */
    public void mo33842m(double d) throws IOException, JsonGenerationException {
        if (this.f18052d || ((Double.isNaN(d) || Double.isInfinite(d)) && mo37390F(C6799c.C6800a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo33832B(String.valueOf(d));
            return;
        }
        mo37513Q("write number");
        mo33850x(String.valueOf(d));
    }

    /* renamed from: o */
    public void mo33843o(float f) throws IOException, JsonGenerationException {
        if (this.f18052d || ((Float.isNaN(f) || Float.isInfinite(f)) && mo37390F(C6799c.C6800a.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo33832B(String.valueOf(f));
            return;
        }
        mo37513Q("write number");
        mo33850x(String.valueOf(f));
    }

    /* renamed from: p */
    public void mo33844p(int i) throws IOException, JsonGenerationException {
        mo37513Q("write number");
        if (this.f18160D + 11 >= this.f18161E) {
            mo37509J();
        }
        if (this.f18052d) {
            m30698h0(i);
        } else {
            this.f18160D = C6816i.m25622d(i, this.f18159C, this.f18160D);
        }
    }

    /* renamed from: r */
    public void mo33845r(long j) throws IOException, JsonGenerationException {
        mo37513Q("write number");
        if (this.f18052d) {
            m30699j0(j);
            return;
        }
        if (this.f18160D + 21 >= this.f18161E) {
            mo37509J();
        }
        this.f18160D = C6816i.m25626h(j, this.f18159C, this.f18160D);
    }

    /* renamed from: s */
    public void mo33846s(BigDecimal bigDecimal) throws IOException, JsonGenerationException {
        mo37513Q("write number");
        if (bigDecimal == null) {
            m30697e0();
        } else if (this.f18052d) {
            m30700k0(bigDecimal);
        } else {
            mo33850x(bigDecimal.toString());
        }
    }

    /* renamed from: u */
    public void mo33847u(BigInteger bigInteger) throws IOException, JsonGenerationException {
        mo37513Q("write number");
        if (bigInteger == null) {
            m30697e0();
        } else if (this.f18052d) {
            m30700k0(bigInteger);
        } else {
            mo33850x(bigInteger.toString());
        }
    }

    /* renamed from: v */
    public void mo33848v(char c) throws IOException, JsonGenerationException {
        if (this.f18160D + 3 >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        if (c <= 127) {
            int i = this.f18160D;
            this.f18160D = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f18160D;
            int i3 = i2 + 1;
            this.f18160D = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f18160D = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            m30692L(c, (char[]) null, 0, 0);
        }
    }

    /* renamed from: w */
    public void mo33849w(C6821j jVar) throws IOException, JsonGenerationException {
        byte[] a = jVar.mo33924a();
        if (a.length > 0) {
            m30693S(a);
        }
    }

    /* renamed from: x */
    public void mo33850x(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.f18163G;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            mo33851y(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r7 >= 2048) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r5.f18159C;
        r2 = r5.f18160D;
        r3 = r2 + 1;
        r5.f18160D = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5.f18160D = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        m30692L(r7, r6, r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r7 = r0;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33851y(char[] r6, int r7, int r8) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5.f18160D
            int r1 = r1 + r0
            int r2 = r5.f18161E
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5.m30701l0(r6, r7, r8)
            return
        L_0x0010:
            r5.mo37509J()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x0053
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0044
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x003f
            byte[] r1 = r5.f18159C
            int r2 = r5.f18160D
            int r3 = r2 + 1
            r5.f18160D = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f18160D = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            goto L_0x0042
        L_0x003f:
            r5.m30692L(r7, r6, r0, r8)
        L_0x0042:
            r7 = r0
            goto L_0x0014
        L_0x0044:
            byte[] r1 = r5.f18159C
            int r2 = r5.f18160D
            int r3 = r2 + 1
            r5.f18160D = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7426f.mo33851y(char[], int, int):void");
    }

    /* renamed from: z */
    public final void mo33852z() throws IOException, JsonGenerationException {
        mo37513Q("start an array");
        this.f18053f = this.f18053f.mo37485h();
        C6807i iVar = this.f15770a;
        if (iVar != null) {
            iVar.mo33894j(this);
            return;
        }
        if (this.f18160D >= this.f18161E) {
            mo37509J();
        }
        byte[] bArr = this.f18159C;
        int i = this.f18160D;
        this.f18160D = i + 1;
        bArr[i] = 91;
    }
}
