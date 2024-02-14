package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", mo71894f = "SimpleChannelFlow.kt", mo71895l = {46}, mo71896m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
final class SimpleChannelFlowKt$simpleChannelFlow$1 extends C13665l implements C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", mo71894f = "SimpleChannelFlow.kt", mo71895l = {64, 65}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1 */
    /* compiled from: SimpleChannelFlow.kt */
    static final class C09541 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C09541 r0 = new C09541(gVar, pVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C09541) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0032
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r12.L$1
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.C15224h) r1
                java.lang.Object r5 = r12.L$0
                kotlinx.coroutines.w1 r5 = (kotlinx.coroutines.C15561w1) r5
                p297ja.C13332o.m85685b(r13)
                r13 = r1
                r1 = r5
                goto L_0x0053
            L_0x001d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0025:
                java.lang.Object r1 = r12.L$1
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.C15224h) r1
                java.lang.Object r5 = r12.L$0
                kotlinx.coroutines.w1 r5 = (kotlinx.coroutines.C15561w1) r5
                p297ja.C13332o.m85685b(r13)
                r6 = r12
                goto L_0x0066
            L_0x0032:
                p297ja.C13332o.m85685b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                kotlinx.coroutines.k0 r5 = (kotlinx.coroutines.C15478k0) r5
                r13 = 0
                r1 = 6
                kotlinx.coroutines.channels.f r13 = kotlinx.coroutines.channels.C15225i.m93852d(r13, r4, r4, r1, r4)
                r6 = 0
                r7 = 0
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                qa.p<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.d<? super ja.u>, java.lang.Object> r1 = r3
                r8.<init>(r13, r1, r4)
                r9 = 3
                r10 = 0
                kotlinx.coroutines.w1 r1 = kotlinx.coroutines.C15473j.m94492d(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.channels.h r13 = r13.iterator()
            L_0x0053:
                r5 = r12
            L_0x0054:
                r5.L$0 = r1
                r5.L$1 = r13
                r5.label = r3
                java.lang.Object r6 = r13.mo74540a(r5)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r11 = r1
                r1 = r13
                r13 = r6
                r6 = r5
                r5 = r11
            L_0x0066:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x0085
                java.lang.Object r13 = r1.next()
                kotlinx.coroutines.flow.g<T> r7 = r6
                r6.L$0 = r5
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r13 = r7.emit(r13, r6)
                if (r13 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r13 = r1
                r1 = r5
                r5 = r6
                goto L_0x0054
            L_0x0085:
                kotlinx.coroutines.C15561w1.C15562a.m94723a(r5, r4, r3, r4)
                ja.u r13 = p297ja.C13339u.f61331a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.C09541.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleChannelFlowKt$simpleChannelFlow$1(C16269p<? super SimpleProducerScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super SimpleChannelFlowKt$simpleChannelFlow$1> dVar) {
        super(2, dVar);
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.$block, dVar);
        simpleChannelFlowKt$simpleChannelFlow$1.L$0 = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    public final Object invoke(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final C15288g gVar = (C15288g) this.L$0;
            final C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> pVar = this.$block;
            C09541 r1 = new C09541((C13635d<? super C09541>) null);
            this.label = 1;
            if (C15482l0.m94505d(r1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
