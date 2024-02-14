package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13628a;
import kotlin.coroutines.C13629b;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.internal.C15441f;
import kotlinx.coroutines.internal.C15451k;
import kotlinx.coroutines.internal.C15452l;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, mo71668d2 = {"Lkotlinx/coroutines/h0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g;", "context", "", "isDispatchNeeded", "", "parallelism", "limitedParallelism", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "dispatch", "dispatchYield", "T", "Lkotlin/coroutines/d;", "continuation", "interceptContinuation", "releaseInterceptedContinuation", "other", "plus", "", "toString", "<init>", "()V", "Key", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h0 */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C15415h0 extends C13628a implements C13636e {
    public static final C15416a Key = new C15416a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlinx/coroutines/h0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h0$a */
    /* compiled from: CoroutineDispatcher.kt */
    public static final class C15416a extends C13629b<C13636e, C15415h0> {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/h0;", "a", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/h0;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.h0$a$a */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C15417a extends C13708q implements C16265l<C13640g.C13643b, C15415h0> {

            /* renamed from: a */
            public static final C15417a f64621a = new C15417a();

            C15417a() {
                super(1);
            }

            /* renamed from: a */
            public final C15415h0 invoke(C13640g.C13643b bVar) {
                if (bVar instanceof C15415h0) {
                    return (C15415h0) bVar;
                }
                return null;
            }
        }

        private C15416a() {
            super(C13636e.f61896u, C15417a.f64621a);
        }

        public /* synthetic */ C15416a(C13695i iVar) {
            this();
        }
    }

    public C15415h0() {
        super(C13636e.f61896u);
    }

    public abstract void dispatch(C13640g gVar, Runnable runnable);

    public void dispatchYield(C13640g gVar, Runnable runnable) {
        dispatch(gVar, runnable);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return C13636e.C13637a.m87817a(this, cVar);
    }

    public final <T> C13635d<T> interceptContinuation(C13635d<? super T> dVar) {
        return new C15441f(this, dVar);
    }

    public boolean isDispatchNeeded(C13640g gVar) {
        return true;
    }

    public C15415h0 limitedParallelism(int i) {
        C15452l.m94416a(i);
        return new C15451k(this, i);
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C13636e.C13637a.m87818b(this, cVar);
    }

    public final C15415h0 plus(C15415h0 h0Var) {
        return h0Var;
    }

    public final void releaseInterceptedContinuation(C13635d<?> dVar) {
        ((C15441f) dVar).mo74772s();
    }

    public String toString() {
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this);
    }
}
