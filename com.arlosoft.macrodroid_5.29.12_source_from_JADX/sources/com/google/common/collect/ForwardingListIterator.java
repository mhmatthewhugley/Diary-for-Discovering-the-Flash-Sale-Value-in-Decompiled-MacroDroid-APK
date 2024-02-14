package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    protected ForwardingListIterator() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract ListIterator<E> mo34906R();

    public void add(@ParametricNullness E e) {
        mo34906R().add(e);
    }

    public boolean hasPrevious() {
        return mo34906R().hasPrevious();
    }

    public int nextIndex() {
        return mo34906R().nextIndex();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E previous() {
        return mo34906R().previous();
    }

    public int previousIndex() {
        return mo34906R().previousIndex();
    }

    public void set(@ParametricNullness E e) {
        mo34906R().set(e);
    }
}
