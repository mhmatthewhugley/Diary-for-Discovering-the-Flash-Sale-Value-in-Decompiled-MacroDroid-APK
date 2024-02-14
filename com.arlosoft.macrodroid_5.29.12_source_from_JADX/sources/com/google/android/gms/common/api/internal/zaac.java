package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaac implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3260a;

    /* renamed from: c */
    final /* synthetic */ zaad f3261c;

    zaac(zaad zaad, TaskCompletionSource taskCompletionSource) {
        this.f3261c = zaad;
        this.f3260a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21120a(@NonNull Task task) {
        this.f3261c.f3263b.remove(this.f3260a);
    }
}
