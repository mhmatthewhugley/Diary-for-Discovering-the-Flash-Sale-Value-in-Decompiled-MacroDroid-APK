package p414v9;

import java.util.concurrent.TimeUnit;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p216ba.C11114e;
import p241da.C11968a;
import p241da.C11984b;
import p251ea.C12178b;
import p262fa.C12251a;
import p270ga.C12318a;
import p292io.reactivex.internal.observers.C13021d;
import p292io.reactivex.internal.operators.completable.C13027a;
import p292io.reactivex.internal.operators.completable.C13029b;
import p292io.reactivex.internal.operators.completable.C13030c;
import p292io.reactivex.internal.operators.completable.C13032d;
import p292io.reactivex.internal.operators.completable.C13033e;
import p292io.reactivex.internal.operators.completable.C13035f;
import p292io.reactivex.internal.operators.completable.C13037g;
import p292io.reactivex.internal.operators.completable.C13039h;
import p292io.reactivex.internal.operators.completable.C13041i;
import p292io.reactivex.internal.operators.completable.C13043j;
import p329me.C15737b;
import p448z9.C17071b;

/* renamed from: v9.b */
/* compiled from: Completable */
public abstract class C16728b implements C16730d {
    /* renamed from: c */
    public static C16728b m99294c() {
        return C12251a.m82979j(C13029b.f60784a);
    }

    /* renamed from: f */
    private C16728b m99295f(C11113d<? super C17071b> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11110a aVar2, C11110a aVar3, C11110a aVar4) {
        C11984b.m82367d(dVar, "onSubscribe is null");
        C11984b.m82367d(dVar2, "onError is null");
        C11984b.m82367d(aVar, "onComplete is null");
        C11984b.m82367d(aVar2, "onTerminate is null");
        C11984b.m82367d(aVar3, "onAfterTerminate is null");
        C11984b.m82367d(aVar4, "onDispose is null");
        return C12251a.m82979j(new C13037g(this, dVar, dVar2, aVar, aVar2, aVar3, aVar4));
    }

    /* renamed from: g */
    public static <T> C16728b m99296g(C15737b<T> bVar) {
        C11984b.m82367d(bVar, "publisher is null");
        return C12251a.m82979j(new C13030c(bVar));
    }

    /* renamed from: h */
    public static C16728b m99297h(C16730d... dVarArr) {
        C11984b.m82367d(dVarArr, "sources is null");
        if (dVarArr.length == 0) {
            return m99294c();
        }
        if (dVarArr.length == 1) {
            return m99301r(dVarArr[0]);
        }
        return C12251a.m82979j(new C13033e(dVarArr));
    }

    /* renamed from: n */
    public static C16728b m99298n(long j, TimeUnit timeUnit) {
        return m99299o(j, timeUnit, C12318a.m83029a());
    }

    /* renamed from: o */
    public static C16728b m99299o(long j, TimeUnit timeUnit, C16742o oVar) {
        C11984b.m82367d(timeUnit, "unit is null");
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82979j(new C13041i(j, timeUnit, oVar));
    }

    /* renamed from: q */
    private static NullPointerException m99300q(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: r */
    public static C16728b m99301r(C16730d dVar) {
        C11984b.m82367d(dVar, "source is null");
        if (dVar instanceof C16728b) {
            return C12251a.m82979j((C16728b) dVar);
        }
        return C12251a.m82979j(new C13032d(dVar));
    }

    /* renamed from: a */
    public final void mo79652a(C16729c cVar) {
        C11984b.m82367d(cVar, "s is null");
        try {
            C16729c t = C12251a.m82989t(this, cVar);
            C11984b.m82367d(t, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo69894l(t);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C12251a.m82985p(th);
            throw m99300q(th);
        }
    }

    /* renamed from: d */
    public final C16728b mo79653d(C11110a aVar) {
        C11984b.m82367d(aVar, "onFinally is null");
        return C12251a.m82979j(new C13027a(this, aVar));
    }

    /* renamed from: e */
    public final C16728b mo79654e(C11110a aVar) {
        C11113d b = C11968a.m82355b();
        C11113d b2 = C11968a.m82355b();
        C11110a aVar2 = C11968a.f58166c;
        return m99295f(b, b2, aVar, aVar2, aVar2, aVar2);
    }

    /* renamed from: i */
    public final C16728b mo79655i(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82979j(new C13035f(this, oVar));
    }

    /* renamed from: j */
    public final C16728b mo79656j(C11114e<? super C16732f<Throwable>, ? extends C15737b<?>> eVar) {
        return m99296g(mo79659p().mo79669p(eVar));
    }

    /* renamed from: k */
    public final C17071b mo79657k(C11110a aVar, C11113d<? super Throwable> dVar) {
        C11984b.m82367d(dVar, "onError is null");
        C11984b.m82367d(aVar, "onComplete is null");
        C13021d dVar2 = new C13021d(dVar, aVar);
        mo79652a(dVar2);
        return dVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo69894l(C16729c cVar);

    /* renamed from: m */
    public final C16728b mo79658m(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82979j(new C13039h(this, oVar));
    }

    /* renamed from: p */
    public final <T> C16732f<T> mo79659p() {
        if (this instanceof C12178b) {
            return ((C12178b) this).mo68462c();
        }
        return C12251a.m82980k(new C13043j(this));
    }
}
