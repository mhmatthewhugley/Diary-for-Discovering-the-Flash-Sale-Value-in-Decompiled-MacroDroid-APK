package okhttp3;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.internal.connection.C15942e;
import p297ja.C13339u;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0006\u0010\u0018\u001a\u00020\u0017R*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00178F@FX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178F@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR.\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00100\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001e\u00101\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0011\u00104\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b+\u00103¨\u00067"}, mo71668d2 = {"Lokhttp3/p;", "", "", "host", "Lokhttp3/internal/connection/e$a;", "Lokhttp3/internal/connection/e;", "e", "", "i", "T", "Ljava/util/Deque;", "calls", "call", "Lja/u;", "f", "(Ljava/util/Deque;Ljava/lang/Object;)V", "b", "(Lokhttp3/internal/connection/e$a;)V", "a", "c", "(Lokhttp3/internal/connection/e;)V", "g", "h", "", "j", "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "d", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.p */
/* compiled from: Dispatcher.kt */
public final class C15971p {

    /* renamed from: a */
    private int f65768a = 64;

    /* renamed from: b */
    private int f65769b = 5;

    /* renamed from: c */
    private Runnable f65770c;

    /* renamed from: d */
    private ExecutorService f65771d;

    /* renamed from: e */
    private final ArrayDeque<C15942e.C15943a> f65772e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<C15942e.C15943a> f65773f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<C15942e> f65774g = new ArrayDeque<>();

    /* renamed from: e */
    private final C15942e.C15943a m96247e(String str) {
        Iterator<C15942e.C15943a> it = this.f65773f.iterator();
        while (it.hasNext()) {
            C15942e.C15943a next = it.next();
            if (C13706o.m87924a(next.mo76117d(), str)) {
                return next;
            }
        }
        Iterator<C15942e.C15943a> it2 = this.f65772e.iterator();
        while (it2.hasNext()) {
            C15942e.C15943a next2 = it2.next();
            if (C13706o.m87924a(next2.mo76117d(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final <T> void m96248f(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f65770c;
                C13339u uVar = C13339u.f61331a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m96249i() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: i */
    private final boolean m96249i() {
        int i;
        boolean z;
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<C15942e.C15943a> it = this.f65772e.iterator();
                C13706o.m87928e(it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C15942e.C15943a next = it.next();
                    if (this.f65773f.size() >= this.f65768a) {
                        break;
                    } else if (next.mo76116c().get() < this.f65769b) {
                        it.remove();
                        next.mo76116c().incrementAndGet();
                        C13706o.m87928e(next, "asyncCall");
                        arrayList.add(next);
                        this.f65773f.add(next);
                    }
                }
                z = mo76197j() > 0;
                C13339u uVar = C13339u.f61331a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C15942e.C15943a) arrayList.get(i)).mo76114a(mo76194d());
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final synchronized void mo76191a() {
        Iterator<C15942e.C15943a> it = this.f65772e.iterator();
        while (it.hasNext()) {
            it.next().mo76115b().cancel();
        }
        Iterator<C15942e.C15943a> it2 = this.f65773f.iterator();
        while (it2.hasNext()) {
            it2.next().mo76115b().cancel();
        }
        Iterator<C15942e> it3 = this.f65774g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    /* renamed from: b */
    public final void mo76192b(C15942e.C15943a aVar) {
        C15942e.C15943a e;
        C13706o.m87929f(aVar, NotificationCompat.CATEGORY_CALL);
        synchronized (this) {
            this.f65772e.add(aVar);
            if (!aVar.mo76115b().mo76104p() && (e = m96247e(aVar.mo76117d())) != null) {
                aVar.mo76118e(e);
            }
            C13339u uVar = C13339u.f61331a;
        }
        m96249i();
    }

    /* renamed from: c */
    public final synchronized void mo76193c(C15942e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        this.f65774g.add(eVar);
    }

    /* renamed from: d */
    public final synchronized ExecutorService mo76194d() {
        ExecutorService executorService;
        if (this.f65771d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f65771d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, C16279b.m97634J(C16279b.f66630i + " Dispatcher", false));
        }
        executorService = this.f65771d;
        C13706o.m87926c(executorService);
        return executorService;
    }

    /* renamed from: g */
    public final void mo76195g(C15942e.C15943a aVar) {
        C13706o.m87929f(aVar, NotificationCompat.CATEGORY_CALL);
        aVar.mo76116c().decrementAndGet();
        m96248f(this.f65773f, aVar);
    }

    /* renamed from: h */
    public final void mo76196h(C15942e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        m96248f(this.f65774g, eVar);
    }

    /* renamed from: j */
    public final synchronized int mo76197j() {
        return this.f65773f.size() + this.f65774g.size();
    }
}
