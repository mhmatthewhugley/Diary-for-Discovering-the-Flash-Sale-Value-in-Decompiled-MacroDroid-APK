package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;

public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;

    /* renamed from: a */
    private final transient HttpHeaders f52474a;
    private final String content;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(HttpResponse httpResponse) {
        this(new Builder(httpResponse));
    }

    /* renamed from: a */
    public static StringBuilder m72116a(HttpResponse httpResponse) {
        StringBuilder sb = new StringBuilder();
        int g = httpResponse.mo60454g();
        if (g != 0) {
            sb.append(g);
        }
        String h = httpResponse.mo60455h();
        if (h != null) {
            if (g != 0) {
                sb.append(' ');
            }
            sb.append(h);
        }
        return sb;
    }

    /* renamed from: b */
    public final int mo60460b() {
        return this.statusCode;
    }

    protected HttpResponseException(Builder builder) {
        super(builder.f52479e);
        this.statusCode = builder.f52475a;
        this.statusMessage = builder.f52476b;
        this.f52474a = builder.f52477c;
        this.content = builder.f52478d;
    }

    public static class Builder {

        /* renamed from: a */
        int f52475a;

        /* renamed from: b */
        String f52476b;

        /* renamed from: c */
        HttpHeaders f52477c;

        /* renamed from: d */
        String f52478d;

        /* renamed from: e */
        String f52479e;

        public Builder(int i, String str, HttpHeaders httpHeaders) {
            mo60464d(i);
            mo60465e(str);
            mo60462b(httpHeaders);
        }

        /* renamed from: a */
        public Builder mo60461a(String str) {
            this.f52478d = str;
            return this;
        }

        /* renamed from: b */
        public Builder mo60462b(HttpHeaders httpHeaders) {
            this.f52477c = (HttpHeaders) Preconditions.m72716d(httpHeaders);
            return this;
        }

        /* renamed from: c */
        public Builder mo60463c(String str) {
            this.f52479e = str;
            return this;
        }

        /* renamed from: d */
        public Builder mo60464d(int i) {
            Preconditions.m72713a(i >= 0);
            this.f52475a = i;
            return this;
        }

        /* renamed from: e */
        public Builder mo60465e(String str) {
            this.f52476b = str;
            return this;
        }

        public Builder(HttpResponse httpResponse) {
            this(httpResponse.mo60454g(), httpResponse.mo60455h(), httpResponse.mo60452e());
            try {
                String m = httpResponse.mo60459m();
                this.f52478d = m;
                if (m.length() == 0) {
                    this.f52478d = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            StringBuilder a = HttpResponseException.m72116a(httpResponse);
            if (this.f52478d != null) {
                a.append(StringUtils.f52835a);
                a.append(this.f52478d);
            }
            this.f52479e = a.toString();
        }
    }
}
