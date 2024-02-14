package p208a8;

import java.io.File;
import java.io.IOException;

/* renamed from: a8.l */
/* compiled from: TempFile */
class C11076l {

    /* renamed from: a */
    private File f53982a;

    /* renamed from: b */
    private C11077m f53983b = new C11077m(this.f53982a);

    public C11076l(File file) throws IOException {
        File createTempFile = File.createTempFile("pop3.", ".mbox", file);
        this.f53982a = createTempFile;
        createTempFile.deleteOnExit();
    }

    /* renamed from: a */
    public void mo62139a() {
        try {
            this.f53983b.close();
        } catch (IOException unused) {
        }
        this.f53982a.delete();
    }

    /* renamed from: b */
    public C11060a mo62140b() throws IOException {
        return this.f53983b.mo62142b();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            mo62139a();
        } finally {
            super.finalize();
        }
    }
}
