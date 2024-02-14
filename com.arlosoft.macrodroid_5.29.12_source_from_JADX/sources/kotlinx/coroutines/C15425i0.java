package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, mo71668d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lja/u;", "a", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i0 */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C15425i0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f64631a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        f64631a = C15132p.m93480D(C15125n.m93468c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m94329a(C13640g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : f64631a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C15474j0.m94495b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            C13315b.m85661a(th, new C15556v0(gVar));
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th3) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
