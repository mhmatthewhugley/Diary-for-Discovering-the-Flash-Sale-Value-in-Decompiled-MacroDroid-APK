package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzq extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

    /* renamed from: b */
    final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f4742b;

    /* renamed from: c */
    final /* synthetic */ FirebaseAuth f4743c;

    zzq(FirebaseAuth firebaseAuth, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        this.f4743c = firebaseAuth;
        this.f4742b = onVerificationStateChangedCallbacks;
    }

    /* renamed from: a */
    public final void mo22703a(String str) {
    }

    /* renamed from: b */
    public final void mo22704b(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f4742b.mo22705c(PhoneAuthProvider.m6115a(str, (String) Preconditions.m4488k(this.f4743c.f4504g.mo22819b())));
    }

    /* renamed from: c */
    public final void mo22705c(PhoneAuthCredential phoneAuthCredential) {
        this.f4742b.mo22705c(phoneAuthCredential);
    }

    /* renamed from: d */
    public final void mo22706d(FirebaseException firebaseException) {
        this.f4742b.mo22706d(firebaseException);
    }
}
