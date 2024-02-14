package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "androidx/paging/PagingDataTransforms$transform$$inlined$map$1"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SafeCollector.common.kt */
public final class PagingDataTransforms$filter$$inlined$transform$2 implements C15285f<PageEvent<T>> {
    final /* synthetic */ Executor $executor$inlined;
    final /* synthetic */ C16265l $predicate$inlined;
    final /* synthetic */ C15285f $this_unsafeTransform$inlined;

    public PagingDataTransforms$filter$$inlined$transform$2(C15285f fVar, Executor executor, C16265l lVar) {
        this.$this_unsafeTransform$inlined = fVar;
        this.$executor$inlined = executor;
        this.$predicate$inlined = lVar;
    }

    public Object collect(final C15288g gVar, C13635d dVar) {
        C15285f fVar = this.$this_unsafeTransform$inlined;
        final Executor executor = this.$executor$inlined;
        final C16265l lVar = this.$predicate$inlined;
        Object collect = fVar.collect(new C15288g<PageEvent<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.C13635d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof androidx.paging.PagingDataTransforms$filter$$inlined$transform$2.C09302.C09311
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    androidx.paging.PagingDataTransforms$filter$$inlined$transform$2$2$1 r0 = (androidx.paging.PagingDataTransforms$filter$$inlined$transform$2.C09302.C09311) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PagingDataTransforms$filter$$inlined$transform$2$2$1 r0 = new androidx.paging.PagingDataTransforms$filter$$inlined$transform$2$2$1
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L_0x003d
                    if (r2 == r5) goto L_0x0035
                    if (r2 != r4) goto L_0x002d
                    p297ja.C13332o.m85685b(r11)
                    goto L_0x006a
                L_0x002d:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0035:
                    java.lang.Object r10 = r0.L$0
                    kotlinx.coroutines.flow.g r10 = (kotlinx.coroutines.flow.C15288g) r10
                    p297ja.C13332o.m85685b(r11)
                    goto L_0x005f
                L_0x003d:
                    p297ja.C13332o.m85685b(r11)
                    kotlinx.coroutines.flow.g r11 = r5
                    androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                    java.util.concurrent.Executor r2 = r2
                    kotlinx.coroutines.h0 r2 = kotlinx.coroutines.C15499o1.m94574a(r2)
                    androidx.paging.PagingDataTransforms$filter$2$1 r6 = new androidx.paging.PagingDataTransforms$filter$2$1
                    qa.l r7 = r3
                    r6.<init>(r10, r7, r3)
                    r0.L$0 = r11
                    r0.label = r5
                    java.lang.Object r10 = kotlinx.coroutines.C15414h.m94298g(r2, r6, r0)
                    if (r10 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L_0x005f:
                    r0.L$0 = r3
                    r0.label = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    ja.u r10 = p297ja.C13339u.f61331a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataTransforms$filter$$inlined$transform$2.C09302.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C13652d.m87832c()) {
            return collect;
        }
        return C13339u.f61331a;
    }
}
