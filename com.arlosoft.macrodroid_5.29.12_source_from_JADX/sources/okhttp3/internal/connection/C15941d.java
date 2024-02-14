package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15898a;
import okhttp3.C15924f0;
import okhttp3.C15975r;
import okhttp3.C15989v;
import okhttp3.C16002z;
import okhttp3.internal.connection.C15955j;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p372qc.C16279b;
import p408uc.C16688d;
import p408uc.C16691g;
import p426wc.C16794a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010/\u001a\u00020,8\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b$\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, mo71668d2 = {"Lokhttp3/internal/connection/d;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/f;", "c", "b", "Lokhttp3/f0;", "f", "Lokhttp3/z;", "client", "Luc/g;", "chain", "Luc/d;", "a", "Ljava/io/IOException;", "e", "Lja/u;", "h", "Lokhttp3/v;", "url", "g", "Lokhttp3/internal/connection/j$b;", "Lokhttp3/internal/connection/j$b;", "routeSelection", "Lokhttp3/internal/connection/j;", "Lokhttp3/internal/connection/j;", "routeSelector", "I", "refusedStreamCount", "d", "connectionShutdownCount", "otherFailureCount", "Lokhttp3/f0;", "nextRouteToTry", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/a;", "Lokhttp3/a;", "()Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "i", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "j", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/a;Lokhttp3/internal/connection/e;Lokhttp3/r;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.d */
/* compiled from: ExchangeFinder.kt */
public final class C15941d {

    /* renamed from: a */
    private C15955j.C15957b f65656a;

    /* renamed from: b */
    private C15955j f65657b;

    /* renamed from: c */
    private int f65658c;

    /* renamed from: d */
    private int f65659d;

    /* renamed from: e */
    private int f65660e;

    /* renamed from: f */
    private C15924f0 f65661f;

    /* renamed from: g */
    private final C15951h f65662g;

    /* renamed from: h */
    private final C15898a f65663h;

    /* renamed from: i */
    private final C15942e f65664i;

    /* renamed from: j */
    private final C15975r f65665j;

    public C15941d(C15951h hVar, C15898a aVar, C15942e eVar, C15975r rVar) {
        C13706o.m87929f(hVar, "connectionPool");
        C13706o.m87929f(aVar, "address");
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(rVar, "eventListener");
        this.f65662g = hVar;
        this.f65663h = aVar;
        this.f65664i = eVar;
        this.f65665j = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.C15946f m96098b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.e r0 = r1.f65664i
            boolean r0 = r0.mo76003I()
            if (r0 != 0) goto L_0x0178
            okhttp3.internal.connection.e r0 = r1.f65664i
            okhttp3.internal.connection.f r2 = r0.mo76102n()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0064
            monitor-enter(r2)
            boolean r5 = r2.mo76134q()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0030
            okhttp3.f0 r5 = r2.mo76121A()     // Catch:{ all -> 0x0061 }
            okhttp3.a r5 = r5.mo76025a()     // Catch:{ all -> 0x0061 }
            okhttp3.v r5 = r5.mo75907l()     // Catch:{ all -> 0x0061 }
            boolean r5 = r14.mo76092g(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            okhttp3.internal.connection.e r5 = r1.f65664i     // Catch:{ all -> 0x0061 }
            java.net.Socket r5 = r5.mo76112y()     // Catch:{ all -> 0x0061 }
        L_0x0036:
            ja.u r6 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)
            okhttp3.internal.connection.e r6 = r1.f65664i
            okhttp3.internal.connection.f r6 = r6.mo76102n()
            if (r6 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            p372qc.C16279b.m97657k(r5)
        L_0x0059:
            okhttp3.r r5 = r1.f65665j
            okhttp3.internal.connection.e r6 = r1.f65664i
            r5.mo76211k(r6, r2)
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0064:
            r1.f65658c = r3
            r1.f65659d = r3
            r1.f65660e = r3
            okhttp3.internal.connection.h r2 = r1.f65662g
            okhttp3.a r5 = r1.f65663h
            okhttp3.internal.connection.e r6 = r1.f65664i
            boolean r2 = r2.mo76147a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0087
            okhttp3.internal.connection.e r0 = r1.f65664i
            okhttp3.internal.connection.f r0 = r0.mo76102n()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            okhttp3.r r2 = r1.f65665j
            okhttp3.internal.connection.e r3 = r1.f65664i
            r2.mo76210j(r3, r0)
            return r0
        L_0x0087:
            okhttp3.f0 r2 = r1.f65661f
            if (r2 == 0) goto L_0x0092
            kotlin.jvm.internal.C13706o.m87926c(r2)
            r1.f65661f = r4
        L_0x0090:
            r5 = r4
            goto L_0x00f7
        L_0x0092:
            okhttp3.internal.connection.j$b r2 = r1.f65656a
            if (r2 == 0) goto L_0x00a9
            kotlin.jvm.internal.C13706o.m87926c(r2)
            boolean r2 = r2.mo76159b()
            if (r2 == 0) goto L_0x00a9
            okhttp3.internal.connection.j$b r2 = r1.f65656a
            kotlin.jvm.internal.C13706o.m87926c(r2)
            okhttp3.f0 r2 = r2.mo76160c()
            goto L_0x0090
        L_0x00a9:
            okhttp3.internal.connection.j r2 = r1.f65657b
            if (r2 != 0) goto L_0x00c4
            okhttp3.internal.connection.j r2 = new okhttp3.internal.connection.j
            okhttp3.a r5 = r1.f65663h
            okhttp3.internal.connection.e r6 = r1.f65664i
            okhttp3.z r6 = r6.mo76101l()
            okhttp3.internal.connection.i r6 = r6.mo76353t()
            okhttp3.internal.connection.e r7 = r1.f65664i
            okhttp3.r r8 = r1.f65665j
            r2.<init>(r5, r6, r7, r8)
            r1.f65657b = r2
        L_0x00c4:
            okhttp3.internal.connection.j$b r2 = r2.mo76156d()
            r1.f65656a = r2
            java.util.List r5 = r2.mo76158a()
            okhttp3.internal.connection.e r6 = r1.f65664i
            boolean r6 = r6.mo76003I()
            if (r6 != 0) goto L_0x0170
            okhttp3.internal.connection.h r6 = r1.f65662g
            okhttp3.a r7 = r1.f65663h
            okhttp3.internal.connection.e r8 = r1.f65664i
            boolean r3 = r6.mo76147a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x00f3
            okhttp3.internal.connection.e r0 = r1.f65664i
            okhttp3.internal.connection.f r0 = r0.mo76102n()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            okhttp3.r r2 = r1.f65665j
            okhttp3.internal.connection.e r3 = r1.f65664i
            r2.mo76210j(r3, r0)
            return r0
        L_0x00f3:
            okhttp3.f0 r2 = r2.mo76160c()
        L_0x00f7:
            okhttp3.internal.connection.f r3 = new okhttp3.internal.connection.f
            okhttp3.internal.connection.h r6 = r1.f65662g
            r3.<init>(r6, r2)
            okhttp3.internal.connection.e r6 = r1.f65664i
            r6.mo76094A(r3)
            okhttp3.internal.connection.e r12 = r1.f65664i     // Catch:{ all -> 0x0169 }
            okhttp3.r r13 = r1.f65665j     // Catch:{ all -> 0x0169 }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.mo76130g(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0169 }
            okhttp3.internal.connection.e r6 = r1.f65664i
            r6.mo76094A(r4)
            okhttp3.internal.connection.e r4 = r1.f65664i
            okhttp3.z r4 = r4.mo76101l()
            okhttp3.internal.connection.i r4 = r4.mo76353t()
            okhttp3.f0 r6 = r3.mo76121A()
            r4.mo76152a(r6)
            okhttp3.internal.connection.h r4 = r1.f65662g
            okhttp3.a r6 = r1.f65663h
            okhttp3.internal.connection.e r7 = r1.f65664i
            boolean r0 = r4.mo76147a(r6, r7, r5, r0)
            if (r0 == 0) goto L_0x0150
            okhttp3.internal.connection.e r0 = r1.f65664i
            okhttp3.internal.connection.f r0 = r0.mo76102n()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r1.f65661f = r2
            java.net.Socket r2 = r3.mo76124E()
            p372qc.C16279b.m97657k(r2)
            okhttp3.r r2 = r1.f65665j
            okhttp3.internal.connection.e r3 = r1.f65664i
            r2.mo76210j(r3, r0)
            return r0
        L_0x0150:
            monitor-enter(r3)
            okhttp3.internal.connection.h r0 = r1.f65662g     // Catch:{ all -> 0x0166 }
            r0.mo76150e(r3)     // Catch:{ all -> 0x0166 }
            okhttp3.internal.connection.e r0 = r1.f65664i     // Catch:{ all -> 0x0166 }
            r0.mo76096c(r3)     // Catch:{ all -> 0x0166 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0166 }
            monitor-exit(r3)
            okhttp3.r r0 = r1.f65665j
            okhttp3.internal.connection.e r2 = r1.f65664i
            r0.mo76210j(r2, r3)
            return r3
        L_0x0166:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0169:
            r0 = move-exception
            okhttp3.internal.connection.e r2 = r1.f65664i
            r2.mo76094A(r4)
            throw r0
        L_0x0170:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0178:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15941d.m96098b(int, int, int, int, boolean):okhttp3.internal.connection.f");
    }

    /* renamed from: c */
    private final C15946f m96099c(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            C15946f b = m96098b(i, i2, i3, i4, z);
            if (b.mo76140v(z2)) {
                return b;
            }
            b.mo76144z();
            if (this.f65661f == null) {
                C15955j.C15957b bVar = this.f65656a;
                boolean z3 = true;
                if (!(bVar != null ? bVar.mo76159b() : true)) {
                    C15955j jVar = this.f65657b;
                    if (jVar != null) {
                        z3 = jVar.mo76155b();
                    }
                    if (!z3) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: f */
    private final C15924f0 m96100f() {
        C15946f n;
        if (this.f65658c > 1 || this.f65659d > 1 || this.f65660e > 0 || (n = this.f65664i.mo76102n()) == null) {
            return null;
        }
        synchronized (n) {
            if (n.mo76135r() != 0) {
                return null;
            }
            if (!C16279b.m97653g(n.mo76121A().mo76025a().mo75907l(), this.f65663h.mo75907l())) {
                return null;
            }
            C15924f0 A = n.mo76121A();
            return A;
        }
    }

    /* renamed from: a */
    public final C16688d mo76089a(C16002z zVar, C16691g gVar) {
        C13706o.m87929f(zVar, "client");
        C13706o.m87929f(gVar, "chain");
        try {
            return m96099c(gVar.mo79596f(), gVar.mo79598h(), gVar.mo79600j(), zVar.mo76357y(), zVar.mo76335E(), !C13706o.m87924a(gVar.mo79599i().mo75917g(), "GET")).mo76142x(zVar, gVar);
        } catch (RouteException e) {
            mo76093h(e.mo76066c());
            throw e;
        } catch (IOException e2) {
            mo76093h(e2);
            throw new RouteException(e2);
        }
    }

    /* renamed from: d */
    public final C15898a mo76090d() {
        return this.f65663h;
    }

    /* renamed from: e */
    public final boolean mo76091e() {
        C15955j jVar;
        if (this.f65658c == 0 && this.f65659d == 0 && this.f65660e == 0) {
            return false;
        }
        if (this.f65661f != null) {
            return true;
        }
        C15924f0 f = m96100f();
        if (f != null) {
            this.f65661f = f;
            return true;
        }
        C15955j.C15957b bVar = this.f65656a;
        if ((bVar == null || !bVar.mo76159b()) && (jVar = this.f65657b) != null) {
            return jVar.mo76155b();
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo76092g(C15989v vVar) {
        C13706o.m87929f(vVar, "url");
        C15989v l = this.f65663h.mo75907l();
        return vVar.mo76274n() == l.mo76274n() && C13706o.m87924a(vVar.mo76269i(), l.mo76269i());
    }

    /* renamed from: h */
    public final void mo76093h(IOException iOException) {
        C13706o.m87929f(iOException, "e");
        this.f65661f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == C16794a.REFUSED_STREAM) {
            this.f65658c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f65659d++;
        } else {
            this.f65660e++;
        }
    }
}
