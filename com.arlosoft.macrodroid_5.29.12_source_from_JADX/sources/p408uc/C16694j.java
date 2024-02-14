package p408uc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15989v;
import okhttp3.C15993w;
import okhttp3.C16002z;
import okhttp3.internal.connection.C15938c;
import okhttp3.internal.connection.C15942e;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001e"}, mo71668d2 = {"Luc/j;", "Lokhttp3/w;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/b0;", "userRequest", "", "requestSendStarted", "d", "c", "Lokhttp3/d0;", "userResponse", "Lokhttp3/internal/connection/c;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lokhttp3/w$a;", "chain", "intercept", "Lokhttp3/z;", "client", "<init>", "(Lokhttp3/z;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.j */
/* compiled from: RetryAndFollowUpInterceptor.kt */
public final class C16694j implements C15993w {

    /* renamed from: b */
    public static final C16695a f67594b = new C16695a((C13695i) null);

    /* renamed from: a */
    private final C16002z f67595a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Luc/j$a;", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: uc.j$a */
    /* compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class C16695a {
        private C16695a() {
        }

        public /* synthetic */ C16695a(C13695i iVar) {
            this();
        }
    }

    public C16694j(C16002z zVar) {
        C13706o.m87929f(zVar, "client");
        this.f67595a = zVar;
    }

    /* renamed from: a */
    private final C15904b0 m99174a(C15915d0 d0Var, String str) {
        String o;
        C15989v q;
        C15907c0 c0Var = null;
        if (!this.f67595a.mo76351r() || (o = C15915d0.m95985o(d0Var, "Location", (String) null, 2, (Object) null)) == null || (q = d0Var.mo75984y().mo75920j().mo76277q(o)) == null) {
            return null;
        }
        if (!C13706o.m87924a(q.mo76278r(), d0Var.mo75984y().mo75920j().mo76278r()) && !this.f67595a.mo76352s()) {
            return null;
        }
        C15904b0.C15905a h = d0Var.mo75984y().mo75918h();
        if (C16690f.m99155a(str)) {
            int g = d0Var.mo75971g();
            C16690f fVar = C16690f.f67580a;
            boolean z = fVar.mo79593c(str) || g == 308 || g == 307;
            if (!fVar.mo79592b(str) || g == 308 || g == 307) {
                if (z) {
                    c0Var = d0Var.mo75984y().mo75911a();
                }
                h.mo75929h(str, c0Var);
            } else {
                h.mo75929h("GET", (C15907c0) null);
            }
            if (!z) {
                h.mo75933l(HTTP.TRANSFER_ENCODING);
                h.mo75933l("Content-Length");
                h.mo75933l("Content-Type");
            }
        }
        if (!C16279b.m97653g(d0Var.mo75984y().mo75920j(), q)) {
            h.mo75933l(AUTH.WWW_AUTH_RESP);
        }
        return h.mo75936o(q).mo75923b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.mo76076h();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.C15904b0 m99175b(okhttp3.C15915d0 r6, okhttp3.internal.connection.C15938c r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            okhttp3.internal.connection.f r1 = r7.mo76076h()
            if (r1 == 0) goto L_0x000e
            okhttp3.f0 r1 = r1.mo76121A()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.mo75971g()
            okhttp3.b0 r3 = r6.mo75984y()
            java.lang.String r3 = r3.mo75917g()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00ad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0091
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            okhttp3.z r1 = r5.f67595a
            boolean r1 = r1.mo76335E()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            okhttp3.b0 r1 = r6.mo75984y()
            okhttp3.c0 r1 = r1.mo75911a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.mo75940g()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            okhttp3.d0 r1 = r6.mo75981v()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.mo75971g()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.m99179f(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            okhttp3.b0 r6 = r6.mo75984y()
            return r6
        L_0x006f:
            kotlin.jvm.internal.C13706o.m87926c(r1)
            java.net.Proxy r7 = r1.mo76026b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0089
            okhttp3.z r7 = r5.f67595a
            okhttp3.b r7 = r7.mo76332B()
            okhttp3.b0 r6 = r7.mo25163a(r1, r6)
            return r6
        L_0x0089:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            okhttp3.d0 r1 = r6.mo75981v()
            if (r1 == 0) goto L_0x009e
            int r1 = r1.mo75971g()
            if (r1 != r7) goto L_0x009e
            return r0
        L_0x009e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.m99179f(r6, r7)
            if (r7 != 0) goto L_0x00ac
            okhttp3.b0 r6 = r6.mo75984y()
            return r6
        L_0x00ac:
            return r0
        L_0x00ad:
            okhttp3.b0 r1 = r6.mo75984y()
            okhttp3.c0 r1 = r1.mo75911a()
            if (r1 == 0) goto L_0x00be
            boolean r1 = r1.mo75940g()
            if (r1 == 0) goto L_0x00be
            return r0
        L_0x00be:
            if (r7 == 0) goto L_0x00d3
            boolean r1 = r7.mo76079k()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            okhttp3.internal.connection.f r7 = r7.mo76076h()
            r7.mo76143y()
            okhttp3.b0 r6 = r6.mo75984y()
            return r6
        L_0x00d3:
            return r0
        L_0x00d4:
            okhttp3.z r7 = r5.f67595a
            okhttp3.b r7 = r7.mo76340d()
            okhttp3.b0 r6 = r7.mo25163a(r1, r6)
            return r6
        L_0x00df:
            okhttp3.b0 r6 = r5.m99174a(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p408uc.C16694j.m99175b(okhttp3.d0, okhttp3.internal.connection.c):okhttp3.b0");
    }

    /* renamed from: c */
    private final boolean m99176c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m99177d(IOException iOException, C15942e eVar, C15904b0 b0Var, boolean z) {
        if (!this.f67595a.mo76335E()) {
            return false;
        }
        if ((!z || !m99178e(iOException, b0Var)) && m99176c(iOException, z) && eVar.mo76113z()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m99178e(IOException iOException, C15904b0 b0Var) {
        C15907c0 a = b0Var.mo75911a();
        return (a != null && a.mo75940g()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    private final int m99179f(C15915d0 d0Var, int i) {
        String o = C15915d0.m95985o(d0Var, "Retry-After", (String) null, 2, (Object) null);
        if (o == null) {
            return i;
        }
        if (!new C15159j("\\d+").mo74468c(o)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(o);
        C13706o.m87928e(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        C13706o.m87929f(aVar, "chain");
        C16691g gVar = (C16691g) aVar;
        C15904b0 i = gVar.mo79599i();
        C15942e e = gVar.mo79595e();
        List j = C13614t.m87748j();
        C15915d0 d0Var = null;
        boolean z = true;
        int i2 = 0;
        while (true) {
            e.mo76099h(i, z);
            try {
                if (!e.mo76003I()) {
                    C15915d0 a = gVar.mo76309a(i);
                    if (d0Var != null) {
                        a = a.mo75980u().mo75998o(d0Var.mo75980u().mo75987b((C15919e0) null).mo75988c()).mo75988c();
                    }
                    d0Var = a;
                    C15938c q = e.mo76105q();
                    C15904b0 b = m99175b(d0Var, q);
                    if (b == null) {
                        if (q != null && q.mo76080l()) {
                            e.mo76095B();
                        }
                        e.mo76100k(false);
                        return d0Var;
                    }
                    C15907c0 a2 = b.mo75911a();
                    if (a2 == null || !a2.mo75940g()) {
                        C15919e0 b2 = d0Var.mo75966b();
                        if (b2 != null) {
                            C16279b.m97656j(b2);
                        }
                        i2++;
                        if (i2 <= 20) {
                            e.mo76100k(true);
                            i = b;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i2);
                        }
                    } else {
                        e.mo76100k(false);
                        return d0Var;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (RouteException e2) {
                if (m99177d(e2.mo76066c(), e, i, false)) {
                    j = C13566b0.m87443r0(j, e2.mo76065b());
                    e.mo76100k(true);
                    z = false;
                } else {
                    throw C16279b.m97645U(e2.mo76065b(), j);
                }
            } catch (IOException e3) {
                if (m99177d(e3, e, i, !(e3 instanceof ConnectionShutdownException))) {
                    j = C13566b0.m87443r0(j, e3);
                    e.mo76100k(true);
                    z = false;
                } else {
                    throw C16279b.m97645U(e3, j);
                }
            } catch (Throwable th) {
                e.mo76100k(true);
                throw th;
            }
        }
    }
}
