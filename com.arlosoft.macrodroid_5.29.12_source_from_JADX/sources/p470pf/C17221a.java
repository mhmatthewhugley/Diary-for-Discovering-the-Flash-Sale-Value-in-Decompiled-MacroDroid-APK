package p470pf;

import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17163i;
import p464jf.C17176a;

/* renamed from: pf.a */
/* compiled from: BooleanSubscription */
public final class C17221a implements C17163i {

    /* renamed from: c */
    static final C17176a f68781c = new C17222a();

    /* renamed from: a */
    final AtomicReference<C17176a> f68782a;

    /* renamed from: pf.a$a */
    /* compiled from: BooleanSubscription */
    static class C17222a implements C17176a {
        C17222a() {
        }

        public void call() {
        }
    }

    private C17221a(C17176a aVar) {
        this.f68782a = new AtomicReference<>(aVar);
    }

    /* renamed from: a */
    public static C17221a m100797a(C17176a aVar) {
        return new C17221a(aVar);
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return this.f68782a.get() == f68781c;
    }

    /* renamed from: d */
    public void mo80450d() {
        C17176a andSet;
        C17176a aVar = this.f68782a.get();
        C17176a aVar2 = f68781c;
        if (aVar != aVar2 && (andSet = this.f68782a.getAndSet(aVar2)) != null && andSet != aVar2) {
            andSet.call();
        }
    }
}
