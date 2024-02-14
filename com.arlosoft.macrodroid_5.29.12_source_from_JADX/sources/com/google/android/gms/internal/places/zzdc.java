package com.google.android.gms.internal.places;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzdc {

    /* renamed from: a */
    private static final Class<?> f45364a = m63601s();

    /* renamed from: b */
    private static final zzds<?, ?> f45365b = m63553A(false);

    /* renamed from: c */
    private static final zzds<?, ?> f45366c = m63553A(true);

    /* renamed from: d */
    private static final zzds<?, ?> f45367d = new zzdu();

    /* renamed from: A */
    private static zzds<?, ?> m63553A(boolean z) {
        try {
            Class<?> t = m63602t();
            if (t == null) {
                return null;
            }
            return (zzds) t.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static void m63554B(int i, List<Long> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53394y(i, list, z);
        }
    }

    /* renamed from: C */
    static int m63555C(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzby) {
            zzby zzby = (zzby) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63121g0(zzby.mo53503d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63121g0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static void m63556D(int i, List<Long> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53367M(i, list, z);
        }
    }

    /* renamed from: E */
    public static void m63557E(Class<?> cls) {
        Class<?> cls2;
        if (!zzbc.class.isAssignableFrom(cls) && (cls2 = f45364a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: F */
    static int m63558F(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbe) {
            zzbe zzbe = (zzbe) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63098C0(zzbe.mo53467d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63098C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static void m63559G(int i, List<Long> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53388s(i, list, z);
        }
    }

    /* renamed from: H */
    static int m63560H(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbe) {
            zzbe zzbe = (zzbe) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63141x0(zzbe.mo53467d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63141x0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public static void m63561I(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53383o(i, list, z);
        }
    }

    /* renamed from: J */
    static int m63562J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbe) {
            zzbe zzbe = (zzbe) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63143y0(zzbe.mo53467d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63143y0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m63563K(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53358D(i, list, z);
        }
    }

    /* renamed from: L */
    static int m63564L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbe) {
            zzbe zzbe = (zzbe) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63144z0(zzbe.mo53467d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63144z0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    public static void m63565M(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53370b(i, list, z);
        }
    }

    /* renamed from: N */
    static int m63566N(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: O */
    public static void m63567O(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53369a(i, list, z);
        }
    }

    /* renamed from: P */
    static int m63568P(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: Q */
    public static void m63569Q(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53371c(i, list, z);
        }
    }

    /* renamed from: R */
    static int m63570R(List<?> list) {
        return list.size();
    }

    /* renamed from: S */
    public static void m63571S(int i, List<Integer> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53355A(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m63572T(int i, List<Boolean> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53372d(i, list, z);
        }
    }

    /* renamed from: U */
    static int m63573U(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m63605w(list) + (list.size() * zzaj.m63139w0(i));
    }

    /* renamed from: V */
    static int m63574V(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63608z(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: W */
    static int m63575W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63555C(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: X */
    static int m63576X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63558F(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: Y */
    static int m63577Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63560H(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: Z */
    static int m63578Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63562J(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: a */
    private static <UT, UB> UB m63579a(int i, int i2, UB ub, zzds<UT, UB> zzds) {
        if (ub == null) {
            ub = zzds.mo53608f();
        }
        zzds.mo53603a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a0 */
    static int m63580a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m63564L(list) + (size * zzaj.m63139w0(i));
    }

    /* renamed from: b */
    static <UT, UB> UB m63581b(int i, List<Integer> list, zzbf zzbf, UB ub, zzds<UT, UB> zzds) {
        if (zzbf == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzbf.mo53472a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m63579a(i, intValue, ub, zzds);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzbf.mo53472a(intValue2)) {
                    ub = m63579a(i, intValue2, ub, zzds);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: b0 */
    static int m63582b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m63127n0(i, 0);
    }

    /* renamed from: c */
    public static void m63583c(int i, List<String> list, zzel zzel) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53389t(i, list);
        }
    }

    /* renamed from: c0 */
    static int m63584c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m63120f0(i, 0);
    }

    /* renamed from: d */
    public static void m63585d(int i, List<?> list, zzel zzel, zzda zzda) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53366L(i, list, zzda);
        }
    }

    /* renamed from: d0 */
    static int m63586d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m63103I(i, true);
    }

    /* renamed from: e */
    public static void m63587e(int i, List<Double> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53357C(i, list, z);
        }
    }

    /* renamed from: f */
    static <T, FT extends zzax<FT>> void m63588f(zzar<FT> zzar, T t, T t2) {
        zzav<FT> b = zzar.mo53412b(t2);
        if (!b.f45189a.isEmpty()) {
            zzar.mo53415e(t).mo53427k(b);
        }
    }

    /* renamed from: g */
    static <T> void m63589g(zzcd zzcd, T t, T t2, long j) {
        zzdy.m63682g(t, j, zzcd.mo53512b(zzdy.m63667G(t, j), zzdy.m63667G(t2, j)));
    }

    /* renamed from: h */
    static <T, UT, UB> void m63590h(zzds<UT, UB> zzds, T t, T t2) {
        zzds.mo53609g(t, zzds.mo53611i(zzds.mo53613k(t), zzds.mo53613k(t2)));
    }

    /* renamed from: i */
    public static void m63591i(int i, List<zzw> list, zzel zzel) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53379k(i, list);
        }
    }

    /* renamed from: j */
    public static void m63592j(int i, List<?> list, zzel zzel, zzda zzda) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53356B(i, list, zzda);
        }
    }

    /* renamed from: k */
    public static void m63593k(int i, List<Float> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53373e(i, list, z);
        }
    }

    /* renamed from: l */
    public static zzds<?, ?> m63594l() {
        return f45365b;
    }

    /* renamed from: m */
    static int m63595m(int i, Object obj, zzda zzda) {
        if (obj instanceof zzbp) {
            return zzaj.m63116d(i, (zzbp) obj);
        }
        return zzaj.m63137v(i, (zzck) obj, zzda);
    }

    /* renamed from: n */
    static int m63596n(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int w0 = zzaj.m63139w0(i) * size;
        if (list instanceof zzbr) {
            zzbr zzbr = (zzbr) list;
            while (i4 < size) {
                Object c0 = zzbr.mo53491c0(i4);
                if (c0 instanceof zzw) {
                    i3 = zzaj.m63140x((zzw) c0);
                } else {
                    i3 = zzaj.m63128o0((String) c0);
                }
                w0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzw) {
                    i2 = zzaj.m63140x((zzw) obj);
                } else {
                    i2 = zzaj.m63128o0((String) obj);
                }
                w0 += i2;
                i4++;
            }
        }
        return w0;
    }

    /* renamed from: o */
    static int m63597o(int i, List<?> list, zzda zzda) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = zzaj.m63139w0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzbp) {
                i2 = zzaj.m63117e((zzbp) obj);
            } else {
                i2 = zzaj.m63119f((zzck) obj, zzda);
            }
            w0 += i2;
        }
        return w0;
    }

    /* renamed from: p */
    public static void m63598p(int i, List<Long> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53364J(i, list, z);
        }
    }

    /* renamed from: q */
    public static zzds<?, ?> m63599q() {
        return f45366c;
    }

    /* renamed from: r */
    public static zzds<?, ?> m63600r() {
        return f45367d;
    }

    /* renamed from: s */
    private static Class<?> m63601s() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    private static Class<?> m63602t() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    static int m63603u(int i, List<zzw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = size * zzaj.m63139w0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            w0 += zzaj.m63140x(list.get(i2));
        }
        return w0;
    }

    /* renamed from: v */
    static int m63604v(int i, List<zzck> list, zzda zzda) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzaj.m63101G(i, list.get(i3), zzda);
        }
        return i2;
    }

    /* renamed from: w */
    static int m63605w(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzby) {
            zzby zzby = (zzby) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63112Z(zzby.mo53503d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63112Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static void m63606x(int i, List<Long> list, zzel zzel, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzel.mo53362H(i, list, z);
        }
    }

    /* renamed from: y */
    static boolean m63607y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    static int m63608z(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzby) {
            zzby zzby = (zzby) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m63115c0(zzby.mo53503d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzaj.m63115c0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }
}
