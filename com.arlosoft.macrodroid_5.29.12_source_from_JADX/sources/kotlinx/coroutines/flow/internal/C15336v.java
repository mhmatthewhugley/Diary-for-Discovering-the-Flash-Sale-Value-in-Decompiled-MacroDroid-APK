package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13657e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/v;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lja/n;", "result", "Lja/u;", "resumeWith", "(Ljava/lang/Object;)V", "a", "Lkotlin/coroutines/d;", "uCont", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.v */
/* compiled from: ChannelFlow.kt */
final class C15336v<T> implements C13635d<T>, C13657e {

    /* renamed from: a */
    private final C13635d<T> f64557a;

    /* renamed from: c */
    private final C13640g f64558c;

    public C15336v(C13635d<? super T> dVar, C13640g gVar) {
        this.f64557a = dVar;
        this.f64558c = gVar;
    }

    public C13657e getCallerFrame() {
        C13635d<T> dVar = this.f64557a;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }

    public C13640g getContext() {
        return this.f64558c;
    }

    public void resumeWith(Object obj) {
        this.f64557a.resumeWith(obj);
    }
}
