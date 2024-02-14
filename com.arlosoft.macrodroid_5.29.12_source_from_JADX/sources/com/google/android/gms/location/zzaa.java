package com.google.android.gms.location;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzaa implements Continuation {

    /* renamed from: a */
    private final TaskCompletionSource f46054a;

    zzaa(TaskCompletionSource taskCompletionSource) {
        this.f46054a = taskCompletionSource;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        TaskCompletionSource taskCompletionSource = this.f46054a;
        if (!task.mo23719t()) {
            if (task.mo23714o() != null) {
                Exception o = task.mo23714o();
                if (o != null) {
                    taskCompletionSource.mo56138b(o);
                }
            } else {
                taskCompletionSource.mo56141e(null);
            }
        }
        return taskCompletionSource.mo56137a();
    }
}
