package p416vb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: vb.b */
/* compiled from: ContextClassReceiver.kt */
public final class C16752b extends C16751a {

    /* renamed from: c */
    private final C13948e f67692c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16752b(C13948e eVar, C14900e0 e0Var, C16756f fVar) {
        super(e0Var, fVar);
        C13706o.m87929f(eVar, "classDescriptor");
        C13706o.m87929f(e0Var, "receiverType");
        this.f67692c = eVar;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f67692c + " }";
    }
}
