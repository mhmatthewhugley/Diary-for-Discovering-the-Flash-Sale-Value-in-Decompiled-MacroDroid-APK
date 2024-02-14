package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayStreamingContent implements StreamingContent {

    /* renamed from: a */
    private final byte[] f52740a;

    /* renamed from: b */
    private final int f52741b;

    /* renamed from: c */
    private final int f52742c;

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52740a, this.f52741b, this.f52742c);
        outputStream.flush();
    }
}
