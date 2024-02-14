package p292io.reactivex.internal.operators.observable;

import java.util.Iterator;
import p209aa.C11078a;
import p223ca.C11164c;
import p241da.C11984b;
import p292io.reactivex.internal.observers.C13020c;
import p414v9.C16735i;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.o */
/* compiled from: ObservableFromIterable */
public final class C13136o<T> extends C16735i<T> {

    /* renamed from: a */
    final Iterable<? extends T> f60957a;

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    /* compiled from: ObservableFromIterable */
    static final class C13137a<T> extends C13020c<T> {

        /* renamed from: a */
        final C16741n<? super T> f60958a;

        /* renamed from: c */
        final Iterator<? extends T> f60959c;

        /* renamed from: d */
        volatile boolean f60960d;

        /* renamed from: f */
        boolean f60961f;

        /* renamed from: g */
        boolean f60962g;

        /* renamed from: o */
        boolean f60963o;

        C13137a(C16741n<? super T> nVar, Iterator<? extends T> it) {
            this.f60958a = nVar;
            this.f60959c = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69971a() {
            while (!isDisposed()) {
                try {
                    this.f60958a.onNext(C11984b.m82367d(this.f60959c.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f60959c.hasNext()) {
                                if (!isDisposed()) {
                                    this.f60958a.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C11078a.m74639b(th);
                            this.f60958a.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C11078a.m74639b(th2);
                    this.f60958a.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f60962g = true;
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f60961f = true;
            return 1;
        }

        public void dispose() {
            this.f60960d = true;
        }

        public boolean isDisposed() {
            return this.f60960d;
        }

        public boolean isEmpty() {
            return this.f60962g;
        }

        public T poll() {
            if (this.f60962g) {
                return null;
            }
            if (!this.f60963o) {
                this.f60963o = true;
            } else if (!this.f60959c.hasNext()) {
                this.f60962g = true;
                return null;
            }
            return C11984b.m82367d(this.f60959c.next(), "The iterator returned a null value");
        }
    }

    public C13136o(Iterable<? extends T> iterable) {
        this.f60957a = iterable;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        try {
            Iterator<? extends T> it = this.f60957a.iterator();
            try {
                if (!it.hasNext()) {
                    C11164c.m74934e(nVar);
                    return;
                }
                C13137a aVar = new C13137a(nVar, it);
                nVar.onSubscribe(aVar);
                if (!aVar.f60961f) {
                    aVar.mo69971a();
                }
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C11164c.m74936g(th, nVar);
            }
        } catch (Throwable th2) {
            C11078a.m74639b(th2);
            C11164c.m74936g(th2, nVar);
        }
    }
}
