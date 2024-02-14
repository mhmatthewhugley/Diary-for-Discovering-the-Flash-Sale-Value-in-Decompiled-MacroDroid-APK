package p292io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.schedulers.i */
/* compiled from: ScheduledDirectTask */
public final class C13194i extends C13179a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public C13194i(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: b */
    public Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(C13179a.f61025a);
            this.runner = null;
        }
    }
}
