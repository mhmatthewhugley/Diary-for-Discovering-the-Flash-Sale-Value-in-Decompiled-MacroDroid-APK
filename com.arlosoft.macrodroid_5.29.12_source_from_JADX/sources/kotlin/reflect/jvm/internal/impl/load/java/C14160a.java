package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13934n;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14350f;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i;
import p297ja.C13328m;
import p362pb.C16152c;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a */
/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
public abstract class C14160a<TAnnotation> {

    /* renamed from: c */
    private static final C14161a f62779c = new C14161a((C13695i) null);
    @Deprecated

    /* renamed from: d */
    private static final Map<String, C14164b> f62780d;

    /* renamed from: a */
    private final C14403w f62781a;

    /* renamed from: b */
    private final ConcurrentHashMap<Object, TAnnotation> f62782b = new ConcurrentHashMap<>();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$a */
    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    private static final class C14161a {
        private C14161a() {
        }

        public /* synthetic */ C14161a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$b */
    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    static final class C14162b extends C13708q implements C16265l<TAnnotation, Boolean> {

        /* renamed from: a */
        public static final C14162b f62783a = new C14162b();

        C14162b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(TAnnotation tannotation) {
            C13706o.m87929f(tannotation, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C14164b bVar : C14164b.values()) {
            String d = bVar.mo72681d();
            if (linkedHashMap.get(d) == null) {
                linkedHashMap.put(d, bVar);
            }
        }
        f62780d = linkedHashMap;
    }

    public C14160a(C14403w wVar) {
        C13706o.m87929f(wVar, "javaTypeEnhancementState");
        this.f62781a = wVar;
    }

    /* renamed from: a */
    private final Set<C14164b> m89613a(Set<? extends C14164b> set) {
        return set.contains(C14164b.TYPE_USE) ? C13563a1.m87391j(C13563a1.m87390i(C13596m.m87627v0(C14164b.values()), C14164b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    /* renamed from: d */
    private final C14330q m89614d(TAnnotation tannotation) {
        C14353i g;
        C14330q r = m89622r(tannotation);
        if (r != null) {
            return r;
        }
        C13328m t = m89623t(tannotation);
        if (t == null) {
            return null;
        }
        Object a = t.mo70152a();
        Set set = (Set) t.mo70153b();
        C14200f0 q = m89621q(tannotation);
        if (q == null) {
            q = m89620p(a);
        }
        if (!q.mo72728d() && (g = m89615g(a, C14162b.f62783a)) != null) {
            return new C14330q(C14353i.m90345b(g, (C14352h) null, q.mo72729e(), 1, (Object) null), set, false, 4, (C13695i) null);
        }
        return null;
    }

    /* renamed from: g */
    private final C14353i m89615g(TAnnotation tannotation, C16265l<? super TAnnotation, Boolean> lVar) {
        C14353i n;
        C14353i n2 = m89618n(tannotation, lVar.invoke(tannotation).booleanValue());
        if (n2 != null) {
            return n2;
        }
        Object s = mo72679s(tannotation);
        if (s == null) {
            return null;
        }
        C14200f0 p = m89620p(tannotation);
        if (!p.mo72728d() && (n = m89618n(s, lVar.invoke(s).booleanValue())) != null) {
            return C14353i.m90345b(n, (C14352h) null, p.mo72729e(), 1, (Object) null);
        }
        return null;
    }

    /* renamed from: h */
    private final TAnnotation m89616h(TAnnotation tannotation, C16152c cVar) {
        for (TAnnotation next : mo72677k(tannotation)) {
            if (C13706o.m87924a(mo72675i(next), cVar)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m89617l(TAnnotation tannotation, C16152c cVar) {
        Iterable<Object> k = mo72677k(tannotation);
        if ((k instanceof Collection) && ((Collection) k).isEmpty()) {
            return false;
        }
        for (Object i : k) {
            if (C13706o.m87924a(mo72675i(i), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r6.equals("ALWAYS") != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r6.equals("NEVER") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r6.equals("MAYBE") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        return null;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i m89618n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            pb.c r0 = r5.mo72675i(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlin.reflect.jvm.internal.impl.load.java.w r2 = r5.f62781a
            qa.l r2 = r2.mo73093c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.f0 r2 = (kotlin.reflect.jvm.internal.impl.load.java.C14200f0) r2
            boolean r3 = r2.mo72728d()
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89647l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L_0x002a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            goto L_0x00d3
        L_0x002a:
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89646k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0038
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            goto L_0x00d3
        L_0x0038:
            pb.c r3 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89642g()
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r3 == 0) goto L_0x0046
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            goto L_0x00d3
        L_0x0046:
            pb.c r3 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89643h()
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r3 == 0) goto L_0x0054
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0054:
            pb.c r3 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89641f()
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r3 == 0) goto L_0x00a0
            java.lang.Iterable r6 = r5.mo72671b(r6, r4)
            java.lang.Object r6 = kotlin.collections.C13566b0.m87423X(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x009d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L_0x0090;
                case 74175084: goto L_0x0087;
                case 433141802: goto L_0x007b;
                case 1933739535: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x009c
        L_0x0072:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x009c
            goto L_0x009d
        L_0x007b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0084
            goto L_0x009c
        L_0x0084:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0087:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0090:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            goto L_0x00d3
        L_0x009c:
            return r1
        L_0x009d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            goto L_0x00d3
        L_0x00a0:
            pb.c r6 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89639d()
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r0, r6)
            if (r6 == 0) goto L_0x00ad
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            goto L_0x00d3
        L_0x00ad:
            pb.c r6 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89638c()
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r0, r6)
            if (r6 == 0) goto L_0x00ba
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            goto L_0x00d3
        L_0x00ba:
            pb.c r6 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89636a()
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r0, r6)
            if (r6 == 0) goto L_0x00c7
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            goto L_0x00d3
        L_0x00c7:
            pb.c r6 = kotlin.reflect.jvm.internal.impl.load.java.C14165b0.m89637b()
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r0, r6)
            if (r6 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
        L_0x00d3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            boolean r1 = r2.mo72729e()
            if (r1 != 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00de
        L_0x00dd:
            r4 = 1
        L_0x00de:
            r0.<init>(r6, r4)
            return r0
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C14160a.m89618n(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i");
    }

    /* renamed from: o */
    private final C14200f0 m89619o(TAnnotation tannotation) {
        C16152c i = mo72675i(tannotation);
        if (i == null || !C14166c.m89651c().containsKey(i)) {
            return m89620p(tannotation);
        }
        return this.f62781a.mo73093c().invoke(i);
    }

    /* renamed from: p */
    private final C14200f0 m89620p(TAnnotation tannotation) {
        C14200f0 q = m89621q(tannotation);
        return q != null ? q : this.f62781a.mo73094d().mo73100a();
    }

    /* renamed from: q */
    private final C14200f0 m89621q(TAnnotation tannotation) {
        Iterable<String> b;
        String str;
        C14200f0 f0Var = this.f62781a.mo73094d().mo73102c().get(mo72675i(tannotation));
        if (f0Var != null) {
            return f0Var;
        }
        Object h = m89616h(tannotation, C14166c.m89652d());
        if (h == null || (b = mo72671b(h, false)) == null || (str = (String) C13566b0.m87423X(b)) == null) {
            return null;
        }
        C14200f0 b2 = this.f62781a.mo73094d().mo73101b();
        if (b2 != null) {
            return b2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return C14200f0.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return C14200f0.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return C14200f0.IGNORE;
        }
    }

    /* renamed from: r */
    private final C14330q m89622r(TAnnotation tannotation) {
        C14330q qVar;
        if (this.f62781a.mo73092b() || (qVar = C14166c.m89649a().get(mo72675i(tannotation))) == null) {
            return null;
        }
        C14200f0 o = m89619o(tannotation);
        if (!(o != C14200f0.IGNORE)) {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return C14330q.m90249b(qVar, C14353i.m90345b(qVar.mo72974d(), (C14352h) null, o.mo72729e(), 1, (Object) null), (Collection) null, false, 6, (Object) null);
    }

    /* renamed from: t */
    private final C13328m<TAnnotation, Set<C14164b>> m89623t(TAnnotation tannotation) {
        Object h;
        Object obj;
        boolean z;
        if (this.f62781a.mo73094d().mo73103d() || (h = m89616h(tannotation, C14166c.m89653e())) == null) {
            return null;
        }
        Iterator it = mo72677k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (mo72679s(obj) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        Iterable<String> b = mo72671b(h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : b) {
            C14164b bVar = f62780d.get(str);
            if (bVar != null) {
                linkedHashSet.add(bVar);
            }
        }
        return new C13328m<>(obj, m89613a(linkedHashSet));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Iterable<String> mo72671b(TAnnotation tannotation, boolean z);

    /* renamed from: c */
    public final C14406x mo72672c(C14406x xVar, Iterable<? extends TAnnotation> iterable) {
        EnumMap enumMap;
        EnumMap<C14164b, C14330q> b;
        C13706o.m87929f(iterable, "annotations");
        if (this.f62781a.mo73092b()) {
            return xVar;
        }
        ArrayList<C14330q> arrayList = new ArrayList<>();
        for (Object d : iterable) {
            C14330q d2 = m89614d(d);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        if (arrayList.isEmpty()) {
            return xVar;
        }
        if (xVar == null || (b = xVar.mo73099b()) == null) {
            enumMap = new EnumMap(C14164b.class);
        } else {
            enumMap = new EnumMap(b);
        }
        boolean z = false;
        for (C14330q qVar : arrayList) {
            for (C14164b put : qVar.mo72975e()) {
                enumMap.put(put, qVar);
                z = true;
            }
        }
        return !z ? xVar : new C14406x(enumMap);
    }

    /* renamed from: e */
    public final C14350f mo72673e(Iterable<? extends TAnnotation> iterable) {
        C14350f fVar;
        C13706o.m87929f(iterable, "annotations");
        C14350f fVar2 = null;
        for (Object i : iterable) {
            C16152c i2 = mo72675i(i);
            if (C14165b0.m89648m().contains(i2)) {
                fVar = C14350f.READ_ONLY;
            } else if (C14165b0.m89645j().contains(i2)) {
                fVar = C14350f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    /* renamed from: f */
    public final C14353i mo72674f(Iterable<? extends TAnnotation> iterable, C16265l<? super TAnnotation, Boolean> lVar) {
        C13706o.m87929f(iterable, "annotations");
        C13706o.m87929f(lVar, "forceWarning");
        C14353i iVar = null;
        for (Object g : iterable) {
            C14353i g2 = m89615g(g, lVar);
            if (iVar != null) {
                if (g2 != null && !C13706o.m87924a(g2, iVar)) {
                    if (!g2.mo73031d() || iVar.mo73031d()) {
                        if (g2.mo73031d() || !iVar.mo73031d()) {
                            return null;
                        }
                    }
                }
            }
            iVar = g2;
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C16152c mo72675i(TAnnotation tannotation);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo72676j(TAnnotation tannotation);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo72677k(TAnnotation tannotation);

    /* renamed from: m */
    public final boolean mo72678m(TAnnotation tannotation) {
        C13706o.m87929f(tannotation, "annotation");
        Object h = m89616h(tannotation, C13902k.C13903a.f62217H);
        if (h == null) {
            return false;
        }
        Iterable<String> b = mo72671b(h, false);
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String a : b) {
            if (C13706o.m87924a(a, C13934n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final TAnnotation mo72679s(TAnnotation tannotation) {
        TAnnotation tannotation2;
        C13706o.m87929f(tannotation, "annotation");
        if (this.f62781a.mo73094d().mo73103d()) {
            return null;
        }
        if (C13566b0.m87414O(C14166c.m89650b(), mo72675i(tannotation)) || m89617l(tannotation, C14166c.m89654f())) {
            return tannotation;
        }
        if (!m89617l(tannotation, C14166c.m89655g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f62782b;
        Object j = mo72676j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator it = mo72677k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = mo72679s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
