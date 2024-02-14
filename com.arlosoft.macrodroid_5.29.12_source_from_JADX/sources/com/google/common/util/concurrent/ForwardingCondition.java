package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    ForwardingCondition() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Condition mo61778a();

    public void await() throws InterruptedException {
        mo61778a().await();
    }

    public long awaitNanos(long j) throws InterruptedException {
        return mo61778a().awaitNanos(j);
    }

    public void awaitUninterruptibly() {
        mo61778a().awaitUninterruptibly();
    }

    public boolean awaitUntil(Date date) throws InterruptedException {
        return mo61778a().awaitUntil(date);
    }

    public void signal() {
        mo61778a().signal();
    }

    public void signalAll() {
        mo61778a().signalAll();
    }

    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo61778a().await(j, timeUnit);
    }
}
