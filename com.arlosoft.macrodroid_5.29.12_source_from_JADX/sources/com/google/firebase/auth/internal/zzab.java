package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzab implements Continuation {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(Task task) throws Exception {
        if (!task.mo23719t()) {
            return Tasks.m66666e(task.mo23714o());
        }
        return Tasks.m66667f(zzag.m6165l2(((GetTokenResult) task.mo23715p()).mo22665c()));
    }
}
