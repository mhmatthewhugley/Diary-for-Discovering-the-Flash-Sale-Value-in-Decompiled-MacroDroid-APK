package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Key;

@Beta
public class GoogleIdToken extends IdToken {

    @Beta
    public static class Payload extends IdToken.Payload {
        @Key("email")
        private String email;
        @Key("email_verified")
        private Object emailVerified;
        @Key("hd")
        private String hostedDomain;

        /* renamed from: B */
        public Payload mo60162t() {
            return (Payload) super.mo60155k();
        }

        /* renamed from: C */
        public Payload mo60163u(String str, Object obj) {
            return (Payload) super.mo60156n(str, obj);
        }

        /* renamed from: D */
        public Payload mo60164v(Object obj) {
            return (Payload) super.mo60157o(obj);
        }

        /* renamed from: E */
        public Payload mo60165x(Long l) {
            return (Payload) super.mo60158p(l);
        }

        /* renamed from: G */
        public Payload mo60166y(Long l) {
            return (Payload) super.mo60159q(l);
        }

        /* renamed from: H */
        public Payload mo60167z(String str) {
            return (Payload) super.mo60160r(str);
        }

        /* renamed from: K */
        public Payload mo60161s(String str) {
            return (Payload) super.mo60161s(str);
        }
    }

    /* renamed from: f */
    public Payload mo60153e() {
        return (Payload) super.mo60152a();
    }
}
