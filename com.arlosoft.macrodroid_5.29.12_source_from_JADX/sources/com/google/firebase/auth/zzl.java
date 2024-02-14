package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4728a;

    /* renamed from: c */
    final /* synthetic */ InternalTokenResult f4729c;

    zzl(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.f4728a = firebaseAuth;
        this.f4729c = internalTokenResult;
    }

    public final void run() {
        for (IdTokenListener a : this.f4728a.f4500c) {
            a.mo22732a(this.f4729c);
        }
        for (FirebaseAuth.IdTokenListener a2 : this.f4728a.f4499b) {
            a2.mo22633a(this.f4728a);
        }
    }
}
