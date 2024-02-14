package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import p308kb.C13455c;
import p308kb.C13491m;
import p327mb.C15712a;
import p327mb.C15719c;
import p362pb.C16151b;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.y */
/* compiled from: ProtoBasedClassDataFinder.kt */
public final class C14824y implements C14786h {

    /* renamed from: a */
    private final C15719c f63942a;

    /* renamed from: b */
    private final C15712a f63943b;

    /* renamed from: c */
    private final C16265l<C16151b, C14158z0> f63944c;

    /* renamed from: d */
    private final Map<C16151b, C13455c> f63945d;

    public C14824y(C13491m mVar, C15719c cVar, C15712a aVar, C16265l<? super C16151b, ? extends C14158z0> lVar) {
        C13706o.m87929f(mVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(aVar, "metadataVersion");
        C13706o.m87929f(lVar, "classSource");
        this.f63942a = cVar;
        this.f63943b = aVar;
        this.f63944c = lVar;
        List<C13455c> M = mVar.mo71326M();
        C13706o.m87928e(M, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(M, 10)), 16));
        for (T next : M) {
            linkedHashMap.put(C14823x.m92358a(this.f63942a, ((C13455c) next).mo71105L0()), next);
        }
        this.f63945d = linkedHashMap;
    }

    /* renamed from: a */
    public C14785g mo73168a(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        C13455c cVar = this.f63945d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new C14785g(this.f63942a, cVar, this.f63943b, this.f63944c.invoke(bVar));
    }

    /* renamed from: b */
    public final Collection<C16151b> mo74021b() {
        return this.f63945d.keySet();
    }
}
