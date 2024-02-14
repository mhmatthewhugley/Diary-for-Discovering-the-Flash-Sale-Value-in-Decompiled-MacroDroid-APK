package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzal implements Runnable {

    /* renamed from: a */
    private final String f4594a;

    /* renamed from: c */
    final /* synthetic */ zzam f4595c;

    zzal(zzam zzam, String str) {
        this.f4595c = zzam;
        this.f4594a = Preconditions.m4484g(str);
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(FirebaseApp.m74384n(this.f4594a));
        if (instance.mo22613g() != null) {
            Task a = instance.mo22607a(true);
            zzam.f4596h.mo21843g("Token refreshing started", new Object[0]);
            a.mo23705f(new zzak(this));
        }
    }
}
