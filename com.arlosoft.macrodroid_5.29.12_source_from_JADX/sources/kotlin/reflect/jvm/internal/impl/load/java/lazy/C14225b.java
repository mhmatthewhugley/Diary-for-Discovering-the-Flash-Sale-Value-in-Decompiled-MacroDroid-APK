package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13863j;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.load.java.C14191d;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.C14328p;
import kotlin.reflect.jvm.internal.impl.load.java.C14337t;
import kotlin.reflect.jvm.internal.impl.load.java.C14403w;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14179f;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14187j;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14439g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14454o;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14471w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import p263fb.C12254c;
import p279hb.C12413b;
import p398tb.C16611f;
import p407ub.C16682a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.b */
/* compiled from: context.kt */
public final class C14225b {

    /* renamed from: a */
    private final C17012n f62927a;

    /* renamed from: b */
    private final C14325o f62928b;

    /* renamed from: c */
    private final C14454o f62929c;

    /* renamed from: d */
    private final C14439g f62930d;

    /* renamed from: e */
    private final C14187j f62931e;

    /* renamed from: f */
    private final C14806r f62932f;

    /* renamed from: g */
    private final C14181g f62933g;

    /* renamed from: h */
    private final C14179f f62934h;

    /* renamed from: i */
    private final C16682a f62935i;

    /* renamed from: j */
    private final C12413b f62936j;

    /* renamed from: k */
    private final C14304i f62937k;

    /* renamed from: l */
    private final C14471w f62938l;

    /* renamed from: m */
    private final C13942c1 f62939m;

    /* renamed from: n */
    private final C12254c f62940n;

    /* renamed from: o */
    private final C13958g0 f62941o;

    /* renamed from: p */
    private final C13863j f62942p;

    /* renamed from: q */
    private final C14191d f62943q;

    /* renamed from: r */
    private final C14384l f62944r;

    /* renamed from: s */
    private final C14328p f62945s;

    /* renamed from: t */
    private final C14226c f62946t;

    /* renamed from: u */
    private final C14859l f62947u;

    /* renamed from: v */
    private final C14403w f62948v;

    /* renamed from: w */
    private final C14337t f62949w;

    /* renamed from: x */
    private final C16611f f62950x;

    public C14225b(C17012n nVar, C14325o oVar, C14454o oVar2, C14439g gVar, C14187j jVar, C14806r rVar, C14181g gVar2, C14179f fVar, C16682a aVar, C12413b bVar, C14304i iVar, C14471w wVar, C13942c1 c1Var, C12254c cVar, C13958g0 g0Var, C13863j jVar2, C14191d dVar, C14384l lVar, C14328p pVar, C14226c cVar2, C14859l lVar2, C14403w wVar2, C14337t tVar, C16611f fVar2) {
        C17012n nVar2 = nVar;
        C14325o oVar3 = oVar;
        C14454o oVar4 = oVar2;
        C14439g gVar3 = gVar;
        C14187j jVar3 = jVar;
        C14806r rVar2 = rVar;
        C14181g gVar4 = gVar2;
        C14179f fVar3 = fVar;
        C16682a aVar2 = aVar;
        C12413b bVar2 = bVar;
        C14304i iVar2 = iVar;
        C14471w wVar3 = wVar;
        C13942c1 c1Var2 = c1Var;
        C12254c cVar3 = cVar;
        C13863j jVar4 = jVar2;
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(oVar3, "finder");
        C13706o.m87929f(oVar4, "kotlinClassFinder");
        C13706o.m87929f(gVar3, "deserializedDescriptorResolver");
        C13706o.m87929f(jVar3, "signaturePropagator");
        C13706o.m87929f(rVar2, "errorReporter");
        C13706o.m87929f(gVar4, "javaResolverCache");
        C13706o.m87929f(fVar3, "javaPropertyInitializerEvaluator");
        C13706o.m87929f(aVar2, "samConversionResolver");
        C13706o.m87929f(bVar2, "sourceElementFactory");
        C13706o.m87929f(iVar2, "moduleClassResolver");
        C13706o.m87929f(wVar3, "packagePartProvider");
        C13706o.m87929f(c1Var2, "supertypeLoopChecker");
        C13706o.m87929f(cVar3, "lookupTracker");
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(jVar2, "reflectionTypes");
        C13706o.m87929f(dVar, "annotationTypeQualifierResolver");
        C13706o.m87929f(lVar, "signatureEnhancement");
        C13706o.m87929f(pVar, "javaClassesTracker");
        C13706o.m87929f(cVar2, "settings");
        C13706o.m87929f(lVar2, "kotlinTypeChecker");
        C13706o.m87929f(wVar2, "javaTypeEnhancementState");
        C13706o.m87929f(tVar, "javaModuleResolver");
        C13706o.m87929f(fVar2, "syntheticPartsProvider");
        this.f62927a = nVar2;
        this.f62928b = oVar3;
        this.f62929c = oVar4;
        this.f62930d = gVar3;
        this.f62931e = jVar3;
        this.f62932f = rVar2;
        this.f62933g = gVar4;
        this.f62934h = fVar3;
        this.f62935i = aVar2;
        this.f62936j = bVar2;
        this.f62937k = iVar2;
        this.f62938l = wVar3;
        this.f62939m = c1Var2;
        this.f62940n = cVar3;
        this.f62941o = g0Var;
        this.f62942p = jVar2;
        this.f62943q = dVar;
        this.f62944r = lVar;
        this.f62945s = pVar;
        this.f62946t = cVar2;
        this.f62947u = lVar2;
        this.f62948v = wVar2;
        this.f62949w = tVar;
        this.f62950x = fVar2;
    }

