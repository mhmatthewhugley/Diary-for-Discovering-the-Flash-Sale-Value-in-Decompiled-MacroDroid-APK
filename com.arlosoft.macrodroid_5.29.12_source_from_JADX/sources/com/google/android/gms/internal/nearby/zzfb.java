package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzfb implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f44616a;

    public /* synthetic */ zzfb(TaskCompletionSource taskCompletionSource) {
        this.f44616a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        TaskCompletionSource taskCompletionSource = this.f44616a;
        if (task.mo23719t()) {
            taskCompletionSource.mo56141e(task.mo23715p());
            return;
        }
        Exception o = task.mo23714o();
        if (o != null) {
            taskCompletionSource.mo56140d(o);
        } else {
            taskCompletionSource.mo56140d(new IllegalStateException("Failed task has null exception"));
        }
    }
}
