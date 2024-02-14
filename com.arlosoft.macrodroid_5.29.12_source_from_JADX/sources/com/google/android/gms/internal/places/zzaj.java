package com.google.android.gms.internal.places;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzaj extends zzt {

    /* renamed from: b */
    private static final Logger f45159b = Logger.getLogger(zzaj.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f45160c = zzdy.m63690o();

    /* renamed from: a */
    zzam f45161a;

    static class zzb extends zzaj {

        /* renamed from: d */
        private final byte[] f45162d;

        /* renamed from: e */
        private final int f45163e;

        /* renamed from: f */
        private final int f45164f;

        /* renamed from: g */
        private int f45165g;

        zzb(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                this.f45162d = bArr;
                this.f45163e = 0;
                this.f45165g = 0;
                this.f45164f = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
        }

        /* renamed from: F0 */
        private final void m63178F0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f45162d, this.f45165g, i2);
                this.f45165g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: B */
        public final void mo53322B(int i, zzw zzw) throws IOException {
            mo53353z(1, 3);
            mo53332V(2, i);
            mo53344m(3, zzw);
            mo53353z(1, 4);
        }

        /* renamed from: C */
        public final void mo53323C(int i, boolean z) throws IOException {
            mo53353z(i, 0);
            mo53327M(z ? (byte) 1 : 0);
        }

        /* renamed from: D */
        public final void mo53324D(long j) throws IOException {
            if (!zzaj.f45160c || mo53336b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f45162d;
                    int i = this.f45165g;
                    this.f45165g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45162d;
                    int i2 = this.f45165g;
                    this.f45165g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f45162d;
                    int i3 = this.f45165g;
                    this.f45165g = i3 + 1;
                    zzdy.m63684i(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f45162d;
                int i4 = this.f45165g;
                this.f45165g = i4 + 1;
                zzdy.m63684i(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: E */
        public final void mo53325E(zzck zzck) throws IOException {
            mo53350t0(zzck.mo53446b());
            zzck.mo53449e(this);
        }

        /* renamed from: M */
        public final void mo53327M(byte b) throws IOException {
            try {
                byte[] bArr = this.f45162d;
                int i = this.f45165g;
                this.f45165g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), 1}), e);
            }
        }

        /* renamed from: O */
        public final void mo53329O(int i, int i2) throws IOException {
            mo53353z(i, 0);
            mo53349s0(i2);
        }

        /* renamed from: P */
        public final void mo53330P(int i, long j) throws IOException {
            mo53353z(i, 1);
            mo53333W(j);
        }

        /* renamed from: V */
        public final void mo53332V(int i, int i2) throws IOException {
            mo53353z(i, 0);
            mo53350t0(i2);
        }

        /* renamed from: W */
        public final void mo53333W(long j) throws IOException {
            try {
                byte[] bArr = this.f45162d;
                int i = this.f45165g;
                int i2 = i + 1;
                this.f45165g = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.f45165g = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.f45165g = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.f45165g = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.f45165g = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.f45165g = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.f45165g = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f45165g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), 1}), e);
            }
        }

        /* renamed from: X */
        public final void mo53334X(byte[] bArr, int i, int i2) throws IOException {
            mo53350t0(i2);
            m63178F0(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo53354a(byte[] bArr, int i, int i2) throws IOException {
            m63178F0(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo53336b() {
            return this.f45164f - this.f45165g;
        }

        /* renamed from: d0 */
        public final void mo53337d0(int i, int i2) throws IOException {
            mo53353z(i, 5);
            mo53352v0(i2);
        }

        /* renamed from: j */
        public final void mo53341j(int i, long j) throws IOException {
            mo53353z(i, 0);
            mo53324D(j);
        }

        /* renamed from: k */
        public final void mo53342k(int i, zzck zzck) throws IOException {
            mo53353z(1, 3);
            mo53332V(2, i);
            mo53353z(3, 2);
            mo53325E(zzck);
            mo53353z(1, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public final void mo53343l(int i, zzck zzck, zzda zzda) throws IOException {
            mo53353z(i, 2);
            zzm zzm = (zzm) zzck;
            int h = zzm.mo53453h();
            if (h == -1) {
                h = zzda.mo53540f(zzm);
                zzm.mo53452g(h);
            }
            mo53350t0(h);
            zzda.mo53541g(zzck, this.f45161a);
        }

        /* renamed from: m */
        public final void mo53344m(int i, zzw zzw) throws IOException {
            mo53353z(i, 2);
            mo53347o(zzw);
        }

        /* renamed from: m0 */
        public final void mo53345m0(String str) throws IOException {
            int i = this.f45165g;
            try {
                int y0 = zzaj.m63143y0(str.length() * 3);
                int y02 = zzaj.m63143y0(str.length());
                if (y02 == y0) {
                    int i2 = i + y02;
                    this.f45165g = i2;
                    int d = zzea.m63759d(str, this.f45162d, i2, mo53336b());
                    this.f45165g = i;
                    mo53350t0((d - i) - y02);
                    this.f45165g = d;
                    return;
                }
                mo53350t0(zzea.m63758c(str));
                this.f45165g = zzea.m63759d(str, this.f45162d, this.f45165g, mo53336b());
            } catch (zzee e) {
                this.f45165g = i;
                mo53348p(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: n */
        public final void mo53346n(int i, String str) throws IOException {
            mo53353z(i, 2);
            mo53345m0(str);
        }

        /* renamed from: o */
        public final void mo53347o(zzw zzw) throws IOException {
            mo53350t0(zzw.size());
            zzw.mo53315l(this);
        }

        /* renamed from: s0 */
        public final void mo53349s0(int i) throws IOException {
            if (i >= 0) {
                mo53350t0(i);
            } else {
                mo53324D((long) i);
            }
        }

        /* renamed from: t0 */
        public final void mo53350t0(int i) throws IOException {
            if (!zzaj.f45160c || zzp.m63835b() || mo53336b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f45162d;
                    int i2 = this.f45165g;
                    this.f45165g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45162d;
                    int i3 = this.f45165g;
                    this.f45165g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f45162d;
                int i4 = this.f45165g;
                this.f45165g = i4 + 1;
                zzdy.m63684i(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f45162d;
                int i5 = this.f45165g;
                this.f45165g = i5 + 1;
                zzdy.m63684i(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f45162d;
                    int i7 = this.f45165g;
                    this.f45165g = i7 + 1;
                    zzdy.m63684i(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f45162d;
                int i8 = this.f45165g;
                this.f45165g = i8 + 1;
                zzdy.m63684i(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f45162d;
                    int i10 = this.f45165g;
                    this.f45165g = i10 + 1;
                    zzdy.m63684i(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f45162d;
                int i11 = this.f45165g;
                this.f45165g = i11 + 1;
                zzdy.m63684i(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f45162d;
                    int i13 = this.f45165g;
                    this.f45165g = i13 + 1;
                    zzdy.m63684i(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f45162d;
                int i14 = this.f45165g;
                this.f45165g = i14 + 1;
                zzdy.m63684i(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f45162d;
                int i15 = this.f45165g;
                this.f45165g = i15 + 1;
                zzdy.m63684i(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: v0 */
        public final void mo53352v0(int i) throws IOException {
            try {
                byte[] bArr = this.f45162d;
                int i2 = this.f45165g;
                int i3 = i2 + 1;
                this.f45165g = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f45165g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f45165g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f45165g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45165g), Integer.valueOf(this.f45164f), 1}), e);
            }
        }

        /* renamed from: z */
        public final void mo53353z(int i, int i2) throws IOException {
            mo53350t0((i << 3) | i2);
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzaj.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzaj() {
    }

    /* renamed from: A0 */
    public static int m63096A0(int i) {
        return 4;
    }

    /* renamed from: B0 */
    public static int m63097B0(int i) {
        return 4;
    }

    /* renamed from: C0 */
    public static int m63098C0(int i) {
        return m63141x0(i);
    }

    /* renamed from: D0 */
    private static int m63099D0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: E0 */
    public static int m63100E0(int i) {
        return m63143y0(i);
    }

    @Deprecated
    /* renamed from: G */
    static int m63101G(int i, zzck zzck, zzda zzda) {
        int w0 = m63139w0(i) << 1;
        zzm zzm = (zzm) zzck;
        int h = zzm.mo53453h();
        if (h == -1) {
            h = zzda.mo53540f(zzm);
            zzm.mo53452g(h);
        }
        return w0 + h;
    }

    /* renamed from: H */
    public static int m63102H(int i, zzw zzw) {
        int w0 = m63139w0(i);
        int size = zzw.size();
        return w0 + m63143y0(size) + size;
    }

    /* renamed from: I */
    public static int m63103I(int i, boolean z) {
        return m63139w0(i) + 1;
    }

    /* renamed from: J */
    public static int m63104J(zzck zzck) {
        int b = zzck.mo53446b();
        return m63143y0(b) + b;
    }

    /* renamed from: K */
    public static int m63105K(boolean z) {
        return 1;
    }

    /* renamed from: L */
    public static int m63106L(byte[] bArr) {
        int length = bArr.length;
        return m63143y0(length) + length;
    }

    /* renamed from: R */
    public static int m63107R(float f) {
        return 4;
    }

    /* renamed from: S */
    public static int m63108S(int i, long j) {
        return m63139w0(i) + m63115c0(j);
    }

    /* renamed from: T */
    public static int m63109T(int i, zzw zzw) {
        return (m63139w0(1) << 1) + m63122h0(2, i) + m63102H(3, zzw);
    }

    @Deprecated
    /* renamed from: U */
    public static int m63110U(zzck zzck) {
        return zzck.mo53446b();
    }

    /* renamed from: Y */
    public static int m63111Y(int i, long j) {
        return m63139w0(i) + m63115c0(j);
    }

    /* renamed from: Z */
    public static int m63112Z(long j) {
        return m63115c0(j);
    }

    /* renamed from: b0 */
    public static int m63113b0(int i, long j) {
        return m63139w0(i) + m63115c0(m63129p0(j));
    }

    /* renamed from: c0 */
    public static int m63115c0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: d */
    public static int m63116d(int i, zzbp zzbp) {
        int w0 = m63139w0(i);
        int a = zzbp.mo53485a();
        return w0 + m63143y0(a) + a;
    }

    /* renamed from: e */
    public static int m63117e(zzbp zzbp) {
        int a = zzbp.mo53485a();
        return m63143y0(a) + a;
    }

    /* renamed from: e0 */
    public static int m63118e0(int i, int i2) {
        return m63139w0(i) + m63141x0(i2);
    }

    /* renamed from: f */
    static int m63119f(zzck zzck, zzda zzda) {
        zzm zzm = (zzm) zzck;
        int h = zzm.mo53453h();
        if (h == -1) {
            h = zzda.mo53540f(zzm);
            zzm.mo53452g(h);
        }
        return m63143y0(h) + h;
    }

    /* renamed from: f0 */
    public static int m63120f0(int i, long j) {
        return m63139w0(i) + 8;
    }

    /* renamed from: g0 */
    public static int m63121g0(long j) {
        return m63115c0(m63129p0(j));
    }

    /* renamed from: h0 */
    public static int m63122h0(int i, int i2) {
        return m63139w0(i) + m63143y0(i2);
    }

    /* renamed from: i0 */
    public static int m63123i0(int i, long j) {
        return m63139w0(i) + 8;
    }

    /* renamed from: j0 */
    public static int m63124j0(long j) {
        return 8;
    }

    /* renamed from: k0 */
    public static int m63125k0(int i, int i2) {
        return m63139w0(i) + m63143y0(m63099D0(i2));
    }

    /* renamed from: l0 */
    public static int m63126l0(long j) {
        return 8;
    }

    /* renamed from: n0 */
    public static int m63127n0(int i, int i2) {
        return m63139w0(i) + 4;
    }

    /* renamed from: o0 */
    public static int m63128o0(String str) {
        int i;
        try {
            i = zzea.m63758c(str);
        } catch (zzee unused) {
            i = str.getBytes(zzbd.f45276a).length;
        }
        return m63143y0(i) + i;
    }

    /* renamed from: p0 */
    private static long m63129p0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: q */
    public static int m63130q(double d) {
        return 8;
    }

    /* renamed from: q0 */
    public static int m63131q0(int i, int i2) {
        return m63139w0(i) + 4;
    }

    /* renamed from: r */
    public static int m63132r(int i, double d) {
        return m63139w0(i) + 8;
    }

    /* renamed from: r0 */
    public static int m63133r0(int i, int i2) {
        return m63139w0(i) + m63141x0(i2);
    }

    /* renamed from: s */
    public static int m63134s(int i, float f) {
        return m63139w0(i) + 4;
    }

    /* renamed from: t */
    public static int m63135t(int i, zzbp zzbp) {
        return (m63139w0(1) << 1) + m63122h0(2, i) + m63116d(3, zzbp);
    }

    /* renamed from: u */
    public static int m63136u(int i, zzck zzck) {
        return (m63139w0(1) << 1) + m63122h0(2, i) + m63139w0(3) + m63104J(zzck);
    }

    /* renamed from: v */
    static int m63137v(int i, zzck zzck, zzda zzda) {
        return m63139w0(i) + m63119f(zzck, zzda);
    }

    /* renamed from: w */
    public static int m63138w(int i, String str) {
        return m63139w0(i) + m63128o0(str);
    }

    /* renamed from: w0 */
    public static int m63139w0(int i) {
        return m63143y0(i << 3);
    }

    /* renamed from: x */
    public static int m63140x(zzw zzw) {
        int size = zzw.size();
        return m63143y0(size) + size;
    }

    /* renamed from: x0 */
    public static int m63141x0(int i) {
        if (i >= 0) {
            return m63143y0(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static zzaj m63142y(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    /* renamed from: y0 */
    public static int m63143y0(int i) {
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

    /* renamed from: z0 */
    public static int m63144z0(int i) {
        return m63143y0(m63099D0(i));
    }

    /* renamed from: A */
    public final void mo53321A(int i, long j) throws IOException {
        mo53341j(i, m63129p0(j));
    }

    /* renamed from: B */
    public abstract void mo53322B(int i, zzw zzw) throws IOException;

    /* renamed from: C */
    public abstract void mo53323C(int i, boolean z) throws IOException;

    /* renamed from: D */
    public abstract void mo53324D(long j) throws IOException;

    /* renamed from: E */
    public abstract void mo53325E(zzck zzck) throws IOException;

    /* renamed from: F */
    public final void mo53326F(boolean z) throws IOException {
        mo53327M(z ? (byte) 1 : 0);
    }

    /* renamed from: M */
    public abstract void mo53327M(byte b) throws IOException;

    /* renamed from: N */
    public final void mo53328N(float f) throws IOException {
        mo53352v0(Float.floatToRawIntBits(f));
    }

    /* renamed from: O */
    public abstract void mo53329O(int i, int i2) throws IOException;

    /* renamed from: P */
    public abstract void mo53330P(int i, long j) throws IOException;

    /* renamed from: Q */
    public final void mo53331Q(long j) throws IOException {
        mo53324D(m63129p0(j));
    }

    /* renamed from: V */
    public abstract void mo53332V(int i, int i2) throws IOException;

    /* renamed from: W */
    public abstract void mo53333W(long j) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract void mo53334X(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a0 */
    public final void mo53335a0(int i, int i2) throws IOException {
        mo53332V(i, m63099D0(i2));
    }

    /* renamed from: b */
    public abstract int mo53336b();

    /* renamed from: d0 */
    public abstract void mo53337d0(int i, int i2) throws IOException;

    /* renamed from: g */
    public final void mo53338g(double d) throws IOException {
        mo53333W(Double.doubleToRawLongBits(d));
    }

    /* renamed from: h */
    public final void mo53339h(int i, double d) throws IOException {
        mo53330P(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo53340i(int i, float f) throws IOException {
        mo53337d0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo53341j(int i, long j) throws IOException;

    /* renamed from: k */
    public abstract void mo53342k(int i, zzck zzck) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo53343l(int i, zzck zzck, zzda zzda) throws IOException;

    /* renamed from: m */
    public abstract void mo53344m(int i, zzw zzw) throws IOException;

    /* renamed from: m0 */
    public abstract void mo53345m0(String str) throws IOException;

    /* renamed from: n */
    public abstract void mo53346n(int i, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo53347o(zzw zzw) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo53348p(String str, zzee zzee) throws IOException {
        f45159b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzee);
        byte[] bytes = str.getBytes(zzbd.f45276a);
        try {
            mo53350t0(bytes.length);
            mo53354a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: s0 */
    public abstract void mo53349s0(int i) throws IOException;

    /* renamed from: t0 */
    public abstract void mo53350t0(int i) throws IOException;

    /* renamed from: u0 */
    public final void mo53351u0(int i) throws IOException {
        mo53350t0(m63099D0(i));
    }

    /* renamed from: v0 */
    public abstract void mo53352v0(int i) throws IOException;

    /* renamed from: z */
    public abstract void mo53353z(int i, int i2) throws IOException;
}
