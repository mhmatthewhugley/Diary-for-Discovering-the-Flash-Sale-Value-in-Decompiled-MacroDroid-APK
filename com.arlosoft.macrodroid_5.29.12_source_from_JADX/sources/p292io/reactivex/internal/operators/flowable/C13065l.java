package p292io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15737b;
import p329me.C15739d;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.l */
/* compiled from: FlowableRepeatWhen */
final class C13065l<T, U> extends AtomicInteger implements C16733g<Object>, C15739d {
    private static final long serialVersionUID = 2827772011130406689L;
    final AtomicLong requested = new AtomicLong();
    final C15737b<T> source;
    C13066m<T, U> subscriber;
    final AtomicReference<C15739d> upstream = new AtomicReference<>();

    C13065l(C15737b<T> bVar) {
        this.source = bVar;
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        C13213f.m85525e(this.upstream, this.requested, dVar);
    }

    public void cancel() {
        C13213f.m85523b(this.upstream);
    }

    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th);
    }

    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.upstream.get() != C13213f.CANCELLED) {
                this.source.mo75177b(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void request(long j) {
        C13213f.m85524d(this.upstream, this.requested, j);
    }
}
