package com.google.api.client.googleapis.testing.auth.oauth2;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
public class MockGoogleCredential extends GoogleCredential {

    /* renamed from: u */
    private static final String f52379u = String.format("{\"access_token\": \"%s\", \"expires_in\":  %s, \"refresh_token\": \"%s\", \"token_type\": \"%s\"}", new Object[]{"access_xyz", "3600", "refresh123", "Bearer"});

    @Beta
    public static class Builder extends GoogleCredential.Builder {
    }

    @Beta
    private static class MockClientAuthentication implements HttpExecuteInterceptor {
        private MockClientAuthentication() {
        }

        /* renamed from: b */
        public void mo60066b(HttpRequest httpRequest) throws IOException {
        }
    }
}
