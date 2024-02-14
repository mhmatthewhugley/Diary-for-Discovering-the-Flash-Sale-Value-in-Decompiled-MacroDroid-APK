package p440y9;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p262fa.C12251a;
import p414v9.C16742o;
import p448z9.C17071b;
import p448z9.C17072c;

/* renamed from: y9.b */
/* compiled from: HandlerScheduler */
final class C16974b extends C16742o {

    /* renamed from: b */
    private final Handler f68352b;

    /* renamed from: c */
    private final boolean f68353c;

    /* renamed from: y9.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C16975a extends C16742o.C16745c {

        /* renamed from: a */
        private final Handler f68354a;

        /* renamed from: c */
        private final boolean f68355c;

        /* renamed from: d */
        private volatile boolean f68356d;

        C16975a(Handler handler, boolean z) {
            this.f68354a = handler;
            this.f68355c = z;
        }

        /* renamed from: c */
        public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f68356d) {
                return C17072c.m100417a();
            }
            C16976b bVar = new C16976b(this.f68354a, C12251a.m82987r(runnable));
            Message obtain = Message.obtain(this.f68354a, bVar);
            obtain.obj = this;
            if (this.f68355c) {
                obtain.setAsynchronous(true);
            }
            this.f68354a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f68356d) {
                return bVar;
            }
            this.f68354a.removeCallbacks(bVar);
            return C17072c.m100417a();
        }

        public void dispose() {
            this.f68356d = true;
            this.f68354a.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f68356d;
        }
    }

    /* renamed from: y9.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C16976b implements Runnable, C17071b {

        /* renamed from: a */
        private final Handler f68357a;

        /* renamed from: c */
        private final Runnable f68358c;

        /* renamed from: d */
        private volatile boolean f68359d;

        C16976b(Handler handler, Runnable runnable) {
            this.f68357a = handler;
            this.f68358c = runnable;
        }

        public void dispose() {
            this.f68357a.removeCallbacks(this);
            this.f68359d = true;
        }

        public boolean isDisposed() {
            return this.f68359d;
        }

        public void run() {
            try {
                this.f68358c.run();
            } catch (Throwable th) {
                C12251a.m82985p(th);
            }
        }
    }

    C16974b(Handler handler, boolean z) {
        this.f68352b = handler;
        this.f68353c = z;
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C16975a(this.f68352b, this.f68353c);
    }

    /* renamed from: c */
    public C17071b mo69993c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        C16976b bVar = new C16976b(this.f68352b, C12251a.m82987r(runnable));
        Message obtain = Message.obtain(this.f68352b, bVar);
        if (this.f68353c) {
            obtain.setAsynchronous(true);
        }
        this.f68352b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        return bVar;
    }
}
