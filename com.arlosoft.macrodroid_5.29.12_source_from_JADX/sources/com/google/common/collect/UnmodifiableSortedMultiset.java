package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    private transient UnmodifiableSortedMultiset<E> f17327d;

    UnmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        super(sortedMultiset);
    }

    /* renamed from: E1 */
    public SortedMultiset<E> mo34979E1(@ParametricNullness E e, BoundType boundType) {
        return Multisets.m28388q(mo34998b0().mo34979E1(e, boundType));
    }

    /* renamed from: T1 */
    public SortedMultiset<E> mo34981T1(@ParametricNullness E e, BoundType boundType) {
        return Multisets.m28388q(mo34998b0().mo34981T1(e, boundType));
    }

    /* renamed from: Z0 */
    public SortedMultiset<E> mo34696Z0(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        return Multisets.m28388q(mo34998b0().mo34696Z0(e, boundType, e2, boundType2));
    }

    public Comparator<? super E> comparator() {
        return mo34998b0().comparator();
    }

    public Multiset.Entry<E> firstEntry() {
        return mo34998b0().firstEntry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public NavigableSet<E> mo36231d0() {
        return Sets.m28733p(mo34998b0().mo34642C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public SortedMultiset<E> mo34998b0() {
        return (SortedMultiset) super.mo34397R();
    }

    public Multiset.Entry<E> lastEntry() {
        return mo34998b0().lastEntry();
    }

    public Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t1 */
    public SortedMultiset<E> mo34706t1() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.f17327d;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(mo34998b0().mo34706t1());
        unmodifiableSortedMultiset2.f17327d = this;
        this.f17327d = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    /* renamed from: C */
    public NavigableSet<E> m29194C() {
        return (NavigableSet) super.mo34642C();
    }
}
