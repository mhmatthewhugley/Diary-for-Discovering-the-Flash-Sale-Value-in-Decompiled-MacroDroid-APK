package com.google.api.client.testing.http;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Set;

@Beta
public class MockHttpTransport extends HttpTransport {

    /* renamed from: c */
    private Set<String> f52683c;

    /* renamed from: d */
    private MockLowLevelHttpRequest f52684d;

    /* renamed from: e */
    private MockLowLevelHttpResponse f52685e;

    @Beta
    public static class Builder {
    }

    /* renamed from: b */
    public LowLevelHttpRequest mo60266b(String str, String str2) throws IOException {
        Preconditions.m72715c(mo60469e(str), "HTTP method %s not supported", str);
        MockLowLevelHttpRequest mockLowLevelHttpRequest = this.f52684d;
        if (mockLowLevelHttpRequest != null) {
            return mockLowLevelHttpRequest;
        }
        MockLowLevelHttpRequest mockLowLevelHttpRequest2 = new MockLowLevelHttpRequest(str2);
        MockLowLevelHttpResponse mockLowLevelHttpResponse = this.f52685e;
        if (mockLowLevelHttpResponse != null) {
            mockLowLevelHttpRequest2.mo60640n(mockLowLevelHttpResponse);
        }
        return mockLowLevelHttpRequest2;
    }

    /* renamed from: e */
    public boolean mo60469e(String str) throws IOException {
        Set<String> set = this.f52683c;
        return set == null || set.contains(str);
    }
}
