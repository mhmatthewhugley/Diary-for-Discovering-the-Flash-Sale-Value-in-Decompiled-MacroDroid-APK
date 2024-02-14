package p431x8;

import android.util.Log;

/* renamed from: x8.b */
/* compiled from: BackgroundPoster */
final class C16856b implements Runnable {

    /* renamed from: a */
    private final C16865h f68053a = new C16865h();

    /* renamed from: c */
    private final C16857c f68054c;

    /* renamed from: d */
    private volatile boolean f68055d;

    C16856b(C16857c cVar) {
        this.f68054c = cVar;
    }

    /* renamed from: a */
    public void mo80012a(C16869l lVar, Object obj) {
        C16864g a = C16864g.m99914a(lVar, obj);
        synchronized (this) {
            this.f68053a.mo80028a(a);
            if (!this.f68055d) {
                this.f68055d = true;
                this.f68054c.mo80014c().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C16864g c = this.f68053a.mo80030c(1000);
                if (c == null) {
                    synchronized (this) {
                        c = this.f68053a.mo80029b();
                        if (c == null) {
                            this.f68055d = false;
                            this.f68055d = false;
                            return;
                        }
                    }
                }
                this.f68054c.mo80015e(c);
            } catch (InterruptedException e) {
                try {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.f68055d = false;
                }
            }
        }
    }
}
