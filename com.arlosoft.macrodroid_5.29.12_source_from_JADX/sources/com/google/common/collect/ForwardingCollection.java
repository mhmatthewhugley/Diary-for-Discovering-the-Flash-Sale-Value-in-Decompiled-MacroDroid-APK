package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    protected ForwardingCollection() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Collection<E> mo22325Q();

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public boolean mo35128T(Collection<? extends E> collection) {
        return Iterators.m27705a(this, collection.iterator());
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo35129V(Collection<?> collection) {
        return Collections2.m26540b(this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo35130W(Collection<?> collection) {
        return Iterators.m27699F(iterator(), collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public Object[] mo35131X() {
        return toArray(new Object[size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public <T> T[] mo35132Y(T[] tArr) {
        return ObjectArrays.m28473i(this, tArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public String mo35133a0() {
        return Collections2.m26547i(this);
    }

    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
        return mo22325Q().add(e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return mo22325Q().addAll(collection);
    }

    public void clear() {
        mo22325Q().clear();
    }

    public boolean contains(Object obj) {
        return mo22325Q().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo22325Q().containsAll(collection);
    }

    public boolean isEmpty() {
        return mo22325Q().isEmpty();
    }

    public Iterator<E> iterator() {
        return mo22325Q().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return mo22325Q().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return mo22325Q().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return mo22325Q().retainAll(collection);
    }

    public int size() {
        return mo22325Q().size();
    }

    public Object[] toArray() {
        return mo22325Q().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return mo22325Q().toArray(tArr);
    }
}
