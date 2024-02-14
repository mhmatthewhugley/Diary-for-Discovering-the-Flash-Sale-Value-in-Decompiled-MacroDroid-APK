package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Landroidx/lifecycle/LiveDataScope;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", mo71894f = "FlowLiveData.kt", mo71895l = {151}, mo71896m = "invokeSuspend")
/* compiled from: FlowLiveData.kt */
final class FlowLiveDataConversions$asLiveData$1 extends C13665l implements C16269p<LiveDataScope<T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C15285f<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asLiveData$1(C15285f<? extends T> fVar, C13635d<? super FlowLiveDataConversions$asLiveData$1> dVar) {
        super(2, dVar);
        this.$this_asLiveData = fVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object invoke(LiveDataScope<T> liveDataScope, C13635d<? super C13339u> dVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15285f<T> fVar = this.$this_asLiveData;
            C0715x662b223e flowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1 = new C0715x662b223e((LiveDataScope) this.L$0);
            this.label = 1;
            if (fVar.collect(flowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
