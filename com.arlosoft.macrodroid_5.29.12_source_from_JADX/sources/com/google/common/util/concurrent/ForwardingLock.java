package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@ElementTypesAreNonnullByDefault
abstract class ForwardingLock implements Lock {
    ForwardingLock() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Lock mo61808a();

    public void lock() {
        mo61808a().lock();
    }

    public void lockInterruptibly() throws InterruptedException {
        mo61808a().lockInterruptibly();
    }

    public Condition newCondition() {
        return mo61808a().newCondition();
    }

    public boolean tryLock() {
        return mo61808a().tryLock();
    }

    public void unlock() {
        mo61808a().unlock();
    }

    public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo61808a().tryLock(j, timeUnit);
    }
}
