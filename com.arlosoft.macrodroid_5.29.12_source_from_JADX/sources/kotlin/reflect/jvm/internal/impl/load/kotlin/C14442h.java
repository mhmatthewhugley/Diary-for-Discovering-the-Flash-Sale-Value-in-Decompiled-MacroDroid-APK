package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14785g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14786h;
import p362pb.C16151b;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h */
/* compiled from: JavaClassDataFinder.kt */
public final class C14442h implements C14786h {

    /* renamed from: a */
    private final C14454o f63279a;

    /* renamed from: b */
    private final C14439g f63280b;

    public C14442h(C14454o oVar, C14439g gVar) {
        C13706o.m87929f(oVar, "kotlinClassFinder");
        C13706o.m87929f(gVar, "deserializedDescriptorResolver");
        this.f63279a = oVar;
        this.f63280b = gVar;
    }

    /* renamed from: a */
    public C14785g mo73168a(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        C14459q b = C14458p.m90655b(this.f63279a, bVar);
        if (b == null) {
            return null;
        }
        C13706o.m87924a(b.mo67429d(), bVar);
        return this.f63280b.mo73162i(b);
    }
}
