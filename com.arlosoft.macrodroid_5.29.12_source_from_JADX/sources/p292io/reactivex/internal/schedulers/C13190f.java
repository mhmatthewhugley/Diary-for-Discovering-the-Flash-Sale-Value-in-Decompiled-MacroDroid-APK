package p292io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p223ca.C11162a;
import p223ca.C11164c;
import p262fa.C12251a;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.f */
/* compiled from: NewThreadWorker */
public class C13190f extends C16742o.C16745c {

    /* renamed from: a */
    private final ScheduledExecutorService f61068a;

    /* renamed from: c */
    volatile boolean f61069c;

    public C13190f(ThreadFactory threadFactory) {
        this.f61068a = C13196k.m85493a(threadFactory);
    }

    /* renamed from: b */
    public C17071b mo69996b(Runnable runnable) {
        return mo69997c(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f61069c) {
            return C11164c.INSTANCE;
        }
        return mo70013e(runnable, j, timeUnit, (C11162a) null);
    }

    public void dispose() {
        if (!this.f61069c) {
            this.f61069c = true;
            this.f61068a.shutdownNow();
        }
    }

    /* renamed from: e */
    public C13195j mo70013e(Runnable runnable, long j, TimeUnit timeUnit, C11162a aVar) {
        Future future;
        C13195j jVar = new C13195j(C12251a.m82987r(runnable), aVar);
        if (aVar != null && !aVar.mo62358a(jVar)) {
            return jVar;
        }
        if (j <= 0) {
            try {
                future = this.f61068a.submit(jVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo62359b(jVar);
                }
                C12251a.m82985p(e);
            }
        } else {
            future = this.f61068a.schedule(jVar, j, timeUnit);
        }
        jVar.mo70022a(future);
        return jVar;
    }

    /* renamed from: f */
    public C17071b mo70014f(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13194i iVar = new C13194i(C12251a.m82987r(runnable));
        if (j <= 0) {
            try {
                future = this.f61068a.submit(iVar);
            } catch (RejectedExecutionException e) {
                C12251a.m82985p(e);
                return C11164c.INSTANCE;
            }
        } else {
            future = this.f61068a.schedule(iVar, j, timeUnit);
        }
        iVar.mo69991a(future);
        return iVar;
    }

    /* renamed from: g */
    public C17071b mo70015g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable r = C12251a.m82987r(runnable);
        if (j2 <= 0) {
            C13184c cVar = new C13184c(r, this.f61068a);
            if (j <= 0) {
                try {
                    future = this.f61068a.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C12251a.m82985p(e);
                    return C11164c.INSTANCE;
                }
            } else {
                future = this.f61068a.schedule(cVar, j, timeUnit);
            }
            cVar.mo70001b(future);
            return cVar;
        }
        C13193h hVar = new C13193h(r);
        try {
            hVar.mo69991a(this.f61068a.scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e2) {
            C12251a.m82985p(e2);
            return C11164c.INSTANCE;
        }
    }

    /* renamed from: h */
    public void mo70016h() {
        if (!this.f61069c) {
            this.f61069c = true;
            this.f61068a.shutdown();
        }
    }

    public boolean isDisposed() {
        return this.f61069c;
    }
}
