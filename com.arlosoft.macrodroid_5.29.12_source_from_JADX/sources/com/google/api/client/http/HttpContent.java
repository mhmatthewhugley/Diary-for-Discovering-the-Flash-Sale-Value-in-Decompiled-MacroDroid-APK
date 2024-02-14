package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

public interface HttpContent extends StreamingContent {
    /* renamed from: a */
    boolean mo60338a();

    /* renamed from: b */
    long mo60339b() throws IOException;

    String getType();

    void writeTo(OutputStream outputStream) throws IOException;
}
