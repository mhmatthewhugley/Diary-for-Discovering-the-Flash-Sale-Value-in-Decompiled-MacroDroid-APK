package com.google.api.client.testing.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@Beta
public class MockJsonParser extends JsonParser {

    /* renamed from: c */
    private boolean f52710c;

    /* renamed from: d */
    private final JsonFactory f52711d;

    MockJsonParser(JsonFactory jsonFactory) {
        this.f52711d = jsonFactory;
    }

    /* renamed from: B */
    public JsonParser mo60198B() throws IOException {
        return null;
    }

    /* renamed from: a */
    public void mo60199a() throws IOException {
        this.f52710c = true;
    }

    /* renamed from: b */
    public BigInteger mo60200b() throws IOException {
        return null;
    }

    /* renamed from: c */
    public byte mo60201c() throws IOException {
        return 0;
    }

    /* renamed from: e */
    public String mo60202e() throws IOException {
        return null;
    }

    /* renamed from: f */
    public JsonToken mo60203f() {
        return null;
    }

    /* renamed from: g */
    public BigDecimal mo60204g() throws IOException {
        return null;
    }

    /* renamed from: h */
    public double mo60205h() throws IOException {
        return 0.0d;
    }

    /* renamed from: i */
    public JsonFactory mo60206i() {
        return this.f52711d;
    }

    /* renamed from: j */
    public float mo60207j() throws IOException {
        return 0.0f;
    }

    /* renamed from: k */
    public int mo60208k() throws IOException {
        return 0;
    }

    /* renamed from: l */
    public long mo60209l() throws IOException {
        return 0;
    }

    /* renamed from: m */
    public short mo60210m() throws IOException {
        return 0;
    }

    /* renamed from: n */
    public String mo60211n() throws IOException {
        return null;
    }

    /* renamed from: o */
    public JsonToken mo60212o() throws IOException {
        return null;
    }
}
