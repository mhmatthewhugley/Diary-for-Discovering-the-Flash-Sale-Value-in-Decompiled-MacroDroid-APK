package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$simpleScan$1", mo71894f = "FlowExt.kt", mo71895l = {52, 222}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
final class FlowExtKt$simpleScan$1 extends C13665l implements C16269p<C15288g<? super R>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ C16270q<R, T, C13635d<? super R>, Object> $operation;
    final /* synthetic */ C15285f<T> $this_simpleScan;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleScan$1(R r, C15285f<? extends T> fVar, C16270q<? super R, ? super T, ? super C13635d<? super R>, ? extends Object> qVar, C13635d<? super FlowExtKt$simpleScan$1> dVar) {
        super(2, dVar);
        this.$initial = r;
        this.$this_simpleScan = fVar;
        this.$operation = qVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.$initial, this.$this_simpleScan, this.$operation, dVar);
        flowExtKt$simpleScan$1.L$0 = obj;
        return flowExtKt$simpleScan$1;
    }

    public final Object invoke(C15288g<? super R> gVar, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$simpleScan$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        C15288g gVar;
        C13684d0 d0Var;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15288g gVar2 = (C15288g) this.L$0;
            d0Var = new C13684d0();
            Object obj2 = this.$initial;
            d0Var.element = obj2;
            this.L$0 = gVar2;
            this.L$1 = d0Var;
            this.label = 1;
            if (gVar2.emit(obj2, this) == c) {
                return c;
            }
            gVar = gVar2;
        } else if (i == 1) {
            d0Var = (C13684d0) this.L$1;
            gVar = (C15288g) this.L$0;
            C13332o.m85685b(obj);
        } else if (i == 2) {
            C13332o.m85685b(obj);
            return C13339u.f61331a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15285f<T> fVar = this.$this_simpleScan;
        FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(d0Var, this.$operation, gVar);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (fVar.collect(flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1, this) == c) {
            return c;
        }
        return C13339u.f61331a;
    }
}
