package com.google.firebase.auth.internal;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zza implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4577a;

    /* renamed from: b */
    final /* synthetic */ zzbm f4578b;

    /* renamed from: c */
    final /* synthetic */ Activity f4579c;

    /* renamed from: d */
    final /* synthetic */ TaskCompletionSource f4580d;

    /* renamed from: e */
    final /* synthetic */ zzf f4581e;

    zza(zzf zzf, FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f4581e = zzf;
        this.f4577a = firebaseAuth;
        this.f4578b = zzbm;
        this.f4579c = activity;
        this.f4580d = taskCompletionSource;
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        Log.e(zzf.f4661a, "Problem retrieving SafetyNet Token: ".concat(String.valueOf(exc.getMessage())));
        this.f4581e.m6249e(this.f4577a, this.f4578b, this.f4579c, this.f4580d);
    }
}
