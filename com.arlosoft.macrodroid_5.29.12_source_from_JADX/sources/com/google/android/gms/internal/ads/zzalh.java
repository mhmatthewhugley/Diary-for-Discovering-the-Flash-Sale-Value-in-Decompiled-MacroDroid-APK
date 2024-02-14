package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzalh extends ByteArrayOutputStream {

    /* renamed from: a */
    private final zzaku f24944a;

    public zzalh(zzaku zzaku, int i) {
        this.f24944a = zzaku;
        this.buf = zzaku.mo41614b(Math.max(i, 256));
    }

    /* renamed from: b */
    private final void m41701b(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            int i3 = i2 + i;
            byte[] b = this.f24944a.mo41614b(i3 + i3);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f24944a.mo41613a(this.buf);
            this.buf = b;
        }
    }

    public final void close() throws IOException {
        this.f24944a.mo41613a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f24944a.mo41613a(this.buf);
    }

    public final synchronized void write(int i) {
        m41701b(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m41701b(i2);
        super.write(bArr, i, i2);
    }
}
