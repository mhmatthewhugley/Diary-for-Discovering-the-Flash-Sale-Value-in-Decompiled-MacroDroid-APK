package p399tc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0012\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0016R\u001a\u0010&\u001a\u00020%8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00108\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, mo71668d2 = {"Ltc/d;", "", "Ltc/a;", "task", "", "delayNanos", "Lja/u;", "i", "", "recurrence", "k", "(Ltc/a;JZ)Z", "a", "n", "b", "()Z", "", "toString", "shutdown", "Z", "g", "setShutdown$okhttp", "(Z)V", "activeTask", "Ltc/a;", "c", "()Ltc/a;", "l", "(Ltc/a;)V", "", "futureTasks", "Ljava/util/List;", "e", "()Ljava/util/List;", "cancelActiveTask", "d", "m", "Ltc/e;", "taskRunner", "Ltc/e;", "h", "()Ltc/e;", "name", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ltc/e;Ljava/lang/String;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: tc.d */
/* compiled from: TaskQueue.kt */
public final class C16616d {

    /* renamed from: a */
    private boolean f67459a;

    /* renamed from: b */
    private C16613a f67460b;

    /* renamed from: c */
    private final List<C16613a> f67461c = new ArrayList();

    /* renamed from: d */
    private boolean f67462d;

    /* renamed from: e */
    private final C16617e f67463e;

    /* renamed from: f */
    private final String f67464f;

    public C16616d(C16617e eVar, String str) {
        C13706o.m87929f(eVar, "taskRunner");
        C13706o.m87929f(str, "name");
        this.f67463e = eVar;
        this.f67464f = str;
    }

    /* renamed from: j */
    public static /* synthetic */ void m98957j(C16616d dVar, C16613a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dVar.mo79482i(aVar, j);
    }

    /* renamed from: a */
    public final void mo79474a() {
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            synchronized (this.f67463e) {
                if (mo79475b()) {
                    this.f67463e.mo79491h(this);
                }
                C13339u uVar = C13339u.f61331a;
            }
            return;
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

    /* renamed from: b */
    public final boolean mo79475b() {
        C16613a aVar = this.f67460b;
        if (aVar != null) {
            C13706o.m87926c(aVar);
            if (aVar.mo79467a()) {
                this.f67462d = true;
            }
        }
        boolean z = false;
        for (int size = this.f67461c.size() - 1; size >= 0; size--) {
            if (this.f67461c.get(size).mo79467a()) {
                C16613a aVar2 = this.f67461c.get(size);
                if (C16617e.f67467j.mo79497a().isLoggable(Level.FINE)) {
                    C16614b.m98955c(aVar2, this, "canceled");
                }
                this.f67461c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final C16613a mo79476c() {
        return this.f67460b;
    }

    /* renamed from: d */
    public final boolean mo79477d() {
        return this.f67462d;
    }

    /* renamed from: e */
    public final List<C16613a> mo79478e() {
        return this.f67461c;
    }

    /* renamed from: f */
    public final String mo79479f() {
        return this.f67464f;
    }

    /* renamed from: g */
    public final boolean mo79480g() {
        return this.f67459a;
    }

    /* renamed from: h */
    public final C16617e mo79481h() {
        return this.f67463e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79482i(p399tc.C16613a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            tc.e r0 = r2.f67463e
            monitor-enter(r0)
            boolean r1 = r2.f67459a     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.mo79467a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0027
            tc.e$b r4 = p399tc.C16617e.f67467j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo79497a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p399tc.C16614b.m98955c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            tc.e$b r4 = p399tc.C16617e.f67467j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo79497a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p399tc.C16614b.m98955c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo79483k(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            tc.e r3 = r2.f67463e     // Catch:{ all -> 0x0050 }
            r3.mo79491h(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p399tc.C16616d.mo79482i(tc.a, long):void");
    }

    /* renamed from: k */
    public final boolean mo79483k(C16613a aVar, long j, boolean z) {
        String str;
        C13706o.m87929f(aVar, "task");
        aVar.mo79471e(this);
        long b = this.f67463e.mo79490g().mo79494b();
        long j2 = b + j;
        int indexOf = this.f67461c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.mo79469c() <= j2) {
                if (C16617e.f67467j.mo79497a().isLoggable(Level.FINE)) {
                    C16614b.m98955c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f67461c.remove(indexOf);
        }
        aVar.mo79472g(j2);
        if (C16617e.f67467j.mo79497a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + C16614b.m98954b(j2 - b);
            } else {
                str = "scheduled after " + C16614b.m98954b(j2 - b);
            }
            C16614b.m98955c(aVar, this, str);
        }
        Iterator<C16613a> it = this.f67461c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().mo79469c() - b > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f67461c.size();
        }
        this.f67461c.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo79484l(C16613a aVar) {
        this.f67460b = aVar;
    }

    /* renamed from: m */
    public final void mo79485m(boolean z) {
        this.f67462d = z;
    }

    /* renamed from: n */
    public final void mo79486n() {
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            synchronized (this.f67463e) {
                this.f67459a = true;
                if (mo79475b()) {
                    this.f67463e.mo79491h(this);
                }
                C13339u uVar = C13339u.f61331a;
            }
            return;
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

    public String toString() {
        return this.f67464f;
    }
}
