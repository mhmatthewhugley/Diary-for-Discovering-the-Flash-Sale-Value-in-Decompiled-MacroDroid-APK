package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Key;
import java.util.List;

@Beta
public class IdToken extends JsonWebSignature {

    @Beta
    public static class Payload extends JsonWebToken.Payload {
        @Key("at_hash")
        private String accessTokenHash;
        @Key("auth_time")
        private Long authorizationTimeSeconds;
        @Key("azp")
        private String authorizedParty;
        @Key("acr")
        private String classReference;
        @Key("amr")
        private List<String> methodsReferences;
        @Key
        private String nonce;

        /* renamed from: A */
        public Payload mo60161s(String str) {
            return (Payload) super.mo60161s(str);
        }

        /* renamed from: t */
        public Payload mo60155k() {
            return (Payload) super.mo60137e();
        }

        /* renamed from: u */
        public Payload mo60156n(String str, Object obj) {
            return (Payload) super.mo60138f(str, obj);
        }

        /* renamed from: v */
        public Payload mo60157o(Object obj) {
            return (Payload) super.mo60157o(obj);
        }

        /* renamed from: x */
        public Payload mo60158p(Long l) {
            return (Payload) super.mo60158p(l);
        }

        /* renamed from: y */
        public Payload mo60159q(Long l) {
            return (Payload) super.mo60159q(l);
        }

        /* renamed from: z */
        public Payload mo60160r(String str) {
            return (Payload) super.mo60160r(str);
        }
    }

    /* renamed from: e */
    public Payload mo60152a() {
        return (Payload) super.mo60152a();
    }
}
