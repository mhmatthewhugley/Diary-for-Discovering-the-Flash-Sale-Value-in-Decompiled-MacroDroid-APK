package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {

    @VisibleForTesting
    static class ArbitraryOrdering extends Ordering<Object> {

        /* renamed from: a */
        private final AtomicInteger f17059a = new AtomicInteger(0);

        /* renamed from: c */
        private final ConcurrentMap<Object, Integer> f17060c = Platform.m28540i(new MapMaker()).mo35786i();

        ArbitraryOrdering() {
        }

        /* renamed from: k */
        private Integer m28530k(Object obj) {
            Integer num = (Integer) this.f17060c.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f17059a.getAndIncrement());
            Integer putIfAbsent = this.f17060c.putIfAbsent(obj, valueOf);
            return putIfAbsent != null ? putIfAbsent : valueOf;
        }

        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int l = mo36269l(obj);
            int l2 = mo36269l(obj2);
            if (l == l2) {
                int compareTo = m28530k(obj).compareTo(m28530k(obj2));
                if (compareTo != 0) {
                    return compareTo;
                }
                throw new AssertionError();
            } else if (l < l2) {
                return -1;
            } else {
                return 1;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo36269l(Object obj) {
            return System.identityHashCode(obj);
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    private static class ArbitraryOrderingHolder {

        /* renamed from: a */
        static final Ordering<Object> f17061a = new ArbitraryOrdering();

        private ArbitraryOrderingHolder() {
        }
    }

    @VisibleForTesting
    static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        IncomparableValueException(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Cannot compare value: "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r3.<init>(r0)
                r3.value = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.IncomparableValueException.<init>(java.lang.Object):void");
        }
    }

    protected Ordering() {
    }

    @GwtCompatible
    /* renamed from: a */
    public static <T> Ordering<T> m28520a(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    @GwtCompatible
    /* renamed from: e */
    public static <C extends Comparable> Ordering<C> m28521e() {
        return NaturalOrdering.f17042d;
    }

    /* renamed from: b */
    public <E extends T> ImmutableList<E> mo34737b(Iterable<E> iterable) {
        return ImmutableList.m27303J(this, iterable);
    }

    @ParametricNullness
    /* renamed from: c */
    public <E extends T> E mo36265c(@ParametricNullness E e, @ParametricNullness E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    @CanIgnoreReturnValue
    public abstract int compare(@ParametricNullness T t, @ParametricNullness T t2);

    @ParametricNullness
    /* renamed from: d */
    public <E extends T> E mo36266d(@ParametricNullness E e, @ParametricNullness E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    @GwtCompatible
    /* renamed from: f */
    public <S extends T> Ordering<S> mo36235f() {
        return new NullsFirstOrdering(this);
    }

    @GwtCompatible
    /* renamed from: g */
    public <S extends T> Ordering<S> mo36236g() {
        return new NullsLastOrdering(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T2 extends T> Ordering<Map.Entry<T2, ?>> mo36267h() {
        return mo36268i(Maps.m28107v());
    }

    @GwtCompatible
    /* renamed from: i */
    public <F> Ordering<F> mo36268i(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }

    @GwtCompatible
    /* renamed from: j */
    public <S extends T> Ordering<S> mo34739j() {
        return new ReverseOrdering(this);
    }
}
