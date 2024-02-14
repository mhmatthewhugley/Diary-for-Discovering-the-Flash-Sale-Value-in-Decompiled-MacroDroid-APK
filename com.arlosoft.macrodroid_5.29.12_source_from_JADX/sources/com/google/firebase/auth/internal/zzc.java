package com.google.firebase.auth.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzc implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f4657a;

    zzc(zzf zzf, TaskCompletionSource taskCompletionSource) {
        this.f4657a = taskCompletionSource;
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        Log.e(zzf.f4661a, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[]{exc.getMessage()}));
        this.f4657a.mo56139c(new zze((String) null, (String) null));
    }
}
