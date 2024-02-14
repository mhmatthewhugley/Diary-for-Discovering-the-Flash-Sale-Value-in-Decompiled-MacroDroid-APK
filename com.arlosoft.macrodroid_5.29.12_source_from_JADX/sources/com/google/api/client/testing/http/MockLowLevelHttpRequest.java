package com.google.api.client.testing.http;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

@Beta
public class MockLowLevelHttpRequest extends LowLevelHttpRequest {

    /* renamed from: e */
    private String f52688e;

    /* renamed from: f */
    private final Map<String, List<String>> f52689f = new HashMap();

    /* renamed from: g */
    private MockLowLevelHttpResponse f52690g = new MockLowLevelHttpResponse();

    public MockLowLevelHttpRequest() {
    }

    /* renamed from: a */
    public void mo60255a(String str, String str2) throws IOException {
        String lowerCase = str.toLowerCase();
        List list = this.f52689f.get(lowerCase);
        if (list == null) {
            list = new ArrayList();
            this.f52689f.put(lowerCase, list);
        }
        list.add(str2);
    }

    /* renamed from: b */
    public LowLevelHttpResponse mo60256b() throws IOException {
        return this.f52690g;
    }

    /* renamed from: l */
    public String mo60638l() throws IOException {
        if (mo60477f() == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo60477f().writeTo(byteArrayOutputStream);
        String c = mo60474c();
        if (c != null && c.contains("gzip")) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream = new ByteArrayOutputStream();
            IOUtils.m72693b(gZIPInputStream, byteArrayOutputStream);
        }
        String e = mo60476e();
        HttpMediaType httpMediaType = e != null ? new HttpMediaType(e) : null;
        return byteArrayOutputStream.toString(((httpMediaType == null || httpMediaType.mo60403e() == null) ? Charsets.f52747b : httpMediaType.mo60403e()).name());
    }

    /* renamed from: m */
    public String mo60639m(String str) {
        List list = this.f52689f.get(str.toLowerCase());
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: n */
    public MockLowLevelHttpRequest mo60640n(MockLowLevelHttpResponse mockLowLevelHttpResponse) {
        this.f52690g = mockLowLevelHttpResponse;
        return this;
    }

    public MockLowLevelHttpRequest(String str) {
        this.f52688e = str;
    }
}
