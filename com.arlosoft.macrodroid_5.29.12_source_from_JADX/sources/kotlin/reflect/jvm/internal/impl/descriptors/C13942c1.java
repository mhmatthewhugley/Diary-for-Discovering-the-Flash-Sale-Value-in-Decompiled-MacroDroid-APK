package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1 */
/* compiled from: SupertypeLoopChecker.kt */
public interface C13942c1 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1$a */
    /* compiled from: SupertypeLoopChecker.kt */
    public static final class C13943a implements C13942c1 {

        /* renamed from: a */
        public static final C13943a f62415a = new C13943a();

        private C13943a() {
        }

        /* renamed from: a */
        public Collection<C14900e0> mo72278a(C14901e1 e1Var, Collection<? extends C14900e0> collection, C16265l<? super C14901e1, ? extends Iterable<? extends C14900e0>> lVar, C16265l<? super C14900e0, C13339u> lVar2) {
            C13706o.m87929f(e1Var, "currentTypeConstructor");
            C13706o.m87929f(collection, "superTypes");
            C13706o.m87929f(lVar, "neighbors");
            C13706o.m87929f(lVar2, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<C14900e0> mo72278a(C14901e1 e1Var, Collection<? extends C14900e0> collection, C16265l<? super C14901e1, ? extends Iterable<? extends C14900e0>> lVar, C16265l<? super C14900e0, C13339u> lVar2);
}
