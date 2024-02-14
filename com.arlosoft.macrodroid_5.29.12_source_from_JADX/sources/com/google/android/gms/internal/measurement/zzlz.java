package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlz {

    /* renamed from: a */
    private static final Class f41704a;

    /* renamed from: b */
    private static final zzmo f41705b = m60700C(false);

    /* renamed from: c */
    private static final zzmo f41706c = m60700C(true);

    /* renamed from: d */
    private static final zzmo f41707d = new zzmq();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f41704a = cls;
    }

    /* renamed from: A */
    static int m60698A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjm.m60396a(i << 3) + 1);
    }

    /* renamed from: B */
    static void m60699B(zzlh zzlh, Object obj, Object obj2, long j) {
        zzmy.m60869x(obj, j, zzlh.m60597b(zzmy.m60856k(obj, j), zzmy.m60856k(obj2, j)));
    }

    /* renamed from: C */
    private static zzmo m60700C(boolean z) {
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
            return (zzmo) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m60701D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m60702E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * zzjm.m60395D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += zzjm.m60400x((zzje) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m60703F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60704G(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: G */
    static int m60704G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i = 0;
            while (i2 < size) {
                i += zzjm.m60402z(zzkg.mo51463d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjm.m60402z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m60705H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjm.m60396a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m60706I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m60707J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjm.m60396a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m60708K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m60709L(int i, List list, zzlx zzlx) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjm.m60401y(i, (zzlm) list.get(i3), zzlx);
        }
        return i2;
    }

    /* renamed from: M */
    static int m60710M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60711N(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: N */
    static int m60711N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i = 0;
            while (i2 < size) {
                i += zzjm.m60402z(zzkg.mo51463d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjm.m60402z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m60712O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m60713P(list) + (list.size() * zzjm.m60395D(i));
    }

    /* renamed from: P */
    static int m60713P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlb = (zzlb) list;
            i = 0;
            while (i2 < size) {
                i += zzjm.m60397b(zzlb.mo51470v(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjm.m60397b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m60714Q(int i, Object obj, zzlx zzlx) {
        if (!(obj instanceof zzks)) {
            return zzjm.m60396a(i << 3) + zzjm.m60393B((zzlm) obj, zzlx);
        }
        int a = zzjm.m60396a(i << 3);
        int a2 = ((zzks) obj).mo51475a();
        return a + zzjm.m60396a(a2) + a2;
    }

    /* renamed from: R */
    static int m60715R(int i, List list, zzlx zzlx) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = zzjm.m60395D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzks) {
                i2 = zzjm.m60392A((zzks) obj);
            } else {
                i2 = zzjm.m60393B((zzlm) obj, zzlx);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m60716S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60717T(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: T */
    static int m60717T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i = 0;
            while (i2 < size) {
                int d = zzkg.mo51463d(i2);
                i += zzjm.m60396a((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzjm.m60396a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m60718U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60719V(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: V */
    static int m60719V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlb = (zzlb) list;
            i = 0;
            while (i2 < size) {
                long v = zzlb.mo51470v(i2);
                i += zzjm.m60397b((v >> 63) ^ (v + v));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzjm.m60397b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m60720W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = zzjm.m60395D(i) * size;
        if (list instanceof zzku) {
            zzku zzku = (zzku) list;
            while (i4 < size) {
                Object y = zzku.mo51484y(i4);
                if (y instanceof zzje) {
                    i3 = zzjm.m60400x((zzje) y);
                } else {
                    i3 = zzjm.m60394C((String) y);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzje) {
                    i2 = zzjm.m60400x((zzje) obj);
                } else {
                    i2 = zzjm.m60394C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m60721X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60722Y(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: Y */
    static int m60722Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i = 0;
            while (i2 < size) {
                i += zzjm.m60396a(zzkg.mo51463d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjm.m60396a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m60723Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m60725a0(list) + (size * zzjm.m60395D(i));
    }

    /* renamed from: a */
    public static zzmo m60724a() {
        return f41706c;
    }

    /* renamed from: a0 */
    static int m60725a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlb = (zzlb) list;
            i = 0;
            while (i2 < size) {
                i += zzjm.m60397b(zzlb.mo51470v(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjm.m60397b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static zzmo m60726b() {
        return f41707d;
    }

    /* renamed from: b0 */
    public static zzmo m60727b0() {
        return f41705b;
    }

    /* renamed from: c */
    static Object m60728c(Object obj, int i, List list, zzkj zzkj, Object obj2, zzmo zzmo) {
        Object obj3 = null;
        if (zzkj == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzkj.mo50918v(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj3 = m60729d(obj, i, intValue, obj3, zzmo);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkj.mo50918v(intValue2)) {
                    obj3 = m60729d(obj, i, intValue2, obj3, zzmo);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    static Object m60729d(Object obj, int i, int i2, Object obj2, zzmo zzmo) {
        if (obj2 == null) {
            obj2 = zzmo.mo51561c(obj);
        }
        zzmo.mo51564f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    static void m60730e(zzjs zzjs, Object obj, Object obj2) {
        zzjs.mo51417a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m60731f(zzmo zzmo, Object obj, Object obj2) {
        zzmo.mo51566h(obj, zzmo.mo51563e(zzmo.mo51562d(obj), zzmo.mo51562d(obj2)));
    }

    /* renamed from: g */
    public static void m60732g(Class cls) {
        Class cls2;
        if (!zzkf.class.isAssignableFrom(cls) && (cls2 = f41704a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m60733h(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51380a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m60734i(int i, List list, zzng zzng) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51387g(i, list);
        }
    }

    /* renamed from: j */
    public static void m60735j(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51385e(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m60736k(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51384d(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m60737l(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51383c(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m60738m(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51381b(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m60739n(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51395o(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m60740o(int i, List list, zzng zzng, zzlx zzlx) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzjn) zzng).mo51378G(i, list.get(i2), zzlx);
            }
        }
    }

    /* renamed from: p */
    public static void m60741p(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51391k(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m60742q(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51372A(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m60743r(int i, List list, zzng zzng, zzlx zzlx) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzjn) zzng).mo51379H(i, list.get(i2), zzlx);
            }
        }
    }

    /* renamed from: s */
    public static void m60744s(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51373B(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m60745t(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51399r(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m60746u(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51407z(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m60747v(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51375D(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m60748w(int i, List list, zzng zzng) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51405x(i, list);
        }
    }

    /* renamed from: x */
    public static void m60749x(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51402u(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m60750y(int i, List list, zzng zzng, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzng.mo51394n(i, list, z);
        }
    }

    /* renamed from: z */
    static boolean m60751z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
