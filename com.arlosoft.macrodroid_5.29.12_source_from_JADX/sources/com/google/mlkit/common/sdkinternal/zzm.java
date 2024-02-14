package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzm implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Executor f56414a;

    /* renamed from: c */
    public final /* synthetic */ CancellationToken f56415c;

    /* renamed from: d */
    public final /* synthetic */ CancellationTokenSource f56416d;

    /* renamed from: f */
    public final /* synthetic */ TaskCompletionSource f56417f;

    public /* synthetic */ zzm(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.f56414a = executor;
        this.f56415c = cancellationToken;
        this.f56416d = cancellationTokenSource;
        this.f56417f = taskCompletionSource;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f56414a;
        CancellationToken cancellationToken = this.f56415c;
        CancellationTokenSource cancellationTokenSource = this.f56416d;
        TaskCompletionSource taskCompletionSource = this.f56417f;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            if (cancellationToken.mo56132a()) {
                cancellationTokenSource.mo56134a();
            } else {
                taskCompletionSource.mo56138b(e);
            }
            throw e;
        }
    }
}
