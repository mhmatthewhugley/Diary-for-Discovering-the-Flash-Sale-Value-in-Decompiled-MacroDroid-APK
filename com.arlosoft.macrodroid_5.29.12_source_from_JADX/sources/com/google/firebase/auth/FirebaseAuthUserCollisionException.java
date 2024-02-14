package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {
    @Nullable
    private AuthCredential zza;
    @Nullable
    private String zzb;
    @Nullable
    private String zzc;

    public FirebaseAuthUserCollisionException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }

    @Nullable
    /* renamed from: b */
    public String mo22636b() {
        return this.zzb;
    }

    @Nullable
    /* renamed from: c */
    public AuthCredential mo22637c() {
        return this.zza;
    }

    @NonNull
    /* renamed from: d */
    public final FirebaseAuthUserCollisionException mo22638d(@NonNull AuthCredential authCredential) {
        this.zza = authCredential;
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final FirebaseAuthUserCollisionException mo22639e(@NonNull String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final FirebaseAuthUserCollisionException mo22640f(@NonNull String str) {
        this.zzc = str;
        return this;
    }
}
