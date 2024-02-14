package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.zzan;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzi implements zzan {

    /* renamed from: a */
    final /* synthetic */ FirebaseUser f4722a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f4723b;

    /* renamed from: e0 */
    public final void mo22750e0(Status status) {
        if (status.mo21294n2() == 17011 || status.mo21294n2() == 17021 || status.mo21294n2() == 17005) {
            this.f4723b.mo22628u();
        }
    }

    public final void zza() {
        FirebaseAuth firebaseAuth = this.f4723b;
        if (firebaseAuth.f4503f != null && firebaseAuth.f4503f.mo22654r2().equalsIgnoreCase(this.f4722a.mo22654r2())) {
            this.f4723b.mo22593B();
        }
    }
}
