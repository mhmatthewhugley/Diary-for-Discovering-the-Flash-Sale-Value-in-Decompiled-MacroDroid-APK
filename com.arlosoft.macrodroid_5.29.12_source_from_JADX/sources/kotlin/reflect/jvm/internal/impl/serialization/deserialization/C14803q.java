package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14774i;
import p308kb.C13488l;
import p308kb.C13491m;
import p308kb.C13497o;
import p308kb.C13505p;
import p327mb.C15712a;
import p327mb.C15720d;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.q */
/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class C14803q extends C14802p {

    /* renamed from: A */
    private final C15720d f63926A;

    /* renamed from: B */
    private final C14824y f63927B;

    /* renamed from: C */
    private C13491m f63928C;

    /* renamed from: D */
    private C14692h f63929D;

    /* renamed from: s */
    private final C15712a f63930s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C14750f f63931z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.q$a */
    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class C14804a extends C13708q implements C16265l<C16151b, C14158z0> {
        final /* synthetic */ C14803q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14804a(C14803q qVar) {
            super(1);
            this.this$0 = qVar;
        }

        /* renamed from: a */
        public final C14158z0 invoke(C16151b bVar) {
            C13706o.m87929f(bVar, "it");
            C14750f M0 = this.this$0.f63931z;
            if (M0 != null) {
                return M0;
            }
            C14158z0 z0Var = C14158z0.f62778a;
            C13706o.m87928e(z0Var, "NO_SOURCE");
            return z0Var;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.q$b */
    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class C14805b extends C13708q implements C16254a<Collection<? extends C16157f>> {
        final /* synthetic */ C14803q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14805b(C14803q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* renamed from: a */
        public final Collection<C16157f> invoke() {
            Collection<C16151b> b = this.this$0.mo73999G0().mo74021b();
            ArrayList<C16151b> arrayList = new ArrayList<>();
            for (T next : b) {
                C16151b bVar = (C16151b) next;
                if (!bVar.mo78554l() && !C14787i.f63883c.mo73955a().contains(bVar)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
            for (C16151b j : arrayList) {
                arrayList2.add(j.mo78552j());
            }
            return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14803q(C16152c cVar, C17012n nVar, C13958g0 g0Var, C13491m mVar, C15712a aVar, C14750f fVar) {
        super(cVar, nVar, g0Var);
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(mVar, "proto");
        C13706o.m87929f(aVar, "metadataVersion");
        this.f63930s = aVar;
        this.f63931z = fVar;
        C13505p R = mVar.mo71330R();
        C13706o.m87928e(R, "proto.strings");
        C13497o Q = mVar.mo71329Q();
        C13706o.m87928e(Q, "proto.qualifiedNames");
        C15720d dVar = new C15720d(R, Q);
        this.f63926A = dVar;
        this.f63927B = new C14824y(mVar, dVar, aVar, new C14804a(this));
        this.f63928C = mVar;
    }

    /* renamed from: L0 */
    public void mo74001L0(C14794k kVar) {
        C13706o.m87929f(kVar, "components");
        C13491m mVar = this.f63928C;
        if (mVar != null) {
            this.f63928C = null;
            C13488l P = mVar.mo71328P();
            C13706o.m87928e(P, "proto.`package`");
            C15720d dVar = this.f63926A;
            C15712a aVar = this.f63930s;
            C14750f fVar = this.f63931z;
            this.f63929D = new C14774i(this, P, dVar, aVar, fVar, kVar, "scope of " + this, new C14805b(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: N0 */
    public C14824y mo73999G0() {
        return this.f63927B;
    }

    /* renamed from: n */
    public C14692h mo72205n() {
        C14692h hVar = this.f63929D;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("_memberScope");
        return null;
    }
}
