package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13975b;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14228d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p288ib.C12495j;
import p288ib.C12512y;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m */
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class C14297m extends C13975b {

    /* renamed from: B */
    private final C14301g f63057B;

    /* renamed from: C */
    private final C12512y f63058C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14297m(C14301g gVar, C12512y yVar, int i, C14064m mVar) {
        super(gVar.mo72918e(), mVar, new C14228d(gVar, yVar, false, 4, (C13695i) null), yVar.getName(), C14970r1.INVARIANT, false, i, C14158z0.f62778a, gVar.mo72914a().mo72784v());
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(yVar, "javaTypeParameter");
        C13706o.m87929f(mVar, "containingDeclaration");
        this.f63057B = gVar;
        this.f63058C = yVar;
    }

    /* renamed from: M0 */
    private final List<C14900e0> m90139M0() {
        Collection<C12495j> upperBounds = this.f63058C.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C14951m0 i = this.f63057B.mo72917d().mo72296m().mo72136i();
            C13706o.m87928e(i, "c.module.builtIns.anyType");
            C14951m0 I = this.f63057B.mo72917d().mo72296m().mo72119I();
            C13706o.m87928e(I, "c.module.builtIns.nullableAnyType");
            return C13612s.m87736e(C14906f0.m92816d(i, I));
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(upperBounds, 10));
        for (C12495j o : upperBounds) {
            arrayList.add(this.f63057B.mo72920g().mo72939o(o, C14312d.m90202d(C14190k.COMMON, false, this, 1, (Object) null)));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public List<C14900e0> mo72375G0(List<? extends C14900e0> list) {
        C13706o.m87929f(list, "bounds");
        return this.f63057B.mo72914a().mo72780r().mo73067i(this, list, this.f63057B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo72376K0(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public List<C14900e0> mo72377L0() {
        return m90139M0();
    }
}
