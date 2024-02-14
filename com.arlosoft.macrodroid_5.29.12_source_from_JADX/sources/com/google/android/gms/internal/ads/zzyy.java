package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyy implements zzzj {

    /* renamed from: a */
    private final byte[] f39021a = new byte[4096];

    /* renamed from: b */
    private final zzr f39022b;

    /* renamed from: c */
    private final long f39023c;

    /* renamed from: d */
    private long f39024d;

    /* renamed from: e */
    private byte[] f39025e = new byte[65536];

    /* renamed from: f */
    private int f39026f;

    /* renamed from: g */
    private int f39027g;

    static {
        zzbh.m43425b("media3.extractor");
    }

    public zzyy(zzr zzr, long j, long j2) {
        this.f39022b = zzr;
        this.f39024d = j;
        this.f39023c = j2;
    }

    /* renamed from: q */
    private final int m55481q(byte[] bArr, int i, int i2) {
        int i3 = this.f39027g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f39025e, 0, bArr, i, min);
        m55486v(min);
        return min;
    }

    /* renamed from: r */
    private final int m55482r(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int e = this.f39022b.mo43927e(bArr, i + i3, i2 - i3);
            if (e != -1) {
                return i3 + e;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: s */
    private final int m55483s(int i) {
        int min = Math.min(this.f39027g, i);
        m55486v(min);
        return min;
    }

    /* renamed from: t */
    private final void m55484t(int i) {
        if (i != -1) {
            this.f39024d += (long) i;
        }
    }

    /* renamed from: u */
    private final void m55485u(int i) {
        int i2 = this.f39026f + i;
        int length = this.f39025e.length;
        if (i2 > length) {
            this.f39025e = Arrays.copyOf(this.f39025e, zzen.m49141P(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: v */
    private final void m55486v(int i) {
        int i2 = this.f39027g - i;
        this.f39027g = i2;
        this.f39026f = 0;
        byte[] bArr = this.f39025e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f39025e = bArr2;
    }

    /* renamed from: b */
    public final long mo41251b() {
        return this.f39024d + ((long) this.f39026f);
    }

    /* renamed from: c */
    public final long mo41252c() {
        return this.f39024d;
    }

    /* renamed from: d */
    public final long mo41253d() {
        return this.f39023c;
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        int q = m55481q(bArr, i, i2);
        if (q == 0) {
            q = m55482r(bArr, i, i2, 0, true);
        }
        m55484t(q);
        return q;
    }

    /* renamed from: f */
    public final int mo48451f(int i) throws IOException {
        int s = m55483s(1);
        if (s == 0) {
            s = m55482r(this.f39021a, 0, Math.min(1, 4096), 0, true);
        }
        m55484t(s);
        return s;
    }

    /* renamed from: h */
    public final void mo48452h() {
        this.f39026f = 0;
    }

    /* renamed from: i */
    public final boolean mo48453i(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int q = m55481q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = m55482r(bArr, i, i2, q, z);
        }
        m55484t(q);
        return q != -1;
    }

    /* renamed from: j */
    public final boolean mo48454j(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo48458o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f39025e, this.f39026f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: l */
    public final int mo48455l(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m55485u(i2);
        int i4 = this.f39027g;
        int i5 = this.f39026f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m55482r(this.f39025e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f39027g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f39025e, this.f39026f, bArr, i, i3);
        this.f39026f += i3;
        return i3;
    }

    /* renamed from: m */
    public final void mo48456m(byte[] bArr, int i, int i2) throws IOException {
        mo48453i(bArr, i, i2, false);
    }

    /* renamed from: n */
    public final void mo48457n(byte[] bArr, int i, int i2) throws IOException {
        mo48454j(bArr, i, i2, false);
    }

    /* renamed from: o */
    public final boolean mo48458o(int i, boolean z) throws IOException {
        m55485u(i);
        int i2 = this.f39027g - this.f39026f;
        while (i2 < i) {
            i2 = m55482r(this.f39025e, this.f39026f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f39027g = this.f39026f + i2;
        }
        this.f39026f += i;
        return true;
    }

    /* renamed from: p */
    public final boolean mo48459p(int i, boolean z) throws IOException {
        int s = m55483s(i);
        while (s < i && s != -1) {
            s = m55482r(this.f39021a, -s, Math.min(i, s + 4096), s, false);
        }
        m55484t(s);
        return s != -1;
    }

    /* renamed from: q0 */
    public final void mo48460q0(int i) throws IOException {
        mo48459p(i, false);
    }

    /* renamed from: x */
    public final void mo48461x(int i) throws IOException {
        mo48458o(i, false);
    }
}
