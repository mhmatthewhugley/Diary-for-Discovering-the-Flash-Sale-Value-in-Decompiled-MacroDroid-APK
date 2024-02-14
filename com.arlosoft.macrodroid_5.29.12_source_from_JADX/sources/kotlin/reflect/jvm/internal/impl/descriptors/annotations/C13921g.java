package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p362pb.C16152c;
import p379ra.C16368a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g */
/* compiled from: Annotations.kt */
public interface C13921g extends Iterable<C13915c>, C16368a {

    /* renamed from: v */
    public static final C13922a f62330v = C13922a.f62331a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a */
    /* compiled from: Annotations.kt */
    public static final class C13922a {

        /* renamed from: a */
        static final /* synthetic */ C13922a f62331a = new C13922a();

        /* renamed from: b */
        private static final C13921g f62332b = new C13923a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a */
        /* compiled from: Annotations.kt */
        public static final class C13923a implements C13921g {
            C13923a() {
            }

            /* renamed from: H */
            public /* bridge */ /* synthetic */ C13915c mo72247H(C16152c cVar) {
                return (C13915c) mo72252c(cVar);
            }

            /* renamed from: c */
            public Void mo72252c(C16152c cVar) {
                C13706o.m87929f(cVar, "fqName");
                return null;
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<C13915c> iterator() {
                return C13614t.m87748j().iterator();
            }

            /* renamed from: n1 */
            public boolean mo72249n1(C16152c cVar) {
                return C13924b.m88505b(this, cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private C13922a() {
        }

        /* renamed from: a */
        public final C13921g mo72250a(List<? extends C13915c> list) {
            C13706o.m87929f(list, "annotations");
            return list.isEmpty() ? f62332b : new C13925h(list);
        }

        /* renamed from: b */
        public final C13921g mo72251b() {
            return f62332b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$b */
    /* compiled from: Annotations.kt */
    public static final class C13924b {
        /* renamed from: a */
        public static C13915c m88504a(C13921g gVar, C16152c cVar) {
            Object obj;
            C13706o.m87929f(cVar, "fqName");
            Iterator it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C13706o.m87924a(((C13915c) obj).mo72241e(), cVar)) {
                    break;
                }
            }
            return (C13915c) obj;
        }

        /* renamed from: b */
        public static boolean m88505b(C13921g gVar, C16152c cVar) {
            C13706o.m87929f(cVar, "fqName");
            return gVar.mo72247H(cVar) != null;
        }
    }

    /* renamed from: H */
    C13915c mo72247H(C16152c cVar);

    boolean isEmpty();

    /* renamed from: n1 */
    boolean mo72249n1(C16152c cVar);
}
