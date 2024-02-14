package p431x8;

/* renamed from: x8.h */
/* compiled from: PendingPostQueue */
final class C16865h {

    /* renamed from: a */
    private C16864g f68101a;

    /* renamed from: b */
    private C16864g f68102b;

    C16865h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo80028a(C16864g gVar) {
        if (gVar != null) {
            try {
                C16864g gVar2 = this.f68102b;
                if (gVar2 != null) {
                    gVar2.f68100c = gVar;
                    this.f68102b = gVar;
                } else if (this.f68101a == null) {
                    this.f68102b = gVar;
                    this.f68101a = gVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C16864g mo80029b() {
        C16864g gVar;
        gVar = this.f68101a;
        if (gVar != null) {
            C16864g gVar2 = gVar.f68100c;
            this.f68101a = gVar2;
            if (gVar2 == null) {
                this.f68102b = null;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C16864g mo80030c(int i) throws InterruptedException {
        if (this.f68101a == null) {
            wait((long) i);
        }
        return mo80029b();
    }
}
