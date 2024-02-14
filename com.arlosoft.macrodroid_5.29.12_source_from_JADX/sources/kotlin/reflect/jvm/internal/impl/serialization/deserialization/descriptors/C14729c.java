package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f;
import p308kb.C13460d;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C14729c extends C13991f implements C14728b {

    /* renamed from: W */
    private final C13460d f63778W;

    /* renamed from: X */
    private final C15719c f63779X;

    /* renamed from: Y */
    private final C15724g f63780Y;

    /* renamed from: Z */
    private final C15725h f63781Z;

    /* renamed from: a0 */
    private final C14750f f63782a0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14729c(C13948e eVar, C14052l lVar, C13921g gVar, boolean z, C13936b.C13937a aVar, C13460d dVar, C15719c cVar, C15724g gVar2, C15725h hVar, C14750f fVar, C14158z0 z0Var, int i, C13695i iVar) {
        this(eVar, lVar, gVar, z, aVar, dVar, cVar, gVar2, hVar, fVar, (i & 1024) != 0 ? null : z0Var);
    }

    /* renamed from: B */
    public boolean mo62204B() {
        return false;
    }

    /* renamed from: E */
    public C15724g mo73856E() {
        return this.f63780Y;
    }

    /* renamed from: I */
    public C15719c mo73857I() {
        return this.f63779X;
    }

    /* renamed from: J */
    public C14750f mo73858J() {
        return this.f63782a0;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public C14729c mo68654o1(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        C13706o.m87929f(mVar, "newOwner");
        C13936b.C13937a aVar2 = aVar;
        C13706o.m87929f(aVar2, "kind");
        C13921g gVar2 = gVar;
        C13706o.m87929f(gVar2, "annotations");
        C14158z0 z0Var2 = z0Var;
        C13706o.m87929f(z0Var2, "source");
        C14729c cVar = new C14729c((C13948e) mVar, (C14052l) yVar, gVar2, this.f62510V, aVar2, mo73859f0(), mo73857I(), mo73856E(), mo73862u1(), mo73858J(), z0Var2);
        cVar.mo68651Y0(mo68650Q0());
        return cVar;
    }

    /* renamed from: t1 */
    public C13460d mo73859f0() {
        return this.f63778W;
    }

    /* renamed from: u1 */
    public C15725h mo73862u1() {
        return this.f63781Z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14729c(C13948e eVar, C14052l lVar, C13921g gVar, boolean z, C13936b.C13937a aVar, C13460d dVar, C15719c cVar, C15724g gVar2, C15725h hVar, C14750f fVar, C14158z0 z0Var) {
        super(eVar, lVar, gVar, z, aVar, z0Var == null ? C14158z0.f62778a : z0Var);
        C13460d dVar2 = dVar;
        C15719c cVar2 = cVar;
        C15724g gVar3 = gVar2;
        C15725h hVar2 = hVar;
        C13948e eVar2 = eVar;
        C13706o.m87929f(eVar, "containingDeclaration");
        C13921g gVar4 = gVar;
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(dVar2, "proto");
        C13706o.m87929f(cVar2, "nameResolver");
        C13706o.m87929f(gVar3, "typeTable");
        C13706o.m87929f(hVar2, "versionRequirementTable");
        this.f63778W = dVar2;
        this.f63779X = cVar2;
        this.f63780Y = gVar3;
        this.f63781Z = hVar2;
        this.f63782a0 = fVar;
    }
}
