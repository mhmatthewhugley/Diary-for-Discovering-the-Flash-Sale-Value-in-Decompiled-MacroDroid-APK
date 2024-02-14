package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ByteStreams {
    private ByteStreams() {
    }

    /* renamed from: a */
    public static long m72637a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.m72716d(inputStream);
        Preconditions.m72716d(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static InputStream m72638b(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    /* renamed from: c */
    public static int m72639c(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        Preconditions.m72716d(inputStream);
        Preconditions.m72716d(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    private static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: a */
        private long f52744a;

        /* renamed from: c */
        private long f52745c = -1;

        LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            Preconditions.m72716d(inputStream);
            Preconditions.m72714b(j >= 0, "limit must be non-negative");
            this.f52744a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f52744a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f52745c = this.f52744a;
        }

        public int read() throws IOException {
            if (this.f52744a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f52744a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f52745c != -1) {
                this.in.reset();
                this.f52744a = this.f52745c;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f52744a));
            this.f52744a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f52744a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f52744a -= (long) read;
            }
            return read;
        }
    }
}
