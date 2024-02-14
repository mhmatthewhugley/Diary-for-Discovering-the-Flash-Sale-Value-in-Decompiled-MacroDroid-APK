package p473rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17158f;
import p459ef.C17162h;
import p459ef.C17163i;
import p463if.C17175a;
import p464jf.C17176a;
import p464jf.C17181e;
import p473rx.internal.schedulers.C17359b;

/* renamed from: rx.internal.util.f */
/* compiled from: ScalarSynchronousObservable */
public final class C17385f<T> extends C17153c<T> {

    /* renamed from: c */
    static final boolean f69138c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* renamed from: b */
    final T f69139b;

    /* renamed from: rx.internal.util.f$a */
    /* compiled from: ScalarSynchronousObservable */
    class C17386a implements C17181e<C17176a, C17163i> {

        /* renamed from: a */
        final /* synthetic */ C17359b f69140a;

        C17386a(C17359b bVar) {
            this.f69140a = bVar;
        }

        /* renamed from: b */
        public C17163i mo80454a(C17176a aVar) {
            return this.f69140a.mo80681b(aVar);
        }
    }

    /* renamed from: rx.internal.util.f$b */
    /* compiled from: ScalarSynchronousObservable */
    class C17387b implements C17181e<C17176a, C17163i> {

        /* renamed from: a */
        final /* synthetic */ C17158f f69142a;

        /* renamed from: rx.internal.util.f$b$a */
        /* compiled from: ScalarSynchronousObservable */
        class C17388a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17176a f69144a;

            /* renamed from: c */
            final /* synthetic */ C17158f.C17159a f69145c;

            C17388a(C17176a aVar, C17158f.C17159a aVar2) {
                this.f69144a = aVar;
                this.f69145c = aVar2;
            }

            public void call() {
                try {
                    this.f69144a.call();
                } finally {
                    this.f69145c.mo80450d();
                }
            }
        }

        C17387b(C17158f fVar) {
            this.f69142a = fVar;
        }

        /* renamed from: b */
        public C17163i mo80454a(C17176a aVar) {
            C17158f.C17159a a = this.f69142a.mo80445a();
            a.mo80446a(new C17388a(aVar, a));
            return a;
        }
    }

    /* renamed from: rx.internal.util.f$c */
    /* compiled from: ScalarSynchronousObservable */
    static final class C17389c<T> implements C17153c.C17154a<T> {

        /* renamed from: a */
        final T f69147a;

        /* renamed from: c */
        final C17181e<C17176a, C17163i> f69148c;

        C17389c(T t, C17181e<C17176a, C17163i> eVar) {
            this.f69147a = t;
            this.f69148c = eVar;
        }

        /* renamed from: b */
        public void mo26537a(C17162h<? super T> hVar) {
            hVar.mo80453g(new C17390d(hVar, this.f69147a, this.f69148c));
        }
    }

    /* renamed from: rx.internal.util.f$d */
    /* compiled from: ScalarSynchronousObservable */
    static final class C17390d<T> extends AtomicBoolean implements C17157e, C17176a {
        private static final long serialVersionUID = -2466317989629281651L;
        final C17162h<? super T> actual;
        final C17181e<C17176a, C17163i> onSchedule;
        final T value;

        public C17390d(C17162h<? super T> hVar, T t, C17181e<C17176a, C17163i> eVar) {
            this.actual = hVar;
            this.value = t;
            this.onSchedule = eVar;
        }

        public void call() {
            C17162h<? super T> hVar = this.actual;
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

        public void request(long j) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (i != 0 && compareAndSet(false, true)) {
                this.actual.mo80448a(this.onSchedule.mo80454a(this));
            }
        }

        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    /* renamed from: q */
    public C17153c<T> mo80704q(C17158f fVar) {
        C17181e eVar;
        if (fVar instanceof C17359b) {
            eVar = new C17386a((C17359b) fVar);
        } else {
            eVar = new C17387b(fVar);
        }
        return C17153c.m100630a(new C17389c(this.f69139b, eVar));
    }
}
