package p292io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.OnErrorNotImplementedException;
import p414v9.C16729c;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.d */
/* compiled from: CallbackCompletableObserver */
public final class C13021d extends AtomicReference<C17071b> implements C16729c, C17071b, C11113d<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final C11110a onComplete;
    final C11113d<? super Throwable> onError;

    public C13021d(C11113d<? super Throwable> dVar, C11110a aVar) {
        this.onError = dVar;
        this.onComplete = aVar;
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        C12251a.m82985p(new OnErrorNotImplementedException(th));
    }

    public void dispose() {
        C11163b.m74926b(this);
    }

    public boolean isDisposed() {
        return get() == C11163b.DISPOSED;
    }

    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C12251a.m82985p(th);
        }
        lazySet(C11163b.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C11078a.m74639b(th2);
            C12251a.m82985p(th2);
        }
        lazySet(C11163b.DISPOSED);
    }

    public void onSubscribe(C17071b bVar) {
        C11163b.m74930g(this, bVar);
    }
}
