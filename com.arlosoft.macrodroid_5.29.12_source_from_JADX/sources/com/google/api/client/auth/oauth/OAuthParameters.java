package com.google.api.client.auth.oauth;

import androidx.webkit.ProxyConfig;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.util.Beta;
import com.google.api.client.util.escape.PercentEscaper;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

@Beta
public final class OAuthParameters implements HttpExecuteInterceptor, HttpRequestInitializer {

    /* renamed from: l */
    private static final SecureRandom f52159l = new SecureRandom();

    /* renamed from: m */
    private static final PercentEscaper f52160m = new PercentEscaper("-_.~", false);

    /* renamed from: a */
    public OAuthSigner f52161a;

    /* renamed from: b */
    public String f52162b;

    /* renamed from: c */
    public String f52163c;

    /* renamed from: d */
    public String f52164d;

    /* renamed from: e */
    public String f52165e;

    /* renamed from: f */
    public String f52166f;

    /* renamed from: g */
    public String f52167g;

    /* renamed from: h */
    public String f52168h;

    /* renamed from: i */
    public String f52169i;

    /* renamed from: j */
    public String f52170j;

    /* renamed from: k */
    public String f52171k;

    /* renamed from: a */
    private void m71468a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(m71469g(str));
            sb.append("=\"");
            sb.append(m71469g(str2));
            sb.append("\",");
        }
    }

    /* renamed from: g */
    public static String m71469g(String str) {
        return f52160m.mo60789a(str);
    }

    /* renamed from: i */
    private void m71470i(TreeMap<String, String> treeMap, String str, Object obj) {
        treeMap.put(m71469g(str), obj == null ? null : m71469g(obj.toString()));
    }

    /* renamed from: j */
    private void m71471j(TreeMap<String, String> treeMap, String str, String str2) {
        if (str2 != null) {
            m71470i(treeMap, str, str2);
        }
    }

    /* renamed from: b */
    public void mo60066b(HttpRequest httpRequest) throws IOException {
        mo60068d();
        mo60070f();
        try {
            mo60069e(httpRequest.mo60424i(), httpRequest.mo60430o());
            httpRequest.mo60420e().mo60376B(mo60071h());
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) throws IOException {
        httpRequest.mo60436u(this);
    }

    /* renamed from: d */
    public void mo60068d() {
        this.f52164d = Long.toHexString(Math.abs(f52159l.nextLong()));
    }

    /* renamed from: e */
    public void mo60069e(String str, GenericUrl genericUrl) throws GeneralSecurityException {
        OAuthSigner oAuthSigner = this.f52161a;
        String a = oAuthSigner.mo60064a();
        this.f52167g = a;
        TreeMap treeMap = new TreeMap();
        m71471j(treeMap, "oauth_callback", this.f52162b);
        m71471j(treeMap, "oauth_consumer_key", this.f52163c);
        m71471j(treeMap, "oauth_nonce", this.f52164d);
        m71471j(treeMap, "oauth_signature_method", a);
        m71471j(treeMap, "oauth_timestamp", this.f52168h);
        m71471j(treeMap, "oauth_token", this.f52169i);
        m71471j(treeMap, "oauth_verifier", this.f52170j);
        m71471j(treeMap, "oauth_version", this.f52171k);
        for (Map.Entry next : genericUrl.entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String str2 = (String) next.getKey();
                if (value instanceof Collection) {
                    for (Object i : (Collection) value) {
                        m71470i(treeMap, str2, i);
                    }
                } else {
                    m71470i(treeMap, str2, value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append((String) entry.getKey());
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                sb.append('=');
                sb.append(str3);
            }
        }
        String sb2 = sb.toString();
        GenericUrl genericUrl2 = new GenericUrl();
        String s = genericUrl.mo60368s();
        genericUrl2.mo60356A(s);
        genericUrl2.mo60370v(genericUrl.mo60365p());
        genericUrl2.mo60371x(genericUrl.mo60366q());
        int r = genericUrl.mo60367r();
        if (("http".equals(s) && r == 80) || (ProxyConfig.MATCH_HTTPS.equals(s) && r == 443)) {
            r = -1;
        }
        genericUrl2.mo60372y(r);
        String h = genericUrl2.mo60360h();
        this.f52166f = oAuthSigner.mo60065b(m71469g(str) + '&' + m71469g(h) + '&' + m71469g(sb2));
    }

    /* renamed from: f */
    public void mo60070f() {
        this.f52168h = Long.toString(System.currentTimeMillis() / 1000);
    }

    /* renamed from: h */
    public String mo60071h() {
        StringBuilder sb = new StringBuilder("OAuth");
        m71468a(sb, "realm", this.f52165e);
        m71468a(sb, "oauth_callback", this.f52162b);
        m71468a(sb, "oauth_consumer_key", this.f52163c);
        m71468a(sb, "oauth_nonce", this.f52164d);
        m71468a(sb, "oauth_signature", this.f52166f);
        m71468a(sb, "oauth_signature_method", this.f52167g);
        m71468a(sb, "oauth_timestamp", this.f52168h);
        m71468a(sb, "oauth_token", this.f52169i);
        m71468a(sb, "oauth_verifier", this.f52170j);
        m71468a(sb, "oauth_version", this.f52171k);
        return sb.substring(0, sb.length() - 1);
    }
}
