package p292io.reactivex.internal.observers;

import p209aa.C11078a;
import p223ca.C11163b;
import p251ea.C12180d;
import p262fa.C12251a;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.a */
/* compiled from: BasicFuseableObserver */
public abstract class C13018a<T, R> implements C16741n<T>, C12180d<R> {

    /* renamed from: a */
    protected final C16741n<? super R> f60771a;

    /* renamed from: c */
    protected C17071b f60772c;

    /* renamed from: d */
    protected C12180d<T> f60773d;

    /* renamed from: f */
    protected boolean f60774f;

    /* renamed from: g */
    protected int f60775g;

    public C13018a(C16741n<? super R> nVar) {
        this.f60771a = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69880a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo69881b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo69882c(Throwable th) {
        C11078a.m74639b(th);
        this.f60772c.dispose();
        onError(th);
    }

    public void clear() {
        this.f60773d.clear();
    }

    public void dispose() {
        this.f60772c.dispose();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo69883e(int i) {
        C12180d<T> dVar = this.f60773d;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int d = dVar.mo62364d(i);
        if (d != 0) {
            this.f60775g = d;
        }
        return d;
    }

    public boolean isDisposed() {
        return this.f60772c.isDisposed();
    }

    public boolean isEmpty() {
        return this.f60773d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f60774f) {
            this.f60774f = true;
            this.f60771a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f60774f) {
            C12251a.m82985p(th);
            return;
        }
        this.f60774f = true;
        this.f60771a.onError(th);
    }

    public final void onSubscribe(C17071b bVar) {
        if (C11163b.m74932j(this.f60772c, bVar)) {
            this.f60772c = bVar;
            if (bVar instanceof C12180d) {
                this.f60773d = (C12180d) bVar;
            }
            if (mo69881b()) {
                this.f60771a.onSubscribe(this);
                mo69880a();
            }
        }
    }
}
