package p208a8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: a8.a */
/* compiled from: AppendStream */
class C11060a extends OutputStream {

    /* renamed from: a */
    private final C11077m f53904a;

    /* renamed from: c */
    private RandomAccessFile f53905c;

    /* renamed from: d */
    private final long f53906d;

    /* renamed from: f */
    private long f53907f;

    public C11060a(C11077m mVar) throws IOException {
        this.f53904a = mVar;
        RandomAccessFile c = mVar.mo62143c();
        this.f53905c = c;
        long length = c.length();
        this.f53906d = length;
        this.f53905c.seek(length);
    }

    /* renamed from: b */
    public synchronized InputStream mo62046b() throws IOException {
        return this.f53904a.newStream(this.f53906d, this.f53907f);
    }

    public synchronized void close() throws IOException {
        this.f53907f = this.f53904a.mo62145e();
        this.f53905c = null;
    }

    public void write(int i) throws IOException {
        this.f53905c.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this.f53905c.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f53905c.write(bArr, i, i2);
    }
}
