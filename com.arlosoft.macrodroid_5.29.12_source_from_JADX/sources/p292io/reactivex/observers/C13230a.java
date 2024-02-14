package p292io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p292io.reactivex.internal.util.C13219e;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.observers.a */
/* compiled from: DisposableObserver */
public abstract class C13230a<T> implements C16741n<T>, C17071b {
    final AtomicReference<C17071b> upstream = new AtomicReference<>();

    public final void dispose() {
        C11163b.m74926b(this.upstream);
    }

    public final boolean isDisposed() {
        return this.upstream.get() == C11163b.DISPOSED;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(C17071b bVar) {
        if (C13219e.m85546c(this.upstream, bVar, getClass())) {
            onStart();
        }
    }
}
