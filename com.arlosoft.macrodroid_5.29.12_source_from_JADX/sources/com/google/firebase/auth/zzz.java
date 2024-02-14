package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzz implements Continuation {

    /* renamed from: a */
    final /* synthetic */ ActionCodeSettings f4748a;

    /* renamed from: b */
    final /* synthetic */ FirebaseUser f4749b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f4749b.mo22660x2()).mo22601O(this.f4748a, (String) Preconditions.m4488k(((GetTokenResult) task.mo23715p()).mo22665c()));
    }
}
