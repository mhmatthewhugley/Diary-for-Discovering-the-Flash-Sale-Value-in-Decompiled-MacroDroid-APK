package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.auth-api.zzj */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzj implements CredentialsApi {
    /* renamed from: a */
    public final PendingResult<Status> mo20840a(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.m4489l(googleApiClient, "client must not be null");
        Preconditions.m4489l(credential, "credential must not be null");
        return googleApiClient.mo21253i(new zzn(this, googleApiClient, credential));
    }

    /* renamed from: b */
    public final PendingResult<CredentialRequestResult> mo20841b(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        Preconditions.m4489l(googleApiClient, "client must not be null");
        Preconditions.m4489l(credentialRequest, "request must not be null");
        return googleApiClient.mo21252h(new zzi(this, googleApiClient, credentialRequest));
    }

    /* renamed from: c */
    public final PendingResult<Status> mo20842c(GoogleApiClient googleApiClient) {
        Preconditions.m4489l(googleApiClient, "client must not be null");
        return googleApiClient.mo21253i(new zzm(this, googleApiClient));
    }

    /* renamed from: d */
    public final PendingResult<Status> mo20843d(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.m4489l(googleApiClient, "client must not be null");
        Preconditions.m4489l(credential, "credential must not be null");
        return googleApiClient.mo21253i(new zzk(this, googleApiClient, credential));
    }
}
