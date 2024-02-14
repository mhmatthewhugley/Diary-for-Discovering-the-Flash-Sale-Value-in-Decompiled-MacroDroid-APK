package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.NoSuchElementException;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13209b;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.p */
/* compiled from: FlowableSingle */
public final class C13071p<T> extends C13044a<T, T> {

    /* renamed from: d */
    final T f60834d;

    /* renamed from: f */
    final boolean f60835f;

    /* renamed from: io.reactivex.internal.operators.flowable.p$a */
    /* compiled from: FlowableSingle */
    static final class C13072a<T> extends C13209b<T> implements C16733g<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        C15739d upstream;

        C13072a(C15738c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.defaultValue = t;
            this.failOnEmpty = z;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.mo68760a(this);
                dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    t = this.defaultValue;
                }
                if (t != null) {
                    mo70033e(t);
                } else if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.done = true;
                    this.upstream.cancel();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }
    }

    public C13071p(C16732f<T> fVar, T t, boolean z) {
        super(fVar);
        this.f60834d = t;
        this.f60835f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13072a(cVar, this.f60834d, this.f60835f));
    }
}
