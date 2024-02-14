package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzafm extends RuntimeException {
    public zzafm(zzaek zzaek) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final zzadn mo49192a() {
        return new zzadn(getMessage());
    }
}
