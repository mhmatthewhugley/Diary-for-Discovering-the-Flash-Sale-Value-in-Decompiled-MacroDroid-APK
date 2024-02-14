package p292io.grpc.internal;

import java.net.URI;
import p292io.grpc.C12981s0;

/* renamed from: io.grpc.internal.n1 */
/* compiled from: OverrideAuthorityNameResolverFactory */
final class C12744n1 extends C12981s0.C12986d {

    /* renamed from: e */
    private final C12981s0.C12986d f60018e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f60019f;

    /* renamed from: io.grpc.internal.n1$a */
    /* compiled from: OverrideAuthorityNameResolverFactory */
    class C12745a extends C12723k0 {
        C12745a(C12981s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: a */
        public String mo69218a() {
            return C12744n1.this.f60019f;
        }
    }

    C12744n1(C12981s0.C12986d dVar, String str) {
        this.f60018e = dVar;
        this.f60019f = str;
    }

    /* renamed from: a */
    public String mo69444a() {
        return this.f60018e.mo69444a();
    }

    /* renamed from: c */
    public C12981s0 mo69445c(URI uri, C12981s0.C12983b bVar) {
        C12981s0 c = this.f60018e.mo69445c(uri, bVar);
        if (c == null) {
            return null;
        }
        return new C12745a(c);
    }
}
