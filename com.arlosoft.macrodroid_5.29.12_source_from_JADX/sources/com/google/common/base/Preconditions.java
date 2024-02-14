package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    /* renamed from: A */
    public static void m5370A(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(Strings.m5473c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: B */
    public static void m5371B(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(Strings.m5473c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: C */
    public static void m5372C(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.m5473c(str, obj));
        }
    }

    /* renamed from: D */
    public static void m5373D(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.m5473c(str, obj, obj2));
        }
    }

    /* renamed from: a */
    private static String m5374a(int i, int i2, String str) {
        if (i < 0) {
            return Strings.m5473c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return Strings.m5473c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static String m5375b(int i, int i2, String str) {
        if (i < 0) {
            return Strings.m5473c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return Strings.m5473c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static String m5376c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m5375b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m5375b(i2, i3, "end index");
        }
        return Strings.m5473c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m5377d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m5378e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m5379f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static void m5380g(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Character.valueOf(c), obj));
        }
    }

    /* renamed from: h */
    public static void m5381h(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: i */
    public static void m5382i(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: j */
    public static void m5383j(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: k */
    public static void m5384k(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: l */
    public static void m5385l(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, obj));
        }
    }

    /* renamed from: m */
    public static void m5386m(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, obj, Integer.valueOf(i)));
        }
    }

    /* renamed from: n */
    public static void m5387n(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, obj, obj2));
        }
    }

    /* renamed from: o */
    public static void m5388o(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, obj, obj2, obj3));
        }
    }

    /* renamed from: p */
    public static void m5389p(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m5473c(str, obj, obj2, obj3, obj4));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: q */
    public static int m5390q(int i, int i2) {
        return m5391r(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: r */
    public static int m5391r(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5374a(i, i2, str));
    }

    @CanIgnoreReturnValue
    /* renamed from: s */
    public static <T> T m5392s(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @CanIgnoreReturnValue
    /* renamed from: t */
    public static <T> T m5393t(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: u */
    public static <T> T m5394u(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.m5473c(str, obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: v */
    public static int m5395v(int i, int i2) {
        return m5396w(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: w */
    public static int m5396w(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5375b(i, i2, str));
    }

    /* renamed from: x */
    public static void m5397x(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m5376c(i, i2, i3));
        }
    }

    /* renamed from: y */
    public static void m5398y(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: z */
    public static void m5399z(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
