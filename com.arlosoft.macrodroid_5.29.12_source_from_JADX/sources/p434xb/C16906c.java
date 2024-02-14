package p434xb;

import java.io.InputStream;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13846b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14803q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import p297ja.C13328m;
import p308kb.C13491m;
import p318lb.C15617a;
import p318lb.C15620c;
import p362pb.C16152c;
import p389sb.C16519a;
import p442yb.C17012n;

/* renamed from: xb.c */
/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class C16906c extends C14803q implements C13846b {

    /* renamed from: F */
    public static final C16907a f68156F = new C16907a((C13695i) null);

    /* renamed from: E */
    private final boolean f68157E;

    /* renamed from: xb.c$a */
    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class C16907a {
        private C16907a() {
        }

        public /* synthetic */ C16907a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16906c mo80079a(C16152c cVar, C17012n nVar, C13958g0 g0Var, InputStream inputStream, boolean z) {
            C13706o.m87929f(cVar, "fqName");
            C13706o.m87929f(nVar, "storageManager");
            C13706o.m87929f(g0Var, "module");
            C13706o.m87929f(inputStream, "inputStream");
            C13328m<C13491m, C15617a> a = C15620c.m94872a(inputStream);
            C13491m a2 = a.mo70152a();
            C15617a b = a.mo70153b();
            if (a2 != null) {
                return new C16906c(cVar, nVar, g0Var, a2, b, z, (C13695i) null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C15617a.f64879h + ", actual " + b + ". Please update Kotlin");
        }
    }

    private C16906c(C16152c cVar, C17012n nVar, C13958g0 g0Var, C13491m mVar, C15617a aVar, boolean z) {
        super(cVar, nVar, g0Var, mVar, aVar, (C14750f) null);
        this.f68157E = z;
    }

    public /* synthetic */ C16906c(C16152c cVar, C17012n nVar, C13958g0 g0Var, C13491m mVar, C15617a aVar, boolean z, C13695i iVar) {
        this(cVar, nVar, g0Var, mVar, aVar, z);
    }

    public String toString() {
        return "builtins package fragment for " + mo72551e() + " from " + C16519a.m98619l(this);
    }
}
