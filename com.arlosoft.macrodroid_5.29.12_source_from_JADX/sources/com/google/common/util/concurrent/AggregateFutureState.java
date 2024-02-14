package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ReflectionSupport
@ElementTypesAreNonnullByDefault
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {

    /* renamed from: A */
    private static final AtomicHelper f53453A;

    /* renamed from: B */
    private static final Logger f53454B = Logger.getLogger(AggregateFutureState.class.getName());

    /* renamed from: s */
    private volatile Set<Throwable> f53455s;

    /* renamed from: z */
    private volatile int f53456z;

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<AggregateFutureState<?>, Set<Throwable>> f53457a;

        /* renamed from: b */
        final AtomicIntegerFieldUpdater<AggregateFutureState<?>> f53458b;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f53457a = atomicReferenceFieldUpdater;
            this.f53458b = atomicIntegerFieldUpdater;
        }
    }

    private static final class SynchronizedAtomicHelper extends AtomicHelper {
        private SynchronizedAtomicHelper() {
            super();
        }
    }

    static {
        AtomicHelper atomicHelper;
        Throwable th = null;
        try {
            atomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "s"), AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "z"));
        } catch (Throwable th2) {
            th = th2;
            atomicHelper = new SynchronizedAtomicHelper();
        }
        f53453A = atomicHelper;
        if (th != null) {
            f53454B.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
