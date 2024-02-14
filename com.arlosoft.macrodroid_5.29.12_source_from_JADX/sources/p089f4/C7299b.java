package p089f4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: f4.b */
/* compiled from: StrictLineReader */
class C7299b implements Closeable {

    /* renamed from: a */
    private final InputStream f17864a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Charset f17865c;

    /* renamed from: d */
    private byte[] f17866d;

    /* renamed from: f */
    private int f17867f;

    /* renamed from: g */
    private int f17868g;

    /* renamed from: f4.b$a */
    /* compiled from: StrictLineReader */
    class C7300a extends ByteArrayOutputStream {
        C7300a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C7299b.this.f17865c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C7299b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    private void m30169c() throws IOException {
        InputStream inputStream = this.f17864a;
        byte[] bArr = this.f17866d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f17867f = 0;
            this.f17868g = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f17864a) {
            if (this.f17866d != null) {
                this.f17866d = null;
                this.f17864a.close();
            }
        }
    }

    /* renamed from: e */
    public boolean mo37225e() {
        return this.f17868g == -1;
    }

    /* renamed from: f */
    public String mo37226f() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f17864a) {
            if (this.f17866d != null) {
                if (this.f17867f >= this.f17868g) {
                    m30169c();
                }
                for (int i3 = this.f17867f; i3 != this.f17868g; i3++) {
                    byte[] bArr2 = this.f17866d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f17867f;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f17865c.name());
                                this.f17867f = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f17865c.name());
                        this.f17867f = i3 + 1;
                        return str2;
                    }
                }
                C7300a aVar = new C7300a((this.f17868g - this.f17867f) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f17866d;
                    int i5 = this.f17867f;
                    aVar.write(bArr3, i5, this.f17868g - i5);
                    this.f17868g = -1;
                    m30169c();
                    i = this.f17867f;
                    while (true) {
                        if (i != this.f17868g) {
                            bArr = this.f17866d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f17867f;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f17867f = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C7299b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C7301c.f17870a)) {
            this.f17864a = inputStream;
            this.f17865c = charset;
            this.f17866d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
