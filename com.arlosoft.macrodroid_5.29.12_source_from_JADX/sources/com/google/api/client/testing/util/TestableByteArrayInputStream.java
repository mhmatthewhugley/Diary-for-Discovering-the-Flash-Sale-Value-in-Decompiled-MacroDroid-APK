package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Beta
public class TestableByteArrayInputStream extends ByteArrayInputStream {

    /* renamed from: a */
    private boolean f52725a;

    public TestableByteArrayInputStream(byte[] bArr) {
        super(bArr);
    }

    public void close() throws IOException {
        this.f52725a = true;
    }
}
