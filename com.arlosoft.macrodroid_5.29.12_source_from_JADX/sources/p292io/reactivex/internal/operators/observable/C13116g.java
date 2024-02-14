package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.g */
/* compiled from: ObservableDoOnEach */
public final class C13116g<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C11113d<? super T> f60911c;

    /* renamed from: d */
    final C11113d<? super Throwable> f60912d;

    /* renamed from: f */
    final C11110a f60913f;

    /* renamed from: g */
    final C11110a f60914g;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    /* compiled from: ObservableDoOnEach */
    static final class C13117a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super T> f60915a;

        /* renamed from: c */
        final C11113d<? super T> f60916c;

        /* renamed from: d */
        final C11113d<? super Throwable> f60917d;

        /* renamed from: f */
        final C11110a f60918f;

        /* renamed from: g */
        final C11110a f60919g;

        /* renamed from: o */
        C17071b f60920o;

        /* renamed from: p */
        boolean f60921p;

        C13117a(C16741n<? super T> nVar, C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11110a aVar2) {
            this.f60915a = nVar;
            this.f60916c = dVar;
            this.f60917d = dVar2;
            this.f60918f = aVar;
            this.f60919g = aVar2;
        }

        public void dispose() {
            this.f60920o.dispose();
        }

        public boolean isDisposed() {
            return this.f60920o.isDisposed();
        }

        public void onComplete() {
            if (!this.f60921p) {
                try {
                    this.f60918f.run();
                    this.f60921p = true;
                    this.f60915a.onComplete();
                    try {
                        this.f60919g.run();
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        C12251a.m82985p(th);
                    }
                } catch (Throwable th2) {
                    C11078a.m74639b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f60921p) {
                C12251a.m82985p(th);
                return;
            }
            this.f60921p = true;
            try {
                this.f60917d.accept(th);
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                th = new CompositeException(th, th2);
            }
            this.f60915a.onError(th);
            try {
                this.f60919g.run();
            } catch (Throwable th3) {
                C11078a.m74639b(th3);
                C12251a.m82985p(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f60921p) {
                try {
                    this.f60916c.accept(t);
                    this.f60915a.onNext(t);
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    this.f60920o.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60920o, bVar)) {
                this.f60920o = bVar;
                this.f60915a.onSubscribe(this);
            }
        }
    }

    public C13116g(C16739l<T> lVar, C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11110a aVar2) {
        super(lVar);
        this.f60911c = dVar;
        this.f60912d = dVar2;
        this.f60913f = aVar;
        this.f60914g = aVar2;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13117a(nVar, this.f60911c, this.f60912d, this.f60913f, this.f60914g));
    }
}
