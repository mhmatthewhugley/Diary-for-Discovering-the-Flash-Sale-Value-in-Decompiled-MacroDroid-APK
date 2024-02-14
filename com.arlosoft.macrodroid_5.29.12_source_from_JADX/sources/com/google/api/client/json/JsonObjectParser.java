package com.google.api.client.json;

import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JsonObjectParser implements ObjectParser {

    /* renamed from: a */
    private final JsonFactory f52535a;

    /* renamed from: b */
    private final Set<String> f52536b;

    public static class Builder {

        /* renamed from: a */
        final JsonFactory f52537a;

        /* renamed from: b */
        Collection<String> f52538b = Sets.m72724a();

        public Builder(JsonFactory jsonFactory) {
            this.f52537a = (JsonFactory) Preconditions.m72716d(jsonFactory);
        }

        /* renamed from: a */
        public JsonObjectParser mo60529a() {
            return new JsonObjectParser(this);
        }

        /* renamed from: b */
        public Builder mo60530b(Collection<String> collection) {
            this.f52538b = collection;
            return this;
        }
    }

    public JsonObjectParser(JsonFactory jsonFactory) {
        this(new Builder(jsonFactory));
    }

    /* renamed from: d */
    private void m72268d(JsonParser jsonParser) throws IOException {
        if (!this.f52536b.isEmpty()) {
            try {
                Preconditions.m72715c((jsonParser.mo60531C(this.f52536b) == null || jsonParser.mo60203f() == JsonToken.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.f52536b);
            } catch (Throwable th) {
                jsonParser.mo60199a();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public <T> T mo60213a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo60528e(inputStream, charset, cls);
    }

    /* renamed from: b */
    public final JsonFactory mo60526b() {
        return this.f52535a;
    }

    /* renamed from: c */
    public Set<String> mo60527c() {
        return Collections.unmodifiableSet(this.f52536b);
    }

    /* renamed from: e */
    public Object mo60528e(InputStream inputStream, Charset charset, Type type) throws IOException {
        JsonParser c = this.f52535a.mo60173c(inputStream, charset);
        m72268d(c);
        return c.mo60534q(type, true);
    }

    protected JsonObjectParser(Builder builder) {
        this.f52535a = builder.f52537a;
        this.f52536b = new HashSet(builder.f52538b);
    }
}
