package p329me;

import java.util.Objects;
import java.util.concurrent.Flow;

/* renamed from: me.a */
/* compiled from: FlowAdapters */
public final class C15730a {

    /* renamed from: me.a$a */
    /* compiled from: FlowAdapters */
    static final class C15731a<T> implements Flow.Publisher<T> {

        /* renamed from: a */
        final C15737b<? extends T> f65079a;

        public C15731a(C15737b<? extends T> bVar) {
            this.f65079a = bVar;
        }

        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f65079a.mo75177b(subscriber == null ? null : new C15735e(subscriber));
        }
    }

    /* renamed from: me.a$b */
    /* compiled from: FlowAdapters */
    static final class C15732b<T> implements Flow.Subscriber<T> {

        /* renamed from: a */
        final C15738c<? super T> f65080a;

        public C15732b(C15738c<? super T> cVar) {
            this.f65080a = cVar;
        }

        public void onComplete() {
            this.f65080a.onComplete();
        }

        public void onError(Throwable th) {
            this.f65080a.onError(th);
        }

        public void onNext(T t) {
            this.f65080a.onNext(t);
        }

        public void onSubscribe(Flow.Subscription subscription) {
            this.f65080a.mo68760a(subscription == null ? null : new C15736f(subscription));
        }
    }

    /* renamed from: me.a$c */
    /* compiled from: FlowAdapters */
    static final class C15733c implements Flow.Subscription {

        /* renamed from: a */
        final C15739d f65081a;

        public C15733c(C15739d dVar) {
            this.f65081a = dVar;
        }

        public void cancel() {
            this.f65081a.cancel();
        }

        public void request(long j) {
            this.f65081a.request(j);
        }
    }

    /* renamed from: me.a$d */
    /* compiled from: FlowAdapters */
    static final class C15734d<T> implements C15737b<T> {

        /* renamed from: a */
        final Flow.Publisher<? extends T> f65082a;

        /* renamed from: b */
        public void mo75177b(C15738c<? super T> cVar) {
            this.f65082a.subscribe(cVar == null ? null : new C15732b(cVar));
        }
    }

    /* renamed from: me.a$e */
    /* compiled from: FlowAdapters */
    static final class C15735e<T> implements C15738c<T> {

        /* renamed from: a */
        final Flow.Subscriber<? super T> f65083a;

        public C15735e(Flow.Subscriber<? super T> subscriber) {
            this.f65083a = subscriber;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            this.f65083a.onSubscribe(dVar == null ? null : new C15733c(dVar));
        }

        public void onComplete() {
            this.f65083a.onComplete();
        }

        public void onError(Throwable th) {
            this.f65083a.onError(th);
        }

        public void onNext(T t) {
            this.f65083a.onNext(t);
        }
    }

    /* renamed from: me.a$f */
    /* compiled from: FlowAdapters */
    static final class C15736f implements C15739d {

        /* renamed from: a */
        final Flow.Subscription f65084a;

        public C15736f(Flow.Subscription subscription) {
            this.f65084a = subscription;
        }

        public void cancel() {
            this.f65084a.cancel();
        }

        public void request(long j) {
            this.f65084a.request(j);
        }
    }

    /* renamed from: a */
    public static <T> Flow.Publisher<T> m95051a(C15737b<? extends T> bVar) {
        Objects.requireNonNull(bVar, "reactiveStreamsPublisher");
        if (bVar instanceof C15734d) {
            return ((C15734d) bVar).f65082a;
        }
        if (bVar instanceof Flow.Publisher) {
            return (Flow.Publisher) bVar;
        }
        return new C15731a<>(bVar);
    }
}
