package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* renamed from: com.google.common.collect.Iterators$10 */
    class C699610 extends UnmodifiableIterator<Object> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f16761a;

        public boolean hasNext() {
            return this.f16761a.hasMoreElements();
        }

        @ParametricNullness
        public Object next() {
            return this.f16761a.nextElement();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$11 */
    class C699711 implements Enumeration<Object> {

        /* renamed from: a */
        final /* synthetic */ Iterator f16762a;

        public boolean hasMoreElements() {
            return this.f16762a.hasNext();
        }

        @ParametricNullness
        public Object nextElement() {
            return this.f16762a.next();
        }
    }

    private static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {

        /* renamed from: g */
        static final UnmodifiableListIterator<Object> f16779g = new ArrayItr(new Object[0], 0, 0, 0);

        /* renamed from: d */
        private final T[] f16780d;

        /* renamed from: f */
        private final int f16781f;

        ArrayItr(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f16780d = tArr;
            this.f16781f = i;
        }

        /* access modifiers changed from: protected */
        @ParametricNullness
        /* renamed from: a */
        public T mo34410a(int i) {
            return this.f16780d[this.f16781f + i];
        }
    }

    private static class ConcatenatedIterator<T> implements Iterator<T> {

        /* renamed from: a */
        private Iterator<? extends T> f16782a;

        /* renamed from: c */
        private Iterator<? extends T> f16783c = Iterators.m27717m();

        /* renamed from: d */
        private Iterator<? extends Iterator<? extends T>> f16784d;

        /* renamed from: f */
        private Deque<Iterator<? extends Iterator<? extends T>>> f16785f;

        ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
            this.f16784d = (Iterator) Preconditions.m5392s(it);
        }

        /* renamed from: a */
        private Iterator<? extends Iterator<? extends T>> m27736a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f16784d;
                if (it != null && it.hasNext()) {
                    return this.f16784d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f16785f;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f16784d = this.f16785f.removeFirst();
            }
        }

        public boolean hasNext() {
            while (!((Iterator) Preconditions.m5392s(this.f16783c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> a = m27736a();
                this.f16784d = a;
                if (a == null) {
                    return false;
                }
                Iterator<? extends T> it = (Iterator) a.next();
                this.f16783c = it;
                if (it instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it;
                    this.f16783c = concatenatedIterator.f16783c;
                    if (this.f16785f == null) {
                        this.f16785f = new ArrayDeque();
                    }
                    this.f16785f.addFirst(this.f16784d);
                    if (concatenatedIterator.f16785f != null) {
                        while (!concatenatedIterator.f16785f.isEmpty()) {
                            this.f16785f.addFirst(concatenatedIterator.f16785f.removeLast());
                        }
                    }
                    this.f16784d = concatenatedIterator.f16784d;
                }
            }
            return true;
        }

        @ParametricNullness
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f16783c;
                this.f16782a = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            Iterator<? extends T> it = this.f16782a;
            if (it != null) {
                it.remove();
                this.f16782a = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    private enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.m26538e(false);
        }
    }

    private static class MergingIterator<T> extends UnmodifiableIterator<T> {

        /* renamed from: a */
        final Queue<PeekingIterator<T>> f16788a;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.f16788a = new PriorityQueue(2, new C7145b(comparator));
            for (Iterator it : iterable) {
                if (it.hasNext()) {
                    this.f16788a.add(Iterators.m27695B(it));
                }
            }
        }

        public boolean hasNext() {
            return !this.f16788a.isEmpty();
        }

        @ParametricNullness
        public T next() {
            PeekingIterator remove = this.f16788a.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f16788a.add(remove);
            }
            return next;
        }
    }

    private static class PeekingImpl<E> implements PeekingIterator<E> {

        /* renamed from: a */
        private final Iterator<? extends E> f16789a;

        /* renamed from: c */
        private boolean f16790c;

        /* renamed from: d */
        private E f16791d;

        public PeekingImpl(Iterator<? extends E> it) {
            this.f16789a = (Iterator) Preconditions.m5392s(it);
        }

        public boolean hasNext() {
            return this.f16790c || this.f16789a.hasNext();
        }

        @ParametricNullness
        public E next() {
            if (!this.f16790c) {
                return this.f16789a.next();
            }
            E a = NullnessCasts.m28457a(this.f16791d);
            this.f16790c = false;
            this.f16791d = null;
            return a;
        }

        @ParametricNullness
        public E peek() {
            if (!this.f16790c) {
                this.f16791d = this.f16789a.next();
                this.f16790c = true;
            }
            return NullnessCasts.m28457a(this.f16791d);
        }

        public void remove() {
            Preconditions.m5399z(!this.f16790c, "Can't remove after you've peeked at next");
            this.f16789a.remove();
        }
    }

    private Iterators() {
    }

    /* renamed from: A */
    private static <T> UnmodifiableIterator<List<T>> m27694A(final Iterator<T> it, final int i, final boolean z) {
        Preconditions.m5392s(it);
        Preconditions.m5377d(i > 0);
        return new UnmodifiableIterator<List<T>>() {
            /* renamed from: a */
            public List<T> next() {
                if (hasNext()) {
                    Object[] objArr = new Object[i];
                    int i = 0;
                    while (i < i && it.hasNext()) {
                        objArr[i] = it.next();
                        i++;
                    }
                    for (int i2 = i; i2 < i; i2++) {
                        objArr[i2] = null;
                    }
                    List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                    return (z || i == i) ? unmodifiableList : unmodifiableList.subList(0, i);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return it.hasNext();
            }
        };
    }

    /* renamed from: B */
    public static <T> PeekingIterator<T> m27695B(Iterator<? extends T> it) {
        if (it instanceof PeekingImpl) {
            return (PeekingImpl) it;
        }
        return new PeekingImpl(it);
    }

    /* renamed from: C */
    static <T> T m27696C(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: D */
    public static boolean m27697D(Iterator<?> it, Collection<?> collection) {
        Preconditions.m5392s(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    /* renamed from: E */
    public static <T> boolean m27698E(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.m5392s(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    /* renamed from: F */
    public static boolean m27699F(Iterator<?> it, Collection<?> collection) {
        Preconditions.m5392s(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: G */
    public static <T> UnmodifiableIterator<T> m27700G(@ParametricNullness final T t) {
        return new UnmodifiableIterator<T>() {

            /* renamed from: a */
            boolean f16777a;

            public boolean hasNext() {
                return !this.f16777a;
            }

            @ParametricNullness
            public T next() {
                if (!this.f16777a) {
                    this.f16777a = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* renamed from: H */
    public static int m27701H(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.m73622k(j);
    }

    /* renamed from: I */
    public static String m27702I(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: J */
    public static <F, T> Iterator<T> m27703J(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.m5392s(function);
        return new TransformedIterator<F, T>(it) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: a */
            public T mo34726a(@ParametricNullness F f) {
                return function.apply(f);
            }
        };
    }

    /* renamed from: K */
    public static <T> UnmodifiableIterator<T> m27704K(final Iterator<? extends T> it) {
        Preconditions.m5392s(it);
        if (it instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) it;
        }
        return new UnmodifiableIterator<T>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            @ParametricNullness
            public T next() {
                return it.next();
            }
        };
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m27705a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.m5392s(collection);
        Preconditions.m5392s(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static int m27706b(Iterator<?> it, int i) {
        Preconditions.m5392s(it);
        int i2 = 0;
        Preconditions.m5378e(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public static <T> boolean m27707c(Iterator<T> it, Predicate<? super T> predicate) {
        return m27726v(it, predicate) != -1;
    }

    /* renamed from: d */
    static <T> ListIterator<T> m27708d(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* renamed from: e */
    static void m27709e(Iterator<?> it) {
        Preconditions.m5392s(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: f */
    public static <T> Iterator<T> m27710f(Iterator<? extends Iterator<? extends T>> it) {
        return new ConcatenatedIterator(it);
    }

    /* renamed from: g */
    public static <T> Iterator<T> m27711g(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.m5392s(it);
        Preconditions.m5392s(it2);
        return m27710f(m27712h(it, it2));
    }

    /* renamed from: h */
    private static <I extends Iterator<?>> Iterator<I> m27712h(final I... iArr) {
        return new UnmodifiableIterator<I>() {

            /* renamed from: a */
            int f16765a = 0;

            /* renamed from: a */
            public I next() {
                if (hasNext()) {
                    I i = iArr[this.f16765a];
                    Objects.requireNonNull(i);
                    I i2 = (Iterator) i;
                    Iterator[] itArr = iArr;
                    int i3 = this.f16765a;
                    itArr[i3] = null;
                    this.f16765a = i3 + 1;
                    return i2;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f16765a < iArr.length;
            }
        };
    }

    /* renamed from: i */
    public static <T> Iterator<T> m27713i(final Iterator<T> it) {
        Preconditions.m5392s(it);
        return new UnmodifiableIterator<T>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            @ParametricNullness
            public T next() {
                T next = it.next();
                it.remove();
                return next;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    /* renamed from: j */
    public static boolean m27714j(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <T> Iterator<T> m27715k(final Iterable<T> iterable) {
        Preconditions.m5392s(iterable);
        return new Iterator<T>() {

            /* renamed from: a */
            Iterator<T> f16763a = Iterators.m27719o();

            public boolean hasNext() {
                return this.f16763a.hasNext() || iterable.iterator().hasNext();
            }

            @ParametricNullness
            public T next() {
                if (!this.f16763a.hasNext()) {
                    Iterator<T> it = iterable.iterator();
                    this.f16763a = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.f16763a.next();
            }

            public void remove() {
                this.f16763a.remove();
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27716l(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.m5349a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.m27716l(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: m */
    static <T> UnmodifiableIterator<T> m27717m() {
        return m27718n();
    }

    /* renamed from: n */
    static <T> UnmodifiableListIterator<T> m27718n() {
        return ArrayItr.f16779g;
    }

    /* renamed from: o */
    static <T> Iterator<T> m27719o() {
        return EmptyModifiableIterator.INSTANCE;
    }

    /* renamed from: p */
    public static <T> UnmodifiableIterator<T> m27720p(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.m5392s(it);
        Preconditions.m5392s(predicate);
        return new AbstractIterator<T>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public T mo34417a() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (predicate.apply(next)) {
                        return next;
                    }
                }
                return mo34418b();
            }
        };
    }

    @ParametricNullness
    /* renamed from: q */
    public static <T> T m27721q(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.m5392s(it);
        Preconditions.m5392s(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: r */
    public static <T> T m27722r(Iterator<? extends T> it, Predicate<? super T> predicate, T t) {
        Preconditions.m5392s(it);
        Preconditions.m5392s(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> UnmodifiableIterator<T> m27723s(T... tArr) {
        return m27724t(tArr, 0, tArr.length, 0);
    }

    /* renamed from: t */
    static <T> UnmodifiableListIterator<T> m27724t(T[] tArr, int i, int i2, int i3) {
        Preconditions.m5377d(i2 >= 0);
        Preconditions.m5397x(i, i + i2, tArr.length);
        Preconditions.m5395v(i3, i2);
        if (i2 == 0) {
            return m27718n();
        }
        return new ArrayItr(tArr, i, i2, i3);
    }

    @ParametricNullness
    /* renamed from: u */
    public static <T> T m27725u(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: v */
    public static <T> int m27726v(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.m5393t(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: w */
    public static <T> Iterator<T> m27727w(final Iterator<T> it, final int i) {
        Preconditions.m5392s(it);
        Preconditions.m5378e(i >= 0, "limit is negative");
        return new Iterator<T>() {

            /* renamed from: a */
            private int f16773a;

            public boolean hasNext() {
                return this.f16773a < i && it.hasNext();
            }

            @ParametricNullness
            public T next() {
                if (hasNext()) {
                    this.f16773a++;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    @Beta
    /* renamed from: x */
    public static <T> UnmodifiableIterator<T> m27728x(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.m5393t(iterable, "iterators");
        Preconditions.m5393t(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    /* renamed from: y */
    public static <T> UnmodifiableIterator<List<T>> m27729y(Iterator<T> it, int i) {
        return m27694A(it, i, true);
    }

    /* renamed from: z */
    public static <T> UnmodifiableIterator<List<T>> m27730z(Iterator<T> it, int i) {
        return m27694A(it, i, false);
    }
}
