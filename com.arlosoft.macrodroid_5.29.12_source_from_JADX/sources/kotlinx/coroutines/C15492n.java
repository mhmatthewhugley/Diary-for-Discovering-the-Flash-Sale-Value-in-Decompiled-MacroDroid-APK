package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\tH'J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H'J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0015H&J\u001b\u0010\u0019\u001a\u00020\n*\u00020\u00182\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, mo71668d2 = {"Lkotlinx/coroutines/n;", "T", "Lkotlin/coroutines/d;", "value", "", "idempotent", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lja/u;", "onCancellation", "t", "(Ljava/lang/Object;Ljava/lang/Object;Lqa/l;)Ljava/lang/Object;", "exception", "j", "token", "B", "cause", "", "k", "Lkotlinx/coroutines/CompletionHandler;", "handler", "d", "Lkotlinx/coroutines/h0;", "q", "(Lkotlinx/coroutines/h0;Ljava/lang/Object;)V", "l", "(Ljava/lang/Object;Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n */
/* compiled from: CancellableContinuation.kt */
public interface C15492n<T> extends C13635d<T> {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.n$a */
    /* compiled from: CancellableContinuation.kt */
    public static final class C15493a {
        /* renamed from: a */
        public static /* synthetic */ boolean m94522a(C15492n nVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return nVar.mo74845k(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m94523b(C15492n nVar, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return nVar.mo74842a(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: B */
    void mo74841B(Object obj);

    /* renamed from: a */
    Object mo74842a(T t, Object obj);

    /* renamed from: d */
    void mo74843d(C16265l<? super Throwable, C13339u> lVar);

    /* renamed from: j */
    Object mo74844j(Throwable th);

    /* renamed from: k */
    boolean mo74845k(Throwable th);

    /* renamed from: l */
    void mo74846l(T t, C16265l<? super Throwable, C13339u> lVar);

    /* renamed from: q */
    void mo74847q(C15415h0 h0Var, T t);

    /* renamed from: t */
    Object mo74848t(T t, Object obj, C16265l<? super Throwable, C13339u> lVar);
}
