package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Monitor {

    /* renamed from: a */
    private final boolean f53612a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ReentrantLock f53613b;
    @GuardedBy

    /* renamed from: c */
    private Guard f53614c;

    public static abstract class Guard {
        @Weak

        /* renamed from: a */
        final Monitor f53615a;

        /* renamed from: b */
        final Condition f53616b;
        @GuardedBy

        /* renamed from: c */
        int f53617c = 0;
        @GuardedBy

        /* renamed from: d */
        Guard f53618d;

        protected Guard(Monitor monitor) {
            this.f53615a = (Monitor) Preconditions.m5393t(monitor, "monitor");
            this.f53616b = monitor.f53613b.newCondition();
        }

        /* renamed from: a */
        public abstract boolean mo61637a();
    }

    public Monitor() {
        this(false);
    }

    @GuardedBy
    /* renamed from: d */
    private boolean m74252d(Guard guard) {
        try {
            return guard.mo61637a();
        } catch (Throwable th) {
            m74253f();
            throw th;
        }
    }

    @GuardedBy
    /* renamed from: f */
    private void m74253f() {
        for (Guard guard = this.f53614c; guard != null; guard = guard.f53618d) {
            guard.f53616b.signalAll();
        }
    }

    @GuardedBy
    /* renamed from: g */
    private void m74254g() {
        for (Guard guard = this.f53614c; guard != null; guard = guard.f53618d) {
            if (m74252d(guard)) {
                guard.f53616b.signal();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo61847b() {
        this.f53613b.lock();
    }

    /* renamed from: c */
    public boolean mo61848c() {
        return this.f53613b.isHeldByCurrentThread();
    }

    /* renamed from: e */
    public void mo61849e() {
        ReentrantLock reentrantLock = this.f53613b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                m74254g();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Monitor(boolean z) {
        this.f53614c = null;
        this.f53612a = z;
        this.f53613b = new ReentrantLock(z);
    }
}
