package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacl extends zzaci {

    /* renamed from: h */
    private final OutputStream f39660h;

    zzacl(OutputStream outputStream, int i) {
        super(i);
        this.f39660h = outputStream;
    }

    /* renamed from: N */
    private final void m56282N() throws IOException {
        this.f39660h.write(this.f39653d, 0, this.f39655f);
        this.f39655f = 0;
    }

    /* renamed from: O */
    private final void m56283O(int i) throws IOException {
        if (this.f39654e - this.f39655f < i) {
            m56282N();
        }
    }

    /* renamed from: A */
    public final void mo48973A(int i, int i2) throws IOException {
        m56283O(20);
        mo48970L(i << 3);
        mo48970L(i2);
    }

    /* renamed from: B */
    public final void mo48974B(int i) throws IOException {
        m56283O(5);
        mo48970L(i);
    }

    /* renamed from: C */
    public final void mo48975C(int i, long j) throws IOException {
        m56283O(20);
        mo48970L(i << 3);
        mo48971M(j);
    }

    /* renamed from: D */
    public final void mo48976D(long j) throws IOException {
        m56283O(10);
        mo48971M(j);
    }

    /* renamed from: P */
    public final void mo48992P(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39654e;
        int i4 = this.f39655f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f39653d, i4, i2);
            this.f39655f += i2;
            this.f39656g += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.f39653d, i4, i5);
        int i6 = i2 - i5;
        this.f39655f = this.f39654e;
        this.f39656g += i5;
        m56282N();
        if (i6 <= this.f39654e) {
            System.arraycopy(bArr, i5, this.f39653d, 0, i6);
            this.f39655f = i6;
        } else {
            this.f39660h.write(bArr, i5, i6);
        }
        this.f39656g += i6;
    }

    /* renamed from: Q */
    public final void mo48993Q(String str) throws IOException {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int f = zzacn.m56312f(length);
            int i3 = f + length;
            int i4 = this.f39654e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int b = zzagc.m56873b(str, bArr, 0, length);
                mo48974B(b);
                mo48992P(bArr, 0, b);
                return;
            }
            if (i3 > i4 - this.f39655f) {
                m56282N();
            }
            int f2 = zzacn.m56312f(str.length());
            i = this.f39655f;
            if (f2 == f) {
                int i5 = i + f2;
                this.f39655f = i5;
                int b2 = zzagc.m56873b(str, this.f39653d, i5, this.f39654e - i5);
                this.f39655f = i;
                i2 = (b2 - i) - f2;
                mo48970L(i2);
                this.f39655f = b2;
            } else {
                i2 = zzagc.m56874c(str);
                mo48970L(i2);
                this.f39655f = zzagc.m56873b(str, this.f39653d, this.f39655f, i2);
            }
            this.f39656g += i2;
        } catch (zzagb e) {
            this.f39656g -= this.f39655f - i;
            this.f39655f = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzack(e2);
        } catch (zzagb e3) {
            mo48995k(str, e3);
        }
    }

    /* renamed from: a */
    public final void mo48884a(byte[] bArr, int i, int i2) throws IOException {
        mo48992P(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo48979m() throws IOException {
        if (this.f39655f > 0) {
            m56282N();
        }
    }

    /* renamed from: n */
    public final void mo48980n(byte b) throws IOException {
        if (this.f39655f == this.f39654e) {
            m56282N();
        }
        mo48967I(b);
    }

    /* renamed from: o */
    public final void mo48981o(int i, boolean z) throws IOException {
        m56283O(11);
        mo48970L(i << 3);
        mo48967I(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo48982p(int i, zzacc zzacc) throws IOException {
        mo48974B((i << 3) | 2);
        mo48974B(zzacc.mo48893f());
        zzacc.mo48900m(this);
    }

    /* renamed from: r */
    public final void mo48983r(int i, int i2) throws IOException {
        m56283O(14);
        mo48970L((i << 3) | 5);
        mo48968J(i2);
    }

    /* renamed from: s */
    public final void mo48984s(int i) throws IOException {
        m56283O(4);
        mo48968J(i);
    }

    /* renamed from: t */
    public final void mo48985t(int i, long j) throws IOException {
        m56283O(18);
        mo48970L((i << 3) | 1);
        mo48969K(j);
    }

    /* renamed from: u */
    public final void mo48986u(long j) throws IOException {
        m56283O(8);
        mo48969K(j);
    }

    /* renamed from: v */
    public final void mo48987v(int i, int i2) throws IOException {
        m56283O(20);
        mo48970L(i << 3);
        if (i2 >= 0) {
            mo48970L(i2);
        } else {
            mo48971M((long) i2);
        }
    }

    /* renamed from: w */
    public final void mo48988w(int i) throws IOException {
        if (i >= 0) {
            mo48974B(i);
        } else {
            mo48976D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo48989x(int i, zzaek zzaek, zzaew zzaew) throws IOException {
        mo48974B((i << 3) | 2);
        mo48974B(((zzabm) zzaek).mo48858b(zzaew));
        zzaew.mo49147h(zzaek, this.f39663a);
    }

    /* renamed from: y */
    public final void mo48990y(int i, String str) throws IOException {
        mo48974B((i << 3) | 2);
        mo48993Q(str);
    }

    /* renamed from: z */
    public final void mo48991z(int i, int i2) throws IOException {
        mo48974B((i << 3) | i2);
    }
}
