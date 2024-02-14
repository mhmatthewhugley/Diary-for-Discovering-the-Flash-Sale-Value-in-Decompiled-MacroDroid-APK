package p292io.reactivex.internal.operators.completable;

import androidx.core.location.LocationRequestCompat;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15737b;
import p329me.C15739d;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16733g;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.c */
/* compiled from: CompletableFromPublisher */
public final class C13030c<T> extends C16728b {

    /* renamed from: a */
    final C15737b<T> f60785a;

    /* renamed from: io.reactivex.internal.operators.completable.c$a */
    /* compiled from: CompletableFromPublisher */
    static final class C13031a<T> implements C16733g<T>, C17071b {

        /* renamed from: a */
        final C16729c f60786a;

        /* renamed from: c */
        C15739d f60787c;

        C13031a(C16729c cVar) {
            this.f60786a = cVar;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.f60787c, dVar)) {
                this.f60787c = dVar;
                this.f60786a.onSubscribe(this);
                dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public void dispose() {
            this.f60787c.cancel();
            this.f60787c = C13213f.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f60787c == C13213f.CANCELLED;
        }

        public void onComplete() {
            this.f60786a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60786a.onError(th);
        }

        public void onNext(T t) {
        }
    }

    public C13030c(C15737b<T> bVar) {
        this.f60785a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        this.f60785a.mo75177b(new C13031a(cVar));
    }
}
