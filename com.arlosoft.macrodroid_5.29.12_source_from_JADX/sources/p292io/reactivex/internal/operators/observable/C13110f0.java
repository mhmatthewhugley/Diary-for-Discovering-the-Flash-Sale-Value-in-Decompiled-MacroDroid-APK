package p292io.reactivex.internal.operators.observable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p223ca.C11166e;
import p262fa.C12251a;
import p292io.reactivex.internal.util.C13221g;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.f0 */
/* compiled from: ObservableTimeoutTimed */
public final class C13110f0<T> extends C13083a<T, T> {

    /* renamed from: c */
    final long f60903c;

    /* renamed from: d */
    final TimeUnit f60904d;

    /* renamed from: f */
    final C16742o f60905f;

    /* renamed from: g */
    final C16739l<? extends T> f60906g;

    /* renamed from: io.reactivex.internal.operators.observable.f0$a */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13111a<T> implements C16741n<T> {

        /* renamed from: a */
        final C16741n<? super T> f60907a;

        /* renamed from: c */
        final AtomicReference<C17071b> f60908c;

        C13111a(C16741n<? super T> nVar, AtomicReference<C17071b> atomicReference) {
            this.f60907a = nVar;
            this.f60908c = atomicReference;
        }

        public void onComplete() {
            this.f60907a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60907a.onError(th);
        }

        public void onNext(T t) {
            this.f60907a.onNext(t);
        }

        public void onSubscribe(C17071b bVar) {
            C11163b.m74928e(this.f60908c, bVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.f0$b */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13112b<T> extends AtomicReference<C17071b> implements C16741n<T>, C17071b, C13114d {
        private static final long serialVersionUID = 3764492702657003550L;
        final C16741n<? super T> downstream;
        C16739l<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final C11166e task = new C11166e();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<C17071b> upstream = new AtomicReference<>();
        final C16742o.C16745c worker;

        C13112b(C16741n<? super T> nVar, long j, TimeUnit timeUnit, C16742o.C16745c cVar, C16739l<? extends T> lVar) {
            this.downstream = nVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = lVar;
        }

        /* renamed from: a */
        public void mo69953a(long j) {
            if (this.index.compareAndSet(j, LocationRequestCompat.PASSIVE_INTERVAL)) {
                C11163b.m74926b(this.upstream);
                C16739l<? extends T> lVar = this.fallback;
                this.fallback = null;
                lVar.mo79695a(new C13111a(this.downstream, this));
                this.worker.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69954b(long j) {
            this.task.mo62369a(this.worker.mo69997c(new C13115e(j, this), this.timeout, this.unit));
        }

        public void dispose() {
            C11163b.m74926b(this.upstream);
            C11163b.m74926b(this);
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onComplete() {
            if (this.index.getAndSet(LocationRequestCompat.PASSIVE_INTERVAL) != LocationRequestCompat.PASSIVE_INTERVAL) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.index.getAndSet(LocationRequestCompat.PASSIVE_INTERVAL) != LocationRequestCompat.PASSIVE_INTERVAL) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            C12251a.m82985p(th);
        }

        public void onNext(T t) {
            long j = this.index.get();
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    ((C17071b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    mo69954b(j2);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            C11163b.m74930g(this.upstream, bVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.f0$c */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13113c<T> extends AtomicLong implements C16741n<T>, C17071b, C13114d {
        private static final long serialVersionUID = 3764492702657003550L;
        final C16741n<? super T> downstream;
        final C11166e task = new C11166e();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<C17071b> upstream = new AtomicReference<>();
        final C16742o.C16745c worker;

        C13113c(C16741n<? super T> nVar, long j, TimeUnit timeUnit, C16742o.C16745c cVar) {
            this.downstream = nVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        /* renamed from: a */
        public void mo69953a(long j) {
            if (compareAndSet(j, LocationRequestCompat.PASSIVE_INTERVAL)) {
                C11163b.m74926b(this.upstream);
                this.downstream.onError(new TimeoutException(C13221g.m85549c(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69955b(long j) {
            this.task.mo62369a(this.worker.mo69997c(new C13115e(j, this), this.timeout, this.unit));
        }

        public void dispose() {
            C11163b.m74926b(this.upstream);
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return C11163b.m74927d(this.upstream.get());
        }

        public void onComplete() {
            if (getAndSet(LocationRequestCompat.PASSIVE_INTERVAL) != LocationRequestCompat.PASSIVE_INTERVAL) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(LocationRequestCompat.PASSIVE_INTERVAL) != LocationRequestCompat.PASSIVE_INTERVAL) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            C12251a.m82985p(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((C17071b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    mo69955b(j2);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            C11163b.m74930g(this.upstream, bVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.f0$d */
    /* compiled from: ObservableTimeoutTimed */
    interface C13114d {
        /* renamed from: a */
        void mo69953a(long j);
    }

    /* renamed from: io.reactivex.internal.operators.observable.f0$e */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13115e implements Runnable {

        /* renamed from: a */
        final C13114d f60909a;

        /* renamed from: c */
        final long f60910c;

        C13115e(long j, C13114d dVar) {
            this.f60910c = j;
            this.f60909a = dVar;
        }

        public void run() {
            this.f60909a.mo69953a(this.f60910c);
        }
    }

    public C13110f0(C16735i<T> iVar, long j, TimeUnit timeUnit, C16742o oVar, C16739l<? extends T> lVar) {
        super(iVar);
        this.f60903c = j;
        this.f60904d = timeUnit;
        this.f60905f = oVar;
        this.f60906g = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        if (this.f60906g == null) {
            C13113c cVar = new C13113c(nVar, this.f60903c, this.f60904d, this.f60905f.mo69992a());
            nVar.onSubscribe(cVar);
            cVar.mo69955b(0);
            this.f60853a.mo79695a(cVar);
            return;
        }
        C13112b bVar = new C13112b(nVar, this.f60903c, this.f60904d, this.f60905f.mo69992a(), this.f60906g);
        nVar.onSubscribe(bVar);
        bVar.mo69954b(0);
        this.f60853a.mo79695a(bVar);
    }
}
