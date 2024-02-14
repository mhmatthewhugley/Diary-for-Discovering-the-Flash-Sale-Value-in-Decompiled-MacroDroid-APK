package androidx.work;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000HHø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, mo71668d2 = {"Landroidx/work/Operation;", "Landroidx/work/Operation$State$SUCCESS;", "await", "(Landroidx/work/Operation;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Operation.kt */
public final class OperationKt {
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object await(androidx.work.Operation r4, kotlin.coroutines.C13635d<? super androidx.work.Operation.State.SUCCESS> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt$await$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4
            p297ja.C13332o.m85685b(r5)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p297ja.C13332o.m85685b(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x004c }
            goto L_0x0089
        L_0x004c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r4 = r5
        L_0x0055:
            throw r4
        L_0x0056:
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.o r5 = new kotlinx.coroutines.o
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.C13649c.m87831b(r0)
            r5.<init>(r2, r3)
            r5.mo74864z()
            androidx.work.ListenableFutureKt$await$2$1 r2 = new androidx.work.ListenableFutureKt$await$2$1
            r2.<init>(r5, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r2, r3)
            androidx.work.ListenableFutureKt$await$2$2 r2 = new androidx.work.ListenableFutureKt$await$2$2
            r2.<init>(r4)
            r5.mo74843d(r2)
            java.lang.Object r5 = r5.mo74862w()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r5 != r4) goto L_0x0085
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r0)
        L_0x0085:
            if (r5 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r4 = r5
        L_0x0089:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object await$$forInline(androidx.work.Operation r4, kotlin.coroutines.C13635d<? super androidx.work.Operation.State.SUCCESS> r5) {
        /*
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x0051
        L_0x0014:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            throw r4
        L_0x001e:
            r0 = 0
            kotlin.jvm.internal.C13705n.m87923c(r0)
            kotlinx.coroutines.o r0 = new kotlinx.coroutines.o
            kotlin.coroutines.d r1 = kotlin.coroutines.intrinsics.C13649c.m87831b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo74864z()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r1, r3)
            androidx.work.ListenableFutureKt$await$2$2 r1 = new androidx.work.ListenableFutureKt$await$2$2
            r1.<init>(r4)
            r0.mo74843d(r1)
            java.lang.Object r4 = r0.mo74862w()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r0) goto L_0x004e
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r5)
        L_0x004e:
            kotlin.jvm.internal.C13705n.m87923c(r2)
        L_0x0051:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await$$forInline(androidx.work.Operation, kotlin.coroutines.d):java.lang.Object");
    }
}
