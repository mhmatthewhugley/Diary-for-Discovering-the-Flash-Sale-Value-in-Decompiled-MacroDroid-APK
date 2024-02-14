package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class EmailAuthProvider {
    private EmailAuthProvider() {
    }

    @NonNull
    /* renamed from: a */
    public static AuthCredential m5975a(@NonNull String str, @NonNull String str2) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        return new EmailAuthCredential(str, str2, (String) null, (String) null, false);
    }

    @NonNull
    /* renamed from: b */
    public static AuthCredential m5976b(@NonNull String str, @NonNull String str2) {
        if (EmailAuthCredential.m5964v2(str2)) {
            return new EmailAuthCredential(str, (String) null, str2, (String) null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
