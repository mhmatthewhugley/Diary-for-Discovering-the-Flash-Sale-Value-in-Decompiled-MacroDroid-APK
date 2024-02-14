package p137n4;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: n4.a */
/* compiled from: GlideExecutor */
public final class C7977a implements ExecutorService {

    /* renamed from: c */
    private static final long f19133c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    private static volatile int f19134d;

    /* renamed from: a */
    private final ExecutorService f19135a;

    /* renamed from: n4.a$a */
    /* compiled from: GlideExecutor */
    private static final class C7978a implements ThreadFactory {

        /* renamed from: a */
        private final String f19136a;

        /* renamed from: c */
        final C7980b f19137c;

        /* renamed from: d */
        final boolean f19138d;

        /* renamed from: f */
        private int f19139f;

        /* renamed from: n4.a$a$a */
        /* compiled from: GlideExecutor */
        class C7979a extends Thread {
            C7979a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C7978a.this.f19138d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C7978a.this.f19137c.mo37886a(th);
                }
            }
        }

        C7978a(String str, C7980b bVar, boolean z) {
            this.f19136a = str;
            this.f19137c = bVar;
            this.f19138d = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C7979a aVar;
            aVar = new C7979a(runnable, "glide-" + this.f19136a + "-thread-" + this.f19139f);
            this.f19139f = this.f19139f + 1;
            return aVar;
        }
    }

    /* renamed from: n4.a$b */
    /* compiled from: GlideExecutor */
    public interface C7980b {

        /* renamed from: a */
        public static final C7980b f19141a = new C7981a();

        /* renamed from: b */
        public static final C7980b f19142b;

        /* renamed from: c */
        public static final C7980b f19143c = new C7983c();

        /* renamed from: d */
        public static final C7980b f19144d;

        /* renamed from: n4.a$b$a */
        /* compiled from: GlideExecutor */
        class C7981a implements C7980b {
            C7981a() {
            }

            /* renamed from: a */
            public void mo37886a(Throwable th) {
            }
        }

        /* renamed from: n4.a$b$b */
        /* compiled from: GlideExecutor */
        class C7982b implements C7980b {
            C7982b() {
            }

            /* renamed from: a */
            public void mo37886a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: n4.a$b$c */
        /* compiled from: GlideExecutor */
        class C7983c implements C7980b {
            C7983c() {
            }

            /* renamed from: a */
            public void mo37886a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C7982b bVar = new C7982b();
            f19142b = bVar;
            f19144d = bVar;
        }

        /* renamed from: a */
        void mo37886a(Throwable th);
    }

    @VisibleForTesting
    C7977a(ExecutorService executorService) {
        this.f19135a = executorService;
    }

    /* renamed from: a */
    public static int m33263a() {
        if (f19134d == 0) {
            f19134d = Math.min(4, C7984b.m33275a());
        }
        return f19134d;
    }

    /* renamed from: b */
    public static C7977a m33264b() {
        return m33265c(m33263a() >= 4 ? 2 : 1, C7980b.f19144d);
    }

    /* renamed from: c */
    public static C7977a m33265c(int i, C7980b bVar) {
        return new C7977a(new ThreadPoolExecutor(0, i, f19133c, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7978a("animation", bVar, true)));
    }

    /* renamed from: d */
    public static C7977a m33266d() {
        return m33267e(1, "disk-cache", C7980b.f19144d);
    }

    /* renamed from: e */
    public static C7977a m33267e(int i, String str, C7980b bVar) {
        return new C7977a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7978a(str, bVar, true)));
    }

    /* renamed from: f */
    public static C7977a m33268f() {
        return m33269g(m33263a(), "source", C7980b.f19144d);
    }

    /* renamed from: g */
    public static C7977a m33269g(int i, String str, C7980b bVar) {
        return new C7977a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7978a(str, bVar, false)));
    }

    /* renamed from: h */
    public static C7977a m33270h() {
        return new C7977a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f19133c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C7978a("source-unlimited", C7980b.f19144d, false)));
    }

    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f19135a.awaitTermination(j, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f19135a.execute(runnable);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f19135a.invokeAll(collection);
    }

    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f19135a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f19135a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f19135a.isTerminated();
    }

    public void shutdown() {
        this.f19135a.shutdown();
    }

    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f19135a.shutdownNow();
    }

    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f19135a.submit(runnable);
    }

    public String toString() {
        return this.f19135a.toString();
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f19135a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f19135a.invokeAny(collection, j, timeUnit);
    }

    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f19135a.submit(runnable, t);
    }

    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f19135a.submit(callable);
    }
}
