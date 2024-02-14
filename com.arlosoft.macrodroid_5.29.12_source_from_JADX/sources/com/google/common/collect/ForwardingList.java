package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    protected ForwardingList() {
    }

    public void add(int i, @ParametricNullness E e) {
        mo34397R().add(i, e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i, Collection<? extends E> collection) {
        return mo34397R().addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public abstract List<E> mo34397R();

    public boolean equals(Object obj) {
        return obj == this || mo34397R().equals(obj);
    }

    @ParametricNullness
    public E get(int i) {
        return mo34397R().get(i);
    }

    public int hashCode() {
        return mo34397R().hashCode();
    }

    public int indexOf(Object obj) {
        return mo34397R().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return mo34397R().lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return mo34397R().listIterator();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove(int i) {
        return mo34397R().remove(i);
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E set(int i, @ParametricNullness E e) {
        return mo34397R().set(i, e);
    }

    public List<E> subList(int i, int i2) {
        return mo34397R().subList(i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return mo34397R().listIterator(i);
    }
}
