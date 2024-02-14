package p292io.grpc;

import com.google.common.base.MoreObjects;
import java.util.Map;
import org.apache.commons.logging.LogFactory;
import p292io.grpc.C12910l0;
import p292io.grpc.C12981s0;

/* renamed from: io.grpc.m0 */
/* compiled from: LoadBalancerProvider */
public abstract class C12924m0 extends C12910l0.C12914c {

    /* renamed from: a */
    private static final C12981s0.C12985c f60472a = C12981s0.C12985c.m85163a(new C12925a());

    /* renamed from: io.grpc.m0$a */
    /* compiled from: LoadBalancerProvider */
    private static final class C12925a {
        C12925a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo69516b();

    /* renamed from: c */
    public abstract int mo69517c();

    /* renamed from: d */
    public abstract boolean mo69518d();

    /* renamed from: e */
    public C12981s0.C12985c mo69519e(Map<String, ?> map) {
        return f60472a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return MoreObjects.m5334c(this).mo22194d("policy", mo69516b()).mo22192b(LogFactory.PRIORITY_KEY, mo69517c()).mo22195e("available", mo69518d()).toString();
    }
}
