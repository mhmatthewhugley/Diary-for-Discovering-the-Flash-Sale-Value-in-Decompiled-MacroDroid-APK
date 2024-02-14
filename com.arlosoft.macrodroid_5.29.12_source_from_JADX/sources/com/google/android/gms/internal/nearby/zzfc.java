package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzfc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f44617a;

    public /* synthetic */ zzfc(TaskCompletionSource taskCompletionSource) {
        this.f44617a = taskCompletionSource;
    }

    public final void run() {
        TaskCompletionSource taskCompletionSource = this.f44617a;
        if (!taskCompletionSource.mo56137a().mo23718s()) {
            taskCompletionSource.mo56140d(new TimeoutException("Timed out."));
        }
    }
}
