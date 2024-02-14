package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    TransformedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    /* renamed from: b */
    private ListIterator<? extends F> m28994b() {
        return Iterators.m27708d(this.f17232a);
    }

    public void add(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return m28994b().hasPrevious();
    }

    public final int nextIndex() {
        return m28994b().nextIndex();
    }

    @ParametricNullness
    public final T previous() {
        return mo34726a(m28994b().previous());
    }

    public final int previousIndex() {
        return m28994b().previousIndex();
    }

    public void set(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }
}
