package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1 */
/* compiled from: SafeCollector.common.kt */
public final class C0916x87eafe85 implements C15285f<ViewportHint> {
    final /* synthetic */ C15285f $this_unsafeTransform$inlined;
    final /* synthetic */ PageFetcherSnapshot this$0;

    public C0916x87eafe85(C15285f fVar, PageFetcherSnapshot pageFetcherSnapshot) {
        this.$this_unsafeTransform$inlined = fVar;
        this.this$0 = pageFetcherSnapshot;
    }

    public Object collect(final C15288g gVar, C13635d dVar) {
        C15285f fVar = this.$this_unsafeTransform$inlined;
        final PageFetcherSnapshot pageFetcherSnapshot = this.this$0;
        Object collect = fVar.collect(new C15288g<ViewportHint>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.C13635d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.C0916x87eafe85.C09172.C09181
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (androidx.paging.C0916x87eafe85.C09172.C09181) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r8)
                    goto L_0x0068
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    p297ja.C13332o.m85685b(r8)
                    kotlinx.coroutines.flow.g r8 = r4
                    r2 = r7
                    androidx.paging.ViewportHint r2 = (androidx.paging.ViewportHint) r2
                    int r4 = r2.getPresentedItemsBefore()
                    int r4 = r4 * -1
                    androidx.paging.PageFetcherSnapshot r5 = r2
                    androidx.paging.PagingConfig r5 = r5.config
                    int r5 = r5.jumpThreshold
                    if (r4 > r5) goto L_0x005c
                    int r2 = r2.getPresentedItemsAfter()
                    int r2 = r2 * -1
                    androidx.paging.PageFetcherSnapshot r4 = r2
                    androidx.paging.PagingConfig r4 = r4.config
                    int r4 = r4.jumpThreshold
                    if (r2 <= r4) goto L_0x005a
                    goto L_0x005c
                L_0x005a:
                    r2 = 0
                    goto L_0x005d
                L_0x005c:
                    r2 = 1
                L_0x005d:
                    if (r2 == 0) goto L_0x0068
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0068
                    return r1
                L_0x0068:
                    ja.u r7 = p297ja.C13339u.f61331a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0916x87eafe85.C09172.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C13652d.m87832c()) {
            return collect;
        }
        return C13339u.f61331a;
    }
}
