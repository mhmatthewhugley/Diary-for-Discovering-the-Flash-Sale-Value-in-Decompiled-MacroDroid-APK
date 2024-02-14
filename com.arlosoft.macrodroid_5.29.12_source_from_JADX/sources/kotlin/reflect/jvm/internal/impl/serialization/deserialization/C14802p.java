package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14041z;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14752h;
import p362pb.C16152c;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.p */
/* compiled from: DeserializedPackageFragment.kt */
public abstract class C14802p extends C14041z {

    /* renamed from: p */
    private final C17012n f63925p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14802p(C16152c cVar, C17012n nVar, C13958g0 g0Var) {
        super(g0Var, cVar);
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "module");
        this.f63925p = nVar;
    }

    /* renamed from: G0 */
    public abstract C14786h mo73999G0();

    /* renamed from: K0 */
    public boolean mo74000K0(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        C14692h n = mo72205n();
        return (n instanceof C14752h) && ((C14752h) n).mo73899q().contains(fVar);
    }

    /* renamed from: L0 */
    public abstract void mo74001L0(C14794k kVar);
}
