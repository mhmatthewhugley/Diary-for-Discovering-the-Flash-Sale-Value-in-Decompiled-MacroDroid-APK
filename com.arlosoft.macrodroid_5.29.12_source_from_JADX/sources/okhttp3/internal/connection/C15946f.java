package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import okhttp3.C15898a;
import okhttp3.C15899a0;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15924f0;
import okhttp3.C15925g;
import okhttp3.C15960j;
import okhttp3.C15975r;
import okhttp3.C15982t;
import okhttp3.C15989v;
import okhttp3.C16002z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p212ad.C11095c;
import p212ad.C11097d;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11196l;
import p370qa.C16254a;
import p372qc.C16279b;
import p399tc.C16617e;
import p408uc.C16688d;
import p408uc.C16691g;
import p417vc.C16762b;
import p426wc.C16794a;
import p426wc.C16802e;
import p426wc.C16821f;
import p426wc.C16827h;
import p426wc.C16839l;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001MB\u0017\u0012\u0006\u0010x\u001a\u00020t\u0012\u0006\u0010z\u001a\u00020\u001b¢\u0006\u0004\b}\u0010~J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\b\u00105\u001a\u00020\u001bH\u0016J\u0006\u00106\u001a\u00020\u000bJ\b\u00108\u001a\u000207H\u0016J\u000e\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001dJ\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;H\u0016J\u0018\u0010B\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016J\n\u0010C\u001a\u0004\u0018\u00010 H\u0016J'\u0010G\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010D\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bG\u0010HJ!\u0010J\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020I2\b\u00106\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0004\bJ\u0010KJ\b\u0010M\u001a\u00020LH\u0016J\b\u0010O\u001a\u00020NH\u0016R\u0018\u0010Q\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010PR\u0018\u0010S\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010UR\"\u0010\\\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010WR\"\u0010c\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0016\u0010e\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0016\u0010g\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010^R#\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0i0h8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bf\u0010lR\"\u0010s\u001a\u00020n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bX\u0010o\u001a\u0004\bj\u0010p\"\u0004\bq\u0010rR\u0017\u0010x\u001a\u00020t8\u0006¢\u0006\f\n\u0004\b_\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010yR\u0014\u0010|\u001a\u00020\u001d8@X\u0004¢\u0006\u0006\u001a\u0004\b{\u0010Y¨\u0006"}, mo71668d2 = {"Lokhttp3/internal/connection/f;", "Lwc/e$d;", "Lokhttp3/j;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/r;", "eventListener", "Lja/u;", "k", "i", "Lokhttp3/internal/connection/b;", "connectionSpecSelector", "pingIntervalMillis", "n", "F", "j", "Lokhttp3/b0;", "tunnelRequest", "Lokhttp3/v;", "url", "l", "m", "", "Lokhttp3/f0;", "candidates", "", "B", "G", "Lokhttp3/t;", "handshake", "f", "z", "()V", "y", "t", "connectionRetryEnabled", "g", "Lokhttp3/a;", "address", "routes", "u", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/z;", "client", "Luc/g;", "chain", "Luc/d;", "x", "(Lokhttp3/z;Luc/g;)Luc/d;", "A", "e", "Ljava/net/Socket;", "E", "doExtensiveChecks", "v", "Lwc/h;", "stream", "c", "Lwc/e;", "connection", "Lwc/l;", "settings", "b", "s", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lokhttp3/z;Lokhttp3/f0;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/e;", "H", "(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V", "Lokhttp3/a0;", "a", "", "toString", "Ljava/net/Socket;", "rawSocket", "d", "socket", "Lokhttp3/t;", "Lokhttp3/a0;", "protocol", "Z", "q", "()Z", "D", "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "r", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "successCount", "refusedStreamCount", "o", "allocationLimit", "", "Ljava/lang/ref/Reference;", "p", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "C", "(J)V", "idleAtNs", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "getConnectionPool", "()Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/f0;", "route", "w", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/f0;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.f */
/* compiled from: RealConnection.kt */
public final class C15946f extends C16802e.C16806d implements C15960j {

    /* renamed from: t */
    public static final C15947a f65689t = new C15947a((C13695i) null);

    /* renamed from: c */
    private Socket f65690c;

    /* renamed from: d */
    private Socket f65691d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C15982t f65692e;

    /* renamed from: f */
    private C15899a0 f65693f;

