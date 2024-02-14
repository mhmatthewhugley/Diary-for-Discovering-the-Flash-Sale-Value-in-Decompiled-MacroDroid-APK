package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxt implements zzxz {

    /* renamed from: a */
    final /* synthetic */ String f40611a;

    zzxt(zzxy zzxy, String str) {
        this.f40611a = str;
    }

    /* renamed from: a */
    public final void mo50063a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.mo22704b(this.f40611a, PhoneAuthProvider.ForceResendingToken.m6117l2());
    }
}
