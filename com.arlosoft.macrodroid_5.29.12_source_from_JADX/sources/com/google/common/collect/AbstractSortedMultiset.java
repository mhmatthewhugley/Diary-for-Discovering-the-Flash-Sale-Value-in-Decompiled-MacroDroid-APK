package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {
    @GwtTransient
    final Comparator<? super E> comparator;

    /* renamed from: d */
    private transient SortedMultiset<E> f16446d;

    AbstractSortedMultiset() {
        this(Ordering.m28521e());
    }

    /* renamed from: Z0 */
    public SortedMultiset<E> mo34696Z0(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        Preconditions.m5392s(boundType);
        Preconditions.m5392s(boundType2);
        return mo34981T1(e, boundType).mo34979E1(e2, boundType2);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: package-private */
    public Iterator<E> descendingIterator() {
        return Multisets.m28381j(mo34706t1());
    }

    public Multiset.Entry<E> firstEntry() {
        Iterator i = mo34607i();
        if (i.hasNext()) {
            return (Multiset.Entry) i.next();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public SortedMultiset<E> mo34700j() {
        return new DescendingMultiset<E>() {
            /* access modifiers changed from: package-private */
            /* renamed from: g0 */
            public Iterator<Multiset.Entry<E>> mo34707g0() {
                return AbstractSortedMultiset.this.mo34702l();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h0 */
            public SortedMultiset<E> mo34708h0() {
                return AbstractSortedMultiset.this;
            }

            public Iterator<E> iterator() {
                return AbstractSortedMultiset.this.descendingIterator();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public NavigableSet<E> mo34645c() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract Iterator<Multiset.Entry<E>> mo34702l();

    public Multiset.Entry<E> lastEntry() {
        Iterator l = mo34702l();
        if (l.hasNext()) {
            return (Multiset.Entry) l.next();
        }
        return null;
    }

    public Multiset.Entry<E> pollFirstEntry() {
        Iterator i = mo34607i();
        if (!i.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) i.next();
        Multiset.Entry<E> h = Multisets.m28379h(entry.mo35049b(), entry.getCount());
        i.remove();
        return h;
    }

    public Multiset.Entry<E> pollLastEntry() {
        Iterator l = mo34702l();
        if (!l.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) l.next();
        Multiset.Entry<E> h = Multisets.m28379h(entry.mo35049b(), entry.getCount());
        l.remove();
        return h;
    }

    /* renamed from: t1 */
    public SortedMultiset<E> mo34706t1() {
        SortedMultiset<E> sortedMultiset = this.f16446d;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        SortedMultiset<E> j = mo34700j();
        this.f16446d = j;
        return j;
    }

    AbstractSortedMultiset(Comparator<? super E> comparator2) {
        this.comparator = (Comparator) Preconditions.m5392s(comparator2);
    }

    /* renamed from: C */
    public NavigableSet<E> m26439C() {
        return (NavigableSet) super.mo34642C();
    }
}
