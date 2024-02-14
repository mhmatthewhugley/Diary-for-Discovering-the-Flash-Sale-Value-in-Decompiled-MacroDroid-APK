package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    protected ForwardingQueue() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public abstract Queue<E> mo34397R();

    @ParametricNullness
    public E element() {
        return mo34397R().element();
    }

    @CanIgnoreReturnValue
    public boolean offer(@ParametricNullness E e) {
        return mo34397R().offer(e);
    }

    public E peek() {
        return mo34397R().peek();
    }

    @CanIgnoreReturnValue
    public E poll() {
        return mo34397R().poll();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove() {
        return mo34397R().remove();
    }
}
