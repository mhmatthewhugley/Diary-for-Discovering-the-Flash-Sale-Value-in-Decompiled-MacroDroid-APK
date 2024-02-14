package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzac implements Continuation {

    /* renamed from: a */
    private final TaskCompletionSource f46058a;

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        TaskCompletionSource taskCompletionSource = this.f46058a;
        if (task.mo23719t()) {
            taskCompletionSource.mo56141e((Location) task.mo23715p());
        } else {
            Exception o = task.mo23714o();
            if (o != null) {
                taskCompletionSource.mo56138b(o);
            }
        }
        return taskCompletionSource.mo56137a();
    }
}
