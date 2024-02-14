package p226cd;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¨\u0006\u0018"}, mo71668d2 = {"Lcd/a;", "Lcd/z;", "", "now", "w", "Lja/u;", "t", "", "u", "z", "Lcd/w;", "sink", "x", "Lcd/y;", "source", "y", "Ljava/io/IOException;", "cause", "n", "v", "<init>", "()V", "a", "b", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.a */
/* compiled from: AsyncTimeout.kt */
public class C11173a extends C11213z {

    /* renamed from: i */
    public static final C11174a f54079i = new C11174a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final long f54080j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final long f54081k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static C11173a f54082l;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f54083f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11173a f54084g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f54085h;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo71668d2 = {"Lcd/a$a;", "", "Lcd/a;", "node", "", "timeoutNanos", "", "hasDeadline", "Lja/u;", "e", "d", "c", "()Lcd/a;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lcd/a;", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.a$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C11174a {
        private C11174a() {
        }

        public /* synthetic */ C11174a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m74998d(C11173a aVar) {
            synchronized (C11173a.class) {
                if (!aVar.f54083f) {
                    return false;
                }
                aVar.f54083f = false;
                for (C11173a i = C11173a.f54082l; i != null; i = i.f54084g) {
                    if (i.f54084g == aVar) {
                        i.f54084g = aVar.f54084g;
                        aVar.f54084g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m74999e(C11173a aVar, long j, boolean z) {
            Class<C11173a> cls = C11173a.class;
            synchronized (cls) {
                if (!aVar.f54083f) {
                    aVar.f54083f = true;
                    if (C11173a.f54082l == null) {
                        C11174a aVar2 = C11173a.f54079i;
                        C11173a.f54082l = new C11173a();
                        new C11175b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        aVar.f54085h = Math.min(j, aVar.mo62522c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        aVar.f54085h = j + nanoTime;
                    } else if (z) {
                        aVar.f54085h = aVar.mo62522c();
                    } else {
                        throw new AssertionError();
                    }
                    long o = aVar.m74988w(nanoTime);
                    C11173a i2 = C11173a.f54082l;
                    C13706o.m87926c(i2);
                    while (true) {
                        if (i2.f54084g == null) {
                            break;
                        }
                        C11173a m = i2.f54084g;
                        C13706o.m87926c(m);
                        if (o < m.m74988w(nanoTime)) {
                            break;
                        }
                        i2 = i2.f54084g;
                        C13706o.m87926c(i2);
                    }
                    aVar.f54084g = i2.f54084g;
                    i2.f54084g = aVar;
                    if (i2 == C11173a.f54082l) {
                        cls.notify();
                    }
                    C13339u uVar = C13339u.f61331a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        /* renamed from: c */
        public final C11173a mo62382c() throws InterruptedException {
            Class<C11173a> cls = C11173a.class;
            C11173a i = C11173a.f54082l;
            C13706o.m87926c(i);
            C11173a m = i.f54084g;
            if (m == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C11173a.f54080j);
                C11173a i2 = C11173a.f54082l;
                C13706o.m87926c(i2);
                if (i2.f54084g != null || System.nanoTime() - nanoTime < C11173a.f54081k) {
                    return null;
                }
                return C11173a.f54082l;
            }
            long o = m.m74988w(System.nanoTime());
            if (o > 0) {
                long j = o / 1000000;
                cls.wait(j, (int) (o - (1000000 * j)));
                return null;
            }
            C11173a i3 = C11173a.f54082l;
            C13706o.m87926c(i3);
            i3.f54084g = m.f54084g;
            m.f54084g = null;
            return m;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Lcd/a$b;", "Ljava/lang/Thread;", "Lja/u;", "run", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.a$b */
    /* compiled from: AsyncTimeout.kt */
    private static final class C11175b extends Thread {
        public C11175b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 != null) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
            r1.mo62381z();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<cd.a> r0 = p226cd.C11173a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                cd.a$a r1 = p226cd.C11173a.f54079i     // Catch:{ all -> 0x001f }
                cd.a r1 = r1.mo62382c()     // Catch:{ all -> 0x001f }
                cd.a r2 = p226cd.C11173a.f54082l     // Catch:{ all -> 0x001f }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p226cd.C11173a.f54082l = r1     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 != 0) goto L_0x001b
                goto L_0x0000
            L_0x001b:
                r1.mo62381z()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p226cd.C11173a.C11175b.run():void");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo71668d2 = {"cd/a$c", "Lcd/w;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "close", "Lcd/a;", "b", "", "toString", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.a$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C11176c implements C11210w {

        /* renamed from: a */
        final /* synthetic */ C11173a f54086a;

        /* renamed from: c */
        final /* synthetic */ C11210w f54087c;

        C11176c(C11173a aVar, C11210w wVar) {
            this.f54086a = aVar;
            this.f54087c = wVar;
        }

        /* renamed from: X */
        public void mo62384X(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "source");
            C11187d0.m75097b(bVar.mo62399D(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C11206t tVar = bVar.f54090a;
                    C13706o.m87926c(tVar);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (tVar.f54144c - tVar.f54143b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            tVar = tVar.f54147f;
                            C13706o.m87926c(tVar);
                        }
                    }
                    C11173a aVar = this.f54086a;
                    C11210w wVar = this.f54087c;
                    aVar.mo62376t();
                    try {
                        wVar.mo62384X(bVar, j2);
                        C13339u uVar = C13339u.f61331a;
                        if (!aVar.mo62377u()) {
                            j -= j2;
                        } else {
                            throw aVar.mo62375n((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (aVar.mo62377u()) {
                            e = aVar.mo62375n(e);
                        }
                        throw e;
                    } finally {
                        boolean u = aVar.mo62377u();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public C11173a mo62388q() {
            return this.f54086a;
        }

        public void close() {
            C11173a aVar = this.f54086a;
            C11210w wVar = this.f54087c;
            aVar.mo62376t();
            try {
                wVar.close();
                C13339u uVar = C13339u.f61331a;
                if (aVar.mo62377u()) {
                    throw aVar.mo62375n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo62377u()) {
                    e = aVar.mo62375n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo62377u();
            }
        }

        public void flush() {
            C11173a aVar = this.f54086a;
            C11210w wVar = this.f54087c;
            aVar.mo62376t();
            try {
                wVar.flush();
                C13339u uVar = C13339u.f61331a;
                if (aVar.mo62377u()) {
                    throw aVar.mo62375n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo62377u()) {
                    e = aVar.mo62375n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo62377u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f54087c + ')';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo71668d2 = {"cd/a$d", "Lcd/y;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "close", "Lcd/a;", "b", "", "toString", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.a$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C11177d implements C11212y {

        /* renamed from: a */
        final /* synthetic */ C11173a f54088a;

        /* renamed from: c */
        final /* synthetic */ C11212y f54089c;

        C11177d(C11173a aVar, C11212y yVar) {
            this.f54088a = aVar;
            this.f54089c = yVar;
        }

        /* renamed from: b */
        public C11173a mo62393q() {
            return this.f54088a;
        }

        public void close() {
            C11173a aVar = this.f54088a;
            C11212y yVar = this.f54089c;
            aVar.mo62376t();
            try {
                yVar.close();
                C13339u uVar = C13339u.f61331a;
                if (aVar.mo62377u()) {
                    throw aVar.mo62375n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo62377u()) {
                    e = aVar.mo62375n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo62377u();
            }
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "sink");
            C11173a aVar = this.f54088a;
            C11212y yVar = this.f54089c;
            aVar.mo62376t();
            try {
                long m0 = yVar.mo62392m0(bVar, j);
                if (!aVar.mo62377u()) {
                    return m0;
                }
                throw aVar.mo62375n((IOException) null);
            } catch (IOException e) {
                e = e;
                if (aVar.mo62377u()) {
                    e = aVar.mo62375n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo62377u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f54089c + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f54080j = millis;
        f54081k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final long m74988w(long j) {
        return this.f54085h - j;
    }

    /* renamed from: n */
    public final IOException mo62375n(IOException iOException) {
        return mo62378v(iOException);
    }

    /* renamed from: t */
    public final void mo62376t() {
        long h = mo62569h();
        boolean e = mo62524e();
        if (h != 0 || e) {
            f54079i.m74999e(this, h, e);
        }
    }

    /* renamed from: u */
    public final boolean mo62377u() {
        return f54079i.m74998d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public IOException mo62378v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: x */
    public final C11210w mo62379x(C11210w wVar) {
        C13706o.m87929f(wVar, "sink");
        return new C11176c(this, wVar);
    }

    /* renamed from: y */
    public final C11212y mo62380y(C11212y yVar) {
        C13706o.m87929f(yVar, "source");
        return new C11177d(this, yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo62381z() {
    }
}
