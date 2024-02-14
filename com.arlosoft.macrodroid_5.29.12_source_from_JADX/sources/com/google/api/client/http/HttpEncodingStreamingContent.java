package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

public final class HttpEncodingStreamingContent implements StreamingContent {

    /* renamed from: a */
    private final StreamingContent f52420a;

    /* renamed from: b */
    private final HttpEncoding f52421b;

    public HttpEncodingStreamingContent(StreamingContent streamingContent, HttpEncoding httpEncoding) {
        this.f52420a = (StreamingContent) Preconditions.m72716d(streamingContent);
        this.f52421b = (HttpEncoding) Preconditions.m72716d(httpEncoding);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.f52421b.mo60353a(this.f52420a, outputStream);
    }
}
