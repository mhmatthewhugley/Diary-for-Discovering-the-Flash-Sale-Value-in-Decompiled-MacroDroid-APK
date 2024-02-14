package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.x0 */
/* compiled from: TypeAliasExpansionReportStrategy.kt */
public interface C14988x0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.x0$a */
    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class C14989a implements C14988x0 {

        /* renamed from: a */
        public static final C14989a f64116a = new C14989a();

        private C14989a() {
        }

        /* renamed from: a */
        public void mo74247a(C14945l1 l1Var, C14900e0 e0Var, C14900e0 e0Var2, C13950e1 e1Var) {
            C13706o.m87929f(l1Var, "substitutor");
            C13706o.m87929f(e0Var, "unsubstitutedArgument");
            C13706o.m87929f(e0Var2, "argument");
            C13706o.m87929f(e1Var, "typeParameter");
        }

        /* renamed from: b */
        public void mo74248b(C13947d1 d1Var) {
            C13706o.m87929f(d1Var, "typeAlias");
        }

        /* renamed from: c */
        public void mo74249c(C13915c cVar) {
            C13706o.m87929f(cVar, "annotation");
        }

        /* renamed from: d */
        public void mo74250d(C13947d1 d1Var, C13950e1 e1Var, C14900e0 e0Var) {
            C13706o.m87929f(d1Var, "typeAlias");
            C13706o.m87929f(e0Var, "substitutedArgument");
        }
    }

    /* renamed from: a */
    void mo74247a(C14945l1 l1Var, C14900e0 e0Var, C14900e0 e0Var2, C13950e1 e1Var);

    /* renamed from: b */
    void mo74248b(C13947d1 d1Var);

    /* renamed from: c */
    void mo74249c(C13915c cVar);

    /* renamed from: d */
    void mo74250d(C13947d1 d1Var, C13950e1 e1Var, C14900e0 e0Var);
}
