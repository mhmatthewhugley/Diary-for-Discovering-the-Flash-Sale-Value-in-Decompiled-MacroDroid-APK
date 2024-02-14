package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14869u;
import p271gb.C12329c;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g0 */
/* compiled from: specialBuiltinMembers.kt */
public final class C14203g0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g0$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14204a extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14204a f62895a = new C14204a();

        C14204a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C14214i.f62922a.mo72755b(C16519a.m98622o(bVar)));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g0$b */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14205b extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14205b f62896a = new C14205b();

        C14205b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C14194e.f62881n.mo72722j((C14156y0) bVar));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g0$c */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14206c extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14206c f62897a = new C14206c();

        C14206c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C13853h.m88260f0(bVar) && C14197f.m89741m(bVar) != null);
        }
    }

    /* renamed from: a */
    public static final boolean m89752a(C13936b bVar) {
        C13706o.m87929f(bVar, "<this>");
        return m89755d(bVar) != null;
    }

    /* renamed from: b */
    public static final String m89753b(C13936b bVar) {
        C13936b o;
        C16157f i;
        C13706o.m87929f(bVar, "callableMemberDescriptor");
        C13936b c = m89754c(bVar);
        if (c == null || (o = C16519a.m98622o(c)) == null) {
            return null;
        }
        if (o instanceof C14140t0) {
            return C14214i.f62922a.mo72754a(o);
        }
        if (!(o instanceof C14156y0) || (i = C14194e.f62881n.mo72721i((C14156y0) o)) == null) {
            return null;
        }
        return i.mo78583d();
    }

    /* renamed from: c */
    private static final C13936b m89754c(C13936b bVar) {
        if (C13853h.m88260f0(bVar)) {
            return m89755d(bVar);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends C13936b> T m89755d(T t) {
        C13706o.m87929f(t, "<this>");
        if (!C14208h0.f62898a.mo72743g().contains(t.getName()) && !C14202g.f62890a.mo72734d().contains(C16519a.m98622o(t).getName())) {
            return null;
        }
        if (t instanceof C14140t0 ? true : t instanceof C14126s0) {
            return C16519a.m98610c(t, false, C14204a.f62895a, 1, (Object) null);
        }
        if (t instanceof C14156y0) {
            return C16519a.m98610c(t, false, C14205b.f62896a, 1, (Object) null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends C13936b> T m89756e(T t) {
        C13706o.m87929f(t, "<this>");
        T d = m89755d(t);
        if (d != null) {
            return d;
        }
        C14197f fVar = C14197f.f62882n;
        C16157f name = t.getName();
        C13706o.m87928e(name, "name");
        if (!fVar.mo72725l(name)) {
            return null;
        }
        return C16519a.m98610c(t, false, C14206c.f62897a, 1, (Object) null);
    }

    /* renamed from: f */
    public static final boolean m89757f(C13948e eVar, C13908a aVar) {
        C13706o.m87929f(eVar, "<this>");
        C13706o.m87929f(aVar, "specialCallableDescriptor");
        C14064m b = aVar.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C14951m0 p = ((C13948e) b).mo72274p();
        C13706o.m87928e(p, "specialCallableDescripto…ssDescriptor).defaultType");
        C13948e s = C14650d.m91632s(eVar);
        while (true) {
            boolean z = false;
            if (s == null) {
                return false;
            }
            if (!(s instanceof C12329c)) {
                if (C14869u.m92694b(s.mo72274p(), p) != null) {
                    z = true;
                }
                if (z) {
                    return !C13853h.m88260f0(s);
                }
            }
            s = C14650d.m91632s(s);
        }
    }

    /* renamed from: g */
    public static final boolean m89758g(C13936b bVar) {
        C13706o.m87929f(bVar, "<this>");
        return C16519a.m98622o(bVar).mo62163b() instanceof C12329c;
    }

    /* renamed from: h */
    public static final boolean m89759h(C13936b bVar) {
        C13706o.m87929f(bVar, "<this>");
        return m89758g(bVar) || C13853h.m88260f0(bVar);
    }
}
