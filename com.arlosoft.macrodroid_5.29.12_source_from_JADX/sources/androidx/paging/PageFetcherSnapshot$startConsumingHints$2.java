package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.sync.C15536b;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {608, 229}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$startConsumingHints$2 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C13635d<? super PageFetcherSnapshot$startConsumingHints$2> dVar) {
        super(2, dVar);
        this.this$0 = pageFetcherSnapshot;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PageFetcherSnapshot$startConsumingHints$2(this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((PageFetcherSnapshot$startConsumingHints$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        PageFetcherSnapshotState.Holder holder;
        C15536b bVar;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            pageFetcherSnapshot = this.this$0;
            holder = pageFetcherSnapshot.stateHolder;
            C15536b access$getLock$p = holder.lock;
            this.L$0 = holder;
            this.L$1 = access$getLock$p;
            this.L$2 = pageFetcherSnapshot;
            this.label = 1;
            if (access$getLock$p.mo74906a((Object) null, this) == c) {
                return c;
            }
            bVar = access$getLock$p;
        } else if (i == 1) {
            pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
            bVar = (C15536b) this.L$1;
            holder = (PageFetcherSnapshotState.Holder) this.L$0;
            C13332o.m85685b(obj);
        } else if (i == 2) {
            C13332o.m85685b(obj);
            return C13339u.f61331a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C15285f<Integer> consumePrependGenerationIdAsFlow = holder.state.consumePrependGenerationIdAsFlow();
            bVar.mo74907b((Object) null);
            LoadType loadType = LoadType.PREPEND;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (pageFetcherSnapshot.collectAsGenerationalViewportHints(consumePrependGenerationIdAsFlow, loadType, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        } catch (Throwable th) {
            bVar.mo74907b((Object) null);
            throw th;
        }
    }
}
