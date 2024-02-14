package p108i4;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;
import p126l4.C7667b;

/* renamed from: i4.c */
/* compiled from: BufferedOutputStream */
public final class C7400c extends OutputStream {
    @NonNull

    /* renamed from: a */
    private final OutputStream f18100a;

    /* renamed from: c */
    private byte[] f18101c;

    /* renamed from: d */
    private C7667b f18102d;

    /* renamed from: f */
    private int f18103f;

    public C7400c(@NonNull OutputStream outputStream, @NonNull C7667b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: b */
    private void m30570b() throws IOException {
        int i = this.f18103f;
        if (i > 0) {
            this.f18100a.write(this.f18101c, 0, i);
            this.f18103f = 0;
        }
    }

    /* renamed from: c */
    private void m30571c() throws IOException {
        if (this.f18103f == this.f18101c.length) {
            m30570b();
        }
    }

    /* renamed from: e */
    private void m30572e() {
        byte[] bArr = this.f18101c;
        if (bArr != null) {
            this.f18102d.put(bArr);
            this.f18101c = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f18100a.close();
            m30572e();
        } catch (Throwable th) {
            this.f18100a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m30570b();
        this.f18100a.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f18101c;
        int i2 = this.f18103f;
        this.f18103f = i2 + 1;
        bArr[i2] = (byte) i;
        m30571c();
    }

    @VisibleForTesting
    C7400c(@NonNull OutputStream outputStream, C7667b bVar, int i) {
        this.f18100a = outputStream;
        this.f18102d = bVar;
        this.f18101c = (byte[]) bVar.mo37684c(i, byte[].class);
    }

    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f18103f;
            if (i6 != 0 || i4 < this.f18101c.length) {
                int min = Math.min(i4, this.f18101c.length - i6);
                System.arraycopy(bArr, i5, this.f18101c, this.f18103f, min);
                this.f18103f += min;
                i3 += min;
                m30571c();
            } else {
                this.f18100a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
