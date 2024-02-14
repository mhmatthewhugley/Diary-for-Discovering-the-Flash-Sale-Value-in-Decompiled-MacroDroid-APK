package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingQueue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    protected ForwardingBlockingQueue() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public abstract BlockingQueue<E> mo35056b0();

    public int drainTo(Collection<? super E> collection, int i) {
        return mo35056b0().drainTo(collection, i);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35056b0().offer(e, j, timeUnit);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo35056b0().poll(j, timeUnit);
    }

    public void put(E e) throws InterruptedException {
        mo35056b0().put(e);
    }

    public int remainingCapacity() {
        return mo35056b0().remainingCapacity();
    }

    public E take() throws InterruptedException {
        return mo35056b0().take();
    }

    public int drainTo(Collection<? super E> collection) {
        return mo35056b0().drainTo(collection);
    }
}
