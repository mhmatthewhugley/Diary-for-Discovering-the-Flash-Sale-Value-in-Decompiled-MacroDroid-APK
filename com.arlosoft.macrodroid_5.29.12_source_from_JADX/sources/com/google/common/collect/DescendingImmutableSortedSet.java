package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private final ImmutableSortedSet<E> forward;

    DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.m28520a(immutableSortedSet.comparator()).mo34739j());
        this.forward = immutableSortedSet;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: P */
    public ImmutableSortedSet<E> mo34913P() {
        throw new AssertionError("should never be called");
    }

    @GwtIncompatible
    /* renamed from: Q */
    public UnmodifiableIterator<E> descendingIterator() {
        return this.forward.iterator();
    }

    @GwtIncompatible
    /* renamed from: R */
    public ImmutableSortedSet<E> descendingSet() {
        return this.forward;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public ImmutableSortedSet<E> mo34916X(E e, boolean z) {
        return this.forward.tailSet(e, z).descendingSet();
    }

    public E ceiling(E e) {
        return this.forward.floor(e);
    }

    public boolean contains(Object obj) {
        return this.forward.contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public ImmutableSortedSet<E> mo34919d0(E e, boolean z, E e2, boolean z2) {
        return this.forward.subSet(e2, z2, e, z).descendingSet();
    }

    public E floor(E e) {
        return this.forward.ceiling(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public ImmutableSortedSet<E> mo34922h0(E e, boolean z) {
        return this.forward.headSet(e, z).descendingSet();
    }

    public E higher(E e) {
        return this.forward.lower(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return this.forward.mo34781j();
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return this.forward.descendingIterator();
    }

    public E lower(E e) {
        return this.forward.higher(e);
    }

    public int size() {
        return this.forward.size();
    }
}
