package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtj {

    /* renamed from: a */
    private static final Class f37263a;

    /* renamed from: b */
    private static final zzgty f37264b = m53262C(false);

    /* renamed from: c */
    private static final zzgty f37265c = m53262C(true);

    /* renamed from: d */
    private static final zzgty f37266d = new zzgua();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f37263a = cls;
    }

    /* renamed from: A */
    static int m53260A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.m52833f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m53261B(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47250k(i, list, z);
        }
    }

    /* renamed from: C */
    private static zzgty m53262C(boolean z) {
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
            return (zzgty) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m53263D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m53264E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzgql.m52832e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzgql.m52825E((zzgpw) list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    static int m53265F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53266G(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: G */
    static int m53266G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.m52827G(zzgrf.mo47356d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgql.m52827G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m53267H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.m52833f(i << 3) + 4);
    }

    /* renamed from: I */
    static int m53268I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m53269J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.m52833f(i << 3) + 8);
    }

    /* renamed from: K */
    static int m53270K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m53271L(int i, List list, zzgth zzgth) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgql.m52826F(i, (zzgso) list.get(i3), zzgth);
        }
        return i2;
    }

    /* renamed from: M */
    static int m53272M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53273N(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: N */
    static int m53273N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.m52827G(zzgrf.mo47356d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgql.m52827G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m53274O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m53275P(list) + (list.size() * zzgql.m52832e(i));
    }

    /* renamed from: P */
    static int m53275P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.m52834g(zzgsd.mo47390d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgql.m52834g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m53276Q(int i, Object obj, zzgth zzgth) {
        if (!(obj instanceof zzgru)) {
            return zzgql.m52833f(i << 3) + zzgql.m52829b((zzgso) obj, zzgth);
        }
        int f = zzgql.m52833f(i << 3);
        int a = ((zzgru) obj).mo47374a();
        return f + zzgql.m52833f(a) + a;
    }

    /* renamed from: R */
    static int m53277R(int i, List list, zzgth zzgth) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzgql.m52832e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgru) {
                i2 = zzgql.m52828H((zzgru) obj);
            } else {
                i2 = zzgql.m52829b((zzgso) obj, zzgth);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    static int m53278S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53279T(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: T */
    static int m53279T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                int d = zzgrf.mo47356d(i2);
                i += zzgql.m52833f((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgql.m52833f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m53280U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53281V(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: V */
    static int m53281V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                long d = zzgsd.mo47390d(i2);
                i += zzgql.m52834g((d >> 63) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgql.m52834g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m53282W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzgql.m52832e(i) * size;
        if (list instanceof zzgrw) {
            zzgrw zzgrw = (zzgrw) list;
            while (i4 < size) {
                Object y = zzgrw.mo47383y(i4);
                if (y instanceof zzgpw) {
                    i3 = zzgql.m52825E((zzgpw) y);
                } else {
                    i3 = zzgql.m52831d((String) y);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgpw) {
                    i2 = zzgql.m52825E((zzgpw) obj);
                } else {
                    i2 = zzgql.m52831d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    static int m53283X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53284Y(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: Y */
    static int m53284Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.m52833f(zzgrf.mo47356d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgql.m52833f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m53285Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m53287a0(list) + (size * zzgql.m52832e(i));
    }

    /* renamed from: a */
    public static zzgty m53286a() {
        return f37265c;
    }

    /* renamed from: a0 */
    static int m53287a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.m52834g(zzgsd.mo47390d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgql.m52834g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static zzgty m53288b() {
        return f37266d;
    }

    /* renamed from: b0 */
    public static zzgty m53289b0() {
        return f37264b;
    }

    /* renamed from: c */
    static Object m53290c(int i, List list, zzgri zzgri, Object obj, zzgty zzgty) {
        if (zzgri == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgri.mo41650v(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m53291d(i, intValue, obj, zzgty);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgri.mo41650v(intValue2)) {
                    obj = m53291d(i, intValue2, obj, zzgty);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m53291d(int i, int i2, Object obj, zzgty zzgty) {
        if (obj == null) {
            obj = zzgty.mo47476f();
        }
        zzgty.mo47482l(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: e */
    static void m53292e(zzgqr zzgqr, Object obj, Object obj2) {
        zzgqr.mo47274a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m53293f(zzgty zzgty, Object obj, Object obj2) {
        zzgty.mo47485o(obj, zzgty.mo47475e(zzgty.mo47474d(obj), zzgty.mo47474d(obj2)));
    }

    /* renamed from: g */
    public static void m53294g(Class cls) {
        Class cls2;
        if (!zzgre.class.isAssignableFrom(cls) && (cls2 = f37263a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m53295h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static void m53296i(zzgsj zzgsj, Object obj, Object obj2, long j) {
        zzgui.m53426D(obj, j, zzgsj.m53096c(zzgui.m53446p(obj, j), zzgui.m53446p(obj2, j)));
    }

    /* renamed from: j */
    public static void m53297j(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47252n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m53298k(int i, List list, zzgqm zzgqm) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47254p(i, list);
        }
    }

    /* renamed from: l */
    public static void m53299l(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47256r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m53300m(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47259u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m53301n(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47261w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m53302o(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47263y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m53303p(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47229A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m53304q(int i, List list, zzgqm zzgqm, zzgth zzgth) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgqm.mo47230B(i, list.get(i2), zzgth);
            }
        }
    }

    /* renamed from: r */
    public static void m53305r(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47232D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m53306s(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47234F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m53307t(int i, List list, zzgqm zzgqm, zzgth zzgth) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgqm.mo47235G(i, list.get(i2), zzgth);
            }
        }
    }

    /* renamed from: u */
    public static void m53308u(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47237I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m53309v(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47239K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m53310w(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47241b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m53311x(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47243d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m53312y(int i, List list, zzgqm zzgqm) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47246g(i, list);
        }
    }

    /* renamed from: z */
    public static void m53313z(int i, List list, zzgqm zzgqm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgqm.mo47248i(i, list, z);
        }
    }
}
