package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public abstract class Striped<L> {

    private static class CompactStriped<L> extends PowerOfTwoStriped<L> {
    }

    @VisibleForTesting
    static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
    }

    private static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
            super(false);
        }
    }

    private static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;
    }

    private static abstract class PowerOfTwoStriped<L> extends Striped<L> {
    }

    @VisibleForTesting
    static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        private static final class ArrayReference<L> extends WeakReference<L> {
        }
    }

    private static final class WeakSafeCondition extends ForwardingCondition {

        /* renamed from: a */
        private final Condition f53685a;

        /* renamed from: b */
        private final WeakSafeReadWriteLock f53686b;

        WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f53685a = condition;
            this.f53686b = weakSafeReadWriteLock;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Condition mo61778a() {
            return this.f53685a;
        }
    }

    private static final class WeakSafeLock extends ForwardingLock {

        /* renamed from: a */
        private final Lock f53687a;

        /* renamed from: c */
        private final WeakSafeReadWriteLock f53688c;

        WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f53687a = lock;
            this.f53688c = weakSafeReadWriteLock;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Lock mo61808a() {
            return this.f53687a;
        }

        public Condition newCondition() {
            return new WeakSafeCondition(this.f53687a.newCondition(), this.f53688c);
        }
    }

    private static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* renamed from: a */
        private final ReadWriteLock f53689a = new ReentrantReadWriteLock();

        WeakSafeReadWriteLock() {
        }

        public Lock readLock() {
            return new WeakSafeLock(this.f53689a.readLock(), this);
        }

        public Lock writeLock() {
            return new WeakSafeLock(this.f53689a.writeLock(), this);
        }
    }

    private Striped() {
    }
}
