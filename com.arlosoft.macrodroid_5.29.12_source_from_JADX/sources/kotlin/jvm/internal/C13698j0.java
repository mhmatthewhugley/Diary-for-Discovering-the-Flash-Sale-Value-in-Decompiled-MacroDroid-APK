package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p297ja.C13316c;
import p370qa.C16254a;
import p370qa.C16255b;
import p370qa.C16256c;
import p370qa.C16257d;
import p370qa.C16258e;
import p370qa.C16259f;
import p370qa.C16260g;
import p370qa.C16261h;
import p370qa.C16262i;
import p370qa.C16263j;
import p370qa.C16264k;
import p370qa.C16265l;
import p370qa.C16266m;
import p370qa.C16267n;
import p370qa.C16268o;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;
import p370qa.C16272s;
import p370qa.C16273t;
import p370qa.C16274u;
import p370qa.C16275v;
import p370qa.C16276w;
import p379ra.C16368a;
import p379ra.C16369b;
import p379ra.C16370c;
import p379ra.C16371d;
import p379ra.C16372e;
import p379ra.C16374f;

/* renamed from: kotlin.jvm.internal.j0 */
/* compiled from: TypeIntrinsics */
public class C13698j0 {
    /* renamed from: a */
    public static Collection m87901a(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16369b)) {
            m87918r(obj, "kotlin.collections.MutableCollection");
        }
        return m87908h(obj);
    }

    /* renamed from: b */
    public static Iterable m87902b(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16370c)) {
            m87918r(obj, "kotlin.collections.MutableIterable");
        }
        return m87909i(obj);
    }

    /* renamed from: c */
    public static List m87903c(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16371d)) {
            m87918r(obj, "kotlin.collections.MutableList");
        }
        return m87910j(obj);
    }

    /* renamed from: d */
    public static Map m87904d(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16372e)) {
            m87918r(obj, "kotlin.collections.MutableMap");
        }
        return m87911k(obj);
    }

    /* renamed from: e */
    public static Map.Entry m87905e(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16372e.C16373a)) {
            m87918r(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m87912l(obj);
    }

    /* renamed from: f */
    public static Set m87906f(Object obj) {
        if ((obj instanceof C16368a) && !(obj instanceof C16374f)) {
            m87918r(obj, "kotlin.collections.MutableSet");
        }
        return m87913m(obj);
    }

    /* renamed from: g */
    public static Object m87907g(Object obj, int i) {
        if (obj != null && !m87915o(obj, i)) {
            m87918r(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: h */
    public static Collection m87908h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: i */
    public static Iterable m87909i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: j */
    public static List m87910j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: k */
    public static Map m87911k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: l */
    public static Map.Entry m87912l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: m */
    public static Set m87913m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m87917q(e);
        }
    }

    /* renamed from: n */
    public static int m87914n(Object obj) {
        if (obj instanceof C13699k) {
            return ((C13699k) obj).getArity();
        }
        if (obj instanceof C16254a) {
            return 0;
        }
        if (obj instanceof C16265l) {
            return 1;
        }
        if (obj instanceof C16269p) {
            return 2;
        }
        if (obj instanceof C16270q) {
            return 3;
        }
        if (obj instanceof C16271r) {
            return 4;
        }
        if (obj instanceof C16272s) {
            return 5;
        }
        if (obj instanceof C16273t) {
            return 6;
        }
        if (obj instanceof C16274u) {
            return 7;
        }
        if (obj instanceof C16275v) {
            return 8;
        }
        if (obj instanceof C16276w) {
            return 9;
        }
        if (obj instanceof C16255b) {
            return 10;
        }
        if (obj instanceof C16256c) {
            return 11;
        }
        if (obj instanceof C16257d) {
            return 12;
        }
        if (obj instanceof C16258e) {
            return 13;
        }
        if (obj instanceof C16259f) {
            return 14;
        }
        if (obj instanceof C16260g) {
            return 15;
        }
        if (obj instanceof C16261h) {
            return 16;
        }
        if (obj instanceof C16262i) {
            return 17;
        }
        if (obj instanceof C16263j) {
            return 18;
        }
        if (obj instanceof C16264k) {
            return 19;
        }
        if (obj instanceof C16266m) {
            return 20;
        }
        if (obj instanceof C16267n) {
            return 21;
        }
        return obj instanceof C16268o ? 22 : -1;
    }

    /* renamed from: o */
    public static boolean m87915o(Object obj, int i) {
        return (obj instanceof C13316c) && m87914n(obj) == i;
    }

    /* renamed from: p */
    private static <T extends Throwable> T m87916p(T t) {
        return C13706o.m87935l(t, C13698j0.class.getName());
    }

    /* renamed from: q */
    public static ClassCastException m87917q(ClassCastException classCastException) {
        throw ((ClassCastException) m87916p(classCastException));
    }

    /* renamed from: r */
    public static void m87918r(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m87919s(name + " cannot be cast to " + str);
    }

    /* renamed from: s */
    public static void m87919s(String str) {
        throw m87917q(new ClassCastException(str));
    }
}
