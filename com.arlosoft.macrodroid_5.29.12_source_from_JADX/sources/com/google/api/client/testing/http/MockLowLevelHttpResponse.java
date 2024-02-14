package com.google.api.client.testing.http;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Beta
public class MockLowLevelHttpResponse extends LowLevelHttpResponse {

    /* renamed from: a */
    private InputStream f52691a;

    /* renamed from: b */
    private String f52692b;

    /* renamed from: c */
    private int f52693c = 200;

    /* renamed from: d */
    private String f52694d;

    /* renamed from: e */
    private List<String> f52695e = new ArrayList();

    /* renamed from: f */
    private List<String> f52696f = new ArrayList();

    /* renamed from: g */
    private String f52697g;

    /* renamed from: h */
    private long f52698h = -1;

    /* renamed from: i */
    private boolean f52699i;

    /* renamed from: a */
    public void mo60483a() throws IOException {
        this.f52699i = true;
        super.mo60483a();
    }

    /* renamed from: b */
    public InputStream mo60257b() throws IOException {
        return this.f52691a;
    }

    /* renamed from: c */
    public String mo60258c() {
        return this.f52697g;
    }

    /* renamed from: d */
    public final String mo60259d() {
        return this.f52692b;
    }

    /* renamed from: e */
    public int mo60260e() {
        return this.f52695e.size();
    }

    /* renamed from: f */
    public String mo60261f(int i) {
        return this.f52695e.get(i);
    }

    /* renamed from: g */
    public String mo60262g(int i) {
        return this.f52696f.get(i);
    }

    /* renamed from: h */
    public String mo60263h() {
        return this.f52694d;
    }

    /* renamed from: i */
    public int mo60264i() {
        return this.f52693c;
    }

    /* renamed from: j */
    public String mo60265j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52693c);
        String str = this.f52694d;
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: k */
    public MockLowLevelHttpResponse mo60641k(String str, String str2) {
        this.f52695e.add(Preconditions.m72716d(str));
        this.f52696f.add(Preconditions.m72716d(str2));
        return this;
    }

    /* renamed from: l */
    public MockLowLevelHttpResponse mo60642l(String str) {
        return str == null ? mo60647q() : mo60643m(StringUtils.m72727a(str));
    }

    /* renamed from: m */
    public MockLowLevelHttpResponse mo60643m(byte[] bArr) {
        if (bArr == null) {
            return mo60647q();
        }
        this.f52691a = new TestableByteArrayInputStream(bArr);
        mo60644n((long) bArr.length);
        return this;
    }

    /* renamed from: n */
    public MockLowLevelHttpResponse mo60644n(long j) {
        this.f52698h = j;
        Preconditions.m72713a(j >= -1);
        return this;
    }

    /* renamed from: o */
    public MockLowLevelHttpResponse mo60645o(String str) {
        this.f52692b = str;
        return this;
    }

    /* renamed from: p */
    public MockLowLevelHttpResponse mo60646p(int i) {
        this.f52693c = i;
        return this;
    }

    /* renamed from: q */
    public MockLowLevelHttpResponse mo60647q() {
        this.f52691a = null;
        mo60644n(0);
        return this;
    }
}
