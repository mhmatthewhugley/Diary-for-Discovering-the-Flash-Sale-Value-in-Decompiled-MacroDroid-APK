package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Sleeper;
import java.io.IOException;

@Beta
public class HttpBackOffIOExceptionHandler implements HttpIOExceptionHandler {

    /* renamed from: a */
    private final BackOff f52415a;

    /* renamed from: b */
    private Sleeper f52416b;

    /* renamed from: b */
    public boolean mo60292b(HttpRequest httpRequest, boolean z) throws IOException {
        if (!z) {
            return false;
        }
        try {
            return BackOffUtils.m72633a(this.f52416b, this.f52415a);
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
