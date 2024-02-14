package com.google.firebase.firestore.util;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferInputStream extends InputStream {

    /* renamed from: a */
    ByteBuffer f54763a;

    public int read() {
        if (!this.f54763a.hasRemaining()) {
            return -1;
        }
        return this.f54763a.get() & 255;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        if (!this.f54763a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f54763a.remaining());
        this.f54763a.get(bArr, i, min);
        return min;
    }
}
