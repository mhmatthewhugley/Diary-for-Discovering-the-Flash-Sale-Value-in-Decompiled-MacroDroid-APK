package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream {

    /* renamed from: a */
    private final byte[] f63317a;

    /* renamed from: b */
    private final int f63318b;

    /* renamed from: c */
    private int f63319c;

    /* renamed from: d */
    private int f63320d = 0;

    /* renamed from: e */
    private final OutputStream f63321e;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f63321e = outputStream;
        this.f63317a = bArr;
        this.f63319c = 0;
        this.f63318b = bArr.length;
    }

    /* renamed from: A */
    public static int m90723A(int i, long j) {
        return m90726D(i) + m90724B(j);
    }

    /* renamed from: B */
    public static int m90724B(long j) {
        return m90755w(m90730H(j));
    }

    /* renamed from: C */
    public static int m90725C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m90754v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: D */
    public static int m90726D(int i) {
        return m90754v(C14539w.m91119c(i, 0));
    }

    /* renamed from: E */
    public static int m90727E(int i) {
        return m90754v(i);
    }

    /* renamed from: F */
    public static int m90728F(long j) {
        return m90755w(j);
    }

    /* renamed from: G */
    public static int m90729G(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: H */
    public static long m90730H(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: J */
    public static CodedOutputStream m90731J(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: K */
    private void m90732K() throws IOException {
        OutputStream outputStream = this.f63321e;
        if (outputStream != null) {
            outputStream.write(this.f63317a, 0, this.f63319c);
            this.f63319c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    /* renamed from: a */
    public static int m90733a(int i, boolean z) {
        return m90726D(i) + m90734b(z);
    }

    /* renamed from: b */
    public static int m90734b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m90735c(byte[] bArr) {
        return m90754v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m90736d(int i, C14485d dVar) {
        return m90726D(i) + m90737e(dVar);
    }

    /* renamed from: e */
    public static int m90737e(C14485d dVar) {
        return m90754v(dVar.size()) + dVar.size();
    }

    /* renamed from: f */
    public static int m90738f(int i, double d) {
        return m90726D(i) + m90739g(d);
    }

    /* renamed from: g */
    public static int m90739g(double d) {
        return 8;
    }

    /* renamed from: h */
    public static int m90740h(int i, int i2) {
        return m90726D(i) + m90741i(i2);
    }

    /* renamed from: i */
    public static int m90741i(int i) {
        return m90748p(i);
    }

    /* renamed from: j */
    public static int m90742j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m90743k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m90744l(int i, float f) {
        return m90726D(i) + m90745m(f);
    }

    /* renamed from: m */
    public static int m90745m(float f) {
        return 4;
    }

    /* renamed from: n */
    public static int m90746n(C14516o oVar) {
        return oVar.mo71015c();
    }

    /* renamed from: o */
    public static int m90747o(int i, int i2) {
        return m90726D(i) + m90748p(i2);
    }

    /* renamed from: p */
    public static int m90748p(int i) {
        if (i >= 0) {
            return m90754v(i);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m90749q(long j) {
        return m90755w(j);
    }

    /* renamed from: r */
    public static int m90750r(C14510k kVar) {
        int b = kVar.mo73419b();
        return m90754v(b) + b;
    }

    /* renamed from: s */
    public static int m90751s(int i, C14516o oVar) {
        return m90726D(i) + m90752t(oVar);
    }

    /* renamed from: t */
    public static int m90752t(C14516o oVar) {
        int c = oVar.mo71015c();
        return m90754v(c) + c;
    }

    /* renamed from: u */
    static int m90753u(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: v */
    public static int m90754v(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m90755w(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m90756x(int i) {
        return 4;
    }

    /* renamed from: y */
    public static int m90757y(long j) {
        return 8;
    }

    /* renamed from: z */
    public static int m90758z(int i) {
        return m90754v(m90729G(i));
    }

    /* renamed from: I */
    public void mo73234I() throws IOException {
        if (this.f63321e != null) {
            m90732K();
        }
    }

    /* renamed from: L */
    public void mo73235L(int i, boolean z) throws IOException {
        mo73272w0(i, 0);
        mo73236M(z);
    }

    /* renamed from: M */
    public void mo73236M(boolean z) throws IOException {
        mo73257h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void mo73237N(byte[] bArr) throws IOException {
        mo73264o0(bArr.length);
        mo73260k0(bArr);
    }

    /* renamed from: O */
    public void mo73238O(int i, C14485d dVar) throws IOException {
        mo73272w0(i, 2);
        mo73239P(dVar);
    }

    /* renamed from: P */
    public void mo73239P(C14485d dVar) throws IOException {
        mo73264o0(dVar.size());
        mo73258i0(dVar);
    }

    /* renamed from: Q */
    public void mo73240Q(int i, double d) throws IOException {
        mo73272w0(i, 1);
        mo73241R(d);
    }

    /* renamed from: R */
    public void mo73241R(double d) throws IOException {
        mo73263n0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: S */
    public void mo73242S(int i, int i2) throws IOException {
        mo73272w0(i, 0);
        mo73243T(i2);
    }

    /* renamed from: T */
    public void mo73243T(int i) throws IOException {
        mo73251b0(i);
    }

    /* renamed from: U */
    public void mo73244U(int i) throws IOException {
        mo73262m0(i);
    }

    /* renamed from: V */
    public void mo73245V(long j) throws IOException {
        mo73263n0(j);
    }

    /* renamed from: W */
    public void mo73246W(int i, float f) throws IOException {
        mo73272w0(i, 5);
        mo73247X(f);
    }

    /* renamed from: X */
    public void mo73247X(float f) throws IOException {
        mo73262m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: Y */
    public void mo73248Y(int i, C14516o oVar) throws IOException {
        mo73272w0(i, 3);
        mo73249Z(oVar);
        mo73272w0(i, 4);
    }

    /* renamed from: Z */
    public void mo73249Z(C14516o oVar) throws IOException {
        oVar.mo71018g(this);
    }

    /* renamed from: a0 */
    public void mo73250a0(int i, int i2) throws IOException {
        mo73272w0(i, 0);
        mo73251b0(i2);
    }

    /* renamed from: b0 */
    public void mo73251b0(int i) throws IOException {
        if (i >= 0) {
            mo73264o0(i);
        } else {
            mo73265p0((long) i);
        }
    }

    /* renamed from: c0 */
    public void mo73252c0(long j) throws IOException {
        mo73265p0(j);
    }

    /* renamed from: d0 */
    public void mo73253d0(int i, C14516o oVar) throws IOException {
        mo73272w0(i, 2);
        mo73254e0(oVar);
    }

    /* renamed from: e0 */
    public void mo73254e0(C14516o oVar) throws IOException {
        mo73264o0(oVar.mo71015c());
        oVar.mo71018g(this);
    }

    /* renamed from: f0 */
    public void mo73255f0(int i, C14516o oVar) throws IOException {
        mo73272w0(1, 3);
        mo73273x0(2, i);
        mo73253d0(3, oVar);
        mo73272w0(1, 4);
    }

    /* renamed from: g0 */
    public void mo73256g0(byte b) throws IOException {
        if (this.f63319c == this.f63318b) {
            m90732K();
        }
        byte[] bArr = this.f63317a;
        int i = this.f63319c;
        this.f63319c = i + 1;
        bArr[i] = b;
        this.f63320d++;
    }

    /* renamed from: h0 */
    public void mo73257h0(int i) throws IOException {
        mo73256g0((byte) i);
    }

    /* renamed from: i0 */
    public void mo73258i0(C14485d dVar) throws IOException {
        mo73259j0(dVar, 0, dVar.size());
    }

    /* renamed from: j0 */
    public void mo73259j0(C14485d dVar, int i, int i2) throws IOException {
        int i3 = this.f63318b;
        int i4 = this.f63319c;
        if (i3 - i4 >= i2) {
            dVar.mo73311k(this.f63317a, i, i4, i2);
            this.f63319c += i2;
            this.f63320d += i2;
            return;
        }
        int i5 = i3 - i4;
        dVar.mo73311k(this.f63317a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f63319c = this.f63318b;
        this.f63320d += i5;
        m90732K();
        if (i7 <= this.f63318b) {
            dVar.mo73311k(this.f63317a, i6, 0, i7);
            this.f63319c = i7;
        } else {
            dVar.mo73307F(this.f63321e, i6, i7);
        }
        this.f63320d += i7;
    }

    /* renamed from: k0 */
    public void mo73260k0(byte[] bArr) throws IOException {
        mo73261l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void mo73261l0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f63318b;
        int i4 = this.f63319c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f63317a, i4, i2);
            this.f63319c += i2;
            this.f63320d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f63317a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f63319c = this.f63318b;
        this.f63320d += i5;
        m90732K();
        if (i7 <= this.f63318b) {
            System.arraycopy(bArr, i6, this.f63317a, 0, i7);
            this.f63319c = i7;
        } else {
            this.f63321e.write(bArr, i6, i7);
        }
        this.f63320d += i7;
    }

    /* renamed from: m0 */
    public void mo73262m0(int i) throws IOException {
        mo73257h0(i & 255);
        mo73257h0((i >> 8) & 255);
        mo73257h0((i >> 16) & 255);
        mo73257h0((i >> 24) & 255);
    }

    /* renamed from: n0 */
    public void mo73263n0(long j) throws IOException {
        mo73257h0(((int) j) & 255);
        mo73257h0(((int) (j >> 8)) & 255);
        mo73257h0(((int) (j >> 16)) & 255);
        mo73257h0(((int) (j >> 24)) & 255);
        mo73257h0(((int) (j >> 32)) & 255);
        mo73257h0(((int) (j >> 40)) & 255);
        mo73257h0(((int) (j >> 48)) & 255);
        mo73257h0(((int) (j >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void mo73264o0(int i) throws IOException {
        while ((i & -128) != 0) {
            mo73257h0((i & 127) | 128);
            i >>>= 7;
        }
        mo73257h0(i);
    }

    /* renamed from: p0 */
    public void mo73265p0(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo73257h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo73257h0((int) j);
    }

    /* renamed from: q0 */
    public void mo73266q0(int i) throws IOException {
        mo73262m0(i);
    }

    /* renamed from: r0 */
    public void mo73267r0(long j) throws IOException {
        mo73263n0(j);
    }

    /* renamed from: s0 */
    public void mo73268s0(int i) throws IOException {
        mo73264o0(m90729G(i));
    }

    /* renamed from: t0 */
    public void mo73269t0(int i, long j) throws IOException {
        mo73272w0(i, 0);
        mo73270u0(j);
    }

    /* renamed from: u0 */
    public void mo73270u0(long j) throws IOException {
        mo73265p0(m90730H(j));
    }

    /* renamed from: v0 */
    public void mo73271v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo73264o0(bytes.length);
        mo73260k0(bytes);
    }

    /* renamed from: w0 */
    public void mo73272w0(int i, int i2) throws IOException {
        mo73264o0(C14539w.m91119c(i, i2));
    }

    /* renamed from: x0 */
    public void mo73273x0(int i, int i2) throws IOException {
        mo73272w0(i, 0);
        mo73274y0(i2);
    }

    /* renamed from: y0 */
    public void mo73274y0(int i) throws IOException {
        mo73264o0(i);
    }

    /* renamed from: z0 */
    public void mo73275z0(long j) throws IOException {
        mo73265p0(j);
    }
}
