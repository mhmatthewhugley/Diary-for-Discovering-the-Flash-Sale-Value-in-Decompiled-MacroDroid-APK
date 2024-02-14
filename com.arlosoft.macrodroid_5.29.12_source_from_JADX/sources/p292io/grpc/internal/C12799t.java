package p292io.grpc.internal;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import p292io.grpc.C12520a;
import p292io.grpc.C12524a0;
import p292io.grpc.C12554e;

/* renamed from: io.grpc.internal.t */
/* compiled from: ClientTransportFactory */
public interface C12799t extends Closeable {

    /* renamed from: io.grpc.internal.t$a */
    /* compiled from: ClientTransportFactory */
    public static final class C12800a {

        /* renamed from: a */
        private String f60188a = "unknown-authority";

        /* renamed from: b */
        private C12520a f60189b = C12520a.f59384b;

        /* renamed from: c */
        private String f60190c;

        /* renamed from: d */
        private C12524a0 f60191d;

        /* renamed from: a */
        public String mo69546a() {
            return this.f60188a;
        }

        /* renamed from: b */
        public C12520a mo69547b() {
            return this.f60189b;
        }

        /* renamed from: c */
        public C12524a0 mo69548c() {
            return this.f60191d;
        }

        /* renamed from: d */
        public String mo69549d() {
            return this.f60190c;
        }

        /* renamed from: e */
        public C12800a mo69550e(String str) {
            this.f60188a = (String) Preconditions.m5393t(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12800a)) {
                return false;
            }
            C12800a aVar = (C12800a) obj;
            if (!this.f60188a.equals(aVar.f60188a) || !this.f60189b.equals(aVar.f60189b) || !Objects.m5349a(this.f60190c, aVar.f60190c) || !Objects.m5349a(this.f60191d, aVar.f60191d)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public C12800a mo69552f(C12520a aVar) {
            Preconditions.m5393t(aVar, "eagAttributes");
            this.f60189b = aVar;
            return this;
        }

        /* renamed from: g */
        public C12800a mo69553g(C12524a0 a0Var) {
            this.f60191d = a0Var;
            return this;
        }

        /* renamed from: h */
        public C12800a mo69554h(String str) {
            this.f60190c = str;
            return this;
        }

        public int hashCode() {
            return Objects.m5350b(this.f60188a, this.f60189b, this.f60190c, this.f60191d);
        }
    }

    /* renamed from: O0 */
    ScheduledExecutorService mo69457O0();

    /* renamed from: O1 */
    C12812v mo69458O1(SocketAddress socketAddress, C12800a aVar, C12554e eVar);

    void close();
}
