package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    protected ForwardingNavigableSet() {
    }

    public E ceiling(@ParametricNullness E e) {
        return mo35219g0().ceiling(e);
    }

    public Iterator<E> descendingIterator() {
        return mo35219g0().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return mo35219g0().descendingSet();
    }

    public E floor(@ParametricNullness E e) {
        return mo35219g0().floor(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public abstract NavigableSet<E> mo35219g0();

    public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        return mo35219g0().headSet(e, z);
    }

    public E higher(@ParametricNullness E e) {
        return mo35219g0().higher(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public SortedSet<E> mo35223i0(@ParametricNullness E e) {
        return headSet(e, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public SortedSet<E> mo35224l0(@ParametricNullness E e, @ParametricNullness E e2) {
        return subSet(e, true, e2, false);
    }

    public E lower(@ParametricNullness E e) {
        return mo35219g0().lower(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public SortedSet<E> mo35226m0(@ParametricNullness E e) {
        return tailSet(e, true);
    }

    public E pollFirst() {
        return mo35219g0().pollFirst();
    }

    public E pollLast() {
        return mo35219g0().pollLast();
    }

    public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        return mo35219g0().subSet(e, z, e2, z2);
    }

    public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        return mo35219g0().tailSet(e, z);
    }
}
