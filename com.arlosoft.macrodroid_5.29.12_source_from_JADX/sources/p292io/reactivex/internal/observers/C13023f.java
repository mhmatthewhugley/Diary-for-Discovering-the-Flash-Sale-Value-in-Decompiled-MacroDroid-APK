package p292io.reactivex.internal.observers;

import p262fa.C12251a;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.observers.f */
/* compiled from: DeferredScalarDisposable */
public class C13023f<T> extends C13019b<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final C16741n<? super T> downstream;
    protected T value;

    public C13023f(C16741n<? super T> nVar) {
        this.downstream = nVar;
    }

    /* renamed from: a */
    public final void mo69892a(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C16741n<? super T> nVar = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                nVar.onNext(null);
            } else {
                lazySet(2);
                nVar.onNext(t);
            }
            if (get() != 4) {
                nVar.onComplete();
            }
        }
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    /* renamed from: d */
    public final int mo62364d(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    /* renamed from: s */
    public final void mo69893s(Throwable th) {
        if ((get() & 54) != 0) {
            C12251a.m82985p(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }
}
