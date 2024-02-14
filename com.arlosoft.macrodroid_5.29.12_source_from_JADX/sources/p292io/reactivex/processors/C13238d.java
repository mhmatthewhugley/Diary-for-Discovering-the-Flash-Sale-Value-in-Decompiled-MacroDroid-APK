package p292io.reactivex.processors;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.subscriptions.C13208a;
import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;

/* renamed from: io.reactivex.processors.d */
/* compiled from: UnicastProcessor */
public final class C13238d<T> extends C13232a<T> {

    /* renamed from: A */
    final C13208a<T> f61144A;

    /* renamed from: B */
    final AtomicLong f61145B;

    /* renamed from: C */
    boolean f61146C;

    /* renamed from: c */
    final C13178b<T> f61147c;

    /* renamed from: d */
    final AtomicReference<Runnable> f61148d;

    /* renamed from: f */
    final boolean f61149f;

    /* renamed from: g */
    volatile boolean f61150g;

    /* renamed from: o */
    Throwable f61151o;

    /* renamed from: p */
    final AtomicReference<C15738c<? super T>> f61152p;

    /* renamed from: s */
    volatile boolean f61153s;

    /* renamed from: z */
    final AtomicBoolean f61154z;

    /* renamed from: io.reactivex.processors.d$a */
    /* compiled from: UnicastProcessor */
    final class C13239a extends C13208a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        C13239a() {
        }

        public void cancel() {
            if (!C13238d.this.f61153s) {
                C13238d.this.f61153s = true;
                C13238d.this.mo70072E();
                C13238d dVar = C13238d.this;
                if (!dVar.f61146C && dVar.f61144A.getAndIncrement() == 0) {
                    C13238d.this.f61147c.clear();
                    C13238d.this.f61152p.lazySet((Object) null);
                }
            }
        }

        public void clear() {
            C13238d.this.f61147c.clear();
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C13238d.this.f61146C = true;
            return 2;
        }

        public boolean isEmpty() {
            return C13238d.this.f61147c.isEmpty();
        }

        public T poll() {
            return C13238d.this.f61147c.poll();
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(C13238d.this.f61145B, j);
                C13238d.this.mo70073F();
            }
        }
    }

    C13238d(int i) {
        this(i, (Runnable) null, true);
    }

    /* renamed from: D */
    public static <T> C13238d<T> m85584D(int i) {
        return new C13238d<>(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo70071C(boolean z, boolean z2, boolean z3, C15738c<? super T> cVar, C13178b<T> bVar) {
        if (this.f61153s) {
            bVar.clear();
            this.f61152p.lazySet((Object) null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.f61151o != null) {
                bVar.clear();
                this.f61152p.lazySet((Object) null);
                cVar.onError(this.f61151o);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.f61151o;
                this.f61152p.lazySet((Object) null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo70072E() {
        Runnable andSet = this.f61148d.getAndSet((Object) null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo70073F() {
        if (this.f61144A.getAndIncrement() == 0) {
            int i = 1;
            C15738c cVar = this.f61152p.get();
            while (cVar == null) {
                i = this.f61144A.addAndGet(-i);
                if (i != 0) {
                    cVar = this.f61152p.get();
                } else {
                    return;
                }
            }
            if (this.f61146C) {
                mo70074G(cVar);
            } else {
                mo70075H(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo70074G(C15738c<? super T> cVar) {
        C13178b<T> bVar = this.f61147c;
        int i = 1;
        boolean z = !this.f61149f;
        while (!this.f61153s) {
            boolean z2 = this.f61150g;
            if (!z || !z2 || this.f61151o == null) {
                cVar.onNext(null);
                if (z2) {
                    this.f61152p.lazySet((Object) null);
                    Throwable th = this.f61151o;
                    if (th != null) {
                        cVar.onError(th);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                } else {
                    i = this.f61144A.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                bVar.clear();
                this.f61152p.lazySet((Object) null);
                cVar.onError(this.f61151o);
                return;
            }
        }
        bVar.clear();
        this.f61152p.lazySet((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo70075H(C15738c<? super T> cVar) {
        int i;
        long j;
        C13178b<T> bVar = this.f61147c;
        boolean z = !this.f61149f;
        int i2 = 1;
        while (true) {
            long j2 = this.f61145B.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i == 0) {
                    j = j3;
                    break;
                }
                boolean z2 = this.f61150g;
                T poll = bVar.poll();
                boolean z3 = poll == null;
                T t = poll;
                j = j3;
                if (!mo70071C(z, z2, z3, cVar, bVar)) {
                    if (z3) {
                        break;
                    }
                    cVar.onNext(t);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            C15738c<? super T> cVar2 = cVar;
            if (i == 0) {
                if (mo70071C(z, this.f61150g, bVar.isEmpty(), cVar, bVar)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == LocationRequestCompat.PASSIVE_INTERVAL)) {
                this.f61145B.addAndGet(-j);
            }
            i2 = this.f61144A.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        if (this.f61150g || this.f61153s) {
            dVar.cancel();
        } else {
            dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
        }
    }

    public void onComplete() {
        if (!this.f61150g && !this.f61153s) {
            this.f61150g = true;
            mo70072E();
            mo70073F();
        }
    }

    public void onError(Throwable th) {
        C11984b.m82367d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61150g || this.f61153s) {
            C12251a.m82985p(th);
            return;
        }
        this.f61151o = th;
        this.f61150g = true;
        mo70072E();
        mo70073F();
    }

    public void onNext(T t) {
        C11984b.m82367d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f61150g && !this.f61153s) {
            this.f61147c.offer(t);
            mo70073F();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        if (this.f61154z.get() || !this.f61154z.compareAndSet(false, true)) {
            C13210c.m85516e(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.mo68760a(this.f61144A);
        this.f61152p.set(cVar);
        if (this.f61153s) {
            this.f61152p.lazySet((Object) null);
        } else {
            mo70073F();
        }
    }

    C13238d(int i, Runnable runnable, boolean z) {
        this.f61147c = new C13178b<>(C11984b.m82368e(i, "capacityHint"));
        this.f61148d = new AtomicReference<>(runnable);
        this.f61149f = z;
        this.f61152p = new AtomicReference<>();
        this.f61154z = new AtomicBoolean();
        this.f61144A = new C13239a();
        this.f61145B = new AtomicLong();
    }
}
