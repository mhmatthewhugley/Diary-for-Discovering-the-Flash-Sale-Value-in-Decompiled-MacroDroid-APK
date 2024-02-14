package com.firebase.p073ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.auth.AuthCredential;

/* renamed from: com.firebase.ui.auth.FirebaseUiUserCollisionException */
public class FirebaseUiUserCollisionException extends Exception {
    private final AuthCredential mCredential;
    private final String mEmail;
    private final int mErrorCode;
    private final String mProviderId;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseUiUserCollisionException(int i, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull AuthCredential authCredential) {
        super(str);
        this.mErrorCode = i;
        this.mProviderId = str2;
        this.mEmail = str3;
        this.mCredential = authCredential;
    }

    @NonNull
    /* renamed from: a */
    public AuthCredential mo34083a() {
        return this.mCredential;
    }

    @NonNull
    /* renamed from: b */
    public String mo34084b() {
        return this.mEmail;
    }

    /* renamed from: c */
    public final int mo34085c() {
        return this.mErrorCode;
    }

    @NonNull
    /* renamed from: d */
    public String mo34086d() {
        return this.mProviderId;
    }
}
