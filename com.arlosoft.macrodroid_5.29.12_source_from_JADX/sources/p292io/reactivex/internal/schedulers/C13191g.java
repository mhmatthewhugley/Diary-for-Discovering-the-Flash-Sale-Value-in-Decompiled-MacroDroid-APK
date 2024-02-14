package p292io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.schedulers.g */
/* compiled from: RxThreadFactory */
public final class C13191g extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    /* renamed from: io.reactivex.internal.schedulers.g$a */
    /* compiled from: RxThreadFactory */
    static final class C13192a extends Thread {
        C13192a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C13191g(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread aVar = this.nonBlocking ? new C13192a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.priority);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public C13191g(String str, int i) {
        this(str, i, false);
    }

    public C13191g(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }
}
