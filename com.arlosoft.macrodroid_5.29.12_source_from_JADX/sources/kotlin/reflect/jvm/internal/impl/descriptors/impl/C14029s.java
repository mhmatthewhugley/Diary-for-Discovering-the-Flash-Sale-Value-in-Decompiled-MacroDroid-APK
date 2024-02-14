package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14702m;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14943l;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14958o;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14975t;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;
import p442yb.C16986f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.s */
/* compiled from: LazySubstitutingClassDescriptor */
public class C14029s extends C14032t {

    /* renamed from: c */
    private final C14032t f62628c;

    /* renamed from: d */
    private final C14945l1 f62629d;

    /* renamed from: f */
    private C14945l1 f62630f;

    /* renamed from: g */
    private List<C13950e1> f62631g;

    /* renamed from: o */
    private List<C13950e1> f62632o;

    /* renamed from: p */
    private C14901e1 f62633p;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.s$a */
    /* compiled from: LazySubstitutingClassDescriptor */
    class C14030a implements C16265l<C13950e1, Boolean> {
        C14030a() {
        }

        /* renamed from: a */
        public Boolean invoke(C13950e1 e1Var) {
            return Boolean.valueOf(!e1Var.mo72269R());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.s$b */
    /* compiled from: LazySubstitutingClassDescriptor */
    class C14031b implements C16265l<C14951m0, C14951m0> {
        C14031b() {
        }

        /* renamed from: a */
        public C14951m0 invoke(C14951m0 m0Var) {
            return C14029s.this.m89167M0(m0Var);
        }
    }

    public C14029s(C14032t tVar, C14945l1 l1Var) {
        this.f62628c = tVar;
        this.f62629d = l1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m89164E0(int r15) {
        /*
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = 2
            goto L_0x0034
        L_0x0033:
            r9 = 3
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "substitute"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "getMemberScope"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a3;
                case 20: goto L_0x009e;
                case 21: goto L_0x0099;
                case 22: goto L_0x0094;
                case 23: goto L_0x00c2;
                case 24: goto L_0x0091;
                case 25: goto L_0x008c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0082;
                case 28: goto L_0x007d;
                case 29: goto L_0x0078;
                case 30: goto L_0x0073;
                case 31: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00c4
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00c4
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00c4
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0091:
            r9[r14] = r11
            goto L_0x00c4
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00c4
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00bc:
            r9[r14] = r12
            goto L_0x00c4
        L_0x00bf:
            r9[r14] = r13
            goto L_0x00c4
        L_0x00c2:
            r9[r14] = r10
        L_0x00c4:
            if (r15 == r7) goto L_0x00db
            if (r15 == r6) goto L_0x00db
            if (r15 == r5) goto L_0x00db
            if (r15 == r4) goto L_0x00db
            if (r15 == r3) goto L_0x00db
            if (r15 == r2) goto L_0x00db
            if (r15 == r1) goto L_0x00d8
            if (r15 == r0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            r9[r7] = r11
            goto L_0x00dd
        L_0x00d8:
            r9[r7] = r12
            goto L_0x00dd
        L_0x00db:
            r9[r7] = r13
        L_0x00dd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x00f7
            if (r15 == r5) goto L_0x00f7
            if (r15 == r4) goto L_0x00f7
            if (r15 == r3) goto L_0x00f7
            if (r15 == r2) goto L_0x00f7
            if (r15 == r1) goto L_0x00f7
            if (r15 == r0) goto L_0x00f7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00fc
        L_0x00f7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00fc:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C14029s.m89164E0(int):void");
    }

    /* renamed from: K0 */
    private C14945l1 m89166K0() {
        if (this.f62630f == null) {
            if (this.f62629d.mo74212k()) {
                this.f62630f = this.f62629d;
            } else {
                List<C13950e1> parameters = this.f62628c.mo62171j().getParameters();
                this.f62631g = new ArrayList(parameters.size());
                this.f62630f = C14975t.m93114b(parameters, this.f62629d.mo74211j(), this, this.f62631g);
                this.f62632o = C13566b0.m87418S(this.f62631g, new C14030a());
            }
        }
        return this.f62630f;
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public C14951m0 m89167M0(C14951m0 m0Var) {
        return (m0Var == null || this.f62629d.mo74212k()) ? m0Var : (C14951m0) m89166K0().mo74215p(m0Var, C14970r1.INVARIANT);
    }

    /* renamed from: D */
    public C13944d mo62149D() {
        return this.f62628c.mo62149D();
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        return this.f62628c.mo62150I0();
    }

    /* renamed from: J0 */
    public C14146w0 mo72283J0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: L0 */
    public C13948e mo72267c(C14945l1 l1Var) {
        if (l1Var == null) {
            m89164E0(23);
        }
        if (l1Var.mo74212k()) {
            return this;
        }
        return new C14029s(this, C14945l1.m92940h(l1Var.mo74211j(), m89166K0().mo74211j()));
    }

    /* renamed from: T */
    public C14692h mo72284T() {
        C14692h T = this.f62628c.mo72284T();
        if (T == null) {
            m89164E0(28);
        }
        return T;
    }

    /* renamed from: U */
    public C13960g1<C14951m0> mo62155U() {
        C13960g1<C14951m0> U = this.f62628c.mo62155U();
        if (U == null) {
            return null;
        }
        return U.mo72300b(new C14031b());
    }

    /* renamed from: X */
    public C14692h mo72285X() {
        C14692h k0 = mo62174k0(C16519a.m98618k(C14650d.m91620g(this.f62628c)));
        if (k0 == null) {
            m89164E0(12);
        }
        return k0;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return this.f62628c.mo62160Y();
    }

    /* renamed from: Z */
    public List<C14146w0> mo72286Z() {
        List<C14146w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m89164E0(17);
        }
        return emptyList;
    }

    /* renamed from: a0 */
    public boolean mo62162a0() {
        return this.f62628c.mo62162a0();
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        C14064m b = this.f62628c.mo62163b();
        if (b == null) {
            m89164E0(22);
        }
        return b;
    }

    /* renamed from: e0 */
    public boolean mo62164e0() {
        return this.f62628c.mo62164e0();
    }

    public C13921g getAnnotations() {
        C13921g annotations = this.f62628c.getAnnotations();
        if (annotations == null) {
            m89164E0(19);
        }
        return annotations;
    }

    public C16157f getName() {
        C16157f name = this.f62628c.getName();
        if (name == null) {
            m89164E0(20);
        }
        return name;
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = C14158z0.f62778a;
        if (z0Var == null) {
            m89164E0(29);
        }
        return z0Var;
    }

    public C14141u getVisibility() {
        C14141u visibility = this.f62628c.getVisibility();
        if (visibility == null) {
            m89164E0(27);
        }
        return visibility;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        C13951f h = this.f62628c.mo62168h();
        if (h == null) {
            m89164E0(25);
        }
        return h;
    }

    /* renamed from: h0 */
    public C14692h mo72309h0(C14936j1 j1Var, C14849g gVar) {
        if (j1Var == null) {
            m89164E0(5);
        }
        if (gVar == null) {
            m89164E0(6);
        }
        C14692h h0 = this.f62628c.mo72309h0(j1Var, gVar);
        if (!this.f62629d.mo74212k()) {
            return new C14702m(h0, m89166K0());
        }
        if (h0 == null) {
            m89164E0(7);
        }
        return h0;
    }

    public boolean isExternal() {
        return this.f62628c.isExternal();
    }

    public boolean isInline() {
        return this.f62628c.isInline();
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        C14901e1 j = this.f62628c.mo62171j();
        if (this.f62629d.mo74212k()) {
            if (j == null) {
                m89164E0(0);
            }
            return j;
        }
        if (this.f62633p == null) {
            C14945l1 K0 = m89166K0();
            Collection<C14900e0> l = j.mo72370l();
            ArrayList arrayList = new ArrayList(l.size());
            for (C14900e0 p : l) {
                arrayList.add(K0.mo74215p(p, C14970r1.INVARIANT));
            }
            this.f62633p = new C14943l(this, this.f62631g, arrayList, C16986f.f68366e);
        }
        C14901e1 e1Var = this.f62633p;
        if (e1Var == null) {
            m89164E0(1);
        }
        return e1Var;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return this.f62628c.mo62172j0();
    }

    /* renamed from: k */
    public Collection<C13944d> mo62173k() {
        Collection<C13944d> k = this.f62628c.mo62173k();
        ArrayList arrayList = new ArrayList(k.size());
        for (C13944d next : k) {
            arrayList.add(((C13944d) next.mo72401t().mo72508n(next.mo72233a()).mo72505k(next.mo62179r()).mo72502h(next.getVisibility()).mo72512r(next.mo72264h()).mo72509o(false).build()).mo72267c(m89166K0()));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public C14692h mo62174k0(C14849g gVar) {
        if (gVar == null) {
            m89164E0(13);
        }
        C14692h k0 = this.f62628c.mo62174k0(gVar);
        if (!this.f62629d.mo74212k()) {
            return new C14702m(k0, m89166K0());
        }
        if (k0 == null) {
            m89164E0(14);
        }
        return k0;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return this.f62628c.mo62175l0();
    }

    /* renamed from: m0 */
    public C14692h mo62176m0() {
        C14692h m0 = this.f62628c.mo62176m0();
        if (m0 == null) {
            m89164E0(15);
        }
        return m0;
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return this.f62628c.mo62177n0();
    }

    /* renamed from: p */
    public C14951m0 mo72274p() {
        C14951m0 j = C14906f0.m92822j(C14958o.f64084a.mo74224a(getAnnotations(), (C14901e1) null, (C14064m) null), mo62171j(), C14956n1.m92992g(mo62171j().getParameters()), false, mo72285X());
        if (j == null) {
            m89164E0(16);
        }
        return j;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        m89166K0();
        List<C13950e1> list = this.f62632o;
        if (list == null) {
            m89164E0(30);
        }
        return list;
    }

    /* renamed from: q0 */
    public C14692h mo72287q0(C14936j1 j1Var) {
        if (j1Var == null) {
            m89164E0(10);
        }
        C14692h h0 = mo72309h0(j1Var, C16519a.m98618k(C14650d.m91620g(this)));
        if (h0 == null) {
            m89164E0(11);
        }
        return h0;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 r = this.f62628c.mo62179r();
        if (r == null) {
            m89164E0(26);
        }
        return r;
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        Collection<C13948e> w = this.f62628c.mo62181w();
        if (w == null) {
            m89164E0(31);
        }
        return w;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72426a(this, d);
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return this.f62628c.mo62182y();
    }

    /* renamed from: a */
    public C13948e m89179a() {
        C13948e a = this.f62628c.mo72233a();
        if (a == null) {
            m89164E0(21);
        }
        return a;
    }
}
