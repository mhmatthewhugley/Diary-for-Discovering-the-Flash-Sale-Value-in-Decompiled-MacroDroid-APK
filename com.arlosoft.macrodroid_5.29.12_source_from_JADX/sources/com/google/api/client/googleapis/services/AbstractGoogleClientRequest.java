package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseInterceptor;
import com.google.api.client.http.UriTemplate;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPut;

public abstract class AbstractGoogleClientRequest<T> extends GenericData {

    /* renamed from: A */
    private String f52362A;

    /* renamed from: B */
    private boolean f52363B;

    /* renamed from: C */
    private Class<T> f52364C;

    /* renamed from: D */
    private MediaHttpUploader f52365D;

    /* renamed from: d */
    private final AbstractGoogleClient f52366d;

    /* renamed from: f */
    private final String f52367f;

    /* renamed from: g */
    private final String f52368g;

    /* renamed from: o */
    private final HttpContent f52369o;

    /* renamed from: p */
    private HttpHeaders f52370p = new HttpHeaders();

    /* renamed from: s */
    private HttpHeaders f52371s;

    /* renamed from: z */
    private int f52372z = -1;

    protected AbstractGoogleClientRequest(AbstractGoogleClient abstractGoogleClient, String str, String str2, HttpContent httpContent, Class<T> cls) {
        this.f52364C = (Class) Preconditions.m72716d(cls);
        this.f52366d = (AbstractGoogleClient) Preconditions.m72716d(abstractGoogleClient);
        this.f52367f = (String) Preconditions.m72716d(str);
        this.f52368g = (String) Preconditions.m72716d(str2);
        this.f52369o = httpContent;
        String a = abstractGoogleClient.mo60303a();
        if (a != null) {
            HttpHeaders httpHeaders = this.f52370p;
            StringBuilder sb = new StringBuilder(a.length() + 1 + "Google-API-Java-Client".length());
            sb.append(a);
            sb.append(" ");
            sb.append("Google-API-Java-Client");
            httpHeaders.mo60388R(sb.toString());
            return;
        }
        this.f52370p.mo60388R("Google-API-Java-Client");
    }

    /* renamed from: e */
    private HttpRequest m71901e(boolean z) throws IOException {
        String str;
        boolean z2 = true;
        Preconditions.m72713a(this.f52365D == null);
        if (z && !this.f52367f.equals("GET")) {
            z2 = false;
        }
        Preconditions.m72713a(z2);
        if (z) {
            str = HttpHead.METHOD_NAME;
        } else {
            str = this.f52367f;
        }
        final HttpRequest d = mo60318n().mo60307e().mo60447d(str, mo60314f(), this.f52369o);
        new MethodOverride().mo60066b(d);
        d.mo60437v(mo60318n().mo60306d());
        if (this.f52369o == null && (this.f52367f.equals("POST") || this.f52367f.equals(HttpPut.METHOD_NAME) || this.f52367f.equals("PATCH"))) {
            d.mo60433r(new EmptyContent());
        }
        d.mo60420e().putAll(this.f52370p);
        if (!this.f52363B) {
            d.mo60434s(new GZipEncoding());
        }
        final HttpResponseInterceptor k = d.mo60426k();
        d.mo60439x(new HttpResponseInterceptor() {
            /* renamed from: a */
            public void mo60321a(HttpResponse httpResponse) throws IOException {
                HttpResponseInterceptor httpResponseInterceptor = k;
                if (httpResponseInterceptor != null) {
                    httpResponseInterceptor.mo60321a(httpResponse);
                }
                if (!httpResponse.mo60457k() && d.mo60427l()) {
                    throw AbstractGoogleClientRequest.this.mo60319o(httpResponse);
                }
            }
        });
        return d;
    }

    /* renamed from: l */
    private HttpResponse m71902l(boolean z) throws IOException {
        HttpResponse httpResponse;
        if (this.f52365D == null) {
            httpResponse = m71901e(z).mo60416a();
        } else {
            GenericUrl f = mo60314f();
            boolean l = mo60318n().mo60307e().mo60447d(this.f52367f, f, this.f52369o).mo60427l();
            httpResponse = this.f52365D.mo60289l(this.f52370p).mo60288k(this.f52363B).mo60290n(f);
            httpResponse.mo60453f().mo60437v(mo60318n().mo60306d());
            if (l && !httpResponse.mo60457k()) {
                throw mo60319o(httpResponse);
            }
        }
        this.f52371s = httpResponse.mo60452e();
        this.f52372z = httpResponse.mo60454g();
        this.f52362A = httpResponse.mo60455h();
        return httpResponse;
    }

    /* renamed from: f */
    public GenericUrl mo60314f() {
        return new GenericUrl(UriTemplate.m72168b(this.f52366d.mo60304b(), this.f52368g, this, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo60315g(Object obj, String str) {
        Preconditions.m72715c(this.f52366d.mo60308f() || obj != null, "Required parameter %s must be specified", str);
    }

    /* renamed from: h */
    public T mo60316h() throws IOException {
        return mo60317k().mo60458l(this.f52364C);
    }

    /* renamed from: k */
    public HttpResponse mo60317k() throws IOException {
        return m71902l(false);
    }

    /* renamed from: n */
    public AbstractGoogleClient mo60318n() {
        return this.f52366d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo60319o(HttpResponse httpResponse) {
        return new HttpResponseException(httpResponse);
    }

    /* renamed from: p */
    public AbstractGoogleClientRequest<T> mo60078d(String str, Object obj) {
        return (AbstractGoogleClientRequest) super.mo60078d(str, obj);
    }
}
