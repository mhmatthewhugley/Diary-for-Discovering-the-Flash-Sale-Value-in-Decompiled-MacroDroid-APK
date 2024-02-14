package com.google.android.gms.internal.nearby;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzfd {
    /* renamed from: a */
    public static Task m62442a(Task task, long j) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        task.mo23702c(new zzfb(taskCompletionSource));
        new zzh(Looper.getMainLooper()).postDelayed(new zzfc(taskCompletionSource), j);
        return taskCompletionSource.mo56137a();
    }
}
