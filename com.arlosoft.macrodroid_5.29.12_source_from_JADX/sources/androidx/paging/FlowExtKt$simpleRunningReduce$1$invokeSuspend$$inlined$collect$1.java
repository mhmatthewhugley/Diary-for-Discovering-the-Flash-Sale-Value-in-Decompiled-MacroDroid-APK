package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13684d0;
import kotlinx.coroutines.flow.C15288g;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Collect.kt */
public final class FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 implements C15288g<T> {
    final /* synthetic */ C15288g $$this$flow$inlined;
    final /* synthetic */ C13684d0 $accumulator$inlined;
    final /* synthetic */ C16270q $operation$inlined;

    public FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(C13684d0 d0Var, C16270q qVar, C15288g gVar) {
        this.$accumulator$inlined = d0Var;
        this.$operation$inlined = qVar;
        this.$$this$flow$inlined = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.C08861
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.C08861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r9)
            goto L_0x0083
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.d0 r8 = (kotlin.jvm.internal.C13684d0) r8
            java.lang.Object r2 = r0.L$0
            androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1) r2
            p297ja.C13332o.m85685b(r9)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x006d
        L_0x0043:
            p297ja.C13332o.m85685b(r9)
            kotlin.jvm.internal.d0 r9 = r7.$accumulator$inlined
            T r2 = r9.element
            java.lang.Object r5 = androidx.paging.FlowExtKt.NULL
            if (r2 != r5) goto L_0x0052
        L_0x0050:
            r2 = r7
            goto L_0x006d
        L_0x0052:
            qa.q r2 = r7.$operation$inlined
            kotlin.jvm.internal.d0 r5 = r7.$accumulator$inlined
            T r5 = r5.element
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            r4 = 6
            kotlin.jvm.internal.C13705n.m87923c(r4)
            java.lang.Object r8 = r2.invoke(r5, r8, r0)
            r2 = 7
            kotlin.jvm.internal.C13705n.m87923c(r2)
            if (r8 != r1) goto L_0x0050
            return r1
        L_0x006d:
            r9.element = r8
            kotlinx.coroutines.flow.g r8 = r2.$$this$flow$inlined
            kotlin.jvm.internal.d0 r9 = r2.$accumulator$inlined
            T r9 = r9.element
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x0083
            return r1
        L_0x0083:
            ja.u r8 = p297ja.C13339u.f61331a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
