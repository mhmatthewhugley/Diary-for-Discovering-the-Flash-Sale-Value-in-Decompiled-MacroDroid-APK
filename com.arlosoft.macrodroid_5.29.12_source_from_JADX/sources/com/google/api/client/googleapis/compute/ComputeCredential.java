package com.google.api.client.googleapis.compute;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.OAuth2Utils;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
public class ComputeCredential extends Credential {

    /* renamed from: n */
    public static final String f52283n = String.valueOf(OAuth2Utils.m71811a()).concat("/computeMetadata/v1/instance/service-accounts/default/token");

    @Beta
    public static class Builder extends Credential.Builder {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public TokenResponse mo60097d() throws IOException {
        HttpRequest a = mo60106m().mo60467c().mo60444a(new GenericUrl(mo60105l()));
        a.mo60437v(new JsonObjectParser(mo60103j()));
        a.mo60420e().mo60078d("Metadata-Flavor", "Google");
        return (TokenResponse) a.mo60416a().mo60458l(TokenResponse.class);
    }
}
