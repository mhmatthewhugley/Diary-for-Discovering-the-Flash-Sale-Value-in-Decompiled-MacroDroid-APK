package p208a8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.mail.util.SharedFileInputStream;

/* renamed from: a8.m */
/* compiled from: WritableSharedFile */
class C11077m extends SharedFileInputStream {

    /* renamed from: a */
    private RandomAccessFile f53984a;

    /* renamed from: c */
    private C11060a f53985c;

    public C11077m(File file) throws IOException {
        super(file);
        try {
            this.f53984a = new RandomAccessFile(file, "rw");
        } catch (IOException unused) {
            super.close();
        }
    }

    /* renamed from: b */
    public synchronized C11060a mo62142b() throws IOException {
        C11060a aVar;
        if (this.f53985c == null) {
            aVar = new C11060a(this);
            this.f53985c = aVar;
        } else {
            throw new IOException("POP3 file cache only supports single threaded access");
        }
        return aVar;
    }

    /* renamed from: c */
    public RandomAccessFile mo62143c() {
        return this.f53984a;
    }

    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.f53984a.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized long mo62145e() throws IOException {
        long length;
        length = this.f61354in.length();
        this.datalen = length;
        this.f53985c = null;
        return length;
    }
}
