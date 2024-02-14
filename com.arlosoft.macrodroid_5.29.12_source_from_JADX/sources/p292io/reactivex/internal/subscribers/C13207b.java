package p292io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13217c;
import p292io.reactivex.internal.util.C13223h;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.subscribers.b */
/* compiled from: StrictSubscriber */
public class C13207b<T> extends AtomicInteger implements C16733g<T>, C15739d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final C15738c<? super T> downstream;
    final C13217c error = new C13217c();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<C15739d> upstream = new AtomicReference<>();

    public C13207b(C15738c<? super T> cVar) {
        this.downstream = cVar;
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.mo68760a(this);
            C13213f.m85525e(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void cancel() {
        if (!this.done) {
            C13213f.m85523b(this.upstream);
        }
    }

    public void onComplete() {
        this.done = true;
        C13223h.m85551a(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        C13223h.m85552b(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C13223h.m85553c(this.downstream, t, this, this.error);
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C13213f.m85524d(this.upstream, this.requested, j);
    }
}
