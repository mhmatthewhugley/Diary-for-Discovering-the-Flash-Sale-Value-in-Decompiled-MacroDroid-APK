package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.C6799c;
import com.google.api.client.json.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

final class JacksonGenerator extends JsonGenerator {

    /* renamed from: a */
    private final C6799c f52558a;

    /* renamed from: b */
    private final JacksonFactory f52559b;

    JacksonGenerator(JacksonFactory jacksonFactory, C6799c cVar) {
        this.f52559b = jacksonFactory;
        this.f52558a = cVar;
    }

    /* renamed from: a */
    public void mo60177a() throws IOException {
        this.f52558a.mo33835e();
    }

    /* renamed from: b */
    public void mo60178b() throws IOException {
        this.f52558a.flush();
    }

    /* renamed from: e */
    public void mo60179e(boolean z) throws IOException {
        this.f52558a.mo33836f(z);
    }

    /* renamed from: f */
    public void mo60180f() throws IOException {
        this.f52558a.mo33838g();
    }

    /* renamed from: g */
    public void mo60181g() throws IOException {
        this.f52558a.mo33839h();
    }

    /* renamed from: h */
    public void mo60182h(String str) throws IOException {
        this.f52558a.mo33840i(str);
    }

    /* renamed from: i */
    public void mo60183i() throws IOException {
        this.f52558a.mo33841j();
    }

    /* renamed from: j */
    public void mo60184j(double d) throws IOException {
        this.f52558a.mo33842m(d);
    }

    /* renamed from: k */
    public void mo60185k(float f) throws IOException {
        this.f52558a.mo33843o(f);
    }

    /* renamed from: l */
    public void mo60186l(int i) throws IOException {
        this.f52558a.mo33844p(i);
    }

    /* renamed from: m */
    public void mo60187m(long j) throws IOException {
        this.f52558a.mo33845r(j);
    }

    /* renamed from: n */
    public void mo60188n(BigDecimal bigDecimal) throws IOException {
        this.f52558a.mo33846s(bigDecimal);
    }

    /* renamed from: o */
    public void mo60189o(BigInteger bigInteger) throws IOException {
        this.f52558a.mo33847u(bigInteger);
    }

    /* renamed from: p */
    public void mo60190p() throws IOException {
        this.f52558a.mo33852z();
    }

    /* renamed from: q */
    public void mo60191q() throws IOException {
        this.f52558a.mo33831A();
    }

    /* renamed from: r */
    public void mo60192r(String str) throws IOException {
        this.f52558a.mo33832B(str);
    }
}
