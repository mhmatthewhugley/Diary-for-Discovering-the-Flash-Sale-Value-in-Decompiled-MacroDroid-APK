package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Iterables {

    /* renamed from: com.google.common.collect.Iterables$1 */
    class C69841 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16741c;

        public Iterator<Object> iterator() {
            return Iterators.m27715k(this.f16741c);
        }

        public String toString() {
            return String.valueOf(this.f16741c.toString()).concat(" (cycled)");
        }
    }

    /* renamed from: com.google.common.collect.Iterables$2 */
    class C69862 extends FluentIterable<List<Object>> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16742c;

        /* renamed from: d */
        final /* synthetic */ int f16743d;

        public Iterator<List<Object>> iterator() {
            return Iterators.m27730z(this.f16742c.iterator(), this.f16743d);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$3 */
    class C69873 extends FluentIterable<List<Object>> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16744c;

        /* renamed from: d */
        final /* synthetic */ int f16745d;

        public Iterator<List<Object>> iterator() {
            return Iterators.m27729y(this.f16744c.iterator(), this.f16745d);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$7 */
    class C69927 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16754c;

        /* renamed from: d */
        final /* synthetic */ int f16755d;

        public Iterator<Object> iterator() {
            return Iterators.m27727w(this.f16754c.iterator(), this.f16755d);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$8 */
    class C69938 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16756c;

        public Iterator<Object> iterator() {
            Iterable iterable = this.f16756c;
            if (iterable instanceof Queue) {
                return new ConsumingQueueIterator((Queue) iterable);
            }
            return Iterators.m27713i(iterable.iterator());
        }

        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$9 */
    class C69949 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16757c;

        /* renamed from: d */
        final /* synthetic */ Comparator f16758d;

        public Iterator<Object> iterator() {
            return Iterators.m27728x(Iterables.m27692s(this.f16757c, Iterables.m27690q()), this.f16758d);
        }
    }

    private static final class UnmodifiableIterable<T> extends FluentIterable<T> {

        /* renamed from: c */
        private final Iterable<? extends T> f16759c;

        public Iterator<T> iterator() {
            return Iterators.m27704K(this.f16759c.iterator());
        }

        public String toString() {
            return this.f16759c.toString();
        }
    }

    private Iterables() {
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m27674a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return Iterators.m27705a(collection, ((Iterable) Preconditions.m5392s(iterable)).iterator());
    }

    /* renamed from: b */
    public static <T> boolean m27675b(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.m27707c(iterable.iterator(), predicate);
    }

    /* renamed from: c */
    private static <E> Collection<E> m27676c(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.m27834j(iterable.iterator());
    }

    /* renamed from: d */
    public static <T> Iterable<T> m27677d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return FluentIterable.m27037c(iterable, iterable2);
    }

    /* renamed from: e */
    public static <T> Iterable<T> m27678e(final Iterable<T> iterable, final Predicate<? super T> predicate) {
        Preconditions.m5392s(iterable);
        Preconditions.m5392s(predicate);
        return new FluentIterable<T>() {
            public Iterator<T> iterator() {
                return Iterators.m27720p(iterable.iterator(), predicate);
            }
        };
    }

    @GwtIncompatible
    /* renamed from: f */
    public static <T> Iterable<T> m27679f(Iterable<?> iterable, Class<T> cls) {
        Preconditions.m5392s(iterable);
        Preconditions.m5392s(cls);
        return m27678e(iterable, Predicates.m5407h(cls));
    }

    /* renamed from: g */
    public static <T> T m27680g(Iterable<? extends T> iterable, Predicate<? super T> predicate, T t) {
        return Iterators.m27722r(iterable.iterator(), predicate, t);
    }

    @ParametricNullness
    /* renamed from: h */
    public static <T> T m27681h(Iterable<? extends T> iterable, @ParametricNullness T t) {
        return Iterators.m27725u(iterable.iterator(), t);
    }

    /* renamed from: i */
    static <T> T m27682i(Iterable<T> iterable, Predicate<? super T> predicate) {
        Preconditions.m5392s(predicate);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static <T> boolean m27683j(Iterable<T> iterable, Predicate<? super T> predicate) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return Iterators.m27698E(iterable.iterator(), predicate);
        }
        return m27684k((List) iterable, (Predicate) Preconditions.m5392s(predicate));
    }

    /* renamed from: k */
    private static <T> boolean m27684k(List<T> list, Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        m27686m(list, predicate, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m27686m(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static <T> Iterable<T> m27685l(final Iterable<T> iterable, final int i) {
        Preconditions.m5392s(iterable);
        Preconditions.m5378e(i >= 0, "number to skip cannot be negative");
        return new FluentIterable<T>() {
            public Iterator<T> iterator() {
                Iterable iterable = iterable;
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                final Iterator it = iterable.iterator();
                Iterators.m27706b(it, i);
                return new Iterator<T>(this) {

                    /* renamed from: a */
                    boolean f16752a = true;

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @ParametricNullness
                    public T next() {
                        T next = it.next();
                        this.f16752a = false;
                        return next;
                    }

                    public void remove() {
                        CollectPreconditions.m26538e(!this.f16752a);
                        it.remove();
                    }
                };
            }
        };
    }

    /* renamed from: m */
    private static <T> void m27686m(List<T> list, Predicate<? super T> predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: n */
    static Object[] m27687n(Iterable<?> iterable) {
        return m27676c(iterable).toArray();
    }

    @GwtIncompatible
    /* renamed from: o */
    public static <T> T[] m27688o(Iterable<? extends T> iterable, Class<T> cls) {
        return m27689p(iterable, ObjectArrays.m28470f(cls, 0));
    }

    /* renamed from: p */
    static <T> T[] m27689p(Iterable<? extends T> iterable, T[] tArr) {
        return m27676c(iterable).toArray(tArr);
    }

    /* renamed from: q */
    static <T> Function<Iterable<? extends T>, Iterator<? extends T>> m27690q() {
        return new Function<Iterable<? extends T>, Iterator<? extends T>>() {
            /* renamed from: a */
            public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
                return iterable.iterator();
            }
        };
    }

    /* renamed from: r */
    public static String m27691r(Iterable<?> iterable) {
        return Iterators.m27702I(iterable.iterator());
    }

    /* renamed from: s */
    public static <F, T> Iterable<T> m27692s(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        Preconditions.m5392s(iterable);
        Preconditions.m5392s(function);
        return new FluentIterable<T>() {
            public Iterator<T> iterator() {
                return Iterators.m27703J(iterable.iterator(), function);
            }
        };
    }
}
