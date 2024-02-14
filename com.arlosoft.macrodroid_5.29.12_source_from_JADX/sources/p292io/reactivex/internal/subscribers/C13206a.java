package p292io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15739d;
import p414v9.C16733g;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.subscribers.a */
/* compiled from: LambdaSubscriber */
public final class C13206a<T> extends AtomicReference<C15739d> implements C16733g<T>, C15739d, C17071b {
    private static final long serialVersionUID = -7251123623727029452L;
    final C11110a onComplete;
    final C11113d<? super Throwable> onError;
    final C11113d<? super T> onNext;
    final C11113d<? super C15739d> onSubscribe;

    public C13206a(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11113d<? super C15739d> dVar3) {
        this.onNext = dVar;
        this.onError = dVar2;
        this.onComplete = aVar;
        this.onSubscribe = dVar3;
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        if (C13213f.m85528i(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C11078a.m74639b(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    public void cancel() {
        C13213f.m85523b(this);
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return get() == C13213f.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        C13213f fVar = C13213f.CANCELLED;
        if (obj != fVar) {
            lazySet(fVar);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        C13213f fVar = C13213f.CANCELLED;
        if (obj != fVar) {
            lazySet(fVar);
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
                ((C15739d) get()).cancel();
                onError(th);
            }
        }
    }

    public void request(long j) {
        ((C15739d) get()).request(j);
    }
}
