package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/g;", "Landroidx/paging/PageEvent;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {608, 174}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$pageEventFlow$2 extends C13665l implements C16269p<C15288g<? super PageEvent<Value>>, C13635d<? super C13339u>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C13635d<? super PageFetcherSnapshot$pageEventFlow$2> dVar) {
        super(2, dVar);
        this.this$0 = pageFetcherSnapshot;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, dVar);
        pageFetcherSnapshot$pageEventFlow$2.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    public final Object invoke(C15288g<? super PageEvent<Value>> gVar, C13635d<? super C13339u> dVar) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r6.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L_0x002b
            if (r1 == r2) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            p297ja.C13332o.m85685b(r7)
            goto L_0x0070
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001b:
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r5 = r6.L$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            p297ja.C13332o.m85685b(r7)
            goto L_0x004d
        L_0x002b:
            p297ja.C13332o.m85685b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            androidx.paging.PageFetcherSnapshot<Key, Value> r7 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = r7.stateHolder
            kotlinx.coroutines.sync.b r7 = r5.lock
            r6.L$0 = r5
            r6.L$1 = r7
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r2 = r7.mo74906a(r4, r6)
            if (r2 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r2 = r7
        L_0x004d:
            androidx.paging.PageFetcherSnapshotState r7 = r5.state     // Catch:{ all -> 0x0073 }
            androidx.paging.MutableLoadStateCollection r7 = r7.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x0073 }
            androidx.paging.LoadStates r7 = r7.snapshot()     // Catch:{ all -> 0x0073 }
            r2.mo74907b(r4)
            androidx.paging.PageEvent$LoadStateUpdate r2 = new androidx.paging.PageEvent$LoadStateUpdate
            r2.<init>(r7, r4, r3, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.label = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L_0x0070
            return r0
        L_0x0070:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x0073:
            r7 = move-exception
            r2.mo74907b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
