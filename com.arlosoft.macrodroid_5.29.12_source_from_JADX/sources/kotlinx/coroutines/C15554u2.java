package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15442f0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/t2;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/t2;", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u2 */
/* compiled from: ThreadContextElement.kt */
public final class C15554u2 {
    /* renamed from: a */
    public static final <T> C15549t2<T> m94702a(ThreadLocal<T> threadLocal, T t) {
        return new C15442f0(t, threadLocal);
    }
}
