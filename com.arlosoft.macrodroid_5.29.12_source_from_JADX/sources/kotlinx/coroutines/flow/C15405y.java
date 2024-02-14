package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B4\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo71668d2 = {"Lkotlinx/coroutines/flow/y;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "d", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Lqa/p;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.y */
/* compiled from: Builders.kt */
final class C15405y<T> extends C15268a<T> {

    /* renamed from: a */
    private final C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> f64613a;

    public C15405y(C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        this.f64613a = pVar;
    }

    /* renamed from: d */
    public Object mo74645d(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        Object invoke = this.f64613a.invoke(gVar, dVar);
        return invoke == C13652d.m87832c() ? invoke : C13339u.f61331a;
    }
}
