package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    protected ForwardingBlockingDeque() {
    }

    public int drainTo(Collection<? super E> collection) {
        return mo35111d0().drainTo(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public abstract BlockingDeque<E> mo35111d0();

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().offer(e, j, timeUnit);
    }

    public boolean offerFirst(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().offerFirst(e, j, timeUnit);
    }

    public boolean offerLast(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().offerLast(e, j, timeUnit);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().poll(j, timeUnit);
    }

    public E pollFirst(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().pollFirst(j, timeUnit);
    }

    public E pollLast(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35111d0().pollLast(j, timeUnit);
    }

    public void put(E e) throws InterruptedException {
        mo35111d0().put(e);
    }

    public void putFirst(E e) throws InterruptedException {
        mo35111d0().putFirst(e);
    }

    public void putLast(E e) throws InterruptedException {
        mo35111d0().putLast(e);
    }

    public int remainingCapacity() {
        return mo35111d0().remainingCapacity();
    }

    public E take() throws InterruptedException {
        return mo35111d0().take();
    }

    public E takeFirst() throws InterruptedException {
        return mo35111d0().takeFirst();
    }

    public E takeLast() throws InterruptedException {
        return mo35111d0().takeLast();
    }

    public int drainTo(Collection<? super E> collection, int i) {
        return mo35111d0().drainTo(collection, i);
    }
}
