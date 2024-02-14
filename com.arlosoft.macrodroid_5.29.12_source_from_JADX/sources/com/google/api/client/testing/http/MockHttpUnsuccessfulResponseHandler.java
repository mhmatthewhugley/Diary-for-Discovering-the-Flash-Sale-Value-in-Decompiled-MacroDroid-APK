package com.google.api.client.testing.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
public class MockHttpUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {

    /* renamed from: a */
    private boolean f52686a;

    /* renamed from: b */
    private boolean f52687b;

    /* renamed from: a */
    public boolean mo60096a(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        this.f52686a = true;
        return this.f52687b;
    }
}
