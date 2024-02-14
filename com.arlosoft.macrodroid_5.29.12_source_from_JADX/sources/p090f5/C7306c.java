package p090f5;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f5.c */
/* compiled from: ContentLengthInputStream */
public final class C7306c extends FilterInputStream {

    /* renamed from: a */
    private final long f17879a;

    /* renamed from: c */
    private int f17880c;

    private C7306c(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f17879a = j;
    }

    /* renamed from: b */
    private int m30179b(int i) throws IOException {
        if (i >= 0) {
            this.f17880c += i;
        } else if (this.f17879a - ((long) this.f17880c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f17879a + ", but read: " + this.f17880c);
        }
        return i;
    }

    @NonNull
    /* renamed from: c */
    public static InputStream m30180c(@NonNull InputStream inputStream, long j) {
        return new C7306c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f17879a - ((long) this.f17880c), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m30179b(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m30179b(super.read(bArr, i, i2));
    }
}
