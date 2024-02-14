package com.android.p023dx.p026io.instructions;

import java.io.EOFException;
import java.util.Objects;

/* renamed from: com.android.dx.io.instructions.ShortArrayCodeInput */
public final class ShortArrayCodeInput extends BaseCodeCursor implements CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] sArr) {
        Objects.requireNonNull(sArr, "array == null");
        this.array = sArr;
    }

    public boolean hasMore() {
        return cursor() < this.array.length;
    }

    public int read() throws EOFException {
        try {
            short s = this.array[cursor()];
            advance(1);
            return s & 65535;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EOFException();
        }
    }

    public int readInt() throws EOFException {
        return read() | (read() << 16);
    }

    public long readLong() throws EOFException {
        return ((long) read()) | (((long) read()) << 16) | (((long) read()) << 32) | (((long) read()) << 48);
    }
}
