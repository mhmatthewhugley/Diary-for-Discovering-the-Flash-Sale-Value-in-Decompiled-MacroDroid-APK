package p224cb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14054l1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;

/* renamed from: cb.b */
/* compiled from: JavaVisibilities.kt */
public final class C11168b extends C14068m1 {

    /* renamed from: c */
    public static final C11168b f54075c = new C11168b();

    private C11168b() {
        super("protected_and_package", true);
    }

    /* renamed from: a */
    public Integer mo62370a(C14068m1 m1Var) {
        C13706o.m87929f(m1Var, "visibility");
        if (C13706o.m87924a(this, m1Var)) {
            return 0;
        }
        if (m1Var == C14054l1.C14056b.f62675c) {
            return null;
        }
        return Integer.valueOf(C14054l1.f62671a.mo72565b(m1Var) ? 1 : -1);
    }

    /* renamed from: b */
    public String mo62371b() {
        return "protected/*protected and package*/";
    }

    /* renamed from: d */
    public C14068m1 mo62372d() {
        return C14054l1.C14061g.f62680c;
    }
}
