package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.auth.internal.zzbk;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzt implements zzbk {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4745a;

    zzt(FirebaseAuth firebaseAuth) {
        this.f4745a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo22787a(zzzy zzzy, FirebaseUser firebaseUser) {
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(firebaseUser);
        firebaseUser.mo22645E2(zzzy);
        FirebaseAuth.m5986F(this.f4745a, firebaseUser, zzzy, true, true);
    }

    /* renamed from: e0 */
    public final void mo22750e0(Status status) {
        if (status.mo21294n2() == 17011 || status.mo21294n2() == 17021 || status.mo21294n2() == 17005 || status.mo21294n2() == 17091) {
            this.f4745a.mo22628u();
        }
    }
}
