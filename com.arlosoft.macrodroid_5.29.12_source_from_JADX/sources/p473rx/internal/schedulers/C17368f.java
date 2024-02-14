package p473rx.internal.schedulers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17158f;
import p459ef.C17163i;
import p463if.C17175a;
import p464jf.C17176a;
import p468nf.C17195c;
import p470pf.C17223b;
import p470pf.C17225d;
import p473rx.internal.util.C17378c;
import p473rx.internal.util.C17383e;
import p473rx.internal.util.C17391g;

/* renamed from: rx.internal.schedulers.f */
/* compiled from: NewThreadWorker */
public class C17368f extends C17158f.C17159a {

    /* renamed from: d */
    private static final boolean f69110d;

    /* renamed from: f */
    public static final int f69111f = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* renamed from: g */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f69112g = new ConcurrentHashMap<>();

    /* renamed from: o */
    private static final AtomicReference<ScheduledExecutorService> f69113o = new AtomicReference<>();

    /* renamed from: p */
    private static volatile Object f69114p;

    /* renamed from: s */
    private static final Object f69115s = new Object();

    /* renamed from: a */
    private final ScheduledExecutorService f69116a;

    /* renamed from: c */
    volatile boolean f69117c;

    /* renamed from: rx.internal.schedulers.f$a */
    /* compiled from: NewThreadWorker */
    static class C17369a implements Runnable {
        C17369a() {
        }

        public void run() {
            C17368f.m101107g();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int a = C17378c.m101132a();
        f69110d = !z && (a == 0 || a >= 21);
    }

    public C17368f(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m101109l(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m101108h((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f69116a = newScheduledThreadPool;
    }

    /* renamed from: e */
    public static void m101105e(ScheduledExecutorService scheduledExecutorService) {
        f69112g.remove(scheduledExecutorService);
    }

    /* renamed from: f */
    static Method m101106f(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    static void m101107g() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f69112g.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            C17175a.m100684d(th);
            C17195c.m100723g(th);
        }
    }

    /* renamed from: h */
    public static void m101108h(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f69113o;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C17383e("RxSchedulerPurge-"));
            if (atomicReference.compareAndSet((Object) null, newScheduledThreadPool)) {
                C17369a aVar = new C17369a();
                int i = f69111f;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f69112g.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: l */
    public static boolean m101109l(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        if (f69110d) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f69114p;
                Object obj2 = f69115s;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    method = m101106f(scheduledExecutorService);
                    if (method != null) {
                        obj2 = method;
                    }
                    f69114p = obj2;
                } else {
                    method = (Method) obj;
                }
            } else {
                method = m101106f(scheduledExecutorService);
            }
            if (method != null) {
                try {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.TRUE});
                    return true;
                } catch (InvocationTargetException e) {
                    C17195c.m100723g(e);
                } catch (IllegalAccessException e2) {
                    C17195c.m100723g(e2);
                } catch (IllegalArgumentException e3) {
                    C17195c.m100723g(e3);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C17163i mo80446a(C17176a aVar) {
        return mo80447c(aVar, 0, (TimeUnit) null);
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return this.f69117c;
    }

    /* renamed from: c */
    public C17163i mo80447c(C17176a aVar, long j, TimeUnit timeUnit) {
        if (this.f69117c) {
            return C17225d.m100809b();
        }
        return mo80686i(aVar, j, timeUnit);
    }

    /* renamed from: d */
    public void mo80450d() {
        this.f69117c = true;
        this.f69116a.shutdownNow();
        m101105e(this.f69116a);
    }

    /* renamed from: i */
    public C17370g mo80686i(C17176a aVar, long j, TimeUnit timeUnit) {
        Future future;
        C17370g gVar = new C17370g(C17195c.m100729m(aVar));
        if (j <= 0) {
            future = this.f69116a.submit(gVar);
        } else {
            future = this.f69116a.schedule(gVar, j, timeUnit);
        }
        gVar.mo80691c(future);
        return gVar;
    }

    /* renamed from: j */
    public C17370g mo80687j(C17176a aVar, long j, TimeUnit timeUnit, C17223b bVar) {
        Future future;
        C17370g gVar = new C17370g(C17195c.m100729m(aVar), bVar);
        bVar.mo80521a(gVar);
        if (j <= 0) {
            future = this.f69116a.submit(gVar);
        } else {
            future = this.f69116a.schedule(gVar, j, timeUnit);
        }
        gVar.mo80691c(future);
        return gVar;
    }

    /* renamed from: k */
    public C17370g mo80688k(C17176a aVar, long j, TimeUnit timeUnit, C17391g gVar) {
        Future future;
        C17370g gVar2 = new C17370g(C17195c.m100729m(aVar), gVar);
        gVar.mo80709a(gVar2);
        if (j <= 0) {
            future = this.f69116a.submit(gVar2);
        } else {
            future = this.f69116a.schedule(gVar2, j, timeUnit);
        }
        gVar2.mo80691c(future);
        return gVar2;
    }
}
