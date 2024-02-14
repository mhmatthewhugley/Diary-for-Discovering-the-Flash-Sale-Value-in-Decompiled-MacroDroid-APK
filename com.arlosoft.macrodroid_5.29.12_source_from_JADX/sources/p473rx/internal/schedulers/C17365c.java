package p473rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.schedulers.c */
/* compiled from: GenericScheduledExecutorService */
public final class C17365c implements C17374h {

    /* renamed from: b */
    private static final ScheduledExecutorService[] f69102b = new ScheduledExecutorService[0];

    /* renamed from: c */
    private static final ScheduledExecutorService f69103c;

    /* renamed from: d */
    public static final C17365c f69104d = new C17365c();

    /* renamed from: e */
    private static int f69105e;

    /* renamed from: a */
    private final AtomicReference<ScheduledExecutorService[]> f69106a = new AtomicReference<>(f69102b);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f69103c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    private C17365c() {
        mo80685b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m101099a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = f69104d.f69106a.get();
        if (scheduledExecutorServiceArr == f69102b) {
            return f69103c;
        }
        int i = f69105e + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f69105e = i;
        return scheduledExecutorServiceArr[i];
    }

    /* renamed from: b */
    public void mo80685b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = C17366d.m101101b();
        }
        if (this.f69106a.compareAndSet(f69102b, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!C17368f.m101109l(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C17368f.m101108h((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }

    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f69106a.get();
            scheduledExecutorServiceArr2 = f69102b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.f69106a.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C17368f.m101105e(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }
}
