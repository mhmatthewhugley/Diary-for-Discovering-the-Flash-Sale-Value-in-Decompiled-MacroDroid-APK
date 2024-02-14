package com.google.api.client.extensions.android.json;

import android.util.JsonWriter;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@Beta
class AndroidJsonGenerator extends JsonGenerator {

    /* renamed from: a */
    private final JsonWriter f52220a;

    /* renamed from: b */
    private final AndroidJsonFactory f52221b;

    static final class StringNumber extends Number {
        private static final long serialVersionUID = 1;
        private final String encodedValue;

        public double doubleValue() {
            return 0.0d;
        }

        public float floatValue() {
            return 0.0f;
        }

        public int intValue() {
            return 0;
        }

        public long longValue() {
            return 0;
        }

        public String toString() {
            return this.encodedValue;
        }
    }

    AndroidJsonGenerator(AndroidJsonFactory androidJsonFactory, JsonWriter jsonWriter) {
        this.f52221b = androidJsonFactory;
        this.f52220a = jsonWriter;
        jsonWriter.setLenient(true);
    }

    /* renamed from: a */
    public void mo60177a() throws IOException {
        this.f52220a.setIndent("  ");
    }

    /* renamed from: b */
    public void mo60178b() throws IOException {
        this.f52220a.flush();
    }

    /* renamed from: e */
    public void mo60179e(boolean z) throws IOException {
        this.f52220a.value(z);
    }

    /* renamed from: f */
    public void mo60180f() throws IOException {
        this.f52220a.endArray();
    }

    /* renamed from: g */
    public void mo60181g() throws IOException {
        this.f52220a.endObject();
    }

    /* renamed from: h */
    public void mo60182h(String str) throws IOException {
        this.f52220a.name(str);
    }

    /* renamed from: i */
    public void mo60183i() throws IOException {
        this.f52220a.nullValue();
    }

    /* renamed from: j */
    public void mo60184j(double d) throws IOException {
        this.f52220a.value(d);
    }

    /* renamed from: k */
    public void mo60185k(float f) throws IOException {
        this.f52220a.value((double) f);
    }

    /* renamed from: l */
    public void mo60186l(int i) throws IOException {
        this.f52220a.value((long) i);
    }

    /* renamed from: m */
    public void mo60187m(long j) throws IOException {
        this.f52220a.value(j);
    }

    /* renamed from: n */
    public void mo60188n(BigDecimal bigDecimal) throws IOException {
        this.f52220a.value(bigDecimal);
    }

    /* renamed from: o */
    public void mo60189o(BigInteger bigInteger) throws IOException {
        this.f52220a.value(bigInteger);
    }

    /* renamed from: p */
    public void mo60190p() throws IOException {
        this.f52220a.beginArray();
    }

    /* renamed from: q */
    public void mo60191q() throws IOException {
        this.f52220a.beginObject();
    }

    /* renamed from: r */
    public void mo60192r(String str) throws IOException {
        this.f52220a.value(str);
    }
}
