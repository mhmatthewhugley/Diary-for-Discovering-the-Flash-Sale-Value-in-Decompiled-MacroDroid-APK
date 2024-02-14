package com.firebase.p073ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p121k5.C7588a;

/* renamed from: com.firebase.ui.auth.FirebaseUiException */
public class FirebaseUiException extends Exception {
    private final int mErrorCode;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseUiException(int i) {
        this(i, C7588a.m31592a(i));
    }

    /* renamed from: a */
    public final int mo34082a() {
        return this.mErrorCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseUiException(int i, @NonNull String str) {
        super(str);
        this.mErrorCode = i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseUiException(int i, @NonNull Throwable th) {
        this(i, C7588a.m31592a(i), th);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FirebaseUiException(int i, @NonNull String str, @NonNull Throwable th) {
        super(str, th);
        this.mErrorCode = i;
    }
}
