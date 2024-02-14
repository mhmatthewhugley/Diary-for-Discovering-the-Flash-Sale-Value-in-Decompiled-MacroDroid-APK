package p292io.grpc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.q */
/* compiled from: Context */
public class C12952q {

    /* renamed from: o */
    static final Logger f60645o = Logger.getLogger(C12952q.class.getName());

    /* renamed from: p */
    private static final C13006w0<Object, Object> f60646p;

    /* renamed from: s */
    public static final C12952q f60647s;

    /* renamed from: a */
    private ArrayList<C12956d> f60648a;

    /* renamed from: c */
    private C12954b f60649c = new C12958f(this, (C12950p) null);

    /* renamed from: d */
    final C12953a f60650d;

    /* renamed from: f */
    final C13006w0<Object, Object> f60651f;

    /* renamed from: g */
    final int f60652g;

    /* renamed from: io.grpc.q$a */
    /* compiled from: Context */
    public static final class C12953a extends C12952q implements Closeable {

        /* renamed from: A */
        private final C12952q f60653A;

        /* renamed from: B */
        private boolean f60654B;

        /* renamed from: C */
        private Throwable f60655C;

        /* renamed from: D */
        private ScheduledFuture<?> f60656D;

        /* renamed from: z */
        private final C12977s f60657z;

        /* renamed from: c */
        public C12952q mo69748c() {
            return this.f60653A.mo69748c();
        }

        public void close() {
            mo69757v((Throwable) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo69749e() {
            return true;
        }

        /* renamed from: g */
        public Throwable mo69750g() {
            if (mo69753o()) {
                return this.f60655C;
            }
            return null;
        }

        /* renamed from: j */
        public void mo69751j(C12952q qVar) {
            this.f60653A.mo69751j(qVar);
        }

        /* renamed from: m */
        public C12977s mo69752m() {
            return this.f60657z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
            if (p292io.grpc.C12952q.super.mo69753o() == false) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            mo69757v(p292io.grpc.C12952q.super.mo69750g());
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo69753o() {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.f60654B     // Catch:{ all -> 0x0019 }
                r1 = 1
                if (r0 == 0) goto L_0x0008
                monitor-exit(r2)     // Catch:{ all -> 0x0019 }
                return r1
            L_0x0008:
                monitor-exit(r2)     // Catch:{ all -> 0x0019 }
                boolean r0 = p292io.grpc.C12952q.super.mo69753o()
                if (r0 == 0) goto L_0x0017
                java.lang.Throwable r0 = p292io.grpc.C12952q.super.mo69750g()
                r2.mo69757v(r0)
                return r1
            L_0x0017:
                r0 = 0
                return r0
            L_0x0019:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0019 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.C12952q.C12953a.mo69753o():boolean");
        }

        /* renamed from: v */
        public boolean mo69757v(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f60654B) {
                    this.f60654B = true;
                    ScheduledFuture<?> scheduledFuture = this.f60656D;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f60656D = null;
                    }
                    this.f60655C = th;
                } else {
                    z = false;
                }
            }
            if (z) {
                mo69754p();
            }
            return z;
        }
    }

    /* renamed from: io.grpc.q$b */
    /* compiled from: Context */
    public interface C12954b {
        /* renamed from: a */
        void mo69507a(C12952q qVar);
    }

