package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import p218bc.C11126a;
import p218bc.C11127b;
import p218bc.C11129d;
import p218bc.C11130e;
import p218bc.C11134i;
import p218bc.C11136k;
import p218bc.C11137l;
import p218bc.C11138m;
import p218bc.C11139n;
import p218bc.C11140o;
import p218bc.C11141p;
import p218bc.C11148t;
import p218bc.C11149u;
import p272gc.C12354e;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.f */
/* compiled from: AbstractTypeChecker.kt */
public final class C14902f {

    /* renamed from: a */
    public static final C14902f f64032a = new C14902f();

    /* renamed from: b */
    public static boolean f64033b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f$a */
    /* compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class C14903a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64034a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f64035b;

        static {
            int[] iArr = new int[C11149u.values().length];
            iArr[C11149u.INV.ordinal()] = 1;
            iArr[C11149u.OUT.ordinal()] = 2;
            iArr[C11149u.IN.ordinal()] = 3;
            f64034a = iArr;
            int[] iArr2 = new int[C14889d1.C14892b.values().length];
            iArr2[C14889d1.C14892b.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[C14889d1.C14892b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[C14889d1.C14892b.SKIP_LOWER.ordinal()] = 3;
            f64035b = iArr2;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f$b */
    /* compiled from: AbstractTypeChecker.kt */
    static final class C14904b extends C13708q implements C16265l<C14889d1.C14890a, C13339u> {
        final /* synthetic */ C14889d1 $state;
        final /* synthetic */ C11136k $superType;
        final /* synthetic */ List<C11136k> $supertypesWithSameConstructor;
        final /* synthetic */ C11141p $this_with;

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.f$b$a */
        /* compiled from: AbstractTypeChecker.kt */
        static final class C14905a extends C13708q implements C16254a<Boolean> {
            final /* synthetic */ C14889d1 $state;
            final /* synthetic */ C11136k $subTypeArguments;
            final /* synthetic */ C11136k $superType;
            final /* synthetic */ C11141p $this_with;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14905a(C14889d1 d1Var, C11141p pVar, C11136k kVar, C11136k kVar2) {
                super(0);
                this.$state = d1Var;
                this.$this_with = pVar;
                this.$subTypeArguments = kVar;
                this.$superType = kVar2;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(C14902f.f64032a.mo74151q(this.$state, this.$this_with.mo62268B0(this.$subTypeArguments), this.$superType));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14904b(List<? extends C11136k> list, C14889d1 d1Var, C11141p pVar, C11136k kVar) {
            super(1);
            this.$supertypesWithSameConstructor = list;
            this.$state = d1Var;
            this.$this_with = pVar;
            this.$superType = kVar;
        }

        /* renamed from: a */
        public final void mo74154a(C14889d1.C14890a aVar) {
            C13706o.m87929f(aVar, "$this$runForkingPoint");
            for (C11136k aVar2 : this.$supertypesWithSameConstructor) {
                aVar.mo74139a(new C14905a(this.$state, this.$this_with, aVar2, this.$superType));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74154a((C14889d1.C14890a) obj);
            return C13339u.f61331a;
        }
    }

    private C14902f() {
    }

    /* renamed from: a */
    private final Boolean m92789a(C14889d1 d1Var, C11136k kVar, C11136k kVar2) {
        C11141p j = d1Var.mo74131j();
        if (!j.mo62293b0(kVar) && !j.mo62293b0(kVar2)) {
            return null;
        }
        if (m92792d(j, kVar) && m92792d(j, kVar2)) {
            return Boolean.TRUE;
        }
        if (j.mo62293b0(kVar)) {
            if (m92793e(j, d1Var, kVar, kVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j.mo62293b0(kVar2) && (m92791c(j, kVar) || m92793e(j, d1Var, kVar2, kVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m92790b(C11141p pVar, C11136k kVar) {
        if (!(kVar instanceof C11129d)) {
            return false;
        }
        C11138m C0 = pVar.mo62270C0(pVar.mo62267B((C11129d) kVar));
        if (pVar.mo62336z0(C0) || !pVar.mo62293b0(pVar.mo62301f0(pVar.mo62326u(C0)))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m92791c(p218bc.C11141p r3, p218bc.C11136k r4) {
        /*
            bc.n r4 = r3.mo62292b(r4)
            boolean r0 = r4 instanceof p218bc.C11133h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            java.util.Collection r4 = r3.mo62273E(r4)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r3 = 0
            goto L_0x003c
        L_0x001a:
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r4.next()
            bc.i r0 = (p218bc.C11134i) r0
            bc.k r0 = r3.mo62298e(r0)
            if (r0 == 0) goto L_0x0038
            boolean r0 = r3.mo62293b0(r0)
            if (r0 != r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x001e
            r3 = 1
        L_0x003c:
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14902f.m92791c(bc.p, bc.k):boolean");
    }

    /* renamed from: d */
    private static final boolean m92792d(C11141p pVar, C11136k kVar) {
        return pVar.mo62293b0(kVar) || m92790b(pVar, kVar);
    }

    /* renamed from: e */
    private static final boolean m92793e(C11141p pVar, C14889d1 d1Var, C11136k kVar, C11136k kVar2, boolean z) {
        boolean z2;
        Collection<C11134i> c0 = pVar.mo62295c0(kVar);
        if (!(c0 instanceof Collection) || !c0.isEmpty()) {
            for (C11134i iVar : c0) {
                if (C13706o.m87924a(pVar.mo62285T(iVar), pVar.mo62292b(kVar2)) || (z && m92802t(f64032a, d1Var, kVar2, iVar, false, 8, (Object) null))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r10 != false) goto L_0x0129;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Boolean m92794f(kotlin.reflect.jvm.internal.impl.types.C14889d1 r15, p218bc.C11136k r16, p218bc.C11136k r17) {
        /*
            r14 = this;
            r7 = r16
            r8 = r17
            bc.p r9 = r15.mo74131j()
            boolean r0 = r9.mo62310k(r7)
            r10 = 0
            if (r0 != 0) goto L_0x014d
            boolean r0 = r9.mo62310k(r8)
            if (r0 == 0) goto L_0x0017
            goto L_0x014d
        L_0x0017:
            boolean r0 = r9.mo62297d0(r7)
            r11 = 1
            if (r0 == 0) goto L_0x0038
            boolean r0 = r9.mo62297d0(r8)
            if (r0 == 0) goto L_0x0038
            kotlin.reflect.jvm.internal.impl.types.f r0 = f64032a
            boolean r0 = r0.m92801p(r9, r7, r8)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r15.mo74135n()
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r10 = 1
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x0038:
            boolean r0 = r9.mo62303g0(r7)
            if (r0 != 0) goto L_0x0143
            boolean r0 = r9.mo62303g0(r8)
            if (r0 == 0) goto L_0x0046
            goto L_0x0143
        L_0x0046:
            bc.e r0 = r9.mo62282N(r8)
            if (r0 == 0) goto L_0x0052
            bc.k r0 = r9.mo62275F(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r0 = r8
        L_0x0053:
            bc.d r0 = r9.mo62296d(r0)
            r12 = 0
            if (r0 == 0) goto L_0x005f
            bc.i r1 = r9.mo62271D(r0)
            goto L_0x0060
        L_0x005f:
            r1 = r12
        L_0x0060:
            if (r0 == 0) goto L_0x00b2
            if (r1 == 0) goto L_0x00b2
            boolean r2 = r9.mo62332x0(r8)
            if (r2 == 0) goto L_0x0071
            bc.i r1 = r9.mo62312l(r1, r11)
        L_0x006e:
            r13 = r15
            r3 = r1
            goto L_0x007c
        L_0x0071:
            boolean r2 = r9.mo62280K(r8)
            if (r2 == 0) goto L_0x006e
            bc.i r1 = r9.mo62290Y(r1)
            goto L_0x006e
        L_0x007c:
            kotlin.reflect.jvm.internal.impl.types.d1$b r0 = r15.mo74128g(r7, r0)
            int[] r1 = kotlin.reflect.jvm.internal.impl.types.C14902f.C14903a.f64035b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r11) goto L_0x00a0
            r1 = 2
            if (r0 == r1) goto L_0x008e
            goto L_0x00b3
        L_0x008e:
            kotlin.reflect.jvm.internal.impl.types.f r0 = f64032a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m92802t(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00a0:
            kotlin.reflect.jvm.internal.impl.types.f r0 = f64032a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m92802t(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00b2:
            r13 = r15
        L_0x00b3:
            bc.n r0 = r9.mo62292b(r8)
            boolean r1 = r9.mo62317o0(r0)
            if (r1 == 0) goto L_0x00f5
            r9.mo62332x0(r8)
            java.util.Collection r0 = r9.mo62273E(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00d0
        L_0x00ce:
            r10 = 1
            goto L_0x00f0
        L_0x00d0:
            java.util.Iterator r8 = r0.iterator()
        L_0x00d4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r8.next()
            r3 = r0
            bc.i r3 = (p218bc.C11134i) r3
            kotlin.reflect.jvm.internal.impl.types.f r0 = f64032a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m92802t(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00d4
        L_0x00f0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x00f5:
            bc.n r0 = r9.mo62292b(r7)
            boolean r1 = r7 instanceof p218bc.C11129d
            if (r1 != 0) goto L_0x0129
            boolean r1 = r9.mo62317o0(r0)
            if (r1 == 0) goto L_0x0142
            java.util.Collection r0 = r9.mo62273E(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0113
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0113
        L_0x0111:
            r10 = 1
            goto L_0x0127
        L_0x0113:
            java.util.Iterator r0 = r0.iterator()
        L_0x0117:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r0.next()
            bc.i r1 = (p218bc.C11134i) r1
            boolean r1 = r1 instanceof p218bc.C11129d
            if (r1 != 0) goto L_0x0117
        L_0x0127:
            if (r10 == 0) goto L_0x0142
        L_0x0129:
            kotlin.reflect.jvm.internal.impl.types.f r0 = f64032a
            bc.p r1 = r15.mo74131j()
            bc.o r0 = r0.m92798m(r1, r8, r7)
            if (r0 == 0) goto L_0x0142
            bc.n r1 = r9.mo62292b(r8)
            boolean r0 = r9.mo62286U(r0, r1)
            if (r0 == 0) goto L_0x0142
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0142:
            return r12
        L_0x0143:
            r13 = r15
            boolean r0 = r15.mo74135n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x014d:
            r13 = r15
            boolean r0 = r15.mo74134m()
            if (r0 == 0) goto L_0x0157
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0157:
            boolean r0 = r9.mo62332x0(r7)
            if (r0 == 0) goto L_0x0166
            boolean r0 = r9.mo62332x0(r8)
            if (r0 != 0) goto L_0x0166
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0166:
            kotlin.reflect.jvm.internal.impl.types.d r0 = kotlin.reflect.jvm.internal.impl.types.C14883d.f64003a
            bc.k r1 = r9.mo62291a(r7, r10)
            bc.k r2 = r9.mo62291a(r8, r10)
            boolean r0 = r0.mo74112b(r9, r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14902f.m92794f(kotlin.reflect.jvm.internal.impl.types.d1, bc.k, bc.k):java.lang.Boolean");
    }

    /* renamed from: g */
    private final List<C11136k> m92795g(C14889d1 d1Var, C11136k kVar, C11139n nVar) {
        C14889d1.C14893c cVar;
        C11141p j = d1Var.mo74131j();
        List<C11136k> E0 = j.mo62274E0(kVar, nVar);
        if (E0 != null) {
            return E0;
        }
        if (!j.mo62330w0(nVar) && j.mo62320q0(kVar)) {
            return C13614t.m87748j();
        }
        if (!j.mo62328v(nVar)) {
            C12354e eVar = new C12354e();
            d1Var.mo74132k();
            ArrayDeque<C11136k> h = d1Var.mo74129h();
            C13706o.m87926c(h);
            Set<C11136k> i = d1Var.mo74130i();
            C13706o.m87926c(i);
            h.push(kVar);
            while (!h.isEmpty()) {
                if (i.size() <= 1000) {
                    C11136k pop = h.pop();
                    C13706o.m87928e(pop, "current");
                    if (i.add(pop)) {
                        C11136k s = j.mo62323s(pop, C11127b.FOR_SUBTYPING);
                        if (s == null) {
                            s = pop;
                        }
                        if (j.mo62289X(j.mo62292b(s), nVar)) {
                            eVar.add(s);
                            cVar = C14889d1.C14893c.C14896c.f64025a;
                        } else if (j.mo62322r0(s) == 0) {
                            cVar = C14889d1.C14893c.C14895b.f64024a;
                        } else {
                            cVar = d1Var.mo74131j().mo62324t(s);
                        }
                        if (!(!C13706o.m87924a(cVar, C14889d1.C14893c.C14896c.f64025a))) {
                            cVar = null;
                        }
                        if (cVar != null) {
                            C11141p j2 = d1Var.mo74131j();
                            for (C11134i a : j2.mo62273E(j2.mo62292b(pop))) {
                                h.add(cVar.mo74058a(d1Var, a));
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C13566b0.m87432g0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null)).toString());
                }
            }
            d1Var.mo74127e();
            return eVar;
        } else if (!j.mo62289X(j.mo62292b(kVar), nVar)) {
            return C13614t.m87748j();
        } else {
            C11136k s2 = j.mo62323s(kVar, C11127b.FOR_SUBTYPING);
            if (s2 != null) {
                kVar = s2;
            }
            return C13612s.m87736e(kVar);
        }
    }

    /* renamed from: h */
    private final List<C11136k> m92796h(C14889d1 d1Var, C11136k kVar, C11139n nVar) {
        return m92805w(d1Var, m92795g(d1Var, kVar, nVar));
    }

    /* renamed from: i */
    private final boolean m92797i(C14889d1 d1Var, C11134i iVar, C11134i iVar2, boolean z) {
        C11141p j = d1Var.mo74131j();
        C11134i o = d1Var.mo74136o(d1Var.mo74137p(iVar));
        C11134i o2 = d1Var.mo74136o(d1Var.mo74137p(iVar2));
        C14902f fVar = f64032a;
        Boolean f = fVar.m92794f(d1Var, j.mo62314m0(o), j.mo62301f0(o2));
        if (f != null) {
            boolean booleanValue = f.booleanValue();
            d1Var.mo74126c(o, o2, z);
            return booleanValue;
        }
        Boolean c = d1Var.mo74126c(o, o2, z);
        if (c != null) {
            return c.booleanValue();
        }
        return fVar.m92803u(d1Var, j.mo62314m0(o), j.mo62301f0(o2));
    }

    /* renamed from: m */
    private final C11140o m92798m(C11141p pVar, C11134i iVar, C11134i iVar2) {
        C11134i u;
        int r0 = pVar.mo62322r0(iVar);
        int i = 0;
        while (true) {
            C11138m mVar = null;
            if (i >= r0) {
                return null;
            }
            C11138m A = pVar.mo62265A(iVar, i);
            boolean z = true;
            if (!pVar.mo62336z0(A)) {
                mVar = A;
            }
            if (!(mVar == null || (u = pVar.mo62326u(mVar)) == null)) {
                if (!pVar.mo62299e0(pVar.mo62314m0(u)) || !pVar.mo62299e0(pVar.mo62314m0(iVar2))) {
                    z = false;
                }
                if (!C13706o.m87924a(u, iVar2) && (!z || !C13706o.m87924a(pVar.mo62285T(u), pVar.mo62285T(iVar2)))) {
                    C11140o m = m92798m(pVar, u, iVar2);
                    if (m != null) {
                        return m;
                    }
                }
            }
            i++;
        }
        return pVar.mo62276G(pVar.mo62285T(iVar), i);
    }

    /* renamed from: n */
    private final boolean m92799n(C14889d1 d1Var, C11136k kVar) {
        C14889d1.C14893c cVar;
        C11141p j = d1Var.mo74131j();
        C11139n b = j.mo62292b(kVar);
        if (j.mo62330w0(b)) {
            return j.mo62319p0(b);
        }
        if (j.mo62319p0(j.mo62292b(kVar))) {
            return true;
        }
        d1Var.mo74132k();
        ArrayDeque<C11136k> h = d1Var.mo74129h();
        C13706o.m87926c(h);
        Set<C11136k> i = d1Var.mo74130i();
        C13706o.m87926c(i);
        h.push(kVar);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                C11136k pop = h.pop();
                C13706o.m87928e(pop, "current");
                if (i.add(pop)) {
                    if (j.mo62320q0(pop)) {
                        cVar = C14889d1.C14893c.C14896c.f64025a;
                    } else {
                        cVar = C14889d1.C14893c.C14895b.f64024a;
                    }
                    if (!(!C13706o.m87924a(cVar, C14889d1.C14893c.C14896c.f64025a))) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        C11141p j2 = d1Var.mo74131j();
                        for (C11134i a : j2.mo62273E(j2.mo62292b(pop))) {
                            C11136k a2 = cVar.mo74058a(d1Var, a);
                            if (j.mo62319p0(j.mo62292b(a2))) {
                                d1Var.mo74127e();
                                return true;
                            }
                            h.add(a2);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C13566b0.m87432g0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null)).toString());
            }
        }
        d1Var.mo74127e();
        return false;
    }

    /* renamed from: o */
    private final boolean m92800o(C11141p pVar, C11134i iVar) {
        return pVar.mo62278I(pVar.mo62285T(iVar)) && !pVar.mo62329w(iVar) && !pVar.mo62280K(iVar) && !pVar.mo62266A0(iVar) && C13706o.m87924a(pVar.mo62292b(pVar.mo62314m0(iVar)), pVar.mo62292b(pVar.mo62301f0(iVar)));
    }

    /* renamed from: p */
    private final boolean m92801p(C11141p pVar, C11136k kVar, C11136k kVar2) {
        C11136k kVar3;
        C11136k kVar4;
        C11130e N = pVar.mo62282N(kVar);
        if (N == null || (kVar3 = pVar.mo62275F(N)) == null) {
            kVar3 = kVar;
        }
        C11130e N2 = pVar.mo62282N(kVar2);
        if (N2 == null || (kVar4 = pVar.mo62275F(N2)) == null) {
            kVar4 = kVar2;
        }
        if (pVar.mo62292b(kVar3) != pVar.mo62292b(kVar4)) {
            return false;
        }
        if (!pVar.mo62280K(kVar) && pVar.mo62280K(kVar2)) {
            return false;
        }
        if (!pVar.mo62332x0(kVar) || pVar.mo62332x0(kVar2)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m92802t(C14902f fVar, C14889d1 d1Var, C11134i iVar, C11134i iVar2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return fVar.mo74153s(d1Var, iVar, iVar2, z);
    }

    /* renamed from: u */
    private final boolean m92803u(C14889d1 d1Var, C11136k kVar, C11136k kVar2) {
        C11134i u;
        C14889d1 d1Var2 = d1Var;
        C11136k kVar3 = kVar;
        C11136k kVar4 = kVar2;
        C11141p j = d1Var.mo74131j();
        if (f64033b) {
            if (!j.mo62300f(kVar3) && !j.mo62317o0(j.mo62292b(kVar3))) {
                boolean l = d1Var.mo74133l(kVar);
            }
            if (!j.mo62300f(kVar4)) {
                boolean l2 = d1Var2.mo74133l(kVar4);
            }
        }
        if (!C14835c.f63961a.mo74055d(d1Var2, kVar3, kVar4)) {
            return false;
        }
        C14902f fVar = f64032a;
        Boolean a = fVar.m92789a(d1Var2, j.mo62314m0(kVar3), j.mo62301f0(kVar4));
        if (a != null) {
            boolean booleanValue = a.booleanValue();
            C14889d1.m92739d(d1Var, kVar, kVar2, false, 4, (Object) null);
            return booleanValue;
        }
        C11139n b = j.mo62292b(kVar4);
        if ((j.mo62289X(j.mo62292b(kVar3), b) && j.mo62307i0(b) == 0) || j.mo62277H(j.mo62292b(kVar4))) {
            return true;
        }
        List<C11136k> l3 = fVar.mo74150l(d1Var2, kVar3, b);
        int i = 10;
        ArrayList<C11136k> arrayList = new ArrayList<>(C13616u.m87774u(l3, 10));
        for (C11136k kVar5 : l3) {
            C11136k e = j.mo62298e(d1Var2.mo74136o(kVar5));
            if (e != null) {
                kVar5 = e;
            }
            arrayList.add(kVar5);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f64032a.m92799n(d1Var2, kVar3);
        }
        if (size == 1) {
            return f64032a.mo74151q(d1Var2, j.mo62268B0((C11136k) C13566b0.m87422W(arrayList)), kVar4);
        }
        C11126a aVar = new C11126a(j.mo62307i0(b));
        int i0 = j.mo62307i0(b);
        int i2 = 0;
        boolean z = false;
        while (i2 < i0) {
            z = z || j.mo62304h(j.mo62276G(b, i2)) != C11149u.OUT;
            if (!z) {
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, i));
                for (C11136k kVar6 : arrayList) {
                    C11138m k0 = j.mo62311k0(kVar6, i2);
                    if (k0 != null) {
                        if (!(j.mo62313l0(k0) == C11149u.INV)) {
                            k0 = null;
                        }
                        if (!(k0 == null || (u = j.mo62326u(k0)) == null)) {
                            arrayList2.add(u);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + kVar6 + ", subType: " + kVar3 + ", superType: " + kVar4).toString());
                }
                aVar.add(j.mo62333y(j.mo62309j0(arrayList2)));
            }
            i2++;
            i = 10;
        }
        if (z || !f64032a.mo74151q(d1Var2, aVar, kVar4)) {
            return d1Var2.mo74138q(new C14904b(arrayList, d1Var2, j, kVar4));
        }
        return true;
    }

    /* renamed from: v */
    private final boolean m92804v(C11141p pVar, C11134i iVar, C11134i iVar2, C11139n nVar) {
        C11140o x;
        C11136k e = pVar.mo62298e(iVar);
        if (!(e instanceof C11129d)) {
            return false;
        }
        C11129d dVar = (C11129d) e;
        if (pVar.mo62279J(dVar) || !pVar.mo62336z0(pVar.mo62270C0(pVar.mo62267B(dVar))) || pVar.mo62284S(dVar) != C11127b.FOR_SUBTYPING) {
            return false;
        }
        C11139n T = pVar.mo62285T(iVar2);
        C11148t tVar = T instanceof C11148t ? (C11148t) T : null;
        if (tVar == null || (x = pVar.mo62331x(tVar)) == null || !pVar.mo62286U(x, nVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private final List<C11136k> m92805w(C14889d1 d1Var, List<? extends C11136k> list) {
        C11141p j = d1Var.mo74131j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C11137l B0 = j.mo62268B0((C11136k) next);
            int j2 = j.mo62308j(B0);
            int i = 0;
            while (true) {
                if (i >= j2) {
                    break;
                }
                if (!(j.mo62281L(j.mo62326u(j.mo62315n(B0, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    /* renamed from: j */
    public final C11149u mo74148j(C11149u uVar, C11149u uVar2) {
        C13706o.m87929f(uVar, "declared");
        C13706o.m87929f(uVar2, "useSite");
        C11149u uVar3 = C11149u.INV;
        if (uVar == uVar3) {
            return uVar2;
        }
        if (uVar2 == uVar3 || uVar == uVar2) {
            return uVar;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo74149k(C14889d1 d1Var, C11134i iVar, C11134i iVar2) {
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(iVar, "a");
        C13706o.m87929f(iVar2, "b");
        C11141p j = d1Var.mo74131j();
        if (iVar == iVar2) {
            return true;
        }
        C14902f fVar = f64032a;
        if (fVar.m92800o(j, iVar) && fVar.m92800o(j, iVar2)) {
            C11134i o = d1Var.mo74136o(d1Var.mo74137p(iVar));
            C11134i o2 = d1Var.mo74136o(d1Var.mo74137p(iVar2));
            C11136k m0 = j.mo62314m0(o);
            if (!j.mo62289X(j.mo62285T(o), j.mo62285T(o2))) {
                return false;
            }
            if (j.mo62322r0(m0) == 0) {
                if (j.mo62325t0(o) || j.mo62325t0(o2) || j.mo62332x0(m0) == j.mo62332x0(j.mo62314m0(o2))) {
                    return true;
                }
                return false;
            }
        }
        if (!m92802t(fVar, d1Var, iVar, iVar2, false, 8, (Object) null) || !m92802t(fVar, d1Var, iVar2, iVar, false, 8, (Object) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final List<C11136k> mo74150l(C14889d1 d1Var, C11136k kVar, C11139n nVar) {
        C14889d1.C14893c cVar;
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(kVar, "subType");
        C13706o.m87929f(nVar, "superConstructor");
        C11141p j = d1Var.mo74131j();
        if (j.mo62320q0(kVar)) {
            return f64032a.m92796h(d1Var, kVar, nVar);
        }
        if (!j.mo62330w0(nVar) && !j.mo62269C(nVar)) {
            return f64032a.m92795g(d1Var, kVar, nVar);
        }
        C12354e<C11136k> eVar = new C12354e<>();
        d1Var.mo74132k();
        ArrayDeque<C11136k> h = d1Var.mo74129h();
        C13706o.m87926c(h);
        Set<C11136k> i = d1Var.mo74130i();
        C13706o.m87926c(i);
        h.push(kVar);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                C11136k pop = h.pop();
                C13706o.m87928e(pop, "current");
                if (i.add(pop)) {
                    if (j.mo62320q0(pop)) {
                        eVar.add(pop);
                        cVar = C14889d1.C14893c.C14896c.f64025a;
                    } else {
                        cVar = C14889d1.C14893c.C14895b.f64024a;
                    }
                    if (!(!C13706o.m87924a(cVar, C14889d1.C14893c.C14896c.f64025a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        C11141p j2 = d1Var.mo74131j();
                        for (C11134i a : j2.mo62273E(j2.mo62292b(pop))) {
                            h.add(cVar.mo74058a(d1Var, a));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C13566b0.m87432g0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null)).toString());
            }
        }
        d1Var.mo74127e();
        ArrayList arrayList = new ArrayList();
        for (C11136k kVar2 : eVar) {
            C14902f fVar = f64032a;
            C13706o.m87928e(kVar2, "it");
            boolean unused = C13624y.m87797z(arrayList, fVar.m92796h(d1Var, kVar2, nVar));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final boolean mo74151q(C14889d1 d1Var, C11137l lVar, C11136k kVar) {
        boolean z;
        C14889d1 d1Var2 = d1Var;
        C11137l lVar2 = lVar;
        C11136k kVar2 = kVar;
        C13706o.m87929f(d1Var2, "<this>");
        C13706o.m87929f(lVar2, "capturedSubArguments");
        C13706o.m87929f(kVar2, "superType");
        C11141p j = d1Var.mo74131j();
        C11139n b = j.mo62292b(kVar2);
        int j2 = j.mo62308j(lVar2);
        int i0 = j.mo62307i0(b);
        if (j2 != i0 || j2 != j.mo62322r0(kVar2)) {
            return false;
        }
        for (int i = 0; i < i0; i++) {
            C11138m A = j.mo62265A(kVar2, i);
            if (!j.mo62336z0(A)) {
                C11134i u = j.mo62326u(A);
                C11138m n = j.mo62315n(lVar2, i);
                j.mo62313l0(n);
                C11149u uVar = C11149u.INV;
                C11134i u2 = j.mo62326u(n);
                C14902f fVar = f64032a;
                C11149u j3 = fVar.mo74148j(j.mo62304h(j.mo62276G(b, i)), j.mo62313l0(A));
                if (j3 == null) {
                    return d1Var.mo74134m();
                }
                if (j3 == uVar && (fVar.m92804v(j, u2, u, b) || fVar.m92804v(j, u, u2, b))) {
                    continue;
                } else if (d1Var.f64015g <= 100) {
                    d1Var2.f64015g = d1Var.f64015g + 1;
                    int i2 = C14903a.f64034a[j3.ordinal()];
                    if (i2 == 1) {
                        z = fVar.mo74149k(d1Var2, u2, u);
                    } else if (i2 == 2) {
                        z = m92802t(fVar, d1Var, u2, u, false, 8, (Object) null);
                    } else if (i2 == 3) {
                        z = m92802t(fVar, d1Var, u, u2, false, 8, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    d1Var2.f64015g = d1Var.f64015g - 1;
                    if (!z) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + u2).toString());
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo74152r(C14889d1 d1Var, C11134i iVar, C11134i iVar2) {
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(iVar, "subType");
        C13706o.m87929f(iVar2, "superType");
        return m92802t(this, d1Var, iVar, iVar2, false, 8, (Object) null);
    }

    /* renamed from: s */
    public final boolean mo74153s(C14889d1 d1Var, C11134i iVar, C11134i iVar2, boolean z) {
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(iVar, "subType");
        C13706o.m87929f(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (!d1Var.mo73790f(iVar, iVar2)) {
            return false;
        }
        return m92797i(d1Var, iVar, iVar2, z);
    }
}
