package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.flow.internal.C15303d;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/flow/d;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/channels/r;", "scope", "Lja/u;", "f", "(Lkotlinx/coroutines/channels/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "<init>", "(Lqa/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.d */
/* compiled from: Builders.kt */
class C15279d<T> extends C15303d<T> {

    /* renamed from: f */
    private final C16269p<C15239r<? super T>, C13635d<? super C13339u>, Object> f64505f;

    public C15279d(C16269p<? super C15239r<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13640g gVar, int i, C15220e eVar) {
        super(gVar, i, eVar);
        this.f64505f = pVar;
    }

    /* renamed from: m */
    static /* synthetic */ Object m94103m(C15279d dVar, C15239r rVar, C13635d dVar2) {
        Object invoke = dVar.f64505f.invoke(rVar, dVar2);
        return invoke == C13652d.m87832c() ? invoke : C13339u.f61331a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo74656f(C15239r<? super T> rVar, C13635d<? super C13339u> dVar) {
        return m94103m(this, rVar, dVar);
    }

    public String toString() {
        return "block[" + this.f64505f + "] -> " + super.toString();
    }
}
