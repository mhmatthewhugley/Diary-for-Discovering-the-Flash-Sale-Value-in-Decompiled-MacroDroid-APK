package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzac {
    /* renamed from: a */
    public static int m61133a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = zzad.m61138a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = zzad.m61138a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m61134b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m61137e(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m61135c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m61137e(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m61137e(i2, i3, "end index");
            } else {
                str = zzad.m61138a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    public static void m61136d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    /* renamed from: e */
    private static String m61137e(int i, int i2, String str) {
        if (i < 0) {
            return zzad.m61138a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return zzad.m61138a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
