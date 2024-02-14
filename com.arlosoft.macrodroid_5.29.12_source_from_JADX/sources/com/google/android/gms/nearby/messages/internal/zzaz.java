package com.google.android.gms.nearby.messages.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzaz implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f47747a;

    /* renamed from: a */
    public final void mo21120a(@NonNull Task task) {
        if (task.mo23719t()) {
            this.f47747a.mo56139c(null);
        } else {
            this.f47747a.mo56138b(task.mo23714o());
        }
    }
}
