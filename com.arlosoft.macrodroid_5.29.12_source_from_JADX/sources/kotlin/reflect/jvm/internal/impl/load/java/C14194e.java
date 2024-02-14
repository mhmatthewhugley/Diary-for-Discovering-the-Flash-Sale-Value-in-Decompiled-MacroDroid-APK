package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.e */
/* compiled from: specialBuiltinMembers.kt */
public final class C14194e extends C14208h0 {

    /* renamed from: n */
    public static final C14194e f62881n = new C14194e();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.e$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14195a extends C13708q implements C16265l<C13936b, Boolean> {
        final /* synthetic */ C14156y0 $functionDescriptor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14195a(C14156y0 y0Var) {
            super(1);
            this.$functionDescriptor = y0Var;
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C14208h0.f62898a.mo72746j().containsKey(C14470v.m90690d(this.$functionDescriptor)));
        }
    }

    private C14194e() {
    }

    /* renamed from: i */
    public final C16157f mo72721i(C14156y0 y0Var) {
        C13706o.m87929f(y0Var, "functionDescriptor");
        Map<String, C16157f> j = C14208h0.f62898a.mo72746j();
        String d = C14470v.m90690d(y0Var);
        if (d == null) {
            return null;
        }
        return j.get(d);
    }

    /* renamed from: j */
    public final boolean mo72722j(C14156y0 y0Var) {
        C13706o.m87929f(y0Var, "functionDescriptor");
        return C13853h.m88260f0(y0Var) && C16519a.m98610c(y0Var, false, new C14195a(y0Var), 1, (Object) null) != null;
    }

    /* renamed from: k */
    public final boolean mo72723k(C14156y0 y0Var) {
        C13706o.m87929f(y0Var, "<this>");
        return C13706o.m87924a(y0Var.getName().mo78583d(), "removeAt") && C13706o.m87924a(C14470v.m90690d(y0Var), C14208h0.f62898a.mo72744h().mo72750b());
    }
}
