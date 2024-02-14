package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum zzzm {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");
    
    private final String zzd;

    private zzzm(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
