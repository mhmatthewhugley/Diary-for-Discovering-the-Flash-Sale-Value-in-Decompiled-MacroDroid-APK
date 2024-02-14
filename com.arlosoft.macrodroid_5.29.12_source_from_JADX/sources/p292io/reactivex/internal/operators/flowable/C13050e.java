package p292io.reactivex.internal.operators.flowable;

import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.flowable.e */
/* compiled from: FlowableFromObservable */
public final class C13050e<T> extends C16732f<T> {

    /* renamed from: c */
    private final C16735i<T> f60818c;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    /* compiled from: FlowableFromObservable */
    static final class C13051a<T> implements C16741n<T>, C15739d {

        /* renamed from: a */
        final C15738c<? super T> f60819a;

        /* renamed from: c */
        C17071b f60820c;

        C13051a(C15738c<? super T> cVar) {
            this.f60819a = cVar;
        }

        public void cancel() {
            this.f60820c.dispose();
        }

        public void onComplete() {
            this.f60819a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60819a.onError(th);
        }

        public void onNext(T t) {
            this.f60819a.onNext(t);
        }

        public void onSubscribe(C17071b bVar) {
            this.f60820c = bVar;
            this.f60819a.mo68760a(this);
        }

        public void request(long j) {
        }
    }

    public C13050e(C16735i<T> iVar) {
        this.f60818c = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60818c.mo79695a(new C13051a(cVar));
    }
}
