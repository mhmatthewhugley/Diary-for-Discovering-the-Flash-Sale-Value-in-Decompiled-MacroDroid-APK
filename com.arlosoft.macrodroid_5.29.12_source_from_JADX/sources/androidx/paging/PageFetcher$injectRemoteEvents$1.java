package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcher$injectRemoteEvents$1", mo71894f = "PageFetcher.kt", mo71895l = {233}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcher.kt */
final class PageFetcher$injectRemoteEvents$1 extends C13665l implements C16269p<SimpleProducerScope<PageEvent<Value>>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ RemoteMediatorAccessor<Key, Value> $accessor;
    final /* synthetic */ MutableLoadStateCollection $sourceStates;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> $this_injectRemoteEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcher$injectRemoteEvents$1(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, MutableLoadStateCollection mutableLoadStateCollection, C13635d<? super PageFetcher$injectRemoteEvents$1> dVar) {
        super(2, dVar);
        this.$accessor = remoteMediatorAccessor;
        this.$this_injectRemoteEvents = pageFetcherSnapshot;
        this.$sourceStates = mutableLoadStateCollection;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, dVar);
        pageFetcher$injectRemoteEvents$1.L$0 = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, C13635d<? super C13339u> dVar) {
        return ((PageFetcher$injectRemoteEvents$1) create(simpleProducerScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15285f simpleChannelFlow = SimpleChannelFlowKt.simpleChannelFlow(new C0896x6423e720(this.$accessor.getState(), this.$this_injectRemoteEvents.getPageEventFlow(), (C13635d) null, this.$sourceStates));
            C0895x8e1fc4b5 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 = new C0895x8e1fc4b5((SimpleProducerScope) this.L$0);
            this.label = 1;
            if (simpleChannelFlow.collect(pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1, this) == c) {
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
