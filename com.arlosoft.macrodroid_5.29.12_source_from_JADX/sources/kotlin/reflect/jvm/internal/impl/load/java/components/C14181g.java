package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import p288ib.C12492g;
import p288ib.C12497l;
import p288ib.C12499n;
import p288ib.C12502q;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.g */
/* compiled from: JavaResolverCache */
public interface C14181g {

    /* renamed from: a */
    public static final C14181g f62863a = new C14182a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.g$a */
    /* compiled from: JavaResolverCache */
    static class C14182a implements C14181g {
        C14182a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m89694f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo72700a(C12492g gVar, C13948e eVar) {
            if (gVar == null) {
                m89694f(7);
            }
            if (eVar == null) {
                m89694f(8);
            }
        }

        /* renamed from: b */
        public void mo72701b(C12502q qVar, C14156y0 y0Var) {
            if (qVar == null) {
                m89694f(1);
            }
            if (y0Var == null) {
                m89694f(2);
            }
        }

        /* renamed from: c */
        public C13948e mo72702c(C16152c cVar) {
            if (cVar != null) {
                return null;
            }
            m89694f(0);
            return null;
        }

        /* renamed from: d */
        public void mo72703d(C12499n nVar, C14140t0 t0Var) {
            if (nVar == null) {
                m89694f(5);
            }
            if (t0Var == null) {
                m89694f(6);
            }
        }

        /* renamed from: e */
        public void mo72704e(C12497l lVar, C14052l lVar2) {
            if (lVar == null) {
                m89694f(3);
            }
            if (lVar2 == null) {
                m89694f(4);
            }
        }
    }

    /* renamed from: a */
    void mo72700a(C12492g gVar, C13948e eVar);

    /* renamed from: b */
    void mo72701b(C12502q qVar, C14156y0 y0Var);

    /* renamed from: c */
    C13948e mo72702c(C16152c cVar);

    /* renamed from: d */
    void mo72703d(C12499n nVar, C14140t0 t0Var);

    /* renamed from: e */
    void mo72704e(C12497l lVar, C14052l lVar2);
}
