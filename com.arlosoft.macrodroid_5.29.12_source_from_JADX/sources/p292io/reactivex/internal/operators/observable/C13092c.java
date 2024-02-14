package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11163b;
import p241da.C11984b;
import p251ea.C12180d;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.util.C13217c;
import p292io.reactivex.internal.util.C13220f;
import p292io.reactivex.observers.C13231b;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.c */
/* compiled from: ObservableConcatMap */
public final class C13092c<T, U> extends C13083a<T, U> {

    /* renamed from: c */
    final C11114e<? super T, ? extends C16739l<? extends U>> f60873c;

    /* renamed from: d */
    final int f60874d;

    /* renamed from: f */
    final C13220f f60875f;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    /* compiled from: ObservableConcatMap */
    static final class C13093a<T, R> extends AtomicInteger implements C16741n<T>, C17071b {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final C16741n<? super R> downstream;
        final C13217c error = new C13217c();
        final C11114e<? super T, ? extends C16739l<? extends R>> mapper;
        final C13094a<R> observer;
        C12185i<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        C17071b upstream;

        /* renamed from: io.reactivex.internal.operators.observable.c$a$a */
        /* compiled from: ObservableConcatMap */
        static final class C13094a<R> extends AtomicReference<C17071b> implements C16741n<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final C16741n<? super R> downstream;
            final C13093a<?, R> parent;

            C13094a(C16741n<? super R> nVar, C13093a<?, R> aVar) {
                this.downstream = nVar;
                this.parent = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo69939a() {
                C11163b.m74926b(this);
            }

            public void onComplete() {
                C13093a<?, R> aVar = this.parent;
                aVar.active = false;
                aVar.mo69938a();
            }

            public void onError(Throwable th) {
                C13093a<?, R> aVar = this.parent;
                if (aVar.error.mo70047a(th)) {
                    if (!aVar.tillTheEnd) {
                        aVar.upstream.dispose();
                    }
                    aVar.active = false;
                    aVar.mo69938a();
                    return;
                }
                C12251a.m82985p(th);
            }

            public void onNext(R r) {
                this.downstream.onNext(r);
            }

            public void onSubscribe(C17071b bVar) {
                C11163b.m74928e(this, bVar);
            }
        }

        C13093a(C16741n<? super R> nVar, C11114e<? super T, ? extends C16739l<? extends R>> eVar, int i, boolean z) {
            this.downstream = nVar;
            this.mapper = eVar;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new C13094a<>(nVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69938a() {
            if (getAndIncrement() == 0) {
                C16741n<? super R> nVar = this.downstream;
                C12185i<T> iVar = this.queue;
                C13217c cVar = this.error;
                while (true) {
                    if (!this.active) {
                        if (this.cancelled) {
                            iVar.clear();
                            return;
                        } else if (this.tillTheEnd || ((Throwable) cVar.get()) == null) {
                            boolean z = this.done;
                            try {
                                T poll = iVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.cancelled = true;
                                    Throwable b = cVar.mo70048b();
                                    if (b != null) {
                                        nVar.onError(b);
                                        return;
                                    } else {
                                        nVar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        C16739l lVar = (C16739l) C11984b.m82367d(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                        if (lVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) lVar).call();
                                                if (call != null && !this.cancelled) {
                                                    nVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C11078a.m74639b(th);
                                                cVar.mo70047a(th);
                                            }
                                        } else {
                                            this.active = true;
                                            lVar.mo79695a(this.observer);
                                        }
                                    } catch (Throwable th2) {
                                        C11078a.m74639b(th2);
                                        this.cancelled = true;
                                        this.upstream.dispose();
                                        iVar.clear();
                                        cVar.mo70047a(th2);
                                        nVar.onError(cVar.mo70048b());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C11078a.m74639b(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                cVar.mo70047a(th3);
                                nVar.onError(cVar.mo70048b());
                                return;
                            }
                        } else {
                            iVar.clear();
                            this.cancelled = true;
                            nVar.onError(cVar.mo70048b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.mo69939a();
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public void onComplete() {
            this.done = true;
            mo69938a();
        }

        public void onError(Throwable th) {
            if (this.error.mo70047a(th)) {
                this.done = true;
                mo69938a();
                return;
            }
            C12251a.m82985p(th);
        }

        public void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            mo69938a();
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof C12180d) {
                    C12180d dVar = (C12180d) bVar;
                    int d = dVar.mo62364d(3);
                    if (d == 1) {
                        this.sourceMode = d;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        mo69938a();
                        return;
                    } else if (d == 2) {
                        this.sourceMode = d;
                        this.queue = dVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new C13178b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.c$b */
    /* compiled from: ObservableConcatMap */
    static final class C13095b<T, U> extends AtomicInteger implements C16741n<T>, C17071b {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final C16741n<? super U> downstream;
        int fusionMode;
        final C13096a<U> inner;
        final C11114e<? super T, ? extends C16739l<? extends U>> mapper;
        C12185i<T> queue;
        C17071b upstream;

        /* renamed from: io.reactivex.internal.operators.observable.c$b$a */
        /* compiled from: ObservableConcatMap */
        static final class C13096a<U> extends AtomicReference<C17071b> implements C16741n<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final C16741n<? super U> downstream;
            final C13095b<?, ?> parent;

            C13096a(C16741n<? super U> nVar, C13095b<?, ?> bVar) {
                this.downstream = nVar;
                this.parent = bVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo69942a() {
                C11163b.m74926b(this);
            }

            public void onComplete() {
                this.parent.mo69941b();
            }

            public void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            public void onNext(U u) {
                this.downstream.onNext(u);
            }

            public void onSubscribe(C17071b bVar) {
                C11163b.m74928e(this, bVar);
            }
        }

        C13095b(C16741n<? super U> nVar, C11114e<? super T, ? extends C16739l<? extends U>> eVar, int i) {
            this.downstream = nVar;
            this.mapper = eVar;
            this.bufferSize = i;
            this.inner = new C13096a<>(nVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69940a() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    C16739l lVar = (C16739l) C11984b.m82367d(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    lVar.mo79695a(this.inner);
                                } catch (Throwable th) {
                                    C11078a.m74639b(th);
                                    dispose();
                                    this.queue.clear();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C11078a.m74639b(th2);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69941b() {
            this.active = false;
            mo69940a();
        }

        public void dispose() {
            this.disposed = true;
            this.inner.mo69942a();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                mo69940a();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.offer(t);
                }
                mo69940a();
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof C12180d) {
                    C12180d dVar = (C12180d) bVar;
                    int d = dVar.mo62364d(3);
                    if (d == 1) {
                        this.fusionMode = d;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        mo69940a();
                        return;
                    } else if (d == 2) {
                        this.fusionMode = d;
                        this.queue = dVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new C13178b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13092c(C16739l<T> lVar, C11114e<? super T, ? extends C16739l<? extends U>> eVar, int i, C13220f fVar) {
        super(lVar);
        this.f60873c = eVar;
        this.f60875f = fVar;
        this.f60874d = Math.max(8, i);
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super U> nVar) {
        if (!C13154y.m85415b(this.f60853a, nVar, this.f60873c)) {
            if (this.f60875f == C13220f.IMMEDIATE) {
                this.f60853a.mo79695a(new C13095b(new C13231b(nVar), this.f60873c, this.f60874d));
            } else {
                this.f60853a.mo79695a(new C13093a(nVar, this.f60873c, this.f60874d, this.f60875f == C13220f.END));
            }
        }
    }
}
