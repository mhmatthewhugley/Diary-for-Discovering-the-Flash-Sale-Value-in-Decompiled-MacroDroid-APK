package p292io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.k */
/* compiled from: SchedulerPoolFactory */
public final class C13196k {

    /* renamed from: a */
    public static final boolean f61074a;

    /* renamed from: b */
    public static final int f61075b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f61076c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f61077d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.k$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C13197a {

        /* renamed from: a */
        boolean f61078a;

        /* renamed from: b */
        int f61079b;

        C13197a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70025a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f61078a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f61078a = true;
            }
            if (!this.f61078a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f61079b = 1;
                return;
            }
            try {
                this.f61079b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f61079b = 1;
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$b */
    /* compiled from: SchedulerPoolFactory */
    static final class C13198b implements Runnable {
        C13198b() {
        }

        public void run() {
            Iterator it = new ArrayList(C13196k.f61077d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C13196k.f61077d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C13197a aVar = new C13197a();
        aVar.mo70025a(properties);
        f61074a = aVar.f61078a;
        f61075b = aVar.f61079b;
        m85494b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m85493a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m85495c(f61074a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m85494b() {
        m85496d(f61074a);
    }

    /* renamed from: c */
    static void m85495c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f61077d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    static void m85496d(boolean z) {
        if (z) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f61076c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C13191g("RxSchedulerPurge"));
                    if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C13198b bVar = new C13198b();
                        int i = f61075b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
