package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

final class ByteCountingOutputStream extends OutputStream {

    /* renamed from: a */
    long f52743a;

    ByteCountingOutputStream() {
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f52743a += (long) i2;
    }

    public void write(int i) throws IOException {
        this.f52743a++;
    }
}
