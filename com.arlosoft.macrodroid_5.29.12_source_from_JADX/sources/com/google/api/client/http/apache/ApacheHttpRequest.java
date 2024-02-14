package com.google.api.client.http.apache;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

final class ApacheHttpRequest extends LowLevelHttpRequest {

    /* renamed from: e */
    private final HttpClient f52505e;

    /* renamed from: f */
    private final HttpRequestBase f52506f;

    ApacheHttpRequest(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f52505e = httpClient;
        this.f52506f = httpRequestBase;
    }

    /* renamed from: a */
    public void mo60255a(String str, String str2) {
        this.f52506f.addHeader(str, str2);
    }

    /* renamed from: b */
    public LowLevelHttpResponse mo60256b() throws IOException {
        if (mo60477f() != null) {
            HttpRequestBase httpRequestBase = this.f52506f;
            Preconditions.m72715c(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            ContentEntity contentEntity = new ContentEntity(mo60475d(), mo60477f());
            contentEntity.setContentEncoding(mo60474c());
            contentEntity.setContentType(mo60476e());
            ((HttpEntityEnclosingRequest) this.f52506f).setEntity(contentEntity);
        }
        HttpRequestBase httpRequestBase2 = this.f52506f;
        return new ApacheHttpResponse(httpRequestBase2, this.f52505e.execute(httpRequestBase2));
    }

    /* renamed from: k */
    public void mo60482k(int i, int i2) throws IOException {
        HttpParams params = this.f52506f.getParams();
        ConnManagerParams.setTimeout(params, (long) i);
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, i2);
    }
}
