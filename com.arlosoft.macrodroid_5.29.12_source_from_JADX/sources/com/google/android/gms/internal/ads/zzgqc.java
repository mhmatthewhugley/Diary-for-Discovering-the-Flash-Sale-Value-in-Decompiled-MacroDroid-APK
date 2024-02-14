package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqc extends zzgqe {

    /* renamed from: f */
    private final InputStream f37038f;

    /* renamed from: g */
    private final byte[] f37039g;

    /* renamed from: h */
    private int f37040h;

    /* renamed from: i */
    private int f37041i;

    /* renamed from: j */
    private int f37042j;

    /* renamed from: k */
    private int f37043k;

    /* renamed from: l */
    private int f37044l;

    /* renamed from: m */
    private int f37045m = Integer.MAX_VALUE;

    /* synthetic */ zzgqc(InputStream inputStream, int i, zzgqb zzgqb) {
        super((zzgqd) null);
        zzgro.m53028f(inputStream, "input");
        this.f37038f = inputStream;
        this.f37039g = new byte[4096];
        this.f37040h = 0;
        this.f37042j = 0;
        this.f37044l = 0;
    }

    /* renamed from: D */
    private final List m52666D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f37038f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f37044l += read;
                    i2 += read;
                } else {
                    throw zzgrq.m53040j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: E */
    private final void m52667E() {
        int i = this.f37040h + this.f37041i;
        this.f37040h = i;
        int i2 = this.f37044l + i;
        int i3 = this.f37045m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f37041i = i4;
            this.f37040h = i - i4;
            return;
        }
        this.f37041i = 0;
    }

    /* renamed from: F */
    private final void m52668F(int i) throws IOException {
        if (m52669G(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f37044l) - this.f37042j) {
            throw zzgrq.m53039i();
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: G */
    private final boolean m52669G(int i) throws IOException {
        int i2 = this.f37042j;
        int i3 = this.f37040h;
        if (i2 + i > i3) {
            int i4 = this.f37044l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f37045m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f37039g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f37044l + i2;
                this.f37044l = i4;
                i3 = this.f37040h - i2;
                this.f37040h = i3;
                this.f37042j = 0;
            }
            try {
                int read = this.f37038f.read(this.f37039g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f37038f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f37040h += read;
                    m52667E();
                    if (this.f37040h >= i) {
                        return true;
                    }
                    return m52669G(i);
                }
            } catch (zzgrq e) {
                e.mo47366k();
                throw e;
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
    }

    /* renamed from: H */
    private final byte[] m52670H(int i, boolean z) throws IOException {
        byte[] I = m52671I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.f37042j;
        int i3 = this.f37040h;
        int i4 = i3 - i2;
        this.f37044l += i3;
        this.f37042j = 0;
        this.f37040h = 0;
        List<byte[]> D = m52666D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f37039g, i2, bArr, 0, i4);
        for (byte[] bArr2 : D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: I */
    private final byte[] m52671I(int i) throws IOException {
        if (i == 0) {
            return zzgro.f37164d;
        }
        if (i >= 0) {
            int i2 = this.f37044l;
            int i3 = this.f37042j;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.f37045m;
                if (i4 <= i5) {
                    int i6 = this.f37040h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f37038f.available()) {
                                return null;
                            }
                        } catch (zzgrq e) {
                            e.mo47366k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f37039g, this.f37042j, bArr, 0, i6);
                    this.f37044l += this.f37040h;
                    this.f37042j = 0;
                    this.f37040h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f37038f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f37044l += read;
                                i6 += read;
                            } else {
                                throw zzgrq.m53040j();
                            }
                        } catch (zzgrq e2) {
                            e2.mo47366k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo47153C((i5 - i2) - i3);
                throw zzgrq.m53040j();
            }
            throw zzgrq.m53039i();
        }
        throw zzgrq.m53037f();
    }

    /* renamed from: A */
    public final String mo47112A() throws IOException {
        byte[] bArr;
        int L = mo47156L();
        int i = this.f37042j;
        int i2 = this.f37040h;
        if (L <= i2 - i && L > 0) {
            bArr = this.f37039g;
            this.f37042j = i + L;
        } else if (L == 0) {
            return "";
        } else {
            if (L <= i2) {
                m52668F(L);
                bArr = this.f37039g;
                this.f37042j = L;
            } else {
                bArr = m52670H(L, false);
            }
            i = 0;
        }
        return zzgun.m53477h(bArr, i, L);
    }

    /* renamed from: B */
    public final void mo47113B(int i) throws zzgrq {
        if (this.f37043k != i) {
            throw zzgrq.m53033b();
        }
    }

    /* renamed from: C */
    public final void mo47153C(int i) throws IOException {
        int i2 = this.f37040h;
        int i3 = this.f37042j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f37042j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f37044l;
            int i6 = i5 + i3;
            int i7 = this.f37045m;
            if (i6 + i <= i7) {
                this.f37044l = i6;
                this.f37040h = 0;
                this.f37042j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f37038f.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f37038f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (zzgrq e) {
                        e.mo47366k();
                        throw e;
                    } catch (Throwable th) {
                        this.f37044l += i4;
                        m52667E();
                        throw th;
                    }
                }
                this.f37044l += i4;
                m52667E();
                if (i4 < i) {
                    int i9 = this.f37040h;
                    int i10 = i9 - this.f37042j;
                    this.f37042j = i9;
                    m52668F(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f37040h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f37042j = i12;
                            m52668F(1);
                        } else {
                            this.f37042j = i11;
                            return;
                        }
                    }
                }
            } else {
                mo47153C((i7 - i5) - i3);
                throw zzgrq.m53040j();
            }
        } else {
            throw zzgrq.m53037f();
        }
    }

    /* renamed from: J */
    public final byte mo47154J() throws IOException {
        if (this.f37042j == this.f37040h) {
            m52668F(1);
        }
        byte[] bArr = this.f37039g;
        int i = this.f37042j;
        this.f37042j = i + 1;
        return bArr[i];
    }

    /* renamed from: K */
    public final int mo47155K() throws IOException {
        int i = this.f37042j;
        if (this.f37040h - i < 4) {
            m52668F(4);
            i = this.f37042j;
        }
        byte[] bArr = this.f37039g;
        this.f37042j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47156L() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f37042j
            int r1 = r5.f37040h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f37039g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f37042j = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f37042j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo47159O()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqc.mo47156L():int");
    }

    /* renamed from: M */
    public final long mo47157M() throws IOException {
        int i = this.f37042j;
        if (this.f37040h - i < 8) {
            m52668F(8);
            i = this.f37042j;
        }
        byte[] bArr = this.f37039g;
        this.f37042j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: N */
    public final long mo47158N() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f37042j;
        int i2 = this.f37040h;
        if (i2 != i) {
            byte[] bArr = this.f37039g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f37042j = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f37042j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f37042j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f37042j = i4;
                    return j;
                }
                j = (long) b;
                this.f37042j = i4;
                return j;
            }
        }
        return mo47159O();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final long mo47159O() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte J = mo47154J();
            j |= ((long) (J & Byte.MAX_VALUE)) << i;
            if ((J & 128) == 0) {
                return j;
            }
        }
        throw zzgrq.m53036e();
    }

    /* renamed from: a */
    public final void mo47121a(int i) {
        this.f37045m = i;
        m52667E();
    }

    /* renamed from: b */
    public final boolean mo47122b() throws IOException {
        return this.f37042j == this.f37040h && !m52669G(1);
    }

    /* renamed from: c */
    public final boolean mo47123c() throws IOException {
        return mo47158N() != 0;
    }

    /* renamed from: d */
    public final boolean mo47124d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f37040h - this.f37042j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f37039g;
                    int i4 = this.f37042j;
                    this.f37042j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzgrq.m53036e();
            }
            while (i3 < 10) {
                if (mo47154J() < 0) {
                    i3++;
                }
            }
            throw zzgrq.m53036e();
            return true;
        } else if (i2 == 1) {
            mo47153C(8);
            return true;
        } else if (i2 == 2) {
            mo47153C(mo47156L());
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
                mo47153C(4);
                return true;
            }
            throw zzgrq.m53032a();
        }
    }

    /* renamed from: i */
    public final double mo47125i() throws IOException {
        return Double.longBitsToDouble(mo47157M());
    }

    /* renamed from: j */
    public final float mo47126j() throws IOException {
        return Float.intBitsToFloat(mo47155K());
    }

    /* renamed from: k */
    public final int mo47127k() {
        return this.f37044l + this.f37042j;
    }

    /* renamed from: l */
    public final int mo47128l(int i) throws zzgrq {
        if (i >= 0) {
            int i2 = i + this.f37044l + this.f37042j;
            int i3 = this.f37045m;
            if (i2 <= i3) {
                this.f37045m = i2;
                m52667E();
                return i3;
            }
            throw zzgrq.m53040j();
        }
        throw zzgrq.m53037f();
    }

    /* renamed from: m */
    public final int mo47129m() throws IOException {
        return mo47156L();
    }

    /* renamed from: n */
    public final int mo47130n() throws IOException {
        return mo47155K();
    }

    /* renamed from: o */
    public final int mo47131o() throws IOException {
        return mo47156L();
    }

    /* renamed from: p */
    public final int mo47132p() throws IOException {
        return mo47155K();
    }

    /* renamed from: q */
    public final int mo47133q() throws IOException {
        return zzgqe.m52703e(mo47156L());
    }

    /* renamed from: r */
    public final int mo47134r() throws IOException {
        if (mo47122b()) {
            this.f37043k = 0;
            return 0;
        }
        int L = mo47156L();
        this.f37043k = L;
        if ((L >>> 3) != 0) {
            return L;
        }
        throw zzgrq.m53034c();
    }

    /* renamed from: s */
    public final int mo47135s() throws IOException {
        return mo47156L();
    }

    /* renamed from: t */
    public final long mo47136t() throws IOException {
        return mo47157M();
    }

    /* renamed from: u */
    public final long mo47137u() throws IOException {
        return mo47158N();
    }

    /* renamed from: v */
    public final long mo47138v() throws IOException {
        return mo47157M();
    }

    /* renamed from: w */
    public final long mo47139w() throws IOException {
        return zzgqe.m52704f(mo47158N());
    }

    /* renamed from: x */
    public final long mo47140x() throws IOException {
        return mo47158N();
    }

    /* renamed from: y */
    public final zzgpw mo47141y() throws IOException {
        int L = mo47156L();
        int i = this.f37040h;
        int i2 = this.f37042j;
        if (L <= i - i2 && L > 0) {
            zzgpw T = zzgpw.m52565T(this.f37039g, i2, L);
            this.f37042j += L;
            return T;
        } else if (L == 0) {
            return zzgpw.f37012a;
        } else {
            byte[] I = m52671I(L);
            if (I != null) {
                return zzgpw.m52564R(I);
            }
            int i3 = this.f37042j;
            int i4 = this.f37040h;
            int i5 = i4 - i3;
            this.f37044l += i4;
            this.f37042j = 0;
            this.f37040h = 0;
            List<byte[]> D = m52666D(L - i5);
            byte[] bArr = new byte[L];
            System.arraycopy(this.f37039g, i3, bArr, 0, i5);
            for (byte[] bArr2 : D) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return zzgpw.m52568X(bArr);
        }
    }

    /* renamed from: z */
    public final String mo47142z() throws IOException {
        int L = mo47156L();
        if (L > 0) {
            int i = this.f37040h;
            int i2 = this.f37042j;
            if (L <= i - i2) {
                String str = new String(this.f37039g, i2, L, zzgro.f37162b);
                this.f37042j += L;
                return str;
            }
        }
        if (L == 0) {
            return "";
        }
        if (L > this.f37040h) {
            return new String(m52670H(L, false), zzgro.f37162b);
        }
        m52668F(L);
        String str2 = new String(this.f37039g, this.f37042j, L, zzgro.f37162b);
        this.f37042j += L;
        return str2;
    }
}
