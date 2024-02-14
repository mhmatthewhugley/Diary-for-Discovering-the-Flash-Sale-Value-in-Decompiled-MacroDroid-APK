package p090f5;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f5.h */
/* compiled from: MarkEnforcingInputStream */
public class C7313h extends FilterInputStream {

    /* renamed from: a */
    private int f17892a = Integer.MIN_VALUE;

    public C7313h(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: b */
    private long m30198b(long j) {
        int i = this.f17892a;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: c */
    private void m30199c(long j) {
        int i = this.f17892a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f17892a = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f17892a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f17892a = i;
    }

    public int read() throws IOException {
        if (m30198b(1) == -1) {
            return -1;
        }
        int read = super.read();
        m30199c(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f17892a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long b = m30198b(j);
        if (b == -1) {
            return 0;
        }
        long skip = super.skip(b);
        m30199c(skip);
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int b = (int) m30198b((long) i2);
        if (b == -1) {
            return -1;
        }
        int read = super.read(bArr, i, b);
        m30199c((long) read);
        return read;
    }
}
