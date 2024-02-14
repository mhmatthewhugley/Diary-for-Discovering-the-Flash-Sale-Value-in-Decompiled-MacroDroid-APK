package com.google.android.gms.internal.nearby;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzsg {
    /* renamed from: a */
    public static int m62983a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = zzsi.m62993a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = zzsi.m62993a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m62984b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m62990h(i, i2, "index"));
    }

    /* renamed from: c */
    public static Object m62985c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m62986d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m62987e(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzsi.m62993a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: f */
    public static void m62988f(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzsi.m62993a(str, obj));
        }
    }

    /* renamed from: g */
    public static void m62989g(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m62990h(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m62990h(i2, i3, "end index");
            } else {
                str = zzsi.m62993a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: h */
    private static String m62990h(int i, int i2, String str) {
        if (i < 0) {
            return zzsi.m62993a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return zzsi.m62993a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
