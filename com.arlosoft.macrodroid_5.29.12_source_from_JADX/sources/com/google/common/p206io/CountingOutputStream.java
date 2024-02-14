package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import java.io.FilterOutputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CountingOutputStream */
public final class CountingOutputStream extends FilterOutputStream {

    /* renamed from: a */
    private long f52987a;

    public void close() throws IOException {
        this.out.close();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f52987a += (long) i2;
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f52987a++;
    }
}
