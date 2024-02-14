package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.a */
/* compiled from: constantValues.kt */
public final class C14610a extends C14617g<C13915c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14610a(C13915c cVar) {
        super(cVar);
        C13706o.m87929f(cVar, "value");
    }

    /* renamed from: a */
    public C14900e0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        return ((C13915c) mo73727b()).getType();
    }
}
