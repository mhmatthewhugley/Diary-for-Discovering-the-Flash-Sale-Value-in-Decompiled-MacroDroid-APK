package p448z9;

import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;

/* renamed from: z9.d */
/* compiled from: ReferenceDisposable */
abstract class C17073d<T> extends AtomicReference<T> implements C17071b {
    private static final long serialVersionUID = 6537757548749041217L;

    C17073d(T t) {
        super(C11984b.m82367d(t, "value is null"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo80339a(T t);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo80339a(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
