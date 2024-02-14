package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaey */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaey {

    /* renamed from: a */
    private static final Class f39815a;

    /* renamed from: b */
    private static final zzafn f39816b = m56667C(false);

    /* renamed from: c */
    private static final zzafn f39817c = m56667C(true);

    /* renamed from: d */
    private static final zzafn f39818d = new zzafp();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f39815a = cls;
    }

    /* renamed from: A */
    static int m56665A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacn.m56312f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m56666B(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49017k(i, list, z);
        }
    }

    /* renamed from: C */
    private static zzafn m56667C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzafn) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m56668D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m56669E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzacn.m56311e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzacn.m56304E((zzacc) list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    static int m56670F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56671G(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: G */
    static int m56671G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            i = 0;
            while (i2 < size) {
                i += zzacn.m56306G(zzadg.mo49092d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzacn.m56306G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m56672H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacn.m56312f(i << 3) + 4);
    }

    /* renamed from: I */
    static int m56673I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m56674J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacn.m56312f(i << 3) + 8);
    }

    /* renamed from: K */
    static int m56675K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m56676L(int i, List list, zzaew zzaew) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzacn.m56305F(i, (zzaek) list.get(i3), zzaew);
        }
        return i2;
    }

    /* renamed from: M */
    static int m56677M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56678N(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: N */
    static int m56678N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            i = 0;
            while (i2 < size) {
                i += zzacn.m56306G(zzadg.mo49092d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzacn.m56306G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m56679O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m56680P(list) + (list.size() * zzacn.m56311e(i));
    }

    /* renamed from: P */
    static int m56680P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            i = 0;
            while (i2 < size) {
                i += zzacn.m56313g(zzadz.mo49118d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzacn.m56313g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m56681Q(int i, Object obj, zzaew zzaew) {
        if (!(obj instanceof zzadq)) {
            return zzacn.m56312f(i << 3) + zzacn.m56308b((zzaek) obj, zzaew);
        }
        int f = zzacn.m56312f(i << 3);
        int a = ((zzadq) obj).mo49104a();
        return f + zzacn.m56312f(a) + a;
    }

    /* renamed from: R */
    static int m56682R(int i, List list, zzaew zzaew) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzacn.m56311e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzadq) {
                i2 = zzacn.m56307H((zzadq) obj);
            } else {
                i2 = zzacn.m56308b((zzaek) obj, zzaew);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    static int m56683S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56684T(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: T */
    static int m56684T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            i = 0;
            while (i2 < size) {
                int d = zzadg.mo49092d(i2);
                i += zzacn.m56312f((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzacn.m56312f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m56685U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56686V(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: V */
    static int m56686V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            i = 0;
            while (i2 < size) {
                long d = zzadz.mo49118d(i2);
                i += zzacn.m56313g((d >> 63) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzacn.m56313g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m56687W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzacn.m56311e(i) * size;
        if (list instanceof zzads) {
            zzads zzads = (zzads) list;
            while (i4 < size) {
                Object y = zzads.mo49113y(i4);
                if (y instanceof zzacc) {
                    i3 = zzacn.m56304E((zzacc) y);
                } else {
                    i3 = zzacn.m56310d((String) y);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzacc) {
                    i2 = zzacn.m56304E((zzacc) obj);
                } else {
                    i2 = zzacn.m56310d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    static int m56688X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56689Y(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: Y */
    static int m56689Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            i = 0;
            while (i2 < size) {
                i += zzacn.m56312f(zzadg.mo49092d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzacn.m56312f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m56690Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m56692a0(list) + (size * zzacn.m56311e(i));
    }

    /* renamed from: a */
    public static zzafn m56691a() {
        return f39817c;
    }

    /* renamed from: a0 */
    static int m56692a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            i = 0;
            while (i2 < size) {
                i += zzacn.m56313g(zzadz.mo49118d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzacn.m56313g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static zzafn m56693b() {
        return f39818d;
    }

    /* renamed from: b0 */
    public static zzafn m56694b0() {
        return f39816b;
    }

    /* renamed from: c */
    static Object m56695c(Object obj, int i, List list, zzadj zzadj, Object obj2, zzafn zzafn) {
        if (zzadj == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzadj.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = m56696d(obj, i, intValue, obj2, zzafn);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzadj.zza()) {
                    obj2 = m56696d(obj, i, intValue2, obj2, zzafn);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* renamed from: d */
    static Object m56696d(Object obj, int i, int i2, Object obj2, zzafn zzafn) {
        if (obj2 == null) {
            obj2 = zzafn.mo49195c(obj);
        }
        zzafn.mo49204l(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    static void m56697e(zzact zzact, Object obj, Object obj2) {
        zzact.mo49041a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m56698f(zzafn zzafn, Object obj, Object obj2) {
        zzafn.mo49207o(obj, zzafn.mo49197e(zzafn.mo49196d(obj), zzafn.mo49196d(obj2)));
    }

    /* renamed from: g */
    public static void m56699g(Class cls) {
        Class cls2;
        if (!zzadf.class.isAssignableFrom(cls) && (cls2 = f39815a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m56700h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static void m56701i(zzaef zzaef, Object obj, Object obj2, long j) {
        zzafx.m56857x(obj, j, zzaef.m56522c(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j)));
    }

    /* renamed from: j */
    public static void m56702j(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49019n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m56703k(int i, List list, zzaco zzaco) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49021p(i, list);
        }
    }

    /* renamed from: l */
    public static void m56704l(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49023r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m56705m(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49026u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m56706n(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49028w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m56707o(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49030y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m56708p(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo48996A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m56709q(int i, List list, zzaco zzaco, zzaew zzaew) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzaco.mo48997B(i, list.get(i2), zzaew);
            }
        }
    }

    /* renamed from: r */
    public static void m56710r(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo48999D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m56711s(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49001F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m56712t(int i, List list, zzaco zzaco, zzaew zzaew) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzaco.mo49002G(i, list.get(i2), zzaew);
            }
        }
    }

    /* renamed from: u */
    public static void m56713u(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49004I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m56714v(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49006K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m56715w(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49008b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m56716x(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49010d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m56717y(int i, List list, zzaco zzaco) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49013g(i, list);
        }
    }

    /* renamed from: z */
    public static void m56718z(int i, List list, zzaco zzaco, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaco.mo49015i(i, list, z);
        }
    }
}