    /* renamed from: io.grpc.q$c */
    /* compiled from: Context */
    private enum C12955c implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }

        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    /* renamed from: io.grpc.q$d */
    /* compiled from: Context */
    private final class C12956d implements Runnable {

        /* renamed from: a */
        private final Executor f60660a;

        /* renamed from: c */
        final C12954b f60661c;

        C12956d(Executor executor, C12954b bVar) {
            this.f60660a = executor;
            this.f60661c = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69760a() {
            try {
                this.f60660a.execute(this);
            } catch (Throwable th) {
                C12952q.f60645o.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        public void run() {
            this.f60661c.mo69507a(C12952q.this);
        }
    }

    /* renamed from: io.grpc.q$e */
    /* compiled from: Context */
    private static final class C12957e {

        /* renamed from: a */
        static final C12959g f60663a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f60663a = m85053a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C12952q.f60645o.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        private static C12959g m85053a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (C12959g) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(C12959g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C12557e1();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* renamed from: io.grpc.q$f */
    /* compiled from: Context */
    private final class C12958f implements C12954b {
        private C12958f() {
        }

        /* renamed from: a */
        public void mo69507a(C12952q qVar) {
            C12952q qVar2 = C12952q.this;
            if (qVar2 instanceof C12953a) {
                ((C12953a) qVar2).mo69757v(qVar.mo69750g());
            } else {
                qVar2.mo69754p();
            }
        }

        /* synthetic */ C12958f(C12952q qVar, C12950p pVar) {
            this();
        }
    }

    /* renamed from: io.grpc.q$g */
    /* compiled from: Context */
    public static abstract class C12959g {
        @Deprecated
        /* renamed from: a */
        public void mo69762a(C12952q qVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* renamed from: b */
        public abstract C12952q mo69128b();

        /* renamed from: c */
        public abstract void mo69129c(C12952q qVar, C12952q qVar2);

        /* renamed from: d */
        public C12952q mo69130d(C12952q qVar) {
            C12952q b = mo69128b();
            mo69762a(qVar);
            return b;
        }
    }

    static {
        C13006w0<Object, Object> w0Var = new C13006w0<>();
        f60646p = w0Var;
        f60647s = new C12952q((C12952q) null, w0Var);
    }

    private C12952q(C12952q qVar, C13006w0<Object, Object> w0Var) {
        int i;
        this.f60650d = m85030f(qVar);
        this.f60651f = w0Var;
        if (qVar == null) {
            i = 0;
        } else {
            i = qVar.f60652g + 1;
        }
        this.f60652g = i;
        m85034u(i);
    }

    /* renamed from: f */
    static C12953a m85030f(C12952q qVar) {
        if (qVar == null) {
            return null;
        }
        if (qVar instanceof C12953a) {
            return (C12953a) qVar;
        }
        return qVar.f60650d;
    }

    /* renamed from: h */
    static <T> T m85031h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static C12952q m85032i() {
        C12952q b = m85033s().mo69128b();
        return b == null ? f60647s : b;
    }

    /* renamed from: s */
    static C12959g m85033s() {
        return C12957e.f60663a;
    }

    /* renamed from: u */
    private static void m85034u(int i) {
        if (i == 1000) {
            f60645o.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    /* renamed from: b */
    public void mo69747b(C12954b bVar, Executor executor) {
        m85031h(bVar, "cancellationListener");
        m85031h(executor, "executor");
        if (mo69749e()) {
            C12956d dVar = new C12956d(executor, bVar);
            synchronized (this) {
                if (mo69753o()) {
                    dVar.mo69760a();
                } else {
                    ArrayList<C12956d> arrayList = this.f60648a;
                    if (arrayList == null) {
                        ArrayList<C12956d> arrayList2 = new ArrayList<>();
                        this.f60648a = arrayList2;
                        arrayList2.add(dVar);
                        C12953a aVar = this.f60650d;
                        if (aVar != null) {
                            aVar.mo69747b(this.f60649c, C12955c.INSTANCE);
                        }
                    } else {
                        arrayList.add(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public C12952q mo69748c() {
        C12952q d = m85033s().mo69130d(this);
        return d == null ? f60647s : d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo69749e() {
        return this.f60650d != null;
    }

    /* renamed from: g */
    public Throwable mo69750g() {
        C12953a aVar = this.f60650d;
        if (aVar == null) {
            return null;
        }
        return aVar.mo69750g();
    }

    /* renamed from: j */
    public void mo69751j(C12952q qVar) {
        m85031h(qVar, "toAttach");
        m85033s().mo69129c(this, qVar);
    }

    /* renamed from: m */
    public C12977s mo69752m() {
        C12953a aVar = this.f60650d;
        if (aVar == null) {
            return null;
        }
        return aVar.mo69752m();
    }

    /* renamed from: o */
    public boolean mo69753o() {
        C12953a aVar = this.f60650d;
        if (aVar == null) {
            return false;
        }
        return aVar.mo69753o();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r2 >= r0.size()) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if ((r0.get(r2).f60661c instanceof p292io.grpc.C12952q.C12958f) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0.get(r2).mo69760a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r1 >= r0.size()) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if ((r0.get(r1).f60661c instanceof p292io.grpc.C12952q.C12958f) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0.get(r1).mo69760a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r4.f60650d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r0.mo69755r(r4.f60649c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69754p() {
        /*
            r4 = this;
            boolean r0 = r4.mo69749e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            monitor-enter(r4)
            java.util.ArrayList<io.grpc.q$d> r0 = r4.f60648a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            return
        L_0x000e:
            r1 = 0
            r4.f60648a = r1     // Catch:{ all -> 0x005a }
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            r1 = 0
            r2 = 0
        L_0x0014:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0032
            java.lang.Object r3 = r0.get(r2)
            io.grpc.q$d r3 = (p292io.grpc.C12952q.C12956d) r3
            io.grpc.q$b r3 = r3.f60661c
            boolean r3 = r3 instanceof p292io.grpc.C12952q.C12958f
            if (r3 != 0) goto L_0x002f
            java.lang.Object r3 = r0.get(r2)
            io.grpc.q$d r3 = (p292io.grpc.C12952q.C12956d) r3
            r3.mo69760a()
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0032:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0050
            java.lang.Object r2 = r0.get(r1)
            io.grpc.q$d r2 = (p292io.grpc.C12952q.C12956d) r2
            io.grpc.q$b r2 = r2.f60661c
            boolean r2 = r2 instanceof p292io.grpc.C12952q.C12958f
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r0.get(r1)
            io.grpc.q$d r2 = (p292io.grpc.C12952q.C12956d) r2
            r2.mo69760a()
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x0032
        L_0x0050:
            io.grpc.q$a r0 = r4.f60650d
            if (r0 == 0) goto L_0x0059
            io.grpc.q$b r1 = r4.f60649c
            r0.mo69755r(r1)
        L_0x0059:
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.C12952q.mo69754p():void");
    }

    /* renamed from: r */
    public void mo69755r(C12954b bVar) {
        if (mo69749e()) {
            synchronized (this) {
                ArrayList<C12956d> arrayList = this.f60648a;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (this.f60648a.get(size).f60661c == bVar) {
                            this.f60648a.remove(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (this.f60648a.isEmpty()) {
                        C12953a aVar = this.f60650d;
                        if (aVar != null) {
                            aVar.mo69755r(this.f60649c);
                        }
                        this.f60648a = null;
                    }
                }
            }
        }
    }
}
