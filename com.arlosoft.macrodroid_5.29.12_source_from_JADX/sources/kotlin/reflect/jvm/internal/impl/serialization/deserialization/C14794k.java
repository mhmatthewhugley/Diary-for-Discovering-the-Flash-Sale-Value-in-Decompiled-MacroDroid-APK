package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import kotlin.reflect.jvm.internal.impl.types.C14994z0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import p217bb.C11117a;
import p217bb.C11119b;
import p217bb.C11120c;
import p217bb.C11124e;
import p263fb.C12254c;
import p327mb.C15712a;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16151b;
import p407ub.C16682a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.k */
/* compiled from: context.kt */
public final class C14794k {

    /* renamed from: a */
    private final C17012n f63892a;

    /* renamed from: b */
    private final C13958g0 f63893b;

    /* renamed from: c */
    private final C14795l f63894c;

    /* renamed from: d */
    private final C14786h f63895d;

    /* renamed from: e */
    private final C14716c<C13915c, C14617g<?>> f63896e;

    /* renamed from: f */
    private final C14053l0 f63897f;

    /* renamed from: g */
    private final C14812v f63898g;

    /* renamed from: h */
    private final C14806r f63899h;

    /* renamed from: i */
    private final C12254c f63900i;

    /* renamed from: j */
    private final C14808s f63901j;

    /* renamed from: k */
    private final Iterable<C11119b> f63902k;

    /* renamed from: l */
    private final C14043j0 f63903l;

    /* renamed from: m */
    private final C14791j f63904m;

    /* renamed from: n */
    private final C11117a f63905n;

    /* renamed from: o */
    private final C11120c f63906o;

    /* renamed from: p */
    private final C14490f f63907p;

    /* renamed from: q */
    private final C14859l f63908q;

    /* renamed from: r */
    private final C16682a f63909r;

    /* renamed from: s */
    private final C11124e f63910s;

    /* renamed from: t */
    private final List<C14994z0> f63911t;

    /* renamed from: u */
    private final C14787i f63912u;

    public C14794k(C17012n nVar, C13958g0 g0Var, C14795l lVar, C14786h hVar, C14716c<? extends C13915c, ? extends C14617g<?>> cVar, C14053l0 l0Var, C14812v vVar, C14806r rVar, C12254c cVar2, C14808s sVar, Iterable<? extends C11119b> iterable, C14043j0 j0Var, C14791j jVar, C11117a aVar, C11120c cVar3, C14490f fVar, C14859l lVar2, C16682a aVar2, C11124e eVar, List<? extends C14994z0> list) {
        C17012n nVar2 = nVar;
        C13958g0 g0Var2 = g0Var;
        C14795l lVar3 = lVar;
        C14786h hVar2 = hVar;
        C14716c<? extends C13915c, ? extends C14617g<?>> cVar4 = cVar;
        C14053l0 l0Var2 = l0Var;
        C14812v vVar2 = vVar;
        C14806r rVar2 = rVar;
        C12254c cVar5 = cVar2;
        C14808s sVar2 = sVar;
        Iterable<? extends C11119b> iterable2 = iterable;
        C14043j0 j0Var2 = j0Var;
        C14791j jVar2 = jVar;
        C11117a aVar3 = aVar;
        C14490f fVar2 = fVar;
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(g0Var2, "moduleDescriptor");
        C13706o.m87929f(lVar3, "configuration");
        C13706o.m87929f(hVar2, "classDataFinder");
        C13706o.m87929f(cVar4, "annotationAndConstantLoader");
        C13706o.m87929f(l0Var2, "packageFragmentProvider");
        C13706o.m87929f(vVar2, "localClassifierTypeSettings");
        C13706o.m87929f(rVar2, "errorReporter");
        C13706o.m87929f(cVar5, "lookupTracker");
        C13706o.m87929f(sVar2, "flexibleTypeDeserializer");
        C13706o.m87929f(iterable2, "fictitiousClassDescriptorFactories");
        C13706o.m87929f(j0Var2, "notFoundClasses");
        C13706o.m87929f(jVar2, "contractDeserializer");
        C13706o.m87929f(aVar3, "additionalClassPartsProvider");
        C13706o.m87929f(cVar3, "platformDependentDeclarationFilter");
        C13706o.m87929f(fVar, "extensionRegistryLite");
        C13706o.m87929f(lVar2, "kotlinTypeChecker");
        C13706o.m87929f(aVar2, "samConversionResolver");
        C13706o.m87929f(eVar, "platformDependentTypeTransformer");
        C13706o.m87929f(list, "typeAttributeTranslators");
        this.f63892a = nVar2;
        this.f63893b = g0Var2;
        this.f63894c = lVar3;
        this.f63895d = hVar2;
        this.f63896e = cVar4;
        this.f63897f = l0Var2;
        this.f63898g = vVar2;
        this.f63899h = rVar2;
        this.f63900i = cVar5;
        this.f63901j = sVar2;
        this.f63902k = iterable2;
        this.f63903l = j0Var2;
        this.f63904m = jVar2;
        this.f63905n = aVar3;
        this.f63906o = cVar3;
        this.f63907p = fVar;
        this.f63908q = lVar2;
        this.f63909r = aVar2;
        this.f63910s = eVar;
        this.f63911t = list;
        this.f63912u = new C14787i(this);
    }

