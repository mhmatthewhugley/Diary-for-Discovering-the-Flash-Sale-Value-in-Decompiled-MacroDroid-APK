package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.NoSuchElementException;
import p251ea.C12178b;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;
import p414v9.C16747p;
import p414v9.C16748q;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.flowable.q */
/* compiled from: FlowableSingleSingle */
public final class C13073q<T> extends C16747p<T> implements C12178b<T> {

    /* renamed from: a */
    final C16732f<T> f60836a;

    /* renamed from: c */
    final T f60837c;

    /* renamed from: io.reactivex.internal.operators.flowable.q$a */
    /* compiled from: FlowableSingleSingle */
    static final class C13074a<T> implements C16733g<T>, C17071b {

        /* renamed from: a */
        final C16748q<? super T> f60838a;

        /* renamed from: c */
        final T f60839c;

        /* renamed from: d */
        C15739d f60840d;

        /* renamed from: f */
        boolean f60841f;

        /* renamed from: g */
        T f60842g;

        C13074a(C16748q<? super T> qVar, T t) {
            this.f60838a = qVar;
            this.f60839c = t;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.f60840d, dVar)) {
                this.f60840d = dVar;
                this.f60838a.onSubscribe(this);
                dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public void dispose() {
            this.f60840d.cancel();
            this.f60840d = C13213f.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f60840d == C13213f.CANCELLED;
        }

        public void onComplete() {
            if (!this.f60841f) {
                this.f60841f = true;
                this.f60840d = C13213f.CANCELLED;
                T t = this.f60842g;
                this.f60842g = null;
                if (t == null) {
                    t = this.f60839c;
                }
                if (t != null) {
                    this.f60838a.mo69889b(t);
                } else {
                    this.f60838a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f60841f) {
                C12251a.m82985p(th);
                return;
            }
            this.f60841f = true;
            this.f60840d = C13213f.CANCELLED;
            this.f60838a.onError(th);
        }

        public void onNext(T t) {
            if (!this.f60841f) {
                if (this.f60842g != null) {
                    this.f60841f = true;
                    this.f60840d.cancel();
                    this.f60840d = C13213f.CANCELLED;
                    this.f60838a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f60842g = t;
            }
        }
    }

    public C13073q(C16732f<T> fVar, T t) {
        this.f60836a = fVar;
        this.f60837c = t;
    }

    /* renamed from: c */
    public C16732f<T> mo68462c() {
        return C12251a.m82980k(new C13071p(this.f60836a, this.f60837c, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        this.f60836a.mo79673t(new C13074a(qVar, this.f60837c));
    }
}