    /* renamed from: a */
    public final C14191d mo72763a() {
        return this.f62943q;
    }

    /* renamed from: b */
    public final C14439g mo72764b() {
        return this.f62930d;
    }

    /* renamed from: c */
    public final C14806r mo72765c() {
        return this.f62932f;
    }

    /* renamed from: d */
    public final C14325o mo72766d() {
        return this.f62928b;
    }

    /* renamed from: e */
    public final C14328p mo72767e() {
        return this.f62945s;
    }

    /* renamed from: f */
    public final C14337t mo72768f() {
        return this.f62949w;
    }

    /* renamed from: g */
    public final C14179f mo72769g() {
        return this.f62934h;
    }

    /* renamed from: h */
    public final C14181g mo72770h() {
        return this.f62933g;
    }

    /* renamed from: i */
    public final C14403w mo72771i() {
        return this.f62948v;
    }

    /* renamed from: j */
    public final C14454o mo72772j() {
        return this.f62929c;
    }

    /* renamed from: k */
    public final C14859l mo72773k() {
        return this.f62947u;
    }

    /* renamed from: l */
    public final C12254c mo72774l() {
        return this.f62940n;
    }

    /* renamed from: m */
    public final C13958g0 mo72775m() {
        return this.f62941o;
    }

    /* renamed from: n */
    public final C14304i mo72776n() {
        return this.f62937k;
    }

    /* renamed from: o */
    public final C14471w mo72777o() {
        return this.f62938l;
    }

    /* renamed from: p */
    public final C13863j mo72778p() {
        return this.f62942p;
    }

    /* renamed from: q */
    public final C14226c mo72779q() {
        return this.f62946t;
    }

    /* renamed from: r */
    public final C14384l mo72780r() {
        return this.f62944r;
    }

    /* renamed from: s */
    public final C14187j mo72781s() {
        return this.f62931e;
    }

    /* renamed from: t */
    public final C12413b mo72782t() {
        return this.f62936j;
    }

    /* renamed from: u */
    public final C17012n mo72783u() {
        return this.f62927a;
    }

    /* renamed from: v */
    public final C13942c1 mo72784v() {
        return this.f62939m;
    }

    /* renamed from: w */
    public final C16611f mo72785w() {
        return this.f62950x;
    }

    /* renamed from: x */
    public final C14225b mo72786x(C14181g gVar) {
        C13706o.m87929f(gVar, "javaResolverCache");
        return new C14225b(this.f62927a, this.f62928b, this.f62929c, this.f62930d, this.f62931e, this.f62932f, gVar, this.f62934h, this.f62935i, this.f62936j, this.f62937k, this.f62938l, this.f62939m, this.f62940n, this.f62941o, this.f62942p, this.f62943q, this.f62944r, this.f62945s, this.f62946t, this.f62947u, this.f62948v, this.f62949w, (C16611f) null, 8388608, (C13695i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14225b(C17012n nVar, C14325o oVar, C14454o oVar2, C14439g gVar, C14187j jVar, C14806r rVar, C14181g gVar2, C14179f fVar, C16682a aVar, C12413b bVar, C14304i iVar, C14471w wVar, C13942c1 c1Var, C12254c cVar, C13958g0 g0Var, C13863j jVar2, C14191d dVar, C14384l lVar, C14328p pVar, C14226c cVar2, C14859l lVar2, C14403w wVar2, C14337t tVar, C16611f fVar2, int i, C13695i iVar2) {
        this(nVar, oVar, oVar2, gVar, jVar, rVar, gVar2, fVar, aVar, bVar, iVar, wVar, c1Var, cVar, g0Var, jVar2, dVar, lVar, pVar, cVar2, lVar2, wVar2, tVar, (i & 8388608) != 0 ? C16611f.f67449a.mo79466a() : fVar2);
    }
}
