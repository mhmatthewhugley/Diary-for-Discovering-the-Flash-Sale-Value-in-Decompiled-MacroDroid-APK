package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

public class GoogleCredential extends Credential {
    @Beta

    /* renamed from: t */
    private static DefaultCredentialProvider f52249t = new DefaultCredentialProvider();

    /* renamed from: n */
    private String f52250n;

    /* renamed from: o */
    private String f52251o;

    /* renamed from: p */
    private Collection<String> f52252p;

    /* renamed from: q */
    private PrivateKey f52253q;

    /* renamed from: r */
    private String f52254r;

    /* renamed from: s */
    private String f52255s;

    public static class Builder extends Credential.Builder {

        /* renamed from: i */
        String f52256i;

        /* renamed from: j */
        Collection<String> f52257j;

        /* renamed from: k */
        PrivateKey f52258k;

        /* renamed from: l */
        String f52259l;

        /* renamed from: m */
        String f52260m;

        /* renamed from: n */
        String f52261n;

        public Builder() {
            super(BearerToken.m71509a());
            mo60234b("https://accounts.google.com/o/oauth2/token");
        }

        /* renamed from: b */
        public Builder mo60234b(String str) {
            return (Builder) super.mo60113a(str);
        }
    }

    public GoogleCredential() {
        this(new Builder());
    }

    /* access modifiers changed from: protected */
    @Beta
    /* renamed from: d */
    public TokenResponse mo60097d() throws IOException {
        if (this.f52253q == null) {
            return super.mo60097d();
        }
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.mo60552r("RS256");
        header.mo60554t("JWT");
        header.mo60553s(this.f52254r);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        long a = mo60100g().mo60637a();
        payload.mo60160r(this.f52250n);
        payload.mo60157o(mo60105l());
        long j = a / 1000;
        payload.mo60159q(Long.valueOf(j));
        payload.mo60158p(Long.valueOf(j + 3600));
        payload.mo60161s(this.f52255s);
        payload.put("scope", Joiner.m72699b(' ').mo60765a(this.f52252p));
        try {
            String d = JsonWebSignature.m72352d(this.f52253q, mo60103j(), header, payload);
            TokenRequest tokenRequest = new TokenRequest(mo60106m(), mo60103j(), new GenericUrl(mo60105l()), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            tokenRequest.put("assertion", d);
            return tokenRequest.mo60141e();
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: t */
    public GoogleCredential mo60108o(String str) {
        return (GoogleCredential) super.mo60108o(str);
    }

    /* renamed from: u */
    public GoogleCredential mo60109p(Long l) {
        return (GoogleCredential) super.mo60109p(l);
    }

    /* renamed from: v */
    public GoogleCredential mo60110q(Long l) {
        return (GoogleCredential) super.mo60110q(l);
    }

    /* renamed from: w */
    public GoogleCredential mo60111r(TokenResponse tokenResponse) {
        return (GoogleCredential) super.mo60111r(tokenResponse);
    }

    /* renamed from: x */
    public GoogleCredential mo60112s(String str) {
        if (str != null) {
            Preconditions.m72714b((mo60103j() == null || mo60106m() == null || mo60099f() == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (GoogleCredential) super.mo60112s(str);
    }

    protected GoogleCredential(Builder builder) {
        super(builder);
        if (builder.f52258k == null) {
            Preconditions.m72713a(builder.f52256i == null && builder.f52257j == null && builder.f52261n == null);
            return;
        }
        this.f52250n = (String) Preconditions.m72716d(builder.f52256i);
        this.f52251o = builder.f52260m;
        Collection<String> collection = builder.f52257j;
        this.f52252p = collection == null ? Collections.emptyList() : Collections.unmodifiableCollection(collection);
        this.f52253q = builder.f52258k;
        this.f52254r = builder.f52259l;
        this.f52255s = builder.f52261n;
    }
}
