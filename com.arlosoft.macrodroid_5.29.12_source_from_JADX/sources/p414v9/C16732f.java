package p414v9;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11111b;
import p216ba.C11113d;
import p216ba.C11114e;
import p241da.C11968a;
import p241da.C11984b;
import p251ea.C12183g;
import p262fa.C12251a;
import p292io.reactivex.internal.operators.flowable.C13045b;
import p292io.reactivex.internal.operators.flowable.C13046c;
import p292io.reactivex.internal.operators.flowable.C13047d;
import p292io.reactivex.internal.operators.flowable.C13052f;
import p292io.reactivex.internal.operators.flowable.C13053g;
import p292io.reactivex.internal.operators.flowable.C13057h;
import p292io.reactivex.internal.operators.flowable.C13059i;
import p292io.reactivex.internal.operators.flowable.C13063k;
import p292io.reactivex.internal.operators.flowable.C13067n;
import p292io.reactivex.internal.operators.flowable.C13069o;
import p292io.reactivex.internal.operators.flowable.C13075r;
import p292io.reactivex.internal.operators.flowable.C13078s;
import p292io.reactivex.internal.operators.flowable.C13080t;
import p292io.reactivex.internal.subscribers.C13206a;
import p292io.reactivex.internal.subscribers.C13207b;
import p329me.C15737b;
import p329me.C15738c;
import p329me.C15739d;
import p448z9.C17071b;

/* renamed from: v9.f */
/* compiled from: Flowable */
public abstract class C16732f<T> implements C15737b<T> {

    /* renamed from: a */
    static final int f67674a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: d */
    public static int m99312d() {
        return f67674a;
    }

    /* renamed from: e */
    public static <T> C16732f<T> m99313e() {
        return C12251a.m82980k(C13045b.f60809c);
    }

    /* renamed from: f */
    public static <T> C16732f<T> m99314f(Throwable th) {
        C11984b.m82367d(th, "throwable is null");
        return m99315g(C11968a.m82357d(th));
    }

    /* renamed from: g */
    public static <T> C16732f<T> m99315g(Callable<? extends Throwable> callable) {
        C11984b.m82367d(callable, "errorSupplier is null");
        return C12251a.m82980k(new C13046c(callable));
    }

    /* renamed from: y */
    public static <T1, T2, R> C16732f<R> m99316y(C15737b<? extends T1> bVar, C15737b<? extends T2> bVar2, C11111b<? super T1, ? super T2, ? extends R> bVar3) {
        C11984b.m82367d(bVar, "source1 is null");
        C11984b.m82367d(bVar2, "source2 is null");
        return m99317z(C11968a.m82358e(bVar3), false, m99312d(), bVar, bVar2);
    }

