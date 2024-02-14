package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.flow.C15288g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C0911x5e48bbd2 implements C15288g<PageEvent<Value>> {
    final /* synthetic */ SimpleProducerScope $$this$cancelableChannelFlow$inlined;

    public C0911x5e48bbd2(SimpleProducerScope simpleProducerScope) {
        this.$$this$cancelableChannelFlow$inlined = simpleProducerScope;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(androidx.paging.PageEvent<Value> r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.C0911x5e48bbd2.C09121
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.C0911x5e48bbd2.C09121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p297ja.C13332o.m85685b(r6)     // Catch:{ ClosedSendChannelException -> 0x0041 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p297ja.C13332o.m85685b(r6)
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5
            androidx.paging.SimpleProducerScope r6 = r4.$$this$cancelableChannelFlow$inlined     // Catch:{ ClosedSendChannelException -> 0x0041 }
            r0.label = r3     // Catch:{ ClosedSendChannelException -> 0x0041 }
            java.lang.Object r5 = r6.send(r5, r0)     // Catch:{ ClosedSendChannelException -> 0x0041 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0911x5e48bbd2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
