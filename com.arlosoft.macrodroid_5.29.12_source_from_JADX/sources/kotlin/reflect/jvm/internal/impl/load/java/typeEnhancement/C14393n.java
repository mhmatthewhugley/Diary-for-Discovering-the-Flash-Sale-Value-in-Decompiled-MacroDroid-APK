package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13913a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.load.java.C14164b;
import kotlin.reflect.jvm.internal.impl.load.java.C14191d;
import kotlin.reflect.jvm.internal.impl.load.java.C14406x;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14237e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14297m;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14964p1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14865q;
import p218bc.C11134i;
import p218bc.C11140o;
import p218bc.C11145r;
import p271gb.C12336g;
import p362pb.C16153d;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n */
/* compiled from: signatureEnhancement.kt */
final class C14393n extends C14338a<C13915c> {

    /* renamed from: a */
    private final C13913a f63161a;

    /* renamed from: b */
    private final boolean f63162b;

    /* renamed from: c */
    private final C14301g f63163c;

    /* renamed from: d */
    private final C14164b f63164d;

    /* renamed from: e */
    private final boolean f63165e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14393n(C13913a aVar, boolean z, C14301g gVar, C14164b bVar, boolean z2, int i, C13695i iVar) {
        this(aVar, z, gVar, bVar, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: A */
    public boolean mo72981A(C11134i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return ((C14900e0) iVar).mo74145Q0() instanceof C14351g;
    }

    /* renamed from: D */
    public C14191d mo72983h() {
        return this.f63163c.mo72914a().mo72763a();
    }

    /* renamed from: E */
    public C14900e0 mo72990p(C11134i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return C14964p1.m93054a((C14900e0) iVar);
    }

    /* renamed from: F */
    public boolean mo72992r(C13915c cVar) {
        C13706o.m87929f(cVar, "<this>");
        return ((cVar instanceof C12336g) && ((C12336g) cVar).mo68666f()) || ((cVar instanceof C14237e) && !mo72989o() && (((C14237e) cVar).mo72807k() || mo72986l() == C14164b.TYPE_PARAMETER_BOUNDS));
    }

    /* renamed from: G */
    public C11145r mo72995v() {
        return C14865q.f63991a;
    }

    /* renamed from: i */
    public Iterable<C13915c> mo72984i(C11134i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return ((C14900e0) iVar).getAnnotations();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getAnnotations();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c> mo72985k() {
        /*
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r0 = r1.f63161a
            if (r0 == 0) goto L_0x000b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            if (r0 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            java.util.List r0 = kotlin.collections.C13614t.m87748j()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14393n.mo72985k():java.lang.Iterable");
    }

    /* renamed from: l */
    public C14164b mo72986l() {
        return this.f63164d;
    }

    /* renamed from: m */
    public C14406x mo72987m() {
        return this.f63163c.mo72915b();
    }

    /* renamed from: n */
    public boolean mo72988n() {
        C13913a aVar = this.f63161a;
        return (aVar instanceof C13966i1) && ((C13966i1) aVar).mo72306v0() != null;
    }

    /* renamed from: o */
    public boolean mo72989o() {
        return this.f63163c.mo72914a().mo72779q().mo72789c();
    }

    /* renamed from: s */
    public C16153d mo72993s(C11134i iVar) {
        C13706o.m87929f(iVar, "<this>");
        C13948e f = C14956n1.m92991f((C14900e0) iVar);
        if (f != null) {
            return C14650d.m91626m(f);
        }
        return null;
    }

    /* renamed from: u */
    public boolean mo72994u() {
        return this.f63165e;
    }

    /* renamed from: w */
    public boolean mo72996w(C11134i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return C13853h.m88259e0((C14900e0) iVar);
    }

    /* renamed from: x */
    public boolean mo72997x() {
        return this.f63162b;
    }

    /* renamed from: y */
    public boolean mo72998y(C11134i iVar, C11134i iVar2) {
        C13706o.m87929f(iVar, "<this>");
        C13706o.m87929f(iVar2, "other");
        return this.f63163c.mo72914a().mo72773k().mo74059b((C14900e0) iVar, (C14900e0) iVar2);
    }

    /* renamed from: z */
    public boolean mo72999z(C11140o oVar) {
        C13706o.m87929f(oVar, "<this>");
        return oVar instanceof C14297m;
    }

    public C14393n(C13913a aVar, boolean z, C14301g gVar, C14164b bVar, boolean z2) {
        C13706o.m87929f(gVar, "containerContext");
        C13706o.m87929f(bVar, "containerApplicabilityType");
        this.f63161a = aVar;
        this.f63162b = z;
        this.f63163c = gVar;
        this.f63164d = bVar;
        this.f63165e = z2;
    }
}
