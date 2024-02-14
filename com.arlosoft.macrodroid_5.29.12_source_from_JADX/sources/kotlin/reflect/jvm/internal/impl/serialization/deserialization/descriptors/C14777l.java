package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13953f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13980d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13998i0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14942k1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p308kb.C13516r;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C14777l extends C13980d implements C14751g {

    /* renamed from: A */
    private final C15719c f63861A;

    /* renamed from: B */
    private final C15724g f63862B;

    /* renamed from: C */
    private final C15725h f63863C;

    /* renamed from: D */
    private final C14750f f63864D;

    /* renamed from: E */
    private Collection<? extends C13998i0> f63865E;

    /* renamed from: F */
    private C14951m0 f63866F;

    /* renamed from: G */
    private C14951m0 f63867G;

    /* renamed from: H */
    private List<? extends C13950e1> f63868H;

    /* renamed from: I */
    private C14951m0 f63869I;

    /* renamed from: s */
    private final C17012n f63870s;

    /* renamed from: z */
    private final C13516r f63871z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14777l(p442yb.C17012n r13, kotlin.reflect.jvm.internal.impl.descriptors.C14064m r14, kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g r15, p362pb.C16157f r16, kotlin.reflect.jvm.internal.impl.descriptors.C14141u r17, p308kb.C13516r r18, p327mb.C15719c r19, p327mb.C15724g r20, p327mb.C15725h r21, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r13
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r1 = r14
            kotlin.jvm.internal.C13706o.m87929f(r14, r0)
            java.lang.String r0 = "annotations"
            r2 = r15
            kotlin.jvm.internal.C13706o.m87929f(r15, r0)
            java.lang.String r0 = "name"
            r3 = r16
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "visibility"
            r5 = r17
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.C14158z0.f62778a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f63870s = r7
            r6.f63871z = r8
            r6.f63861A = r9
            r6.f63862B = r10
            r6.f63863C = r11
            r0 = r22
            r6.f63864D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14777l.<init>(yb.n, kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, pb.f, kotlin.reflect.jvm.internal.impl.descriptors.u, kb.r, mb.c, mb.g, mb.h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f):void");
    }

    /* renamed from: E */
    public C15724g mo73856E() {
        return this.f63862B;
    }

    /* renamed from: G */
    public C14951m0 mo72280G() {
        C14951m0 m0Var = this.f63867G;
        if (m0Var != null) {
            return m0Var;
        }
        C13706o.m87945v("expandedType");
        return null;
    }

    /* renamed from: I */
    public C15719c mo73857I() {
        return this.f63861A;
    }

    /* renamed from: J */
    public C14750f mo73858J() {
        return this.f63864D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C17012n mo72363M() {
        return this.f63870s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public List<C13950e1> mo72364M0() {
        List<? extends C13950e1> list = this.f63868H;
        if (list != null) {
            return list;
        }
        C13706o.m87945v("typeConstructorParameters");
        return null;
    }

    /* renamed from: O0 */
    public C13516r mo73933O0() {
        return this.f63871z;
    }

    /* renamed from: P0 */
    public C15725h mo73934P0() {
        return this.f63863C;
    }

    /* renamed from: Q0 */
    public final void mo73935Q0(List<? extends C13950e1> list, C14951m0 m0Var, C14951m0 m0Var2) {
        C13706o.m87929f(list, "declaredTypeParameters");
        C13706o.m87929f(m0Var, "underlyingType");
        C13706o.m87929f(m0Var2, "expandedType");
        mo72365N0(list);
        this.f63866F = m0Var;
        this.f63867G = m0Var2;
        this.f63868H = C13953f1.m88588d(this);
        this.f63869I = mo72360G0();
        this.f63865E = mo72362L0();
    }

    /* renamed from: R0 */
    public C13947d1 mo72267c(C14945l1 l1Var) {
        C13706o.m87929f(l1Var, "substitutor");
        if (l1Var.mo74212k()) {
            return this;
        }
        C17012n M = mo72363M();
        C14064m b = mo62163b();
        C13706o.m87928e(b, "containingDeclaration");
        C13921g annotations = getAnnotations();
        C13706o.m87928e(annotations, "annotations");
        C16157f name = getName();
        C13706o.m87928e(name, "name");
        C14777l lVar = new C14777l(M, b, annotations, name, getVisibility(), mo73933O0(), mo73857I(), mo73856E(), mo73934P0(), mo73858J());
        List<C13950e1> q = mo62178q();
        C14951m0 t0 = mo72282t0();
        C14970r1 r1Var = C14970r1.INVARIANT;
        C14900e0 n = l1Var.mo74214n(t0, r1Var);
        C13706o.m87928e(n, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        C14951m0 a = C14942k1.m92921a(n);
        C14900e0 n2 = l1Var.mo74214n(mo72280G(), r1Var);
        C13706o.m87928e(n2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        lVar.mo73935Q0(q, a, C14942k1.m92921a(n2));
        return lVar;
    }

    /* renamed from: p */
    public C14951m0 mo72274p() {
        C14951m0 m0Var = this.f63869I;
        if (m0Var != null) {
            return m0Var;
        }
        C13706o.m87945v("defaultTypeImpl");
        return null;
    }

    /* renamed from: s */
    public C13948e mo72281s() {
        if (C14925g0.m92873a(mo72280G())) {
            return null;
        }
        C13961h c = mo72280G().mo73702N0().mo62183c();
        if (c instanceof C13948e) {
            return (C13948e) c;
        }
        return null;
    }

    /* renamed from: t0 */
    public C14951m0 mo72282t0() {
        C14951m0 m0Var = this.f63866F;
        if (m0Var != null) {
            return m0Var;
        }
        C13706o.m87945v("underlyingType");
        return null;
    }
}
