package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11114e;
import p241da.C11984b;
import p251ea.C12182f;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.internal.queue.C13177a;
import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13217c;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15737b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.t */
/* compiled from: FlowableZip */
public final class C13080t<T, R> extends C16732f<R> {

    /* renamed from: c */
    final C15737b<? extends T>[] f60848c;

    /* renamed from: d */
    final Iterable<? extends C15737b<? extends T>> f60849d;

    /* renamed from: f */
    final C11114e<? super Object[], ? extends R> f60850f;

    /* renamed from: g */
    final int f60851g;

    /* renamed from: o */
    final boolean f60852o;

    /* renamed from: io.reactivex.internal.operators.flowable.t$a */
    /* compiled from: FlowableZip */
    static final class C13081a<T, R> extends AtomicInteger implements C15739d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final C15738c<? super R> downstream;
        final C13217c errors;
        final AtomicLong requested;
        final C13082b<T, R>[] subscribers;
        final C11114e<? super Object[], ? extends R> zipper;

        C13081a(C15738c<? super R> cVar, C11114e<? super Object[], ? extends R> eVar, int i, int i2, boolean z) {
            this.downstream = cVar;
            this.zipper = eVar;
            this.delayErrors = z;
            C13082b<T, R>[] bVarArr = new C13082b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C13082b<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = bVarArr;
            this.requested = new AtomicLong();
            this.errors = new C13217c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69931a() {
            for (C13082b<T, R> cancel : this.subscribers) {
                cancel.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69932b() {
            int i;
            if (getAndIncrement() == 0) {
                C15738c<? super R> cVar = this.downstream;
                C13082b<T, R>[] bVarArr = this.subscribers;
                int length = bVarArr.length;
                Object[] objArr = this.current;
                int i2 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                boolean z = false;
                                for (int i3 = 0; i3 < length; i3++) {
                                    C13082b<T, R> bVar = bVarArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z2 = bVar.done;
                                            C12185i<T> iVar = bVar.queue;
                                            T poll = iVar != null ? iVar.poll() : null;
                                            boolean z3 = poll == null;
                                            if (!z2 || !z3) {
                                                if (!z3) {
                                                    objArr[i3] = poll;
                                                }
                                                z = true;
                                            } else {
                                                mo69931a();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    cVar.onError(this.errors.mo70048b());
                                                    return;
                                                } else {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C11078a.m74639b(th);
                                            this.errors.mo70047a(th);
                                            if (!this.delayErrors) {
                                                mo69931a();
                                                cVar.onError(this.errors.mo70048b());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                try {
                                    cVar.onNext(C11984b.m82367d(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, (Object) null);
                                } catch (Throwable th2) {
                                    C11078a.m74639b(th2);
                                    mo69931a();
                                    this.errors.mo70047a(th2);
                                    cVar.onError(this.errors.mo70048b());
                                    return;
                                }
                            } else {
                                mo69931a();
                                cVar.onError(this.errors.mo70048b());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (i == 0) {
                        if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                for (int i4 = 0; i4 < length; i4++) {
                                    C13082b<T, R> bVar2 = bVarArr[i4];
                                    if (objArr[i4] == null) {
                                        try {
                                            boolean z4 = bVar2.done;
                                            C12185i<T> iVar2 = bVar2.queue;
                                            T poll2 = iVar2 != null ? iVar2.poll() : null;
                                            boolean z5 = poll2 == null;
                                            if (z4 && z5) {
                                                mo69931a();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    cVar.onError(this.errors.mo70048b());
                                                    return;
                                                } else {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            } else if (!z5) {
                                                objArr[i4] = poll2;
                                            }
                                        } catch (Throwable th3) {
                                            C11078a.m74639b(th3);
                                            this.errors.mo70047a(th3);
                                            if (!this.delayErrors) {
                                                mo69931a();
                                                cVar.onError(this.errors.mo70048b());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                mo69931a();
                                cVar.onError(this.errors.mo70048b());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (C13082b<T, R> request : bVarArr) {
                            request.request(j2);
                        }
                        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo69933c(C13082b<T, R> bVar, Throwable th) {
            if (this.errors.mo70047a(th)) {
                bVar.done = true;
                mo69932b();
                return;
            }
            C12251a.m82985p(th);
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                mo69931a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo69934d(C15737b<? extends T>[] bVarArr, int i) {
            C13082b<T, R>[] bVarArr2 = this.subscribers;
            int i2 = 0;
            while (i2 < i && !this.cancelled) {
                if (this.delayErrors || this.errors.get() == null) {
                    bVarArr[i2].mo75177b(bVarArr2[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                mo69932b();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.t$b */
    /* compiled from: FlowableZip */
    static final class C13082b<T, R> extends AtomicReference<C15739d> implements C16733g<T>, C15739d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final C13081a<T, R> parent;
        final int prefetch;
        long produced;
        C12185i<T> queue;
        int sourceMode;

        C13082b(C13081a<T, R> aVar, int i) {
            this.parent = aVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85528i(this, dVar)) {
                if (dVar instanceof C12182f) {
                    C12182f fVar = (C12182f) dVar;
                    int d = fVar.mo62364d(7);
                    if (d == 1) {
                        this.sourceMode = d;
                        this.queue = fVar;
                        this.done = true;
                        this.parent.mo69932b();
                        return;
                    } else if (d == 2) {
                        this.sourceMode = d;
                        this.queue = fVar;
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new C13177a(this.prefetch);
                dVar.request((long) this.prefetch);
            }
        }

        public void cancel() {
            C13213f.m85523b(this);
        }

        public void onComplete() {
            this.done = true;
            this.parent.mo69932b();
        }

        public void onError(Throwable th) {
            this.parent.mo69933c(this, th);
        }

        public void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.mo69932b();
        }

        public void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((C15739d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }
    }

    public C13080t(C15737b<? extends T>[] bVarArr, Iterable<? extends C15737b<? extends T>> iterable, C11114e<? super Object[], ? extends R> eVar, int i, boolean z) {
        this.f60848c = bVarArr;
        this.f60849d = iterable;
        this.f60850f = eVar;
        this.f60851g = i;
        this.f60852o = z;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super R> cVar) {
        int i;
        C15737b<? extends T>[] bVarArr = this.f60848c;
        if (bVarArr == null) {
            bVarArr = new C15737b[8];
            i = 0;
            for (C15737b<? extends T> bVar : this.f60849d) {
                if (i == bVarArr.length) {
                    C15737b<? extends T>[] bVarArr2 = new C15737b[((i >> 2) + i)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                    bVarArr = bVarArr2;
                }
                bVarArr[i] = bVar;
                i++;
            }
        } else {
            i = bVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            C13210c.m85515b(cVar);
            return;
        }
        C13081a aVar = new C13081a(cVar, this.f60850f, i2, this.f60851g, this.f60852o);
        cVar.mo68760a(aVar);
        aVar.mo69934d(bVarArr, i2);
    }
}
