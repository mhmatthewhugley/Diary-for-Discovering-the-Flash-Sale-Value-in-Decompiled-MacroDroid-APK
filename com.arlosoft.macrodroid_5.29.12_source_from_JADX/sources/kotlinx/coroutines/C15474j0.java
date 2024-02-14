package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, mo71668d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lja/u;", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C15474j0 {
    /* renamed from: a */
    public static final void m94494a(C13640g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f64381w);
            if (coroutineExceptionHandler == null) {
                C15425i0.m94329a(gVar, th);
            } else {
                coroutineExceptionHandler.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C15425i0.m94329a(gVar, m94495b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m94495b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C13315b.m85661a(runtimeException, th);
        return runtimeException;
    }
}
