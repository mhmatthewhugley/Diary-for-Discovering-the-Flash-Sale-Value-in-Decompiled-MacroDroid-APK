package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.p353io.FilenameUtils;

public final class JsonTreeReader extends JsonReader {

    /* renamed from: g */
    private static final Reader f55918g = new Reader() {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: o */
    private static final Object f55919o = new Object();

    /* renamed from: a */
    private Object[] f55920a = new Object[32];

    /* renamed from: c */
    private int f55921c = 0;

    /* renamed from: d */
    private String[] f55922d = new String[32];

    /* renamed from: f */
    private int[] f55923f = new int[32];

    public JsonTreeReader(JsonElement jsonElement) {
        super(f55918g);
        m78536g(jsonElement);
    }

    /* renamed from: b */
    private void m78533b(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    /* renamed from: c */
    private Object m78534c() {
        return this.f55920a[this.f55921c - 1];
    }

    /* renamed from: e */
    private Object m78535e() {
        Object[] objArr = this.f55920a;
        int i = this.f55921c - 1;
        this.f55921c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: g */
    private void m78536g(Object obj) {
        int i = this.f55921c;
        Object[] objArr = this.f55920a;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f55920a = Arrays.copyOf(objArr, i2);
            this.f55923f = Arrays.copyOf(this.f55923f, i2);
            this.f55922d = (String[]) Arrays.copyOf(this.f55922d, i2);
        }
        Object[] objArr2 = this.f55920a;
        int i3 = this.f55921c;
        this.f55921c = i3 + 1;
        objArr2[i3] = obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    public void beginArray() throws IOException {
        m78533b(JsonToken.BEGIN_ARRAY);
        m78536g(((JsonArray) m78534c()).iterator());
        this.f55923f[this.f55921c - 1] = 0;
    }

    public void beginObject() throws IOException {
        m78533b(JsonToken.BEGIN_OBJECT);
        m78536g(((JsonObject) m78534c()).entrySet().iterator());
    }

    public void close() throws IOException {
        this.f55920a = new Object[]{f55919o};
        this.f55921c = 1;
    }

    public void endArray() throws IOException {
        m78533b(JsonToken.END_ARRAY);
        m78535e();
        m78535e();
        int i = this.f55921c;
        if (i > 0) {
            int[] iArr = this.f55923f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void endObject() throws IOException {
        m78533b(JsonToken.END_OBJECT);
        m78535e();
        m78535e();
        int i = this.f55921c;
        if (i > 0) {
            int[] iArr = this.f55923f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public void mo64197f() throws IOException {
        m78533b(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m78534c()).next();
        m78536g(entry.getValue());
        m78536g(new JsonPrimitive((String) entry.getKey()));
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f55921c) {
            Object[] objArr = this.f55920a;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f55923f[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    String[] strArr = this.f55922d;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public boolean nextBoolean() throws IOException {
        m78533b(JsonToken.BOOLEAN);
        boolean c = ((JsonPrimitive) m78535e()).mo64013c();
        int i = this.f55921c;
        if (i > 0) {
            int[] iArr = this.f55923f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c;
    }

    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double p = ((JsonPrimitive) m78534c()).mo64043p();
            if (isLenient() || (!Double.isNaN(p) && !Double.isInfinite(p))) {
                m78535e();
                int i = this.f55921c;
                if (i > 0) {
                    int[] iArr = this.f55923f;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return p;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + p);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int d = ((JsonPrimitive) m78534c()).mo64014d();
            m78535e();
            int i = this.f55921c;
            if (i > 0) {
                int[] iArr = this.f55923f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return d;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long j = ((JsonPrimitive) m78534c()).mo64018j();
            m78535e();
            int i = this.f55921c;
            if (i > 0) {
                int[] iArr = this.f55923f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public String nextName() throws IOException {
        m78533b(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m78534c()).next();
        String str = (String) entry.getKey();
        this.f55922d[this.f55921c - 1] = str;
        m78536g(entry.getValue());
        return str;
    }

    public void nextNull() throws IOException {
        m78533b(JsonToken.NULL);
        m78535e();
        int i = this.f55921c;
        if (i > 0) {
            int[] iArr = this.f55923f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String k = ((JsonPrimitive) m78535e()).mo64019k();
            int i = this.f55921c;
            if (i > 0) {
                int[] iArr = this.f55923f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public JsonToken peek() throws IOException {
        if (this.f55921c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object c = m78534c();
        if (c instanceof Iterator) {
            boolean z = this.f55920a[this.f55921c - 2] instanceof JsonObject;
            Iterator it = (Iterator) c;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m78536g(it.next());
            return peek();
        } else if (c instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (c instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (c instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) c;
                if (jsonPrimitive.mo64047w()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.mo64045s()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.mo64046u()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (c instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (c == f55919o) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f55922d[this.f55921c - 2] = "null";
        } else {
            m78535e();
            int i = this.f55921c;
            if (i > 0) {
                this.f55922d[i - 1] = "null";
            }
        }
        int i2 = this.f55921c;
        if (i2 > 0) {
            int[] iArr = this.f55923f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String toString() {
        return JsonTreeReader.class.getSimpleName();
    }
}
