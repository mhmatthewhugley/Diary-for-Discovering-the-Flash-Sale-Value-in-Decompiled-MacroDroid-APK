package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.zza = Preconditions.m4484g(str);
    }

    @NonNull
    /* renamed from: a */
    public String mo22634a() {
        return this.zza;
    }
}
