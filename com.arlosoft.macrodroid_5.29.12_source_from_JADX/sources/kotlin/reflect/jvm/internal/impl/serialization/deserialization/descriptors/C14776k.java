package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14020p;
import p308kb.C13481i;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C14776k extends C13994g0 implements C14728b {

    /* renamed from: V */
    private final C13481i f63856V;

    /* renamed from: W */
    private final C15719c f63857W;

    /* renamed from: X */
    private final C15724g f63858X;

    /* renamed from: Y */
    private final C15725h f63859Y;

    /* renamed from: Z */
    private final C14750f f63860Z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14776k(C14064m mVar, C14156y0 y0Var, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C13481i iVar, C15719c cVar, C15724g gVar2, C15725h hVar, C14750f fVar2, C14158z0 z0Var, int i, C13695i iVar2) {
        this(mVar, y0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i & 1024) != 0 ? null : z0Var);
    }

    /* renamed from: E */
    public C15724g mo73856E() {
        return this.f63858X;
    }

    /* renamed from: I */
    public C15719c mo73857I() {
        return this.f63857W;
    }

    /* renamed from: J */
    public C14750f mo73858J() {
        return this.f63860Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C14020p mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        C16157f fVar2;
        C14064m mVar2 = mVar;
        C13706o.m87929f(mVar, "newOwner");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(z0Var, "source");
        C14156y0 y0Var = (C14156y0) yVar;
        if (fVar == null) {
            C16157f name = getName();
            C13706o.m87928e(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C14776k kVar = new C14776k(mVar, y0Var, gVar, fVar2, aVar, mo73859f0(), mo73857I(), mo73856E(), mo73932q1(), mo73858J(), z0Var);
        kVar.mo68651Y0(mo68650Q0());
        return kVar;
    }

    /* renamed from: p1 */
    public C13481i mo73859f0() {
        return this.f63856V;
    }

    /* renamed from: q1 */
    public C15725h mo73932q1() {
        return this.f63859Y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14776k(C14064m mVar, C14156y0 y0Var, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C13481i iVar, C15719c cVar, C15724g gVar2, C15725h hVar, C14750f fVar2, C14158z0 z0Var) {
        super(mVar, y0Var, gVar, fVar, aVar, z0Var == null ? C14158z0.f62778a : z0Var);
        C13481i iVar2 = iVar;
        C15719c cVar2 = cVar;
        C15724g gVar3 = gVar2;
        C15725h hVar2 = hVar;
        C14064m mVar2 = mVar;
        C13706o.m87929f(mVar, "containingDeclaration");
        C13921g gVar4 = gVar;
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(iVar2, "proto");
        C13706o.m87929f(cVar2, "nameResolver");
        C13706o.m87929f(gVar3, "typeTable");
        C13706o.m87929f(hVar2, "versionRequirementTable");
        this.f63856V = iVar2;
        this.f63857W = cVar2;
        this.f63858X = gVar3;
        this.f63859Y = hVar2;
        this.f63860Z = fVar2;
    }
}
