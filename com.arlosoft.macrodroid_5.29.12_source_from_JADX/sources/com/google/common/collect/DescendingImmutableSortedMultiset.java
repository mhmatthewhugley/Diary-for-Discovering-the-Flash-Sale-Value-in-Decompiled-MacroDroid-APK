package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: g */
    private final transient ImmutableSortedMultiset<E> f16550g;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f16550g = immutableSortedMultiset;
    }

    /* renamed from: B */
    public ImmutableSortedMultiset<E> mo34979E1(E e, BoundType boundType) {
        return this.f16550g.mo34981T1(e, boundType).mo34706t1();
    }

    /* renamed from: F */
    public ImmutableSortedMultiset<E> mo34981T1(E e, BoundType boundType) {
        return this.f16550g.mo34979E1(e, boundType).mo34706t1();
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        return this.f16550g.mo34601J1(obj);
    }

    public Multiset.Entry<E> firstEntry() {
        return this.f16550g.lastEntry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return this.f16550g.mo34781j();
    }

    public Multiset.Entry<E> lastEntry() {
        return this.f16550g.firstEntry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Multiset.Entry<E> mo34983q(int i) {
        return this.f16550g.entrySet().mo35029c().mo35381I().get(i);
    }

    public int size() {
        return this.f16550g.size();
    }

    /* renamed from: u */
    public ImmutableSortedMultiset<E> mo34706t1() {
        return this.f16550g;
    }

    /* renamed from: w */
    public ImmutableSortedSet<E> mo34982n() {
        return this.f16550g.mo34982n().descendingSet();
    }
}
