package com.google.android.gms.internal.p203authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzg */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzg implements CredentialRequestResult {

    /* renamed from: a */
    private final Status f39149a;
    @Nullable

    /* renamed from: c */
    private final Credential f39150c;

    public zzg(Status status, @Nullable Credential credential) {
        this.f39149a = status;
        this.f39150c = credential;
    }

    /* renamed from: a */
    public static zzg m55713a(Status status) {
        return new zzg(status, (Credential) null);
    }

    @Nullable
    /* renamed from: J */
    public final Credential mo20839J() {
        return this.f39150c;
    }

    public final Status getStatus() {
        return this.f39149a;
    }
}
