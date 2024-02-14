package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzak implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ zzal f4593a;

    zzak(zzal zzal) {
        this.f4593a = zzal;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            zzam.f4596h.mo21843g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f4593a.f4595c.mo22748d();
        }
    }
}
