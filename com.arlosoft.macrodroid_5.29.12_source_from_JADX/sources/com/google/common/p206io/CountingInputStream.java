package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@Beta
/* renamed from: com.google.common.io.CountingInputStream */
public final class CountingInputStream extends FilterInputStream {

    /* renamed from: a */
    private long f52985a;

    /* renamed from: c */
    private long f52986c;

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.f52986c = this.f52985a;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.f52985a++;
        }
        return read;
    }

    public synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f52986c != -1) {
            this.in.reset();
            this.f52985a = this.f52986c;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public long skip(long j) throws IOException {
        long skip = this.in.skip(j);
        this.f52985a += skip;
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f52985a += (long) read;
        }
        return read;
    }
}