    /* renamed from: g */
    private C16802e f65694g;

    /* renamed from: h */
    private C11186d f65695h;

    /* renamed from: i */
    private C11184c f65696i;

    /* renamed from: j */
    private boolean f65697j;

    /* renamed from: k */
    private boolean f65698k;

    /* renamed from: l */
    private int f65699l;

    /* renamed from: m */
    private int f65700m;

    /* renamed from: n */
    private int f65701n;

    /* renamed from: o */
    private int f65702o = 1;

    /* renamed from: p */
    private final List<Reference<C15942e>> f65703p = new ArrayList();

    /* renamed from: q */
    private long f65704q = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: r */
    private final C15951h f65705r;

    /* renamed from: s */
    private final C15924f0 f65706s;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Lokhttp3/internal/connection/f$a;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.f$a */
    /* compiled from: RealConnection.kt */
    public static final class C15947a {
        private C15947a() {
        }

        public /* synthetic */ C15947a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.f$b */
    /* compiled from: RealConnection.kt */
    static final class C15948b extends C13708q implements C16254a<List<? extends Certificate>> {
        final /* synthetic */ C15898a $address;
        final /* synthetic */ C15925g $certificatePinner;
        final /* synthetic */ C15982t $unverifiedHandshake;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15948b(C15925g gVar, C15982t tVar, C15898a aVar) {
            super(0);
            this.$certificatePinner = gVar;
            this.$unverifiedHandshake = tVar;
            this.$address = aVar;
        }

