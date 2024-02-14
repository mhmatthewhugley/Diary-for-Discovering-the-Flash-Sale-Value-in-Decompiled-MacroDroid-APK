package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import java.net.URI;
import p292io.grpc.C12565h0;
import p292io.grpc.C12981s0;
import p292io.grpc.C12996t0;

/* renamed from: io.grpc.internal.k */
/* compiled from: BaseDnsNameResolverProvider */
public abstract class C12722k extends C12996t0 {
    /* renamed from: a */
    public String mo69444a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo69446e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo69242g();

    /* renamed from: h */
    public C12602b0 mo69445c(URI uri, C12981s0.C12983b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) Preconditions.m5393t(uri.getPath(), "targetPath");
        Preconditions.m5387n(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C12602b0(uri.getAuthority(), str.substring(1), bVar, C12749o0.f60045r, Stopwatch.m5464d(), C12565h0.m83779a(getClass().getClassLoader()), mo69242g());
    }
}
