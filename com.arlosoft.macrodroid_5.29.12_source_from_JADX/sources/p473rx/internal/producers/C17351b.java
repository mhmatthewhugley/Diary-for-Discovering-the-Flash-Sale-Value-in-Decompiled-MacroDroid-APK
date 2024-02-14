package p473rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import p459ef.C17157e;
import p459ef.C17162h;
import p463if.C17175a;

/* renamed from: rx.internal.producers.b */
/* compiled from: SingleProducer */
public final class C17351b<T> extends AtomicBoolean implements C17157e {
    private static final long serialVersionUID = -3353584923995471404L;
    final C17162h<? super T> child;
    final T value;

    public C17351b(C17162h<? super T> hVar, T t) {
        this.child = hVar;
        this.value = t;
    }

    public void request(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (i != 0 && compareAndSet(false, true)) {
            C17162h<? super T> hVar = this.child;
            if (!hVar.mo80449b()) {
                T t = this.value;
                try {
                    hVar.onNext(t);
                    if (!hVar.mo80449b()) {
                        hVar.onCompleted();
                    }
                } catch (Throwable th) {
                    C17175a.m100686f(th, hVar, t);
                }
            }
        }
    }
}
