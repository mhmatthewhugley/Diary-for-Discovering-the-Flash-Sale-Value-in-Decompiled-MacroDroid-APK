package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;
import java.io.IOException;

public class CommonGoogleJsonClientRequestInitializer extends CommonGoogleClientRequestInitializer {
    /* renamed from: a */
    public final void mo60322a(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        super.mo60322a(abstractGoogleClientRequest);
        mo60331b((AbstractGoogleJsonClientRequest) abstractGoogleClientRequest);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo60331b(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) throws IOException {
    }
}
