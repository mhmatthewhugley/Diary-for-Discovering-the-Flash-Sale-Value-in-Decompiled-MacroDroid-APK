package org.apache.http.impl.p354io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p355io.SessionInputBuffer;

/* renamed from: org.apache.http.impl.io.ContentLengthInputStream */
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private boolean closed = false;
    private long contentLength;

    /* renamed from: in */
    private SessionInputBuffer f66005in = null;
    private long pos = 0;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        if (sessionInputBuffer == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (j >= 0) {
            this.f66005in = sessionInputBuffer;
            this.contentLength = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public void close() throws IOException {
        if (!this.closed) {
            try {
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.closed = true;
            }
        }
    }

    public int read() throws IOException {
        if (!this.closed) {
            long j = this.pos;
            if (j >= this.contentLength) {
                return -1;
            }
            this.pos = j + 1;
            return this.f66005in.read();
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public long skip(long j) throws IOException {
        int read;
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.contentLength - this.pos);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048, min))) != -1) {
            long j3 = (long) read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.closed) {
            long j = this.pos;
            long j2 = this.contentLength;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.f66005in.read(bArr, i, i2);
            this.pos += (long) read;
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
