package p292io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.h */
/* compiled from: LambdaObserver */
public final class C13025h<T> extends AtomicReference<C17071b> implements C16741n<T>, C17071b {
    private static final long serialVersionUID = -7251123623727029452L;
    final C11110a onComplete;
    final C11113d<? super Throwable> onError;
    final C11113d<? super T> onNext;
    final C11113d<? super C17071b> onSubscribe;

    public C13025h(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11113d<? super C17071b> dVar3) {
        this.onNext = dVar;
        this.onError = dVar2;
        this.onComplete = aVar;
        this.onSubscribe = dVar3;
    }

    public void dispose() {
        C11163b.m74926b(this);
    }

    public boolean isDisposed() {
        return get() == C11163b.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(C11163b.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C11163b.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                C12251a.m82985p(new CompositeException(th, th2));
            }
        } else {
            C12251a.m82985p(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C11078a.m74639b(th);
                ((C17071b) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C17071b bVar) {
        if (C11163b.m74930g(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C11078a.m74639b(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
