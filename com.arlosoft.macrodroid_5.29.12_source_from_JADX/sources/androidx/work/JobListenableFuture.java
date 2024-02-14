package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0001J\t\u0010\u0012\u001a\u00020\nH\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo71668d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lja/u;", "addListener", "", "cancel", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "complete", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/w1;", "job", "Lkotlinx/coroutines/w1;", "Landroidx/work/impl/utils/futures/SettableFuture;", "underlying", "Landroidx/work/impl/utils/futures/SettableFuture;", "<init>", "(Lkotlinx/coroutines/w1;Landroidx/work/impl/utils/futures/SettableFuture;)V", "work-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ListenableFuture.kt */
public final class JobListenableFuture<R> implements ListenableFuture<R> {
    private final C15561w1 job;
    /* access modifiers changed from: private */
    public final SettableFuture<R> underlying;

    public JobListenableFuture(C15561w1 w1Var, SettableFuture<R> settableFuture) {
        C13706o.m87929f(w1Var, "job");
        C13706o.m87929f(settableFuture, "underlying");
        this.job = w1Var;
        this.underlying = settableFuture;
        w1Var.mo74617p(new C16265l<Throwable, C13339u>(this) {
            final /* synthetic */ JobListenableFuture<R> this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    if (!this.this$0.underlying.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    this.this$0.underlying.cancel(true);
                } else {
                    SettableFuture access$getUnderlying$p = this.this$0.underlying;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    access$getUnderlying$p.setException(th);
                }
            }
        });
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.underlying.cancel(z);
    }

    public final void complete(R r) {
        this.underlying.set(r);
    }

    public R get() {
        return this.underlying.get();
    }

    public R get(long j, TimeUnit timeUnit) {
        return this.underlying.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    public boolean isDone() {
        return this.underlying.isDone();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JobListenableFuture(kotlinx.coroutines.C15561w1 r1, androidx.work.impl.utils.futures.SettableFuture r2, int r3, kotlin.jvm.internal.C13695i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.JobListenableFuture.<init>(kotlinx.coroutines.w1, androidx.work.impl.utils.futures.SettableFuture, int, kotlin.jvm.internal.i):void");
    }
}
