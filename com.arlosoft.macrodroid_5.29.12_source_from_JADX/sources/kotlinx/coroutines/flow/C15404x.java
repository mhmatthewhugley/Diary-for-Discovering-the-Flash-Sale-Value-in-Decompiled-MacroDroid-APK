package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15324n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HAø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/flow/x;", "T", "Lkotlinx/coroutines/flow/i0;", "", "Lkotlinx/coroutines/flow/internal/n;", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/f;", "a", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/w1;", "job", "flow", "<init>", "(Lkotlinx/coroutines/flow/i0;Lkotlinx/coroutines/w1;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.x */
/* compiled from: Share.kt */
final class C15404x<T> implements C15299i0<T>, C15285f, C15324n<T> {

    /* renamed from: a */
    private final C15561w1 f64611a;

    /* renamed from: c */
    private final /* synthetic */ C15299i0<T> f64612c;

    public C15404x(C15299i0<? extends T> i0Var, C15561w1 w1Var) {
        this.f64611a = w1Var;
        this.f64612c = i0Var;
    }

    /* renamed from: a */
    public C15285f<T> mo74651a(C13640g gVar, int i, C15220e eVar) {
        return C15346k0.m94218d(this, gVar, i, eVar);
    }

    public Object collect(C15288g<? super T> gVar, C13635d<?> dVar) {
        return this.f64612c.collect(gVar, dVar);
    }
}
