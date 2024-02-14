package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Sets {

    /* renamed from: com.google.common.collect.Sets$4 */
    class C70844 extends SetView<Object> {

        /* renamed from: a */
        final /* synthetic */ Set f17127a;

        /* renamed from: c */
        final /* synthetic */ Set f17128c;

        /* renamed from: c */
        public UnmodifiableIterator<Object> iterator() {
            final Iterator it = this.f17127a.iterator();
            final Iterator it2 = this.f17128c.iterator();
            return new AbstractIterator<Object>() {
                /* renamed from: a */
                public Object mo34417a() {
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!C70844.this.f17128c.contains(next)) {
                            return next;
                        }
                    }
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!C70844.this.f17127a.contains(next2)) {
                            return next2;
                        }
                    }
                    return mo34418b();
                }
            };
        }

        public boolean contains(Object obj) {
            return this.f17128c.contains(obj) ^ this.f17127a.contains(obj);
        }

        public boolean isEmpty() {
            return this.f17127a.equals(this.f17128c);
        }

        public int size() {
            int i = 0;
            for (Object contains : this.f17127a) {
                if (!this.f17128c.contains(contains)) {
                    i++;
                }
            }
            for (Object contains2 : this.f17128c) {
                if (!this.f17127a.contains(contains2)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: com.google.common.collect.Sets$5 */
    class C70865 extends AbstractSet<Set<Object>> {

        /* renamed from: a */
        final /* synthetic */ int f17132a;

        /* renamed from: c */
        final /* synthetic */ ImmutableMap f17133c;

        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set.size() != this.f17132a || !this.f17133c.keySet().containsAll(set)) {
                return false;
            }
            return true;
        }

        public Iterator<Set<Object>> iterator() {
            return new AbstractIterator<Set<Object>>() {

                /* renamed from: d */
                final BitSet f17134d;

                {
                    this.f17134d = new BitSet(C70865.this.f17133c.size());
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Set<Object> mo34417a() {
                    if (this.f17134d.isEmpty()) {
                        this.f17134d.set(0, C70865.this.f17132a);
                    } else {
                        int nextSetBit = this.f17134d.nextSetBit(0);
                        int nextClearBit = this.f17134d.nextClearBit(nextSetBit);
                        if (nextClearBit == C70865.this.f17133c.size()) {
                            return (Set) mo34418b();
                        }
                        int i = (nextClearBit - nextSetBit) - 1;
                        this.f17134d.set(0, i);
                        this.f17134d.clear(i, nextClearBit);
                        this.f17134d.set(nextClearBit);
                    }
                    final BitSet bitSet = (BitSet) this.f17134d.clone();
                    return new AbstractSet<Object>() {
                        public boolean contains(Object obj) {
                            Integer num = (Integer) C70865.this.f17133c.get(obj);
                            return num != null && bitSet.get(num.intValue());
                        }

                        public Iterator<Object> iterator() {
                            return new AbstractIterator<Object>() {

                                /* renamed from: d */
                                int f17138d = -1;

                                /* access modifiers changed from: protected */
                                /* renamed from: a */
                                public Object mo34417a() {
                                    int nextSetBit = bitSet.nextSetBit(this.f17138d + 1);
                                    this.f17138d = nextSetBit;
                                    if (nextSetBit == -1) {
                                        return mo34418b();
                                    }
                                    return C70865.this.f17133c.keySet().mo35029c().get(this.f17138d);
                                }
                            };
                        }

                        public int size() {
                            return C70865.this.f17132a;
                        }
                    };
                }
            };
        }

        public int size() {
            return IntMath.m73465a(this.f17133c.size(), this.f17132a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17133c.keySet());
            int i = this.f17132a;
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Sets.combinations(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* renamed from: a */
        private final transient ImmutableList<ImmutableSet<E>> f17140a;

        /* renamed from: c */
        private final transient CartesianList<E> f17141c;

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1 */
        class C70901 extends ImmutableList<List<Object>> {
            final /* synthetic */ ImmutableList val$axes;

            /* renamed from: P */
            public List<Object> get(int i) {
                return ((ImmutableSet) this.val$axes.get(i)).mo35029c();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public boolean mo34781j() {
                return true;
            }

            public int size() {
                return this.val$axes.size();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Collection<List<E>> mo22325Q() {
            return this.f17141c;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List<Object> list = (List) obj;
            if (list.size() != this.f17140a.size()) {
                return false;
            }
            int i = 0;
            for (Object contains : list) {
                if (!this.f17140a.get(i).contains(contains)) {
                    return false;
                }
                i++;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.f17140a.equals(((CartesianSet) obj).f17140a);
            }
            return super.equals(obj);
        }

        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.f17140a.size(); i2++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator<ImmutableSet<E>> k = this.f17140a.iterator();
            while (k.hasNext()) {
                Set next = k.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    @GwtIncompatible
    static class DescendingSet<E> extends ForwardingNavigableSet<E> {

        /* renamed from: a */
        private final NavigableSet<E> f17142a;

        /* renamed from: n0 */
        private static <T> Ordering<T> m28749n0(Comparator<T> comparator) {
            return Ordering.m28520a(comparator).mo34739j();
        }

        public E ceiling(@ParametricNullness E e) {
            return this.f17142a.floor(e);
        }

        public Comparator<? super E> comparator() {
            Comparator comparator = this.f17142a.comparator();
            if (comparator == null) {
                return Ordering.m28521e().mo34739j();
            }
            return m28749n0(comparator);
        }

        public Iterator<E> descendingIterator() {
            return this.f17142a.iterator();
        }

        public NavigableSet<E> descendingSet() {
            return this.f17142a;
        }

        @ParametricNullness
        public E first() {
            return this.f17142a.last();
        }

        public E floor(@ParametricNullness E e) {
            return this.f17142a.ceiling(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h0 */
        public NavigableSet<E> mo35219g0() {
            return this.f17142a;
        }

        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return this.f17142a.tailSet(e, z).descendingSet();
        }

        public E higher(@ParametricNullness E e) {
            return this.f17142a.lower(e);
        }

        public Iterator<E> iterator() {
            return this.f17142a.descendingIterator();
        }

        @ParametricNullness
        public E last() {
            return this.f17142a.first();
        }

        public E lower(@ParametricNullness E e) {
            return this.f17142a.higher(e);
        }

        public E pollFirst() {
            return this.f17142a.pollLast();
        }

        public E pollLast() {
            return this.f17142a.pollFirst();
        }

        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return this.f17142a.subSet(e2, z2, e, z).descendingSet();
        }

        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return this.f17142a.headSet(e, z).descendingSet();
        }

        public Object[] toArray() {
            return mo35131X();
        }

        public String toString() {
            return mo35133a0();
        }

        public SortedSet<E> headSet(@ParametricNullness E e) {
            return mo35223i0(e);
        }

        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return mo35224l0(e, e2);
        }

        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return mo35226m0(e);
        }

        public <T> T[] toArray(T[] tArr) {
            return mo35132Y(tArr);
        }
    }

    @GwtIncompatible
    private static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
            super(navigableSet, predicate);
        }

        public E ceiling(@ParametricNullness E e) {
            return Iterables.m27680g(mo36367d().tailSet(e, true), this.f16478c, null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public NavigableSet<E> mo36367d() {
            return (NavigableSet) this.f16477a;
        }

        public Iterator<E> descendingIterator() {
            return Iterators.m27720p(mo36367d().descendingIterator(), this.f16478c);
        }

        public NavigableSet<E> descendingSet() {
            return Sets.m28720c(mo36367d().descendingSet(), this.f16478c);
        }

        public E floor(@ParametricNullness E e) {
            return Iterators.m27722r(mo36367d().headSet(e, true).descendingIterator(), this.f16478c, null);
        }

        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return Sets.m28720c(mo36367d().headSet(e, z), this.f16478c);
        }

        public E higher(@ParametricNullness E e) {
            return Iterables.m27680g(mo36367d().tailSet(e, false), this.f16478c, null);
        }

        @ParametricNullness
        public E last() {
            return Iterators.m27721q(mo36367d().descendingIterator(), this.f16478c);
        }

        public E lower(@ParametricNullness E e) {
            return Iterators.m27722r(mo36367d().headSet(e, false).descendingIterator(), this.f16478c, null);
        }

        public E pollFirst() {
            return Iterables.m27682i(mo36367d(), this.f16478c);
        }

        public E pollLast() {
            return Iterables.m27682i(mo36367d().descendingSet(), this.f16478c);
        }

        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return Sets.m28720c(mo36367d().subSet(e, z, e2, z2), this.f16478c);
        }

        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return Sets.m28720c(mo36367d().tailSet(e, z), this.f16478c);
        }
    }

    private static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        FilteredSet(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        public boolean equals(Object obj) {
            return Sets.m28719b(this, obj);
        }

        public int hashCode() {
            return Sets.m28723f(this);
        }
    }

    private static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f16477a).comparator();
        }

        @ParametricNullness
        public E first() {
            return Iterators.m27721q(this.f16477a.iterator(), this.f16478c);
        }

        public SortedSet<E> headSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.f16477a).headSet(e), this.f16478c);
        }

        @ParametricNullness
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f16477a;
            while (true) {
                E last = sortedSet.last();
                if (this.f16478c.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return new FilteredSortedSet(((SortedSet) this.f16477a).subSet(e, e2), this.f16478c);
        }

        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.f16477a).tailSet(e), this.f16478c);
        }
    }

    static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        public boolean removeAll(Collection<?> collection) {
            return Sets.m28730m(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.m5392s(collection));
        }
    }

    private static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* renamed from: a */
        final ImmutableMap<E, Integer> f17143a;

        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f17143a.keySet().containsAll((Set) obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                return this.f17143a.keySet().equals(((PowerSet) obj).f17143a.keySet());
            }
            return super.equals(obj);
        }

        public int hashCode() {
            return this.f17143a.keySet().hashCode() << (this.f17143a.size() - 1);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(size()) {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Set<E> mo34410a(int i) {
                    return new SubSet(PowerSet.this.f17143a, i);
                }
            };
        }

        public int size() {
            return 1 << this.f17143a.size();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17143a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append("powerSet(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract UnmodifiableIterator<E> iterator();

        @DoNotCall
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    private static final class SubSet<E> extends AbstractSet<E> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ImmutableMap<E, Integer> f17145a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f17146c;

        SubSet(ImmutableMap<E, Integer> immutableMap, int i) {
            this.f17145a = immutableMap;
            this.f17146c = i;
        }

        public boolean contains(Object obj) {
            Integer num = this.f17145a.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f17146c) != 0) {
                    return true;
                }
            }
            return false;
        }

        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>() {

                /* renamed from: a */
                final ImmutableList<E> f17147a;

                /* renamed from: c */
                int f17148c;

                {
                    this.f17147a = SubSet.this.f17145a.keySet().mo35029c();
                    this.f17148c = SubSet.this.f17146c;
                }

                public boolean hasNext() {
                    return this.f17148c != 0;
                }

                public E next() {
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f17148c);
                    if (numberOfTrailingZeros != 32) {
                        this.f17148c &= ~(1 << numberOfTrailingZeros);
                        return this.f17147a.get(numberOfTrailingZeros);
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        public int size() {
            return Integer.bitCount(this.f17146c);
        }
    }

    static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private transient UnmodifiableNavigableSet<E> f17150a;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) Preconditions.m5392s(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        public E ceiling(@ParametricNullness E e) {
            return this.delegate.ceiling(e);
        }

        public Iterator<E> descendingIterator() {
            return Iterators.m27704K(this.delegate.descendingIterator());
        }

        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f17150a;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.f17150a = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f17150a = this;
            return unmodifiableNavigableSet2;
        }

        public E floor(@ParametricNullness E e) {
            return this.delegate.floor(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g0 */
        public SortedSet<E> mo34398b0() {
            return this.unmodifiableDelegate;
        }

        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return Sets.m28733p(this.delegate.headSet(e, z));
        }

        public E higher(@ParametricNullness E e) {
            return this.delegate.higher(e);
        }

        public E lower(@ParametricNullness E e) {
            return this.delegate.lower(e);
        }

        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return Sets.m28733p(this.delegate.subSet(e, z, e2, z2));
        }

        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return Sets.m28733p(this.delegate.tailSet(e, z));
        }
    }

    private Sets() {
    }

    /* renamed from: a */
    public static <E> SetView<E> m28718a(final Set<E> set, final Set<?> set2) {
        Preconditions.m5393t(set, "set1");
        Preconditions.m5393t(set2, "set2");
        return new SetView<E>() {
            /* renamed from: c */
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() {

                    /* renamed from: d */
                    final Iterator<E> f17125d;

                    {
                        this.f17125d = set.iterator();
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public E mo34417a() {
                        while (this.f17125d.hasNext()) {
                            E next = this.f17125d.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            public int size() {
                int i = 0;
                for (Object contains : set) {
                    if (!set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    /* renamed from: b */
    static boolean m28719b(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @GwtIncompatible
    /* renamed from: c */
    public static <E> NavigableSet<E> m28720c(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (!(navigableSet instanceof FilteredSet)) {
            return new FilteredNavigableSet((NavigableSet) Preconditions.m5392s(navigableSet), (Predicate) Preconditions.m5392s(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) navigableSet;
        return new FilteredNavigableSet((NavigableSet) filteredSet.f16477a, Predicates.m5402c(filteredSet.f16478c, predicate));
    }

    /* renamed from: d */
    public static <E> Set<E> m28721d(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return m28722e((SortedSet) set, predicate);
        }
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.m5392s(set), (Predicate) Preconditions.m5392s(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.f16477a, Predicates.m5402c(filteredSet.f16478c, predicate));
    }

    /* renamed from: e */
    public static <E> SortedSet<E> m28722e(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (!(sortedSet instanceof FilteredSet)) {
            return new FilteredSortedSet((SortedSet) Preconditions.m5392s(sortedSet), (Predicate) Preconditions.m5392s(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) sortedSet;
        return new FilteredSortedSet((SortedSet) filteredSet.f16477a, Predicates.m5402c(filteredSet.f16478c, predicate));
    }

    /* renamed from: f */
    static int m28723f(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: g */
    public static <E> SetView<E> m28724g(final Set<E> set, final Set<?> set2) {
        Preconditions.m5393t(set, "set1");
        Preconditions.m5393t(set2, "set2");
        return new SetView<E>() {
            /* renamed from: c */
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() {

                    /* renamed from: d */
                    final Iterator<E> f17121d;

                    {
                        this.f17121d = set.iterator();
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public E mo34417a() {
                        while (this.f17121d.hasNext()) {
                            E next = this.f17121d.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            public int size() {
                int i = 0;
                for (Object contains : set) {
                    if (set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    /* renamed from: h */
    public static <E> HashSet<E> m28725h() {
        return new HashSet<>();
    }

    /* renamed from: i */
    public static <E> HashSet<E> m28726i(int i) {
        return new HashSet<>(Maps.m28098m(i));
    }

    /* renamed from: j */
    public static <E> Set<E> m28727j() {
        return Collections.newSetFromMap(Maps.m28059B());
    }

    /* renamed from: k */
    public static <E> LinkedHashSet<E> m28728k() {
        return new LinkedHashSet<>();
    }

    /* renamed from: l */
    public static <E> LinkedHashSet<E> m28729l(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> k = m28728k();
        Iterables.m27674a(k, iterable);
        return k;
    }

    /* renamed from: m */
    static boolean m28730m(Set<?> set, Collection<?> collection) {
        Preconditions.m5392s(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo34642C();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m28731n(set, collection.iterator());
        }
        return Iterators.m27697D(set.iterator(), collection);
    }

    /* renamed from: n */
    static boolean m28731n(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: o */
    public static <E> SetView<E> m28732o(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.m5393t(set, "set1");
        Preconditions.m5393t(set2, "set2");
        return new SetView<E>() {
            /* renamed from: c */
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() {

                    /* renamed from: d */
                    final Iterator<? extends E> f17116d;

                    /* renamed from: f */
                    final Iterator<? extends E> f17117f;

                    {
                        this.f17116d = set.iterator();
                        this.f17117f = set2.iterator();
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public E mo34417a() {
                        if (this.f17116d.hasNext()) {
                            return this.f17116d.next();
                        }
                        while (this.f17117f.hasNext()) {
                            E next = this.f17117f.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            public int size() {
                int size = set.size();
                for (Object contains : set2) {
                    if (!set.contains(contains)) {
                        size++;
                    }
                }
                return size;
            }
        };
    }

    /* renamed from: p */
    public static <E> NavigableSet<E> m28733p(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
