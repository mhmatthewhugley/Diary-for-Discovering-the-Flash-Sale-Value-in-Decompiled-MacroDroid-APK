package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzr implements Continuation {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(Task task) throws Exception {
        return (task.mo23719t() || !(task.mo23714o() instanceof FirebaseAuthException) || !((FirebaseAuthException) task.mo23714o()).mo22634a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? task : Tasks.m66667f(null);
    }
}
