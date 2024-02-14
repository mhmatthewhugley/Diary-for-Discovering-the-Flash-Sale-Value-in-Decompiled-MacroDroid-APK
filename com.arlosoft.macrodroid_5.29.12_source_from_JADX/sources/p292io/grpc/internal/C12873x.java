package p292io.grpc.internal;

import p292io.grpc.C12952q;

/* renamed from: io.grpc.internal.x */
/* compiled from: ContextRunnable */
abstract class C12873x implements Runnable {

    /* renamed from: a */
    private final C12952q f60378a;

    public C12873x(C12952q qVar) {
        this.f60378a = qVar;
    }

    /* renamed from: a */
    public abstract void mo69504a();

    public final void run() {
        C12952q c = this.f60378a.mo69748c();
        try {
            mo69504a();
        } finally {
            this.f60378a.mo69751j(c);
        }
    }
}
