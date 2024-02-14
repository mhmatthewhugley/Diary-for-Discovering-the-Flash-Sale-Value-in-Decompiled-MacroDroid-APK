package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C14054l1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13998i0;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14984w;
import kotlin.reflect.jvm.internal.impl.util.C15020l;
import p272gc.C12338a;
import p416vb.C16756f;
import p416vb.C16757g;
import p416vb.C16758h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t */
/* compiled from: DescriptorVisibilities */
public class C14127t {

    /* renamed from: a */
    public static final C14141u f62750a;

    /* renamed from: b */
    public static final C14141u f62751b;

    /* renamed from: c */
    public static final C14141u f62752c;

    /* renamed from: d */
    public static final C14141u f62753d;

    /* renamed from: e */
    public static final C14141u f62754e;

    /* renamed from: f */
    public static final C14141u f62755f;

    /* renamed from: g */
    public static final C14141u f62756g;

    /* renamed from: h */
    public static final C14141u f62757h;

    /* renamed from: i */
    public static final C14141u f62758i;

    /* renamed from: j */
    public static final Set<C14141u> f62759j;

    /* renamed from: k */
    private static final Map<C14141u, Integer> f62760k;

    /* renamed from: l */
    public static final C14141u f62761l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C16756f f62762m = new C14128a();

    /* renamed from: n */
    public static final C16756f f62763n = new C14129b();
    @Deprecated

    /* renamed from: o */
    public static final C16756f f62764o = new C14130c();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C15020l f62765p;

    /* renamed from: q */
    private static final Map<C14068m1, C14141u> f62766q = new HashMap();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$a */
    /* compiled from: DescriptorVisibilities */
    static class C14128a implements C16756f {
        C14128a() {
        }

        public C14900e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$b */
    /* compiled from: DescriptorVisibilities */
    static class C14129b implements C16756f {
        C14129b() {
        }

        public C14900e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$c */
    /* compiled from: DescriptorVisibilities */
    static class C14130c implements C16756f {
        C14130c() {
        }

