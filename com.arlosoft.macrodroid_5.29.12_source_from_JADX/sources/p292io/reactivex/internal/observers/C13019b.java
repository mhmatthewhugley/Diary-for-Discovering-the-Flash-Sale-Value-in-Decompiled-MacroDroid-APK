package p292io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import p251ea.C12180d;

/* renamed from: io.reactivex.internal.observers.b */
/* compiled from: BasicIntQueueDisposable */
public abstract class C13019b<T> extends AtomicInteger implements C12180d<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
