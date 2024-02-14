package p357p6;

/* renamed from: p6.d */
/* compiled from: SimpleCancellable */
public class C16100d implements C16097a {

    /* renamed from: f */
    public static final C16097a f66062f = new C16101a();

    /* renamed from: a */
    boolean f66063a;

    /* renamed from: c */
    boolean f66064c;

    /* renamed from: d */
    private C16097a f66065d;

    /* renamed from: p6.d$a */
    /* compiled from: SimpleCancellable */
    static class C16101a extends C16100d {
        C16101a() {
            mo78431d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78428a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo78429b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo78430c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        mo78428a();
        mo78429b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f66063a     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            return r0
        L_0x0008:
            boolean r0 = r3.f66064c     // Catch:{ all -> 0x0023 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            return r1
        L_0x000f:
            r3.f66064c = r1     // Catch:{ all -> 0x0023 }
            p6.a r0 = r3.f66065d     // Catch:{ all -> 0x0023 }
            r2 = 0
            r3.f66065d = r2     // Catch:{ all -> 0x0023 }
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001c
            r0.cancel()
        L_0x001c:
            r3.mo78428a()
            r3.mo78429b()
            return r1
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p357p6.C16100d.cancel():boolean");
    }

    /* renamed from: d */
    public boolean mo78431d() {
        synchronized (this) {
            if (this.f66064c) {
                return false;
            }
            if (this.f66063a) {
                return true;
            }
            this.f66063a = true;
            this.f66065d = null;
            mo78430c();
            mo78429b();
            return true;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this) {
            if (!this.f66064c) {
                C16097a aVar = this.f66065d;
                if (aVar == null || !aVar.isCancelled()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean isDone() {
        return this.f66063a;
    }
}
