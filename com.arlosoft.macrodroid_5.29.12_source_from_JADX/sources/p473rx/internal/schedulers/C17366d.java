package p473rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p464jf.C17180d;
import p468nf.C17195c;
import p473rx.internal.util.C17383e;

/* renamed from: rx.internal.schedulers.d */
/* compiled from: GenericScheduledExecutorServiceFactory */
enum C17366d {
    ;
    

    /* renamed from: a */
    static final C17383e f69107a = null;

    static {
        f69107a = new C17383e("RxScheduledExecutorPool-");
    }

    /* renamed from: b */
    public static ScheduledExecutorService m101101b() {
        C17180d<? extends ScheduledExecutorService> a = C17195c.m100717a();
        if (a == null) {
            return m101102d();
        }
        return (ScheduledExecutorService) a.call();
    }

    /* renamed from: d */
    static ScheduledExecutorService m101102d() {
        return Executors.newScheduledThreadPool(1, m101103e());
    }

    /* renamed from: e */
    static ThreadFactory m101103e() {
        return f69107a;
    }
}
