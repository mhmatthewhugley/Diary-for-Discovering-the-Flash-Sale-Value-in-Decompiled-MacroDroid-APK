package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.core.p007os.EnvironmentCompat;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1 */
/* compiled from: Visibilities.kt */
public final class C14054l1 {

    /* renamed from: a */
    public static final C14054l1 f62671a = new C14054l1();

    /* renamed from: b */
    private static final Map<C14068m1, Integer> f62672b;

    /* renamed from: c */
    private static final C14062h f62673c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$a */
    /* compiled from: Visibilities.kt */
    public static final class C14055a extends C14068m1 {

        /* renamed from: c */
        public static final C14055a f62674c = new C14055a();

        private C14055a() {
            super("inherited", false);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$b */
    /* compiled from: Visibilities.kt */
    public static final class C14056b extends C14068m1 {

        /* renamed from: c */
        public static final C14056b f62675c = new C14056b();

        private C14056b() {
            super("internal", false);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$c */
    /* compiled from: Visibilities.kt */
    public static final class C14057c extends C14068m1 {

        /* renamed from: c */
        public static final C14057c f62676c = new C14057c();

        private C14057c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$d */
    /* compiled from: Visibilities.kt */
    public static final class C14058d extends C14068m1 {

        /* renamed from: c */
        public static final C14058d f62677c = new C14058d();

        private C14058d() {
            super("local", false);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$e */
    /* compiled from: Visibilities.kt */
    public static final class C14059e extends C14068m1 {

        /* renamed from: c */
        public static final C14059e f62678c = new C14059e();

        private C14059e() {
            super("private", false);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$f */
    /* compiled from: Visibilities.kt */
    public static final class C14060f extends C14068m1 {

        /* renamed from: c */
        public static final C14060f f62679c = new C14060f();

        private C14060f() {
            super("private_to_this", false);
        }

        /* renamed from: b */
        public String mo62371b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$g */
    /* compiled from: Visibilities.kt */
    public static final class C14061g extends C14068m1 {

        /* renamed from: c */
        public static final C14061g f62680c = new C14061g();

        private C14061g() {
            super("protected", true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$h */
    /* compiled from: Visibilities.kt */
    public static final class C14062h extends C14068m1 {

        /* renamed from: c */
        public static final C14062h f62681c = new C14062h();

        private C14062h() {
            super("public", true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$i */
    /* compiled from: Visibilities.kt */
    public static final class C14063i extends C14068m1 {

        /* renamed from: c */
        public static final C14063i f62682c = new C14063i();

        private C14063i() {
            super(EnvironmentCompat.MEDIA_UNKNOWN, false);
        }
    }

    static {
        Map c = C13613s0.m87738c();
        c.put(C14060f.f62679c, 0);
        c.put(C14059e.f62678c, 0);
        c.put(C14056b.f62675c, 1);
        c.put(C14061g.f62680c, 1);
        C14062h hVar = C14062h.f62681c;
        c.put(hVar, 2);
        f62672b = C13613s0.m87737b(c);
        f62673c = hVar;
    }

    private C14054l1() {
    }

    /* renamed from: a */
    public final Integer mo72564a(C14068m1 m1Var, C14068m1 m1Var2) {
        C13706o.m87929f(m1Var, "first");
        C13706o.m87929f(m1Var2, "second");
        if (m1Var == m1Var2) {
            return 0;
        }
        Map<C14068m1, Integer> map = f62672b;
        Integer num = map.get(m1Var);
        Integer num2 = map.get(m1Var2);
        if (num == null || num2 == null || C13706o.m87924a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public final boolean mo72565b(C14068m1 m1Var) {
        C13706o.m87929f(m1Var, "visibility");
        return m1Var == C14059e.f62678c || m1Var == C14060f.f62679c;
    }
}
