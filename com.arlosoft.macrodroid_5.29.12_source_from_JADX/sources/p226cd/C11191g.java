package p226cd;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Lcd/g;", "Lcd/y;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lcd/z;", "q", "Lja/u;", "close", "", "toString", "delegate", "Lcd/y;", "b", "()Lcd/y;", "<init>", "(Lcd/y;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.g */
/* compiled from: ForwardingSource.kt */
public abstract class C11191g implements C11212y {

    /* renamed from: a */
    private final C11212y f54109a;

    public C11191g(C11212y yVar) {
        C13706o.m87929f(yVar, "delegate");
        this.f54109a = yVar;
    }

    /* renamed from: b */
    public final C11212y mo62518b() {
        return this.f54109a;
    }

    public void close() throws IOException {
        this.f54109a.close();
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) throws IOException {
        C13706o.m87929f(bVar, "sink");
        return this.f54109a.mo62392m0(bVar, j);
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54109a.mo62393q();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f54109a + ')';
    }
}
