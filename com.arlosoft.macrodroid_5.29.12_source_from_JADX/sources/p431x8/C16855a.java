package p431x8;

/* renamed from: x8.a */
/* compiled from: AsyncPoster */
class C16855a implements Runnable {

    /* renamed from: a */
    private final C16865h f68051a = new C16865h();

    /* renamed from: c */
    private final C16857c f68052c;

    C16855a(C16857c cVar) {
        this.f68052c = cVar;
    }

    /* renamed from: a */
    public void mo80010a(C16869l lVar, Object obj) {
        this.f68051a.mo80028a(C16864g.m99914a(lVar, obj));
        this.f68052c.mo80014c().execute(this);
    }

    public void run() {
        C16864g b = this.f68051a.mo80029b();
        if (b != null) {
            this.f68052c.mo80015e(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
