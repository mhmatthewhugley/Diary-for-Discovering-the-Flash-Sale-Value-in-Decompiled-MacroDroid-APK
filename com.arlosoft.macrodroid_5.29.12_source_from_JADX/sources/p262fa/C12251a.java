package p262fa;

import java.util.concurrent.Callable;
import p216ba.C11111b;
import p216ba.C11113d;
import p216ba.C11114e;
import p241da.C11984b;
import p292io.reactivex.exceptions.CompositeException;
import p292io.reactivex.exceptions.MissingBackpressureException;
import p292io.reactivex.exceptions.OnErrorNotImplementedException;
import p292io.reactivex.exceptions.UndeliverableException;
import p292io.reactivex.internal.util.C13221g;
import p329me.C15738c;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16732f;
import p414v9.C16734h;
import p414v9.C16735i;
import p414v9.C16741n;
import p414v9.C16742o;
import p414v9.C16747p;
import p414v9.C16748q;

/* renamed from: fa.a */
/* compiled from: RxJavaPlugins */
public final class C12251a {

    /* renamed from: a */
    static volatile C11113d<? super Throwable> f58848a;

    /* renamed from: b */
    static volatile C11114e<? super Runnable, ? extends Runnable> f58849b;

    /* renamed from: c */
    static volatile C11114e<? super Callable<C16742o>, ? extends C16742o> f58850c;

    /* renamed from: d */
    static volatile C11114e<? super Callable<C16742o>, ? extends C16742o> f58851d;

    /* renamed from: e */
    static volatile C11114e<? super Callable<C16742o>, ? extends C16742o> f58852e;

    /* renamed from: f */
    static volatile C11114e<? super Callable<C16742o>, ? extends C16742o> f58853f;

    /* renamed from: g */
    static volatile C11114e<? super C16742o, ? extends C16742o> f58854g;

    /* renamed from: h */
    static volatile C11114e<? super C16742o, ? extends C16742o> f58855h;

    /* renamed from: i */
    static volatile C11114e<? super C16732f, ? extends C16732f> f58856i;

    /* renamed from: j */
    static volatile C11114e<? super C16735i, ? extends C16735i> f58857j;

    /* renamed from: k */
    static volatile C11114e<? super C16734h, ? extends C16734h> f58858k;

    /* renamed from: l */
    static volatile C11114e<? super C16747p, ? extends C16747p> f58859l;

    /* renamed from: m */
    static volatile C11114e<? super C16728b, ? extends C16728b> f58860m;

    /* renamed from: n */
    static volatile C11111b<? super C16732f, ? super C15738c, ? extends C15738c> f58861n;

    /* renamed from: o */
    static volatile C11111b<? super C16735i, ? super C16741n, ? extends C16741n> f58862o;

    /* renamed from: p */
    static volatile C11111b<? super C16747p, ? super C16748q, ? extends C16748q> f58863p;

    /* renamed from: q */
    static volatile C11111b<? super C16728b, ? super C16729c, ? extends C16729c> f58864q;

