package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13680b0;
import kotlinx.coroutines.flow.C15288g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C0875x265e02f4 implements C15288g<C13592k0<? extends PageEvent<T>>> {
    final /* synthetic */ C15288g $$this$flow$inlined;
    final /* synthetic */ C13680b0 $maxEventIndex$inlined;

    public C0875x265e02f4(C13680b0 b0Var, C15288g gVar) {
        this.$maxEventIndex$inlined = b0Var;
        this.$$this$flow$inlined = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(kotlin.collections.C13592k0<? extends androidx.paging.PageEvent<T>> r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.C0875x265e02f4.C08761
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.C0875x265e02f4.C08761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            kotlin.collections.k0 r5 = (kotlin.collections.C13592k0) r5
            java.lang.Object r0 = r0.L$0
            androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1 r0 = (androidx.paging.C0875x265e02f4) r0
            p297ja.C13332o.m85685b(r6)
            goto L_0x005f
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            p297ja.C13332o.m85685b(r6)
            kotlin.collections.k0 r5 = (kotlin.collections.C13592k0) r5
            kotlin.jvm.internal.C13706o.m87926c(r5)
            int r6 = r5.mo71844c()
            kotlin.jvm.internal.b0 r2 = r4.$maxEventIndex$inlined
            int r2 = r2.element
            if (r6 <= r2) goto L_0x0067
            kotlinx.coroutines.flow.g r6 = r4.$$this$flow$inlined
            java.lang.Object r2 = r5.mo71845d()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r0 = r4
        L_0x005f:
            kotlin.jvm.internal.b0 r6 = r0.$maxEventIndex$inlined
            int r5 = r5.mo71844c()
            r6.element = r5
        L_0x0067:
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0875x265e02f4.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
