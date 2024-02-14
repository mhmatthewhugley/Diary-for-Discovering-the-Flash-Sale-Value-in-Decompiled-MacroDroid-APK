package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14628n;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14833b0;
import kotlin.reflect.jvm.internal.impl.types.C14884d0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14961p;
import kotlin.reflect.jvm.internal.impl.types.C14966q0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14980u0;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;
import p433xa.C16878g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w */
/* compiled from: IntersectionType.kt */
public final class C14871w {

    /* renamed from: a */
    public static final C14871w f63995a = new C14871w();

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a */
    /* compiled from: IntersectionType.kt */
    private enum C14872a {
        ;

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$a */
        /* compiled from: IntersectionType.kt */
        static final class C14873a extends C14872a {
            C14873a(String str, int i) {
                super(str, i, (C13695i) null);
            }

            /* renamed from: d */
            public C14872a mo74104d(C14967q1 q1Var) {
                C13706o.m87929f(q1Var, "nextType");
                return mo74105e(q1Var);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$b */
        /* compiled from: IntersectionType.kt */
        static final class C14874b extends C14872a {
            C14874b(String str, int i) {
                super(str, i, (C13695i) null);
            }

            /* renamed from: f */
            public C14874b mo74104d(C14967q1 q1Var) {
                C13706o.m87929f(q1Var, "nextType");
                return this;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$c */
        /* compiled from: IntersectionType.kt */
        static final class C14875c extends C14872a {
            C14875c(String str, int i) {
                super(str, i, (C13695i) null);
            }

            /* renamed from: d */
            public C14872a mo74104d(C14967q1 q1Var) {
                C13706o.m87929f(q1Var, "nextType");
                return mo74105e(q1Var);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$d */
        /* compiled from: IntersectionType.kt */
        static final class C14876d extends C14872a {
            C14876d(String str, int i) {
                super(str, i, (C13695i) null);
            }

            /* renamed from: d */
            public C14872a mo74104d(C14967q1 q1Var) {
                C13706o.m87929f(q1Var, "nextType");
                C14872a e = mo74105e(q1Var);
                return e == C14872a.f63997c ? this : e;
            }
        }

        /* renamed from: d */
        public abstract C14872a mo74104d(C14967q1 q1Var);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final C14872a mo74105e(C14967q1 q1Var) {
            C13706o.m87929f(q1Var, "<this>");
            if (q1Var.mo73021O0()) {
                return f63997c;
            }
            if ((q1Var instanceof C14961p) && (((C14961p) q1Var).mo74226Z0() instanceof C14980u0)) {
                return f63999f;
            }
            if (q1Var instanceof C14980u0) {
                return f63998d;
            }
            if (C14863o.f63989a.mo74096a(q1Var)) {
                return f63999f;
            }
            return f63998d;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$b */
    /* compiled from: IntersectionType.kt */
    static final class C14877b extends C13708q implements C16254a<String> {
        final /* synthetic */ Set<C14951m0> $inputTypes;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14877b(Set<? extends C14951m0> set) {
            super(0);
            this.$inputTypes = set;
        }

        /* renamed from: a */
        public final String invoke() {
            return "This collections cannot be empty! input types: " + C13566b0.m87432g0(this.$inputTypes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$c */
    /* compiled from: IntersectionType.kt */
    /* synthetic */ class C14878c extends C13703l implements C16269p<C14900e0, C14900e0, Boolean> {
        C14878c(Object obj) {
            super(2, obj);
        }

        public final String getName() {
            return "isStrictSupertype";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14871w.class);
        }

        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: l */
        public final Boolean invoke(C14900e0 e0Var, C14900e0 e0Var2) {
            C13706o.m87929f(e0Var, "p0");
            C13706o.m87929f(e0Var2, "p1");
            return Boolean.valueOf(((C14871w) this.receiver).m92700e(e0Var, e0Var2));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$d */
    /* compiled from: IntersectionType.kt */
    /* synthetic */ class C14879d extends C13703l implements C16269p<C14900e0, C14900e0, Boolean> {
        C14879d(Object obj) {
            super(2, obj);
        }

        public final String getName() {
            return "equalTypes";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14861m.class);
        }

        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: l */
        public final Boolean invoke(C14900e0 e0Var, C14900e0 e0Var2) {
            C13706o.m87929f(e0Var, "p0");
            C13706o.m87929f(e0Var2, "p1");
            return Boolean.valueOf(((C14861m) this.receiver).mo74059b(e0Var, e0Var2));
        }
    }

    private C14871w() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:16:0x0051 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.C14951m0> m92698b(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.C14951m0> r8, p370qa.C16269p<? super kotlin.reflect.jvm.internal.impl.types.C14951m0, ? super kotlin.reflect.jvm.internal.impl.types.C14951m0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.C13706o.m87928e(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = (kotlin.reflect.jvm.internal.impl.types.C14951m0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0024
        L_0x0022:
            r3 = 0
            goto L_0x0051
        L_0x0024:
            java.util.Iterator r2 = r0.iterator()
        L_0x0028:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.m0 r5 = (kotlin.reflect.jvm.internal.impl.types.C14951m0) r5
            if (r5 == r1) goto L_0x004e
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.C13706o.m87928e(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.C13706o.m87928e(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0028
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.C14871w.m92698b(java.util.Collection, qa.p):java.util.Collection");
    }

    /* renamed from: d */
    private final C14951m0 m92699d(Set<? extends C14951m0> set) {
        if (set.size() == 1) {
            return (C14951m0) C13566b0.m87445t0(set);
        }
        new C14877b(set);
        Collection<C14951m0> b = m92698b(set, new C14878c(this));
        b.isEmpty();
        C14951m0 b2 = C14628n.f63623f.mo73743b(b);
        if (b2 != null) {
            return b2;
        }
        Collection<C14951m0> b3 = m92698b(b, new C14879d(C14859l.f63983b.mo74091a()));
        b3.isEmpty();
        if (b3.size() < 2) {
            return (C14951m0) C13566b0.m87445t0(b3);
        }
        return new C14884d0(set).mo74115f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m92700e(C14900e0 e0Var, C14900e0 e0Var2) {
        C14861m a = C14859l.f63983b.mo74091a();
        return a.mo74060d(e0Var, e0Var2) && !a.mo74060d(e0Var2, e0Var);
    }

    /* renamed from: c */
    public final C14951m0 mo74103c(List<? extends C14951m0> list) {
        C13706o.m87929f(list, "types");
        list.size();
        ArrayList<C14967q1> arrayList = new ArrayList<>();
        for (C14951m0 m0Var : list) {
            if (m0Var.mo73702N0() instanceof C14884d0) {
                Collection<C14900e0> l = m0Var.mo73702N0().mo72370l();
                C13706o.m87928e(l, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(l, 10));
                for (C14900e0 e0Var : l) {
                    C13706o.m87928e(e0Var, "it");
                    C14951m0 d = C14833b0.m92417d(e0Var);
                    if (m0Var.mo73021O0()) {
                        d = d.mo73022U0(true);
                    }
                    arrayList2.add(d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m0Var);
            }
        }
        C14872a aVar = C14872a.f63996a;
        for (C14967q1 d2 : arrayList) {
            aVar = aVar.mo74104d(d2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14951m0 m0Var2 = (C14951m0) it.next();
            if (aVar == C14872a.f63999f) {
                if (m0Var2 instanceof C14852i) {
                    m0Var2 = C14966q0.m93073k((C14852i) m0Var2);
                }
                m0Var2 = C14966q0.m93071i(m0Var2, false, 1, (Object) null);
            }
            linkedHashSet.add(m0Var2);
        }
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(list, 10));
        for (C14951m0 M0 : list) {
            arrayList3.add(M0.mo73701M0());
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ((C14830a1) next).mo74046k((C14830a1) it2.next());
            }
            return m92699d(linkedHashSet).mo73023V0((C14830a1) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
