package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.auth.internal.zzg;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class zzs implements zzg {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4744a;

    zzs(FirebaseAuth firebaseAuth) {
        this.f4744a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo22787a(zzzy zzzy, FirebaseUser firebaseUser) {
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(firebaseUser);
        firebaseUser.mo22645E2(zzzy);
        this.f4744a.mo22594C(firebaseUser, zzzy, true);
    }
}
