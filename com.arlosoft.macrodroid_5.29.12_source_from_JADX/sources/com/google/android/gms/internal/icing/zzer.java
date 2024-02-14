package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzer {

    /* renamed from: a */
    private static final Class<?> f40947a;

    /* renamed from: b */
    private static final zzfd<?, ?> f40948b = m58987z(false);

    /* renamed from: c */
    private static final zzfd<?, ?> f40949c = m58987z(true);

    /* renamed from: d */
    private static final zzfd<?, ?> f40950d = new zzff();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f40947a = cls;
    }

    /* renamed from: A */
    public static void m58936A(Class<?> cls) {
        Class<?> cls2;
        if (!zzda.class.isAssignableFrom(cls) && (cls2 = f40947a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: B */
    static int m58937B(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.m58700B(zzdt.mo50336f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.m58700B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    static int m58938C(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m58937B(list) + (list.size() * zzcm.m58708y(i));
    }

    /* renamed from: D */
    static int m58939D(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.m58700B(zzdt.mo50336f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.m58700B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: E */
    static int m58940E(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58939D(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: F */
    static int m58941F(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                long f = zzdt.mo50336f(i2);
                i += zzcm.m58700B((f >> 63) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + zzcm.m58700B((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    static int m58942G(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58941F(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: H */
    static int m58943H(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.m58709z(zzdb.mo50315d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.m58709z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    static int m58944I(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58943H(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: J */
    static int m58945J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.m58709z(zzdb.mo50315d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.m58709z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    static int m58946K(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58945J(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: L */
    static int m58947L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.m58699A(zzdb.mo50315d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.m58699A(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    static int m58948M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58947L(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: N */
    static int m58949N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                int d = zzdb.mo50315d(i2);
                i += zzcm.m58699A((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + zzcm.m58699A((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m58950O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m58949N(list) + (size * zzcm.m58708y(i));
    }

    /* renamed from: P */
    static int m58951P(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: Q */
    static int m58952Q(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzcm.m58699A(i << 3) + 4);
    }

    /* renamed from: R */
    static int m58953R(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: S */
    static int m58954S(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzcm.m58699A(i << 3) + 8);
    }

    /* renamed from: T */
    static int m58955T(List<?> list) {
        return list.size();
    }

    /* renamed from: U */
    static int m58956U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzcm.m58699A(i << 3) + 1);
    }

    /* renamed from: V */
    static int m58957V(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int y = zzcm.m58708y(i) * size;
        if (list instanceof zzdo) {
            zzdo zzdo = (zzdo) list;
            while (i4 < size) {
                Object x = zzdo.mo50332x(i4);
                if (x instanceof zzcf) {
                    i3 = zzcm.m58703a((zzcf) x);
                } else {
                    i3 = zzcm.m58701C((String) x);
                }
                y += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzcf) {
                    i2 = zzcm.m58703a((zzcf) obj);
                } else {
                    i2 = zzcm.m58701C((String) obj);
                }
                y += i2;
                i4++;
            }
        }
        return y;
    }

    /* renamed from: W */
    static int m58958W(int i, Object obj, zzep zzep) {
        if (!(obj instanceof zzdm)) {
            return zzcm.m58699A(i << 3) + zzcm.m58704b((zzee) obj, zzep);
        }
        int A = zzcm.m58699A(i << 3);
        int a = ((zzdm) obj).mo50324a();
        return A + zzcm.m58699A(a) + a;
    }

    /* renamed from: X */
    static int m58959X(int i, List<?> list, zzep zzep) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = zzcm.m58708y(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzdm) {
                i2 = zzcm.m58702D((zzdm) obj);
            } else {
                i2 = zzcm.m58704b((zzee) obj, zzep);
            }
            y += i2;
        }
        return y;
    }

    /* renamed from: Y */
    static int m58960Y(int i, List<zzcf> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * zzcm.m58708y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += zzcm.m58703a(list.get(i2));
        }
        return y;
    }

    /* renamed from: Z */
    static int m58961Z(int i, List<zzee> list, zzep zzep) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzcm.m58705e(i, list.get(i3), zzep);
        }
        return i2;
    }

    /* renamed from: a */
    public static zzfd<?, ?> m58962a() {
        return f40948b;
    }

    /* renamed from: b */
    public static zzfd<?, ?> m58963b() {
        return f40949c;
    }

    /* renamed from: c */
    public static zzfd<?, ?> m58964c() {
        return f40950d;
    }

    /* renamed from: d */
    static boolean m58965d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    static <T, FT extends zzct<FT>> void m58966e(zzcq<FT> zzcq, T t, T t2) {
        zzcq.mo50289b(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m58967f(zzfd<UT, UB> zzfd, T t, T t2) {
        zzfd.mo50403a(t, zzfd.mo50406d(zzfd.mo50404b(t), zzfd.mo50404b(t2)));
    }

    /* renamed from: g */
    static <T> void m58968g(zzdz zzdz, T t, T t2, long j) {
        zzdy zzdy = (zzdy) zzfn.m59087s(t, j);
        zzdy zzdy2 = (zzdy) zzfn.m59087s(t2, j);
        if (!zzdy2.isEmpty()) {
            if (!zzdy.mo50346d()) {
                zzdy = zzdy.mo50343b();
            }
            zzdy.mo50342a(zzdy2);
        }
        zzfn.m59088t(t, j, zzdy);
    }

    /* renamed from: h */
    public static void m58969h(int i, List<Double> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50257I(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m58970i(int i, List<Float> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50256H(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m58971j(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50253E(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m58972k(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50254F(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m58973l(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50266i(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m58974m(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50255G(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m58975n(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50264g(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m58976o(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50251C(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m58977p(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50262e(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m58978q(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50265h(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m58979r(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50252D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m58980s(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50263f(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m58981t(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50258a(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m58982u(int i, List<Boolean> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50259b(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m58983v(int i, List<String> list, zzcn zzcn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50260c(i, list);
        }
    }

    /* renamed from: w */
    public static void m58984w(int i, List<zzcf> list, zzcn zzcn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.mo50261d(i, list);
        }
    }

    /* renamed from: x */
    public static void m58985x(int i, List<?> list, zzcn zzcn, zzep zzep) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzcn.mo50249A(i, list.get(i2), zzep);
            }
        }
    }

    /* renamed from: y */
    public static void m58986y(int i, List<?> list, zzcn zzcn, zzep zzep) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzcn.mo50250B(i, list.get(i2), zzep);
            }
        }
    }

    /* renamed from: z */
    private static zzfd<?, ?> m58987z(boolean z) {
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
            return (zzfd) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
