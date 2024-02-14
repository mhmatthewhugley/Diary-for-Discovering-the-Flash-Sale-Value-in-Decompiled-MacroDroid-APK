package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.sync.C15536b;
import kotlinx.coroutines.sync.C15544d;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0011\u0013B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo71668d2 = {"Landroidx/paging/SingleRunner;", "", "", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lja/u;", "block", "runInIsolation", "(ILqa/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/SingleRunner$Holder;", "holder", "Landroidx/paging/SingleRunner$Holder;", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "Companion", "CancelIsolatedRunnerException", "Holder", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SingleRunner.kt */
public final class SingleRunner {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int DEFAULT_PRIORITY = 0;
    /* access modifiers changed from: private */
    public final Holder holder;

    @Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: SingleRunner.kt */
    private static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            C13706o.m87929f(singleRunner, "runner");
            this.runner = singleRunner;
        }

        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo71668d2 = {"Landroidx/paging/SingleRunner$Companion;", "", "()V", "DEFAULT_PRIORITY", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: SingleRunner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo71668d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "", "priority", "Lkotlinx/coroutines/w1;", "job", "", "tryEnqueue", "(ILkotlinx/coroutines/w1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lja/u;", "onFinish", "(Lkotlinx/coroutines/w1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/SingleRunner;", "singleRunner", "Landroidx/paging/SingleRunner;", "cancelPreviousInEqualPriority", "Z", "Lkotlinx/coroutines/sync/b;", "mutex", "Lkotlinx/coroutines/sync/b;", "previous", "Lkotlinx/coroutines/w1;", "previousPriority", "I", "<init>", "(Landroidx/paging/SingleRunner;Z)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: SingleRunner.kt */
    private static final class Holder {
        private final boolean cancelPreviousInEqualPriority;
        private final C15536b mutex = C15544d.m94682b(false, 1, (Object) null);
        private C15561w1 previous;
        private int previousPriority;
        private final SingleRunner singleRunner;

        public Holder(SingleRunner singleRunner2, boolean z) {
            C13706o.m87929f(singleRunner2, "singleRunner");
            this.singleRunner = singleRunner2;
            this.cancelPreviousInEqualPriority = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0061 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object onFinish(kotlinx.coroutines.C15561w1 r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.C15536b) r6
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.w1 r1 = (kotlinx.coroutines.C15561w1) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                p297ja.C13332o.m85685b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                p297ja.C13332o.m85685b(r7)
                kotlinx.coroutines.sync.b r7 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.mo74906a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                kotlinx.coroutines.w1 r1 = r0.previous     // Catch:{ all -> 0x0061 }
                if (r6 != r1) goto L_0x005b
                r0.previous = r4     // Catch:{ all -> 0x0061 }
            L_0x005b:
                ja.u r6 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0061 }
                r7.mo74907b(r4)
                return r6
            L_0x0061:
                r6 = move-exception
                r7.mo74907b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.onFinish(kotlinx.coroutines.w1, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object tryEnqueue(int r10, kotlinx.coroutines.C15561w1 r11, kotlin.coroutines.C13635d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L_0x0013
                r0 = r12
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0059
                if (r2 == r5) goto L_0x0047
                if (r2 != r3) goto L_0x003f
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                kotlinx.coroutines.sync.b r11 = (kotlinx.coroutines.sync.C15536b) r11
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.w1 r1 = (kotlinx.coroutines.C15561w1) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                p297ja.C13332o.m85685b(r12)     // Catch:{ all -> 0x003c }
                goto L_0x00ac
            L_0x003c:
                r10 = move-exception
                goto L_0x00ba
            L_0x003f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0047:
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                kotlinx.coroutines.sync.b r11 = (kotlinx.coroutines.sync.C15536b) r11
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.w1 r2 = (kotlinx.coroutines.C15561w1) r2
                java.lang.Object r6 = r0.L$0
                androidx.paging.SingleRunner$Holder r6 = (androidx.paging.SingleRunner.Holder) r6
                p297ja.C13332o.m85685b(r12)
                goto L_0x0072
            L_0x0059:
                p297ja.C13332o.m85685b(r12)
                kotlinx.coroutines.sync.b r12 = r9.mutex
                r0.L$0 = r9
                r0.L$1 = r11
                r0.L$2 = r12
                r0.I$0 = r10
                r0.label = r5
                java.lang.Object r2 = r12.mo74906a(r4, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0072:
                kotlinx.coroutines.w1 r12 = r6.previous     // Catch:{ all -> 0x003c }
                if (r12 == 0) goto L_0x0089
                boolean r7 = r12.mo74487b()     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0089
                int r7 = r6.previousPriority     // Catch:{ all -> 0x003c }
                if (r7 < r10) goto L_0x0089
                if (r7 != r10) goto L_0x0087
                boolean r7 = r6.cancelPreviousInEqualPriority     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r5 = 0
                goto L_0x00b2
            L_0x0089:
                if (r12 != 0) goto L_0x008c
                goto L_0x0096
            L_0x008c:
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r7 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch:{ all -> 0x003c }
                androidx.paging.SingleRunner r8 = r6.singleRunner     // Catch:{ all -> 0x003c }
                r7.<init>(r8)     // Catch:{ all -> 0x003c }
                r12.mo74534c(r7)     // Catch:{ all -> 0x003c }
            L_0x0096:
                if (r12 != 0) goto L_0x0099
                goto L_0x00ae
            L_0x0099:
                r0.L$0 = r6     // Catch:{ all -> 0x003c }
                r0.L$1 = r2     // Catch:{ all -> 0x003c }
                r0.L$2 = r11     // Catch:{ all -> 0x003c }
                r0.I$0 = r10     // Catch:{ all -> 0x003c }
                r0.label = r3     // Catch:{ all -> 0x003c }
                java.lang.Object r12 = r12.mo74626x(r0)     // Catch:{ all -> 0x003c }
                if (r12 != r1) goto L_0x00aa
                return r1
            L_0x00aa:
                r1 = r2
                r0 = r6
            L_0x00ac:
                r6 = r0
                r2 = r1
            L_0x00ae:
                r6.previous = r2     // Catch:{ all -> 0x003c }
                r6.previousPriority = r10     // Catch:{ all -> 0x003c }
            L_0x00b2:
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r5)     // Catch:{ all -> 0x003c }
                r11.mo74907b(r4)
                return r10
            L_0x00ba:
                r11.mo74907b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.tryEnqueue(int, kotlinx.coroutines.w1, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public SingleRunner() {
        this(false, 1, (C13695i) null);
    }

    public SingleRunner(boolean z) {
        this.holder = new Holder(this, z);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i, C16265l lVar, C13635d dVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, lVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object runInIsolation(int r5, p370qa.C16265l<? super kotlin.coroutines.C13635d<? super p297ja.C13339u>, ? extends java.lang.Object> r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$0
            androidx.paging.SingleRunner r5 = (androidx.paging.SingleRunner) r5
            p297ja.C13332o.m85685b(r7)     // Catch:{ CancelIsolatedRunnerException -> 0x002d }
            goto L_0x0053
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p297ja.C13332o.m85685b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r0.L$0 = r4     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r0.label = r3     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            java.lang.Object r5 = kotlinx.coroutines.C15482l0.m94505d(r7, r0)     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004b:
            r6 = move-exception
            r5 = r4
        L_0x004d:
            androidx.paging.SingleRunner r7 = r6.getRunner()
            if (r7 != r5) goto L_0x0056
        L_0x0053:
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.runInIsolation(int, qa.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleRunner(boolean z, int i, C13695i iVar) {
        this((i & 1) != 0 ? true : z);
    }
}
