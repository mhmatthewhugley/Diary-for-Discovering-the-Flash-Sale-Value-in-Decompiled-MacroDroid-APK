package p226cd;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0013"}, mo71668d2 = {"Lcd/p;", "Lcd/w;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "close", "Lcd/z;", "q", "", "toString", "Ljava/io/OutputStream;", "out", "timeout", "<init>", "(Ljava/io/OutputStream;Lcd/z;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.p */
/* compiled from: JvmOkio.kt */
final class C11201p implements C11210w {

    /* renamed from: a */
    private final OutputStream f54126a;

    /* renamed from: c */
    private final C11213z f54127c;

    public C11201p(OutputStream outputStream, C11213z zVar) {
        C13706o.m87929f(outputStream, "out");
        C13706o.m87929f(zVar, "timeout");
        this.f54126a = outputStream;
        this.f54127c = zVar;
    }

    /* renamed from: X */
    public void mo62384X(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "source");
        C11187d0.m75097b(bVar.mo62399D(), 0, j);
        while (j > 0) {
            this.f54127c.mo62525f();
            C11206t tVar = bVar.f54090a;
            C13706o.m87926c(tVar);
            int min = (int) Math.min(j, (long) (tVar.f54144c - tVar.f54143b));
            this.f54126a.write(tVar.f54142a, tVar.f54143b, min);
            tVar.f54143b += min;
            long j2 = (long) min;
            j -= j2;
            bVar.mo62398C(bVar.mo62399D() - j2);
            if (tVar.f54143b == tVar.f54144c) {
                bVar.f54090a = tVar.mo62562b();
                C11208u.m75234b(tVar);
            }
        }
    }

    public void close() {
        this.f54126a.close();
    }

    public void flush() {
        this.f54126a.flush();
    }

    /* renamed from: q */
    public C11213z mo62388q() {
        return this.f54127c;
    }

    public String toString() {
        return "sink(" + this.f54126a + ')';
    }
}
