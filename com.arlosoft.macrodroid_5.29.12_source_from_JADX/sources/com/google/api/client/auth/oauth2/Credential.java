package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Credential implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler {

    /* renamed from: m */
    static final Logger f52176m = Logger.getLogger(Credential.class.getName());

    /* renamed from: a */
    private final Lock f52177a = new ReentrantLock();

    /* renamed from: b */
    private final AccessMethod f52178b;

    /* renamed from: c */
    private final Clock f52179c;

    /* renamed from: d */
    private String f52180d;

    /* renamed from: e */
    private Long f52181e;

    /* renamed from: f */
    private String f52182f;

    /* renamed from: g */
    private final HttpTransport f52183g;

    /* renamed from: h */
    private final HttpExecuteInterceptor f52184h;

    /* renamed from: i */
    private final JsonFactory f52185i;

    /* renamed from: j */
    private final String f52186j;

    /* renamed from: k */
    private final Collection<CredentialRefreshListener> f52187k;

    /* renamed from: l */
    private final HttpRequestInitializer f52188l;

    public interface AccessMethod {
        /* renamed from: a */
        void mo60089a(HttpRequest httpRequest, String str) throws IOException;

        /* renamed from: b */
        String mo60090b(HttpRequest httpRequest);
    }

    public static class Builder {

        /* renamed from: a */
        final AccessMethod f52189a;

        /* renamed from: b */
        HttpTransport f52190b;

        /* renamed from: c */
        JsonFactory f52191c;

        /* renamed from: d */
        GenericUrl f52192d;

        /* renamed from: e */
        Clock f52193e = Clock.f52755a;

        /* renamed from: f */
        HttpExecuteInterceptor f52194f;

        /* renamed from: g */
        HttpRequestInitializer f52195g;

        /* renamed from: h */
        Collection<CredentialRefreshListener> f52196h = Lists.m72701a();

        public Builder(AccessMethod accessMethod) {
            this.f52189a = (AccessMethod) Preconditions.m72716d(accessMethod);
        }

        /* renamed from: a */
        public Builder mo60113a(String str) {
            this.f52192d = str == null ? null : new GenericUrl(str);
            return this;
        }
    }

    protected Credential(Builder builder) {
        this.f52178b = (AccessMethod) Preconditions.m72716d(builder.f52189a);
        this.f52183g = builder.f52190b;
        this.f52185i = builder.f52191c;
        GenericUrl genericUrl = builder.f52192d;
        this.f52186j = genericUrl == null ? null : genericUrl.mo60360h();
        this.f52184h = builder.f52194f;
        this.f52188l = builder.f52195g;
        this.f52187k = Collections.unmodifiableCollection(builder.f52196h);
        this.f52179c = (Clock) Preconditions.m72716d(builder.f52193e);
    }

    /* renamed from: a */
    public boolean mo60096a(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        boolean z3;
        List<String> l = httpResponse.mo60452e().mo60392l();
        boolean z4 = true;
        if (l != null) {
            Iterator<String> it = l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.startsWith("Bearer ")) {
                    z2 = BearerToken.f52173a.matcher(next).find();
                    z3 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z3) {
            z2 = httpResponse.mo60454g() == 401;
        }
        if (z2) {
            try {
                this.f52177a.lock();
                if (Objects.m72708a(this.f52180d, this.f52178b.mo60090b(httpRequest)) && !mo60107n()) {
                    z4 = false;
                }
                this.f52177a.unlock();
                return z4;
            } catch (IOException e) {
                f52176m.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.f52177a.unlock();
                throw th;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo60066b(HttpRequest httpRequest) throws IOException {
        this.f52177a.lock();
        try {
            Long i = mo60102i();
            if (this.f52180d == null || (i != null && i.longValue() <= 60)) {
                mo60107n();
                if (this.f52180d == null) {
                    return;
                }
            }
            this.f52178b.mo60089a(httpRequest, this.f52180d);
            this.f52177a.unlock();
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) throws IOException {
        httpRequest.mo60436u(this);
        httpRequest.mo60441z(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public TokenResponse mo60097d() throws IOException {
        if (this.f52182f == null) {
            return null;
        }
        return new RefreshTokenRequest(this.f52183g, this.f52185i, new GenericUrl(this.f52186j), this.f52182f).mo60123p(this.f52184h).mo60126s(this.f52188l).mo60141e();
    }

    /* renamed from: e */
    public final String mo60098e() {
        this.f52177a.lock();
        try {
            return this.f52180d;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: f */
    public final HttpExecuteInterceptor mo60099f() {
        return this.f52184h;
    }

    /* renamed from: g */
    public final Clock mo60100g() {
        return this.f52179c;
    }

    /* renamed from: h */
    public final Long mo60101h() {
        this.f52177a.lock();
        try {
            return this.f52181e;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: i */
    public final Long mo60102i() {
        Long valueOf;
        this.f52177a.lock();
        try {
            Long l = this.f52181e;
            if (l == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((l.longValue() - this.f52179c.mo60637a()) / 1000);
            }
            return valueOf;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: j */
    public final JsonFactory mo60103j() {
        return this.f52185i;
    }

    /* renamed from: k */
    public final String mo60104k() {
        this.f52177a.lock();
        try {
            return this.f52182f;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: l */
    public final String mo60105l() {
        return this.f52186j;
    }

    /* renamed from: m */
    public final HttpTransport mo60106m() {
        return this.f52183g;
    }

    /* renamed from: n */
    public final boolean mo60107n() throws IOException {
        this.f52177a.lock();
        boolean z = true;
        try {
            TokenResponse d = mo60097d();
            if (d != null) {
                mo60111r(d);
                for (CredentialRefreshListener b : this.f52187k) {
                    b.mo60115b(this, d);
                }
                this.f52177a.unlock();
                return true;
            }
        } catch (TokenResponseException e) {
            if (400 > e.mo60460b() || e.mo60460b() >= 500) {
                z = false;
            }
            if (e.mo60151d() != null && z) {
                mo60108o((String) null);
                mo60110q((Long) null);
            }
            for (CredentialRefreshListener a : this.f52187k) {
                a.mo60114a(this, e.mo60151d());
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.f52177a.unlock();
            throw th;
        }
        this.f52177a.unlock();
        return false;
    }

    /* renamed from: o */
    public Credential mo60108o(String str) {
        this.f52177a.lock();
        try {
            this.f52180d = str;
            return this;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: p */
    public Credential mo60109p(Long l) {
        this.f52177a.lock();
        try {
            this.f52181e = l;
            return this;
        } finally {
            this.f52177a.unlock();
        }
    }

    /* renamed from: q */
    public Credential mo60110q(Long l) {
        return mo60109p(l == null ? null : Long.valueOf(this.f52179c.mo60637a() + (l.longValue() * 1000)));
    }

    /* renamed from: r */
    public Credential mo60111r(TokenResponse tokenResponse) {
        mo60108o(tokenResponse.mo60146l());
        if (tokenResponse.mo60148o() != null) {
            mo60112s(tokenResponse.mo60148o());
        }
        mo60110q(tokenResponse.mo60147n());
        return this;
    }

    /* renamed from: s */
    public Credential mo60112s(String str) {
        this.f52177a.lock();
        if (str != null) {
            try {
                Preconditions.m72714b((this.f52185i == null || this.f52183g == null || this.f52184h == null || this.f52186j == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f52177a.unlock();
                throw th;
            }
        }
        this.f52182f = str;
        this.f52177a.unlock();
        return this;
    }
}
