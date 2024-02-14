package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.C6802e;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

final class JacksonParser extends JsonParser {

    /* renamed from: c */
    private final C6802e f52560c;

    /* renamed from: d */
    private final JacksonFactory f52561d;

    JacksonParser(JacksonFactory jacksonFactory, C6802e eVar) {
        this.f52561d = jacksonFactory;
        this.f52560c = eVar;
    }

    /* renamed from: B */
    public JsonParser mo60198B() throws IOException {
        this.f52560c.mo33875w();
        return this;
    }

    /* renamed from: G */
    public JacksonFactory mo60206i() {
        return this.f52561d;
    }

    /* renamed from: a */
    public void mo60199a() throws IOException {
        this.f52560c.close();
    }

    /* renamed from: b */
    public BigInteger mo60200b() throws IOException {
        return this.f52560c.mo33860c();
    }

    /* renamed from: c */
    public byte mo60201c() throws IOException {
        return this.f52560c.mo33862e();
    }

    /* renamed from: e */
    public String mo60202e() throws IOException {
        return this.f52560c.mo33864g();
    }

    /* renamed from: f */
    public JsonToken mo60203f() {
        return JacksonFactory.m72307l(this.f52560c.mo33865h());
    }

    /* renamed from: g */
    public BigDecimal mo60204g() throws IOException {
        return this.f52560c.mo33866i();
    }

    /* renamed from: h */
    public double mo60205h() throws IOException {
        return this.f52560c.mo33867j();
    }

    /* renamed from: j */
    public float mo60207j() throws IOException {
        return this.f52560c.mo33868m();
    }

    /* renamed from: k */
    public int mo60208k() throws IOException {
        return this.f52560c.mo33869o();
    }

    /* renamed from: l */
    public long mo60209l() throws IOException {
        return this.f52560c.mo33870p();
    }

    /* renamed from: m */
    public short mo60210m() throws IOException {
        return this.f52560c.mo33871r();
    }

    /* renamed from: n */
    public String mo60211n() throws IOException {
        return this.f52560c.mo33872s();
    }

    /* renamed from: o */
    public JsonToken mo60212o() throws IOException {
        return JacksonFactory.m72307l(this.f52560c.mo33874v());
    }
}
