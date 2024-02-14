package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo71668d2 = {"Lokhttp3/f0;", "", "", "c", "other", "equals", "", "hashCode", "", "toString", "Lokhttp3/a;", "a", "Lokhttp3/a;", "()Lokhttp3/a;", "address", "Ljava/net/Proxy;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.f0 */
/* compiled from: Route.kt */
public final class C15924f0 {

    /* renamed from: a */
    private final C15898a f65491a;

    /* renamed from: b */
    private final Proxy f65492b;

    /* renamed from: c */
    private final InetSocketAddress f65493c;

    public C15924f0(C15898a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C13706o.m87929f(aVar, "address");
        C13706o.m87929f(proxy, "proxy");
        C13706o.m87929f(inetSocketAddress, "socketAddress");
        this.f65491a = aVar;
        this.f65492b = proxy;
        this.f65493c = inetSocketAddress;
    }

    /* renamed from: a */
    public final C15898a mo76025a() {
        return this.f65491a;
    }

    /* renamed from: b */
    public final Proxy mo76026b() {
        return this.f65492b;
    }

    /* renamed from: c */
    public final boolean mo76027c() {
        return this.f65491a.mo75906k() != null && this.f65492b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress mo76028d() {
        return this.f65493c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15924f0) {
            C15924f0 f0Var = (C15924f0) obj;
            return C13706o.m87924a(f0Var.f65491a, this.f65491a) && C13706o.m87924a(f0Var.f65492b, this.f65492b) && C13706o.m87924a(f0Var.f65493c, this.f65493c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f65491a.hashCode()) * 31) + this.f65492b.hashCode()) * 31) + this.f65493c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f65493c + '}';
    }
}
