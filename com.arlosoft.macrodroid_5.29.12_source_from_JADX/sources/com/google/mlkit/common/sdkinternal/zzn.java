package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModelResource f56418a;

    /* renamed from: c */
    public final /* synthetic */ CancellationToken f56419c;

    /* renamed from: d */
    public final /* synthetic */ CancellationTokenSource f56420d;

    /* renamed from: f */
    public final /* synthetic */ Callable f56421f;

    /* renamed from: g */
    public final /* synthetic */ TaskCompletionSource f56422g;

    public /* synthetic */ zzn(ModelResource modelResource, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f56418a = modelResource;
        this.f56419c = cancellationToken;
        this.f56420d = cancellationTokenSource;
        this.f56421f = callable;
        this.f56422g = taskCompletionSource;
    }

    public final void run() {
        this.f56418a.mo64566h(this.f56419c, this.f56420d, this.f56421f, this.f56422g);
    }
}
