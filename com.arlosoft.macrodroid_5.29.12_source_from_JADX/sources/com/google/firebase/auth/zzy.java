package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzy implements Continuation {

    /* renamed from: a */
    final /* synthetic */ FirebaseUser f4747a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f4747a.mo22660x2()).mo22601O((ActionCodeSettings) null, (String) Preconditions.m4488k(((GetTokenResult) task.mo23715p()).mo22665c()));
    }
}
