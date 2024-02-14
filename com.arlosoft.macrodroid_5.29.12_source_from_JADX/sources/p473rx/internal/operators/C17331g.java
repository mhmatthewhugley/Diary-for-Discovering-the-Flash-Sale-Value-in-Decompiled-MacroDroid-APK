package p473rx.internal.operators;

import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17158f;
import p459ef.C17162h;
import p464jf.C17176a;

/* renamed from: rx.internal.operators.g */
/* compiled from: OperatorSubscribeOn */
public final class C17331g<T> implements C17153c.C17154a<T> {

    /* renamed from: a */
    final C17158f f69016a;

    /* renamed from: c */
    final C17153c<T> f69017c;

    /* renamed from: rx.internal.operators.g$a */
    /* compiled from: OperatorSubscribeOn */
    class C17332a implements C17176a {

        /* renamed from: a */
        final /* synthetic */ C17162h f69018a;

        /* renamed from: c */
        final /* synthetic */ C17158f.C17159a f69019c;

        /* renamed from: rx.internal.operators.g$a$a */
        /* compiled from: OperatorSubscribeOn */
        class C17333a extends C17162h<T> {

            /* renamed from: g */
            final /* synthetic */ Thread f69021g;

            /* renamed from: rx.internal.operators.g$a$a$a */
            /* compiled from: OperatorSubscribeOn */
            class C17334a implements C17157e {

                /* renamed from: a */
                final /* synthetic */ C17157e f69023a;

                /* renamed from: rx.internal.operators.g$a$a$a$a */
                /* compiled from: OperatorSubscribeOn */
                class C17335a implements C17176a {

                    /* renamed from: a */
                    final /* synthetic */ long f69025a;

                    C17335a(long j) {
                        this.f69025a = j;
                    }

                    public void call() {
                        C17334a.this.f69023a.request(this.f69025a);
                    }
                }

                C17334a(C17157e eVar) {
                    this.f69023a = eVar;
                }

                public void request(long j) {
                    if (C17333a.this.f69021g == Thread.currentThread()) {
                        this.f69023a.request(j);
                    } else {
                        C17332a.this.f69019c.mo80446a(new C17335a(j));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17333a(C17162h hVar, Thread thread) {
                super(hVar);
                this.f69021g = thread;
            }

            /* renamed from: g */
            public void mo80453g(C17157e eVar) {
                C17332a.this.f69018a.mo80453g(new C17334a(eVar));
            }

            public void onCompleted() {
                try {
                    C17332a.this.f69018a.onCompleted();
                } finally {
                    C17332a.this.f69019c.mo80450d();
                }
            }

            public void onError(Throwable th) {
                try {
                    C17332a.this.f69018a.onError(th);
                } finally {
                    C17332a.this.f69019c.mo80450d();
                }
            }

            public void onNext(T t) {
                C17332a.this.f69018a.onNext(t);
            }
        }

        C17332a(C17162h hVar, C17158f.C17159a aVar) {
            this.f69018a = hVar;
            this.f69019c = aVar;
        }

        public void call() {
            C17331g.this.f69017c.mo80440p(new C17333a(this.f69018a, Thread.currentThread()));
        }
    }

    public C17331g(C17153c<T> cVar, C17158f fVar) {
        this.f69016a = fVar;
        this.f69017c = cVar;
    }

    /* renamed from: b */
    public void mo26537a(C17162h<? super T> hVar) {
        C17158f.C17159a a = this.f69016a.mo80445a();
        hVar.mo80448a(a);
        a.mo80446a(new C17332a(hVar, a));
    }
}
