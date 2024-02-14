package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14070n0;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.o */
/* compiled from: DeserializedClassDataFinder.kt */
public final class C14801o implements C14786h {

    /* renamed from: a */
    private final C14053l0 f63924a;

    public C14801o(C14053l0 l0Var) {
        C13706o.m87929f(l0Var, "packageFragmentProvider");
        this.f63924a = l0Var;
    }

    /* renamed from: a */
    public C14785g mo73168a(C16151b bVar) {
        C14785g a;
        C13706o.m87929f(bVar, "classId");
        C14053l0 l0Var = this.f63924a;
        C16152c h = bVar.mo78549h();
        C13706o.m87928e(h, "classId.packageFqName");
        for (C14050k0 next : C14070n0.m89333c(l0Var, h)) {
            if ((next instanceof C14802p) && (a = ((C14802p) next).mo73999G0().mo73168a(bVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
