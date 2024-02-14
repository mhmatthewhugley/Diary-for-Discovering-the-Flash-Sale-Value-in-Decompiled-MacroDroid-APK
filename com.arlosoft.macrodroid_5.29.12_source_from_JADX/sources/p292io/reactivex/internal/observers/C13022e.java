package p292io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11113d;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16748q;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.e */
/* compiled from: ConsumerSingleObserver */
public final class C13022e<T> extends AtomicReference<C17071b> implements C16748q<T>, C17071b {
    private static final long serialVersionUID = -7012088219455310787L;
    final C11113d<? super Throwable> onError;
    final C11113d<? super T> onSuccess;

    public C13022e(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2) {
        this.onSuccess = dVar;
        this.onError = dVar2;
    }

    /* renamed from: b */
    public void mo69889b(T t) {
        lazySet(C11163b.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C12251a.m82985p(th);
        }
    }

    public void dispose() {
        C11163b.m74926b(this);
    }

    public boolean isDisposed() {
        return get() == C11163b.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(C11163b.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C11078a.m74639b(th2);
            C12251a.m82985p(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C17071b bVar) {
        C11163b.m74930g(this, bVar);
    }
}
