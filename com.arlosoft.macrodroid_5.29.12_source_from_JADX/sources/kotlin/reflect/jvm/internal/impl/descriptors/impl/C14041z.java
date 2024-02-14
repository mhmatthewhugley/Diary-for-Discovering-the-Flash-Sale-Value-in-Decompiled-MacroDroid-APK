package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.z */
/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class C14041z extends C14003k implements C14050k0 {

    /* renamed from: g */
    private final C16152c f62659g;

    /* renamed from: o */
    private final String f62660o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14041z(C13958g0 g0Var, C16152c cVar) {
        super(g0Var, C13921g.f62330v.mo72251b(), cVar.mo78563h(), C14158z0.f62778a);
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(cVar, "fqName");
        this.f62659g = cVar;
        this.f62660o = "package " + cVar + " of " + g0Var;
    }

    /* renamed from: e */
    public final C16152c mo72551e() {
        return this.f62659g;
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = C14158z0.f62778a;
        C13706o.m87928e(z0Var, "NO_SOURCE");
        return z0Var;
    }

    public String toString() {
        return this.f62660o;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        C13706o.m87929f(oVar, "visitor");
        return oVar.mo72432h(this, d);
    }

    /* renamed from: b */
    public C13958g0 m89266b() {
        C14064m b = super.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (C13958g0) b;
    }
}
