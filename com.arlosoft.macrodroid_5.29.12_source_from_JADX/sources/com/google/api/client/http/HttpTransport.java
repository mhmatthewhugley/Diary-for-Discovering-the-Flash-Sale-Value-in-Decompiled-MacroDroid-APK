package com.google.api.client.http;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPut;

public abstract class HttpTransport {

    /* renamed from: a */
    static final Logger f52480a = Logger.getLogger(HttpTransport.class.getName());

    /* renamed from: b */
    private static final String[] f52481b;

    static {
        String[] strArr = {HttpDelete.METHOD_NAME, "GET", "POST", HttpPut.METHOD_NAME};
        f52481b = strArr;
        Arrays.sort(strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HttpRequest mo60466a() {
        return new HttpRequest(this, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract LowLevelHttpRequest mo60266b(String str, String str2) throws IOException;

    /* renamed from: c */
    public final HttpRequestFactory mo60467c() {
        return mo60468d((HttpRequestInitializer) null);
    }

    /* renamed from: d */
    public final HttpRequestFactory mo60468d(HttpRequestInitializer httpRequestInitializer) {
        return new HttpRequestFactory(this, httpRequestInitializer);
    }

    /* renamed from: e */
    public boolean mo60469e(String str) throws IOException {
        return Arrays.binarySearch(f52481b, str) >= 0;
    }
}
