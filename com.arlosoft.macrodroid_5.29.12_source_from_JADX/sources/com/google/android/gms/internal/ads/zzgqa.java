package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqa extends zzgqe {

    /* renamed from: f */
    private final Iterable f37027f;

    /* renamed from: g */
    private final Iterator f37028g;

    /* renamed from: h */
    private ByteBuffer f37029h;

    /* renamed from: i */
    private int f37030i;

    /* renamed from: j */
    private int f37031j;

    /* renamed from: k */
    private int f37032k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f37033l;

    /* renamed from: m */
    private int f37034m;

    /* renamed from: n */
    private long f37035n;

    /* renamed from: o */
    private long f37036o;

    /* renamed from: p */
    private long f37037p;

    /* synthetic */ zzgqa(Iterable iterable, int i, boolean z, zzgpz zzgpz) {
        super((zzgqd) null);
        this.f37030i = i;
        this.f37027f = iterable;
        this.f37028g = iterable.iterator();
        this.f37034m = 0;
        if (i == 0) {
            this.f37029h = zzgro.f37165e;
            this.f37035n = 0;
            this.f37036o = 0;
            this.f37037p = 0;
            return;
        }
        m52634H();
    }

    /* renamed from: D */
    private final int m52630D() {
        return (int) ((((long) (this.f37030i - this.f37034m)) - this.f37035n) + this.f37036o);
    }

    /* renamed from: E */
    private final void m52631E() throws zzgrq {
        if (this.f37028g.hasNext()) {
            m52634H();
            return;
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: F */
    private final void m52632F(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= m52630D()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.f37037p - this.f37035n == 0) {
                    m52631E();
                }
                int min = Math.min(i3, (int) (this.f37037p - this.f37035n));
                long j = (long) min;
                zzgui.m53453w(this.f37035n, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.f37035n += j;
            }
        } else if (i2 > 0) {
            throw zzgrq.m53040j();
        }
    }

    /* renamed from: G */
    private final void m52633G() {
        int i = this.f37030i + this.f37031j;
        this.f37030i = i;
        int i2 = this.f37032k;
        if (i > i2) {
            int i3 = i - i2;
            this.f37031j = i3;
            this.f37030i = i - i3;
            return;
        }
        this.f37031j = 0;
    }

    /* renamed from: H */
    private final void m52634H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f37028g.next();
        this.f37029h = byteBuffer;
        this.f37034m += (int) (this.f37035n - this.f37036o);
        long position = (long) byteBuffer.position();
        this.f37035n = position;
        this.f37036o = position;
        this.f37037p = (long) this.f37029h.limit();
        long m = zzgui.m53443m(this.f37029h);
        this.f37035n += m;
        this.f37036o += m;
        this.f37037p += m;
    }

    /* renamed from: A */
    public final String mo47112A() throws IOException {
        int K = mo47149K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f37037p;
            long j3 = this.f37035n;
            if (j <= j2 - j3) {
                String g = zzgun.m53476g(this.f37029h, (int) (j3 - this.f37036o), K);
                this.f37035n += j;
                return g;
            }
        }
        if (K >= 0 && K <= m52630D()) {
            byte[] bArr = new byte[K];
            m52632F(bArr, 0, K);
            return zzgun.m53477h(bArr, 0, K);
        } else if (K == 0) {
            return "";
        } else {
            if (K <= 0) {
                throw zzgrq.m53037f();
            }
            throw zzgrq.m53040j();
        }
    }

    /* renamed from: B */
    public final void mo47113B(int i) throws zzgrq {
        if (this.f37033l != i) {
            throw zzgrq.m53033b();
        }
    }

    /* renamed from: C */
    public final void mo47146C(int i) throws IOException {
        if (i >= 0 && ((long) i) <= (((long) (this.f37030i - this.f37034m)) - this.f37035n) + this.f37036o) {
            while (i > 0) {
                if (this.f37037p - this.f37035n == 0) {
                    m52631E();
                }
                int min = Math.min(i, (int) (this.f37037p - this.f37035n));
                i -= min;
                this.f37035n += (long) min;
            }
        } else if (i < 0) {
            throw zzgrq.m53037f();
        } else {
            throw zzgrq.m53040j();
        }
    }

    /* renamed from: I */
    public final byte mo47147I() throws IOException {
        if (this.f37037p - this.f37035n == 0) {
            m52631E();
        }
        long j = this.f37035n;
        this.f37035n = 1 + j;
        return zzgui.m53439i(j);
    }

    /* renamed from: J */
    public final int mo47148J() throws IOException {
        byte I;
        byte I2;
        long j = this.f37037p;
        long j2 = this.f37035n;
        if (j - j2 >= 4) {
            this.f37035n = 4 + j2;
            I = (zzgui.m53439i(j2) & 255) | ((zzgui.m53439i(1 + j2) & 255) << 8) | ((zzgui.m53439i(2 + j2) & 255) << 16);
            I2 = zzgui.m53439i(j2 + 3);
        } else {
            I = (mo47147I() & 255) | ((mo47147I() & 255) << 8) | ((mo47147I() & 255) << 16);
            I2 = mo47147I();
        }
        return I | ((I2 & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgui.m53439i(r4) >= 0) goto L_0x0089;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47149K() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f37035n
            long r2 = r10.f37037p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgui.m53439i(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.f37035n
            long r4 = r4 + r2
            r10.f37035n = r4
            return r0
        L_0x001a:
            long r6 = r10.f37037p
            long r8 = r10.f37035n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgui.m53439i(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.f37035n = r6
            return r0
        L_0x008c:
            long r0 = r10.mo47152N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqa.mo47149K():int");
    }

    /* renamed from: L */
    public final long mo47150L() throws IOException {
        long I;
        byte I2;
        long j = this.f37037p;
        long j2 = this.f37035n;
        if (j - j2 >= 8) {
            this.f37035n = 8 + j2;
            I = (((long) zzgui.m53439i(j2)) & 255) | ((((long) zzgui.m53439i(1 + j2)) & 255) << 8) | ((((long) zzgui.m53439i(2 + j2)) & 255) << 16) | ((((long) zzgui.m53439i(3 + j2)) & 255) << 24) | ((((long) zzgui.m53439i(4 + j2)) & 255) << 32) | ((((long) zzgui.m53439i(5 + j2)) & 255) << 40) | ((((long) zzgui.m53439i(6 + j2)) & 255) << 48);
            I2 = zzgui.m53439i(j2 + 7);
        } else {
            I = (((long) mo47147I()) & 255) | ((((long) mo47147I()) & 255) << 8) | ((((long) mo47147I()) & 255) << 16) | ((((long) mo47147I()) & 255) << 24) | ((((long) mo47147I()) & 255) << 32) | ((((long) mo47147I()) & 255) << 40) | ((((long) mo47147I()) & 255) << 48);
            I2 = mo47147I();
        }
        return I | ((((long) I2) & 255) << 56);
    }

    /* renamed from: M */
    public final long mo47151M() throws IOException {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f37035n;
        if (this.f37037p != j4) {
            long j5 = j4 + 1;
            byte i = zzgui.m53439i(j4);
            if (i >= 0) {
                this.f37035n++;
                return (long) i;
            } else if (this.f37037p - this.f37035n >= 10) {
                long j6 = j5 + 1;
                byte i2 = i ^ (zzgui.m53439i(j5) << 7);
                if (i2 < 0) {
                    b = i2 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = j6 + 1;
                    byte i3 = i2 ^ (zzgui.m53439i(j6) << 14);
                    if (i3 >= 0) {
                        j = (long) (i3 ^ 16256);
                    } else {
                        j6 = j7 + 1;
                        byte i4 = i3 ^ (zzgui.m53439i(j7) << 21);
                        if (i4 < 0) {
                            b = i4 ^ -2080896;
                        } else {
                            j7 = j6 + 1;
                            long i5 = ((long) i4) ^ (((long) zzgui.m53439i(j6)) << 28);
                            if (i5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long i6 = i5 ^ (((long) zzgui.m53439i(j7)) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    i5 = i6 ^ (((long) zzgui.m53439i(j8)) << 42);
                                    if (i5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        i6 = i5 ^ (((long) zzgui.m53439i(j7)) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (i6 ^ (((long) zzgui.m53439i(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) zzgui.m53439i(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f37035n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = i6 ^ j2;
                                j6 = j8;
                                this.f37035n = j6;
                                return j;
                            }
                            j = i5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f37035n = j6;
                    return j;
                }
                j = (long) b;
                this.f37035n = j6;
                return j;
            }
        }
        return mo47152N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final long mo47152N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = mo47147I();
            j |= ((long) (I & Byte.MAX_VALUE)) << i;
            if ((I & 128) == 0) {
                return j;
            }
        }
        throw zzgrq.m53036e();
    }

    /* renamed from: a */
    public final void mo47121a(int i) {
        this.f37032k = i;
        m52633G();
    }

    /* renamed from: b */
    public final boolean mo47122b() throws IOException {
        return (((long) this.f37034m) + this.f37035n) - this.f37036o == ((long) this.f37030i);
    }

    /* renamed from: c */
    public final boolean mo47123c() throws IOException {
        return mo47151M() != 0;
    }

    /* renamed from: d */
    public final boolean mo47124d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo47147I() >= 0) {
                    return true;
                }
            }
            throw zzgrq.m53036e();
        } else if (i2 == 1) {
            mo47146C(8);
            return true;
        } else if (i2 == 2) {
            mo47146C(mo47149K());
            return true;
        } else if (i2 == 3) {
            do {
                r = mo47134r();
                if (r == 0 || !mo47124d(r)) {
                    mo47113B(((i >>> 3) << 3) | 4);
                }
                r = mo47134r();
                break;
            } while (!mo47124d(r));
            mo47113B(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo47146C(4);
                return true;
            }
            throw zzgrq.m53032a();
        }
    }

    /* renamed from: i */
    public final double mo47125i() throws IOException {
        return Double.longBitsToDouble(mo47150L());
    }

    /* renamed from: j */
    public final float mo47126j() throws IOException {
        return Float.intBitsToFloat(mo47148J());
    }

    /* renamed from: k */
    public final int mo47127k() {
        return (int) ((((long) this.f37034m) + this.f37035n) - this.f37036o);
    }

    /* renamed from: l */
    public final int mo47128l(int i) throws zzgrq {
        if (i >= 0) {
            int k = i + mo47127k();
            int i2 = this.f37032k;
            if (k <= i2) {
                this.f37032k = k;
                m52633G();
                return i2;
            }
            throw zzgrq.m53040j();
        }
        throw zzgrq.m53037f();
    }

    /* renamed from: m */
    public final int mo47129m() throws IOException {
        return mo47149K();
    }

    /* renamed from: n */
    public final int mo47130n() throws IOException {
        return mo47148J();
    }

    /* renamed from: o */
    public final int mo47131o() throws IOException {
        return mo47149K();
    }

    /* renamed from: p */
    public final int mo47132p() throws IOException {
        return mo47148J();
    }

    /* renamed from: q */
    public final int mo47133q() throws IOException {
        return zzgqe.m52703e(mo47149K());
    }

    /* renamed from: r */
    public final int mo47134r() throws IOException {
        if (mo47122b()) {
            this.f37033l = 0;
            return 0;
        }
        int K = mo47149K();
        this.f37033l = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw zzgrq.m53034c();
    }

    /* renamed from: s */
    public final int mo47135s() throws IOException {
        return mo47149K();
    }

    /* renamed from: t */
    public final long mo47136t() throws IOException {
        return mo47150L();
    }

    /* renamed from: u */
    public final long mo47137u() throws IOException {
        return mo47151M();
    }

    /* renamed from: v */
    public final long mo47138v() throws IOException {
        return mo47150L();
    }

    /* renamed from: w */
    public final long mo47139w() throws IOException {
        return zzgqe.m52704f(mo47151M());
    }

    /* renamed from: x */
    public final long mo47140x() throws IOException {
        return mo47151M();
    }

    /* renamed from: y */
    public final zzgpw mo47141y() throws IOException {
        int K = mo47149K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f37037p;
            long j3 = this.f37035n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                zzgui.m53453w(j3, bArr, 0, j);
                this.f37035n += j;
                return zzgpw.m52568X(bArr);
            }
        }
        if (K > 0 && K <= m52630D()) {
            byte[] bArr2 = new byte[K];
            m52632F(bArr2, 0, K);
            return zzgpw.m52568X(bArr2);
        } else if (K == 0) {
            return zzgpw.f37012a;
        } else {
            if (K < 0) {
                throw zzgrq.m53037f();
            }
            throw zzgrq.m53040j();
        }
    }

    /* renamed from: z */
    public final String mo47142z() throws IOException {
        int K = mo47149K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f37037p;
            long j3 = this.f37035n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                zzgui.m53453w(j3, bArr, 0, j);
                String str = new String(bArr, zzgro.f37162b);
                this.f37035n += j;
                return str;
            }
        }
        if (K > 0 && K <= m52630D()) {
            byte[] bArr2 = new byte[K];
            m52632F(bArr2, 0, K);
            return new String(bArr2, zzgro.f37162b);
        } else if (K == 0) {
            return "";
        } else {
            if (K < 0) {
                throw zzgrq.m53037f();
            }
            throw zzgrq.m53040j();
        }
    }
}
