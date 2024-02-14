package p292io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p216ba.C11114e;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.internal.subscriptions.C13211d;
import p329me.C15737b;
import p329me.C15738c;
import p414v9.C16732f;

/* renamed from: io.reactivex.internal.operators.flowable.o */
/* compiled from: FlowableScalarXMap */
public final class C13069o {

    /* renamed from: io.reactivex.internal.operators.flowable.o$a */
    /* compiled from: FlowableScalarXMap */
    static final class C13070a<T, R> extends C16732f<R> {

        /* renamed from: c */
        final T f60832c;

        /* renamed from: d */
        final C11114e<? super T, ? extends C15737b<? extends R>> f60833d;

        C13070a(T t, C11114e<? super T, ? extends C15737b<? extends R>> eVar) {
            this.f60832c = t;
            this.f60833d = eVar;
        }

        /* renamed from: u */
        public void mo69901u(C15738c<? super R> cVar) {
            try {
                C15737b bVar = (C15737b) C11984b.m82367d(this.f60833d.apply(this.f60832c), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            C13210c.m85515b(cVar);
                        } else {
                            cVar.mo68760a(new C13211d(cVar, call));
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        C13210c.m85516e(th, cVar);
                    }
                } else {
                    bVar.mo75177b(cVar);
                }
            } catch (Throwable th2) {
                C13210c.m85516e(th2, cVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C16732f<U> m85319a(T t, C11114e<? super T, ? extends C15737b<? extends U>> eVar) {
        return C12251a.m82980k(new C13070a(t, eVar));
    }

    /* renamed from: b */
    public static <T, R> boolean m85320b(C15737b<T> bVar, C15738c<? super R> cVar, C11114e<? super T, ? extends C15737b<? extends R>> eVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                C13210c.m85515b(cVar);
                return true;
            }
            try {
                C15737b bVar2 = (C15737b) C11984b.m82367d(eVar.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            C13210c.m85515b(cVar);
                            return true;
                        }
                        cVar.mo68760a(new C13211d(cVar, call2));
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        C13210c.m85516e(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.mo75177b(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                C13210c.m85516e(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C11078a.m74639b(th3);
            C13210c.m85516e(th3, cVar);
            return true;
        }
    }
}
