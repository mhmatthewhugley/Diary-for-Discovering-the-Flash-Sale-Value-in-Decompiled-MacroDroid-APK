package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdp {

    /* renamed from: a */
    private static final Class f45703a;

    /* renamed from: b */
    private static final zzee f45704b = m64353A(false);

    /* renamed from: c */
    private static final zzee f45705c = m64353A(true);

    /* renamed from: d */
    private static final zzee f45706d = new zzeg();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f45703a = cls;
    }

    /* renamed from: A */
    private static zzee m64353A(boolean z) {
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
            return (zzee) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    static int m64354B(List list) {
        return list.size();
    }

    /* renamed from: C */
    static int m64355C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * zzbe.m64090D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += zzbe.m64095x((zzaw) list.get(i2));
        }
        return D;
    }

    /* renamed from: D */
    static int m64356D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64357E(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: E */
    static int m64357E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbw) {
            zzbw zzbw = (zzbw) list;
            i = 0;
            while (i2 < size) {
                i += zzbe.m64097z(zzbw.mo53951d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbe.m64097z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    static int m64358F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbe.m64091a(i << 3) + 4);
    }

    /* renamed from: G */
    static int m64359G(List list) {
        return list.size() * 4;
    }

    /* renamed from: H */
    static int m64360H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbe.m64091a(i << 3) + 8);
    }

    /* renamed from: I */
    static int m64361I(List list) {
        return list.size() * 8;
    }

    /* renamed from: J */
    static int m64362J(int i, List list, zzdn zzdn) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbe.m64096y(i, (zzdc) list.get(i3), zzdn);
        }
        return i2;
    }

    /* renamed from: K */
    static int m64363K(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64364L(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: L */
    static int m64364L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbw) {
            zzbw zzbw = (zzbw) list;
            i = 0;
            while (i2 < size) {
                i += zzbe.m64097z(zzbw.mo53951d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbe.m64097z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    static int m64365M(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m64366N(list) + (list.size() * zzbe.m64090D(i));
    }

    /* renamed from: N */
    static int m64366N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcr) {
            zzcr zzcr = (zzcr) list;
            i = 0;
            while (i2 < size) {
                i += zzbe.m64092b(zzcr.mo53975d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbe.m64092b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m64367O(int i, Object obj, zzdn zzdn) {
        if (!(obj instanceof zzci)) {
            return zzbe.m64091a(i << 3) + zzbe.m64088B((zzdc) obj, zzdn);
        }
        int a = zzbe.m64091a(i << 3);
        int a2 = ((zzci) obj).mo53962a();
        return a + zzbe.m64091a(a2) + a2;
    }

    /* renamed from: P */
    static int m64368P(int i, List list, zzdn zzdn) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = zzbe.m64090D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzci) {
                i2 = zzbe.m64087A((zzci) obj);
            } else {
                i2 = zzbe.m64088B((zzdc) obj, zzdn);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: Q */
    static int m64369Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64370R(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: R */
    static int m64370R(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbw) {
            zzbw zzbw = (zzbw) list;
            i = 0;
            while (i2 < size) {
                int d = zzbw.mo53951d(i2);
                i += zzbe.m64091a((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzbe.m64091a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    static int m64371S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64372T(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: T */
    static int m64372T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcr) {
            zzcr zzcr = (zzcr) list;
            i = 0;
            while (i2 < size) {
                long d = zzcr.mo53975d(i2);
                i += zzbe.m64092b((d >> 63) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzbe.m64092b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m64373U(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = zzbe.m64090D(i) * size;
        if (list instanceof zzck) {
            zzck zzck = (zzck) list;
            while (i4 < size) {
                Object y = zzck.mo53971y(i4);
                if (y instanceof zzaw) {
                    i3 = zzbe.m64095x((zzaw) y);
                } else {
                    i3 = zzbe.m64089C((String) y);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzaw) {
                    i2 = zzbe.m64095x((zzaw) obj);
                } else {
                    i2 = zzbe.m64089C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: V */
    static int m64374V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64375W(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: W */
    static int m64375W(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbw) {
            zzbw zzbw = (zzbw) list;
            i = 0;
            while (i2 < size) {
                i += zzbe.m64091a(zzbw.mo53951d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbe.m64091a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: X */
    static int m64376X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m64377Y(list) + (size * zzbe.m64090D(i));
    }

    /* renamed from: Y */
    static int m64377Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcr) {
            zzcr zzcr = (zzcr) list;
            i = 0;
            while (i2 < size) {
                i += zzbe.m64092b(zzcr.mo53975d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbe.m64092b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static zzee m64378Z() {
        return f45704b;
    }

    /* renamed from: a */
    public static zzee m64379a() {
        return f45705c;
    }

    /* renamed from: b */
    public static zzee m64380b() {
        return f45706d;
    }

    /* renamed from: c */
    static void m64381c(zzbk zzbk, Object obj, Object obj2) {
        zzbk.mo53913a(obj2);
        throw null;
    }

    /* renamed from: d */
    static void m64382d(zzee zzee, Object obj, Object obj2) {
        zzee.mo54049f(obj, zzee.mo54047d(zzee.mo54046c(obj), zzee.mo54046c(obj2)));
    }

    /* renamed from: e */
    public static void m64383e(Class cls) {
        Class cls2;
        if (!zzbv.class.isAssignableFrom(cls) && (cls2 = f45703a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: f */
    public static void m64384f(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53877a(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m64385g(int i, List list, zzew zzew) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53884g(i, list);
        }
    }

    /* renamed from: h */
    public static void m64386h(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53882e(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m64387i(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53881d(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m64388j(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53880c(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m64389k(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53878b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m64390l(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53892o(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m64391m(int i, List list, zzew zzew, zzdn zzdn) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzbf) zzew).mo53876H(i, list.get(i2), zzdn);
            }
        }
    }

    /* renamed from: n */
    public static void m64392n(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53888k(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m64393o(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53869A(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m64394p(int i, List list, zzew zzew, zzdn zzdn) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzbf) zzew).mo53874F(i, list.get(i2), zzdn);
            }
        }
    }

    /* renamed from: q */
    public static void m64395q(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53870B(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m64396r(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53896r(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m64397s(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53904z(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m64398t(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53872D(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m64399u(int i, List list, zzew zzew) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53902x(i, list);
        }
    }

    /* renamed from: v */
    public static void m64400v(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53899u(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m64401w(int i, List list, zzew zzew, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzew.mo53891n(i, list, z);
        }
    }

    /* renamed from: x */
    static boolean m64402x(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: y */
    static int m64403y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbe.m64091a(i << 3) + 1);
    }

    /* renamed from: z */
    static void m64404z(zzcx zzcx, Object obj, Object obj2, long j) {
        zzeo.m64512x(obj, j, zzcx.m64275b(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j)));
    }
}
