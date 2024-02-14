package p351od;

/* renamed from: od.c */
/* compiled from: Validate */
public final class C15852c {
    /* renamed from: a */
    public static void m95472a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* renamed from: b */
    public static void m95473b(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* renamed from: c */
    public static void m95474c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: d */
    public static void m95475d(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: e */
    public static void m95476e(Object[] objArr) {
        m95477f(objArr, "Array must not contain any null objects");
    }

    /* renamed from: f */
    public static void m95477f(Object[] objArr, String str) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* renamed from: g */
    public static void m95478g(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: h */
    public static void m95479h(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: i */
    public static void m95480i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
