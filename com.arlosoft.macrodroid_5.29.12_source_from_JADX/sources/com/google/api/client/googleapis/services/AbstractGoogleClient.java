package com.google.api.client.googleapis.services;

import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Strings;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class AbstractGoogleClient {

    /* renamed from: j */
    static final Logger f52342j = Logger.getLogger(AbstractGoogleClient.class.getName());

    /* renamed from: a */
    private final HttpRequestFactory f52343a;

    /* renamed from: b */
    private final GoogleClientRequestInitializer f52344b;

    /* renamed from: c */
    private final String f52345c;

    /* renamed from: d */
    private final String f52346d;

    /* renamed from: e */
    private final String f52347e;

    /* renamed from: f */
    private final String f52348f;

    /* renamed from: g */
    private final ObjectParser f52349g;

    /* renamed from: h */
    private final boolean f52350h;

    /* renamed from: i */
    private final boolean f52351i;

    public static abstract class Builder {

        /* renamed from: a */
        final HttpTransport f52352a;

        /* renamed from: b */
        GoogleClientRequestInitializer f52353b;

        /* renamed from: c */
        HttpRequestInitializer f52354c;

        /* renamed from: d */
        final ObjectParser f52355d;

        /* renamed from: e */
        String f52356e;

        /* renamed from: f */
        String f52357f;

        /* renamed from: g */
        String f52358g;

        /* renamed from: h */
        String f52359h;

        /* renamed from: i */
        boolean f52360i;

        /* renamed from: j */
        boolean f52361j;

        protected Builder(HttpTransport httpTransport, String str, String str2, ObjectParser objectParser, HttpRequestInitializer httpRequestInitializer) {
            this.f52352a = (HttpTransport) Preconditions.m72716d(httpTransport);
            this.f52355d = objectParser;
            mo60312c(str);
            mo60313d(str2);
            this.f52354c = httpRequestInitializer;
        }

        /* renamed from: a */
        public Builder mo60310a(String str) {
            this.f52359h = str;
            return this;
        }

        /* renamed from: b */
        public Builder mo60311b(String str) {
            this.f52358g = str;
            return this;
        }

        /* renamed from: c */
        public Builder mo60312c(String str) {
            this.f52356e = AbstractGoogleClient.m71888h(str);
            return this;
        }

        /* renamed from: d */
        public Builder mo60313d(String str) {
            this.f52357f = AbstractGoogleClient.m71889i(str);
            return this;
        }
    }

    protected AbstractGoogleClient(Builder builder) {
        this.f52344b = builder.f52353b;
        this.f52345c = m71888h(builder.f52356e);
        this.f52346d = m71889i(builder.f52357f);
        this.f52347e = builder.f52358g;
        if (Strings.m72728a(builder.f52359h)) {
            f52342j.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f52348f = builder.f52359h;
        HttpRequestInitializer httpRequestInitializer = builder.f52354c;
        this.f52343a = httpRequestInitializer == null ? builder.f52352a.mo60467c() : builder.f52352a.mo60468d(httpRequestInitializer);
        this.f52349g = builder.f52355d;
        this.f52350h = builder.f52360i;
        this.f52351i = builder.f52361j;
    }

    /* renamed from: h */
    static String m71888h(String str) {
        Preconditions.m72717e(str, "root URL cannot be null.");
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* renamed from: i */
    static String m71889i(String str) {
        Preconditions.m72717e(str, "service path cannot be null");
        if (str.length() == 1) {
            Preconditions.m72714b("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            return str.startsWith("/") ? str.substring(1) : str;
        }
    }

    /* renamed from: a */
    public final String mo60303a() {
        return this.f52348f;
    }

    /* renamed from: b */
    public final String mo60304b() {
        String valueOf = String.valueOf(this.f52345c);
        String valueOf2 = String.valueOf(this.f52346d);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: c */
    public final GoogleClientRequestInitializer mo60305c() {
        return this.f52344b;
    }

    /* renamed from: d */
    public ObjectParser mo60306d() {
        return this.f52349g;
    }

    /* renamed from: e */
    public final HttpRequestFactory mo60307e() {
        return this.f52343a;
    }

    /* renamed from: f */
    public final boolean mo60308f() {
        return this.f52351i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo60309g(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        if (mo60305c() != null) {
            mo60305c().mo60322a(abstractGoogleClientRequest);
        }
    }
}
