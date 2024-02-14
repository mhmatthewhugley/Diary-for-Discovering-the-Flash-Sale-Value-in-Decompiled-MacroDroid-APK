package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* compiled from: typeParameterUtils.kt */
final class C13940c implements C13950e1 {

    /* renamed from: a */
    private final C13950e1 f62412a;

    /* renamed from: c */
    private final C14064m f62413c;

    /* renamed from: d */
    private final int f62414d;

    public C13940c(C13950e1 e1Var, C14064m mVar, int i) {
        C13706o.m87929f(e1Var, "originalDescriptor");
        C13706o.m87929f(mVar, "declarationDescriptor");
        this.f62412a = e1Var;
        this.f62413c = mVar;
        this.f62414d = i;
    }

    /* renamed from: M */
    public C17012n mo72268M() {
        return this.f62412a.mo72268M();
    }

    /* renamed from: R */
    public boolean mo72269R() {
        return true;
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        return this.f62413c;
    }

    public C13921g getAnnotations() {
        return this.f62412a.getAnnotations();
    }

    public C16157f getName() {
        return this.f62412a.getName();
    }

    public C14158z0 getSource() {
        return this.f62412a.getSource();
    }

    public List<C14900e0> getUpperBounds() {
        return this.f62412a.getUpperBounds();
    }

    /* renamed from: i */
    public int mo72272i() {
        return this.f62414d + this.f62412a.mo72272i();
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        return this.f62412a.mo62171j();
    }

    /* renamed from: l */
    public C14970r1 mo72273l() {
        return this.f62412a.mo72273l();
    }

    /* renamed from: p */
    public C14951m0 mo72274p() {
        return this.f62412a.mo72274p();
    }

    public String toString() {
        return this.f62412a + "[inner-copy]";
    }

    /* renamed from: v */
    public boolean mo72276v() {
        return this.f62412a.mo72276v();
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return this.f62412a.mo72277x(oVar, d);
    }

    /* renamed from: a */
    public C13950e1 m88534a() {
        C13950e1 a = this.f62412a.mo72233a();
        C13706o.m87928e(a, "originalDescriptor.original");
        return a;
    }
}