    /* renamed from: a */
    public final C14798m mo73959a(C14050k0 k0Var, C15719c cVar, C15724g gVar, C15725h hVar, C15712a aVar, C14750f fVar) {
        C13706o.m87929f(k0Var, "descriptor");
        C15719c cVar2 = cVar;
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C13706o.m87929f(hVar, "versionRequirementTable");
        C15712a aVar2 = aVar;
        C13706o.m87929f(aVar2, "metadataVersion");
        return new C14798m(this, cVar2, k0Var, gVar, hVar, aVar2, fVar, (C14720d0) null, C13614t.m87748j());
    }

    /* renamed from: b */
    public final C13948e mo73960b(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        return C14787i.m92252e(this.f63912u, bVar, (C14785g) null, 2, (Object) null);
    }

    /* renamed from: c */
    public final C11117a mo73961c() {
        return this.f63905n;
    }

    /* renamed from: d */
    public final C14716c<C13915c, C14617g<?>> mo73962d() {
        return this.f63896e;
    }

    /* renamed from: e */
    public final C14786h mo73963e() {
        return this.f63895d;
    }

    /* renamed from: f */
    public final C14787i mo73964f() {
        return this.f63912u;
    }

    /* renamed from: g */
    public final C14795l mo73965g() {
        return this.f63894c;
    }

    /* renamed from: h */
    public final C14791j mo73966h() {
        return this.f63904m;
    }

    /* renamed from: i */
    public final C14806r mo73967i() {
        return this.f63899h;
    }

    /* renamed from: j */
    public final C14490f mo73968j() {
        return this.f63907p;
    }

    /* renamed from: k */
    public final Iterable<C11119b> mo73969k() {
        return this.f63902k;
    }

    /* renamed from: l */
    public final C14808s mo73970l() {
        return this.f63901j;
    }

    /* renamed from: m */
    public final C14859l mo73971m() {
        return this.f63908q;
    }

    /* renamed from: n */
    public final C14812v mo73972n() {
        return this.f63898g;
    }

    /* renamed from: o */
    public final C12254c mo73973o() {
        return this.f63900i;
    }

    /* renamed from: p */
    public final C13958g0 mo73974p() {
        return this.f63893b;
    }

    /* renamed from: q */
    public final C14043j0 mo73975q() {
        return this.f63903l;
    }

    /* renamed from: r */
    public final C14053l0 mo73976r() {
        return this.f63897f;
    }

    /* renamed from: s */
    public final C11120c mo73977s() {
        return this.f63906o;
    }

    /* renamed from: t */
    public final C11124e mo73978t() {
        return this.f63910s;
    }

    /* renamed from: u */
    public final C17012n mo73979u() {
        return this.f63892a;
    }

    /* renamed from: v */
    public final List<C14994z0> mo73980v() {
        return this.f63911t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14794k(p442yb.C17012n r24, kotlin.reflect.jvm.internal.impl.descriptors.C13958g0 r25, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14795l r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14786h r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14716c r28, kotlin.reflect.jvm.internal.impl.descriptors.C14053l0 r29, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14812v r30, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r r31, p263fb.C12254c r32, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14808s r33, java.lang.Iterable r34, kotlin.reflect.jvm.internal.impl.descriptors.C14043j0 r35, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14791j r36, p217bb.C11117a r37, p217bb.C11120c r38, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r39, kotlin.reflect.jvm.internal.impl.types.checker.C14859l r40, p407ub.C16682a r41, p217bb.C11124e r42, java.util.List r43, int r44, kotlin.jvm.internal.C13695i r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000b
            bb.a$a r1 = p217bb.C11117a.C11118a.f54036a
            r16 = r1
            goto L_0x000d
        L_0x000b:
            r16 = r37
        L_0x000d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0016
            bb.c$a r1 = p217bb.C11120c.C11121a.f54037a
            r17 = r1
            goto L_0x0018
        L_0x0016:
            r17 = r38
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0026
            kotlin.reflect.jvm.internal.impl.types.checker.l$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.C14859l.f63983b
            kotlin.reflect.jvm.internal.impl.types.checker.m r1 = r1.mo74091a()
            r19 = r1
            goto L_0x0028
        L_0x0026:
            r19 = r40
        L_0x0028:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0032
            bb.e$a r1 = p217bb.C11124e.C11125a.f54040a
            r21 = r1
            goto L_0x0034
        L_0x0032:
            r21 = r42
        L_0x0034:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0042
            kotlin.reflect.jvm.internal.impl.types.o r0 = kotlin.reflect.jvm.internal.impl.types.C14958o.f64084a
            java.util.List r0 = kotlin.collections.C13612s.m87736e(r0)
            r22 = r0
            goto L_0x0044
        L_0x0042:
            r22 = r43
        L_0x0044:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k.<init>(yb.n, kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.l, kotlin.reflect.jvm.internal.impl.serialization.deserialization.h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.c, kotlin.reflect.jvm.internal.impl.descriptors.l0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r, fb.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.s, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.j0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.j, bb.a, bb.c, kotlin.reflect.jvm.internal.impl.protobuf.f, kotlin.reflect.jvm.internal.impl.types.checker.l, ub.a, bb.e, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
