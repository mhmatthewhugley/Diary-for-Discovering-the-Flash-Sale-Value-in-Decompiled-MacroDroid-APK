package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzj {
    /* renamed from: a */
    public static int m61888a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = zzl.m61936a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = zzl.m61936a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m61889b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m61894g(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m61890c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m61891d(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzl.m61936a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: e */
    public static void m61892e(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m61894g(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m61894g(i2, i3, "end index");
            } else {
                str = zzl.m61936a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: f */
    public static void m61893f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    private static String m61894g(int i, int i2, String str) {
        if (i < 0) {
            return zzl.m61936a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return zzl.m61936a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
