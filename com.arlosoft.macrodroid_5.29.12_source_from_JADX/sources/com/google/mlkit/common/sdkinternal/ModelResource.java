package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzma;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class ModelResource {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final TaskQueue f56308a = new TaskQueue();

    /* renamed from: b */
    private final AtomicInteger f56309b = new AtomicInteger(0);

    /* renamed from: c */
    private final AtomicBoolean f56310c = new AtomicBoolean(false);

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public <T> Task<T> mo64559a(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull CancellationToken cancellationToken) {
        Preconditions.m4493p(this.f56309b.get() > 0);
        if (cancellationToken.mo56132a()) {
            return Tasks.m66665d();
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.mo56135b());
        this.f56308a.mo64582a(new zzm(executor, cancellationToken, cancellationTokenSource, taskCompletionSource), new zzn(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo64560b() {
        return this.f56310c.get();
    }

    @WorkerThread
    @VisibleForTesting
    @KeepForSdk
    /* renamed from: c */
    public abstract void mo64561c() throws MlKitException;

    @KeepForSdk
    /* renamed from: d */
    public void mo64562d() {
        this.f56309b.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @KeepForSdk
    /* renamed from: e */
    public abstract void mo64563e();

    @KeepForSdk
    /* renamed from: f */
    public void mo64564f(@NonNull Executor executor) {
        mo64565g(executor);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public Task<Void> mo64565g(@NonNull Executor executor) {
        Preconditions.m4493p(this.f56309b.get() > 0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f56308a.mo64582a(executor, new zzl(this, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo64566h(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        if (cancellationToken.mo56132a()) {
            cancellationTokenSource.mo56134a();
            return;
        }
        try {
            if (!this.f56310c.get()) {
                mo64561c();
                this.f56310c.set(true);
            }
            if (cancellationToken.mo56132a()) {
                cancellationTokenSource.mo56134a();
                return;
            }
            Object call = callable.call();
            if (cancellationToken.mo56132a()) {
                cancellationTokenSource.mo56134a();
            } else {
                taskCompletionSource.mo56139c(call);
            }
        } catch (RuntimeException e) {
            throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
        } catch (Exception e2) {
            if (cancellationToken.mo56132a()) {
                cancellationTokenSource.mo56134a();
            } else {
                taskCompletionSource.mo56138b(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo64567i(TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.f56309b.decrementAndGet();
        Preconditions.m4493p(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo64563e();
            this.f56310c.set(false);
        }
        zzma.m61466a();
        taskCompletionSource.mo56139c(null);
    }
}
