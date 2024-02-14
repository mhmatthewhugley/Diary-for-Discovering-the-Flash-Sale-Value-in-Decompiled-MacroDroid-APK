package p473rx.internal.operators;

import androidx.core.location.LocationRequestCompat;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17162h;
import p463if.C17175a;

/* renamed from: rx.internal.operators.c */
/* compiled from: OnSubscribeFromIterable */
public final class C17322c<T> implements C17153c.C17154a<T> {

    /* renamed from: a */
    final Iterable<? extends T> f68987a;

    /* renamed from: rx.internal.operators.c$a */
    /* compiled from: OnSubscribeFromIterable */
    static final class C17323a<T> extends AtomicLong implements C17157e {
        private static final long serialVersionUID = -8730475647105475802L;

        /* renamed from: it */
        private final Iterator<? extends T> f68988it;

        /* renamed from: o */
        private final C17162h<? super T> f68989o;

        C17323a(C17162h<? super T> hVar, Iterator<? extends T> it) {
            this.f68989o = hVar;
            this.f68988it = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80654a() {
            C17162h<? super T> hVar = this.f68989o;
            Iterator<? extends T> it = this.f68988it;
            while (!hVar.mo80449b()) {
                try {
                    hVar.onNext(it.next());
                    if (!hVar.mo80449b()) {
                        try {
                            if (!it.hasNext()) {
                                if (!hVar.mo80449b()) {
                                    hVar.onCompleted();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C17175a.m100685e(th, hVar);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C17175a.m100685e(th2, hVar);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo80655b(long j) {
            C17162h<? super T> hVar = this.f68989o;
            Iterator<? extends T> it = this.f68988it;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = C17317a.m101038c(this, j2);
                        }
                    } else if (!hVar.mo80449b()) {
                        try {
                            hVar.onNext(it.next());
                            if (!hVar.mo80449b()) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!hVar.mo80449b()) {
                                        hVar.onCompleted();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C17175a.m100685e(th, hVar);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C17175a.m100685e(th2, hVar);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        public void request(long j) {
            if (get() != LocationRequestCompat.PASSIVE_INTERVAL) {
                if (j == LocationRequestCompat.PASSIVE_INTERVAL && compareAndSet(0, LocationRequestCompat.PASSIVE_INTERVAL)) {
                    mo80654a();
                } else if (j > 0 && C17317a.m101037b(this, j) == 0) {
                    mo80655b(j);
                }
            }
        }
    }

    public C17322c(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "iterable must not be null");
        this.f68987a = iterable;
    }

    /* renamed from: b */
    public void mo26537a(C17162h<? super T> hVar) {
        try {
            Iterator<? extends T> it = this.f68987a.iterator();
            boolean hasNext = it.hasNext();
            if (hVar.mo80449b()) {
                return;
            }
            if (!hasNext) {
                hVar.onCompleted();
            } else {
                hVar.mo80453g(new C17323a(hVar, it));
            }
        } catch (Throwable th) {
            C17175a.m100685e(th, hVar);
        }
    }
}
