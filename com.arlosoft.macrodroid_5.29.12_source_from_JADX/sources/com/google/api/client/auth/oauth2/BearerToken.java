package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BearerToken {

    /* renamed from: a */
    static final Pattern f52173a = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    static final class AuthorizationHeaderAccessMethod implements Credential.AccessMethod {
        AuthorizationHeaderAccessMethod() {
        }

        /* renamed from: a */
        public void mo60089a(HttpRequest httpRequest, String str) throws IOException {
            HttpHeaders e = httpRequest.mo60420e();
            String valueOf = String.valueOf(str);
            e.mo60376B(valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        }

        /* renamed from: b */
        public String mo60090b(HttpRequest httpRequest) {
            List<String> n = httpRequest.mo60420e().mo60393n();
            if (n == null) {
                return null;
            }
            for (String next : n) {
                if (next.startsWith("Bearer ")) {
                    return next.substring(7);
                }
            }
            return null;
        }
    }

    static final class FormEncodedBodyAccessMethod implements Credential.AccessMethod {
        FormEncodedBodyAccessMethod() {
        }

        /* renamed from: c */
        private static Map<String, Object> m71512c(HttpRequest httpRequest) {
            return Data.m72655f(UrlEncodedContent.m72180h(httpRequest).mo60495i());
        }

        /* renamed from: a */
        public void mo60089a(HttpRequest httpRequest, String str) throws IOException {
            Preconditions.m72714b(!"GET".equals(httpRequest.mo60424i()), "HTTP GET method is not supported");
            m71512c(httpRequest).put("access_token", str);
        }

        /* renamed from: b */
        public String mo60090b(HttpRequest httpRequest) {
            Object obj = m71512c(httpRequest).get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    static final class QueryParameterAccessMethod implements Credential.AccessMethod {
        QueryParameterAccessMethod() {
        }

        /* renamed from: a */
        public void mo60089a(HttpRequest httpRequest, String str) throws IOException {
            httpRequest.mo60430o().mo60078d("access_token", str);
        }

        /* renamed from: b */
        public String mo60090b(HttpRequest httpRequest) {
            Object obj = httpRequest.mo60430o().get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    /* renamed from: a */
    public static Credential.AccessMethod m71509a() {
        return new AuthorizationHeaderAccessMethod();
    }
}
