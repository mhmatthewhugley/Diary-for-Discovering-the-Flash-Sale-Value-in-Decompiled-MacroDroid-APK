package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzpc extends zzod {

    /* renamed from: i */
    private int f38130i;

    /* renamed from: j */
    private boolean f38131j;

    /* renamed from: k */
    private byte[] f38132k;

    /* renamed from: l */
    private byte[] f38133l;

    /* renamed from: m */
    private int f38134m;

    /* renamed from: n */
    private int f38135n;

    /* renamed from: o */
    private int f38136o;

    /* renamed from: p */
    private boolean f38137p;

    /* renamed from: q */
    private long f38138q;

    public zzpc() {
        byte[] bArr = zzen.f34505f;
        this.f38132k = bArr;
        this.f38133l = bArr;
    }

    /* renamed from: p */
    private final int m54511p(long j) {
        return (int) ((j * ((long) this.f38025b.f37945a)) / 1000000);
    }

    /* renamed from: q */
    private final int m54512q(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f38130i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: r */
    private final void m54513r(byte[] bArr, int i) {
        mo47957i(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f38137p = true;
        }
    }

    /* renamed from: s */
    private final void m54514s(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f38136o);
        int i2 = this.f38136o - min;
        System.arraycopy(bArr, i - i2, this.f38133l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f38133l, i2, min);
    }

    /* renamed from: b */
    public final void mo47874b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo47961m()) {
            int i = this.f38134m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f38132k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f38130i;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f38134m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo47957i(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f38137p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int q = m54512q(byteBuffer);
                byteBuffer.limit(q);
                this.f38138q += (long) (byteBuffer.remaining() / this.f38130i);
                m54514s(byteBuffer, this.f38133l, this.f38136o);
                if (q < limit3) {
                    m54513r(this.f38133l, this.f38136o);
                    this.f38134m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int q2 = m54512q(byteBuffer);
                int position2 = q2 - byteBuffer.position();
                byte[] bArr = this.f38132k;
                int length = bArr.length;
                int i3 = this.f38135n;
                int i4 = length - i3;
                if (q2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f38132k, this.f38135n, min);
                    int i5 = this.f38135n + min;
                    this.f38135n = i5;
                    byte[] bArr2 = this.f38132k;
                    if (i5 == bArr2.length) {
                        if (this.f38137p) {
                            m54513r(bArr2, this.f38136o);
                            long j = this.f38138q;
                            int i6 = this.f38135n;
                            int i7 = this.f38136o;
                            this.f38138q = j + ((long) ((i6 - (i7 + i7)) / this.f38130i));
                            i5 = i6;
                        } else {
                            this.f38138q += (long) ((i5 - this.f38136o) / this.f38130i);
                        }
                        m54514s(byteBuffer, this.f38132k, i5);
                        this.f38135n = 0;
                        this.f38134m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m54513r(bArr, i3);
                    this.f38135n = 0;
                    this.f38134m = 0;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo47878f() {
        return this.f38131j;
    }

    /* renamed from: h */
    public final zzne mo47956h(zzne zzne) throws zznf {
        if (zzne.f37947c == 2) {
            return this.f38131j ? zzne : zzne.f37944e;
        }
        throw new zznf(zzne);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo47958j() {
        if (this.f38131j) {
            this.f38130i = this.f38025b.f37948d;
            int p = m54511p(150000) * this.f38130i;
            if (this.f38132k.length != p) {
                this.f38132k = new byte[p];
            }
            int p2 = m54511p(20000) * this.f38130i;
            this.f38136o = p2;
            if (this.f38133l.length != p2) {
                this.f38133l = new byte[p2];
            }
        }
        this.f38134m = 0;
        this.f38138q = 0;
        this.f38135n = 0;
        this.f38137p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo47959k() {
        int i = this.f38135n;
        if (i > 0) {
            m54513r(this.f38132k, i);
        }
        if (!this.f38137p) {
            this.f38138q += (long) (this.f38136o / this.f38130i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo47960l() {
        this.f38131j = false;
        this.f38136o = 0;
        byte[] bArr = zzen.f34505f;
        this.f38132k = bArr;
        this.f38133l = bArr;
    }

    /* renamed from: n */
    public final long mo47998n() {
        return this.f38138q;
    }

    /* renamed from: o */
    public final void mo47999o(boolean z) {
        this.f38131j = z;
    }
}
