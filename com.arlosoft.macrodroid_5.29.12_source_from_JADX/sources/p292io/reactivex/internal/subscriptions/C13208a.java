package p292io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p251ea.C12182f;

/* renamed from: io.reactivex.internal.subscriptions.a */
/* compiled from: BasicIntQueueSubscription */
public abstract class C13208a<T> extends AtomicInteger implements C12182f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
