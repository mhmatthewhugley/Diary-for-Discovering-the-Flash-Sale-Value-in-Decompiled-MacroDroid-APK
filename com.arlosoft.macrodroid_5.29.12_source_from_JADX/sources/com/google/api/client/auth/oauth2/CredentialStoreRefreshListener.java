package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
@Deprecated
public final class CredentialStoreRefreshListener implements CredentialRefreshListener {

    /* renamed from: a */
    private final CredentialStore f52197a;

    /* renamed from: b */
    private final String f52198b;

    /* renamed from: a */
    public void mo60114a(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException {
        mo60117c(credential);
    }

    /* renamed from: b */
    public void mo60115b(Credential credential, TokenResponse tokenResponse) throws IOException {
        mo60117c(credential);
    }

    /* renamed from: c */
    public void mo60117c(Credential credential) throws IOException {
        this.f52197a.mo60116a(this.f52198b, credential);
    }
}
