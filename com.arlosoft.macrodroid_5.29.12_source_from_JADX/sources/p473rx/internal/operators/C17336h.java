package p473rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17162h;

/* renamed from: rx.internal.operators.h */
/* compiled from: OperatorTake */
public final class C17336h<T> implements C17153c.C17155b<T, T> {

    /* renamed from: a */
    final int f69027a;

    /* renamed from: rx.internal.operators.h$a */
    /* compiled from: OperatorTake */
    class C17337a extends C17162h<T> {

        /* renamed from: g */
        int f69028g;

        /* renamed from: o */
        boolean f69029o;

        /* renamed from: p */
        final /* synthetic */ C17162h f69030p;

        /* renamed from: rx.internal.operators.h$a$a */
        /* compiled from: OperatorTake */
        class C17338a implements C17157e {

            /* renamed from: a */
            final AtomicLong f69032a = new AtomicLong(0);

            /* renamed from: c */
            final /* synthetic */ C17157e f69033c;

            C17338a(C17157e eVar) {
                this.f69033c = eVar;
            }

            public void request(long j) {
                long j2;
                long min;
                if (j > 0 && !C17337a.this.f69029o) {
                    do {
                        j2 = this.f69032a.get();
                        min = Math.min(j, ((long) C17336h.this.f69027a) - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.f69032a.compareAndSet(j2, j2 + min));
                    this.f69033c.request(min);
                }
            }
        }

        C17337a(C17162h hVar) {
            this.f69030p = hVar;
        }

        /* renamed from: g */
        public void mo80453g(C17157e eVar) {
            this.f69030p.mo80453g(new C17338a(eVar));
        }

        public void onCompleted() {
            if (!this.f69029o) {
                this.f69029o = true;
                this.f69030p.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (!this.f69029o) {
                this.f69029o = true;
                try {
                    this.f69030p.onError(th);
                } finally {
                    mo80450d();
                }
            }
        }

        public void onNext(T t) {
            if (!mo80449b()) {
                int i = this.f69028g;
                int i2 = i + 1;
                this.f69028g = i2;
                int i3 = C17336h.this.f69027a;
                if (i < i3) {
                    boolean z = i2 == i3;
                    this.f69030p.onNext(t);
                    if (z && !this.f69029o) {
                        this.f69029o = true;
                        try {
                            this.f69030p.onCompleted();
                        } finally {
                            mo80450d();
                        }
                    }
                }
            }
        }
    }

    public C17336h(int i) {
        if (i >= 0) {
            this.f69027a = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    /* renamed from: b */
    public C17162h<? super T> mo80454a(C17162h<? super T> hVar) {
        C17337a aVar = new C17337a(hVar);
        if (this.f69027a == 0) {
            hVar.onCompleted();
            aVar.mo80450d();
        }
        hVar.mo80448a(aVar);
        return aVar;
    }
}
