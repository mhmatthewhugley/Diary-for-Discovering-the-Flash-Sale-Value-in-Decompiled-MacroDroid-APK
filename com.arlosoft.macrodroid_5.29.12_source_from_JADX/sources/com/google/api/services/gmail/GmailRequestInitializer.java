package com.google.api.services.gmail;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;
import java.io.IOException;

public class GmailRequestInitializer extends CommonGoogleJsonClientRequestInitializer {
    /* renamed from: b */
    public final void mo60331b(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) throws IOException {
        super.mo60331b(abstractGoogleJsonClientRequest);
        mo60872c((GmailRequest) abstractGoogleJsonClientRequest);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo60872c(GmailRequest<?> gmailRequest) throws IOException {
    }
}
