package p164s4;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p126l4.C7667b;

/* renamed from: s4.r */
/* compiled from: RecyclableBufferedInputStream */
public class C10217r extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f23342a;

    /* renamed from: c */
    private int f23343c;

    /* renamed from: d */
    private int f23344d;

    /* renamed from: f */
    private int f23345f;

    /* renamed from: g */
    private int f23346g;

    /* renamed from: o */
    private final C7667b f23347o;

    /* renamed from: s4.r$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C10218a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C10218a(String str) {
            super(str);
        }
    }

    public C10217r(@NonNull InputStream inputStream, @NonNull C7667b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: b */
    private int m40195b(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f23345f;
        if (i2 == -1 || this.f23346g - i2 >= (i = this.f23344d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f23345f = -1;
                this.f23346g = 0;
                this.f23343c = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f23343c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f23347o.mo37684c(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f23342a = bArr2;
            this.f23347o.put(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f23346g - this.f23345f;
        this.f23346g = i3;
        this.f23345f = 0;
        this.f23343c = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f23346g;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f23343c = i4;
        return read2;
    }

    /* renamed from: f */
    private static IOException m40196f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f23342a == null || inputStream == null) {
            throw m40196f();
        }
        return (this.f23343c - this.f23346g) + inputStream.available();
    }

    /* renamed from: c */
    public synchronized void mo40816c() {
        this.f23344d = this.f23342a.length;
    }

    public void close() throws IOException {
        if (this.f23342a != null) {
            this.f23347o.put(this.f23342a);
            this.f23342a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: e */
    public synchronized void mo40818e() {
        if (this.f23342a != null) {
            this.f23347o.put(this.f23342a);
            this.f23342a = null;
        }
    }

    public synchronized void mark(int i) {
        this.f23344d = Math.max(this.f23344d, i);
        this.f23345f = this.f23346g;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f23342a     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f23346g     // Catch:{ all -> 0x003e }
            int r3 = r5.f23343c     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m40195b(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f23342a     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f23342a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m40196f()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f23343c     // Catch:{ all -> 0x003e }
            int r2 = r5.f23346g     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f23346g = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m40196f()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164s4.C10217r.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f23342a != null) {
            int i = this.f23345f;
            if (-1 != i) {
                this.f23346g = i;
            } else {
                throw new C10218a("Mark has been invalidated, pos: " + this.f23346g + " markLimit: " + this.f23344d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f23342a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f23343c;
                int i2 = this.f23346g;
                if (((long) (i - i2)) >= j) {
                    this.f23346g = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f23346g = i;
                if (this.f23345f == -1 || j > ((long) this.f23344d)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m40195b(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f23343c;
                    int i4 = this.f23346g;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f23346g = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f23346g = i3;
                    return j3;
                }
            } else {
                throw m40196f();
            }
        } else {
            throw m40196f();
        }
    }

    @VisibleForTesting
    C10217r(@NonNull InputStream inputStream, @NonNull C7667b bVar, int i) {
        super(inputStream);
        this.f23345f = -1;
        this.f23347o = bVar;
        this.f23342a = (byte[]) bVar.mo37684c(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.NonNull byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f23342a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f23346g     // Catch:{ all -> 0x0090 }
            int r3 = r6.f23343c     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f23346g     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f23346g = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f23345f     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.m40195b(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f23342a     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f23342a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m40196f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f23343c     // Catch:{ all -> 0x0090 }
            int r4 = r6.f23346g     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f23346g     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f23346g = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m40196f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m40196f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p164s4.C10217r.read(byte[], int, int):int");
    }
}
