package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzap implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f4604a;

    /* renamed from: b */
    final /* synthetic */ Context f4605b;

    zzap(zzax zzax, TaskCompletionSource taskCompletionSource, Context context) {
        this.f4604a = taskCompletionSource;
        this.f4605b = context;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        this.f4604a.mo56138b(exc);
        zzax.m6189e(this.f4605b);
    }
}
