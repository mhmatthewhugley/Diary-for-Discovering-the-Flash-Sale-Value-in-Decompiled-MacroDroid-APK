package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaa implements Continuation {

    /* renamed from: a */
    final /* synthetic */ String f4712a;

    /* renamed from: b */
    final /* synthetic */ ActionCodeSettings f4713b;

    /* renamed from: c */
    final /* synthetic */ FirebaseUser f4714c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f4714c.mo22660x2()).mo22604R((String) Preconditions.m4488k(((GetTokenResult) task.mo23715p()).mo22665c()), this.f4712a, this.f4713b);
    }
}
