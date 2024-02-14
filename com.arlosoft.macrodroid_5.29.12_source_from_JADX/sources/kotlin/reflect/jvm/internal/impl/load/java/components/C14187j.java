package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p288ib.C12503r;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.j */
/* compiled from: SignaturePropagator */
public interface C14187j {

    /* renamed from: a */
    public static final C14187j f62868a = new C14188a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.j$a */
    /* compiled from: SignaturePropagator */
    static class C14188a implements C14187j {
        C14188a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m89706c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public C14189b mo72707a(C12503r rVar, C13948e eVar, C14900e0 e0Var, C14900e0 e0Var2, List<C13966i1> list, List<C13950e1> list2) {
            if (rVar == null) {
                m89706c(0);
            }
            if (eVar == null) {
                m89706c(1);
            }
            if (e0Var == null) {
                m89706c(2);
            }
            if (list == null) {
                m89706c(3);
            }
            if (list2 == null) {
                m89706c(4);
            }
            return new C14189b(e0Var, e0Var2, list, list2, Collections.emptyList(), false);
        }

        /* renamed from: b */
        public void mo72708b(C13936b bVar, List<String> list) {
            if (bVar == null) {
                m89706c(5);
            }
            if (list == null) {
                m89706c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.j$b */
    /* compiled from: SignaturePropagator */
    public static class C14189b {

        /* renamed from: a */
        private final C14900e0 f62869a;

        /* renamed from: b */
        private final C14900e0 f62870b;

        /* renamed from: c */
        private final List<C13966i1> f62871c;

        /* renamed from: d */
        private final List<C13950e1> f62872d;

        /* renamed from: e */
        private final List<String> f62873e;

        /* renamed from: f */
        private final boolean f62874f;

        public C14189b(C14900e0 e0Var, C14900e0 e0Var2, List<C13966i1> list, List<C13950e1> list2, List<String> list3, boolean z) {
            if (e0Var == null) {
                m89709a(0);
            }
            if (list == null) {
                m89709a(1);
            }
            if (list2 == null) {
                m89709a(2);
            }
            if (list3 == null) {
                m89709a(3);
            }
            this.f62869a = e0Var;
            this.f62870b = e0Var2;
            this.f62871c = list;
            this.f62872d = list2;
            this.f62873e = list3;
            this.f62874f = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m89709a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public List<String> mo72709b() {
            List<String> list = this.f62873e;
            if (list == null) {
                m89709a(7);
            }
            return list;
        }

        /* renamed from: c */
        public C14900e0 mo72710c() {
            return this.f62870b;
        }

        /* renamed from: d */
        public C14900e0 mo72711d() {
            C14900e0 e0Var = this.f62869a;
            if (e0Var == null) {
                m89709a(4);
            }
            return e0Var;
        }

        /* renamed from: e */
        public List<C13950e1> mo72712e() {
            List<C13950e1> list = this.f62872d;
            if (list == null) {
                m89709a(6);
            }
            return list;
        }

        /* renamed from: f */
        public List<C13966i1> mo72713f() {
            List<C13966i1> list = this.f62871c;
            if (list == null) {
                m89709a(5);
            }
            return list;
        }

        /* renamed from: g */
        public boolean mo72714g() {
            return this.f62874f;
        }
    }

    /* renamed from: a */
    C14189b mo72707a(C12503r rVar, C13948e eVar, C14900e0 e0Var, C14900e0 e0Var2, List<C13966i1> list, List<C13950e1> list2);

    /* renamed from: b */
    void mo72708b(C13936b bVar, List<String> list);
}
