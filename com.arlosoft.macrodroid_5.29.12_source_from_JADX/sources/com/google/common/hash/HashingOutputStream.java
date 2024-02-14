package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.FilterOutputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@Beta
public final class HashingOutputStream extends FilterOutputStream {

    /* renamed from: a */
    private final Hasher f17550a;

    public void close() throws IOException {
        this.out.close();
    }

    public void write(int i) throws IOException {
        this.f17550a.mo36949b((byte) i);
        this.out.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f17550a.mo36950d(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }
}
