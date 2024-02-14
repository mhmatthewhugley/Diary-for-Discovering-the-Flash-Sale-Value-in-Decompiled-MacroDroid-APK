package p292io.reactivex.internal.operators.completable;

import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p223ca.C11163b;
import p223ca.C11164c;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16730d;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.g */
/* compiled from: CompletablePeek */
public final class C13037g extends C16728b {

    /* renamed from: a */
    final C16730d f60792a;

    /* renamed from: c */
    final C11113d<? super C17071b> f60793c;

    /* renamed from: d */
    final C11113d<? super Throwable> f60794d;

    /* renamed from: f */
    final C11110a f60795f;

    /* renamed from: g */
    final C11110a f60796g;

    /* renamed from: o */
    final C11110a f60797o;

    /* renamed from: p */
    final C11110a f60798p;

    /* renamed from: io.reactivex.internal.operators.completable.g$a */
    /* compiled from: CompletablePeek */
    final class C13038a implements C16729c, C17071b {

        /* renamed from: a */
        final C16729c f60799a;

        /* renamed from: c */
        C17071b f60800c;

        C13038a(C16729c cVar) {
            this.f60799a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69897a() {
            try {
                C13037g.this.f60797o.run();
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(th);
            }
        }

        public void dispose() {
            try {
                C13037g.this.f60798p.run();
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(th);
            }
            this.f60800c.dispose();
        }

        public boolean isDisposed() {
            return this.f60800c.isDisposed();
        }

        public void onComplete() {
            if (this.f60800c != C11163b.DISPOSED) {
                try {
                    C13037g.this.f60795f.run();
                    C13037g.this.f60796g.run();
                    this.f60799a.onComplete();
                    mo69897a();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    this.f60799a.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f60800c == C11163b.DISPOSED) {
                C12251a.m82985p(th);
                return;
            }
            try {
                C13037g.this.f60794d.accept(th);
                C13037g.this.f60796g.run();
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                th = new CompositeException(th, th2);
            }
            this.f60799a.onError(th);
            mo69897a();
        }

        public void onSubscribe(C17071b bVar) {
            try {
                C13037g.this.f60793c.accept(bVar);
                if (C11163b.m74932j(this.f60800c, bVar)) {
                    this.f60800c = bVar;
                    this.f60799a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C11078a.m74639b(th);
                bVar.dispose();
                this.f60800c = C11163b.DISPOSED;
                C11164c.m74935f(th, this.f60799a);
            }
        }
    }

    public C13037g(C16730d dVar, C11113d<? super C17071b> dVar2, C11113d<? super Throwable> dVar3, C11110a aVar, C11110a aVar2, C11110a aVar3, C11110a aVar4) {
        this.f60792a = dVar;
        this.f60793c = dVar2;
        this.f60794d = dVar3;
        this.f60795f = aVar;
        this.f60796g = aVar2;
        this.f60797o = aVar3;
        this.f60798p = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        this.f60792a.mo79652a(new C13038a(cVar));
    }
}
