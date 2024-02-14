package androidx.core.util;

public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo6771or(Predicate<? super T> predicate);

    boolean test(T t);
}
