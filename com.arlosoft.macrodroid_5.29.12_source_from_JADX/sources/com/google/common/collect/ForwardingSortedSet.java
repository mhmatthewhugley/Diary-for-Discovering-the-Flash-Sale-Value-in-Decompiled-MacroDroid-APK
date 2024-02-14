package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    protected ForwardingSortedSet() {
    }

    public Comparator<? super E> comparator() {
        return mo34398b0().comparator();
    }

    @ParametricNullness
    public E first() {
        return mo34398b0().first();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public abstract SortedSet<E> mo34398b0();

    public SortedSet<E> headSet(@ParametricNullness E e) {
        return mo34398b0().headSet(e);
    }

    @ParametricNullness
    public E last() {
        return mo34398b0().last();
    }

    public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        return mo34398b0().subSet(e, e2);
    }

    public SortedSet<E> tailSet(@ParametricNullness E e) {
        return mo34398b0().tailSet(e);
    }
}
