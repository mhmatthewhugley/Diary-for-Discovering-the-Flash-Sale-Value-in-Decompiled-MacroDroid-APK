package com.google.api.client.json.webtoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;

public class JsonWebToken {

    /* renamed from: a */
    private final Header f52568a;

    /* renamed from: b */
    private final Payload f52569b;

    public static class Header extends GenericJson {
        @Key("cty")
        private String contentType;
        @Key("typ")
        private String type;

        /* renamed from: k */
        public Header mo60137e() {
            return (Header) super.clone();
        }

        /* renamed from: l */
        public Header mo60138f(String str, Object obj) {
            return (Header) super.mo60078d(str, obj);
        }

        /* renamed from: n */
        public Header mo60557n(String str) {
            this.type = str;
            return this;
        }
    }

    public static class Payload extends GenericJson {
        @Key("aud")
        private Object audience;
        @Key("exp")
        private Long expirationTimeSeconds;
        @Key("iat")
        private Long issuedAtTimeSeconds;
        @Key("iss")
        private String issuer;
        @Key("jti")
        private String jwtId;
        @Key("nbf")
        private Long notBeforeTimeSeconds;
        @Key("sub")
        private String subject;
        @Key("typ")
        private String type;

        /* renamed from: k */
        public Payload mo60137e() {
            return (Payload) super.clone();
        }

        /* renamed from: l */
        public final String mo60558l() {
            return this.issuer;
        }

        /* renamed from: n */
        public Payload mo60138f(String str, Object obj) {
            return (Payload) super.mo60078d(str, obj);
        }

        /* renamed from: o */
        public Payload mo60157o(Object obj) {
            this.audience = obj;
            return this;
        }

        /* renamed from: p */
        public Payload mo60158p(Long l) {
            this.expirationTimeSeconds = l;
            return this;
        }

        /* renamed from: q */
        public Payload mo60159q(Long l) {
            this.issuedAtTimeSeconds = l;
            return this;
        }

        /* renamed from: r */
        public Payload mo60160r(String str) {
            this.issuer = str;
            return this;
        }

        /* renamed from: s */
        public Payload mo60161s(String str) {
            this.subject = str;
            return this;
        }
    }

    public JsonWebToken(Header header, Payload payload) {
        this.f52568a = (Header) Preconditions.m72716d(header);
        this.f52569b = (Payload) Preconditions.m72716d(payload);
    }

    /* renamed from: a */
    public Payload mo60152a() {
        return this.f52569b;
    }

    public String toString() {
        return Objects.m72709b(this).mo60778a("header", this.f52568a).mo60778a("payload", this.f52569b).toString();
    }
}
