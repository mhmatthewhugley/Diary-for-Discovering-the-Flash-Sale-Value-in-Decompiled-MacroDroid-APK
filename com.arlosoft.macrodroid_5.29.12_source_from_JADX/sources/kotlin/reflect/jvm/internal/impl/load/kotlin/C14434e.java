package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13878f;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13898h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13997i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14037x;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14299f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14305j;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14791j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14795l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14812v;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import p211ac.C11091a;
import p217bb.C11117a;
import p217bb.C11120c;
import p217bb.C11124e;
import p263fb.C12254c;
import p279hb.C12413b;
import p349ob.C15841i;
import p362pb.C16157f;
import p371qb.C16277a;
import p398tb.C16608c;
import p407ub.C16683b;
import p442yb.C16986f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e */
/* compiled from: DeserializationComponentsForJava.kt */
public final class C14434e {

    /* renamed from: b */
    public static final C14435a f63267b = new C14435a((C13695i) null);

    /* renamed from: a */
    private final C14794k f63268a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a */
    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class C14435a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a$a */
        /* compiled from: DeserializationComponentsForJava.kt */
        public static final class C14436a {

            /* renamed from: a */
            private final C14434e f63269a;

            /* renamed from: b */
            private final C14439g f63270b;

            public C14436a(C14434e eVar, C14439g gVar) {
                C13706o.m87929f(eVar, "deserializationComponentsForJava");
                C13706o.m87929f(gVar, "deserializedDescriptorResolver");
                this.f63269a = eVar;
                this.f63270b = gVar;
            }

            /* renamed from: a */
            public final C14434e mo73158a() {
                return this.f63269a;
            }

            /* renamed from: b */
            public final C14439g mo73159b() {
                return this.f63270b;
            }
        }

        private C14435a() {
        }

        public /* synthetic */ C14435a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14436a mo73157a(C14454o oVar, C14454o oVar2, C14325o oVar3, String str, C14806r rVar, C12413b bVar) {
            String str2 = str;
            C13706o.m87929f(oVar, "kotlinClassFinder");
            C13706o.m87929f(oVar2, "jvmBuiltInsKotlinClassFinder");
            C14325o oVar4 = oVar3;
            C13706o.m87929f(oVar4, "javaClassFinder");
            C13706o.m87929f(str2, "moduleName");
            C13706o.m87929f(rVar, "errorReporter");
            C12413b bVar2 = bVar;
            C13706o.m87929f(bVar2, "javaSourceElementFactory");
            C16986f fVar = new C16986f("DeserializationComponentsForJava.ModuleData");
            C13878f fVar2 = new C13878f(fVar, C13878f.C13879a.FROM_DEPENDENCIES);
            C16157f l = C16157f.m97021l('<' + str2 + '>');
            C13706o.m87928e(l, "special(\"<$moduleName>\")");
            C14037x xVar = new C14037x(l, fVar, fVar2, (C16277a) null, (Map) null, (C16157f) null, 56, (C13695i) null);
            fVar2.mo72114D0(xVar);
            fVar2.mo72195I0(xVar, true);
            C14439g gVar = new C14439g();
            C14305j jVar = new C14305j();
            C14043j0 j0Var = new C14043j0(fVar, xVar);
            C14454o oVar5 = oVar;
            C14043j0 j0Var2 = j0Var;
            C14305j jVar2 = jVar;
            C14806r rVar2 = rVar;
            C14439g gVar2 = gVar;
            C14037x xVar2 = xVar;
            C13878f fVar3 = fVar2;
            C14299f c = C14437f.m90586c(oVar4, xVar, fVar, j0Var, oVar5, gVar, rVar2, bVar2, jVar2, (C14471w) null, 512, (Object) null);
            C14434e a = C14437f.m90584a(xVar2, fVar, j0Var2, c, oVar5, gVar2, rVar2);
            C14439g gVar3 = gVar2;
            gVar3.mo73164l(a);
            C14181g gVar4 = C14181g.f62863a;
            C13706o.m87928e(gVar4, "EMPTY");
            C16608c cVar = new C16608c(c, gVar4);
            jVar2.mo72925c(cVar);
            C13898h hVar = new C13898h(fVar, oVar2, xVar2, j0Var2, fVar3.mo72194H0(), fVar3.mo72194H0(), C14795l.C14796a.f63913a, C14859l.f63983b.mo74091a(), new C16683b(fVar, C13614t.m87748j()));
            C14037x xVar3 = xVar2;
            xVar3.mo72542Y0(xVar3);
            List m = C13614t.m87751m(cVar.mo79454a(), hVar);
            xVar3.mo72537S0(new C13997i(m, "CompositeProvider@RuntimeModuleData for " + xVar3));
            return new C14436a(a, gVar3);
        }
    }

    public C14434e(C17012n nVar, C13958g0 g0Var, C14795l lVar, C14442h hVar, C14427c cVar, C14299f fVar, C14043j0 j0Var, C14806r rVar, C12254c cVar2, C14791j jVar, C14859l lVar2, C11091a aVar) {
        C11120c cVar3;
        C11117a aVar2;
        C17012n nVar2 = nVar;
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(g0Var, "moduleDescriptor");
        C13706o.m87929f(lVar, "configuration");
        C13706o.m87929f(hVar, "classDataFinder");
        C13706o.m87929f(cVar, "annotationAndConstantLoader");
        C13706o.m87929f(fVar, "packageFragmentProvider");
        C13706o.m87929f(j0Var, "notFoundClasses");
        C13706o.m87929f(rVar, "errorReporter");
        C13706o.m87929f(cVar2, "lookupTracker");
        C13706o.m87929f(jVar, "contractDeserializer");
        C13706o.m87929f(lVar2, "kotlinTypeChecker");
        C13706o.m87929f(aVar, "typeAttributeTranslators");
        C13853h m = g0Var.mo72296m();
        C13878f fVar2 = m instanceof C13878f ? (C13878f) m : null;
        C14812v.C14813a aVar3 = C14812v.C14813a.f63938a;
        C14443i iVar = C14443i.f63281a;
        List j = C13614t.m87748j();
        C11117a aVar4 = (fVar2 == null || (aVar2 = fVar2.mo72194H0()) == null) ? C11117a.C11118a.f54036a : aVar2;
        C11120c cVar4 = (fVar2 == null || (cVar3 = fVar2.mo72194H0()) == null) ? C11120c.C11122b.f54038a : cVar3;
        C14490f a = C15841i.f65291a.mo75619a();
        C16683b bVar = r0;
        C16683b bVar2 = new C16683b(nVar2, C13614t.m87748j());
        C14794k kVar = r0;
        C14794k kVar2 = new C14794k(nVar, g0Var, lVar, hVar, cVar, fVar, aVar3, rVar, cVar2, iVar, j, j0Var, jVar, aVar4, cVar4, a, lVar2, bVar, (C11124e) null, aVar.mo62209a(), 262144, (C13695i) null);
        this.f63268a = kVar;
    }

    /* renamed from: a */
    public final C14794k mo73156a() {
        return this.f63268a;
    }
}
