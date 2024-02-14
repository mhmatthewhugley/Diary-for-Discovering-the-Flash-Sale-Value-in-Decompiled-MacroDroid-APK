package com.google.api.client.http;

import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.LoggingInputStream;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.methods.HttpHead;

public final class HttpResponse {

    /* renamed from: a */
    private InputStream f52463a;

    /* renamed from: b */
    private final String f52464b;

    /* renamed from: c */
    private final String f52465c;

    /* renamed from: d */
    private final HttpMediaType f52466d;

    /* renamed from: e */
    LowLevelHttpResponse f52467e;

    /* renamed from: f */
    private final int f52468f;

    /* renamed from: g */
    private final String f52469g;

    /* renamed from: h */
    private final HttpRequest f52470h;

    /* renamed from: i */
    private int f52471i;

    /* renamed from: j */
    private boolean f52472j;

    /* renamed from: k */
    private boolean f52473k;

    HttpResponse(HttpRequest httpRequest, LowLevelHttpResponse lowLevelHttpResponse) throws IOException {
        StringBuilder sb;
        this.f52470h = httpRequest;
        this.f52471i = httpRequest.mo60418c();
        this.f52472j = httpRequest.mo60432q();
        this.f52467e = lowLevelHttpResponse;
        this.f52464b = lowLevelHttpResponse.mo60258c();
        int i = lowLevelHttpResponse.mo60264i();
        boolean z = false;
        i = i < 0 ? 0 : i;
        this.f52468f = i;
        String h = lowLevelHttpResponse.mo60263h();
        this.f52469g = h;
        Logger logger = HttpTransport.f52480a;
        if (this.f52472j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        HttpMediaType httpMediaType = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            String str = StringUtils.f52835a;
            sb.append(str);
            String j = lowLevelHttpResponse.mo60265j();
            if (j != null) {
                sb.append(j);
            } else {
                sb.append(i);
                if (h != null) {
                    sb.append(' ');
                    sb.append(h);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        httpRequest.mo60425j().mo60391h(lowLevelHttpResponse, z ? sb : null);
        String d = lowLevelHttpResponse.mo60259d();
        d = d == null ? httpRequest.mo60425j().mo60394o() : d;
        this.f52465c = d;
        this.f52466d = d != null ? new HttpMediaType(d) : httpMediaType;
        if (z) {
            logger.config(sb.toString());
        }
    }

    /* renamed from: i */
    private boolean m72103i() throws IOException {
        int g = mo60454g();
        if (!mo60453f().mo60424i().equals(HttpHead.METHOD_NAME) && g / 100 != 1 && g != 204 && g != 304) {
            return true;
        }
        mo60456j();
        return false;
    }

    /* renamed from: a */
    public void mo60448a() throws IOException {
        mo60456j();
        this.f52467e.mo60483a();
    }

    /* renamed from: b */
    public InputStream mo60449b() throws IOException {
        if (!this.f52473k) {
            LoggingInputStream b = this.f52467e.mo60257b();
            if (b != null) {
                try {
                    String str = this.f52464b;
                    if (str != null && str.contains("gzip")) {
                        b = new GZIPInputStream(b);
                    }
                    Logger logger = HttpTransport.f52480a;
                    if (this.f52472j) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            b = new LoggingInputStream(b, logger, level, this.f52471i);
                        }
                    }
                    this.f52463a = b;
                } catch (EOFException unused) {
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            }
            this.f52473k = true;
        }
        return this.f52463a;
    }

    /* renamed from: c */
    public Charset mo60450c() {
        HttpMediaType httpMediaType = this.f52466d;
        return (httpMediaType == null || httpMediaType.mo60403e() == null) ? Charsets.f52747b : this.f52466d.mo60403e();
    }

    /* renamed from: d */
    public String mo60451d() {
        return this.f52465c;
    }

    /* renamed from: e */
    public HttpHeaders mo60452e() {
        return this.f52470h.mo60425j();
    }

    /* renamed from: f */
    public HttpRequest mo60453f() {
        return this.f52470h;
    }

    /* renamed from: g */
    public int mo60454g() {
        return this.f52468f;
    }

    /* renamed from: h */
    public String mo60455h() {
        return this.f52469g;
    }

    /* renamed from: j */
    public void mo60456j() throws IOException {
        InputStream b = mo60449b();
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: k */
    public boolean mo60457k() {
        return HttpStatusCodes.m72125b(this.f52468f);
    }

    /* renamed from: l */
    public <T> T mo60458l(Class<T> cls) throws IOException {
        if (!m72103i()) {
            return null;
        }
        return this.f52470h.mo60423h().mo60213a(mo60449b(), mo60450c(), cls);
    }

    /* renamed from: m */
    public String mo60459m() throws IOException {
        InputStream b = mo60449b();
        if (b == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.m72693b(b, byteArrayOutputStream);
        return byteArrayOutputStream.toString(mo60450c().name());
    }
}
