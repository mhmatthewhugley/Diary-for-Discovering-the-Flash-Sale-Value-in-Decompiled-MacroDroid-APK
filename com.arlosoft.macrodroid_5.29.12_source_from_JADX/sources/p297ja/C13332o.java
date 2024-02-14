package p297ja;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, mo71668d2 = {"", "exception", "", "a", "Lja/n;", "Lja/u;", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: ja.o */
/* compiled from: Result.kt */
public final class C13332o {
    /* renamed from: a */
    public static final Object m85684a(Throwable th) {
        C13706o.m87929f(th, "exception");
        return new C13329n.C13331b(th);
    }

    /* renamed from: b */
    public static final void m85685b(Object obj) {
        if (obj instanceof C13329n.C13331b) {
            throw ((C13329n.C13331b) obj).exception;
        }
    }
}
