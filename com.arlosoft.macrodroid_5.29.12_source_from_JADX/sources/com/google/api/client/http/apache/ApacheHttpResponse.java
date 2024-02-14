package com.google.api.client.http.apache;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

final class ApacheHttpResponse extends LowLevelHttpResponse {

    /* renamed from: a */
    private final HttpRequestBase f52507a;

    /* renamed from: b */
    private final HttpResponse f52508b;

    /* renamed from: c */
    private final Header[] f52509c;

    ApacheHttpResponse(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f52507a = httpRequestBase;
        this.f52508b = httpResponse;
        this.f52509c = httpResponse.getAllHeaders();
    }

    /* renamed from: a */
    public void mo60483a() {
        this.f52507a.abort();
    }

    /* renamed from: b */
    public InputStream mo60257b() throws IOException {
        HttpEntity entity = this.f52508b.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    /* renamed from: c */
    public String mo60258c() {
        Header contentEncoding;
        HttpEntity entity = this.f52508b.getEntity();
        if (entity == null || (contentEncoding = entity.getContentEncoding()) == null) {
            return null;
        }
        return contentEncoding.getValue();
    }

    /* renamed from: d */
    public String mo60259d() {
        Header contentType;
        HttpEntity entity = this.f52508b.getEntity();
        if (entity == null || (contentType = entity.getContentType()) == null) {
            return null;
        }
        return contentType.getValue();
    }

    /* renamed from: e */
    public int mo60260e() {
        return this.f52509c.length;
    }

    /* renamed from: f */
    public String mo60261f(int i) {
        return this.f52509c[i].getName();
    }

    /* renamed from: g */
    public String mo60262g(int i) {
        return this.f52509c[i].getValue();
    }

    /* renamed from: h */
    public String mo60263h() {
        StatusLine statusLine = this.f52508b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.getReasonPhrase();
    }

    /* renamed from: i */
    public int mo60264i() {
        StatusLine statusLine = this.f52508b.getStatusLine();
        if (statusLine == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    /* renamed from: j */
    public String mo60265j() {
        StatusLine statusLine = this.f52508b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.toString();
    }
}
