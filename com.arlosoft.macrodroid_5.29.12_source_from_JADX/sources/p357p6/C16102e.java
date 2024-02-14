package p357p6;

import com.koushikdutta.async.C11693a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: p6.e */
/* compiled from: SimpleFuture */
public class C16102e<T> extends C16100d implements C16098b {

    /* renamed from: g */
    C11693a f66066g;

    /* renamed from: o */
    Exception f66067o;

    /* renamed from: p */
    T f66068p;

    /* renamed from: s */
    boolean f66069s;

    /* renamed from: z */
    C16099c<T> f66070z;

    /* renamed from: e */
    private boolean m96718e(boolean z) {
        C16099c i;
        if (!super.cancel()) {
            return false;
        }
        synchronized (this) {
            this.f66067o = new CancellationException();
            mo78437j();
            i = m96721i();
            this.f66069s = z;
        }
        m96720h(i);
        return true;
    }

    /* renamed from: g */
    private T m96719g() throws ExecutionException {
        if (this.f66067o == null) {
            return this.f66068p;
        }
        throw new ExecutionException(this.f66067o);
    }

    /* renamed from: h */
    private void m96720h(C16099c<T> cVar) {
        if (cVar != null && !this.f66069s) {
            cVar.mo78427a(this.f66067o, this.f66068p);
        }
    }

    /* renamed from: i */
    private C16099c<T> m96721i() {
        C16099c<T> cVar = this.f66070z;
        this.f66070z = null;
        return cVar;
    }

    public boolean cancel(boolean z) {
        return cancel();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C11693a mo78434f() {
        if (this.f66066g == null) {
            this.f66066g = new C11693a();
        }
        return this.f66066g;
    }

    public T get() throws InterruptedException, ExecutionException {
        synchronized (this) {
            if (!isCancelled()) {
                if (!isDone()) {
                    C11693a f = mo78434f();
                    f.mo65745a();
                    return m96719g();
                }
            }
            T g = m96719g();
            return g;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo78437j() {
        C11693a aVar = this.f66066g;
        if (aVar != null) {
            aVar.mo65746b();
            this.f66066g = null;
        }
    }

    /* renamed from: k */
    public boolean mo78438k(Exception exc) {
        return mo78439l(exc, (Object) null);
    }

    /* renamed from: l */
    public boolean mo78439l(Exception exc, T t) {
        synchronized (this) {
            if (!super.mo78431d()) {
                return false;
            }
            this.f66068p = t;
            this.f66067o = exc;
            mo78437j();
            C16099c i = m96721i();
            m96720h(i);
            return true;
        }
    }

    public boolean cancel() {
        return m96718e(this.f66069s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0.mo65747c(r2, r4) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return m96719g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        throw new java.util.concurrent.TimeoutException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1.isDone()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            com.koushikdutta.async.a r0 = r1.mo78434f()     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            boolean r2 = r0.mo65747c(r2, r4)
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.m96719g()
            return r2
        L_0x001e:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            r2.<init>()
            throw r2
        L_0x0024:
            java.lang.Object r2 = r1.m96719g()     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return r2
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p357p6.C16102e.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
