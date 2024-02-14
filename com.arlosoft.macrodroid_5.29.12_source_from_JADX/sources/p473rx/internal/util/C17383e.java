package p473rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.util.e */
/* compiled from: RxThreadFactory */
public final class C17383e extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public static final ThreadFactory f69137a = new C17384a();
    private static final long serialVersionUID = -8841098858898482335L;
    final String prefix;

    /* renamed from: rx.internal.util.e$a */
    /* compiled from: RxThreadFactory */
    static class C17384a implements ThreadFactory {
        C17384a() {
        }

        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public C17383e(String str) {
        this.prefix = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.prefix + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
