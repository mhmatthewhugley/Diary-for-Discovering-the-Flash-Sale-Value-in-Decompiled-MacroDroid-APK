package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11164c;
import p241da.C11984b;
import p251ea.C12180d;
import p262fa.C12251a;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.y */
/* compiled from: ObservableScalarXMap */
public final class C13154y {

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    /* compiled from: ObservableScalarXMap */
    public static final class C13155a<T> extends AtomicInteger implements C12180d<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final C16741n<? super T> observer;
        final T value;

        public C13155a(C16741n<? super T> nVar, T t) {
            this.observer = nVar;
            this.value = t;
        }

        public void clear() {
            lazySet(3);
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public void dispose() {
            set(3);
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.y$b */
    /* compiled from: ObservableScalarXMap */
    static final class C13156b<T, R> extends C16735i<R> {

        /* renamed from: a */
        final T f60990a;

        /* renamed from: c */
        final C11114e<? super T, ? extends C16739l<? extends R>> f60991c;

        C13156b(T t, C11114e<? super T, ? extends C16739l<? extends R>> eVar) {
            this.f60990a = t;
            this.f60991c = eVar;
        }

        /* renamed from: S */
        public void mo68827S(C16741n<? super R> nVar) {
            try {
                C16739l lVar = (C16739l) C11984b.m82367d(this.f60991c.apply(this.f60990a), "The mapper returned a null ObservableSource");
                if (lVar instanceof Callable) {
                    try {
                        Object call = ((Callable) lVar).call();
                        if (call == null) {
                            C11164c.m74934e(nVar);
                            return;
                        }
                        C13155a aVar = new C13155a(nVar, call);
                        nVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        C11164c.m74936g(th, nVar);
                    }
                } else {
                    lVar.mo79695a(nVar);
                }
            } catch (Throwable th2) {
                C11164c.m74936g(th2, nVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C16735i<U> m85414a(T t, C11114e<? super T, ? extends C16739l<? extends U>> eVar) {
        return C12251a.m82982m(new C13156b(t, eVar));
    }

    /* renamed from: b */
    public static <T, R> boolean m85415b(C16739l<T> lVar, C16741n<? super R> nVar, C11114e<? super T, ? extends C16739l<? extends R>> eVar) {
        if (!(lVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) lVar).call();
            if (call == null) {
                C11164c.m74934e(nVar);
                return true;
            }
            try {
                C16739l lVar2 = (C16739l) C11984b.m82367d(eVar.apply(call), "The mapper returned a null ObservableSource");
                if (lVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) lVar2).call();
                        if (call2 == null) {
                            C11164c.m74934e(nVar);
                            return true;
                        }
                        C13155a aVar = new C13155a(nVar, call2);
                        nVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        C11164c.m74936g(th, nVar);
                        return true;
                    }
                } else {
                    lVar2.mo79695a(nVar);
                }
                return true;
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                C11164c.m74936g(th2, nVar);
                return true;
            }
        } catch (Throwable th3) {
            C11078a.m74639b(th3);
            C11164c.m74936g(th3, nVar);
            return true;
        }
    }
}
