package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15898a;
import okhttp3.C15924f0;
import okhttp3.internal.connection.C15942e;
import p297ja.C13339u;
import p372qc.C16279b;
import p399tc.C16613a;
import p399tc.C16616d;
import p399tc.C16617e;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0018\u0018\u0000 '2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J.\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e¨\u0006("}, mo71668d2 = {"Lokhttp3/internal/connection/h;", "", "Lokhttp3/internal/connection/f;", "connection", "", "now", "", "d", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "call", "", "Lokhttp3/f0;", "routes", "", "requireMultiplexed", "a", "Lja/u;", "e", "c", "b", "J", "keepAliveDurationNs", "okhttp3/internal/connection/h$b", "Lokhttp3/internal/connection/h$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "maxIdleConnections", "Ltc/e;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ltc/e;IJLjava/util/concurrent/TimeUnit;)V", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.h */
/* compiled from: RealConnectionPool.kt */
public final class C15951h {

    /* renamed from: f */
    public static final C15952a f65708f = new C15952a((C13695i) null);

    /* renamed from: a */
    private final long f65709a;

    /* renamed from: b */
    private final C16616d f65710b;

    /* renamed from: c */
    private final C15953b f65711c = new C15953b(this, C16279b.f66630i + " ConnectionPool");

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C15946f> f65712d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private final int f65713e;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lokhttp3/internal/connection/h$a;", "", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.h$a */
    /* compiled from: RealConnectionPool.kt */
    public static final class C15952a {
        private C15952a() {
        }

        public /* synthetic */ C15952a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"okhttp3/internal/connection/h$b", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.h$b */
    /* compiled from: RealConnectionPool.kt */
    public static final class C15953b extends C16613a {

        /* renamed from: e */
        final /* synthetic */ C15951h f65714e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15953b(C15951h hVar, String str) {
            super(str, false, 2, (C13695i) null);
            this.f65714e = hVar;
        }

        /* renamed from: f */
        public long mo76151f() {
            return this.f65714e.mo76148b(System.nanoTime());
        }
    }

    public C15951h(C16617e eVar, int i, long j, TimeUnit timeUnit) {
        C13706o.m87929f(eVar, "taskRunner");
        C13706o.m87929f(timeUnit, "timeUnit");
        this.f65713e = i;
        this.f65709a = timeUnit.toNanos(j);
        this.f65710b = eVar.mo79492i();
        if (!(j > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    /* renamed from: d */
    private final int m96178d(C15946f fVar, long j) {
        if (!C16279b.f66629h || Thread.holdsLock(fVar)) {
            List<Reference<C15942e>> o = fVar.mo76132o();
            int i = 0;
            while (i < o.size()) {
                Reference reference = o.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    C16926h.f68190c.mo80117g().mo80090l("A connection to " + fVar.mo76121A().mo76025a().mo75907l() + " was leaked. " + "Did you forget to close a response body?", ((C15942e.C15944b) reference).mo76120a());
                    o.remove(i);
                    fVar.mo76123D(true);
                    if (o.isEmpty()) {
                        fVar.mo76122C(j - this.f65709a);
                        return 0;
                    }
                }
            }
            return o.size();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo76147a(C15898a aVar, C15942e eVar, List<C15924f0> list, boolean z) {
        C13706o.m87929f(aVar, "address");
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        Iterator<C15946f> it = this.f65712d.iterator();
        while (it.hasNext()) {
            C15946f next = it.next();
            C13706o.m87928e(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.mo76141w()) {
                        C13339u uVar = C13339u.f61331a;
                    }
                }
                if (next.mo76139u(aVar, list)) {
                    eVar.mo76096c(next);
                    return true;
                }
                C13339u uVar2 = C13339u.f61331a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        p372qc.C16279b.m97657k(r3.mo76124E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r10.f65712d.isEmpty() == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
        r10.f65710b.mo79474a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        return 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo76148b(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r0 = r10.f65712d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r0.next()
            okhttp3.internal.connection.f r6 = (okhttp3.internal.connection.C15946f) r6
            java.lang.String r7 = "connection"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)
            monitor-enter(r6)
            int r7 = r10.m96178d(r6, r11)     // Catch:{ all -> 0x003d }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.mo76133p()     // Catch:{ all -> 0x003d }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0039
            ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x003d }
            r3 = r6
            r4 = r7
            goto L_0x003b
        L_0x0039:
            ja.u r7 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003d:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L_0x0040:
            long r6 = r10.f65709a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r10.f65713e
            if (r1 <= r0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            if (r1 <= 0) goto L_0x004f
            long r6 = r6 - r4
            return r6
        L_0x004f:
            if (r2 <= 0) goto L_0x0052
            return r6
        L_0x0052:
            r11 = -1
            return r11
        L_0x0055:
            kotlin.jvm.internal.C13706o.m87926c(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.mo76132o()     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0092 }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x0069
            monitor-exit(r3)
            return r6
        L_0x0069:
            long r8 = r3.mo76133p()     // Catch:{ all -> 0x0092 }
            long r8 = r8 + r4
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            monitor-exit(r3)
            return r6
        L_0x0074:
            r3.mo76123D(r1)     // Catch:{ all -> 0x0092 }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r11 = r10.f65712d     // Catch:{ all -> 0x0092 }
            r11.remove(r3)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            java.net.Socket r11 = r3.mo76124E()
            p372qc.C16279b.m97657k(r11)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r11 = r10.f65712d
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0091
            tc.d r11 = r10.f65710b
            r11.mo79474a()
        L_0x0091:
            return r6
        L_0x0092:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15951h.mo76148b(long):long");
    }

    /* renamed from: c */
    public final boolean mo76149c(C15946f fVar) {
        C13706o.m87929f(fVar, "connection");
        if (C16279b.f66629h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        } else if (fVar.mo76134q() || this.f65713e == 0) {
            fVar.mo76123D(true);
            this.f65712d.remove(fVar);
            if (!this.f65712d.isEmpty()) {
                return true;
            }
            this.f65710b.mo79474a();
            return true;
        } else {
            C16616d.m98957j(this.f65710b, this.f65711c, 0, 2, (Object) null);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo76150e(C15946f fVar) {
        C13706o.m87929f(fVar, "connection");
        if (!C16279b.f66629h || Thread.holdsLock(fVar)) {
            this.f65712d.add(fVar);
            C16616d.m98957j(this.f65710b, this.f65711c, 0, 2, (Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }
}
