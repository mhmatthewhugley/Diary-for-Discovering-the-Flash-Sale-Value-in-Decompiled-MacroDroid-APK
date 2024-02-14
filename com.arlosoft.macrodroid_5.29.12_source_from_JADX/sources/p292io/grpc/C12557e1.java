package p292io.grpc;

import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12952q;

/* renamed from: io.grpc.e1 */
/* compiled from: ThreadLocalContextStorage */
final class C12557e1 extends C12952q.C12959g {

    /* renamed from: a */
    private static final Logger f59493a = Logger.getLogger(C12557e1.class.getName());

    /* renamed from: b */
    static final ThreadLocal<C12952q> f59494b = new ThreadLocal<>();

    C12557e1() {
    }

    /* renamed from: b */
    public C12952q mo69128b() {
        C12952q qVar = f59494b.get();
        return qVar == null ? C12952q.f60647s : qVar;
    }

    /* renamed from: c */
    public void mo69129c(C12952q qVar, C12952q qVar2) {
        if (mo69128b() != qVar) {
            f59493a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (qVar2 != C12952q.f60647s) {
            f59494b.set(qVar2);
        } else {
            f59494b.set((Object) null);
        }
    }

    /* renamed from: d */
    public C12952q mo69130d(C12952q qVar) {
        C12952q b = mo69128b();
        f59494b.set(qVar);
        return b;
    }
}
