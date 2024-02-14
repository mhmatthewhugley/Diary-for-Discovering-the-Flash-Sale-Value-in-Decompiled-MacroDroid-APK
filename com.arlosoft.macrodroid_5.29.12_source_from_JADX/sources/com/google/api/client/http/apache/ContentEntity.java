package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

final class ContentEntity extends AbstractHttpEntity {

    /* renamed from: a */
    private final long f52514a;

    /* renamed from: c */
    private final StreamingContent f52515c;

    ContentEntity(long j, StreamingContent streamingContent) {
        this.f52514a = j;
        this.f52515c = (StreamingContent) Preconditions.m72716d(streamingContent);
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    public long getContentLength() {
        return this.f52514a;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.f52514a != 0) {
            this.f52515c.writeTo(outputStream);
        }
    }
}
