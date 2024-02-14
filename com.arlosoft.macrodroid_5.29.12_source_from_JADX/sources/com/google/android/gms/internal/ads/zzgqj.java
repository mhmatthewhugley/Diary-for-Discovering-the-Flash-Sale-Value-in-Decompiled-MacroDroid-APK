package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqj extends zzgqg {

    /* renamed from: h */
    private final OutputStream f37062h;

    zzgqj(OutputStream outputStream, int i) {
        super(i);
        this.f37062h = outputStream;
    }

    /* renamed from: N */
    private final void m52803N() throws IOException {
        this.f37062h.write(this.f37055d, 0, this.f37057f);
        this.f37057f = 0;
    }

    /* renamed from: O */
    private final void m52804O(int i) throws IOException {
        if (this.f37056e - this.f37057f < i) {
            m52803N();
        }
    }

    /* renamed from: A */
    public final void mo47206A(int i, int i2) throws IOException {
        m52804O(20);
        mo47203L(i << 3);
        mo47203L(i2);
    }

    /* renamed from: B */
    public final void mo47207B(int i) throws IOException {
        m52804O(5);
        mo47203L(i);
    }

    /* renamed from: C */
    public final void mo47208C(int i, long j) throws IOException {
        m52804O(20);
        mo47203L(i << 3);
        mo47204M(j);
    }

    /* renamed from: D */
    public final void mo47209D(long j) throws IOException {
        m52804O(10);
        mo47204M(j);
    }

    /* renamed from: P */
    public final void mo47225P(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f37056e;
        int i4 = this.f37057f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f37055d, i4, i2);
            this.f37057f += i2;
            this.f37058g += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f37055d, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f37057f = this.f37056e;
        this.f37058g += i5;
        m52803N();
        if (i7 <= this.f37056e) {
            System.arraycopy(bArr, i6, this.f37055d, 0, i7);
            this.f37057f = i7;
        } else {
            this.f37062h.write(bArr, i6, i7);
        }
        this.f37058g += i7;
    }

    /* renamed from: Q */
    public final void mo47226Q(String str) throws IOException {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int f = zzgql.m52833f(length);
            int i3 = f + length;
            int i4 = this.f37056e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int d = zzgun.m53473d(str, bArr, 0, length);
                mo47207B(d);
                mo47225P(bArr, 0, d);
                return;
            }
            if (i3 > i4 - this.f37057f) {
                m52803N();
            }
            int f2 = zzgql.m52833f(str.length());
            i = this.f37057f;
            if (f2 == f) {
                int i5 = i + f2;
                this.f37057f = i5;
                int d2 = zzgun.m53473d(str, this.f37055d, i5, this.f37056e - i5);
                this.f37057f = i;
                i2 = (d2 - i) - f2;
                mo47203L(i2);
                this.f37057f = d2;
            } else {
                i2 = zzgun.m53474e(str);
                mo47203L(i2);
                this.f37057f = zzgun.m53473d(str, this.f37055d, this.f37057f, i2);
            }
            this.f37058g += i2;
        } catch (zzgum e) {
            this.f37058g -= this.f37057f - i;
            this.f37057f = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzgqi(e2);
        } catch (zzgum e3) {
            mo47228k(str, e3);
        }
    }

    /* renamed from: a */
    public final void mo47074a(byte[] bArr, int i, int i2) throws IOException {
        mo47225P(bArr, i, i2);
    }

    /* renamed from: m */
    public final void mo47212m() throws IOException {
        if (this.f37057f > 0) {
            m52803N();
        }
    }

    /* renamed from: n */
    public final void mo47213n(byte b) throws IOException {
        if (this.f37057f == this.f37056e) {
            m52803N();
        }
        mo47200I(b);
    }

    /* renamed from: o */
    public final void mo47214o(int i, boolean z) throws IOException {
        m52804O(11);
        mo47203L(i << 3);
        mo47200I(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo47215p(int i, zzgpw zzgpw) throws IOException {
        mo47207B((i << 3) | 2);
        mo47207B(zzgpw.mo47083m());
        zzgpw.mo47090F(this);
    }

    /* renamed from: r */
    public final void mo47216r(int i, int i2) throws IOException {
        m52804O(14);
        mo47203L((i << 3) | 5);
        mo47201J(i2);
    }

    /* renamed from: s */
    public final void mo47217s(int i) throws IOException {
        m52804O(4);
        mo47201J(i);
    }

    /* renamed from: t */
    public final void mo47218t(int i, long j) throws IOException {
        m52804O(18);
        mo47203L((i << 3) | 1);
        mo47202K(j);
    }

    /* renamed from: u */
    public final void mo47219u(long j) throws IOException {
        m52804O(8);
        mo47202K(j);
    }

    /* renamed from: v */
    public final void mo47220v(int i, int i2) throws IOException {
        m52804O(20);
        mo47203L(i << 3);
        if (i2 >= 0) {
            mo47203L(i2);
        } else {
            mo47204M((long) i2);
        }
    }

    /* renamed from: w */
    public final void mo47221w(int i) throws IOException {
        if (i >= 0) {
            mo47207B(i);
        } else {
            mo47209D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo47222x(int i, zzgso zzgso, zzgth zzgth) throws IOException {
        mo47207B((i << 3) | 2);
        zzgpf zzgpf = (zzgpf) zzgso;
        int a = zzgpf.mo47047a();
        if (a == -1) {
            a = zzgth.mo47412a(zzgpf);
            zzgpf.mo47048d(a);
        }
        mo47207B(a);
        zzgth.mo47420i(zzgso, this.f37065a);
    }

    /* renamed from: y */
    public final void mo47223y(int i, String str) throws IOException {
        mo47207B((i << 3) | 2);
        mo47226Q(str);
    }

    /* renamed from: z */
    public final void mo47224z(int i, int i2) throws IOException {
        mo47207B((i << 3) | i2);
    }
}
