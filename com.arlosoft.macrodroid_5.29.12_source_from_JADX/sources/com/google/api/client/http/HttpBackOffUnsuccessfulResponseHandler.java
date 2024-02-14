package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Sleeper;
import java.io.IOException;

@Beta
public class HttpBackOffUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {

    /* renamed from: a */
    private final BackOff f52417a;

    /* renamed from: b */
    private BackOffRequired f52418b;

    /* renamed from: c */
    private Sleeper f52419c;

    @Beta
    public interface BackOffRequired {
        /* renamed from: a */
        boolean mo60374a(HttpResponse httpResponse);
    }

    /* renamed from: a */
    public final boolean mo60096a(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        if (!z || !this.f52418b.mo60374a(httpResponse)) {
            return false;
        }
        try {
            return BackOffUtils.m72633a(this.f52419c, this.f52417a);
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
