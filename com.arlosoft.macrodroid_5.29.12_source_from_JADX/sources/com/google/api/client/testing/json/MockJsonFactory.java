package com.google.api.client.testing.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

@Beta
public class MockJsonFactory extends JsonFactory {
    /* renamed from: a */
    public JsonGenerator mo60171a(OutputStream outputStream, Charset charset) throws IOException {
        return new MockJsonGenerator(this);
    }

    /* renamed from: b */
    public JsonParser mo60172b(InputStream inputStream) throws IOException {
        return new MockJsonParser(this);
    }

    /* renamed from: c */
    public JsonParser mo60173c(InputStream inputStream, Charset charset) throws IOException {
        return new MockJsonParser(this);
    }

    /* renamed from: d */
    public JsonParser mo60174d(Reader reader) throws IOException {
        return new MockJsonParser(this);
    }

    /* renamed from: e */
    public JsonParser mo60175e(String str) throws IOException {
        return new MockJsonParser(this);
    }
}
