package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    /* renamed from: a */
    private final AtomicReference<ListenableFuture<Void>> f53556a = new AtomicReference<>(Futures.m74211e());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ThreadConfinedTaskQueue f53557b = new ThreadConfinedTaskQueue((C110011) null);

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1 */
    class C110011 implements AsyncCallable<Object> {

        /* renamed from: a */
        final /* synthetic */ Callable f53558a;

        public ListenableFuture<Object> call() throws Exception {
            return Futures.m74210d(this.f53558a.call());
        }

        public String toString() {
            return this.f53558a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2 */
    class C110022 implements AsyncCallable<Object> {

        /* renamed from: a */
        final /* synthetic */ TaskNonReentrantExecutor f53559a;

        /* renamed from: b */
        final /* synthetic */ AsyncCallable f53560b;

        public ListenableFuture<Object> call() throws Exception {
            if (!this.f53559a.m74177b()) {
                return Futures.m74208b();
            }
            return this.f53560b.call();
        }

        public String toString() {
            return this.f53560b.toString();
        }
    }

    enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    private static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        Executor delegate;
        ExecutionSequencer sequencer;
        Thread submitting;
        Runnable task;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m74177b() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.sequencer;
                Objects.requireNonNull(executionSequencer);
                ThreadConfinedTaskQueue a = executionSequencer.f53557b;
                if (a.f53565a == this.submitting) {
                    this.sequencer = null;
                    Preconditions.m5398y(a.f53566b == null);
                    a.f53566b = runnable;
                    Executor executor = this.delegate;
                    Objects.requireNonNull(executor);
                    a.f53567c = executor;
                    this.delegate = null;
                } else {
                    Executor executor2 = this.delegate;
                    Objects.requireNonNull(executor2);
                    this.delegate = null;
                    this.task = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.submitting = null;
            }
        }

        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.submitting) {
                Runnable runnable = this.task;
                Objects.requireNonNull(runnable);
                this.task = null;
                runnable.run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue((C110011) null);
            threadConfinedTaskQueue.f53565a = currentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            Objects.requireNonNull(executionSequencer);
            ThreadConfinedTaskQueue unused = executionSequencer.f53557b = threadConfinedTaskQueue;
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                Objects.requireNonNull(runnable2);
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = threadConfinedTaskQueue.f53566b;
                    if (runnable3 != null && (executor = threadConfinedTaskQueue.f53567c) != null) {
                        threadConfinedTaskQueue.f53566b = null;
                        threadConfinedTaskQueue.f53567c = null;
                        executor.execute(runnable3);
                    }
                }
            } finally {
                threadConfinedTaskQueue.f53565a = null;
            }
        }
    }

    private static final class ThreadConfinedTaskQueue {

        /* renamed from: a */
        Thread f53565a;

        /* renamed from: b */
        Runnable f53566b;

        /* renamed from: c */
        Executor f53567c;

        private ThreadConfinedTaskQueue() {
        }

        /* synthetic */ ThreadConfinedTaskQueue(C110011 r1) {
            this();
        }
    }

    private ExecutionSequencer() {
    }
}
