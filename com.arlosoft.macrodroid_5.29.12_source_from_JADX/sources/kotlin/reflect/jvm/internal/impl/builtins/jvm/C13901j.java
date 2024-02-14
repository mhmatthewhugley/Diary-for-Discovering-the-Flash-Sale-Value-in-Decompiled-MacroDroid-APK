package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.types.C14911f1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p225cc.C11170a;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.j */
/* compiled from: mappingUtil.kt */
public final class C13901j {
    /* renamed from: a */
    public static final C14911f1 m88453a(C13948e eVar, C13948e eVar2) {
        C13706o.m87929f(eVar, TypedValues.Transition.S_FROM);
        C13706o.m87929f(eVar2, TypedValues.Transition.S_TO);
        eVar.mo62178q().size();
        eVar2.mo62178q().size();
        C14911f1.C14912a aVar = C14911f1.f64041c;
        List<C13950e1> q = eVar.mo62178q();
        C13706o.m87928e(q, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(q, 10));
        for (C13950e1 j : q) {
            arrayList.add(j.mo62171j());
        }
        List<C13950e1> q2 = eVar2.mo62178q();
        C13706o.m87928e(q2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(q2, 10));
        for (C13950e1 p : q2) {
            C14951m0 p2 = p.mo72274p();
            C13706o.m87928e(p2, "it.defaultType");
            arrayList2.add(C11170a.m74952a(p2));
        }
        return C14911f1.C14912a.m92833e(aVar, C13615t0.m87768r(C13566b0.m87413N0(arrayList, arrayList2)), false, 2, (Object) null);
    }
}
