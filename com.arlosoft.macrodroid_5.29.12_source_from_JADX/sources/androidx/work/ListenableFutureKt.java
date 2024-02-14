package androidx.work;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, mo71668d2 = {"R", "Lcom/google/common/util/concurrent/ListenableFuture;", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt {
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.lang.Object await(com.google.common.util.concurrent.ListenableFuture<R> r3, kotlin.coroutines.C13635d<? super R> r4) {
        /*
            boolean r0 = r3.isDone()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r3 = r3.get()     // Catch:{ ExecutionException -> 0x000b }
            return r3
        L_0x000b:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            if (r4 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = r4
        L_0x0014:
            throw r3
        L_0x0015:
            kotlinx.coroutines.o r0 = new kotlinx.coroutines.o
            kotlin.coroutines.d r1 = kotlin.coroutines.intrinsics.C13649c.m87831b(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo74864z()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r3)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r3.addListener(r1, r2)
            androidx.work.ListenableFutureKt$await$2$2 r1 = new androidx.work.ListenableFutureKt$await$2$2
            r1.<init>(r3)
            r0.mo74843d(r1)
            java.lang.Object r3 = r0.mo74862w()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r3 != r0) goto L_0x0041
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r4)
        L_0x0041:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.ListenableFutureKt.await(com.google.common.util.concurrent.ListenableFuture, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <R> java.lang.Object await$$forInline(com.google.common.util.concurrent.ListenableFuture<R> r4, kotlin.coroutines.C13635d<? super R> r5) {
        /*
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x000b }
            return r4
        L_0x000b:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r4 = r5
        L_0x0014:
            throw r4
        L_0x0015:
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
            if (r4 != r0) goto L_0x0045
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r5)
        L_0x0045:
            kotlin.jvm.internal.C13705n.m87923c(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.ListenableFutureKt.await$$forInline(com.google.common.util.concurrent.ListenableFuture, kotlin.coroutines.d):java.lang.Object");
    }
}
