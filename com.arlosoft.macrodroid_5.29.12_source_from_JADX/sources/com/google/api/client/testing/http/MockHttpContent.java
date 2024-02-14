package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.io.OutputStream;

@Beta
public class MockHttpContent implements HttpContent {

    /* renamed from: a */
    private long f52680a = -1;

    /* renamed from: b */
    private String f52681b;

    /* renamed from: c */
    private byte[] f52682c = new byte[0];

    /* renamed from: a */
    public boolean mo60338a() {
        return true;
    }

    /* renamed from: b */
    public long mo60339b() throws IOException {
        return this.f52680a;
    }

    public String getType() {
        return this.f52681b;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52682c);
        outputStream.flush();
    }
}
