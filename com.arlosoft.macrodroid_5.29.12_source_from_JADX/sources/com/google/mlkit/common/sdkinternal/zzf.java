package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f56404a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f56405c;

    public /* synthetic */ zzf(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f56404a = callable;
        this.f56405c = taskCompletionSource;
    }

    public final void run() {
        Callable callable = this.f56404a;
        TaskCompletionSource taskCompletionSource = this.f56405c;
        try {
            taskCompletionSource.mo56139c(callable.call());
        } catch (MlKitException e) {
            taskCompletionSource.mo56138b(e);
        } catch (Exception e2) {
            taskCompletionSource.mo56138b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
        }
    }
}
