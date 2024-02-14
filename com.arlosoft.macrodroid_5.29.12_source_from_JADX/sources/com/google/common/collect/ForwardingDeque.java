package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    protected ForwardingDeque() {
    }

    public void addFirst(@ParametricNullness E e) {
        mo35056b0().addFirst(e);
    }

    public void addLast(@ParametricNullness E e) {
        mo35056b0().addLast(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public abstract Deque<E> mo35056b0();

    public Iterator<E> descendingIterator() {
        return mo35056b0().descendingIterator();
    }

    @ParametricNullness
    public E getFirst() {
        return mo35056b0().getFirst();
    }

    @ParametricNullness
    public E getLast() {
        return mo35056b0().getLast();
    }

    @CanIgnoreReturnValue
    public boolean offerFirst(@ParametricNullness E e) {
        return mo35056b0().offerFirst(e);
    }

    @CanIgnoreReturnValue
    public boolean offerLast(@ParametricNullness E e) {
        return mo35056b0().offerLast(e);
    }

    public E peekFirst() {
        return mo35056b0().peekFirst();
    }

    public E peekLast() {
        return mo35056b0().peekLast();
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return mo35056b0().pollFirst();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        return mo35056b0().pollLast();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E pop() {
        return mo35056b0().pop();
    }

    public void push(@ParametricNullness E e) {
        mo35056b0().push(e);
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeFirst() {
        return mo35056b0().removeFirst();
    }

    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
        return mo35056b0().removeFirstOccurrence(obj);
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeLast() {
        return mo35056b0().removeLast();
    }

    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
        return mo35056b0().removeLastOccurrence(obj);
    }
}
