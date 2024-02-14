package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.b */
/* compiled from: constantValues.kt */
public class C14612b extends C14617g<List<? extends C14617g<?>>> {

    /* renamed from: b */
    private final C16265l<C13958g0, C14900e0> f63614b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14612b(List<? extends C14617g<?>> list, C16265l<? super C13958g0, ? extends C14900e0> lVar) {
        super(list);
        C13706o.m87929f(list, "value");
        C13706o.m87929f(lVar, "computeType");
        this.f63614b = lVar;
    }

    /* renamed from: a */
    public C14900e0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14900e0 invoke = this.f63614b.invoke(g0Var);
        if (!C13853h.m88255c0(invoke) && !C13853h.m88271p0(invoke)) {
            C13853h.m88245C0(invoke);
        }
        return invoke;
    }
}
