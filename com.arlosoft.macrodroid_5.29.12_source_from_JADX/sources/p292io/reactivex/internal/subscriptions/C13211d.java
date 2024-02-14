package p292io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p251ea.C12182f;
import p329me.C15738c;

/* renamed from: io.reactivex.internal.subscriptions.d */
/* compiled from: ScalarSubscription */
public final class C13211d<T> extends AtomicInteger implements C12182f<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final C15738c<? super T> subscriber;
    final T value;

    public C13211d(C15738c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    /* renamed from: d */
    public int mo62364d(int i) {
        return i & 1;
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public void request(long j) {
        if (C13213f.m85529j(j) && compareAndSet(0, 1)) {
            C15738c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }
}
