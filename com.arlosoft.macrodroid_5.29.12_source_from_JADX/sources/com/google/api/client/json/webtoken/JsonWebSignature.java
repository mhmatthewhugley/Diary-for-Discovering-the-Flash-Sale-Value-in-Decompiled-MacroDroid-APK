package com.google.api.client.json.webtoken;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.List;

public class JsonWebSignature extends JsonWebToken {

    /* renamed from: c */
    private final byte[] f52563c;

    /* renamed from: d */
    private final byte[] f52564d;

    public static class Header extends JsonWebToken.Header {
        @Key("alg")
        private String algorithm;
        @Key("crit")
        private List<String> critical;
        @Key("jwk")
        private String jwk;
        @Key("jku")
        private String jwkUrl;
        @Key("kid")
        private String keyId;
        @Key("x5c")
        private List<String> x509Certificates;
        @Key("x5t")
        private String x509Thumbprint;
        @Key("x5u")
        private String x509Url;

        /* renamed from: o */
        public Header mo60547k() {
            return (Header) super.mo60137e();
        }

        /* renamed from: p */
        public final String mo60550p() {
            return this.algorithm;
        }

        /* renamed from: q */
        public Header mo60548l(String str, Object obj) {
            return (Header) super.mo60138f(str, obj);
        }

        /* renamed from: r */
        public Header mo60552r(String str) {
            this.algorithm = str;
            return this;
        }

        /* renamed from: s */
        public Header mo60553s(String str) {
            this.keyId = str;
            return this;
        }

        /* renamed from: t */
        public Header mo60554t(String str) {
            super.mo60557n(str);
            return this;
        }
    }

    public static final class Parser {

        /* renamed from: a */
        private final JsonFactory f52565a;

        /* renamed from: b */
        private Class<? extends Header> f52566b = Header.class;

        /* renamed from: c */
        private Class<? extends JsonWebToken.Payload> f52567c = JsonWebToken.Payload.class;

        public Parser(JsonFactory jsonFactory) {
            this.f52565a = (JsonFactory) Preconditions.m72716d(jsonFactory);
        }

        /* renamed from: a */
        public JsonWebSignature mo60555a(String str) throws IOException {
            int indexOf = str.indexOf(46);
            boolean z = true;
            Preconditions.m72713a(indexOf != -1);
            byte[] a = Base64.m72634a(str.substring(0, indexOf));
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            Preconditions.m72713a(indexOf2 != -1);
            int i2 = indexOf2 + 1;
            Preconditions.m72713a(str.indexOf(46, i2) == -1);
            byte[] a2 = Base64.m72634a(str.substring(i, indexOf2));
            byte[] a3 = Base64.m72634a(str.substring(i2));
            byte[] a4 = StringUtils.m72727a(str.substring(0, indexOf2));
            Header header = (Header) this.f52565a.mo60521f(new ByteArrayInputStream(a), this.f52566b);
            if (header.mo60550p() == null) {
                z = false;
            }
            Preconditions.m72713a(z);
            return new JsonWebSignature(header, (JsonWebToken.Payload) this.f52565a.mo60521f(new ByteArrayInputStream(a2), this.f52567c), a3, a4);
        }
    }

    public JsonWebSignature(Header header, JsonWebToken.Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload);
        this.f52563c = (byte[]) Preconditions.m72716d(bArr);
        this.f52564d = (byte[]) Preconditions.m72716d(bArr2);
    }

    /* renamed from: b */
    public static JsonWebSignature m72350b(JsonFactory jsonFactory, String str) throws IOException {
        return m72351c(jsonFactory).mo60555a(str);
    }

    /* renamed from: c */
    public static Parser m72351c(JsonFactory jsonFactory) {
        return new Parser(jsonFactory);
    }

    /* renamed from: d */
    public static String m72352d(PrivateKey privateKey, JsonFactory jsonFactory, Header header, JsonWebToken.Payload payload) throws GeneralSecurityException, IOException {
        String valueOf = String.valueOf(Base64.m72636c(jsonFactory.mo60522g(header)));
        String valueOf2 = String.valueOf(Base64.m72636c(jsonFactory.mo60522g(payload)));
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        String sb2 = sb.toString();
        byte[] c = SecurityUtils.m72723c(SecurityUtils.m72722b(), privateKey, StringUtils.m72727a(sb2));
        String valueOf3 = String.valueOf(sb2);
        String valueOf4 = String.valueOf(Base64.m72636c(c));
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 1 + valueOf4.length());
        sb3.append(valueOf3);
        sb3.append(".");
        sb3.append(valueOf4);
        return sb3.toString();
    }
}
