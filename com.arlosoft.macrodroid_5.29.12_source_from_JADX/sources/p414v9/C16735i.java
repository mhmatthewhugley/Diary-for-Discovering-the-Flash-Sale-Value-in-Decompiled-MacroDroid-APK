package p414v9;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p216ba.C11114e;
import p216ba.C11116g;
import p241da.C11968a;
import p241da.C11984b;
import p251ea.C12183g;
import p262fa.C12251a;
import p270ga.C12318a;
import p292io.reactivex.internal.observers.C13025h;
import p292io.reactivex.internal.operators.flowable.C13050e;
import p292io.reactivex.internal.operators.flowable.C13061j;
import p292io.reactivex.internal.operators.observable.C13084a0;
import p292io.reactivex.internal.operators.observable.C13086b;
import p292io.reactivex.internal.operators.observable.C13089b0;
import p292io.reactivex.internal.operators.observable.C13092c;
import p292io.reactivex.internal.operators.observable.C13097c0;
import p292io.reactivex.internal.operators.observable.C13099d;
import p292io.reactivex.internal.operators.observable.C13101d0;
import p292io.reactivex.internal.operators.observable.C13103e;
import p292io.reactivex.internal.operators.observable.C13106e0;
import p292io.reactivex.internal.operators.observable.C13108f;
import p292io.reactivex.internal.operators.observable.C13110f0;
import p292io.reactivex.internal.operators.observable.C13116g;
import p292io.reactivex.internal.operators.observable.C13118g0;
import p292io.reactivex.internal.operators.observable.C13120h;
import p292io.reactivex.internal.operators.observable.C13123i;
import p292io.reactivex.internal.operators.observable.C13124i0;
import p292io.reactivex.internal.operators.observable.C13126j;
import p292io.reactivex.internal.operators.observable.C13128k;
import p292io.reactivex.internal.operators.observable.C13131l;
import p292io.reactivex.internal.operators.observable.C13133m;
import p292io.reactivex.internal.operators.observable.C13135n;
import p292io.reactivex.internal.operators.observable.C13136o;
import p292io.reactivex.internal.operators.observable.C13138p;
import p292io.reactivex.internal.operators.observable.C13141r;
import p292io.reactivex.internal.operators.observable.C13143s;
import p292io.reactivex.internal.operators.observable.C13145t;
import p292io.reactivex.internal.operators.observable.C13146u;
import p292io.reactivex.internal.operators.observable.C13148v;
import p292io.reactivex.internal.operators.observable.C13150w;
import p292io.reactivex.internal.operators.observable.C13152x;
import p292io.reactivex.internal.operators.observable.C13154y;
import p292io.reactivex.internal.operators.observable.C13157z;
import p292io.reactivex.internal.util.C13216b;
import p292io.reactivex.internal.util.C13220f;
import p448z9.C17071b;

/* renamed from: v9.i */
/* compiled from: Observable */
public abstract class C16735i<T> implements C16739l<T> {

