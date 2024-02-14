package com.koushikdutta.async;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.koushikdutta.async.b */
/* compiled from: AsyncServer */
public class C11694b {

    /* renamed from: d */
    static C11694b f57495d = new C11694b();

    /* renamed from: e */
    private static ExecutorService f57496e = m81830a("AsyncServer-worker-");

    /* renamed from: f */
    private static final Comparator<InetAddress> f57497f = new C11695a();

    /* renamed from: g */
    private static ExecutorService f57498g = m81830a("AsyncServer-resolver-");

    /* renamed from: h */
    static final WeakHashMap<Thread, C11694b> f57499h = new WeakHashMap<>();

    /* renamed from: a */
    String f57500a;

    /* renamed from: b */
    int f57501b;

    /* renamed from: c */
    PriorityQueue<C11697c> f57502c;

    /* renamed from: com.koushikdutta.async.b$a */
    /* compiled from: AsyncServer */
    static class C11695a implements Comparator<InetAddress> {
        C11695a() {
        }

        /* renamed from: a */
        public int compare(InetAddress inetAddress, InetAddress inetAddress2) {
            boolean z = inetAddress instanceof Inet4Address;
            if (z && (inetAddress2 instanceof Inet4Address)) {
                return 0;
            }
            if (!(inetAddress instanceof Inet6Address) || !(inetAddress2 instanceof Inet6Address)) {
                return (!z || !(inetAddress2 instanceof Inet6Address)) ? 1 : -1;
            }
            return 0;
        }
    }

    /* renamed from: com.koushikdutta.async.b$b */
    /* compiled from: AsyncServer */
    private static class C11696b implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f57503a;

        /* renamed from: c */
        private final AtomicInteger f57504c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f57505d;

        C11696b(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f57503a = threadGroup;
            this.f57505d = str;
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f57503a;
            Thread thread = new Thread(threadGroup, runnable, this.f57505d + this.f57504c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* renamed from: com.koushikdutta.async.b$c */
    /* compiled from: AsyncServer */
    private static class C11697c {

        /* renamed from: a */
        public long f57506a;
    }

    /* renamed from: com.koushikdutta.async.b$d */
    /* compiled from: AsyncServer */
    static class C11698d implements Comparator<C11697c> {

        /* renamed from: a */
        public static C11698d f57507a = new C11698d();

        private C11698d() {
        }

        /* renamed from: a */
        public int compare(C11697c cVar, C11697c cVar2) {
            long j = cVar.f57506a;
            long j2 = cVar2.f57506a;
            if (j == j2) {
                return 0;
            }
            return j > j2 ? 1 : -1;
        }
    }

    public C11694b() {
        this((String) null);
    }

    /* renamed from: a */
    private static ExecutorService m81830a(String str) {
        return new ThreadPoolExecutor(1, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C11696b(str));
    }

    public C11694b(String str) {
        this.f57501b = 0;
        this.f57502c = new PriorityQueue<>(1, C11698d.f57507a);
        this.f57500a = str == null ? "AsyncServer" : str;
    }
}
