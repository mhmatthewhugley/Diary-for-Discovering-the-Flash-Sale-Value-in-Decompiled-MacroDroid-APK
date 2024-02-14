package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlinx.coroutines.flow.C15288g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Collect.kt */
public final class CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 implements C15288g<C13592k0<? extends PageEvent<T>>> {
    final /* synthetic */ CachedPageEventFlow this$0;

    public CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1(CachedPageEventFlow cachedPageEventFlow) {
        this.this$0 = cachedPageEventFlow;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(kotlin.collections.C13592k0<? extends androidx.paging.PageEvent<T>> r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1.C08771
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1.C08771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r7)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            kotlin.collections.k0 r6 = (kotlin.collections.C13592k0) r6
            java.lang.Object r2 = r0.L$0
            androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1) r2
            p297ja.C13332o.m85685b(r7)
            goto L_0x0059
        L_0x0040:
            p297ja.C13332o.m85685b(r7)
            kotlin.collections.k0 r6 = (kotlin.collections.C13592k0) r6
            androidx.paging.CachedPageEventFlow r7 = r5.this$0
            kotlinx.coroutines.flow.u r7 = r7.mutableSharedSrc
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.emit(r6, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r5
        L_0x0059:
            androidx.paging.CachedPageEventFlow r7 = r2.this$0
            androidx.paging.FlattenedPageController r7 = r7.pageController
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r7.record(r6, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
