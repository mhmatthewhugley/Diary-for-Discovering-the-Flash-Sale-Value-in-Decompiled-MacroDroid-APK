package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13847c;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import org.apache.commons.p353io.FilenameUtils;
import p210ab.C11084c;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16155e;
import p362pb.C16157f;
import p362pb.C16159h;
import p362pb.C16160i;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.c */
/* compiled from: JavaToKotlinClassMap.kt */
public final class C13871c {

    /* renamed from: a */
    public static final C13871c f62112a;

    /* renamed from: b */
    private static final String f62113b;

    /* renamed from: c */
    private static final String f62114c;

    /* renamed from: d */
    private static final String f62115d;

    /* renamed from: e */
    private static final String f62116e;

    /* renamed from: f */
    private static final C16151b f62117f;

    /* renamed from: g */
    private static final C16152c f62118g;

    /* renamed from: h */
    private static final C16151b f62119h;

    /* renamed from: i */
    private static final C16151b f62120i;

    /* renamed from: j */
    private static final C16151b f62121j;

    /* renamed from: k */
    private static final HashMap<C16153d, C16151b> f62122k = new HashMap<>();

    /* renamed from: l */
    private static final HashMap<C16153d, C16151b> f62123l = new HashMap<>();

    /* renamed from: m */
    private static final HashMap<C16153d, C16152c> f62124m = new HashMap<>();

    /* renamed from: n */
    private static final HashMap<C16153d, C16152c> f62125n = new HashMap<>();

    /* renamed from: o */
    private static final HashMap<C16151b, C16151b> f62126o = new HashMap<>();

    /* renamed from: p */
    private static final HashMap<C16151b, C16151b> f62127p = new HashMap<>();

