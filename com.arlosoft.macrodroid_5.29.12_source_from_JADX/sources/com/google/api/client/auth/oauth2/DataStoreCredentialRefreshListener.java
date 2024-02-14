package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.store.DataStore;
import java.io.IOException;

@Beta
public final class DataStoreCredentialRefreshListener implements CredentialRefreshListener {

    /* renamed from: a */
    private final DataStore<StoredCredential> f52199a;

    /* renamed from: b */
    private final String f52200b;

    /* renamed from: a */
    public void mo60114a(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException {
        mo60118c(credential);
    }

    /* renamed from: b */
    public void mo60115b(Credential credential, TokenResponse tokenResponse) throws IOException {
        mo60118c(credential);
    }

    /* renamed from: c */
    public void mo60118c(Credential credential) throws IOException {
        this.f52199a.mo60795a(this.f52200b, new StoredCredential(credential));
    }
}
