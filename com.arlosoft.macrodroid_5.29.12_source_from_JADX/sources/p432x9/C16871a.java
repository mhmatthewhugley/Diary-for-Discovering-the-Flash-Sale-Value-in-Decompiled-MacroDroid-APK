package p432x9;

import java.util.Objects;
import java.util.concurrent.Callable;
import p209aa.C11078a;
import p216ba.C11114e;
import p414v9.C16742o;

/* renamed from: x9.a */
/* compiled from: RxAndroidPlugins */
public final class C16871a {

    /* renamed from: a */
    private static volatile C11114e<Callable<C16742o>, C16742o> f68122a;

    /* renamed from: b */
    private static volatile C11114e<C16742o, C16742o> f68123b;

    /* renamed from: a */
    static <T, R> R m99921a(C11114e<T, R> eVar, T t) {
        try {
            return eVar.apply(t);
        } catch (Throwable th) {
            throw C11078a.m74638a(th);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ba.e, ba.e<java.util.concurrent.Callable<v9.o>, v9.o>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p414v9.C16742o m99922b(p216ba.C11114e<java.util.concurrent.Callable<p414v9.C16742o>, p414v9.C16742o> r0, java.util.concurrent.Callable<p414v9.C16742o> r1) {
        /*
            java.lang.Object r0 = m99921a(r0, r1)
            v9.o r0 = (p414v9.C16742o) r0
            java.lang.String r1 = "Scheduler Callable returned null"
            java.util.Objects.requireNonNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p432x9.C16871a.m99922b(ba.e, java.util.concurrent.Callable):v9.o");
    }

    /* renamed from: c */
    static C16742o m99923c(Callable<C16742o> callable) {
        try {
            C16742o call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C11078a.m74638a(th);
        }
    }

    /* renamed from: d */
    public static C16742o m99924d(Callable<C16742o> callable) {
        Objects.requireNonNull(callable, "scheduler == null");
        C11114e<Callable<C16742o>, C16742o> eVar = f68122a;
        if (eVar == null) {
            return m99923c(callable);
        }
        return m99922b(eVar, callable);
    }

    /* renamed from: e */
    public static C16742o m99925e(C16742o oVar) {
        Objects.requireNonNull(oVar, "scheduler == null");
        C11114e eVar = f68123b;
        if (eVar == null) {
            return oVar;
        }
        return (C16742o) m99921a(eVar, oVar);
    }
}