    /* renamed from: q */
    private static final List<C13872a> f62128q;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.c$a */
    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class C13872a {

        /* renamed from: a */
        private final C16151b f62129a;

        /* renamed from: b */
        private final C16151b f62130b;

        /* renamed from: c */
        private final C16151b f62131c;

        public C13872a(C16151b bVar, C16151b bVar2, C16151b bVar3) {
            C13706o.m87929f(bVar, "javaClass");
            C13706o.m87929f(bVar2, "kotlinReadOnly");
            C13706o.m87929f(bVar3, "kotlinMutable");
            this.f62129a = bVar;
            this.f62130b = bVar2;
            this.f62131c = bVar3;
        }

        /* renamed from: a */
        public final C16151b mo72177a() {
            return this.f62129a;
        }

        /* renamed from: b */
        public final C16151b mo72178b() {
            return this.f62130b;
        }

        /* renamed from: c */
        public final C16151b mo72179c() {
            return this.f62131c;
        }

        /* renamed from: d */
        public final C16151b mo72180d() {
            return this.f62129a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13872a)) {
                return false;
            }
            C13872a aVar = (C13872a) obj;
            return C13706o.m87924a(this.f62129a, aVar.f62129a) && C13706o.m87924a(this.f62130b, aVar.f62130b) && C13706o.m87924a(this.f62131c, aVar.f62131c);
        }

        public int hashCode() {
            return (((this.f62129a.hashCode() * 31) + this.f62130b.hashCode()) * 31) + this.f62131c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f62129a + ", kotlinReadOnly=" + this.f62130b + ", kotlinMutable=" + this.f62131c + ')';
        }
    }

    static {
        C13871c cVar = new C13871c();
        f62112a = cVar;
        StringBuilder sb = new StringBuilder();
        C11084c cVar2 = C11084c.Function;
        sb.append(cVar2.mo62192e().toString());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(cVar2.mo62191d());
        f62113b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C11084c cVar3 = C11084c.KFunction;
        sb2.append(cVar3.mo62192e().toString());
        sb2.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb2.append(cVar3.mo62191d());
        f62114c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C11084c cVar4 = C11084c.SuspendFunction;
        sb3.append(cVar4.mo62192e().toString());
        sb3.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb3.append(cVar4.mo62191d());
        f62115d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C11084c cVar5 = C11084c.KSuspendFunction;
        sb4.append(cVar5.mo62192e().toString());
        sb4.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb4.append(cVar5.mo62191d());
        f62116e = sb4.toString();
        C16151b m = C16151b.m96975m(new C16152c("kotlin.jvm.functions.FunctionN"));
        C13706o.m87928e(m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f62117f = m;
        C16152c b = m.mo78544b();
        C13706o.m87928e(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f62118g = b;
        C16160i iVar = C16160i.f66342a;
        f62119h = iVar.mo78599i();
        f62120i = iVar.mo78598h();
        f62121j = cVar.m88356g(Class.class);
        C16151b m2 = C16151b.m96975m(C13902k.C13903a.f62232T);
        C13706o.m87928e(m2, "topLevel(FqNames.iterable)");
        C16152c cVar6 = C13902k.C13903a.f62242b0;
        C16152c h = m2.mo78549h();
        C16152c h2 = m2.mo78549h();
        C13706o.m87928e(h2, "kotlinReadOnly.packageFqName");
        C16152c g = C16155e.m97016g(cVar6, h2);
        C16151b bVar = new C16151b(h, g, false);
        C16151b m3 = C16151b.m96975m(C13902k.C13903a.f62231S);
        C13706o.m87928e(m3, "topLevel(FqNames.iterator)");
        C16152c cVar7 = C13902k.C13903a.f62240a0;
        C16152c h3 = m3.mo78549h();
        C16152c h4 = m3.mo78549h();
        C13706o.m87928e(h4, "kotlinReadOnly.packageFqName");
        C16151b bVar2 = new C16151b(h3, C16155e.m97016g(cVar7, h4), false);
        C16151b m4 = C16151b.m96975m(C13902k.C13903a.f62233U);
        C13706o.m87928e(m4, "topLevel(FqNames.collection)");
        C16152c cVar8 = C13902k.C13903a.f62244c0;
        C16152c h5 = m4.mo78549h();
        C16152c h6 = m4.mo78549h();
        C13706o.m87928e(h6, "kotlinReadOnly.packageFqName");
        C16151b bVar3 = new C16151b(h5, C16155e.m97016g(cVar8, h6), false);
        C16151b m5 = C16151b.m96975m(C13902k.C13903a.f62234V);
        C13706o.m87928e(m5, "topLevel(FqNames.list)");
        C16152c cVar9 = C13902k.C13903a.f62246d0;
        C16152c h7 = m5.mo78549h();
        C16152c h8 = m5.mo78549h();
        C13706o.m87928e(h8, "kotlinReadOnly.packageFqName");
        C16151b bVar4 = new C16151b(h7, C16155e.m97016g(cVar9, h8), false);
        C16151b m6 = C16151b.m96975m(C13902k.C13903a.f62236X);
        C13706o.m87928e(m6, "topLevel(FqNames.set)");
        C16152c cVar10 = C13902k.C13903a.f62250f0;
        C16152c h9 = m6.mo78549h();
        C16152c h10 = m6.mo78549h();
        C13706o.m87928e(h10, "kotlinReadOnly.packageFqName");
        C16151b bVar5 = new C16151b(h9, C16155e.m97016g(cVar10, h10), false);
        C16151b m7 = C16151b.m96975m(C13902k.C13903a.f62235W);
        C13706o.m87928e(m7, "topLevel(FqNames.listIterator)");
        C16152c cVar11 = C13902k.C13903a.f62248e0;
        C16152c h11 = m7.mo78549h();
        C16152c h12 = m7.mo78549h();
        C13706o.m87928e(h12, "kotlinReadOnly.packageFqName");
        C16151b bVar6 = new C16151b(h11, C16155e.m97016g(cVar11, h12), false);
        C16152c cVar12 = C13902k.C13903a.f62237Y;
        C16151b m8 = C16151b.m96975m(cVar12);
        C13706o.m87928e(m8, "topLevel(FqNames.map)");
        C16152c cVar13 = C13902k.C13903a.f62252g0;
        C16152c h13 = m8.mo78549h();
        C16152c h14 = m8.mo78549h();
        C13706o.m87928e(h14, "kotlinReadOnly.packageFqName");
        C16151b bVar7 = new C16151b(h13, C16155e.m97016g(cVar13, h14), false);
        C16151b d = C16151b.m96975m(cVar12).mo78546d(C13902k.C13903a.f62238Z.mo78562g());
        C13706o.m87928e(d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        C16152c cVar14 = C13902k.C13903a.f62254h0;
        C16152c h15 = d.mo78549h();
        C16152c h16 = d.mo78549h();
        C13706o.m87928e(h16, "kotlinReadOnly.packageFqName");
        List<C13872a> m9 = C13614t.m87751m(new C13872a(cVar.m88356g(Iterable.class), m2, bVar), new C13872a(cVar.m88356g(Iterator.class), m3, bVar2), new C13872a(cVar.m88356g(Collection.class), m4, bVar3), new C13872a(cVar.m88356g(List.class), m5, bVar4), new C13872a(cVar.m88356g(Set.class), m6, bVar5), new C13872a(cVar.m88356g(ListIterator.class), m7, bVar6), new C13872a(cVar.m88356g(Map.class), m8, bVar7), new C13872a(cVar.m88356g(Map.Entry.class), d, new C16151b(h15, C16155e.m97016g(cVar14, h16), false)));
        f62128q = m9;
        cVar.m88355f(Object.class, C13902k.C13903a.f62241b);
        cVar.m88355f(String.class, C13902k.C13903a.f62253h);
        cVar.m88355f(CharSequence.class, C13902k.C13903a.f62251g);
        cVar.m88354e(Throwable.class, C13902k.C13903a.f62279u);
        cVar.m88355f(Cloneable.class, C13902k.C13903a.f62245d);
        cVar.m88355f(Number.class, C13902k.C13903a.f62273r);
        cVar.m88354e(Comparable.class, C13902k.C13903a.f62281v);
        cVar.m88355f(Enum.class, C13902k.C13903a.f62275s);
        cVar.m88354e(Annotation.class, C13902k.C13903a.f62215G);
        for (C13872a d2 : m9) {
            f62112a.m88353d(d2);
        }
        for (C16610e eVar : C16610e.values()) {
            C13871c cVar15 = f62112a;
            C16151b m10 = C16151b.m96975m(eVar.mo79465j());
            C13706o.m87928e(m10, "topLevel(jvmType.wrapperFqName)");
            C13859i i = eVar.mo79464i();
            C13706o.m87928e(i, "jvmType.primitiveType");
            C16151b m11 = C16151b.m96975m(C13902k.m88456c(i));
            C13706o.m87928e(m11, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.m88350a(m10, m11);
        }
        for (C16151b next : C13847c.f62065a.mo72108a()) {
            C13871c cVar16 = f62112a;
            C16151b m12 = C16151b.m96975m(new C16152c("kotlin.jvm.internal." + next.mo78552j().mo78583d() + "CompanionObject"));
            C13706o.m87928e(m12, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            C16151b d3 = next.mo78546d(C16159h.f66305d);
            C13706o.m87928e(d3, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.m88350a(m12, d3);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            C13871c cVar17 = f62112a;
            C16151b m13 = C16151b.m96975m(new C16152c("kotlin.jvm.functions.Function" + i2));
            C13706o.m87928e(m13, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.m88350a(m13, C13902k.m88454a(i2));
            cVar17.m88352c(new C16152c(f62114c + i2), f62119h);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            C11084c cVar18 = C11084c.KSuspendFunction;
            f62112a.m88352c(new C16152c((cVar18.mo62192e().toString() + FilenameUtils.EXTENSION_SEPARATOR + cVar18.mo62191d()) + i3), f62119h);
        }
        C13871c cVar19 = f62112a;
        C16152c l = C13902k.C13903a.f62243c.mo78579l();
        C13706o.m87928e(l, "nothing.toSafe()");
        cVar19.m88352c(l, cVar19.m88356g(Void.class));
    }

    private C13871c() {
    }

    /* renamed from: a */
    private final void m88350a(C16151b bVar, C16151b bVar2) {
        m88351b(bVar, bVar2);
        C16152c b = bVar2.mo78544b();
        C13706o.m87928e(b, "kotlinClassId.asSingleFqName()");
        m88352c(b, bVar);
    }

    /* renamed from: b */
    private final void m88351b(C16151b bVar, C16151b bVar2) {
        HashMap<C16153d, C16151b> hashMap = f62122k;
        C16153d j = bVar.mo78544b().mo78566j();
        C13706o.m87928e(j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, bVar2);
    }

    /* renamed from: c */
    private final void m88352c(C16152c cVar, C16151b bVar) {
        HashMap<C16153d, C16151b> hashMap = f62123l;
        C16153d j = cVar.mo78566j();
        C13706o.m87928e(j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j, bVar);
    }

    /* renamed from: d */
    private final void m88353d(C13872a aVar) {
        C16151b a = aVar.mo72177a();
        C16151b b = aVar.mo72178b();
        C16151b c = aVar.mo72179c();
        m88350a(a, b);
        C16152c b2 = c.mo78544b();
        C13706o.m87928e(b2, "mutableClassId.asSingleFqName()");
        m88352c(b2, a);
        f62126o.put(c, b);
        f62127p.put(b, c);
        C16152c b3 = b.mo78544b();
        C13706o.m87928e(b3, "readOnlyClassId.asSingleFqName()");
        C16152c b4 = c.mo78544b();
        C13706o.m87928e(b4, "mutableClassId.asSingleFqName()");
        HashMap<C16153d, C16152c> hashMap = f62124m;
        C16153d j = c.mo78544b().mo78566j();
        C13706o.m87928e(j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, b3);
        HashMap<C16153d, C16152c> hashMap2 = f62125n;
        C16153d j2 = b3.mo78566j();
        C13706o.m87928e(j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j2, b4);
    }

    /* renamed from: e */
    private final void m88354e(Class<?> cls, C16152c cVar) {
        C16151b g = m88356g(cls);
        C16151b m = C16151b.m96975m(cVar);
        C13706o.m87928e(m, "topLevel(kotlinFqName)");
        m88350a(g, m);
    }

    /* renamed from: f */
    private final void m88355f(Class<?> cls, C16153d dVar) {
        C16152c l = dVar.mo78579l();
        C13706o.m87928e(l, "kotlinFqName.toSafe()");
        m88354e(cls, l);
    }

    /* renamed from: g */
    private final C16151b m88356g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C16151b m = C16151b.m96975m(new C16152c(cls.getCanonicalName()));
            C13706o.m87928e(m, "topLevel(FqName(clazz.canonicalName))");
            return m;
        }
        C16151b d = m88356g(declaringClass).mo78546d(C16157f.m97019i(cls.getSimpleName()));
        C13706o.m87928e(d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return d;
    }

    /* renamed from: j */
    private final boolean m88357j(C16153d dVar, String str) {
        Integer l;
        String b = dVar.mo78568b();
        C13706o.m87928e(b, "kotlinFqName.asString()");
        String G0 = C15177w.m93652G0(b, str, "");
        if (!(G0.length() > 0) || C15177w.m93648C0(G0, '0', false, 2, (Object) null) || (l = C15175u.m93622l(G0)) == null || l.intValue() < 23) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final C16152c mo72169h() {
        return f62118g;
    }

    /* renamed from: i */
    public final List<C13872a> mo72170i() {
        return f62128q;
    }

    /* renamed from: k */
    public final boolean mo72171k(C16153d dVar) {
        return f62124m.containsKey(dVar);
    }

    /* renamed from: l */
    public final boolean mo72172l(C16153d dVar) {
        return f62125n.containsKey(dVar);
    }

    /* renamed from: m */
    public final C16151b mo72173m(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return f62122k.get(cVar.mo78566j());
    }

    /* renamed from: n */
    public final C16151b mo72174n(C16153d dVar) {
        C13706o.m87929f(dVar, "kotlinFqName");
        if (m88357j(dVar, f62113b)) {
            return f62117f;
        }
        if (m88357j(dVar, f62115d)) {
            return f62117f;
        }
        if (m88357j(dVar, f62114c)) {
            return f62119h;
        }
        if (m88357j(dVar, f62116e)) {
            return f62119h;
        }
        return f62123l.get(dVar);
    }

    /* renamed from: o */
    public final C16152c mo72175o(C16153d dVar) {
        return f62124m.get(dVar);
    }

    /* renamed from: p */
    public final C16152c mo72176p(C16153d dVar) {
        return f62125n.get(dVar);
    }
}
