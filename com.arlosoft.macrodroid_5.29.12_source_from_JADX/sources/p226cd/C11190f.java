package p226cd;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0011"}, mo71668d2 = {"Lcd/f;", "Lcd/w;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "Lcd/z;", "q", "close", "", "toString", "delegate", "<init>", "(Lcd/w;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.f */
/* compiled from: ForwardingSink.kt */
public abstract class C11190f implements C11210w {

    /* renamed from: a */
    private final C11210w f54108a;

    public C11190f(C11210w wVar) {
        C13706o.m87929f(wVar, "delegate");
        this.f54108a = wVar;
    }

    /* renamed from: X */
    public void mo62384X(C11179b bVar, long j) throws IOException {
        C13706o.m87929f(bVar, "source");
        this.f54108a.mo62384X(bVar, j);
    }

    public void close() throws IOException {
        this.f54108a.close();
    }

    public void flush() throws IOException {
        this.f54108a.flush();
    }

    /* renamed from: q */
    public C11213z mo62388q() {
        return this.f54108a.mo62388q();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f54108a + ')';
    }
}
