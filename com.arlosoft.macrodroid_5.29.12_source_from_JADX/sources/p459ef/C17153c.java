package p459ef;

import java.util.concurrent.TimeUnit;
import p463if.C17175a;
import p464jf.C17177b;
import p464jf.C17178c;
import p464jf.C17181e;
import p467mf.C17189a;
import p468nf.C17195c;
import p469of.C17220a;
import p473rx.exceptions.OnErrorFailedException;
import p473rx.internal.operators.C17322c;
import p473rx.internal.operators.C17324d;
import p473rx.internal.operators.C17325e;
import p473rx.internal.operators.C17328f;
import p473rx.internal.operators.C17331g;
import p473rx.internal.operators.C17336h;
import p473rx.internal.operators.C17339i;
import p473rx.internal.util.C17375a;
import p473rx.internal.util.C17380d;
import p473rx.internal.util.C17385f;

/* renamed from: ef.c */
/* compiled from: Observable */
public class C17153c<T> {

    /* renamed from: a */
    final C17154a<T> f68707a;

    /* renamed from: ef.c$a */
    /* compiled from: Observable */
    public interface C17154a<T> extends C17177b<C17162h<? super T>> {
    }

    /* renamed from: ef.c$b */
    /* compiled from: Observable */
    public interface C17155b<R, T> extends C17181e<C17162h<? super R>, C17162h<? super T>> {
    }

    protected C17153c(C17154a<T> aVar) {
        this.f68707a = aVar;
    }

    /* renamed from: a */
    public static <T> C17153c<T> m100630a(C17154a<T> aVar) {
        return new C17153c<>(C17195c.m100722f(aVar));
    }

    /* renamed from: c */
    public static <T> C17153c<T> m100631c(Iterable<? extends T> iterable) {
        return m100630a(new C17322c(iterable));
    }

    /* renamed from: j */
    static <T> C17163i m100632j(C17162h<? super T> hVar, C17153c<T> cVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (cVar.f68707a != null) {
            hVar.mo80451e();
            if (!(hVar instanceof C17189a)) {
                hVar = new C17189a<>(hVar);
            }
            try {
                C17195c.m100728l(cVar, cVar.f68707a).mo26537a(hVar);
                return C17195c.m100727k(hVar);
            } catch (Throwable th) {
                C17175a.m100684d(th);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C17195c.m100725i(onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    /* renamed from: b */
    public final C17153c<T> mo80428b() {
        return mo80437m(1).mo80433h();
    }

    /* renamed from: d */
    public final <R> C17153c<R> mo80429d(C17155b<? extends R, ? super T> bVar) {
        return m100630a(new C17324d(this.f68707a, bVar));
    }

    /* renamed from: e */
    public final C17153c<T> mo80430e(C17158f fVar) {
        return mo80431f(fVar, C17380d.f69134c);
    }

    /* renamed from: f */
    public final C17153c<T> mo80431f(C17158f fVar, int i) {
        return mo80432g(fVar, false, i);
    }

    /* renamed from: g */
    public final C17153c<T> mo80432g(C17158f fVar, boolean z, int i) {
        if (this instanceof C17385f) {
            return ((C17385f) this).mo80704q(fVar);
        }
        return mo80429d(new C17325e(fVar, z, i));
    }

    /* renamed from: h */
    public final C17153c<T> mo80433h() {
        return mo80429d(C17328f.m101056c());
    }

    /* renamed from: i */
    public final C17163i mo80434i(C17162h<? super T> hVar) {
        return m100632j(hVar, this);
    }

    /* renamed from: k */
    public final C17163i mo80435k(C17177b<? super T> bVar, C17177b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (bVar2 != null) {
            return mo80434i(new C17375a(bVar, bVar2, C17178c.m100688a()));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: l */
    public final C17153c<T> mo80436l(C17158f fVar) {
        if (this instanceof C17385f) {
            return ((C17385f) this).mo80704q(fVar);
        }
        return m100630a(new C17331g(this, fVar));
    }

    /* renamed from: m */
    public final C17153c<T> mo80437m(int i) {
        return mo80429d(new C17336h(i));
    }

    /* renamed from: n */
    public final C17153c<T> mo80438n(long j, TimeUnit timeUnit) {
        return mo80439o(j, timeUnit, (C17153c) null, C17220a.m100793a());
    }

    /* renamed from: o */
    public final C17153c<T> mo80439o(long j, TimeUnit timeUnit, C17153c<? extends T> cVar, C17158f fVar) {
        return mo80429d(new C17339i(j, timeUnit, cVar, fVar));
    }

    /* renamed from: p */
    public final C17163i mo80440p(C17162h<? super T> hVar) {
        try {
            hVar.mo80451e();
            C17195c.m100728l(this, this.f68707a).mo26537a(hVar);
            return C17195c.m100727k(hVar);
        } catch (Throwable th) {
            C17175a.m100684d(th);
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
            C17195c.m100725i(onErrorFailedException);
            throw onErrorFailedException;
        }
    }
}
