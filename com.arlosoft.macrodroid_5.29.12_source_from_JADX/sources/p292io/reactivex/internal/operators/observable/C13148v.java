package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p223ca.C11163b;
import p251ea.C12180d;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.internal.observers.C13019b;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.schedulers.C13201m;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.v */
/* compiled from: ObservableObserveOn */
public final class C13148v<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C16742o f60977c;

    /* renamed from: d */
    final boolean f60978d;

    /* renamed from: f */
    final int f60979f;

    /* renamed from: io.reactivex.internal.operators.observable.v$a */
    /* compiled from: ObservableObserveOn */
    static final class C13149a<T> extends C13019b<T> implements C16741n<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final C16741n<? super T> downstream;
        Throwable error;
        boolean outputFused;
        C12185i<T> queue;
        int sourceMode;
        C17071b upstream;
        final C16742o.C16745c worker;

        C13149a(C16741n<? super T> nVar, C16742o.C16745c cVar, boolean z, int i) {
            this.downstream = nVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo69974a(boolean z, boolean z2, C16741n<? super T> nVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        nVar.onError(th);
                    } else {
                        nVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    nVar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    nVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo69975c() {
            int i = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (this.delayError || !z || th == null) {
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
                        } else {
                            this.downstream.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo69976e() {
            C12185i<T> iVar = this.queue;
            C16741n<? super T> nVar = this.downstream;
            int i = 1;
            while (!mo69974a(this.done, iVar.isEmpty(), nVar)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!mo69974a(z, z2, nVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                nVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        iVar.clear();
                        nVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69977f() {
            if (getAndIncrement() == 0) {
                this.worker.mo69996b(this);
            }
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                mo69977f();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.error = th;
            this.done = true;
            mo69977f();
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                mo69977f();
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof C12180d) {
                    C12180d dVar = (C12180d) bVar;
                    int d = dVar.mo62364d(7);
                    if (d == 1) {
                        this.sourceMode = d;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        mo69977f();
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

        public T poll() throws Exception {
            return this.queue.poll();
        }

        public void run() {
            if (this.outputFused) {
                mo69975c();
            } else {
                mo69976e();
            }
        }
    }

    public C13148v(C16739l<T> lVar, C16742o oVar, boolean z, int i) {
        super(lVar);
        this.f60977c = oVar;
        this.f60978d = z;
        this.f60979f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C16742o oVar = this.f60977c;
        if (oVar instanceof C13201m) {
            this.f60853a.mo79695a(nVar);
            return;
        }
        this.f60853a.mo79695a(new C13149a(nVar, oVar.mo69992a(), this.f60978d, this.f60979f));
    }
}
