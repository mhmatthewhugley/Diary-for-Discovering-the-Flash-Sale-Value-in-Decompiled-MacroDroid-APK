package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u00020\u001d8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, mo71668d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "doWork", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "Landroidx/work/Data;", "data", "Lja/u;", "setProgress", "(Landroidx/work/Data;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Lkotlinx/coroutines/z;", "job", "Lkotlinx/coroutines/z;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/z;", "Landroidx/work/impl/utils/futures/SettableFuture;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "Lkotlinx/coroutines/h0;", "coroutineContext", "Lkotlinx/coroutines/h0;", "getCoroutineContext", "()Lkotlinx/coroutines/h0;", "getCoroutineContext$annotations", "()V", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {
    private final C15415h0 coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final C15573z job = C15198b2.m93746b((C15561w1) null, 1, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C13706o.m87929f(context, "appContext");
        C13706o.m87929f(workerParameters, "params");
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        C13706o.m87928e(create, "create()");
        this.future = create;
        create.addListener(new Runnable(this) {
            final /* synthetic */ CoroutineWorker this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                if (this.this$0.getFuture$work_runtime_ktx_release().isCancelled()) {
                    C15561w1.C15562a.m94723a(this.this$0.getJob$work_runtime_ktx_release(), (CancellationException) null, 1, (Object) null);
                }
            }
        }, getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = C15186a1.m93729a();
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, C13635d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(C13635d<? super ListenableWorker.Result> dVar);

    public C15415h0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(C13635d<? super ForegroundInfo> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        C15478k0 a = C15482l0.m94502a(getCoroutineContext().plus(b));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b, (SettableFuture) null, 2, (C13695i) null);
        C15561w1 unused = C15473j.m94492d(a, (C13640g) null, (C15486m0) null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, (C13635d<? super CoroutineWorker$getForegroundInfoAsync$1>) null), 3, (Object) null);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final C15573z getJob$work_runtime_ktx_release() {
        return this.job;
    }

    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setForeground(androidx.work.ForegroundInfo r4, kotlin.coroutines.C13635d<? super p297ja.C13339u> r5) {
        /*
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r4 = r3.setForegroundAsync(r4)
            java.lang.String r0 = "setForegroundAsync(foregroundInfo)"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x004a
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
            kotlinx.coroutines.o r0 = new kotlinx.coroutines.o
            kotlin.coroutines.d r1 = kotlin.coroutines.intrinsics.C13649c.m87831b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo74864z()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r1, r2)
            androidx.work.ListenableFutureKt$await$2$2 r1 = new androidx.work.ListenableFutureKt$await$2$2
            r1.<init>(r4)
            r0.mo74843d(r1)
            java.lang.Object r4 = r0.mo74862w()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r0) goto L_0x004a
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r5)
        L_0x004a:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r5) goto L_0x0051
            return r4
        L_0x0051:
            ja.u r4 = p297ja.C13339u.f61331a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.setForeground(androidx.work.ForegroundInfo, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setProgress(androidx.work.Data r4, kotlin.coroutines.C13635d<? super p297ja.C13339u> r5) {
        /*
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r4 = r3.setProgressAsync(r4)
            java.lang.String r0 = "setProgressAsync(data)"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x004a
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
            kotlinx.coroutines.o r0 = new kotlinx.coroutines.o
            kotlin.coroutines.d r1 = kotlin.coroutines.intrinsics.C13649c.m87831b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo74864z()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r1, r2)
            androidx.work.ListenableFutureKt$await$2$2 r1 = new androidx.work.ListenableFutureKt$await$2$2
            r1.<init>(r4)
            r0.mo74843d(r1)
            java.lang.Object r4 = r0.mo74862w()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r0) goto L_0x004a
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r5)
        L_0x004a:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r5) goto L_0x0051
            return r4
        L_0x0051:
            ja.u r4 = p297ja.C13339u.f61331a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.setProgress(androidx.work.Data, kotlin.coroutines.d):java.lang.Object");
    }

    public final ListenableFuture<ListenableWorker.Result> startWork() {
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(getCoroutineContext().plus(this.job)), (C13640g) null, (C15486m0) null, new CoroutineWorker$startWork$1(this, (C13635d<? super CoroutineWorker$startWork$1>) null), 3, (Object) null);
        return this.future;
    }
}
