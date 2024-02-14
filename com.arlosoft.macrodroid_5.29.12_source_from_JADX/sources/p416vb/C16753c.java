package p416vb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: vb.c */
/* compiled from: ContextReceiver.kt */
public final class C16753c extends C16751a {

    /* renamed from: c */
    private final C13908a f67693c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16753c(C13908a aVar, C14900e0 e0Var, C16756f fVar) {
        super(e0Var, fVar);
        C13706o.m87929f(aVar, "declarationDescriptor");
        C13706o.m87929f(e0Var, "receiverType");
        this.f67693c = aVar;
    }

    /* renamed from: c */
    public C13908a mo79734c() {
        return this.f67693c;
    }

    public String toString() {
        return "Cxt { " + mo79734c() + " }";
    }
}
