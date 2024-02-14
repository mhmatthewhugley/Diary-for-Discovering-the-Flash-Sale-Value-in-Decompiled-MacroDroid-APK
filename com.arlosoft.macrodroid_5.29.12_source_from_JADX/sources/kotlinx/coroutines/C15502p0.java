package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15418h1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, mo71668d2 = {"Lkotlinx/coroutines/p0;", "Lkotlinx/coroutines/h1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lja/u;", "z0", "Ljava/lang/Thread;", "t0", "", "y0", "q0", "task", "Z", "", "now", "Lkotlinx/coroutines/h1$c;", "delayedTask", "O", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/c1;", "j", "run", "p", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "w0", "()Z", "isShutDown", "x0", "isShutdownRequested", "N", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p0 */
/* compiled from: DefaultExecutor.kt */
public final class C15502p0 extends C15418h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: o */
    public static final C15502p0 f64721o;

    /* renamed from: p */
    private static final long f64722p;

    static {
        Long l;
        C15502p0 p0Var = new C15502p0();
        f64721o = p0Var;
        C15412g1.m94280G(p0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f64722p = timeUnit.toNanos(l.longValue());
    }

    private C15502p0() {
    }

    /* renamed from: q0 */
    private final synchronized void m94577q0() {
        if (m94580x0()) {
            debugStatus = 3;
            mo74734h0();
            notifyAll();
        }
    }

    /* renamed from: t0 */
    private final synchronized Thread m94578t0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: w0 */
    private final boolean m94579w0() {
        return debugStatus == 4;
    }

    /* renamed from: x0 */
    private final boolean m94580x0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: y0 */
    private final synchronized boolean m94581y0() {
        if (m94580x0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: z0 */
    private final void m94582z0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public Thread mo74715N() {
        Thread thread = _thread;
        return thread == null ? m94578t0() : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo74749O(long j, C15418h1.C15421c cVar) {
        m94582z0();
    }

    /* renamed from: Z */
    public void mo74732Z(Runnable runnable) {
        if (m94579w0()) {
            m94582z0();
        }
        super.mo74732Z(runnable);
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        return mo74736l0(j, runnable);
    }

    public void run() {
        C15558v2.f64805a.mo74923d(this);
        C15200c.m93755a();
        try {
            if (m94581y0()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long K = mo74724K();
                    if (K == LocationRequestCompat.PASSIVE_INTERVAL) {
                        C15200c.m93755a();
                        long nanoTime = System.nanoTime();
                        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                            j = f64722p + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m94577q0();
                            C15200c.m93755a();
                            if (!mo74733e0()) {
                                mo74715N();
                                return;
                            }
                            return;
                        }
                        K = C16792h.m99543e(K, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (K > 0) {
                        if (m94580x0()) {
                            _thread = null;
                            m94577q0();
                            C15200c.m93755a();
                            if (!mo74733e0()) {
                                mo74715N();
                                return;
                            }
                            return;
                        }
                        C15200c.m93755a();
                        LockSupport.parkNanos(this, K);
                    }
                }
            }
        } finally {
            _thread = null;
            m94577q0();
            C15200c.m93755a();
            if (!mo74733e0()) {
                mo74715N();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
