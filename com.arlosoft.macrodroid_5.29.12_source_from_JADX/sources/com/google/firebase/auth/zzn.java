package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.auth.internal.zzbk;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzn implements zzbk {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4731a;

    zzn(FirebaseAuth firebaseAuth) {
        this.f4731a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo22787a(zzzy zzzy, FirebaseUser firebaseUser) {
        FirebaseAuth.m5986F(this.f4731a, firebaseUser, zzzy, true, true);
    }

    /* renamed from: e0 */
    public final void mo22750e0(Status status) {
        int n2 = status.mo21294n2();
        if (n2 == 17011 || n2 == 17021 || n2 == 17005) {
            this.f4731a.mo22628u();
        }
    }
}
