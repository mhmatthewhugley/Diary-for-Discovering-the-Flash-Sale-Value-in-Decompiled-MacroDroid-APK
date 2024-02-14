package p434xb;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13843a;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14065m0;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14718d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14791j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14795l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14801o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14808s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14812v;
import kotlin.reflect.jvm.internal.impl.types.checker.C14859l;
import p217bb.C11117a;
import p217bb.C11119b;
import p217bb.C11120c;
import p217bb.C11124e;
import p263fb.C12254c;
import p362pb.C16152c;
import p370qa.C16265l;
import p407ub.C16683b;
import p433xa.C16878g;
import p442yb.C17012n;

/* renamed from: xb.b */
/* compiled from: BuiltInsLoaderImpl.kt */
public final class C16904b implements C13843a {

    /* renamed from: b */
    private final C16908d f68155b = new C16908d();

    /* renamed from: xb.b$a */
    /* compiled from: BuiltInsLoaderImpl.kt */
    /* synthetic */ class C16905a extends C13703l implements C16265l<String, InputStream> {
        C16905a(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "loadResource";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C16908d.class);
        }

        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        /* renamed from: l */
        public final InputStream invoke(String str) {
            C13706o.m87929f(str, "p0");
            return ((C16908d) this.receiver).mo80080a(str);
        }
    }

    /* renamed from: a */
    public C14053l0 mo72105a(C17012n nVar, C13958g0 g0Var, Iterable<? extends C11119b> iterable, C11120c cVar, C11117a aVar, boolean z) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "builtInsModule");
        C13706o.m87929f(iterable, "classDescriptorFactories");
        C13706o.m87929f(cVar, "platformDependentDeclarationFilter");
        C13706o.m87929f(aVar, "additionalClassPartsProvider");
        return mo80077b(nVar, g0Var, C13902k.f62202x, iterable, cVar, aVar, z, new C16905a(this.f68155b));
    }

    /* renamed from: b */
    public final C14053l0 mo80077b(C17012n nVar, C13958g0 g0Var, Set<C16152c> set, Iterable<? extends C11119b> iterable, C11120c cVar, C11117a aVar, boolean z, C16265l<? super String, ? extends InputStream> lVar) {
        C17012n nVar2 = nVar;
        C13958g0 g0Var2 = g0Var;
        Set<C16152c> set2 = set;
        C16265l<? super String, ? extends InputStream> lVar2 = lVar;
        C13706o.m87929f(nVar2, "storageManager");
        C13706o.m87929f(g0Var2, "module");
        C13706o.m87929f(set2, "packageFqNames");
        C13706o.m87929f(iterable, "classDescriptorFactories");
        C13706o.m87929f(cVar, "platformDependentDeclarationFilter");
        C13706o.m87929f(aVar, "additionalClassPartsProvider");
        C13706o.m87929f(lVar2, "loadResource");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(set2, 10));
        for (C16152c cVar2 : set) {
            String n = C16903a.f68154n.mo80076n(cVar2);
            InputStream inputStream = (InputStream) lVar2.invoke(n);
            if (inputStream != null) {
                arrayList.add(C16906c.f68156F.mo80079a(cVar2, nVar, g0Var, inputStream, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + n);
            }
        }
        C14065m0 m0Var = r2;
        C14065m0 m0Var2 = new C14065m0(arrayList);
        C14043j0 j0Var = r1;
        C14043j0 j0Var2 = new C14043j0(nVar2, g0Var2);
        C14795l.C14796a aVar2 = C14795l.C14796a.f63913a;
        C14801o oVar = r5;
        C14801o oVar2 = new C14801o(m0Var2);
        C14718d dVar = r7;
        C14065m0 m0Var3 = m0Var2;
        C16903a aVar3 = C16903a.f68154n;
        C14718d dVar2 = new C14718d(g0Var2, j0Var2, aVar3);
        C14812v.C14813a aVar4 = C14812v.C14813a.f63938a;
        C14806r rVar = C14806r.f63932a;
        C14794k kVar = r0;
        C14806r rVar2 = rVar;
        ArrayList arrayList2 = arrayList;
        C13706o.m87928e(rVar, "DO_NOTHING");
        C12254c.C12255a aVar5 = C12254c.C12255a.f58865a;
        ArrayList<C16906c> arrayList3 = arrayList2;
        C14808s.C14809a aVar6 = C14808s.C14809a.f63933a;
        C14791j a = C14791j.f63889a.mo73958a();
        C14490f e = aVar3.mo79783e();
        C16683b bVar = r1;
        C16683b bVar2 = new C16683b(nVar2, C13614t.m87748j());
        C14065m0 m0Var4 = m0Var3;
        C14794k kVar2 = new C14794k(nVar, g0Var, aVar2, oVar, dVar, m0Var, aVar4, rVar2, aVar5, aVar6, iterable, j0Var, a, aVar, cVar, e, (C14859l) null, bVar, (C11124e) null, (List) null, 851968, (C13695i) null);
        for (C16906c L0 : arrayList3) {
            L0.mo74001L0(kVar);
        }
        return m0Var4;
    }
}