        /* renamed from: a */
        public final List<Certificate> invoke() {
            C11095c d = this.$certificatePinner.mo76035d();
            C13706o.m87926c(d);
            return d.mo62210a(this.$unverifiedHandshake.mo76233d(), this.$address.mo75907l().mo76269i());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.f$c */
    /* compiled from: RealConnection.kt */
    static final class C15949c extends C13708q implements C16254a<List<? extends X509Certificate>> {
        final /* synthetic */ C15946f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15949c(C15946f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            C15982t d = this.this$0.f65692e;
            C13706o.m87926c(d);
            List<Certificate> d2 = d.mo76233d();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(d2, 10));
            for (Certificate certificate : d2) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C15946f(C15951h hVar, C15924f0 f0Var) {
        C13706o.m87929f(hVar, "connectionPool");
        C13706o.m87929f(f0Var, "route");
        this.f65705r = hVar;
        this.f65706s = f0Var;
    }

    /* renamed from: B */
    private final boolean m96142B(List<C15924f0> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C15924f0 f0Var : list) {
                if (f0Var.mo76026b().type() == Proxy.Type.DIRECT && this.f65706s.mo76026b().type() == Proxy.Type.DIRECT && C13706o.m87924a(this.f65706s.mo76028d(), f0Var.mo76028d())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    private final void m96143F(int i) throws IOException {
        Socket socket = this.f65691d;
        C13706o.m87926c(socket);
        C11186d dVar = this.f65695h;
        C13706o.m87926c(dVar);
        C11184c cVar = this.f65696i;
        C13706o.m87926c(cVar);
        socket.setSoTimeout(0);
        C16802e a = new C16802e.C16804b(true, C16617e.f67465h).mo79858m(socket, this.f65706s.mo76025a().mo75907l().mo76269i(), dVar, cVar).mo79856k(this).mo79857l(i).mo79846a();
        this.f65694g = a;
        this.f65702o = C16802e.f67836U.mo79859a().mo79951d();
        C16802e.m99608l0(a, false, (C16617e) null, 3, (Object) null);
    }

    /* renamed from: G */
    private final boolean m96144G(C15989v vVar) {
        C15982t tVar;
        if (!C16279b.f66629h || Thread.holdsLock(this)) {
            C15989v l = this.f65706s.mo76025a().mo75907l();
            if (vVar.mo76274n() != l.mo76274n()) {
                return false;
            }
            if (C13706o.m87924a(vVar.mo76269i(), l.mo76269i())) {
                return true;
            }
            if (this.f65698k || (tVar = this.f65692e) == null) {
                return false;
            }
            C13706o.m87926c(tVar);
            if (m96146f(vVar, tVar)) {
                return true;
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: f */
    private final boolean m96146f(C15989v vVar, C15982t tVar) {
        List<Certificate> d = tVar.mo76233d();
        if (!d.isEmpty()) {
            C11097d dVar = C11097d.f54015a;
            String i = vVar.mo76269i();
            Certificate certificate = d.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.mo62218e(i, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private final void m96147i(int i, int i2, C15917e eVar, C15975r rVar) throws IOException {
        Socket socket;
        int i3;
        Proxy b = this.f65706s.mo76026b();
        C15898a a = this.f65706s.mo76025a();
        Proxy.Type type = b.type();
        if (type != null && ((i3 = C15950g.f65707a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = a.mo75905j().createSocket();
            C13706o.m87926c(socket);
        } else {
            socket = new Socket(b);
        }
        this.f65690c = socket;
        rVar.mo76209i(eVar, this.f65706s.mo76028d(), b);
        socket.setSoTimeout(i2);
        try {
            C16926h.f68190c.mo80117g().mo80088f(socket, this.f65706s.mo76028d(), i);
            try {
                this.f65695h = C11196l.m75163b(C11196l.m75169h(socket));
                this.f65696i = C11196l.m75162a(C11196l.m75166e(socket));
            } catch (NullPointerException e) {
                if (C13706o.m87924a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f65706s.mo76028d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96148j(okhttp3.internal.connection.C15937b r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.f0 r0 = r10.f65706s
            okhttp3.a r0 = r0.mo76025a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo75906k()
            r2 = 0
            kotlin.jvm.internal.C13706o.m87926c(r1)     // Catch:{ all -> 0x017f }
            java.net.Socket r3 = r10.f65690c     // Catch:{ all -> 0x017f }
            okhttp3.v r4 = r0.mo75907l()     // Catch:{ all -> 0x017f }
            java.lang.String r4 = r4.mo76269i()     // Catch:{ all -> 0x017f }
            okhttp3.v r5 = r0.mo75907l()     // Catch:{ all -> 0x017f }
            int r5 = r5.mo76274n()     // Catch:{ all -> 0x017f }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0177
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x017f }
            okhttp3.l r11 = r11.mo76067a(r1)     // Catch:{ all -> 0x0174 }
            boolean r3 = r11.mo76170h()     // Catch:{ all -> 0x0174 }
            if (r3 == 0) goto L_0x0048
            xc.h$a r3 = p435xc.C16926h.f68190c     // Catch:{ all -> 0x0174 }
            xc.h r3 = r3.mo80117g()     // Catch:{ all -> 0x0174 }
            okhttp3.v r4 = r0.mo75907l()     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.mo76269i()     // Catch:{ all -> 0x0174 }
            java.util.List r5 = r0.mo75900f()     // Catch:{ all -> 0x0174 }
            r3.mo80082e(r1, r4, r5)     // Catch:{ all -> 0x0174 }
        L_0x0048:
            r1.startHandshake()     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0174 }
            okhttp3.t$a r4 = okhttp3.C15982t.f65786e     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C13706o.m87928e(r3, r5)     // Catch:{ all -> 0x0174 }
            okhttp3.t r4 = r4.mo76238a(r3)     // Catch:{ all -> 0x0174 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo75898e()     // Catch:{ all -> 0x0174 }
            kotlin.jvm.internal.C13706o.m87926c(r5)     // Catch:{ all -> 0x0174 }
            okhttp3.v r7 = r0.mo75907l()     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r7.mo76269i()     // Catch:{ all -> 0x0174 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0174 }
            if (r3 != 0) goto L_0x0108
            java.util.List r11 = r4.mo76233d()     // Catch:{ all -> 0x0174 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0174 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00e4
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0174 }
            if (r11 != 0) goto L_0x0089
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x0174 }
            throw r11     // Catch:{ all -> 0x0174 }
        L_0x0089:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r4.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0174 }
            okhttp3.v r0 = r0.mo75907l()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.mo76269i()     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            okhttp3.g$b r0 = okhttp3.C15925g.f65495d     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.mo76040a(r11)     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "cert.subjectDN"
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            ad.d r0 = p212ad.C11097d.f54015a     // Catch:{ all -> 0x0174 }
            java.util.List r11 = r0.mo62217a(r11)     // Catch:{ all -> 0x0174 }
            r4.append(r11)     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = kotlin.text.C15167o.m93616h(r11, r2, r6, r2)     // Catch:{ all -> 0x0174 }
            r3.<init>(r11)     // Catch:{ all -> 0x0174 }
            throw r3     // Catch:{ all -> 0x0174 }
        L_0x00e4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            okhttp3.v r0 = r0.mo75907l()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.mo76269i()     // Catch:{ all -> 0x0174 }
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0174 }
            r11.<init>(r0)     // Catch:{ all -> 0x0174 }
            throw r11     // Catch:{ all -> 0x0174 }
        L_0x0108:
            okhttp3.g r3 = r0.mo75894a()     // Catch:{ all -> 0x0174 }
            kotlin.jvm.internal.C13706o.m87926c(r3)     // Catch:{ all -> 0x0174 }
            okhttp3.t r5 = new okhttp3.t     // Catch:{ all -> 0x0174 }
            okhttp3.g0 r6 = r4.mo76234e()     // Catch:{ all -> 0x0174 }
            okhttp3.i r7 = r4.mo76231a()     // Catch:{ all -> 0x0174 }
            java.util.List r8 = r4.mo76232c()     // Catch:{ all -> 0x0174 }
            okhttp3.internal.connection.f$b r9 = new okhttp3.internal.connection.f$b     // Catch:{ all -> 0x0174 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0174 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0174 }
            r10.f65692e = r5     // Catch:{ all -> 0x0174 }
            okhttp3.v r0 = r0.mo75907l()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.mo76269i()     // Catch:{ all -> 0x0174 }
            okhttp3.internal.connection.f$c r4 = new okhttp3.internal.connection.f$c     // Catch:{ all -> 0x0174 }
            r4.<init>(r10)     // Catch:{ all -> 0x0174 }
            r3.mo76033b(r0, r4)     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.mo76170h()     // Catch:{ all -> 0x0174 }
            if (r11 == 0) goto L_0x0147
            xc.h$a r11 = p435xc.C16926h.f68190c     // Catch:{ all -> 0x0174 }
            xc.h r11 = r11.mo80117g()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = r11.mo80083g(r1)     // Catch:{ all -> 0x0174 }
        L_0x0147:
            r10.f65691d = r1     // Catch:{ all -> 0x0174 }
            cd.y r11 = p226cd.C11196l.m75169h(r1)     // Catch:{ all -> 0x0174 }
            cd.d r11 = p226cd.C11196l.m75163b(r11)     // Catch:{ all -> 0x0174 }
            r10.f65695h = r11     // Catch:{ all -> 0x0174 }
            cd.w r11 = p226cd.C11196l.m75166e(r1)     // Catch:{ all -> 0x0174 }
            cd.c r11 = p226cd.C11196l.m75162a(r11)     // Catch:{ all -> 0x0174 }
            r10.f65696i = r11     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x0166
            okhttp3.a0$a r11 = okhttp3.C15899a0.f65409s     // Catch:{ all -> 0x0174 }
            okhttp3.a0 r11 = r11.mo75910a(r2)     // Catch:{ all -> 0x0174 }
            goto L_0x0168
        L_0x0166:
            okhttp3.a0 r11 = okhttp3.C15899a0.HTTP_1_1     // Catch:{ all -> 0x0174 }
        L_0x0168:
            r10.f65693f = r11     // Catch:{ all -> 0x0174 }
            xc.h$a r11 = p435xc.C16926h.f68190c
            xc.h r11 = r11.mo80117g()
            r11.mo80104b(r1)
            return
        L_0x0174:
            r11 = move-exception
            r2 = r1
            goto L_0x0180
        L_0x0177:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x017f }
            throw r11     // Catch:{ all -> 0x017f }
        L_0x017f:
            r11 = move-exception
        L_0x0180:
            if (r2 == 0) goto L_0x018b
            xc.h$a r0 = p435xc.C16926h.f68190c
            xc.h r0 = r0.mo80117g()
            r0.mo80104b(r2)
        L_0x018b:
            if (r2 == 0) goto L_0x0190
            p372qc.C16279b.m97657k(r2)
        L_0x0190:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15946f.m96148j(okhttp3.internal.connection.b):void");
    }

    /* renamed from: k */
    private final void m96149k(int i, int i2, int i3, C15917e eVar, C15975r rVar) throws IOException {
        C15904b0 m = m96151m();
        C15989v j = m.mo75920j();
        int i4 = 0;
        while (i4 < 21) {
            m96147i(i, i2, eVar, rVar);
            m = m96150l(i2, i3, m, j);
            if (m != null) {
                Socket socket = this.f65690c;
                if (socket != null) {
                    C16279b.m97657k(socket);
                }
                this.f65690c = null;
                this.f65696i = null;
                this.f65695h = null;
                rVar.mo76207g(eVar, this.f65706s.mo76028d(), this.f65706s.mo76026b(), (C15899a0) null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final C15904b0 m96150l(int i, int i2, C15904b0 b0Var, C15989v vVar) throws IOException {
        String str = "CONNECT " + C16279b.m97637M(vVar, true) + " HTTP/1.1";
        while (true) {
            C11186d dVar = this.f65695h;
            C13706o.m87926c(dVar);
            C11184c cVar = this.f65696i;
            C13706o.m87926c(cVar);
            C16762b bVar = new C16762b((C16002z) null, this, dVar, cVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.mo62393q().mo62526g((long) i, timeUnit);
            cVar.mo62388q().mo62526g((long) i2, timeUnit);
            bVar.mo79746A(b0Var.mo75915e(), str);
            bVar.mo79583a();
            C15915d0.C15916a g = bVar.mo79590g(false);
            C13706o.m87926c(g);
            C15915d0 c = g.mo76001r(b0Var).mo75988c();
            bVar.mo79747z(c);
            int g2 = c.mo75971g();
            if (g2 != 200) {
                if (g2 == 407) {
                    C15904b0 a = this.f65706s.mo76025a().mo75902h().mo25163a(this.f65706s, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C15176v.m93641v("close", C15915d0.m95985o(c, HTTP.CONN_DIRECTIVE, (String) null, 2, (Object) null), true)) {
                        return a;
                    } else {
                        b0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.mo75971g());
                }
            } else if (dVar.getBuffer().mo62469x1() && cVar.getBuffer().mo62469x1()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: m */
    private final C15904b0 m96151m() throws IOException {
        C15904b0 b = new C15904b0.C15905a().mo75936o(this.f65706s.mo76025a().mo75907l()).mo75929h("CONNECT", (C15907c0) null).mo75927f(HTTP.TARGET_HOST, C16279b.m97637M(this.f65706s.mo76025a().mo75907l(), true)).mo75927f("Proxy-Connection", HTTP.CONN_KEEP_ALIVE).mo75927f(HTTP.USER_AGENT, "okhttp/4.9.3").mo75923b();
        C15904b0 a = this.f65706s.mo76025a().mo75902h().mo25163a(this.f65706s, new C15915d0.C15916a().mo76001r(b).mo75999p(C15899a0.HTTP_1_1).mo75990g(407).mo75996m("Preemptive Authenticate").mo75987b(C16279b.f66624c).mo76002s(-1).mo76000q(-1).mo75993j(AUTH.PROXY_AUTH, "OkHttp-Preemptive").mo75988c());
        return a != null ? a : b;
    }

    /* renamed from: n */
    private final void m96152n(C15937b bVar, int i, C15917e eVar, C15975r rVar) throws IOException {
        if (this.f65706s.mo76025a().mo75906k() == null) {
            List<C15899a0> f = this.f65706s.mo76025a().mo75900f();
            C15899a0 a0Var = C15899a0.H2_PRIOR_KNOWLEDGE;
            if (f.contains(a0Var)) {
                this.f65691d = this.f65690c;
                this.f65693f = a0Var;
                m96143F(i);
                return;
            }
            this.f65691d = this.f65690c;
            this.f65693f = C15899a0.HTTP_1_1;
            return;
        }
        rVar.mo76200B(eVar);
        m96148j(bVar);
        rVar.mo76199A(eVar, this.f65692e);
        if (this.f65693f == C15899a0.HTTP_2) {
            m96143F(i);
        }
    }

    /* renamed from: A */
    public C15924f0 mo76121A() {
        return this.f65706s;
    }

    /* renamed from: C */
    public final void mo76122C(long j) {
        this.f65704q = j;
    }

    /* renamed from: D */
    public final void mo76123D(boolean z) {
        this.f65697j = z;
    }

    /* renamed from: E */
    public Socket mo76124E() {
        Socket socket = this.f65691d;
        C13706o.m87926c(socket);
        return socket;
    }

    /* renamed from: H */
    public final synchronized void mo76125H(C15942e eVar, IOException iOException) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == C16794a.REFUSED_STREAM) {
                int i = this.f65701n + 1;
                this.f65701n = i;
                if (i > 1) {
                    this.f65697j = true;
                    this.f65699l++;
                }
            } else if (((StreamResetException) iOException).errorCode != C16794a.CANCEL || !eVar.mo76003I()) {
                this.f65697j = true;
                this.f65699l++;
            }
        } else if (!mo76141w() || (iOException instanceof ConnectionShutdownException)) {
            this.f65697j = true;
            if (this.f65700m == 0) {
                if (iOException != null) {
                    mo76131h(eVar.mo76101l(), this.f65706s, iOException);
                }
                this.f65699l++;
            }
        }
    }

    /* renamed from: a */
    public C15899a0 mo76126a() {
        C15899a0 a0Var = this.f65693f;
        C13706o.m87926c(a0Var);
        return a0Var;
    }

    /* renamed from: b */
    public synchronized void mo76127b(C16802e eVar, C16839l lVar) {
        C13706o.m87929f(eVar, "connection");
        C13706o.m87929f(lVar, "settings");
        this.f65702o = lVar.mo79951d();
    }

    /* renamed from: c */
    public void mo76128c(C16827h hVar) throws IOException {
        C13706o.m87929f(hVar, "stream");
        hVar.mo79893d(C16794a.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: e */
    public final void mo76129e() {
        Socket socket = this.f65690c;
        if (socket != null) {
            C16279b.m97657k(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76130g(int r17, int r18, int r19, int r20, boolean r21, okhttp3.C15917e r22, okhttp3.C15975r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            okhttp3.a0 r0 = r7.f65693f
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015a
            okhttp3.f0 r0 = r7.f65706s
            okhttp3.a r0 = r0.mo76025a()
            java.util.List r0 = r0.mo75895b()
            okhttp3.internal.connection.b r11 = new okhttp3.internal.connection.b
            r11.<init>(r0)
            okhttp3.f0 r1 = r7.f65706s
            okhttp3.a r1 = r1.mo76025a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo75906k()
            if (r1 != 0) goto L_0x0086
            okhttp3.l r1 = okhttp3.C15962l.f65741j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            okhttp3.f0 r0 = r7.f65706s
            okhttp3.a r0 = r0.mo76025a()
            okhttp3.v r0 = r0.mo75907l()
            java.lang.String r0 = r0.mo76269i()
            xc.h$a r1 = p435xc.C16926h.f68190c
            xc.h r1 = r1.mo80117g()
            boolean r1 = r1.mo80084i(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            okhttp3.f0 r0 = r7.f65706s
            okhttp3.a r0 = r0.mo76025a()
            java.util.List r0 = r0.mo75900f()
            okhttp3.a0 r1 = okhttp3.C15899a0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014d
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            okhttp3.f0 r0 = r7.f65706s     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.mo76027c()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m96149k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.f65690c     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.m96147i(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.m96152n(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            okhttp3.f0 r0 = r7.f65706s     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.mo76028d()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.f0 r1 = r7.f65706s     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.mo76026b()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.a0 r2 = r7.f65693f     // Catch:{ IOException -> 0x00f9 }
            r9.mo76207g(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            okhttp3.f0 r0 = r7.f65706s
            boolean r0 = r0.mo76027c()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.f65690c
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.f65704q = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.f65691d
            if (r1 == 0) goto L_0x010b
            p372qc.C16279b.m97657k(r1)
        L_0x010b:
            java.net.Socket r1 = r7.f65690c
            if (r1 == 0) goto L_0x0112
            p372qc.C16279b.m97657k(r1)
        L_0x0112:
            r7.f65691d = r12
            r7.f65690c = r12
            r7.f65695h = r12
            r7.f65696i = r12
            r7.f65692e = r12
            r7.f65693f = r12
            r7.f65694g = r12
            r7.f65702o = r10
            okhttp3.f0 r1 = r7.f65706s
            java.net.InetSocketAddress r3 = r1.mo76028d()
            okhttp3.f0 r1 = r7.f65706s
            java.net.Proxy r4 = r1.mo76026b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo76208h(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x013f
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x0142
        L_0x013f:
            r13.mo76064a(r0)
        L_0x0142:
            if (r21 == 0) goto L_0x014c
            boolean r0 = r11.mo76068b(r0)
            if (r0 == 0) goto L_0x014c
            goto L_0x009a
        L_0x014c:
            throw r13
        L_0x014d:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15946f.mo76130g(int, int, int, int, boolean, okhttp3.e, okhttp3.r):void");
    }

    /* renamed from: h */
    public final void mo76131h(C16002z zVar, C15924f0 f0Var, IOException iOException) {
        C13706o.m87929f(zVar, "client");
        C13706o.m87929f(f0Var, "failedRoute");
        C13706o.m87929f(iOException, "failure");
        if (f0Var.mo76026b().type() != Proxy.Type.DIRECT) {
            C15898a a = f0Var.mo76025a();
            a.mo75904i().connectFailed(a.mo75907l().mo76279s(), f0Var.mo76026b().address(), iOException);
        }
        zVar.mo76353t().mo76153b(f0Var);
    }

    /* renamed from: o */
    public final List<Reference<C15942e>> mo76132o() {
        return this.f65703p;
    }

    /* renamed from: p */
    public final long mo76133p() {
        return this.f65704q;
    }

    /* renamed from: q */
    public final boolean mo76134q() {
        return this.f65697j;
    }

    /* renamed from: r */
    public final int mo76135r() {
        return this.f65699l;
    }

    /* renamed from: s */
    public C15982t mo76136s() {
        return this.f65692e;
    }

    /* renamed from: t */
    public final synchronized void mo76137t() {
        this.f65700m++;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f65706s.mo76025a().mo75907l().mo76269i());
        sb.append(':');
        sb.append(this.f65706s.mo76025a().mo75907l().mo76274n());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f65706s.mo76026b());
        sb.append(" hostAddress=");
        sb.append(this.f65706s.mo76028d());
        sb.append(" cipherSuite=");
        C15982t tVar = this.f65692e;
        if (tVar == null || (obj = tVar.mo76231a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f65693f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo76139u(C15898a aVar, List<C15924f0> list) {
        C13706o.m87929f(aVar, "address");
        if (C16279b.f66629h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (this.f65703p.size() >= this.f65702o || this.f65697j || !this.f65706s.mo76025a().mo75897d(aVar)) {
            return false;
        } else {
            if (C13706o.m87924a(aVar.mo75907l().mo76269i(), mo76121A().mo76025a().mo75907l().mo76269i())) {
                return true;
            }
            if (this.f65694g == null || list == null || !m96142B(list) || aVar.mo75898e() != C11097d.f54015a || !m96144G(aVar.mo75907l())) {
                return false;
            }
            try {
                C15925g a = aVar.mo75894a();
                C13706o.m87926c(a);
                String i = aVar.mo75907l().mo76269i();
                C15982t s = mo76136s();
                C13706o.m87926c(s);
                a.mo76032a(i, s.mo76233d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    /* renamed from: v */
    public final boolean mo76140v(boolean z) {
        long j;
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f65690c;
            C13706o.m87926c(socket);
            Socket socket2 = this.f65691d;
            C13706o.m87926c(socket2);
            C11186d dVar = this.f65695h;
            C13706o.m87926c(dVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C16802e eVar = this.f65694g;
            if (eVar != null) {
                return eVar.mo79823M(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f65704q;
            }
            if (j < 10000000000L || !z) {
                return true;
            }
            return C16279b.m97627C(socket2, dVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: w */
    public final boolean mo76141w() {
        return this.f65694g != null;
    }

    /* renamed from: x */
    public final C16688d mo76142x(C16002z zVar, C16691g gVar) throws SocketException {
        C13706o.m87929f(zVar, "client");
        C13706o.m87929f(gVar, "chain");
        Socket socket = this.f65691d;
        C13706o.m87926c(socket);
        C11186d dVar = this.f65695h;
        C13706o.m87926c(dVar);
        C11184c cVar = this.f65696i;
        C13706o.m87926c(cVar);
        C16802e eVar = this.f65694g;
        if (eVar != null) {
            return new C16821f(zVar, this, gVar, eVar);
        }
        socket.setSoTimeout(gVar.mo79601k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dVar.mo62393q().mo62526g((long) gVar.mo79598h(), timeUnit);
        cVar.mo62388q().mo62526g((long) gVar.mo79600j(), timeUnit);
        return new C16762b(zVar, this, dVar, cVar);
    }

    /* renamed from: y */
    public final synchronized void mo76143y() {
        this.f65698k = true;
    }

    /* renamed from: z */
    public final synchronized void mo76144z() {
        this.f65697j = true;
    }
}
