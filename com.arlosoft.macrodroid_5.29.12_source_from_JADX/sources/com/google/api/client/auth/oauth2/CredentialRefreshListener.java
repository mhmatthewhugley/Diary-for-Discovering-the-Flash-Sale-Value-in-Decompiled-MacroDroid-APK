package com.google.api.client.auth.oauth2;

import java.io.IOException;

public interface CredentialRefreshListener {
    /* renamed from: a */
    void mo60114a(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException;

    /* renamed from: b */
    void mo60115b(Credential credential, TokenResponse tokenResponse) throws IOException;
}
