package p242db;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;

/* renamed from: db.j */
/* compiled from: RuntimeErrorReporter.kt */
public final class C12000j implements C14806r {

    /* renamed from: b */
    public static final C12000j f58201b = new C12000j();

    private C12000j() {
    }

    /* renamed from: a */
    public void mo67439a(C13936b bVar) {
        C13706o.m87929f(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    /* renamed from: b */
    public void mo67440b(C13948e eVar, List<String> list) {
        C13706o.m87929f(eVar, "descriptor");
        C13706o.m87929f(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
