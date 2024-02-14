package p414v9;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p216ba.C11114e;
import p241da.C11968a;
import p241da.C11984b;
import p251ea.C12178b;
import p251ea.C12179c;
import p262fa.C12251a;
import p292io.reactivex.internal.observers.C13022e;
import p292io.reactivex.internal.operators.flowable.C13073q;
import p292io.reactivex.internal.operators.single.C13158a;
import p292io.reactivex.internal.operators.single.C13159b;
import p292io.reactivex.internal.operators.single.C13161c;
import p292io.reactivex.internal.operators.single.C13163d;
import p292io.reactivex.internal.operators.single.C13164e;
import p292io.reactivex.internal.operators.single.C13167f;
import p292io.reactivex.internal.operators.single.C13168g;
import p292io.reactivex.internal.operators.single.C13169h;
import p292io.reactivex.internal.operators.single.C13171i;
import p292io.reactivex.internal.operators.single.C13173j;
import p292io.reactivex.internal.operators.single.C13175k;
import p329me.C15737b;
import p448z9.C17071b;

/* renamed from: v9.p */
/* compiled from: Single */
public abstract class C16747p<T> implements C16749r<T> {
    /* renamed from: d */
    public static <T> C16747p<T> m99408d(Callable<? extends C16749r<? extends T>> callable) {
        C11984b.m82367d(callable, "singleSupplier is null");
        return C12251a.m82983n(new C13158a(callable));
    }

    /* renamed from: g */
    public static <T> C16747p<T> m99409g(Throwable th) {
        C11984b.m82367d(th, "error is null");
        return m99410h(C11968a.m82357d(th));
    }

    /* renamed from: h */
    public static <T> C16747p<T> m99410h(Callable<? extends Throwable> callable) {
        C11984b.m82367d(callable, "errorSupplier is null");
        return C12251a.m82983n(new C13163d(callable));
    }

    /* renamed from: j */
    public static <T> C16747p<T> m99411j(Callable<? extends T> callable) {
        C11984b.m82367d(callable, "callable is null");
        return C12251a.m82983n(new C13167f(callable));
    }

    /* renamed from: k */
    public static <T> C16747p<T> m99412k(T t) {
        C11984b.m82367d(t, "value is null");
        return C12251a.m82983n(new C13168g(t));
    }

    /* renamed from: t */
    private static <T> C16747p<T> m99413t(C16732f<T> fVar) {
        return C12251a.m82983n(new C13073q(fVar, null));
    }

    /* renamed from: a */
    public final void mo79722a(C16748q<? super T> qVar) {
        C11984b.m82367d(qVar, "subscriber is null");
        C16748q<? super Object> v = C12251a.m82991v(this, qVar);
        C11984b.m82367d(v, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo69927p(v);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11078a.m74639b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final C16747p<T> mo79723e(C11110a aVar) {
        C11984b.m82367d(aVar, "onFinally is null");
        return C12251a.m82983n(new C13159b(this, aVar));
    }

    /* renamed from: f */
    public final C16747p<T> mo79724f(C11113d<? super C17071b> dVar) {
        C11984b.m82367d(dVar, "onSubscribe is null");
        return C12251a.m82983n(new C13161c(this, dVar));
    }

    /* renamed from: i */
    public final <R> C16747p<R> mo79725i(C11114e<? super T, ? extends C16749r<? extends R>> eVar) {
        C11984b.m82367d(eVar, "mapper is null");
        return C12251a.m82983n(new C13164e(this, eVar));
    }

    /* renamed from: l */
    public final C16747p<T> mo79726l(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82983n(new C13169h(this, oVar));
    }

    /* renamed from: m */
    public final C16747p<T> mo79727m(C11114e<? super C16732f<Throwable>, ? extends C15737b<?>> eVar) {
        return m99413t(mo79731r().mo79669p(eVar));
    }

    /* renamed from: n */
    public final C17071b mo79728n(C11113d<? super T> dVar) {
        return mo79729o(dVar, C11968a.f58169f);
    }

    /* renamed from: o */
    public final C17071b mo79729o(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2) {
        C11984b.m82367d(dVar, "onSuccess is null");
        C11984b.m82367d(dVar2, "onError is null");
        C13022e eVar = new C13022e(dVar, dVar2);
        mo79722a(eVar);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo69927p(C16748q<? super T> qVar);

    /* renamed from: q */
    public final C16747p<T> mo79730q(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82983n(new C13171i(this, oVar));
    }

    /* renamed from: r */
    public final C16732f<T> mo79731r() {
        if (this instanceof C12178b) {
            return ((C12178b) this).mo68462c();
        }
        return C12251a.m82980k(new C13173j(this));
    }

    /* renamed from: s */
    public final C16735i<T> mo79732s() {
        if (this instanceof C12179c) {
            return ((C12179c) this).mo68463b();
        }
        return C12251a.m82982m(new C13175k(this));
    }
}
