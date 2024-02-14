package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.g */
/* compiled from: Predicate */
public final /* synthetic */ class C0483g<T> {
    /* renamed from: a */
    public static Predicate m492a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C0479c(predicate, predicate2);
    }

    /* renamed from: b */
    public static Predicate m493b(Predicate predicate) {
        return new C0478b(predicate);
    }

    /* renamed from: c */
    public static Predicate m494c(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C0480d(predicate, predicate2);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m495d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m496e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m497f(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    /* renamed from: g */
    public static <T> Predicate<T> m498g(Object obj) {
        if (obj == null) {
            return C0482f.f498a;
        }
        return new C0481e(obj);
    }

    /* renamed from: j */
    public static <T> Predicate<T> m501j(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
