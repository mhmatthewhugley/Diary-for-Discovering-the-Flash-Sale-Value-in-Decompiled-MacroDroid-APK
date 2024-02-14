package javax.mail.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.mail.internet.SharedInputStream;

public class SharedFileInputStream extends BufferedInputStream implements SharedInputStream {
    private static int defaultBufferSize = 2048;
    protected long bufpos;
    protected int bufsize;
    protected long datalen;

    /* renamed from: in */
    protected RandomAccessFile f61354in;
    private boolean master;

    /* renamed from: sf */
    private SharedFile f61355sf;
    protected long start;

    public SharedFileInputStream(File file) throws IOException {
        this(file, defaultBufferSize);
    }

    private void ensureOpen() throws IOException {
        if (this.f61354in == null) {
            throw new IOException("Stream closed");
        }
    }

    private void fill() throws IOException {
        if (this.markpos < 0) {
            this.pos = 0;
            this.bufpos += (long) this.count;
        } else if (this.pos >= this.buf.length) {
            int i = this.markpos;
            if (i > 0) {
                int i2 = this.pos - i;
                System.arraycopy(this.buf, this.markpos, this.buf, 0, i2);
                this.pos = i2;
                this.bufpos += (long) this.markpos;
                this.markpos = 0;
            } else {
                int length = this.buf.length;
                int i3 = this.marklimit;
                if (length >= i3) {
                    this.markpos = -1;
                    this.pos = 0;
                    this.bufpos += (long) this.count;
                } else {
                    int i4 = this.pos * 2;
                    if (i4 <= i3) {
                        i3 = i4;
                    }
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.buf, 0, bArr, 0, this.pos);
                    this.buf = bArr;
                }
            }
        }
        this.count = this.pos;
        int length2 = this.buf.length;
        int i5 = this.pos;
        int i6 = length2 - i5;
        long j = this.bufpos;
        long j2 = this.start;
        long j3 = (j - j2) + ((long) i5) + ((long) i6);
        long j4 = this.datalen;
        if (j3 > j4) {
            i6 = (int) (j4 - ((j - j2) + ((long) i5)));
        }
        synchronized (this.f61354in) {
            this.f61354in.seek(this.bufpos + ((long) this.pos));
            int read = this.f61354in.read(this.buf, this.pos, i6);
            if (read > 0) {
                this.count = read + this.pos;
            }
        }
    }

    private int in_available() throws IOException {
        return (int) ((this.start + this.datalen) - (this.bufpos + ((long) this.count)));
    }

    private void init(SharedFile sharedFile, int i) throws IOException {
        this.f61355sf = sharedFile;
        RandomAccessFile open = sharedFile.open();
        this.f61354in = open;
        this.start = 0;
        this.datalen = open.length();
        this.bufsize = i;
        this.buf = new byte[i];
    }

    private int read1(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.count - this.pos;
        if (i3 <= 0) {
            fill();
            i3 = this.count - this.pos;
            if (i3 <= 0) {
                return -1;
            }
        }
        if (i3 < i2) {
            i2 = i3;
        }
        System.arraycopy(this.buf, this.pos, bArr, i, i2);
        this.pos += i2;
        return i2;
    }

    public synchronized int available() throws IOException {
        ensureOpen();
        return (this.count - this.pos) + in_available();
    }

    public void close() throws IOException {
        if (this.f61354in != null) {
            try {
                if (this.master) {
                    this.f61355sf.forceClose();
                } else {
                    this.f61355sf.close();
                }
            } finally {
                this.f61355sf = null;
                this.f61354in = null;
                this.buf = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    public long getPosition() {
        if (this.f61354in != null) {
            return (this.bufpos + ((long) this.pos)) - this.start;
        }
        throw new RuntimeException("Stream closed");
    }

    public synchronized void mark(int i) {
        this.marklimit = i;
        this.markpos = this.pos;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized InputStream newStream(long j, long j2) {
        if (this.f61354in == null) {
            throw new RuntimeException("Stream closed");
        } else if (j >= 0) {
            if (j2 == -1) {
                j2 = this.datalen;
            }
        } else {
            throw new IllegalArgumentException("start < 0");
        }
        return new SharedFileInputStream(this.f61355sf, this.start + j, j2 - j, this.bufsize);
    }

    public synchronized int read() throws IOException {
        ensureOpen();
        if (this.pos >= this.count) {
            fill();
            if (this.pos >= this.count) {
                return -1;
            }
        }
        byte[] bArr = this.buf;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i] & 255;
    }

    public synchronized void reset() throws IOException {
        ensureOpen();
        int i = this.markpos;
        if (i >= 0) {
            this.pos = i;
        } else {
            throw new IOException("Resetting to invalid mark");
        }
    }

    public synchronized long skip(long j) throws IOException {
        ensureOpen();
        if (j <= 0) {
            return 0;
        }
        long j2 = (long) (this.count - this.pos);
        if (j2 <= 0) {
            fill();
            j2 = (long) (this.count - this.pos);
            if (j2 <= 0) {
                return 0;
            }
        }
        if (j2 < j) {
            j = j2;
        }
        this.pos = (int) (((long) this.pos) + j);
        return j;
    }

    static class SharedFile {
        private int cnt;

        /* renamed from: in */
        private RandomAccessFile f61356in;

        SharedFile(String str) throws IOException {
            this.f61356in = new RandomAccessFile(str, "r");
        }

        public synchronized void close() throws IOException {
            int i = this.cnt;
            if (i > 0) {
                int i2 = i - 1;
                this.cnt = i2;
                if (i2 <= 0) {
                    this.f61356in.close();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                this.f61356in.close();
            } finally {
                super.finalize();
            }
        }

        public synchronized void forceClose() throws IOException {
            if (this.cnt > 0) {
                this.cnt = 0;
                this.f61356in.close();
            } else {
                try {
                    this.f61356in.close();
                } catch (IOException unused) {
                }
            }
        }

        public synchronized RandomAccessFile open() {
            this.cnt++;
            return this.f61356in;
        }

        SharedFile(File file) throws IOException {
            this.f61356in = new RandomAccessFile(file, "r");
        }
    }

    public SharedFileInputStream(String str) throws IOException {
        this(str, defaultBufferSize);
    }

    public SharedFileInputStream(File file, int i) throws IOException {
        super((InputStream) null);
        this.start = 0;
        this.master = true;
        if (i > 0) {
            init(new SharedFile(file), i);
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r4, int r5, int r6) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch:{ all -> 0x0032 }
            r0 = r5 | r6
            int r1 = r5 + r6
            r0 = r0 | r1
            int r2 = r4.length     // Catch:{ all -> 0x0032 }
            int r2 = r2 - r1
            r0 = r0 | r2
            if (r0 < 0) goto L_0x002c
            if (r6 != 0) goto L_0x0013
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0013:
            int r0 = r3.read1(r4, r5, r6)     // Catch:{ all -> 0x0032 }
            if (r0 > 0) goto L_0x001b
            monitor-exit(r3)
            return r0
        L_0x001b:
            if (r0 >= r6) goto L_0x002a
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.read1(r4, r1, r2)     // Catch:{ all -> 0x0032 }
            if (r1 > 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            int r0 = r0 + r1
            goto L_0x001b
        L_0x002a:
            monitor-exit(r3)
            return r0
        L_0x002c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.util.SharedFileInputStream.read(byte[], int, int):int");
    }

    public SharedFileInputStream(String str, int i) throws IOException {
        super((InputStream) null);
        this.start = 0;
        this.master = true;
        if (i > 0) {
            init(new SharedFile(str), i);
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    private SharedFileInputStream(SharedFile sharedFile, long j, long j2, int i) {
        super((InputStream) null);
        this.start = 0;
        this.master = false;
        this.f61355sf = sharedFile;
        this.f61354in = sharedFile.open();
        this.start = j;
        this.bufpos = j;
        this.datalen = j2;
        this.bufsize = i;
        this.buf = new byte[i];
    }
}
