package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteStreams */
public final class ByteStreams {

    /* renamed from: a */
    private static final OutputStream f52962a = new OutputStream() {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            Preconditions.m5392s(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            Preconditions.m5392s(bArr);
            Preconditions.m5397x(i, i2 + i, bArr.length);
        }
    };

    private ByteStreams() {
    }

    /* renamed from: a */
    private static byte[] m73408a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static long m73409b(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.m5392s(inputStream);
        Preconditions.m5392s(outputStream);
        byte[] c = m73410c();
        long j = 0;
        while (true) {
            int read = inputStream.read(c);
            if (read == -1) {
                return j;
            }
            outputStream.write(c, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: c */
    static byte[] m73410c() {
        return new byte[8192];
    }

    @Beta
    /* renamed from: d */
    public static InputStream m73411d(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    @CanIgnoreReturnValue
    @Beta
    /* renamed from: e */
    public static int m73412e(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        Preconditions.m5392s(inputStream);
        Preconditions.m5392s(bArr);
        int i3 = 0;
        if (i2 >= 0) {
            Preconditions.m5397x(i, i + i2, bArr.length);
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", new Object[]{Integer.valueOf(i2)}));
    }

    @Beta
    /* renamed from: f */
    public static void m73413f(InputStream inputStream, byte[] bArr) throws IOException {
        m73414g(inputStream, bArr, 0, bArr.length);
    }

    @Beta
    /* renamed from: g */
    public static void m73414g(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int e = m73412e(inputStream, bArr, i, i2);
        if (e != i2) {
            StringBuilder sb = new StringBuilder(81);
            sb.append("reached end of stream after reading ");
            sb.append(e);
            sb.append(" bytes; ");
            sb.append(i2);
            sb.append(" bytes expected");
            throw new EOFException(sb.toString());
        }
    }

    /* renamed from: h */
    private static long m73415h(InputStream inputStream, long j) throws IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0;
        }
        return inputStream.skip(Math.min((long) available, j));
    }

    /* renamed from: i */
    static long m73416i(InputStream inputStream, long j) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long h = m73415h(inputStream, j3);
            if (h == 0) {
                int min = (int) Math.min(j3, 8192);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                h = (long) inputStream.read(bArr, 0, min);
                if (h == -1) {
                    break;
                }
            }
            j2 += h;
        }
        return j2;
    }

    /* renamed from: j */
    public static byte[] m73417j(InputStream inputStream) throws IOException {
        Preconditions.m5392s(inputStream);
        return m73418k(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: k */
    private static byte[] m73418k(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m73408a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = IntMath.m73474j(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m73408a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataInputStream */
    private static class ByteArrayDataInputStream implements ByteArrayDataInput {

        /* renamed from: a */
        final DataInput f52963a;

        public boolean readBoolean() {
            try {
                return this.f52963a.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public byte readByte() {
            try {
                return this.f52963a.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public char readChar() {
            try {
                return this.f52963a.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public double readDouble() {
            try {
                return this.f52963a.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public float readFloat() {
            try {
                return this.f52963a.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void readFully(byte[] bArr) {
            try {
                this.f52963a.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readInt() {
            try {
                return this.f52963a.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readLine() {
            try {
                return this.f52963a.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public long readLong() {
            try {
                return this.f52963a.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public short readShort() {
            try {
                return this.f52963a.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readUTF() {
            try {
                return this.f52963a.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readUnsignedByte() {
            try {
                return this.f52963a.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readUnsignedShort() {
            try {
                return this.f52963a.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int skipBytes(int i) {
            try {
                return this.f52963a.skipBytes(i);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void readFully(byte[] bArr, int i, int i2) {
            try {
                this.f52963a.readFully(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataOutputStream */
    private static class ByteArrayDataOutputStream implements ByteArrayDataOutput {

        /* renamed from: a */
        final DataOutput f52964a;

        public void write(int i) {
            try {
                this.f52964a.write(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBoolean(boolean z) {
            try {
                this.f52964a.writeBoolean(z);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeByte(int i) {
            try {
                this.f52964a.writeByte(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBytes(String str) {
            try {
                this.f52964a.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChar(int i) {
            try {
                this.f52964a.writeChar(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChars(String str) {
            try {
                this.f52964a.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeDouble(double d) {
            try {
                this.f52964a.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeFloat(float f) {
            try {
                this.f52964a.writeFloat(f);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeInt(int i) {
            try {
                this.f52964a.writeInt(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeLong(long j) {
            try {
                this.f52964a.writeLong(j);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeShort(int i) {
            try {
                this.f52964a.writeShort(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeUTF(String str) {
            try {
                this.f52964a.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr) {
            try {
                this.f52964a.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f52964a.write(bArr, i, i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.io.ByteStreams$LimitedInputStream */
    private static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: a */
        private long f52965a;

        /* renamed from: c */
        private long f52966c = -1;

        LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            Preconditions.m5392s(inputStream);
            Preconditions.m5378e(j >= 0, "limit must be non-negative");
            this.f52965a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f52965a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f52966c = this.f52965a;
        }

        public int read() throws IOException {
            if (this.f52965a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f52965a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f52966c != -1) {
                this.in.reset();
                this.f52965a = this.f52966c;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f52965a));
            this.f52965a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f52965a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f52965a -= (long) read;
            }
            return read;
        }
    }
}
