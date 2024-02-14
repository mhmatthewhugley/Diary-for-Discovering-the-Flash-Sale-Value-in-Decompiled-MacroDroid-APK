package p292io.reactivex.internal.schedulers;

import p262fa.C12251a;

/* renamed from: io.reactivex.internal.schedulers.h */
/* compiled from: ScheduledDirectPeriodicTask */
public final class C13193h extends C13179a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C13193h(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(C13179a.f61025a);
            C12251a.m82985p(th);
        }
    }
}
