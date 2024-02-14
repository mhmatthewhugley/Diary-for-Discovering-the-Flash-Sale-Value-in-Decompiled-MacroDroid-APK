package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.w0 */
/* compiled from: TypeAliasExpansion.kt */
public final class C14985w0 {

    /* renamed from: e */
    public static final C14986a f64111e = new C14986a((C13695i) null);

    /* renamed from: a */
    private final C14985w0 f64112a;

    /* renamed from: b */
    private final C13947d1 f64113b;

    /* renamed from: c */
    private final List<C14926g1> f64114c;

    /* renamed from: d */
    private final Map<C13950e1, C14926g1> f64115d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.w0$a */
    /* compiled from: TypeAliasExpansion.kt */
    public static final class C14986a {
        private C14986a() {
        }

        public /* synthetic */ C14986a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14985w0 mo74246a(C14985w0 w0Var, C13947d1 d1Var, List<? extends C14926g1> list) {
            C13706o.m87929f(d1Var, "typeAliasDescriptor");
            C13706o.m87929f(list, "arguments");
            List<C13950e1> parameters = d1Var.mo62171j().getParameters();
            C13706o.m87928e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
            for (C13950e1 a : parameters) {
                arrayList.add(a.mo72233a());
            }
            return new C14985w0(w0Var, d1Var, list, C13615t0.m87768r(C13566b0.m87413N0(arrayList, list)), (C13695i) null);
        }
    }

    private C14985w0(C14985w0 w0Var, C13947d1 d1Var, List<? extends C14926g1> list, Map<C13950e1, ? extends C14926g1> map) {
        this.f64112a = w0Var;
        this.f64113b = d1Var;
        this.f64114c = list;
        this.f64115d = map;
    }

    public /* synthetic */ C14985w0(C14985w0 w0Var, C13947d1 d1Var, List list, Map map, C13695i iVar) {
        this(w0Var, d1Var, list, map);
    }

    /* renamed from: a */
    public final List<C14926g1> mo74242a() {
        return this.f64114c;
    }

    /* renamed from: b */
    public final C13947d1 mo74243b() {
        return this.f64113b;
    }

    /* renamed from: c */
    public final C14926g1 mo74244c(C14901e1 e1Var) {
        C13706o.m87929f(e1Var, "constructor");
        C13961h c = e1Var.mo62183c();
        if (c instanceof C13950e1) {
            return this.f64115d.get(c);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo74245d(C13947d1 d1Var) {
        C13706o.m87929f(d1Var, "descriptor");
        if (!C13706o.m87924a(this.f64113b, d1Var)) {
            C14985w0 w0Var = this.f64112a;
            return w0Var != null ? w0Var.mo74245d(d1Var) : false;
        }
    }
}
