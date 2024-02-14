package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzpf extends zzod {

    /* renamed from: i */
    private int f38176i;

    /* renamed from: j */
    private int f38177j;

    /* renamed from: k */
    private boolean f38178k;

    /* renamed from: l */
    private int f38179l;

    /* renamed from: m */
    private byte[] f38180m = zzen.f34505f;

    /* renamed from: n */
    private int f38181n;

    /* renamed from: o */
    private long f38182o;

    /* renamed from: b */
    public final void mo47874b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f38179l);
            this.f38182o += (long) (min / this.f38025b.f37948d);
            this.f38179l -= min;
            byteBuffer.position(position + min);
            if (this.f38179l <= 0) {
                int i2 = i - min;
                int length = (this.f38181n + i2) - this.f38180m.length;
                ByteBuffer i3 = mo47957i(length);
                int P = zzen.m49141P(length, 0, this.f38181n);
                i3.put(this.f38180m, 0, P);
                int P2 = zzen.m49141P(length - P, 0, i2);
                byteBuffer.limit(byteBuffer.position() + P2);
                i3.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i2 - P2;
                int i5 = this.f38181n - P;
                this.f38181n = i5;
                byte[] bArr = this.f38180m;
                System.arraycopy(bArr, P, bArr, 0, i5);
                byteBuffer.get(this.f38180m, this.f38181n, i4);
                this.f38181n += i4;
                i3.flip();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo47877e() {
        return super.mo47877e() && this.f38181n == 0;
    }

    /* renamed from: h */
    public final zzne mo47956h(zzne zzne) throws zznf {
        if (zzne.f37947c == 2) {
            this.f38178k = true;
            return (this.f38176i == 0 && this.f38177j == 0) ? zzne.f37944e : zzne;
        }
        throw new zznf(zzne);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo47958j() {
        if (this.f38178k) {
            this.f38178k = false;
            int i = this.f38177j;
            int i2 = this.f38025b.f37948d;
            this.f38180m = new byte[(i * i2)];
            this.f38179l = this.f38176i * i2;
        }
        this.f38181n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo47959k() {
        if (this.f38178k) {
            int i = this.f38181n;
            if (i > 0) {
                this.f38182o += (long) (i / this.f38025b.f37948d);
            }
            this.f38181n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo47960l() {
        this.f38180m = zzen.f34505f;
    }

    /* renamed from: n */
    public final long mo48009n() {
        return this.f38182o;
    }

    /* renamed from: o */
    public final void mo48010o() {
        this.f38182o = 0;
    }

    /* renamed from: p */
    public final void mo48011p(int i, int i2) {
        this.f38176i = i;
        this.f38177j = i2;
    }

    public final ByteBuffer zzb() {
        int i;
        if (super.mo47877e() && (i = this.f38181n) > 0) {
            mo47957i(i).put(this.f38180m, 0, this.f38181n).flip();
            this.f38181n = 0;
        }
        return super.zzb();
    }
}
