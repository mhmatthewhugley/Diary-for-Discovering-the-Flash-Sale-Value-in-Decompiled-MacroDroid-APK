package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzat implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f4612a;

    /* renamed from: b */
    final /* synthetic */ Context f4613b;

    zzat(zzax zzax, TaskCompletionSource taskCompletionSource, Context context) {
        this.f4612a = taskCompletionSource;
        this.f4613b = context;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        this.f4612a.mo56138b(exc);
        zzax.m6189e(this.f4613b);
    }
}
