package com.google.android.gms.internal.mlkit_translate;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzau extends OutputStream {
    zzau() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        zzj.m61892e(i, i2 + i, bArr.length);
    }
}
