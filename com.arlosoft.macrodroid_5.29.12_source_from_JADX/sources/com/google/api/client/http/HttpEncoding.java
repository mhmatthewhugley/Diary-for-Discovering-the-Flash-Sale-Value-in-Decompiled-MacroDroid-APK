package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

public interface HttpEncoding {
    /* renamed from: a */
    void mo60353a(StreamingContent streamingContent, OutputStream outputStream) throws IOException;

    String getName();
}
