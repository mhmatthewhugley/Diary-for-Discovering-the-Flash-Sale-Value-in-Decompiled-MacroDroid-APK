package com.android.p023dx.p026io.instructions;

/* renamed from: com.android.dx.io.instructions.ShortArrayCodeOutput */
public final class ShortArrayCodeOutput extends BaseCodeCursor implements CodeOutput {
    private final short[] array;

    public ShortArrayCodeOutput(int i) {
        if (i >= 0) {
            this.array = new short[i];
            return;
        }
        throw new IllegalArgumentException("maxSize < 0");
    }

    public short[] getArray() {
        int cursor = cursor();
        short[] sArr = this.array;
        if (cursor == sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[cursor];
        System.arraycopy(sArr, 0, sArr2, 0, cursor);
        return sArr2;
    }

    public void write(short s) {
        this.array[cursor()] = s;
        advance(1);
    }

    public void writeInt(int i) {
        write((short) i);
        write((short) (i >> 16));
    }

    public void writeLong(long j) {
        write((short) ((int) j));
        write((short) ((int) (j >> 16)));
        write((short) ((int) (j >> 32)));
        write((short) ((int) (j >> 48)));
    }

    public void write(short s, short s2) {
        write(s);
        write(s2);
    }

    public void write(short s, short s2, short s3) {
        write(s);
        write(s2);
        write(s3);
    }

    public void write(short s, short s2, short s3, short s4) {
        write(s);
        write(s2);
        write(s3);
        write(s4);
    }

    public void write(short s, short s2, short s3, short s4, short s5) {
        write(s);
        write(s2);
        write(s3);
        write(s4);
        write(s5);
    }

    public void write(byte[] bArr) {
        boolean z = true;
        byte b = 0;
        for (byte b2 : bArr) {
            if (z) {
                b = b2 & 255;
                z = false;
            } else {
                byte b3 = (b2 << 8) | b;
                write((short) b3);
                b = b3;
                z = true;
            }
        }
        if (!z) {
            write((short) b);
        }
    }

    public void write(short[] sArr) {
        for (short write : sArr) {
            write(write);
        }
    }

    public void write(int[] iArr) {
        for (int writeInt : iArr) {
            writeInt(writeInt);
        }
    }

    public void write(long[] jArr) {
        for (long writeLong : jArr) {
            writeLong(writeLong);
        }
    }
}
