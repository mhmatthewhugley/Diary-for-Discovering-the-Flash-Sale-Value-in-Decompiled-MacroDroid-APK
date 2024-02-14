package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtIncompatible
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
@Beta
public class CycleDetectingLockFactory {

    /* renamed from: b */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, LockGraphNode>> f53535b = new MapMaker().mo35789l().mo35786i();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f53536c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: d */
    private static final ThreadLocal<ArrayList<LockGraphNode>> f53537d = new ThreadLocal<ArrayList<LockGraphNode>>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<LockGraphNode> initialValue() {
            return Lists.m27835k(3);
        }
    };

    /* renamed from: a */
    final Policy f53538a;

    private interface CycleDetectingLock {
        /* renamed from: a */
        LockGraphNode mo61721a();

        /* renamed from: b */
        boolean mo61722b();
    }

    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        /* renamed from: a */
        public LockGraphNode mo61721a() {
            return this.lockGraphNode;
        }

        /* renamed from: b */
        public boolean mo61722b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }
    }

    private static class ExampleStackTrace extends IllegalStateException {

        /* renamed from: a */
        static final StackTraceElement[] f53539a = new StackTraceElement[0];

        /* renamed from: c */
        static final ImmutableSet<String> f53540c = ImmutableSet.m27508J(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r4, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r5) {
            /*
                r3 = this;
                java.lang.String r4 = r4.mo61742d()
                java.lang.String r5 = r5.mo61742d()
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r0 = r0.length()
                int r0 = r0 + 4
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                int r0 = r0 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                r1.append(r4)
                java.lang.String r4 = " -> "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                int r5 = r4.length
                r0 = 0
            L_0x0038:
                if (r0 >= r5) goto L_0x006d
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0052
                java.lang.StackTraceElement[] r4 = f53539a
                r3.setStackTrace(r4)
                goto L_0x006d
            L_0x0052:
                com.google.common.collect.ImmutableSet<java.lang.String> r1 = f53540c
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x006a
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                goto L_0x006d
            L_0x006a:
                int r0 = r0 + 1
                goto L_0x0038
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.<init>(com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode):void");
        }
    }

    private static class LockGraphNode {

        /* renamed from: a */
        final Map<LockGraphNode, ExampleStackTrace> f53541a;

        /* renamed from: b */
        final Map<LockGraphNode, PotentialDeadlockException> f53542b;

        /* renamed from: c */
        final String f53543c;

        /* renamed from: c */
        private ExampleStackTrace m74159c(LockGraphNode lockGraphNode, Set<LockGraphNode> set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = this.f53541a.get(lockGraphNode);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry next : this.f53541a.entrySet()) {
                LockGraphNode lockGraphNode2 = (LockGraphNode) next.getKey();
                ExampleStackTrace c = lockGraphNode2.m74159c(lockGraphNode, set);
                if (c != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(lockGraphNode2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) next.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(c);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61740a(Policy policy, LockGraphNode lockGraphNode) {
            Preconditions.m5372C(this != lockGraphNode, "Attempted to acquire multiple locks with the same rank %s", lockGraphNode.mo61742d());
            if (!this.f53541a.containsKey(lockGraphNode)) {
                PotentialDeadlockException potentialDeadlockException = this.f53542b.get(lockGraphNode);
                if (potentialDeadlockException != null) {
                    policy.mo61743b(new PotentialDeadlockException(lockGraphNode, this, potentialDeadlockException.mo61744a()));
                    return;
                }
                ExampleStackTrace c = lockGraphNode.m74159c(this, Sets.m28727j());
                if (c == null) {
                    this.f53541a.put(lockGraphNode, new ExampleStackTrace(lockGraphNode, this));
                    return;
                }
                PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(lockGraphNode, this, c);
                this.f53542b.put(lockGraphNode, potentialDeadlockException2);
                policy.mo61743b(potentialDeadlockException2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61741b(Policy policy, List<LockGraphNode> list) {
            for (LockGraphNode a : list) {
                mo61740a(policy, a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo61742d() {
            return this.f53543c;
        }
    }

    @Beta
    public enum Policies implements Policy {
        THROW {
            /* renamed from: b */
            public void mo61743b(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN {
            /* renamed from: b */
            public void mo61743b(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f53536c.log(Level.SEVERE, "Detected potential deadlock", potentialDeadlockException);
            }
        },
        DISABLED {
            /* renamed from: b */
            public void mo61743b(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    @Beta
    public interface Policy {
        /* renamed from: b */
        void mo61743b(PotentialDeadlockException potentialDeadlockException);
    }

    @Beta
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        /* renamed from: a */
        public ExampleStackTrace mo61744a() {
            return this.conflictingStackTrace;
        }

        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
            super(lockGraphNode, lockGraphNode2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }
    }

    @Beta
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m74147a(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.mo61722b()) {
            ArrayList arrayList = f53537d.get();
            LockGraphNode a = cycleDetectingLock.mo61721a();
            a.mo61741b(this.f53538a, arrayList);
            arrayList.add(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m74151e(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.mo61722b()) {
            ArrayList arrayList = f53537d.get();
            LockGraphNode a = cycleDetectingLock.mo61721a();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == a) {
                    arrayList.remove(size);
                    return;
                }
            }
        }
    }

    final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        /* renamed from: a */
        public LockGraphNode mo61721a() {
            return this.lockGraphNode;
        }

        /* renamed from: b */
        public boolean mo61722b() {
            return isHeldByCurrentThread();
        }

        public void lock() {
            this.this$0.m74147a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m74151e(this);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            this.this$0.m74147a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m74151e(this);
            }
        }

        public boolean tryLock() {
            this.this$0.m74147a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m74151e(this);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m74151e(this);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            this.this$0.m74147a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m74151e(this);
            }
        }
    }

    private class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        public void lock() {
            this.this$0.m74147a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            this.this$0.m74147a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            this.this$0.m74147a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            this.this$0.m74147a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }
    }

    private class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final /* synthetic */ CycleDetectingLockFactory this$0;

        public void lock() {
            this.this$0.m74147a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            this.this$0.m74147a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            this.this$0.m74147a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            this.this$0.m74147a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m74151e(this.readWriteLock);
            }
        }
    }
}
