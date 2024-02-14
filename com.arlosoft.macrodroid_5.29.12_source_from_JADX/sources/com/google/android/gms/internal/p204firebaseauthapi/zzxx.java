package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzxz f40615a;

    /* renamed from: c */
    final /* synthetic */ zzxy f40616c;

    zzxx(zzxy zzxy, zzxz zzxz) {
        this.f40616c = zzxy;
        this.f40615a = zzxz;
    }

    public final void run() {
        synchronized (this.f40616c.f40617a.f40626g) {
            if (!this.f40616c.f40617a.f40626g.isEmpty()) {
                this.f40615a.mo50063a((PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.f40616c.f40617a.f40626g.get(0), new Object[0]);
            }
        }
    }
}
