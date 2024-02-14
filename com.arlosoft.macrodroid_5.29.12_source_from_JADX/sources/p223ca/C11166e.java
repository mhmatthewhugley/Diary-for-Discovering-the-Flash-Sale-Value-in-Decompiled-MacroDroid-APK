package p223ca;

import java.util.concurrent.atomic.AtomicReference;
import p448z9.C17071b;

/* renamed from: ca.e */
/* compiled from: SequentialDisposable */
public final class C11166e extends AtomicReference<C17071b> implements C17071b {
    private static final long serialVersionUID = -754898800686245608L;

    public C11166e() {
    }

    /* renamed from: a */
    public boolean mo62369a(C17071b bVar) {
        return C11163b.m74928e(this, bVar);
    }

    public void dispose() {
        C11163b.m74926b(this);
    }

    public boolean isDisposed() {
        return C11163b.m74927d((C17071b) get());
    }

    public C11166e(C17071b bVar) {
        lazySet(bVar);
    }
}
