package p292io.reactivex.internal.operators.single;

import p223ca.C11163b;
import p292io.reactivex.internal.subscriptions.C13209b;
import p329me.C15738c;
import p414v9.C16732f;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.j */
/* compiled from: SingleToFlowable */
public final class C13173j<T> extends C16732f<T> {

    /* renamed from: c */
    final C16749r<? extends T> f61012c;

    /* renamed from: io.reactivex.internal.operators.single.j$a */
    /* compiled from: SingleToFlowable */
    static final class C13174a<T> extends C13209b<T> implements C16748q<T> {
        private static final long serialVersionUID = 187782011903685568L;
        C17071b upstream;

        C13174a(C15738c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            mo70033e(t);
        }

        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.mo68760a(this);
            }
        }
    }

    public C13173j(C16749r<? extends T> rVar) {
        this.f61012c = rVar;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f61012c.mo79722a(new C13174a(cVar));
    }
}
