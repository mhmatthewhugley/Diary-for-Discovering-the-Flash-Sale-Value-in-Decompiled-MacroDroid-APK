package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import okhttp3.C15898a;
import okhttp3.C15917e;
import okhttp3.C15924f0;
import okhttp3.C15975r;
import okhttp3.C15989v;
import p370qa.C16254a;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u0010\fB'\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0002J\t\u0010\u000e\u001a\u00020\rH\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, mo71668d2 = {"Lokhttp3/internal/connection/j;", "", "Lokhttp3/v;", "url", "Ljava/net/Proxy;", "proxy", "Lja/u;", "g", "", "c", "e", "f", "b", "Lokhttp3/internal/connection/j$b;", "d", "", "a", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/f0;", "postponedRoutes", "Lokhttp3/a;", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "routeDatabase", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/r;", "h", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/a;Lokhttp3/internal/connection/i;Lokhttp3/e;Lokhttp3/r;)V", "i", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.j */
/* compiled from: RouteSelector.kt */
public final class C15955j {

    /* renamed from: i */
    public static final C15956a f65716i = new C15956a((C13695i) null);

    /* renamed from: a */
    private List<? extends Proxy> f65717a = C13614t.m87748j();

    /* renamed from: b */
    private int f65718b;

    /* renamed from: c */
    private List<? extends InetSocketAddress> f65719c = C13614t.m87748j();

    /* renamed from: d */
    private final List<C15924f0> f65720d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15898a f65721e;

    /* renamed from: f */
    private final C15954i f65722f;

    /* renamed from: g */
    private final C15917e f65723g;

    /* renamed from: h */
    private final C15975r f65724h;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, mo71668d2 = {"Lokhttp3/internal/connection/j$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.j$a */
    /* compiled from: RouteSelector.kt */
    public static final class C15956a {
        private C15956a() {
        }

        public /* synthetic */ C15956a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final String mo76157a(InetSocketAddress inetSocketAddress) {
            C13706o.m87929f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C13706o.m87928e(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            C13706o.m87928e(hostName, "hostName");
            return hostName;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lokhttp3/internal/connection/j$b;", "", "", "b", "Lokhttp3/f0;", "c", "", "a", "I", "nextRouteIndex", "", "Ljava/util/List;", "()Ljava/util/List;", "routes", "<init>", "(Ljava/util/List;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.j$b */
    /* compiled from: RouteSelector.kt */
    public static final class C15957b {

        /* renamed from: a */
        private int f65725a;

        /* renamed from: b */
        private final List<C15924f0> f65726b;

        public C15957b(List<C15924f0> list) {
            C13706o.m87929f(list, "routes");
            this.f65726b = list;
        }

        /* renamed from: a */
        public final List<C15924f0> mo76158a() {
            return this.f65726b;
        }

        /* renamed from: b */
        public final boolean mo76159b() {
            return this.f65725a < this.f65726b.size();
        }

        /* renamed from: c */
        public final C15924f0 mo76160c() {
            if (mo76159b()) {
                List<C15924f0> list = this.f65726b;
                int i = this.f65725a;
                this.f65725a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/net/Proxy;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.j$c */
    /* compiled from: RouteSelector.kt */
    static final class C15958c extends C13708q implements C16254a<List<? extends Proxy>> {
        final /* synthetic */ Proxy $proxy;
        final /* synthetic */ C15989v $url;
        final /* synthetic */ C15955j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15958c(C15955j jVar, Proxy proxy, C15989v vVar) {
            super(0);
            this.this$0 = jVar;
            this.$proxy = proxy;
            this.$url = vVar;
        }

        /* renamed from: a */
        public final List<Proxy> invoke() {
            Proxy proxy = this.$proxy;
            if (proxy != null) {
                return C13612s.m87736e(proxy);
            }
            URI s = this.$url.mo76279s();
            if (s.getHost() == null) {
                return C16279b.m97666t(Proxy.NO_PROXY);
            }
            List<Proxy> select = this.this$0.f65721e.mo75904i().select(s);
            if (!(select == null || select.isEmpty())) {
                return C16279b.m97639O(select);
            }
            return C16279b.m97666t(Proxy.NO_PROXY);
        }
    }

    public C15955j(C15898a aVar, C15954i iVar, C15917e eVar, C15975r rVar) {
        C13706o.m87929f(aVar, "address");
        C13706o.m87929f(iVar, "routeDatabase");
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(rVar, "eventListener");
        this.f65721e = aVar;
        this.f65722f = iVar;
        this.f65723g = eVar;
        this.f65724h = rVar;
        m96191g(aVar.mo75907l(), aVar.mo75901g());
    }

    /* renamed from: c */
    private final boolean m96188c() {
        return this.f65718b < this.f65717a.size();
    }

    /* renamed from: e */
    private final Proxy m96189e() throws IOException {
        if (m96188c()) {
            List<? extends Proxy> list = this.f65717a;
            int i = this.f65718b;
            this.f65718b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m96190f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f65721e.mo75907l().mo76269i() + "; exhausted proxy configurations: " + this.f65717a);
    }

    /* renamed from: f */
    private final void m96190f(Proxy proxy) throws IOException {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f65719c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f65721e.mo75907l().mo76269i();
            i = this.f65721e.mo75907l().mo76274n();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f65716i.mo76157a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i || 65535 < i) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f65724h.mo76213m(this.f65723g, str);
            List<InetAddress> lookup = this.f65721e.mo75896c().lookup(str);
            if (!lookup.isEmpty()) {
                this.f65724h.mo76212l(this.f65723g, str, lookup);
                for (InetAddress inetSocketAddress2 : lookup) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
                }
                return;
            }
            throw new UnknownHostException(this.f65721e.mo75896c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: g */
    private final void m96191g(C15989v vVar, Proxy proxy) {
        C15958c cVar = new C15958c(this, proxy, vVar);
        this.f65724h.mo76215o(this.f65723g, vVar);
        List<Proxy> a = cVar.invoke();
        this.f65717a = a;
        this.f65718b = 0;
        this.f65724h.mo76214n(this.f65723g, vVar, a);
    }

    /* renamed from: b */
    public final boolean mo76155b() {
        return m96188c() || (this.f65720d.isEmpty() ^ true);
    }

    /* renamed from: d */
    public final C15957b mo76156d() throws IOException {
        if (mo76155b()) {
            ArrayList arrayList = new ArrayList();
            while (m96188c()) {
                Proxy e = m96189e();
                for (InetSocketAddress f0Var : this.f65719c) {
                    C15924f0 f0Var2 = new C15924f0(this.f65721e, e, f0Var);
                    if (this.f65722f.mo76154c(f0Var2)) {
                        this.f65720d.add(f0Var2);
                    } else {
                        arrayList.add(f0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                boolean unused = C13624y.m87797z(arrayList, this.f65720d);
                this.f65720d.clear();
            }
            return new C15957b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
