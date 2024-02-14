package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Key;

@Beta
public final class ClientLogin {

    /* renamed from: a */
    public GenericUrl f52235a = new GenericUrl("https://www.google.com");
    @Key
    public String accountType;
    @Key("source")
    public String applicationName;
    @Key("service")
    public String authTokenType;
    @Key("logincaptcha")
    public String captchaAnswer;
    @Key("logintoken")
    public String captchaToken;
    @Key("Passwd")
    public String password;
    @Key("Email")
    public String username;

    public static final class ErrorInfo {
        @Key("CaptchaToken")
        public String captchaToken;
        @Key("CaptchaUrl")
        public String captchaUrl;
        @Key("Error")
        public String error;
        @Key("Url")
        public String url;
    }

    public static final class Response implements HttpExecuteInterceptor, HttpRequestInitializer {
        @Key("Auth")
        public String auth;

        /* renamed from: a */
        public String mo60215a() {
            return ClientLogin.m71692a(this.auth);
        }

        /* renamed from: b */
        public void mo60066b(HttpRequest httpRequest) {
            httpRequest.mo60420e().mo60376B(mo60215a());
        }

        /* renamed from: c */
        public void mo60067c(HttpRequest httpRequest) {
            httpRequest.mo60436u(this);
        }
    }

    /* renamed from: a */
    public static String m71692a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "GoogleLogin auth=".concat(valueOf) : new String("GoogleLogin auth=");
    }
}
