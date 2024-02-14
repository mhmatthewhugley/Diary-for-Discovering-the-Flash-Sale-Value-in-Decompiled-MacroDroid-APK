package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo71668d2 = {"Lkotlinx/coroutines/t2;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "z", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lja/u;", "r", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t2 */
/* compiled from: ThreadContextElement.kt */
public interface C15549t2<S> extends C13640g.C13643b {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.t2$a */
    /* compiled from: ThreadContextElement.kt */
    public static final class C15550a {
        /* renamed from: a */
        public static <S, R> R m94695a(C15549t2<S> t2Var, R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
            return C13640g.C13643b.C13644a.m87822a(t2Var, r, pVar);
        }

        /* renamed from: b */
        public static <S> C13640g m94696b(C15549t2<S> t2Var, C13640g gVar) {
            return C13640g.C13643b.C13644a.m87825d(t2Var, gVar);
        }
    }

    /* renamed from: r */
    void mo74775r(C13640g gVar, S s);

    /* renamed from: z */
    S mo74777z(C13640g gVar);
}
