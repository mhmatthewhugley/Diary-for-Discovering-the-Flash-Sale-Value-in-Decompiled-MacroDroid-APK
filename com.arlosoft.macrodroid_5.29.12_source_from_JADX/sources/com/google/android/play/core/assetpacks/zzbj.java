package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbj extends InputStream {

    /* renamed from: a */
    private final InputStream f51282a;

    /* renamed from: c */
    private long f51283c;

    zzbj(InputStream inputStream, long j) {
        this.f51282a = inputStream;
        this.f51283c = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f51282a.close();
        this.f51283c = 0;
    }

    public final int read() throws IOException {
        long j = this.f51283c;
        if (j <= 0) {
            return -1;
        }
        this.f51283c = j - 1;
        return this.f51282a.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f51283c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f51282a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f51283c -= (long) read;
        }
        return read;
    }
}
