package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/g;", "Lkotlin/collections/k0;", "Landroidx/paging/PageEvent;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", mo71894f = "CachedPageEventFlow.kt", mo71895l = {63, 68}, mo71896m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
final class CachedPageEventFlow$sharedForDownstream$1 extends C13665l implements C16269p<C15288g<? super C13592k0<? extends PageEvent<T>>>, C13635d<? super C13339u>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow<T> cachedPageEventFlow, C13635d<? super CachedPageEventFlow$sharedForDownstream$1> dVar) {
        super(2, dVar);
        this.this$0 = cachedPageEventFlow;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, dVar);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    public final Object invoke(C15288g<? super C13592k0<? extends PageEvent<T>>> gVar, C13635d<? super C13339u> dVar) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r5.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r5.L$0
            kotlinx.coroutines.flow.g r3 = (kotlinx.coroutines.flow.C15288g) r3
            p297ja.C13332o.m85685b(r6)
            goto L_0x0054
        L_0x001a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0022:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            p297ja.C13332o.m85685b(r6)
            goto L_0x0043
        L_0x002a:
            p297ja.C13332o.m85685b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            androidx.paging.CachedPageEventFlow<T> r6 = r5.this$0
            androidx.paging.FlattenedPageController r6 = r6.pageController
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.getStateAsEvents(r5)
            if (r6 != r0) goto L_0x0043
            return r0
        L_0x0043:
            java.util.List r6 = (java.util.List) r6
            androidx.paging.CachedPageEventFlow<T> r3 = r5.this$0
            kotlinx.coroutines.w1 r3 = r3.job
            r3.start()
            java.util.Iterator r6 = r6.iterator()
            r3 = r1
            r1 = r6
        L_0x0054:
            r6 = r5
        L_0x0055:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r1.next()
            kotlin.collections.k0 r4 = (kotlin.collections.C13592k0) r4
            r6.L$0 = r3
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r4 = r3.emit(r4, r6)
            if (r4 != r0) goto L_0x0055
            return r0
        L_0x006e:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
