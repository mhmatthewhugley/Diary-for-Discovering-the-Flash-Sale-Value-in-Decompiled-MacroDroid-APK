package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface CredentialsApi {
    /* renamed from: a */
    PendingResult<Status> mo20840a(GoogleApiClient googleApiClient, Credential credential);

    /* renamed from: b */
    PendingResult<CredentialRequestResult> mo20841b(GoogleApiClient googleApiClient, CredentialRequest credentialRequest);

    /* renamed from: c */
    PendingResult<Status> mo20842c(GoogleApiClient googleApiClient);

    /* renamed from: d */
    PendingResult<Status> mo20843d(GoogleApiClient googleApiClient, Credential credential);
}
