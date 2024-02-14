package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FacebookAuthProvider {
    private FacebookAuthProvider() {
    }

    @NonNull
    /* renamed from: a */
    public static AuthCredential m5980a(@NonNull String str) {
        return new FacebookAuthCredential(str);
    }
}
