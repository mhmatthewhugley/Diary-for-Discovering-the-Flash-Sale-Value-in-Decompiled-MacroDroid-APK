package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxu implements zzxz {

    /* renamed from: a */
    final /* synthetic */ PhoneAuthCredential f40612a;

    zzxu(zzxy zzxy, PhoneAuthCredential phoneAuthCredential) {
        this.f40612a = phoneAuthCredential;
    }

    /* renamed from: a */
    public final void mo50063a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.mo22705c(this.f40612a);
    }
}