    /* renamed from: z */
    public static <T, R> C16732f<R> m99317z(C11114e<? super Object[], ? extends R> eVar, boolean z, int i, C15737b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m99313e();
        }
        C11984b.m82367d(eVar, "zipper is null");
        C11984b.m82368e(i, "bufferSize");
        return C12251a.m82980k(new C13080t(bVarArr, (Iterable) null, eVar, i, z));
    }

    /* renamed from: A */
    public final <U, R> C16732f<R> mo79660A(C15737b<? extends U> bVar, C11111b<? super T, ? super U, ? extends R> bVar2) {
        C11984b.m82367d(bVar, "other is null");
        return m99316y(this, bVar, bVar2);
    }

    /* renamed from: b */
    public final void mo75177b(C15738c<? super T> cVar) {
        if (cVar instanceof C16733g) {
            mo79673t((C16733g) cVar);
            return;
        }
        C11984b.m82367d(cVar, "s is null");
        mo79673t(new C13207b(cVar));
    }

    /* renamed from: h */
    public final <R> C16732f<R> mo79661h(C11114e<? super T, ? extends C15737b<? extends R>> eVar) {
        return mo79662i(eVar, false, m99312d(), m99312d());
    }

    /* renamed from: i */
    public final <R> C16732f<R> mo79662i(C11114e<? super T, ? extends C15737b<? extends R>> eVar, boolean z, int i, int i2) {
        C11984b.m82367d(eVar, "mapper is null");
        C11984b.m82368e(i, "maxConcurrency");
        C11984b.m82368e(i2, "bufferSize");
        if (!(this instanceof C12183g)) {
            return C12251a.m82980k(new C13047d(this, eVar, z, i, i2));
        }
        Object call = ((C12183g) this).call();
        if (call == null) {
            return m99313e();
        }
        return C13069o.m85319a(call, eVar);
    }

    /* renamed from: j */
    public final C16732f<T> mo79663j(C16742o oVar) {
        return mo79664k(oVar, false, m99312d());
    }

    /* renamed from: k */
    public final C16732f<T> mo79664k(C16742o oVar, boolean z, int i) {
        C11984b.m82367d(oVar, "scheduler is null");
        C11984b.m82368e(i, "bufferSize");
        return C12251a.m82980k(new C13053g(this, oVar, z, i));
    }

    /* renamed from: l */
    public final C16732f<T> mo79665l() {
        return mo79666m(m99312d(), false, true);
    }

    /* renamed from: m */
    public final C16732f<T> mo79666m(int i, boolean z, boolean z2) {
        C11984b.m82368e(i, "bufferSize");
        return C12251a.m82980k(new C13057h(this, i, z2, z, C11968a.f58166c));
    }

    /* renamed from: n */
    public final C16732f<T> mo79667n() {
        return C12251a.m82980k(new C13059i(this));
    }

    /* renamed from: o */
    public final C16732f<T> mo79668o() {
        return C12251a.m82980k(new C13063k(this));
    }

    /* renamed from: p */
    public final C16732f<T> mo79669p(C11114e<? super C16732f<Throwable>, ? extends C15737b<?>> eVar) {
        C11984b.m82367d(eVar, "handler is null");
        return C12251a.m82980k(new C13067n(this, eVar));
    }

    /* renamed from: q */
    public final C17071b mo79670q(C11113d<? super T> dVar) {
        return mo79672s(dVar, C11968a.f58169f, C11968a.f58166c, C13052f.INSTANCE);
    }

    /* renamed from: r */
    public final C17071b mo79671r(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2) {
        return mo79672s(dVar, dVar2, C11968a.f58166c, C13052f.INSTANCE);
    }

    /* renamed from: s */
    public final C17071b mo79672s(C11113d<? super T> dVar, C11113d<? super Throwable> dVar2, C11110a aVar, C11113d<? super C15739d> dVar3) {
        C11984b.m82367d(dVar, "onNext is null");
        C11984b.m82367d(dVar2, "onError is null");
        C11984b.m82367d(aVar, "onComplete is null");
        C11984b.m82367d(dVar3, "onSubscribe is null");
        C13206a aVar2 = new C13206a(dVar, dVar2, aVar, dVar3);
        mo79673t(aVar2);
        return aVar2;
    }

    /* renamed from: t */
    public final void mo79673t(C16733g<? super T> gVar) {
        C11984b.m82367d(gVar, "s is null");
        try {
            C15738c<? super Object> s = C12251a.m82988s(this, gVar);
            C11984b.m82367d(s, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo69901u(s);
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

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo69901u(C15738c<? super T> cVar);

    /* renamed from: v */
    public final C16732f<T> mo79674v(C16742o oVar) {
        C11984b.m82367d(oVar, "scheduler is null");
        return mo79675w(oVar, true);
    }

    /* renamed from: w */
    public final C16732f<T> mo79675w(C16742o oVar, boolean z) {
        C11984b.m82367d(oVar, "scheduler is null");
        return C12251a.m82980k(new C13075r(this, oVar, z));
    }

    /* renamed from: x */
    public final C16732f<T> mo79676x(long j) {
        if (j >= 0) {
            return C12251a.m82980k(new C13078s(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }
}
