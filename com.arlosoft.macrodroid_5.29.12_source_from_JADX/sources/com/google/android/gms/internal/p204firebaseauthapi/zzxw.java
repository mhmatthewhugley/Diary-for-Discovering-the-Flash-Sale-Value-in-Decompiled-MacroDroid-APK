package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxw implements zzxz {

    /* renamed from: a */
    final /* synthetic */ Status f40614a;

    zzxw(zzxy zzxy, Status status) {
        this.f40614a = status;
    }

    /* renamed from: a */
    public final void mo50063a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.mo22706d(zzxc.m58359a(this.f40614a));
    }
}