    /* renamed from: a */
    static <T, U, R> R m82970a(C11111b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.mo62247a(t, u);
        } catch (Throwable th) {
            throw C13221g.m85550d(th);
        }
    }

    /* renamed from: b */
    static <T, R> R m82971b(C11114e<T, R> eVar, T t) {
        try {
            return eVar.apply(t);
        } catch (Throwable th) {
            throw C13221g.m85550d(th);
        }
    }

    /* renamed from: c */
    static C16742o m82972c(C11114e<? super Callable<C16742o>, ? extends C16742o> eVar, Callable<C16742o> callable) {
        return (C16742o) C11984b.m82367d(m82971b(eVar, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static C16742o m82973d(Callable<C16742o> callable) {
        try {
            return (C16742o) C11984b.m82367d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C13221g.m85550d(th);
        }
    }

    /* renamed from: e */
    public static C16742o m82974e(Callable<C16742o> callable) {
        C11984b.m82367d(callable, "Scheduler Callable can't be null");
        C11114e<? super Callable<C16742o>, ? extends C16742o> eVar = f58850c;
        if (eVar == null) {
            return m82973d(callable);
        }
        return m82972c(eVar, callable);
    }

    /* renamed from: f */
    public static C16742o m82975f(Callable<C16742o> callable) {
        C11984b.m82367d(callable, "Scheduler Callable can't be null");
        C11114e<? super Callable<C16742o>, ? extends C16742o> eVar = f58852e;
        if (eVar == null) {
            return m82973d(callable);
        }
        return m82972c(eVar, callable);
    }

    /* renamed from: g */
    public static C16742o m82976g(Callable<C16742o> callable) {
        C11984b.m82367d(callable, "Scheduler Callable can't be null");
        C11114e<? super Callable<C16742o>, ? extends C16742o> eVar = f58853f;
        if (eVar == null) {
            return m82973d(callable);
        }
        return m82972c(eVar, callable);
    }

    /* renamed from: h */
    public static C16742o m82977h(Callable<C16742o> callable) {
        C11984b.m82367d(callable, "Scheduler Callable can't be null");
        C11114e<? super Callable<C16742o>, ? extends C16742o> eVar = f58851d;
        if (eVar == null) {
            return m82973d(callable);
        }
        return m82972c(eVar, callable);
    }

    /* renamed from: i */
    static boolean m82978i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static C16728b m82979j(C16728b bVar) {
        C11114e<? super C16728b, ? extends C16728b> eVar = f58860m;
        return eVar != null ? (C16728b) m82971b(eVar, bVar) : bVar;
    }

    /* renamed from: k */
    public static <T> C16732f<T> m82980k(C16732f<T> fVar) {
        C11114e<? super C16732f, ? extends C16732f> eVar = f58856i;
        return eVar != null ? (C16732f) m82971b(eVar, fVar) : fVar;
    }

    /* renamed from: l */
    public static <T> C16734h<T> m82981l(C16734h<T> hVar) {
        C11114e<? super C16734h, ? extends C16734h> eVar = f58858k;
        return eVar != null ? (C16734h) m82971b(eVar, hVar) : hVar;
    }

    /* renamed from: m */
    public static <T> C16735i<T> m82982m(C16735i<T> iVar) {
        C11114e<? super C16735i, ? extends C16735i> eVar = f58857j;
        return eVar != null ? (C16735i) m82971b(eVar, iVar) : iVar;
    }

    /* renamed from: n */
    public static <T> C16747p<T> m82983n(C16747p<T> pVar) {
        C11114e<? super C16747p, ? extends C16747p> eVar = f58859l;
        return eVar != null ? (C16747p) m82971b(eVar, pVar) : pVar;
    }

    /* renamed from: o */
    public static C16742o m82984o(C16742o oVar) {
        C11114e<? super C16742o, ? extends C16742o> eVar = f58854g;
        if (eVar == null) {
            return oVar;
        }
        return (C16742o) m82971b(eVar, oVar);
    }

    /* renamed from: p */
    public static void m82985p(Throwable th) {
        C11113d<? super Throwable> dVar = f58848a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m82978i(th)) {
            th = new UndeliverableException(th);
        }
        if (dVar != null) {
            try {
                dVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m82992w(th2);
            }
        }
        th.printStackTrace();
        m82992w(th);
    }

    /* renamed from: q */
    public static C16742o m82986q(C16742o oVar) {
        C11114e<? super C16742o, ? extends C16742o> eVar = f58855h;
        if (eVar == null) {
            return oVar;
        }
        return (C16742o) m82971b(eVar, oVar);
    }

    /* renamed from: r */
    public static Runnable m82987r(Runnable runnable) {
        C11984b.m82367d(runnable, "run is null");
        C11114e<? super Runnable, ? extends Runnable> eVar = f58849b;
        if (eVar == null) {
            return runnable;
        }
        return (Runnable) m82971b(eVar, runnable);
    }

    /* renamed from: s */
    public static <T> C15738c<? super T> m82988s(C16732f<T> fVar, C15738c<? super T> cVar) {
        C11111b<? super C16732f, ? super C15738c, ? extends C15738c> bVar = f58861n;
        return bVar != null ? (C15738c) m82970a(bVar, fVar, cVar) : cVar;
    }

    /* renamed from: t */
    public static C16729c m82989t(C16728b bVar, C16729c cVar) {
        C11111b<? super C16728b, ? super C16729c, ? extends C16729c> bVar2 = f58864q;
        return bVar2 != null ? (C16729c) m82970a(bVar2, bVar, cVar) : cVar;
    }

    /* renamed from: u */
    public static <T> C16741n<? super T> m82990u(C16735i<T> iVar, C16741n<? super T> nVar) {
        C11111b<? super C16735i, ? super C16741n, ? extends C16741n> bVar = f58862o;
        return bVar != null ? (C16741n) m82970a(bVar, iVar, nVar) : nVar;
    }

    /* renamed from: v */
    public static <T> C16748q<? super T> m82991v(C16747p<T> pVar, C16748q<? super T> qVar) {
        C11111b<? super C16747p, ? super C16748q, ? extends C16748q> bVar = f58863p;
        return bVar != null ? (C16748q) m82970a(bVar, pVar, qVar) : qVar;
    }

    /* renamed from: w */
    static void m82992w(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
