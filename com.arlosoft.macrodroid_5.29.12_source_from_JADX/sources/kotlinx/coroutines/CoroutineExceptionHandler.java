package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, mo71668d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lja/u;", "handleException", "w", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* compiled from: CoroutineExceptionHandler.kt */
public interface CoroutineExceptionHandler extends C13640g.C13643b {

    /* renamed from: w */
    public static final C15183a f64381w = C15183a.f64382a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class C15183a implements C13640g.C13645c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C15183a f64382a = new C15183a();

        private C15183a() {
        }
    }

    void handleException(C13640g gVar, Throwable th);
}
