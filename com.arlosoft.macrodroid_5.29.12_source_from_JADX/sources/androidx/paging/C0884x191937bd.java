package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13705n;
import kotlinx.coroutines.C15263e3;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C0884x191937bd implements C15288g<Object> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner$inlined;

    public C0884x191937bd(UnbatchedFlowCombiner unbatchedFlowCombiner, int i) {
        this.$unbatchedFlowCombiner$inlined = unbatchedFlowCombiner;
        this.$index$inlined = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.C0884x191937bd.C08851
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.C0884x191937bd.C08851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r7)
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            p297ja.C13332o.m85685b(r7)
            goto L_0x0048
        L_0x0038:
            p297ja.C13332o.m85685b(r7)
            androidx.paging.UnbatchedFlowCombiner r7 = r5.$unbatchedFlowCombiner$inlined
            int r2 = r5.$index$inlined
            r0.label = r4
            java.lang.Object r6 = r7.onNext(r2, r6, r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C15263e3.m94032a(r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0884x191937bd.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public Object emit$$forInline(Object obj, C13635d dVar) {
        C13705n.m87923c(4);
        new C13656d(this, dVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C0884x191937bd this$0;

            {
                this.this$0 = r1;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit((Object) null, this);
            }
        };
        C13705n.m87923c(5);
        UnbatchedFlowCombiner unbatchedFlowCombiner = this.$unbatchedFlowCombiner$inlined;
        int i = this.$index$inlined;
        C13705n.m87923c(0);
        unbatchedFlowCombiner.onNext(i, obj, dVar);
        C13705n.m87923c(1);
        C13705n.m87923c(0);
        C15263e3.m94032a(dVar);
        C13705n.m87923c(1);
        return C13339u.f61331a;
    }
}
