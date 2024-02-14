package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

final class ByteStreams {
    private ByteStreams() {
    }

    /* renamed from: a */
    private static byte[] m76786a(Queue<byte[]> queue, int i) {
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

    /* renamed from: b */
    public static InputStream m76787b(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    /* renamed from: c */
    private static int m76788c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static byte[] m76789d(InputStream inputStream) throws IOException {
        return m76790e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m76790e(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m76786a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = m76788c(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m76786a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: a */
        private long f54954a;

        /* renamed from: c */
        private long f54955c = -1;

        LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            this.f54954a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f54954a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f54955c = this.f54954a;
        }

        public int read() throws IOException {
            if (this.f54954a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f54954a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f54955c != -1) {
                this.in.reset();
                this.f54954a = this.f54955c;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f54954a));
            this.f54954a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f54954a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f54954a -= (long) read;
            }
            return read;
        }
    }
}
