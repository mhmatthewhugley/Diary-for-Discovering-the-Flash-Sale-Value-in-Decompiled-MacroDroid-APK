package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", mo71894f = "FlowLiveData.kt", mo71895l = {98, 102, 103}, mo71896m = "invokeSuspend")
/* compiled from: FlowLiveData.kt */
final class FlowLiveDataConversions$asFlow$1 extends C13665l implements C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, C13635d<? super FlowLiveDataConversions$asFlow$1> dVar) {
        super(2, dVar);
        this.$this_asFlow = liveData;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, dVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    public final Object invoke(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7 A[Catch:{ all -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0053
            if (r1 == r4) goto L_0x0043
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r1 = r14.L$2
            kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.C15224h) r1
            java.lang.Object r4 = r14.L$1
            androidx.lifecycle.Observer r4 = (androidx.lifecycle.Observer) r4
            java.lang.Object r6 = r14.L$0
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.C15288g) r6
            p297ja.C13332o.m85685b(r15)     // Catch:{ all -> 0x003f }
            r15 = r1
            goto L_0x008a
        L_0x0023:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002b:
            java.lang.Object r1 = r14.L$2
            kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.C15224h) r1
            java.lang.Object r4 = r14.L$1
            androidx.lifecycle.Observer r4 = (androidx.lifecycle.Observer) r4
            java.lang.Object r6 = r14.L$0
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.C15288g) r6
            p297ja.C13332o.m85685b(r15)     // Catch:{ all -> 0x003f }
            r7 = r6
            r6 = r4
            r4 = r1
            r1 = r14
            goto L_0x009f
        L_0x003f:
            r15 = move-exception
        L_0x0040:
            r1 = r14
            goto L_0x00e1
        L_0x0043:
            java.lang.Object r1 = r14.L$2
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            java.lang.Object r4 = r14.L$1
            kotlinx.coroutines.channels.f r4 = (kotlinx.coroutines.channels.C15221f) r4
            java.lang.Object r6 = r14.L$0
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.C15288g) r6
            p297ja.C13332o.m85685b(r15)
            goto L_0x0085
        L_0x0053:
            p297ja.C13332o.m85685b(r15)
            java.lang.Object r15 = r14.L$0
            r6 = r15
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.C15288g) r6
            r15 = -1
            r1 = 6
            kotlinx.coroutines.channels.f r15 = kotlinx.coroutines.channels.C15225i.m93852d(r15, r5, r5, r1, r5)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$observer$1 r1 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$observer$1
            r1.<init>(r15)
            kotlinx.coroutines.h2 r7 = kotlinx.coroutines.C15186a1.m93731c()
            kotlinx.coroutines.h2 r7 = r7.mo74507o()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r8 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r9 = r14.$this_asFlow
            r8.<init>(r9, r1, r5)
            r14.L$0 = r6
            r14.L$1 = r15
            r14.L$2 = r1
            r14.label = r4
            java.lang.Object r4 = kotlinx.coroutines.C15414h.m94298g(r7, r8, r14)
            if (r4 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r4 = r15
        L_0x0085:
            kotlinx.coroutines.channels.h r15 = r4.iterator()     // Catch:{ all -> 0x00dd }
            r4 = r1
        L_0x008a:
            r1 = r14
        L_0x008b:
            r1.L$0 = r6     // Catch:{ all -> 0x00db }
            r1.L$1 = r4     // Catch:{ all -> 0x00db }
            r1.L$2 = r15     // Catch:{ all -> 0x00db }
            r1.label = r3     // Catch:{ all -> 0x00db }
            java.lang.Object r7 = r15.mo74540a(r1)     // Catch:{ all -> 0x00db }
            if (r7 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r13 = r4
            r4 = r15
            r15 = r7
            r7 = r6
            r6 = r13
        L_0x009f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x00d8 }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r15 == 0) goto L_0x00be
            java.lang.Object r15 = r4.next()     // Catch:{ all -> 0x00d8 }
            r1.L$0 = r7     // Catch:{ all -> 0x00d8 }
            r1.L$1 = r6     // Catch:{ all -> 0x00d8 }
            r1.L$2 = r4     // Catch:{ all -> 0x00d8 }
            r1.label = r2     // Catch:{ all -> 0x00d8 }
            java.lang.Object r15 = r7.emit(r15, r1)     // Catch:{ all -> 0x00d8 }
            if (r15 != r0) goto L_0x00ba
            return r0
        L_0x00ba:
            r15 = r4
            r4 = r6
            r6 = r7
            goto L_0x008b
        L_0x00be:
            kotlinx.coroutines.p1 r7 = kotlinx.coroutines.C15503p1.f64723a
            kotlinx.coroutines.h2 r15 = kotlinx.coroutines.C15186a1.m93731c()
            kotlinx.coroutines.h2 r8 = r15.mo74507o()
            r9 = 0
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r10 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<T> r15 = r1.$this_asFlow
            r10.<init>(r15, r6, r5)
            r11 = 2
            r12 = 0
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r7, r8, r9, r10, r11, r12)
            ja.u r15 = p297ja.C13339u.f61331a
            return r15
        L_0x00d8:
            r15 = move-exception
            r4 = r6
            goto L_0x00e1
        L_0x00db:
            r15 = move-exception
            goto L_0x00e1
        L_0x00dd:
            r15 = move-exception
            r4 = r1
            goto L_0x0040
        L_0x00e1:
            kotlinx.coroutines.p1 r6 = kotlinx.coroutines.C15503p1.f64723a
            kotlinx.coroutines.h2 r0 = kotlinx.coroutines.C15186a1.m93731c()
            kotlinx.coroutines.h2 r7 = r0.mo74507o()
            r8 = 0
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r9 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<T> r0 = r1.$this_asFlow
            r9.<init>(r0, r4, r5)
            r10 = 2
            r11 = 0
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r6, r7, r8, r9, r10, r11)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
