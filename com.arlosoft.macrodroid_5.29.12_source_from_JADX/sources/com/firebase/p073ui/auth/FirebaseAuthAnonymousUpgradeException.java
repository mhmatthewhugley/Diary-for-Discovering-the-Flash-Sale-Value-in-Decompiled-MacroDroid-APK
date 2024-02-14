package com.firebase.p073ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p121k5.C7588a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException */
public class FirebaseAuthAnonymousUpgradeException extends Exception {
    private IdpResponse mResponse;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseAuthAnonymousUpgradeException(int i, @NonNull IdpResponse idpResponse) {
        super(C7588a.m31592a(i));
        this.mResponse = idpResponse;
    }

    /* renamed from: a */
    public IdpResponse mo34081a() {
        return this.mResponse;
    }
}
