package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzyn extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

    /* renamed from: b */
    final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f40649b;

    /* renamed from: c */
    final /* synthetic */ String f40650c;

    zzyn(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, String str) {
        this.f40649b = onVerificationStateChangedCallbacks;
        this.f40650c = str;
    }

    /* renamed from: a */
    public final void mo22703a(@NonNull String str) {
        zzyp.f40653a.remove(this.f40650c);
        this.f40649b.mo22703a(str);
    }

    /* renamed from: b */
    public final void mo22704b(@NonNull String str, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f40649b.mo22704b(str, forceResendingToken);
    }

    /* renamed from: c */
    public final void mo22705c(@NonNull PhoneAuthCredential phoneAuthCredential) {
        zzyp.f40653a.remove(this.f40650c);
        this.f40649b.mo22705c(phoneAuthCredential);
    }

    /* renamed from: d */
    public final void mo22706d(@NonNull FirebaseException firebaseException) {
        zzyp.f40653a.remove(this.f40650c);
        this.f40649b.mo22706d(firebaseException);
    }
}
