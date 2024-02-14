package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

public class TokenRequest extends GenericData {

    /* renamed from: d */
    HttpRequestInitializer f52202d;

    /* renamed from: f */
    HttpExecuteInterceptor f52203f;

    /* renamed from: g */
    private final HttpTransport f52204g;
    @Key("grant_type")
    private String grantType;

    /* renamed from: o */
    private final JsonFactory f52205o;

    /* renamed from: p */
    private GenericUrl f52206p;
    @Key("scope")
    private String scopes;

    public TokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        this.f52204g = (HttpTransport) Preconditions.m72716d(httpTransport);
        this.f52205o = (JsonFactory) Preconditions.m72716d(jsonFactory);
        mo60085n(genericUrl);
        mo60084k(str);
    }

    /* renamed from: e */
    public TokenResponse mo60141e() throws IOException {
        return (TokenResponse) mo60142f().mo60458l(TokenResponse.class);
    }

    /* renamed from: f */
    public final HttpResponse mo60142f() throws IOException {
        HttpRequest b = this.f52204g.mo60468d(new HttpRequestInitializer() {
            /* renamed from: c */
            public void mo60067c(HttpRequest httpRequest) throws IOException {
                HttpRequestInitializer httpRequestInitializer = TokenRequest.this.f52202d;
                if (httpRequestInitializer != null) {
                    httpRequestInitializer.mo60067c(httpRequest);
                }
                final HttpExecuteInterceptor g = httpRequest.mo60422g();
                httpRequest.mo60436u(new HttpExecuteInterceptor() {
                    /* renamed from: b */
                    public void mo60066b(HttpRequest httpRequest) throws IOException {
                        HttpExecuteInterceptor httpExecuteInterceptor = g;
                        if (httpExecuteInterceptor != null) {
                            httpExecuteInterceptor.mo60066b(httpRequest);
                        }
                        HttpExecuteInterceptor httpExecuteInterceptor2 = TokenRequest.this.f52203f;
                        if (httpExecuteInterceptor2 != null) {
                            httpExecuteInterceptor2.mo60066b(httpRequest);
                        }
                    }
                });
            }
        }).mo60445b(this.f52206p, new UrlEncodedContent(this));
        b.mo60437v(new JsonObjectParser(this.f52205o));
        b.mo60440y(false);
        HttpResponse a = b.mo60416a();
        if (a.mo60457k()) {
            return a;
        }
        throw TokenResponseException.m71614c(this.f52205o, a);
    }

    /* renamed from: g */
    public TokenRequest mo60078d(String str, Object obj) {
        return (TokenRequest) super.mo60078d(str, obj);
    }

    /* renamed from: h */
    public TokenRequest mo60143h(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f52203f = httpExecuteInterceptor;
        return this;
    }

    /* renamed from: k */
    public TokenRequest mo60084k(String str) {
        this.grantType = (String) Preconditions.m72716d(str);
        return this;
    }

    /* renamed from: l */
    public TokenRequest mo60144l(HttpRequestInitializer httpRequestInitializer) {
        this.f52202d = httpRequestInitializer;
        return this;
    }

    /* renamed from: n */
    public TokenRequest mo60085n(GenericUrl genericUrl) {
        this.f52206p = genericUrl;
        Preconditions.m72713a(genericUrl.mo60364o() == null);
        return this;
    }
}
