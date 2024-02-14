package p226cd;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, mo71668d2 = {"Lcd/k;", "Lcd/y;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "close", "Lcd/z;", "q", "", "toString", "Ljava/io/InputStream;", "input", "timeout", "<init>", "(Ljava/io/InputStream;Lcd/z;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.k */
/* compiled from: JvmOkio.kt */
class C11195k implements C11212y {

    /* renamed from: a */
    private final InputStream f54120a;

    /* renamed from: c */
    private final C11213z f54121c;

    public C11195k(InputStream inputStream, C11213z zVar) {
        C13706o.m87929f(inputStream, "input");
        C13706o.m87929f(zVar, "timeout");
        this.f54120a = inputStream;
        this.f54121c = zVar;
    }

    public void close() {
        this.f54120a.close();
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f54121c.mo62525f();
                C11206t H = bVar.mo62403H(1);
                int read = this.f54120a.read(H.f54142a, H.f54144c, (int) Math.min(j, (long) (8192 - H.f54144c)));
                if (read != -1) {
                    H.f54144c += read;
                    long j2 = (long) read;
                    bVar.mo62398C(bVar.mo62399D() + j2);
                    return j2;
                } else if (H.f54143b != H.f54144c) {
                    return -1;
                } else {
                    bVar.f54090a = H.mo62562b();
                    C11208u.m75234b(H);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C11196l.m75164c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54121c;
    }

    public String toString() {
        return "source(" + this.f54120a + ')';
    }
}
