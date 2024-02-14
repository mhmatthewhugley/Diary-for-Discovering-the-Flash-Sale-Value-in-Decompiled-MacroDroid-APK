package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¨\u0006\u0005"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "it", "Lja/u;", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {229, 244}, mo71896m = "invokeSuspend")
/* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 */
/* compiled from: FlowExt.kt */
public final class C0907xe29ec4fd extends C13665l implements C16270q<C15288g<? super GenerationalViewportHint>, Integer, C13635d<? super C13339u>, Object> {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0907xe29ec4fd(C13635d dVar, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, dVar);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    public final Object invoke(C15288g<? super GenerationalViewportHint> gVar, Integer num, C13635d<? super C13339u> dVar) {
        C0907xe29ec4fd pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new C0907xe29ec4fd(dVar, this.this$0, this.$loadType$inlined);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = gVar;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(C13339u.f61331a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p297ja.C13332o.m85685b(r12)
            goto L_0x00c6
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r6 = r11.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r6 = (androidx.paging.PageFetcherSnapshotState.Holder) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
            p297ja.C13332o.m85685b(r12)
            goto L_0x0059
        L_0x002e:
            p297ja.C13332o.m85685b(r12)
            java.lang.Object r12 = r11.L$0
            r7 = r12
            kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
            java.lang.Object r12 = r11.L$1
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r6 = r12.stateHolder
            kotlinx.coroutines.sync.b r5 = r6.lock
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r5
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r12 = r5.mo74906a(r4, r11)
            if (r12 != r0) goto L_0x0059
            return r0
        L_0x0059:
            androidx.paging.PageFetcherSnapshotState r12 = r6.state     // Catch:{ all -> 0x00c9 }
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadType r8 = r11.$loadType$inlined     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadState r6 = r6.get(r8)     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadState$NotLoading$Companion r8 = androidx.paging.LoadState.NotLoading.Companion     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadState$NotLoading r9 = r8.getComplete$paging_common()     // Catch:{ all -> 0x00c9 }
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r9)     // Catch:{ all -> 0x00c9 }
            r9 = 0
            if (r6 == 0) goto L_0x007e
            androidx.paging.GenerationalViewportHint[] r12 = new androidx.paging.GenerationalViewportHint[r9]     // Catch:{ all -> 0x00c9 }
            kotlinx.coroutines.flow.f r12 = kotlinx.coroutines.flow.C15290h.m94134t(r12)     // Catch:{ all -> 0x00c9 }
            r5.mo74907b(r4)
            goto L_0x00b7
        L_0x007e:
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadType r10 = r11.$loadType$inlined     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadState r6 = r6.get(r10)     // Catch:{ all -> 0x00c9 }
            boolean r6 = r6 instanceof androidx.paging.LoadState.Error     // Catch:{ all -> 0x00c9 }
            if (r6 != 0) goto L_0x0099
            androidx.paging.MutableLoadStateCollection r12 = r12.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadType r6 = r11.$loadType$inlined     // Catch:{ all -> 0x00c9 }
            androidx.paging.LoadState$NotLoading r8 = r8.getIncomplete$paging_common()     // Catch:{ all -> 0x00c9 }
            r12.set(r6, r8)     // Catch:{ all -> 0x00c9 }
        L_0x0099:
            ja.u r12 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00c9 }
            r5.mo74907b(r4)
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.HintHandler r12 = r12.hintHandler
            androidx.paging.LoadType r5 = r11.$loadType$inlined
            kotlinx.coroutines.flow.f r12 = r12.hintFor(r5)
            if (r1 != 0) goto L_0x00ad
            r3 = 0
        L_0x00ad:
            kotlinx.coroutines.flow.f r12 = kotlinx.coroutines.flow.C15290h.m94126l(r12, r3)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1
            r3.<init>(r12, r1)
            r12 = r3
        L_0x00b7:
            r11.L$0 = r4
            r11.L$1 = r4
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.flow.C15290h.m94128n(r7, r12, r11)
            if (r12 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            ja.u r12 = p297ja.C13339u.f61331a
            return r12
        L_0x00c9:
            r12 = move-exception
            r5.mo74907b(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0907xe29ec4fd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
