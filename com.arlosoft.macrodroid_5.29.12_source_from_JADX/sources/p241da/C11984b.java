package p241da;

import java.util.Objects;
import p216ba.C11112c;

/* renamed from: da.b */
/* compiled from: ObjectHelper */
public final class C11984b {

    /* renamed from: a */
    static final C11112c<Object, Object> f58179a = new C11985a();

    /* renamed from: da.b$a */
    /* compiled from: ObjectHelper */
    static final class C11985a implements C11112c<Object, Object> {
        C11985a() {
        }
    }

    /* renamed from: a */
    public static int m82364a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m82365b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m82366c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static <T> T m82367d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: e */
    public static int m82368e(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
