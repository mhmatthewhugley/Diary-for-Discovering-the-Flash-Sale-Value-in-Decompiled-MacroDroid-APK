package com.android.p023dx.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import javax.mail.UIDFolder;

/* renamed from: com.android.dx.util.ByteArray */
public final class ByteArray {
    /* access modifiers changed from: private */
    public final byte[] bytes;
    /* access modifiers changed from: private */
    public final int size;
    /* access modifiers changed from: private */
    public final int start;

    /* renamed from: com.android.dx.util.ByteArray$GetCursor */
    public interface GetCursor {
        int getCursor();
    }

    /* renamed from: com.android.dx.util.ByteArray$MyDataInputStream */
    public static class MyDataInputStream extends DataInputStream {
        private final MyInputStream wrapped;

        public MyDataInputStream(MyInputStream myInputStream) {
            super(myInputStream);
            this.wrapped = myInputStream;
        }
    }

    public ByteArray(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes == null");
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        } else if (i2 < i) {
            throw new IllegalArgumentException("end < start");
        } else if (i2 <= bArr.length) {
            this.bytes = bArr;
            this.start = i;
            this.size = i2 - i;
        } else {
            throw new IllegalArgumentException("end > bytes.length");
        }
    }

    private void checkOffsets(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.size) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + this.size);
        }
    }

    private int getByte0(int i) {
        return this.bytes[this.start + i];
    }

    /* access modifiers changed from: private */
    public int getUnsignedByte0(int i) {
        return this.bytes[this.start + i] & 255;
    }

    public int getByte(int i) {
        checkOffsets(i, i + 1);
        return getByte0(i);
    }

    public void getBytes(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = this.size;
        if (length >= i2) {
            System.arraycopy(this.bytes, this.start, bArr, i, i2);
            return;
        }
        throw new IndexOutOfBoundsException("(out.length - offset) < size()");
    }

    public int getInt(int i) {
        checkOffsets(i, i + 4);
        return getUnsignedByte0(i + 3) | (getByte0(i) << 24) | (getUnsignedByte0(i + 1) << 16) | (getUnsignedByte0(i + 2) << 8);
    }

    public long getLong(int i) {
        checkOffsets(i, i + 8);
        int byte0 = (getByte0(i) << 24) | (getUnsignedByte0(i + 1) << 16) | (getUnsignedByte0(i + 2) << 8) | getUnsignedByte0(i + 3);
        return (((long) (getUnsignedByte0(i + 7) | (getByte0(i + 4) << 24) | (getUnsignedByte0(i + 5) << 16) | (getUnsignedByte0(i + 6) << 8))) & UIDFolder.MAXUID) | (((long) byte0) << 32);
    }

    public int getShort(int i) {
        checkOffsets(i, i + 2);
        return getUnsignedByte0(i + 1) | (getByte0(i) << 8);
    }

    public int getUnsignedByte(int i) {
        checkOffsets(i, i + 1);
        return getUnsignedByte0(i);
    }

    public int getUnsignedShort(int i) {
        checkOffsets(i, i + 2);
        return getUnsignedByte0(i + 1) | (getUnsignedByte0(i) << 8);
    }

    public MyDataInputStream makeDataInputStream() {
        return new MyDataInputStream(makeInputStream());
    }

    public MyInputStream makeInputStream() {
        return new MyInputStream();
    }

    public int size() {
        return this.size;
    }

    public ByteArray slice(int i, int i2) {
        checkOffsets(i, i2);
        byte[] bArr = this.bytes;
        int i3 = this.start;
        return new ByteArray(bArr, i + i3, i2 + i3);
    }

    public int underlyingOffset(int i, byte[] bArr) {
        if (bArr == this.bytes) {
            return this.start + i;
        }
        throw new IllegalArgumentException("wrong bytes");
    }

    /* renamed from: com.android.dx.util.ByteArray$MyInputStream */
    public class MyInputStream extends InputStream {
        private int cursor = 0;
        private int mark = 0;

        public MyInputStream() {
        }

        public int available() {
            return ByteArray.this.size - this.cursor;
        }

        public void mark(int i) {
            this.mark = this.cursor;
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (this.cursor >= ByteArray.this.size) {
                return -1;
            }
            int access$100 = ByteArray.this.getUnsignedByte0(this.cursor);
            this.cursor++;
            return access$100;
        }

        public void reset() {
            this.cursor = this.mark;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            int access$000 = ByteArray.this.size - this.cursor;
            if (i2 > access$000) {
                i2 = access$000;
            }
            System.arraycopy(ByteArray.this.bytes, this.cursor + ByteArray.this.start, bArr, i, i2);
            this.cursor += i2;
            return i2;
        }
    }

    public ByteArray(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