    /* renamed from: v9.i$a */
    /* compiled from: Observable */
    static /* synthetic */ class C16736a {

        /* renamed from: a */
        static final /* synthetic */ int[] f67675a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                v9.a[] r0 = p414v9.C16727a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67675a = r0
                v9.a r1 = p414v9.C16727a.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67675a     // Catch:{ NoSuchFieldError -> 0x001d }
                v9.a r1 = p414v9.C16727a.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f67675a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v9.a r1 = p414v9.C16727a.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f67675a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v9.a r1 = p414v9.C16727a.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p414v9.C16735i.C16736a.<clinit>():void");
        }
    }

    /* renamed from: A */
    public static <T> C16735i<T> m99338A(Callable<? extends T> callable) {
        C11984b.m82367d(callable, "supplier is null");
        return C12251a.m82982m(new C13135n(callable));
    }

    /* renamed from: B */
    public static <T> C16735i<T> m99339B(Iterable<? extends T> iterable) {
        C11984b.m82367d(iterable, "source is null");
        return C12251a.m82982m(new C13136o(iterable));
    }

    /* renamed from: D */
    public static C16735i<Long> m99340D(long j, long j2, TimeUnit timeUnit) {
        return m99341E(j, j2, timeUnit, C12318a.m83029a());
    }

    /* renamed from: E */
    public static C16735i<Long> m99341E(long j, long j2, TimeUnit timeUnit, C16742o oVar) {
        C11984b.m82367d(timeUnit, "unit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13143s(Math.max(0, j), Math.max(0, j2), timeUnit, oVar));
    }

    /* renamed from: F */
    public static <T> C16735i<T> m99342F(T t) {
        C11984b.m82367d(t, "The item is null");
        return C12251a.m82982m(new C13145t(t));
    }

    /* renamed from: H */
    public static <T> C16735i<T> m99343H(C16739l<? extends T> lVar, C16739l<? extends T> lVar2) {
        C11984b.m82367d(lVar, "source1 is null");
        C11984b.m82367d(lVar2, "source2 is null");
        return m99355z(lVar, lVar2).mo79714w(C11968a.m82356c(), false, 2);
    }

    /* renamed from: L */
    public static C16735i<Integer> m99344L(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        } else if (i2 == 0) {
            return m99354s();
        } else {
            if (i2 == 1) {
                return m99342F(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C12251a.m82982m(new C13152x(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    /* renamed from: a0 */
    private C16735i<T> m99345a0(long j, TimeUnit timeUnit, C16739l<? extends T> lVar, C16742o oVar) {
        C11984b.m82367d(timeUnit, "timeUnit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13110f0(this, j, timeUnit, oVar, lVar));
    }

    /* renamed from: b0 */
    public static C16735i<Long> m99346b0(long j, TimeUnit timeUnit) {
        return m99347c0(j, timeUnit, C12318a.m83029a());
    }

    /* renamed from: c0 */
    public static C16735i<Long> m99347c0(long j, TimeUnit timeUnit, C16742o oVar) {
        C11984b.m82367d(timeUnit, "unit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13118g0(Math.max(j, 0), timeUnit, oVar));
    }

    /* renamed from: e */
    public static int m99348e() {
        return C16732f.m99312d();
    }

    /* renamed from: g */
    public static <T> C16735i<T> m99349g(C16739l<? extends C16739l<? extends T>> lVar) {
        return m99351h(lVar, m99348e());
    }

    /* renamed from: g0 */
    public static <T> C16735i<T> m99350g0(C16739l<T> lVar) {
        C11984b.m82367d(lVar, "source is null");
        if (lVar instanceof C16735i) {
            return C12251a.m82982m((C16735i) lVar);
        }
        return C12251a.m82982m(new C13138p(lVar));
    }

    /* renamed from: h */
    public static <T> C16735i<T> m99351h(C16739l<? extends C16739l<? extends T>> lVar, int i) {
        C11984b.m82367d(lVar, "sources is null");
        C11984b.m82368e(i, "prefetch");
        return C12251a.m82982m(new C13092c(lVar, C11968a.m82356c(), i, C13220f.IMMEDIATE));
    }

    /* renamed from: k */
    public static <T> C16735i<T> m99352k(C16738k<T> kVar) {
        C11984b.m82367d(kVar, "source is null");
        return C12251a.m82982m(new C13099d(kVar));
    }

    /* renamed from: q */
    private C16735i<T> m99353q(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11110a aVar2) {
        C11984b.m82367d(dVar, "onNext is null");
        C11984b.m82367d(dVar2, "onError is null");
        C11984b.m82367d(aVar, "onComplete is null");
        C11984b.m82367d(aVar2, "onAfterTerminate is null");
        return C12251a.m82982m(new C13116g(this, dVar, dVar2, aVar, aVar2));
    }

    /* renamed from: s */
    public static <T> C16735i<T> m99354s() {
        return C12251a.m82982m(C13123i.f60931a);
    }

    /* renamed from: z */
    public static <T> C16735i<T> m99355z(T... tArr) {
        C11984b.m82367d(tArr, "items is null");
        if (tArr.length == 0) {
            return m99354s();
        }
        if (tArr.length == 1) {
            return m99342F(tArr[0]);
        }
        return C12251a.m82982m(new C13133m(tArr));
    }

    /* renamed from: C */
    public final C16728b mo79677C() {
        return C12251a.m82979j(new C13141r(this));
    }

    /* renamed from: G */
    public final <R> C16735i<R> mo79678G(C11114e<? super T, ? extends R> eVar) {
        C11984b.m82367d(eVar, "mapper is null");
        return C12251a.m82982m(new C13146u(this, eVar));
    }

    /* renamed from: I */
    public final C16735i<T> mo79679I(C16742o oVar) {
        return mo79680J(oVar, false, m99348e());
    }

    /* renamed from: J */
    public final C16735i<T> mo79680J(C16742o oVar, boolean z, int i) {
        C11984b.m82367d(oVar, "scheduler is null");
        C11984b.m82368e(i, "bufferSize");
        return C12251a.m82982m(new C13148v(this, oVar, z, i));
    }

    /* renamed from: K */
    public final C16735i<T> mo79681K(C11114e<? super Throwable, ? extends C16739l<? extends T>> eVar) {
        C11984b.m82367d(eVar, "resumeFunction is null");
        return C12251a.m82982m(new C13150w(this, eVar, false));
    }

    /* renamed from: M */
    public final C16734h<T> mo79682M() {
        return C12251a.m82981l(new C13157z(this));
    }

    /* renamed from: N */
    public final C16747p<T> mo79683N() {
        return C12251a.m82983n(new C13084a0(this, null));
    }

    /* renamed from: O */
    public final C17071b mo79684O() {
        return mo79687R(C11968a.m82355b(), C11968a.f58169f, C11968a.f58166c, C11968a.m82355b());
    }

    /* renamed from: P */
    public final C17071b mo79685P(C11113d<? super T> dVar) {
        return mo79687R(dVar, C11968a.f58169f, C11968a.f58166c, C11968a.m82355b());
    }

    /* renamed from: Q */
    public final C17071b mo79686Q(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2) {
        return mo79687R(dVar, dVar2, C11968a.f58166c, C11968a.m82355b());
    }

    /* renamed from: R */
    public final C17071b mo79687R(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11113d<? super C17071b> dVar3) {
        C11984b.m82367d(dVar, "onNext is null");
        C11984b.m82367d(dVar2, "onError is null");
        C11984b.m82367d(aVar, "onComplete is null");
        C11984b.m82367d(dVar3, "onSubscribe is null");
        C13025h hVar = new C13025h(dVar, dVar2, aVar, dVar3);
        mo79695a(hVar);
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract void mo68827S(C16741n<? super T> nVar);

    /* renamed from: T */
    public final C16735i<T> mo79688T(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13089b0(this, oVar));
    }

    /* renamed from: U */
    public final <E extends C16741n<? super T>> E mo79689U(E e) {
        mo79695a(e);
        return e;
    }

    /* renamed from: V */
    public final C16735i<T> mo79690V(long j) {
        if (j >= 0) {
            return C12251a.m82982m(new C13097c0(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    /* renamed from: W */
    public final C16735i<T> mo79691W(C11116g<? super T> gVar) {
        C11984b.m82367d(gVar, "predicate is null");
        return C12251a.m82982m(new C13101d0(this, gVar));
    }

    /* renamed from: X */
    public final C16735i<T> mo79692X(long j, TimeUnit timeUnit) {
        return mo79693Y(j, timeUnit, C12318a.m83029a());
    }

    /* renamed from: Y */
    public final C16735i<T> mo79693Y(long j, TimeUnit timeUnit, C16742o oVar) {
        C11984b.m82367d(timeUnit, "unit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13106e0(this, j, timeUnit, oVar));
    }

    /* renamed from: Z */
    public final C16735i<T> mo79694Z(long j, TimeUnit timeUnit) {
        return m99345a0(j, timeUnit, (C16739l) null, C12318a.m83029a());
    }

    /* renamed from: a */
    public final void mo79695a(C16741n<? super T> nVar) {
        C11984b.m82367d(nVar, "observer is null");
        try {
            C16741n<? super Object> u = C12251a.m82990u(this, nVar);
            C11984b.m82367d(u, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo68827S(u);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C12251a.m82985p(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C16735i<List<T>> mo79696b(int i) {
        return mo79697c(i, i);
    }

    /* renamed from: c */
    public final C16735i<List<T>> mo79697c(int i, int i2) {
        return mo79698d(i, i2, C13216b.m85536d());
    }

    /* renamed from: d */
    public final <U extends Collection<? super T>> C16735i<U> mo79698d(int i, int i2, Callable<U> callable) {
        C11984b.m82368e(i, "count");
        C11984b.m82368e(i2, "skip");
        C11984b.m82367d(callable, "bufferSupplier is null");
        return C12251a.m82982m(new C13086b(this, i, i2, callable));
    }

    /* renamed from: d0 */
    public final C16732f<T> mo79699d0(C16727a aVar) {
        C13050e eVar = new C13050e(this);
        int i = C16736a.f67675a[aVar.ordinal()];
        if (i == 1) {
            return eVar.mo79667n();
        }
        if (i == 2) {
            return eVar.mo79668o();
        }
        if (i == 3) {
            return eVar;
        }
        if (i != 4) {
            return eVar.mo79665l();
        }
        return C12251a.m82980k(new C13061j(eVar));
    }

    /* renamed from: e0 */
    public final C16747p<List<T>> mo79700e0() {
        return mo79702f0(16);
    }

    /* renamed from: f */
    public final <R> C16735i<R> mo79701f(C16740m<? super T, ? extends R> mVar) {
        return m99350g0(((C16740m) C11984b.m82367d(mVar, "composer is null")).mo62236a(this));
    }

    /* renamed from: f0 */
    public final C16747p<List<T>> mo79702f0(int i) {
        C11984b.m82368e(i, "capacityHint");
        return C12251a.m82983n(new C13124i0(this, i));
    }

    /* renamed from: i */
    public final <R> C16735i<R> mo79703i(C11114e<? super T, ? extends C16739l<? extends R>> eVar) {
        return mo79704j(eVar, 2);
    }

    /* renamed from: j */
    public final <R> C16735i<R> mo79704j(C11114e<? super T, ? extends C16739l<? extends R>> eVar, int i) {
        C11984b.m82367d(eVar, "mapper is null");
        C11984b.m82368e(i, "prefetch");
        if (!(this instanceof C12183g)) {
            return C12251a.m82982m(new C13092c(this, eVar, i, C13220f.IMMEDIATE));
        }
        Object call = ((C12183g) this).call();
        if (call == null) {
            return m99354s();
        }
        return C13154y.m85414a(call, eVar);
    }

    /* renamed from: l */
    public final C16735i<T> mo79705l(long j, TimeUnit timeUnit) {
        return mo79706m(j, timeUnit, C12318a.m83029a());
    }

    /* renamed from: m */
    public final C16735i<T> mo79706m(long j, TimeUnit timeUnit, C16742o oVar) {
        C11984b.m82367d(timeUnit, "unit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82982m(new C13103e(this, j, timeUnit, oVar));
    }

    /* renamed from: n */
    public final C16735i<T> mo79707n(C11110a aVar) {
        C11984b.m82367d(aVar, "onFinally is null");
        return C12251a.m82982m(new C13108f(this, aVar));
    }

    /* renamed from: o */
    public final C16735i<T> mo79708o(C11110a aVar) {
        return m99353q(C11968a.m82355b(), C11968a.m82355b(), aVar, C11968a.f58166c);
    }

    /* renamed from: p */
    public final C16735i<T> mo79709p(C11110a aVar) {
        return mo79710r(C11968a.m82355b(), aVar);
    }

    /* renamed from: r */
    public final C16735i<T> mo79710r(C11113d<? super C17071b> dVar, C11110a aVar) {
        C11984b.m82367d(dVar, "onSubscribe is null");
        C11984b.m82367d(aVar, "onDispose is null");
        return C12251a.m82982m(new C13120h(this, dVar, aVar));
    }

    /* renamed from: t */
    public final C16735i<T> mo79711t(C11116g<? super T> gVar) {
        C11984b.m82367d(gVar, "predicate is null");
        return C12251a.m82982m(new C13126j(this, gVar));
    }

    /* renamed from: u */
    public final <R> C16735i<R> mo79712u(C11114e<? super T, ? extends C16739l<? extends R>> eVar) {
        return mo79713v(eVar, false);
    }

    /* renamed from: v */
    public final <R> C16735i<R> mo79713v(C11114e<? super T, ? extends C16739l<? extends R>> eVar, boolean z) {
        return mo79714w(eVar, z, Integer.MAX_VALUE);
    }

    /* renamed from: w */
    public final <R> C16735i<R> mo79714w(C11114e<? super T, ? extends C16739l<? extends R>> eVar, boolean z, int i) {
        return mo79715x(eVar, z, i, m99348e());
    }

    /* renamed from: x */
    public final <R> C16735i<R> mo79715x(C11114e<? super T, ? extends C16739l<? extends R>> eVar, boolean z, int i, int i2) {
        C11984b.m82367d(eVar, "mapper is null");
        C11984b.m82368e(i, "maxConcurrency");
        C11984b.m82368e(i2, "bufferSize");
        if (!(this instanceof C12183g)) {
            return C12251a.m82982m(new C13128k(this, eVar, z, i, i2));
        }
        Object call = ((C12183g) this).call();
        if (call == null) {
            return m99354s();
        }
        return C13154y.m85414a(call, eVar);
    }

    /* renamed from: y */
    public final <U> C16735i<U> mo79716y(C11114e<? super T, ? extends Iterable<? extends U>> eVar) {
        C11984b.m82367d(eVar, "mapper is null");
        return C12251a.m82982m(new C13131l(this, eVar));
    }
}
