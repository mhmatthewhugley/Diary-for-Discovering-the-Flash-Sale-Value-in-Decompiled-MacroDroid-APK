package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.util.Objects;

@GwtCompatible
public final class Preconditions {
    private Preconditions() {
    }

    /* renamed from: a */
    private static String m72468a(int i, int i2, String str) {
        if (i < 0) {
            return m72479l("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m72479l("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: b */
    public static void m72469b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m72470c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m72471d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m72479l(str, objArr));
        }
    }

    /* renamed from: e */
    public static <T> T m72472e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    public static <T> T m72473f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static <T> T m72474g(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m72479l(str, objArr));
    }

    /* renamed from: h */
    public static int m72475h(int i, int i2) {
        return m72476i(i, i2, "index");
    }

    /* renamed from: i */
    public static int m72476i(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m72468a(i, i2, str));
    }

    /* renamed from: j */
    public static void m72477j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public static void m72478k(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(m72479l(str, objArr));
        }
    }

    /* renamed from: l */
    static String m72479l(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            int i3 = i + 1;
            i2 = indexOf + 2;
            i = i3;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
