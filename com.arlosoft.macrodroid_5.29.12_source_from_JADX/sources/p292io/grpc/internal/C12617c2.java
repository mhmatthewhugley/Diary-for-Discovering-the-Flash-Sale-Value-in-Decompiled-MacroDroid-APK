package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.c2 */
/* compiled from: SharedResourceHolder */
public final class C12617c2 {

    /* renamed from: d */
    private static final C12617c2 f59675d = new C12617c2(new C12618a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final IdentityHashMap<C12621d<?>, C12620c> f59676a = new IdentityHashMap<>();

    /* renamed from: b */
    private final C12622e f59677b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledExecutorService f59678c;

    /* renamed from: io.grpc.internal.c2$a */
    /* compiled from: SharedResourceHolder */
    class C12618a implements C12622e {
        C12618a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService mo69245a() {
            return Executors.newSingleThreadScheduledExecutor(C12749o0.m84364f("grpc-shared-destroyer-%d", true));
        }
    }

    /* renamed from: io.grpc.internal.c2$b */
    /* compiled from: SharedResourceHolder */
    class C12619b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12620c f59679a;

        /* renamed from: c */
        final /* synthetic */ C12621d f59680c;

        /* renamed from: d */
        final /* synthetic */ Object f59681d;

        C12619b(C12620c cVar, C12621d dVar, Object obj) {
            this.f59679a = cVar;
            this.f59680c = dVar;
            this.f59681d = obj;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            synchronized (C12617c2.this) {
                if (this.f59679a.f59684b == 0) {
                    try {
                        this.f59680c.mo69247b(this.f59681d);
                        C12617c2.this.f59676a.remove(this.f59680c);
                        if (C12617c2.this.f59676a.isEmpty()) {
                            C12617c2.this.f59678c.shutdown();
                            ScheduledExecutorService unused = C12617c2.this.f59678c = null;
                        }
                    } catch (Throwable th) {
                        C12617c2.this.f59676a.remove(this.f59680c);
                        if (C12617c2.this.f59676a.isEmpty()) {
                            C12617c2.this.f59678c.shutdown();
                            ScheduledExecutorService unused2 = C12617c2.this.f59678c = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.c2$c */
    /* compiled from: SharedResourceHolder */
    private static class C12620c {

        /* renamed from: a */
        final Object f59683a;

        /* renamed from: b */
        int f59684b;

        /* renamed from: c */
        ScheduledFuture<?> f59685c;

        C12620c(Object obj) {
            this.f59683a = obj;
        }
    }

    /* renamed from: io.grpc.internal.c2$d */
    /* compiled from: SharedResourceHolder */
    public interface C12621d<T> {
        /* renamed from: b */
        void mo69247b(T t);

        T create();
    }

    /* renamed from: io.grpc.internal.c2$e */
    /* compiled from: SharedResourceHolder */
    interface C12622e {
        /* renamed from: a */
        ScheduledExecutorService mo69245a();
    }

    C12617c2(C12622e eVar) {
        this.f59677b = eVar;
    }

    /* renamed from: d */
    public static <T> T m83941d(C12621d<T> dVar) {
        return f59675d.mo69243e(dVar);
    }

    /* renamed from: f */
    public static <T> T m83942f(C12621d<T> dVar, T t) {
        return f59675d.mo69244g(dVar, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <T> T mo69243e(C12621d<T> dVar) {
        C12620c cVar;
        cVar = this.f59676a.get(dVar);
        if (cVar == null) {
            cVar = new C12620c(dVar.create());
            this.f59676a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f59685c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f59685c = null;
        }
        cVar.f59684b++;
        return cVar.f59683a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized <T> T mo69244g(C12621d<T> dVar, T t) {
        C12620c cVar = this.f59676a.get(dVar);
        if (cVar != null) {
            boolean z = false;
            Preconditions.m5378e(t == cVar.f59683a, "Releasing the wrong instance");
            Preconditions.m5399z(cVar.f59684b > 0, "Refcount has already reached zero");
            int i = cVar.f59684b - 1;
            cVar.f59684b = i;
            if (i == 0) {
                if (cVar.f59685c == null) {
                    z = true;
                }
                Preconditions.m5399z(z, "Destroy task already scheduled");
                if (this.f59678c == null) {
                    this.f59678c = this.f59677b.mo69245a();
                }
                cVar.f59685c = this.f59678c.schedule(new C12595a1(new C12619b(cVar, dVar, t)), 1, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        return null;
    }
}
