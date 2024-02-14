package p292io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: io.grpc.a0 */
/* compiled from: HttpConnectProxiedSocketAddress */
public final class C12524a0 extends C13009x0 {
    private static final long serialVersionUID = 0;
    private final String password;
    private final SocketAddress proxyAddress;
    private final InetSocketAddress targetAddress;
    private final String username;

    /* renamed from: io.grpc.a0$b */
    /* compiled from: HttpConnectProxiedSocketAddress */
    public static final class C12526b {

        /* renamed from: a */
        private SocketAddress f59389a;

        /* renamed from: b */
        private InetSocketAddress f59390b;

        /* renamed from: c */
        private String f59391c;

        /* renamed from: d */
        private String f59392d;

        /* renamed from: a */
        public C12524a0 mo69042a() {
            return new C12524a0(this.f59389a, this.f59390b, this.f59391c, this.f59392d);
        }

        /* renamed from: b */
        public C12526b mo69043b(String str) {
            this.f59392d = str;
            return this;
        }

        /* renamed from: c */
        public C12526b mo69044c(SocketAddress socketAddress) {
            this.f59389a = (SocketAddress) Preconditions.m5393t(socketAddress, "proxyAddress");
            return this;
        }

        /* renamed from: d */
        public C12526b mo69045d(InetSocketAddress inetSocketAddress) {
            this.f59390b = (InetSocketAddress) Preconditions.m5393t(inetSocketAddress, "targetAddress");
            return this;
        }

        /* renamed from: e */
        public C12526b mo69046e(String str) {
            this.f59391c = str;
            return this;
        }

        private C12526b() {
        }
    }

    /* renamed from: d */
    public static C12526b m83648d() {
        return new C12526b();
    }

    /* renamed from: a */
    public SocketAddress mo69035a() {
        return this.proxyAddress;
    }

    /* renamed from: b */
    public InetSocketAddress mo69036b() {
        return this.targetAddress;
    }

    /* renamed from: c */
    public String mo69037c() {
        return this.username;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12524a0)) {
            return false;
        }
        C12524a0 a0Var = (C12524a0) obj;
        if (!Objects.m5349a(this.proxyAddress, a0Var.proxyAddress) || !Objects.m5349a(this.targetAddress, a0Var.targetAddress) || !Objects.m5349a(this.username, a0Var.username) || !Objects.m5349a(this.password, a0Var.password)) {
            return false;
        }
        return true;
    }

    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return Objects.m5350b(this.proxyAddress, this.targetAddress, this.username, this.password);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("proxyAddr", this.proxyAddress).mo22194d("targetAddr", this.targetAddress).mo22194d("username", this.username).mo22195e("hasPassword", this.password != null).toString();
    }

    private C12524a0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        Preconditions.m5393t(socketAddress, "proxyAddress");
        Preconditions.m5393t(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            Preconditions.m5372C(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.proxyAddress = socketAddress;
        this.targetAddress = inetSocketAddress;
        this.username = str;
        this.password = str2;
    }
}
