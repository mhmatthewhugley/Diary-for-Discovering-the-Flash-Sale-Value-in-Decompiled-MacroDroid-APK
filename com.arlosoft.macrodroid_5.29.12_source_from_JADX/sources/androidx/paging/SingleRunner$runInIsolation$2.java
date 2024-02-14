package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.SingleRunner$runInIsolation$2", mo71894f = "SingleRunner.kt", mo71895l = {53, 59, 61, 61}, mo71896m = "invokeSuspend")
/* compiled from: SingleRunner.kt */
final class SingleRunner$runInIsolation$2 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16265l<C13635d<? super C13339u>, Object> $block;
    final /* synthetic */ int $priority;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleRunner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i, C16265l<? super C13635d<? super C13339u>, ? extends Object> lVar, C13635d<? super SingleRunner$runInIsolation$2> dVar) {
        super(2, dVar);
        this.this$0 = singleRunner;
        this.$priority = i;
        this.$block = lVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.this$0, this.$priority, this.$block, dVar);
        singleRunner$runInIsolation$2.L$0 = obj;
        return singleRunner$runInIsolation$2;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((SingleRunner$runInIsolation$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r5) goto L_0x0034
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0025
            if (r1 == r2) goto L_0x001c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001c:
            java.lang.Object r0 = r8.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p297ja.C13332o.m85685b(r9)
            goto L_0x00a0
        L_0x0025:
            p297ja.C13332o.m85685b(r9)
            goto L_0x00a1
        L_0x002a:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.w1 r1 = (kotlinx.coroutines.C15561w1) r1
            p297ja.C13332o.m85685b(r9)     // Catch:{ all -> 0x0032 }
            goto L_0x007c
        L_0x0032:
            r9 = move-exception
            goto L_0x008e
        L_0x0034:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.w1 r1 = (kotlinx.coroutines.C15561w1) r1
            p297ja.C13332o.m85685b(r9)
            goto L_0x0067
        L_0x003c:
            p297ja.C13332o.m85685b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.k0 r9 = (kotlinx.coroutines.C15478k0) r9
            kotlin.coroutines.g r9 = r9.getCoroutineContext()
            kotlinx.coroutines.w1$b r1 = kotlinx.coroutines.C15561w1.f64808x
            kotlin.coroutines.g$b r9 = r9.get(r1)
            if (r9 == 0) goto L_0x00a4
            kotlinx.coroutines.w1 r9 = (kotlinx.coroutines.C15561w1) r9
            androidx.paging.SingleRunner r1 = r8.this$0
            androidx.paging.SingleRunner$Holder r1 = r1.holder
            int r6 = r8.$priority
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r1 = r1.tryEnqueue(r6, r9, r8)
            if (r1 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0067:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00a1
            qa.l<kotlin.coroutines.d<? super ja.u>, java.lang.Object> r9 = r8.$block     // Catch:{ all -> 0x0032 }
            r8.L$0 = r1     // Catch:{ all -> 0x0032 }
            r8.label = r4     // Catch:{ all -> 0x0032 }
            java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0032 }
            if (r9 != r0) goto L_0x007c
            return r0
        L_0x007c:
            androidx.paging.SingleRunner r9 = r8.this$0
            androidx.paging.SingleRunner$Holder r9 = r9.holder
            r2 = 0
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r9 = r9.onFinish(r1, r8)
            if (r9 != r0) goto L_0x00a1
            return r0
        L_0x008e:
            androidx.paging.SingleRunner r3 = r8.this$0
            androidx.paging.SingleRunner$Holder r3 = r3.holder
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = r3.onFinish(r1, r8)
            if (r1 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r0 = r9
        L_0x00a0:
            throw r0
        L_0x00a1:
            ja.u r9 = p297ja.C13339u.f61331a
            return r9
        L_0x00a4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
