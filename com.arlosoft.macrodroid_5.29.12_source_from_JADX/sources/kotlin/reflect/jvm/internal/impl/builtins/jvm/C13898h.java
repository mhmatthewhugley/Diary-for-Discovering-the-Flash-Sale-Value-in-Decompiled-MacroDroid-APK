package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14454o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14709a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14718d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14791j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14795l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14801o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14802p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14808s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14812v;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import p210ab.C11079a;
import p217bb.C11117a;
import p217bb.C11120c;
import p217bb.C11124e;
import p263fb.C12254c;
import p362pb.C16152c;
import p370qa.C16265l;
import p407ub.C16682a;
import p434xb.C16903a;
import p434xb.C16906c;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.h */
/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
public final class C13898h extends C14709a {

    /* renamed from: f */
    public static final C13899a f62171f = new C13899a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.h$a */
    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class C13899a {
        private C13899a() {
        }

        public /* synthetic */ C13899a(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13898h(C17012n nVar, C14454o oVar, C13958g0 g0Var, C14043j0 j0Var, C11117a aVar, C11120c cVar, C14795l lVar, C14859l lVar2, C16682a aVar2) {
        super(nVar, oVar, g0Var);
        C17012n nVar2 = nVar;
        C13958g0 g0Var2 = g0Var;
        C14043j0 j0Var2 = j0Var;
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(oVar, "finder");
        C13706o.m87929f(g0Var2, "moduleDescriptor");
        C13706o.m87929f(j0Var2, "notFoundClasses");
        C13706o.m87929f(aVar, "additionalClassPartsProvider");
        C13706o.m87929f(cVar, "platformDependentDeclarationFilter");
        C13706o.m87929f(lVar, "deserializationConfiguration");
        C13706o.m87929f(lVar2, "kotlinTypeChecker");
        C13706o.m87929f(aVar2, "samConversionResolver");
        C14801o oVar2 = r5;
        C14801o oVar3 = new C14801o(this);
        C14718d dVar = r8;
        C16903a aVar3 = C16903a.f68154n;
        C14718d dVar2 = new C14718d(g0Var2, j0Var2, aVar3);
        C14812v.C14813a aVar4 = C14812v.C14813a.f63938a;
        C14806r rVar = C14806r.f63932a;
        C13706o.m87928e(rVar, "DO_NOTHING");
        C14794k kVar = r0;
        C17012n nVar3 = nVar;
        C13958g0 g0Var3 = g0Var;
        C14794k kVar2 = new C14794k(nVar3, g0Var3, lVar, oVar2, dVar, this, aVar4, rVar, C12254c.C12255a.f58865a, C14808s.C14809a.f63933a, C13614t.m87751m(new C11079a(nVar2, g0Var), new C13874e(nVar, g0Var, (C16265l) null, 4, (C13695i) null)), j0Var, C14791j.f63889a.mo73958a(), aVar, cVar, aVar3.mo79783e(), lVar2, aVar2, (C11124e) null, (List) null, 786432, (C13695i) null);
        mo73837i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C14802p mo72215d(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        InputStream a = mo73834f().mo67436a(cVar);
        if (a == null) {
            return null;
        }
        return C16906c.f68156F.mo80079a(cVar, mo73836h(), mo73835g(), a, false);
    }
}
