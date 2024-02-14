package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13863j;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.load.java.C14191d;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.C14328p;
import kotlin.reflect.jvm.internal.impl.load.java.C14337t;
import kotlin.reflect.jvm.internal.impl.load.java.C14403w;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14179f;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14187j;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14225b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14226c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14299f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14304i;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14345d;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14471w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14791j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14795l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.types.C14958o;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import kotlin.reflect.jvm.internal.impl.types.checker.C14861m;
import p211ac.C11091a;
import p263fb.C12254c;
import p279hb.C12413b;
import p288ib.C12479a;
import p362pb.C16151b;
import p398tb.C16611f;
import p407ub.C16683b;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.f */
/* compiled from: DeserializationComponentsForJava.kt */
public final class C14437f {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.f$a */
    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class C14438a implements C14337t {
        C14438a() {
        }

        /* renamed from: a */
        public List<C12479a> mo72980a(C16151b bVar) {
            C13706o.m87929f(bVar, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final C14434e m90584a(C13958g0 g0Var, C17012n nVar, C14043j0 j0Var, C14299f fVar, C14454o oVar, C14439g gVar, C14806r rVar) {
        C17012n nVar2 = nVar;
        C14043j0 j0Var2 = j0Var;
        C14454o oVar2 = oVar;
        C14439g gVar2 = gVar;
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(j0Var2, "notFoundClasses");
        C14299f fVar2 = fVar;
        C13706o.m87929f(fVar2, "lazyJavaPackageFragmentProvider");
        C13706o.m87929f(oVar2, "reflectKotlinClassFinder");
        C13706o.m87929f(gVar2, "deserializedDescriptorResolver");
        C14806r rVar2 = rVar;
        C13706o.m87929f(rVar2, "errorReporter");
        return new C14434e(nVar2, g0Var, C14795l.C14796a.f63913a, new C14442h(oVar2, gVar2), new C14427c(g0Var, j0Var2, nVar, oVar2), fVar2, j0Var2, rVar2, C12254c.C12255a.f58865a, C14791j.f63889a.mo73958a(), C14859l.f63983b.mo74091a(), new C11091a(C13612s.m87736e(C14958o.f64084a)));
    }

    /* renamed from: b */
    public static final C14299f m90585b(C14325o oVar, C13958g0 g0Var, C17012n nVar, C14043j0 j0Var, C14454o oVar2, C14439g gVar, C14806r rVar, C12413b bVar, C14304i iVar, C14471w wVar) {
        C17012n nVar2 = nVar;
        C13706o.m87929f(oVar, "javaClassFinder");
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(j0Var, "notFoundClasses");
        C13706o.m87929f(oVar2, "reflectKotlinClassFinder");
        C13706o.m87929f(gVar, "deserializedDescriptorResolver");
        C13706o.m87929f(rVar, "errorReporter");
        C13706o.m87929f(bVar, "javaSourceElementFactory");
        C13706o.m87929f(iVar, "singleModuleClassResolver");
        C13706o.m87929f(wVar, "packagePartProvider");
        C14187j jVar = C14187j.f62868a;
        C14187j jVar2 = jVar;
        C13706o.m87928e(jVar, "DO_NOTHING");
        C14181g gVar2 = C14181g.f62863a;
        C14181g gVar3 = gVar2;
        C13706o.m87928e(gVar2, "EMPTY");
        C14179f.C14180a aVar = C14179f.C14180a.f62862a;
        C14225b bVar2 = r0;
        C16683b bVar3 = r14;
        C16683b bVar4 = new C16683b(nVar2, C13614t.m87748j());
        C13942c1.C13943a aVar2 = C13942c1.C13943a.f62415a;
        C12254c.C12255a aVar3 = C12254c.C12255a.f58865a;
        C14325o oVar3 = oVar;
        C13863j jVar3 = r2;
        C13863j jVar4 = new C13863j(g0Var, j0Var);
        C14191d dVar = r0;
        C14403w.C14405b bVar5 = C14403w.f63183d;
        C14191d dVar2 = new C14191d(bVar5.mo73097a());
        C14384l lVar = r0;
        C14226c.C14227a aVar4 = C14226c.C14227a.f62951a;
        C14226c.C14227a aVar5 = aVar4;
        C14384l lVar2 = new C14384l(new C14345d(aVar4));
        C14328p.C14329a aVar6 = C14328p.C14329a.f63106a;
        C14861m a = C14859l.f63983b.mo74091a();
        C14403w a2 = bVar5.mo73097a();
        C14438a aVar7 = r0;
        C14438a aVar8 = new C14438a();
        C17012n nVar3 = nVar;
        C14325o oVar4 = oVar3;
        C14454o oVar5 = oVar2;
        C14225b bVar6 = new C14225b(nVar3, oVar4, oVar5, gVar, jVar2, rVar, gVar3, aVar, bVar3, bVar, iVar, wVar, aVar2, aVar3, g0Var, jVar3, dVar, lVar, aVar6, aVar5, a, a2, aVar7, (C16611f) null, 8388608, (C13695i) null);
        return new C14299f(bVar2);
    }

    /* renamed from: c */
    public static /* synthetic */ C14299f m90586c(C14325o oVar, C13958g0 g0Var, C17012n nVar, C14043j0 j0Var, C14454o oVar2, C14439g gVar, C14806r rVar, C12413b bVar, C14304i iVar, C14471w wVar, int i, Object obj) {
        return m90585b(oVar, g0Var, nVar, j0Var, oVar2, gVar, rVar, bVar, iVar, (i & 512) != 0 ? C14471w.C14472a.f63313a : wVar);
    }
}
