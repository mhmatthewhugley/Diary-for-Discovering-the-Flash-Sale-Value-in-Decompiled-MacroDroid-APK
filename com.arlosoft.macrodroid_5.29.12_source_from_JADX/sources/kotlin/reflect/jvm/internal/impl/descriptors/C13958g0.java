package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0 */
/* compiled from: ModuleDescriptor.kt */
public interface C13958g0 extends C14064m {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0$a */
    /* compiled from: ModuleDescriptor.kt */
    public static final class C13959a {
        /* renamed from: a */
        public static <R, D> R m88598a(C13958g0 g0Var, C14071o<R, D> oVar, D d) {
            C13706o.m87929f(oVar, "visitor");
            return oVar.mo72433k(g0Var, d);
        }

        /* renamed from: b */
        public static C14064m m88599b(C13958g0 g0Var) {
            return null;
        }
    }

    /* renamed from: H0 */
    <T> T mo72293H0(C13952f0<T> f0Var);

    /* renamed from: K */
    boolean mo72294K(C13958g0 g0Var);

    /* renamed from: V */
    C14074p0 mo72295V(C16152c cVar);

    /* renamed from: m */
    C13853h mo72296m();

    /* renamed from: o */
    Collection<C16152c> mo72297o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar);

    /* renamed from: z0 */
    List<C13958g0> mo72298z0();
}
