package com.google.api.client.googleapis.media;

import androidx.webkit.ProxyConfig;
import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;

public final class MediaHttpUploader {

    /* renamed from: a */
    private UploadState f52300a;

    /* renamed from: b */
    private final AbstractInputStreamContent f52301b;

    /* renamed from: c */
    private final HttpRequestFactory f52302c;

    /* renamed from: d */
    private HttpContent f52303d;

    /* renamed from: e */
    private long f52304e;

    /* renamed from: f */
    private boolean f52305f;

    /* renamed from: g */
    private String f52306g;

    /* renamed from: h */
    private HttpHeaders f52307h;

    /* renamed from: i */
    private HttpRequest f52308i;

    /* renamed from: j */
    private InputStream f52309j;

    /* renamed from: k */
    private boolean f52310k;

    /* renamed from: l */
    private MediaHttpUploaderProgressListener f52311l;

    /* renamed from: m */
    String f52312m;

    /* renamed from: n */
    private long f52313n;

    /* renamed from: o */
    private int f52314o;

    /* renamed from: p */
    private Byte f52315p;

    /* renamed from: q */
    private long f52316q;

    /* renamed from: r */
    private int f52317r;

    /* renamed from: s */
    private byte[] f52318s;

    /* renamed from: t */
    private boolean f52319t;

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    /* renamed from: a */
    private HttpResponse m71866a(GenericUrl genericUrl) throws IOException {
        m71875m(UploadState.MEDIA_IN_PROGRESS);
        HttpContent httpContent = this.f52301b;
        if (this.f52303d != null) {
            httpContent = new MultipartContent().mo60486i(Arrays.asList(new HttpContent[]{this.f52303d, this.f52301b}));
            genericUrl.put("uploadType", "multipart");
        } else {
            genericUrl.put("uploadType", "media");
        }
        HttpRequest d = this.f52302c.mo60447d(this.f52306g, genericUrl, httpContent);
        d.mo60420e().putAll(this.f52307h);
        HttpResponse b = m71867b(d);
        try {
            if (m71872g()) {
                this.f52313n = m71870e();
            }
            m71875m(UploadState.MEDIA_COMPLETE);
            return b;
        } catch (Throwable th) {
            b.mo60448a();
            throw th;
        }
    }

    /* renamed from: b */
    private HttpResponse m71867b(HttpRequest httpRequest) throws IOException {
        if (!this.f52319t && !(httpRequest.mo60417b() instanceof EmptyContent)) {
            httpRequest.mo60434s(new GZipEncoding());
        }
        return m71868c(httpRequest);
    }

    /* renamed from: c */
    private HttpResponse m71868c(HttpRequest httpRequest) throws IOException {
        new MethodOverride().mo60066b(httpRequest);
        httpRequest.mo60440y(false);
        return httpRequest.mo60416a();
    }

