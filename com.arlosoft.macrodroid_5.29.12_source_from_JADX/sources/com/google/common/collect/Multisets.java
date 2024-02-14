package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Multisets {

    /* renamed from: com.google.common.collect.Multisets$1 */
    class C70561 extends ViewMultiset<Object> {

        /* renamed from: d */
        final /* synthetic */ Multiset f17008d;

        /* renamed from: f */
        final /* synthetic */ Multiset f17009f;

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            return Math.max(this.f17008d.mo34601J1(obj), this.f17009f.mo34601J1(obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<Object> mo34645c() {
            return Sets.m28732o(this.f17008d.mo34642C(), this.f17009f.mo34642C());
        }

        public boolean contains(Object obj) {
            return this.f17008d.contains(obj) || this.f17009f.contains(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<Object> mo34605h() {
            throw new AssertionError("should never be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<Object>> mo34607i() {
            final Iterator it = this.f17008d.entrySet().iterator();
            final Iterator it2 = this.f17009f.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Multiset.Entry<Object> mo34417a() {
                    if (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object b = entry.mo35049b();
                        return Multisets.m28379h(b, Math.max(entry.getCount(), C70561.this.f17009f.mo34601J1(b)));
                    }
                    while (it2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                        Object b2 = entry2.mo35049b();
                        if (!C70561.this.f17008d.contains(b2)) {
                            return Multisets.m28379h(b2, entry2.getCount());
                        }
                    }
                    return (Multiset.Entry) mo34418b();
                }
            };
        }

        public boolean isEmpty() {
            return this.f17008d.isEmpty() && this.f17009f.isEmpty();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$2 */
    class C70582 extends ViewMultiset<Object> {

        /* renamed from: d */
        final /* synthetic */ Multiset f17013d;

        /* renamed from: f */
        final /* synthetic */ Multiset f17014f;

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            int J1 = this.f17013d.mo34601J1(obj);
            if (J1 == 0) {
                return 0;
            }
            return Math.min(J1, this.f17014f.mo34601J1(obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<Object> mo34645c() {
            return Sets.m28724g(this.f17013d.mo34642C(), this.f17014f.mo34642C());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<Object> mo34605h() {
            throw new AssertionError("should never be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<Object>> mo34607i() {
            final Iterator it = this.f17013d.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Multiset.Entry<Object> mo34417a() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object b = entry.mo35049b();
                        int min = Math.min(entry.getCount(), C70582.this.f17014f.mo34601J1(b));
                        if (min > 0) {
                            return Multisets.m28379h(b, min);
                        }
                    }
                    return (Multiset.Entry) mo34418b();
                }
            };
        }
    }

    /* renamed from: com.google.common.collect.Multisets$3 */
    class C70603 extends ViewMultiset<Object> {

        /* renamed from: d */
        final /* synthetic */ Multiset f17017d;

        /* renamed from: f */
        final /* synthetic */ Multiset f17018f;

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            return this.f17017d.mo34601J1(obj) + this.f17018f.mo34601J1(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<Object> mo34645c() {
            return Sets.m28732o(this.f17017d.mo34642C(), this.f17018f.mo34642C());
        }

        public boolean contains(Object obj) {
            return this.f17017d.contains(obj) || this.f17018f.contains(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<Object> mo34605h() {
            throw new AssertionError("should never be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<Object>> mo34607i() {
            final Iterator it = this.f17017d.entrySet().iterator();
            final Iterator it2 = this.f17018f.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Multiset.Entry<Object> mo34417a() {
                    if (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object b = entry.mo35049b();
                        return Multisets.m28379h(b, entry.getCount() + C70603.this.f17018f.mo34601J1(b));
                    }
                    while (it2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                        Object b2 = entry2.mo35049b();
                        if (!C70603.this.f17017d.contains(b2)) {
                            return Multisets.m28379h(b2, entry2.getCount());
                        }
                    }
                    return (Multiset.Entry) mo34418b();
                }
            };
        }

        public boolean isEmpty() {
            return this.f17017d.isEmpty() && this.f17018f.isEmpty();
        }

        public int size() {
            return IntMath.m73473i(this.f17017d.size(), this.f17018f.size());
        }
    }

    /* renamed from: com.google.common.collect.Multisets$4 */
    class C70624 extends ViewMultiset<Object> {

        /* renamed from: d */
        final /* synthetic */ Multiset f17022d;

        /* renamed from: f */
        final /* synthetic */ Multiset f17023f;

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            int J1 = this.f17022d.mo34601J1(obj);
            if (J1 == 0) {
                return 0;
            }
            return Math.max(0, J1 - this.f17023f.mo34601J1(obj));
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo34604f() {
            return Iterators.m27701H(mo34607i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<Object> mo34605h() {
            final Iterator it = this.f17022d.entrySet().iterator();
            return new AbstractIterator<Object>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo34417a() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object b = entry.mo35049b();
                        if (entry.getCount() > C70624.this.f17023f.mo34601J1(b)) {
                            return b;
                        }
                    }
                    return mo34418b();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<Object>> mo34607i() {
            final Iterator it = this.f17022d.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Multiset.Entry<Object> mo34417a() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object b = entry.mo35049b();
                        int count = entry.getCount() - C70624.this.f17023f.mo34601J1(b);
                        if (count > 0) {
                            return Multisets.m28379h(b, count);
                        }
                    }
                    return (Multiset.Entry) mo34418b();
                }
            };
        }
    }

    static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        AbstractEntry() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (getCount() != entry.getCount() || !Objects.m5349a(mo35049b(), entry.mo35049b())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object b = mo35049b();
            if (b == null) {
                i = 0;
            } else {
                i = b.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(mo35049b());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    private static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {

        /* renamed from: a */
        static final DecreasingCount f17028a = new DecreasingCount();

        private DecreasingCount() {
        }

        /* renamed from: a */
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        ElementSet() {
        }

        public void clear() {
            mo34656i().clear();
        }

        public boolean contains(Object obj) {
            return mo34656i().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo34656i().containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract Multiset<E> mo34656i();

        public boolean isEmpty() {
            return mo34656i().isEmpty();
        }

        public boolean remove(Object obj) {
            return mo34656i().mo34606h1(obj, Integer.MAX_VALUE) > 0;
        }

        public int size() {
            return mo34656i().entrySet().size();
        }
    }

    static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        EntrySet() {
        }

        public void clear() {
            mo34658i().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() > 0 && mo34658i().mo34601J1(entry.mo35049b()) == entry.getCount()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract Multiset<E> mo34658i();

        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object b = entry.mo35049b();
                int count = entry.getCount();
                if (count != 0) {
                    return mo34658i().mo34613z1(b, count, 0);
                }
            }
            return false;
        }
    }

    private static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* renamed from: d */
        final Multiset<E> f17029d;

        /* renamed from: f */
        final Predicate<? super E> f17030f;

        FilteredMultiset(Multiset<E> multiset, Predicate<? super E> predicate) {
            super((C70561) null);
            this.f17029d = (Multiset) Preconditions.m5392s(multiset);
            this.f17030f = (Predicate) Preconditions.m5392s(predicate);
        }

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            int J1 = this.f17029d.mo34601J1(obj);
            if (J1 <= 0 || !this.f17030f.apply(obj)) {
                return 0;
            }
            return J1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<E> mo34645c() {
            return Sets.m28721d(this.f17029d.mo34642C(), this.f17030f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<Multiset.Entry<E>> mo34647d() {
            return Sets.m28721d(this.f17029d.entrySet(), new Predicate<Multiset.Entry<E>>() {
                /* renamed from: a */
                public boolean apply(Multiset.Entry<E> entry) {
                    return FilteredMultiset.this.f17030f.apply(entry.mo35049b());
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<E> mo34605h() {
            throw new AssertionError("should never be called");
        }

        /* renamed from: h1 */
        public int mo34606h1(Object obj, int i) {
            CollectPreconditions.m26535b(i, "occurrences");
            if (i == 0) {
                return mo34601J1(obj);
            }
            if (contains(obj)) {
                return this.f17029d.mo34606h1(obj, i);
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<E>> mo34607i() {
            throw new AssertionError("should never be called");
        }

        /* renamed from: j */
        public UnmodifiableIterator<E> iterator() {
            return Iterators.m27720p(this.f17029d.iterator(), this.f17030f);
        }

        /* renamed from: k1 */
        public int mo34611k1(@ParametricNullness E e, int i) {
            Preconditions.m5387n(this.f17030f.apply(e), "Element %s does not match predicate %s", e, this.f17030f);
            return this.f17029d.mo34611k1(e, i);
        }
    }

    static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        @ParametricNullness
        private final E element;

        ImmutableEntry(@ParametricNullness E e, int i) {
            this.element = e;
            this.count = i;
            CollectPreconditions.m26535b(i, "count");
        }

        @ParametricNullness
        /* renamed from: b */
        public final E mo35049b() {
            return this.element;
        }

        public final int getCount() {
            return this.count;
        }
    }

    static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* renamed from: a */
        private final Multiset<E> f17032a;

        /* renamed from: c */
        private final Iterator<Multiset.Entry<E>> f17033c;

        /* renamed from: d */
        private Multiset.Entry<E> f17034d;

        /* renamed from: f */
        private int f17035f;

        /* renamed from: g */
        private int f17036g;

        /* renamed from: o */
        private boolean f17037o;

        MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
            this.f17032a = multiset;
            this.f17033c = it;
        }

        public boolean hasNext() {
            return this.f17035f > 0 || this.f17033c.hasNext();
        }

        @ParametricNullness
        public E next() {
            if (hasNext()) {
                if (this.f17035f == 0) {
                    Multiset.Entry<E> next = this.f17033c.next();
                    this.f17034d = next;
                    int count = next.getCount();
                    this.f17035f = count;
                    this.f17036g = count;
                }
                this.f17035f--;
                this.f17037o = true;
                Multiset.Entry<E> entry = this.f17034d;
                java.util.Objects.requireNonNull(entry);
                return entry.mo35049b();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.m26538e(this.f17037o);
            if (this.f17036g == 1) {
                this.f17033c.remove();
            } else {
                Multiset<E> multiset = this.f17032a;
                Multiset.Entry<E> entry = this.f17034d;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.mo35049b());
            }
            this.f17036g--;
            this.f17037o = false;
        }
    }

    static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient Set<E> f17038a;

        /* renamed from: c */
        transient Set<Multiset.Entry<E>> f17039c;
        final Multiset<? extends E> delegate;

        UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.delegate = multiset;
        }

        /* renamed from: C */
        public Set<E> mo34642C() {
            Set<E> set = this.f17038a;
            if (set != null) {
                return set;
            }
            Set<E> d0 = mo36231d0();
            this.f17038a = d0;
            return d0;
        }

        public boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Multiset<E> mo34397R() {
            return this.delegate;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public Set<E> mo36231d0() {
            return Collections.unmodifiableSet(this.delegate.mo34642C());
        }

        /* renamed from: e0 */
        public int mo34603e0(@ParametricNullness E e, int i) {
            throw new UnsupportedOperationException();
        }

        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.f17039c;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> unmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.f17039c = unmodifiableSet;
            return unmodifiableSet;
        }

        /* renamed from: h1 */
        public int mo34606h1(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        public Iterator<E> iterator() {
            return Iterators.m27704K(this.delegate.iterator());
        }

        /* renamed from: k1 */
        public int mo34611k1(@ParametricNullness E e, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: z1 */
        public boolean mo34613z1(@ParametricNullness E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    private static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        public void clear() {
            mo34642C().clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo34604f() {
            return mo34642C().size();
        }

        public Iterator<E> iterator() {
            return Multisets.m28381j(this);
        }

        public int size() {
            return Multisets.m28382k(this);
        }

        /* synthetic */ ViewMultiset(C70561 r1) {
            this();
        }
    }

    private Multisets() {
    }

    /* renamed from: a */
    private static <E> boolean m28372a(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.mo34609j(multiset);
        return true;
    }

    /* renamed from: b */
    private static <E> boolean m28373b(Multiset<E> multiset, Multiset<? extends E> multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return m28372a(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry next : multiset2.entrySet()) {
            multiset.mo34611k1(next.mo35049b(), next.getCount());
        }
        return true;
    }

    /* renamed from: c */
    static <E> boolean m28374c(Multiset<E> multiset, Collection<? extends E> collection) {
        Preconditions.m5392s(multiset);
        Preconditions.m5392s(collection);
        if (collection instanceof Multiset) {
            return m28373b(multiset, m28375d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.m27705a(multiset, collection.iterator());
    }

    /* renamed from: d */
    static <T> Multiset<T> m28375d(Iterable<T> iterable) {
        return (Multiset) iterable;
    }

    /* renamed from: e */
    static <E> Iterator<E> m28376e(Iterator<Multiset.Entry<E>> it) {
        return new TransformedIterator<Multiset.Entry<E>, E>(it) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public E mo34726a(Multiset.Entry<E> entry) {
                return entry.mo35049b();
            }
        };
    }

    /* renamed from: f */
    static boolean m28377f(Multiset<?> multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.mo34601J1(entry.mo35049b()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Beta
    /* renamed from: g */
    public static <E> Multiset<E> m28378g(Multiset<E> multiset, Predicate<? super E> predicate) {
        if (!(multiset instanceof FilteredMultiset)) {
            return new FilteredMultiset(multiset, predicate);
        }
        FilteredMultiset filteredMultiset = (FilteredMultiset) multiset;
        return new FilteredMultiset(filteredMultiset.f17029d, Predicates.m5402c(filteredMultiset.f17030f, predicate));
    }

    /* renamed from: h */
    public static <E> Multiset.Entry<E> m28379h(@ParametricNullness E e, int i) {
        return new ImmutableEntry(e, i);
    }

    /* renamed from: i */
    static int m28380i(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).mo34642C().size();
        }
        return 11;
    }

    /* renamed from: j */
    static <E> Iterator<E> m28381j(Multiset<E> multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    /* renamed from: k */
    static int m28382k(Multiset<?> multiset) {
        long j = 0;
        for (Multiset.Entry<?> count : multiset.entrySet()) {
            j += (long) count.getCount();
        }
        return Ints.m73622k(j);
    }

    /* renamed from: l */
    static boolean m28383l(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo34642C();
        }
        return multiset.mo34642C().removeAll(collection);
    }

    /* renamed from: m */
    static boolean m28384m(Multiset<?> multiset, Collection<?> collection) {
        Preconditions.m5392s(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo34642C();
        }
        return multiset.mo34642C().retainAll(collection);
    }

    /* renamed from: n */
    static <E> int m28385n(Multiset<E> multiset, @ParametricNullness E e, int i) {
        CollectPreconditions.m26535b(i, "count");
        int J1 = multiset.mo34601J1(e);
        int i2 = i - J1;
        if (i2 > 0) {
            multiset.mo34611k1(e, i2);
        } else if (i2 < 0) {
            multiset.mo34606h1(e, -i2);
        }
        return J1;
    }

    /* renamed from: o */
    static <E> boolean m28386o(Multiset<E> multiset, @ParametricNullness E e, int i, int i2) {
        CollectPreconditions.m26535b(i, "oldCount");
        CollectPreconditions.m26535b(i2, "newCount");
        if (multiset.mo34601J1(e) != i) {
            return false;
        }
        multiset.mo34603e0(e, i2);
        return true;
    }

    /* renamed from: p */
    public static <E> Multiset<E> m28387p(Multiset<? extends E> multiset) {
        return ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new UnmodifiableMultiset((Multiset) Preconditions.m5392s(multiset));
    }

    @Beta
    /* renamed from: q */
    public static <E> SortedMultiset<E> m28388q(SortedMultiset<E> sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.m5392s(sortedMultiset));
    }
}
