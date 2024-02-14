package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13698j0;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.internal.C15437e0;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/g;", "emitContext", "d", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "b", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.e */
/* compiled from: ChannelFlow.kt */
public final class C15306e {
    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final <T, V> Object m94169b(C13640g gVar, V v, Object obj, C16269p<? super V, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        Object c = C15437e0.m94362c(gVar, obj);
        try {
            Object invoke = ((C16269p) C13698j0.m87907g(pVar, 2)).invoke(v, new C15336v(dVar, gVar));
            C15437e0.m94360a(gVar, c);
            if (invoke == C13652d.m87832c()) {
                C13660h.m87847c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            C15437e0.m94360a(gVar, c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m94170c(C13640g gVar, Object obj, Object obj2, C16269p pVar, C13635d dVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C15437e0.m94361b(gVar);
        }
        return m94169b(gVar, obj, obj2, pVar, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final <T> C15288g<T> m94171d(C15288g<? super T> gVar, C13640g gVar2) {
        return gVar instanceof C15335u ? true : gVar instanceof C15327p ? gVar : new C15338x(gVar, gVar2);
    }
}