    /* renamed from: d */
    private HttpResponse m71869d(GenericUrl genericUrl) throws IOException {
        m71875m(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resumable");
        HttpContent httpContent = this.f52303d;
        if (httpContent == null) {
            httpContent = new EmptyContent();
        }
        HttpRequest d = this.f52302c.mo60447d(this.f52306g, genericUrl, httpContent);
        this.f52307h.mo60078d("X-Upload-Content-Type", this.f52301b.getType());
        if (m71872g()) {
            this.f52307h.mo60078d("X-Upload-Content-Length", Long.valueOf(m71870e()));
        }
        d.mo60420e().putAll(this.f52307h);
        HttpResponse b = m71867b(d);
        try {
            m71875m(UploadState.INITIATION_COMPLETE);
            return b;
        } catch (Throwable th) {
            b.mo60448a();
            throw th;
        }
    }

    /* renamed from: e */
    private long m71870e() throws IOException {
        if (!this.f52305f) {
            this.f52304e = this.f52301b.mo60339b();
            this.f52305f = true;
        }
        return this.f52304e;
    }

    /* renamed from: f */
    private long m71871f(String str) {
        if (str == null) {
            return 0;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    /* renamed from: g */
    private boolean m71872g() throws IOException {
        return m71870e() >= 0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private HttpResponse m71873h(GenericUrl genericUrl) throws IOException {
        HttpResponse httpResponse;
        HttpResponse d = m71869d(genericUrl);
        if (!d.mo60457k()) {
            return d;
        }
        try {
            GenericUrl genericUrl2 = new GenericUrl(d.mo60452e().mo60395q());
            d.mo60448a();
            InputStream d2 = this.f52301b.mo60345d();
            this.f52309j = d2;
            if (!d2.markSupported() && m71872g()) {
                this.f52309j = new BufferedInputStream(this.f52309j);
            }
            while (true) {
                this.f52308i = this.f52302c.mo60446c(genericUrl2, (HttpContent) null);
                m71874j();
                new MediaUploadErrorHandler(this, this.f52308i);
                if (m71872g()) {
                    httpResponse = m71868c(this.f52308i);
                } else {
                    httpResponse = m71867b(this.f52308i);
                }
                try {
                    if (httpResponse.mo60457k()) {
                        this.f52313n = m71870e();
                        if (this.f52301b.mo60344c()) {
                            this.f52309j.close();
                        }
                        m71875m(UploadState.MEDIA_COMPLETE);
                        return httpResponse;
                    } else if (httpResponse.mo60454g() != 308) {
                        return httpResponse;
                    } else {
                        String q = httpResponse.mo60452e().mo60395q();
                        if (q != null) {
                            genericUrl2 = new GenericUrl(q);
                        }
                        long f = m71871f(httpResponse.mo60452e().mo60396r());
                        long j = f - this.f52313n;
                        boolean z = true;
                        Preconditions.m72719g(j >= 0 && j <= ((long) this.f52317r));
                        long j2 = ((long) this.f52317r) - j;
                        if (m71872g()) {
                            if (j2 > 0) {
                                this.f52309j.reset();
                                if (j != this.f52309j.skip(j)) {
                                    z = false;
                                }
                                Preconditions.m72719g(z);
                            }
                        } else if (j2 == 0) {
                            this.f52318s = null;
                        }
                        this.f52313n = f;
                        m71875m(UploadState.MEDIA_IN_PROGRESS);
                    }
                } finally {
                    httpResponse.mo60448a();
                }
            }
        } catch (Throwable th) {
            d.mo60448a();
            throw th;
        }
    }

    /* renamed from: j */
    private void m71874j() throws IOException {
        int i;
        HttpContent httpContent;
        int i2;
        int i3;
        if (m71872g()) {
            i = (int) Math.min((long) this.f52314o, m71870e() - this.f52313n);
        } else {
            i = this.f52314o;
        }
        if (m71872g()) {
            this.f52309j.mark(i);
            long j = (long) i;
            httpContent = new InputStreamContent(this.f52301b.getType(), ByteStreams.m72638b(this.f52309j, j)).mo60472i(true).mo60471h(j).mo60470g(false);
            this.f52312m = String.valueOf(m71870e());
        } else {
            byte[] bArr = this.f52318s;
            if (bArr == null) {
                Byte b = this.f52315p;
                i3 = b == null ? i + 1 : i;
                byte[] bArr2 = new byte[(i + 1)];
                this.f52318s = bArr2;
                if (b != null) {
                    bArr2[0] = b.byteValue();
                }
                i2 = 0;
            } else {
                i2 = (int) (this.f52316q - this.f52313n);
                System.arraycopy(bArr, this.f52317r - i2, bArr, 0, i2);
                Byte b2 = this.f52315p;
                if (b2 != null) {
                    this.f52318s[i2] = b2.byteValue();
                }
                i3 = i - i2;
            }
            int c = ByteStreams.m72639c(this.f52309j, this.f52318s, (i + 1) - i3, i3);
            if (c < i3) {
                int max = i2 + Math.max(0, c);
                if (this.f52315p != null) {
                    max++;
                    this.f52315p = null;
                }
                if (this.f52312m.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    this.f52312m = String.valueOf(this.f52313n + ((long) max));
                }
                i = max;
            } else {
                this.f52315p = Byte.valueOf(this.f52318s[i]);
            }
            httpContent = new ByteArrayContent(this.f52301b.getType(), this.f52318s, 0, i);
            this.f52316q = this.f52313n + ((long) i);
        }
        this.f52317r = i;
        this.f52308i.mo60433r(httpContent);
        if (i == 0) {
            HttpHeaders e = this.f52308i.mo60420e();
            String valueOf = String.valueOf(this.f52312m);
            e.mo60381H(valueOf.length() != 0 ? "bytes */".concat(valueOf) : new String("bytes */"));
            return;
        }
        HttpHeaders e2 = this.f52308i.mo60420e();
        long j2 = this.f52313n;
        String valueOf2 = String.valueOf(this.f52312m);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 48);
        sb.append("bytes ");
        sb.append(j2);
        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append((((long) i) + j2) - 1);
        sb.append("/");
        sb.append(valueOf2);
        e2.mo60381H(sb.toString());
    }

    /* renamed from: m */
    private void m71875m(UploadState uploadState) throws IOException {
        this.f52300a = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.f52311l;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.mo60291a(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Beta
    /* renamed from: i */
    public void mo60287i() throws IOException {
        Preconditions.m72717e(this.f52308i, "The current request should not be null");
        this.f52308i.mo60433r(new EmptyContent());
        HttpHeaders e = this.f52308i.mo60420e();
        String valueOf = String.valueOf(this.f52312m);
        e.mo60381H(valueOf.length() != 0 ? "bytes */".concat(valueOf) : new String("bytes */"));
    }

    /* renamed from: k */
    public MediaHttpUploader mo60288k(boolean z) {
        this.f52319t = z;
        return this;
    }

    /* renamed from: l */
    public MediaHttpUploader mo60289l(HttpHeaders httpHeaders) {
        this.f52307h = httpHeaders;
        return this;
    }

    /* renamed from: n */
    public HttpResponse mo60290n(GenericUrl genericUrl) throws IOException {
        Preconditions.m72713a(this.f52300a == UploadState.NOT_STARTED);
        if (this.f52310k) {
            return m71866a(genericUrl);
        }
        return m71873h(genericUrl);
    }
}
