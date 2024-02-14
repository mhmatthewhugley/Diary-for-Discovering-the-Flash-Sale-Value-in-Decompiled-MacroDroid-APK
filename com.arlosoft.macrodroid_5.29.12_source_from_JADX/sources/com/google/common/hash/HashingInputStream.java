package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@Beta
public final class HashingInputStream extends FilterInputStream {

    /* renamed from: a */
    private final Hasher f17549a;

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    @CanIgnoreReturnValue
    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.f17549a.mo36949b((byte) read);
        }
        return read;
    }

    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @CanIgnoreReturnValue
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f17549a.mo36950d(bArr, i, read);
        }
        return read;
    }
}
