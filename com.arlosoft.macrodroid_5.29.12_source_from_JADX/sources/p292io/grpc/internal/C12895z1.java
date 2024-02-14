package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.z1 */
/* compiled from: SerializingExecutor */
public final class C12895z1 implements Executor, Runnable {

    /* renamed from: f */
    private static final Logger f60441f = Logger.getLogger(C12895z1.class.getName());

    /* renamed from: g */
    private static final C12897b f60442g = m84855c();

    /* renamed from: a */
    private final Executor f60443a;

    /* renamed from: c */
    private final Queue<Runnable> f60444c = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile int f60445d = 0;

    /* renamed from: io.grpc.internal.z1$b */
    /* compiled from: SerializingExecutor */
    private static abstract class C12897b {
        private C12897b() {
        }

        /* renamed from: a */
        public abstract boolean mo69657a(C12895z1 z1Var, int i, int i2);

        /* renamed from: b */
        public abstract void mo69658b(C12895z1 z1Var, int i);
    }

    /* renamed from: io.grpc.internal.z1$c */
    /* compiled from: SerializingExecutor */
    private static final class C12898c extends C12897b {

        /* renamed from: a */
        private final AtomicIntegerFieldUpdater<C12895z1> f60446a;

        /* renamed from: a */
        public boolean mo69657a(C12895z1 z1Var, int i, int i2) {
            return this.f60446a.compareAndSet(z1Var, i, i2);
        }

        /* renamed from: b */
        public void mo69658b(C12895z1 z1Var, int i) {
            this.f60446a.set(z1Var, i);
        }

        private C12898c(AtomicIntegerFieldUpdater<C12895z1> atomicIntegerFieldUpdater) {
            super();
            this.f60446a = atomicIntegerFieldUpdater;
        }
    }

    /* renamed from: io.grpc.internal.z1$d */
    /* compiled from: SerializingExecutor */
    private static final class C12899d extends C12897b {
        private C12899d() {
            super();
        }

        /* renamed from: a */
        public boolean mo69657a(C12895z1 z1Var, int i, int i2) {
            synchronized (z1Var) {
                if (z1Var.f60445d != i) {
                    return false;
                }
                int unused = z1Var.f60445d = i2;
                return true;
            }
        }

        /* renamed from: b */
        public void mo69658b(C12895z1 z1Var, int i) {
            synchronized (z1Var) {
                int unused = z1Var.f60445d = i;
            }
        }
    }

    public C12895z1(Executor executor) {
        Preconditions.m5393t(executor, "'executor' must not be null.");
        this.f60443a = executor;
    }

    /* renamed from: c */
    private static C12897b m84855c() {
        try {
            return new C12898c(AtomicIntegerFieldUpdater.newUpdater(C12895z1.class, "d"));
        } catch (Throwable th) {
            f60441f.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new C12899d();
        }
    }

    /* renamed from: d */
    private void m84856d(Runnable runnable) {
        if (f60442g.mo69657a(this, 0, -1)) {
            try {
                this.f60443a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f60444c.remove(runnable);
                }
                f60442g.mo69658b(this, 0);
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f60444c.add(Preconditions.m5393t(runnable, "'r' must not be null."));
        m84856d(runnable);
    }

    public void run() {
        Runnable poll;
        while (true) {
            try {
                poll = this.f60444c.poll();
                if (poll == null) {
                    break;
                }
                poll.run();
            } catch (RuntimeException e) {
                Logger logger = f60441f;
                Level level = Level.SEVERE;
                logger.log(level, "Exception while executing runnable " + poll, e);
            } catch (Throwable th) {
                f60442g.mo69658b(this, 0);
                throw th;
            }
        }
        f60442g.mo69658b(this, 0);
        if (!this.f60444c.isEmpty()) {
            m84856d((Runnable) null);
        }
    }
}
