package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f4730a;

    zzm(FirebaseAuth firebaseAuth) {
        this.f4730a = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.AuthStateListener a : this.f4730a.f4501d) {
            a.mo22632a(this.f4730a);
        }
    }
}
