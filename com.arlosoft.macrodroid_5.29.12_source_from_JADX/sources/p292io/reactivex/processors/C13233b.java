package p292io.reactivex.processors;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;

/* renamed from: io.reactivex.processors.b */
/* compiled from: ReplayProcessor */
public final class C13233b<T> extends C13232a<T> {

    /* renamed from: g */
    private static final Object[] f61130g = new Object[0];

    /* renamed from: o */
    static final C13235b[] f61131o = new C13235b[0];

    /* renamed from: p */
    static final C13235b[] f61132p = new C13235b[0];

    /* renamed from: c */
    final C13234a<T> f61133c;

    /* renamed from: d */
    boolean f61134d;

    /* renamed from: f */
    final AtomicReference<C13235b<T>[]> f61135f = new AtomicReference<>(f61131o);

    /* renamed from: io.reactivex.processors.b$a */
    /* compiled from: ReplayProcessor */
    interface C13234a<T> {
        void complete();

        /* renamed from: s */
        void mo70067s(Throwable th);

        /* renamed from: t */
        void mo70068t(C13235b<T> bVar);

        /* renamed from: u */
        void mo70069u(T t);
    }

    /* renamed from: io.reactivex.processors.b$b */
    /* compiled from: ReplayProcessor */
    static final class C13235b<T> extends AtomicInteger implements C15739d {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final C15738c<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final C13233b<T> state;

        C13235b(C15738c<? super T> cVar, C13233b<T> bVar) {
            this.downstream = cVar;
            this.state = bVar;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.mo70065E(this);
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                this.state.f61133c.mo70068t(this);
            }
        }
    }

    /* renamed from: io.reactivex.processors.b$c */
    /* compiled from: ReplayProcessor */
    static final class C13236c<T> implements C13234a<T> {

        /* renamed from: a */
        final List<T> f61136a;

        /* renamed from: b */
        Throwable f61137b;

        /* renamed from: c */
        volatile boolean f61138c;

        /* renamed from: d */
        volatile int f61139d;

        C13236c(int i) {
            this.f61136a = new ArrayList(C11984b.m82368e(i, "capacityHint"));
        }

        public void complete() {
            this.f61138c = true;
        }

        /* renamed from: s */
        public void mo70067s(Throwable th) {
            this.f61137b = th;
            this.f61138c = true;
        }

        /* renamed from: t */
        public void mo70068t(C13235b<T> bVar) {
            int i;
            if (bVar.getAndIncrement() == 0) {
                List<T> list = this.f61136a;
                C15738c<? super T> cVar = bVar.downstream;
                Integer num = (Integer) bVar.index;
                int i2 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    bVar.index = 0;
                }
                long j = bVar.emitted;
                int i3 = 1;
                do {
                    long j2 = bVar.requested.get();
                    while (true) {
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (bVar.cancelled) {
                            bVar.index = null;
                            return;
                        } else {
                            boolean z = this.f61138c;
                            int i4 = this.f61139d;
                            if (z && i2 == i4) {
                                bVar.index = null;
                                bVar.cancelled = true;
                                Throwable th = this.f61137b;
                                if (th == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onError(th);
                                    return;
                                }
                            } else if (i2 == i4) {
                                break;
                            } else {
                                cVar.onNext(list.get(i2));
                                i2++;
                                j++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (bVar.cancelled) {
                            bVar.index = null;
                            return;
                        }
                        boolean z2 = this.f61138c;
                        int i5 = this.f61139d;
                        if (z2 && i2 == i5) {
                            bVar.index = null;
                            bVar.cancelled = true;
                            Throwable th2 = this.f61137b;
                            if (th2 == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th2);
                                return;
                            }
                        }
                    }
                    bVar.index = Integer.valueOf(i2);
                    bVar.emitted = j;
                    i3 = bVar.addAndGet(-i3);
                } while (i3 != 0);
            }
        }

        /* renamed from: u */
        public void mo70069u(T t) {
            this.f61136a.add(t);
            this.f61139d++;
        }
    }

    C13233b(C13234a<T> aVar) {
        this.f61133c = aVar;
    }

    /* renamed from: D */
    public static <T> C13233b<T> m85570D() {
        return new C13233b<>(new C13236c(16));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo70064C(C13235b<T> bVar) {
        C13235b[] bVarArr;
        C13235b[] bVarArr2;
        do {
            bVarArr = (C13235b[]) this.f61135f.get();
            if (bVarArr == f61132p) {
                return false;
            }
            int length = bVarArr.length;
            bVarArr2 = new C13235b[(length + 1)];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
        } while (!this.f61135f.compareAndSet(bVarArr, bVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo70065E(C13235b<T> bVar) {
        C13235b<T>[] bVarArr;
        C13235b[] bVarArr2;
        do {
            bVarArr = (C13235b[]) this.f61135f.get();
            if (bVarArr != f61132p && bVarArr != f61131o) {
                int length = bVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVarArr[i2] == bVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f61131o;
                    } else {
                        C13235b[] bVarArr3 = new C13235b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f61135f.compareAndSet(bVarArr, bVarArr2));
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        if (this.f61134d) {
            dVar.cancel();
        } else {
            dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
        }
    }

    public void onComplete() {
        if (!this.f61134d) {
            this.f61134d = true;
            C13234a<T> aVar = this.f61133c;
            aVar.complete();
            for (C13235b t : (C13235b[]) this.f61135f.getAndSet(f61132p)) {
                aVar.mo70068t(t);
            }
        }
    }

    public void onError(Throwable th) {
        C11984b.m82367d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61134d) {
            C12251a.m82985p(th);
            return;
        }
        this.f61134d = true;
        C13234a<T> aVar = this.f61133c;
        aVar.mo70067s(th);
        for (C13235b t : (C13235b[]) this.f61135f.getAndSet(f61132p)) {
            aVar.mo70068t(t);
        }
    }

    public void onNext(T t) {
        C11984b.m82367d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f61134d) {
            C13234a<T> aVar = this.f61133c;
            aVar.mo70069u(t);
            for (C13235b t2 : (C13235b[]) this.f61135f.get()) {
                aVar.mo70068t(t2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        C13235b bVar = new C13235b(cVar, this);
        cVar.mo68760a(bVar);
        if (!mo70064C(bVar) || !bVar.cancelled) {
            this.f61133c.mo70068t(bVar);
        } else {
            mo70065E(bVar);
        }
    }
}
