package p288ib;

import java.util.Iterator;
import kotlin.jvm.internal.C13706o;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: ib.e0 */
/* compiled from: javaElements.kt */
public interface C12489e0 extends C12486d {

    /* renamed from: ib.e0$a */
    /* compiled from: javaElements.kt */
    public static final class C12490a {
        /* renamed from: a */
        public static C12479a m83577a(C12489e0 e0Var, C16152c cVar) {
            T t;
            C13706o.m87929f(cVar, "fqName");
            Iterator<T> it = e0Var.getAnnotations().iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C16151b d = ((C12479a) next).mo68950d();
                if (d != null) {
                    t = d.mo78544b();
                }
                if (C13706o.m87924a(t, cVar)) {
                    t = next;
                    break;
                }
            }
            return (C12479a) t;
        }
    }
}
