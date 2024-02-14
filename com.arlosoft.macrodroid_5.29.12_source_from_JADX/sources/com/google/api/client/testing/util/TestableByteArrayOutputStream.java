package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Beta
public class TestableByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a */
    private boolean f52726a;

    public void close() throws IOException {
        this.f52726a = true;
    }
}
