package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;

public class EmptyContent implements HttpContent {
    /* renamed from: a */
    public boolean mo60338a() {
        return true;
    }

    /* renamed from: b */
    public long mo60339b() throws IOException {
        return 0;
    }

    public String getType() {
        return null;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.flush();
    }
}