        public C14900e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$d */
    /* compiled from: DescriptorVisibilities */
    static class C14131d extends C14077r {
        C14131d(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89529g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m89530h(C14064m mVar) {
            if (mVar == null) {
                m89529g(0);
            }
            return C14650d.m91623j(mVar) != C13911a1.f62310a;
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            C14064m mVar2;
            if (qVar == null) {
                m89529g(1);
            }
            if (mVar == null) {
                m89529g(2);
            }
            if (C14650d.m91610J(qVar) && m89530h(mVar)) {
                return C14127t.m89524f(qVar, mVar);
            }
            if (qVar instanceof C14052l) {
                C13964i b = ((C14052l) qVar).mo62163b();
                if (z && C14650d.m91607G(b) && C14650d.m91610J(b) && (mVar instanceof C14052l) && C14650d.m91610J(mVar.mo62163b()) && C14127t.m89524f(qVar, mVar)) {
                    return true;
                }
            }
            C14064m mVar3 = qVar;
            while (mVar3 != null) {
                C14064m b2 = mVar3.mo62163b();
                if ((b2 instanceof C13948e) && !C14650d.m91637x(b2)) {
                    mVar2 = b2;
                    break;
                }
                boolean z2 = b2 instanceof C14050k0;
                mVar3 = b2;
                if (z2) {
                    mVar2 = b2;
                    break;
                }
            }
            mVar2 = mVar3;
            if (mVar2 == null) {
                return false;
            }
            while (mVar != null) {
                if (mVar2 == mVar) {
                    return true;
                }
                if (!(mVar instanceof C14050k0)) {
                    mVar = mVar.mo62163b();
                } else if (!(mVar2 instanceof C14050k0) || !((C14050k0) mVar2).mo72551e().equals(((C14050k0) mVar).mo72551e()) || !C14650d.m91615b(mVar, mVar2)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$e */
    /* compiled from: DescriptorVisibilities */
    static class C14132e extends C14077r {
        C14132e(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89532g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            C14064m q;
            if (qVar == null) {
                m89532g(0);
            }
            if (mVar == null) {
                m89532g(1);
            }
            if (C14127t.f62750a.mo72658e(fVar, qVar, mVar, z)) {
                if (fVar == C14127t.f62763n) {
                    return true;
                }
                if (!(fVar == C14127t.f62762m || (q = C14650d.m91630q(qVar, C13948e.class)) == null || !(fVar instanceof C16758h))) {
                    return ((C16758h) fVar).mo79740s().mo72233a().equals(q.mo72233a());
                }
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$f */
    /* compiled from: DescriptorVisibilities */
    static class C14133f extends C14077r {
        C14133f(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89534g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = TypedValues.Transition.S_FROM;
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m89535h(C16756f fVar, C14075q qVar, C13948e eVar) {
            if (qVar == null) {
                m89534g(2);
            }
            if (eVar == null) {
                m89534g(3);
            }
            if (fVar == C14127t.f62764o) {
                return false;
            }
            if (!(qVar instanceof C13936b) || (qVar instanceof C14052l) || fVar == C14127t.f62763n) {
                return true;
            }
            if (fVar == C14127t.f62762m || fVar == null) {
                return false;
            }
            C14900e0 a = fVar instanceof C16757g ? ((C16757g) fVar).mo79742a() : fVar.getType();
            if (C14650d.m91609I(a, eVar) || C14984w.m93156a(a)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            C13948e eVar;
            Class<C13948e> cls = C13948e.class;
            if (qVar == null) {
                m89534g(0);
            }
            if (mVar == null) {
                m89534g(1);
            }
            C13948e eVar2 = (C13948e) C14650d.m91630q(qVar, cls);
            C13948e eVar3 = (C13948e) C14650d.m91631r(mVar, cls, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && C14650d.m91637x(eVar2) && (eVar = (C13948e) C14650d.m91630q(eVar2, cls)) != null && C14650d.m91608H(eVar3, eVar)) {
                return true;
            }
            C14075q M = C14650d.m91613M(qVar);
            C13948e eVar4 = (C13948e) C14650d.m91630q(M, cls);
            if (eVar4 == null) {
                return false;
            }
            if (!C14650d.m91608H(eVar3, eVar4) || !m89535h(fVar, M, eVar3)) {
                return mo72658e(fVar, qVar, eVar3.mo62163b(), z);
            }
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$g */
    /* compiled from: DescriptorVisibilities */
    static class C14134g extends C14077r {
        C14134g(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89537g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89537g(0);
            }
            if (mVar == null) {
                m89537g(1);
            }
            if (!C14650d.m91620g(mVar).mo72294K(C14650d.m91620g(qVar))) {
                return false;
            }
            return C14127t.f62765p.mo74280a(qVar, mVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$h */
    /* compiled from: DescriptorVisibilities */
    static class C14135h extends C14077r {
        C14135h(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89539g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89539g(0);
            }
            if (mVar == null) {
                m89539g(1);
            }
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$i */
    /* compiled from: DescriptorVisibilities */
    static class C14136i extends C14077r {
        C14136i(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89541g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89541g(0);
            }
            if (mVar == null) {
                m89541g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$j */
    /* compiled from: DescriptorVisibilities */
    static class C14137j extends C14077r {
        C14137j(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89543g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89543g(0);
            }
            if (mVar == null) {
                m89543g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$k */
    /* compiled from: DescriptorVisibilities */
    static class C14138k extends C14077r {
        C14138k(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89545g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89545g(0);
            }
            if (mVar == null) {
                m89545g(1);
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$l */
    /* compiled from: DescriptorVisibilities */
    static class C14139l extends C14077r {
        C14139l(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m89547g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m89547g(0);
            }
            if (mVar == null) {
                m89547g(1);
            }
            return false;
        }
    }

    static {
        Class<C15020l> cls = C15020l.class;
        C14131d dVar = new C14131d(C14054l1.C14059e.f62678c);
        f62750a = dVar;
        C14132e eVar = new C14132e(C14054l1.C14060f.f62679c);
        f62751b = eVar;
        C14133f fVar = new C14133f(C14054l1.C14061g.f62680c);
        f62752c = fVar;
        C14134g gVar = new C14134g(C14054l1.C14056b.f62675c);
        f62753d = gVar;
        C14135h hVar = new C14135h(C14054l1.C14062h.f62681c);
        f62754e = hVar;
        C14136i iVar = new C14136i(C14054l1.C14058d.f62677c);
        f62755f = iVar;
        C14137j jVar = new C14137j(C14054l1.C14055a.f62674c);
        f62756g = jVar;
        C14138k kVar = new C14138k(C14054l1.C14057c.f62676c);
        f62757h = kVar;
        C14139l lVar = new C14139l(C14054l1.C14063i.f62682c);
        f62758i = lVar;
        f62759j = Collections.unmodifiableSet(C13627z0.m87809g(dVar, eVar, gVar, iVar));
        HashMap e = C12338a.m83075e(4);
        e.put(eVar, 0);
        e.put(dVar, 0);
        e.put(gVar, 1);
        e.put(fVar, 1);
        e.put(hVar, 2);
        f62760k = Collections.unmodifiableMap(e);
        f62761l = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f62765p = it.hasNext() ? (C15020l) it.next() : C15020l.C15021a.f64148a;
        m89527i(dVar);
        m89527i(eVar);
        m89527i(fVar);
        m89527i(gVar);
        m89527i(hVar);
        m89527i(iVar);
        m89527i(jVar);
        m89527i(kVar);
        m89527i(lVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m89519a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 16 ? 3 : 2)];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = TypedValues.Transition.S_FROM;
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: d */
    public static Integer m89522d(C14141u uVar, C14141u uVar2) {
        if (uVar == null) {
            m89519a(12);
        }
        if (uVar2 == null) {
            m89519a(13);
        }
        Integer a = uVar.mo72659a(uVar2);
        if (a != null) {
            return a;
        }
        Integer a2 = uVar2.mo72659a(uVar);
        if (a2 != null) {
            return Integer.valueOf(-a2.intValue());
        }
        return null;
    }

    /* renamed from: e */
    public static C14075q m89523e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
        C14075q e;
        if (qVar == null) {
            m89519a(8);
        }
        if (mVar == null) {
            m89519a(9);
        }
        C14075q qVar2 = (C14075q) qVar.mo72233a();
        while (qVar2 != null && qVar2.getVisibility() != f62755f) {
            if (!qVar2.getVisibility().mo72658e(fVar, qVar2, mVar, z)) {
                return qVar2;
            }
            qVar2 = (C14075q) C14650d.m91630q(qVar2, C14075q.class);
        }
        if (!(qVar instanceof C13998i0) || (e = m89523e(fVar, ((C13998i0) qVar).mo72413S(), mVar, z)) == null) {
            return null;
        }
        return e;
    }

    /* renamed from: f */
    public static boolean m89524f(C14064m mVar, C14064m mVar2) {
        if (mVar == null) {
            m89519a(6);
        }
        if (mVar2 == null) {
            m89519a(7);
        }
        C13911a1 j = C14650d.m91623j(mVar2);
        if (j != C13911a1.f62310a) {
            return j.equals(C14650d.m91623j(mVar));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m89525g(C14141u uVar) {
        if (uVar == null) {
            m89519a(14);
        }
        return uVar == f62750a || uVar == f62751b;
    }

    /* renamed from: h */
    public static boolean m89526h(C14075q qVar, C14064m mVar, boolean z) {
        if (qVar == null) {
            m89519a(2);
        }
        if (mVar == null) {
            m89519a(3);
        }
        return m89523e(f62763n, qVar, mVar, z) == null;
    }

    /* renamed from: i */
    private static void m89527i(C14141u uVar) {
        f62766q.put(uVar.mo72570b(), uVar);
    }

    /* renamed from: j */
    public static C14141u m89528j(C14068m1 m1Var) {
        if (m1Var == null) {
            m89519a(15);
        }
        C14141u uVar = f62766q.get(m1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + m1Var);
    }
}
