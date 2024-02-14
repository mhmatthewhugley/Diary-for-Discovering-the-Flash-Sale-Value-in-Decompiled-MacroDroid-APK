package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonTreeWriter extends JsonWriter {

    /* renamed from: f */
    private static final Writer f55924f = new Writer() {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: g */
    private static final JsonPrimitive f55925g = new JsonPrimitive("closed");

    /* renamed from: a */
    private final List<JsonElement> f55926a = new ArrayList();

    /* renamed from: c */
    private String f55927c;

    /* renamed from: d */
    private JsonElement f55928d = JsonNull.f55812a;

    public JsonTreeWriter() {
        super(f55924f);
    }

    /* renamed from: c */
    private JsonElement m78538c() {
        List<JsonElement> list = this.f55926a;
        return list.get(list.size() - 1);
    }

    /* renamed from: e */
    private void m78539e(JsonElement jsonElement) {
        if (this.f55927c != null) {
            if (!jsonElement.mo64028m() || getSerializeNulls()) {
                ((JsonObject) m78538c()).mo64037p(this.f55927c, jsonElement);
            }
            this.f55927c = null;
        } else if (this.f55926a.isEmpty()) {
            this.f55928d = jsonElement;
        } else {
            JsonElement c = m78538c();
            if (c instanceof JsonArray) {
                ((JsonArray) c).mo64020p(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public JsonElement mo64212b() {
        if (this.f55926a.isEmpty()) {
            return this.f55928d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f55926a);
    }

    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m78539e(jsonArray);
        this.f55926a.add(jsonArray);
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m78539e(jsonObject);
        this.f55926a.add(jsonObject);
        return this;
    }

    public void close() throws IOException {
        if (this.f55926a.isEmpty()) {
            this.f55926a.add(f55925g);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter endArray() throws IOException {
        if (this.f55926a.isEmpty() || this.f55927c != null) {
            throw new IllegalStateException();
        } else if (m78538c() instanceof JsonArray) {
            List<JsonElement> list = this.f55926a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter endObject() throws IOException {
        if (this.f55926a.isEmpty() || this.f55927c != null) {
            throw new IllegalStateException();
        } else if (m78538c() instanceof JsonObject) {
            List<JsonElement> list = this.f55926a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    public JsonWriter name(String str) throws IOException {
        if (this.f55926a.isEmpty() || this.f55927c != null) {
            throw new IllegalStateException();
        } else if (m78538c() instanceof JsonObject) {
            this.f55927c = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter nullValue() throws IOException {
        m78539e(JsonNull.f55812a);
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m78539e(new JsonPrimitive(str));
        return this;
    }

    public JsonWriter value(boolean z) throws IOException {
        m78539e(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m78539e(new JsonPrimitive(bool));
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m78539e(new JsonPrimitive((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public JsonWriter value(long j) throws IOException {
        m78539e(new JsonPrimitive((Number) Long.valueOf(j)));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m78539e(new JsonPrimitive(number));
        return this;
    }
}
