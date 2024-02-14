package com.google.api.client.extensions.android.json;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.google.api.client.extensions.android.AndroidUtils;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Charsets;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

@Beta
public class AndroidJsonFactory extends JsonFactory {

    @Beta
    static class InstanceHolder {

        /* renamed from: a */
        static final AndroidJsonFactory f52219a = new AndroidJsonFactory();

        InstanceHolder() {
        }
    }

    public AndroidJsonFactory() {
        AndroidUtils.m71646a(11);
    }

    /* renamed from: a */
    public JsonGenerator mo60171a(OutputStream outputStream, Charset charset) {
        return mo60176l(new OutputStreamWriter(outputStream, charset));
    }

    /* renamed from: b */
    public JsonParser mo60172b(InputStream inputStream) {
        return mo60174d(new InputStreamReader(inputStream, Charsets.f52746a));
    }

    /* renamed from: c */
    public JsonParser mo60173c(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return mo60172b(inputStream);
        }
        return mo60174d(new InputStreamReader(inputStream, charset));
    }

    /* renamed from: d */
    public JsonParser mo60174d(Reader reader) {
        return new AndroidJsonParser(this, new JsonReader(reader));
    }

    /* renamed from: e */
    public JsonParser mo60175e(String str) {
        return mo60174d(new StringReader(str));
    }

    /* renamed from: l */
    public JsonGenerator mo60176l(Writer writer) {
        return new AndroidJsonGenerator(this, new JsonWriter(writer));
    }
}
