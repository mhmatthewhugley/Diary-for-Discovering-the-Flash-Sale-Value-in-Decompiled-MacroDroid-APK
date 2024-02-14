package com.google.api.client.http.json;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

public class JsonHttpContent extends AbstractHttpContent {

    /* renamed from: c */
    private final Object f52531c;

    /* renamed from: d */
    private final JsonFactory f52532d;

    /* renamed from: e */
    private String f52533e;

    public JsonHttpContent(JsonFactory jsonFactory, Object obj) {
        super("application/json; charset=UTF-8");
        this.f52532d = (JsonFactory) Preconditions.m72716d(jsonFactory);
        this.f52531c = Preconditions.m72716d(obj);
    }

    /* renamed from: g */
    public JsonHttpContent mo60513g(String str) {
        this.f52533e = str;
        return this;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        JsonGenerator a = this.f52532d.mo60171a(outputStream, mo60341e());
        if (this.f52533e != null) {
            a.mo60191q();
            a.mo60182h(this.f52533e);
        }
        a.mo60525c(this.f52531c);
        if (this.f52533e != null) {
            a.mo60181g();
        }
        a.mo60178b();
    }
}
