package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GoogleAuthProvider {
    private GoogleAuthProvider() {
    }

    @NonNull
    /* renamed from: a */
    public static AuthCredential m6074a(@Nullable String str, @Nullable String str2) {
        return new GoogleAuthCredential(str, str2);
    }
}
