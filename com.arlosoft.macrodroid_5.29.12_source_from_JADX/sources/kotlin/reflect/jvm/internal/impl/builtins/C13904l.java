package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14004k0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14010m;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14040y;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p225cc.C11170a;
import p362pb.C16157f;
import p442yb.C16986f;
import p442yb.C17012n;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.l */
/* compiled from: suspendFunctionTypes.kt */
public final class C13904l {

    /* renamed from: a */
    private static final C14040y f62291a;

    static {
        C14010m mVar = new C14010m(C17088k.f68644a.mo80366i(), C13902k.f62188j);
        C13951f fVar = C13951f.INTERFACE;
        C16157f g = C13902k.f62191m.mo78562g();
        C14158z0 z0Var = C14158z0.f62778a;
        C17012n nVar = C16986f.f68366e;
        C14040y yVar = new C14040y(mVar, fVar, false, false, g, z0Var, nVar);
        yVar.mo72547M0(C13945d0.ABSTRACT);
        yVar.mo72549O0(C14127t.f62754e);
        yVar.mo72548N0(C13612s.m87736e(C14004k0.m88945R0(yVar, C13921g.f62330v.mo72251b(), false, C14970r1.IN_VARIANCE, C16157f.m97019i(ExifInterface.GPS_DIRECTION_TRUE), 0, nVar)));
        yVar.mo72545K0();
        f62291a = yVar;
    }

    /* renamed from: a */
    public static final C14951m0 m88465a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "suspendFunType");
        C13852g.m88238q(e0Var);
        C13853h h = C11170a.m74959h(e0Var);
        C13921g annotations = e0Var.getAnnotations();
        C14900e0 j = C13852g.m88231j(e0Var);
        List<C14900e0> e = C13852g.m88226e(e0Var);
        List<C14926g1> l = C13852g.m88233l(e0Var);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(l, 10));
        for (C14926g1 type : l) {
            arrayList.add(type.getType());
        }
        C14830a1 h2 = C14830a1.f63959c.mo74051h();
        C14901e1 j2 = f62291a.mo62171j();
        C13706o.m87928e(j2, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List r0 = C13566b0.m87443r0(arrayList, C14906f0.m92821i(h2, j2, C13612s.m87736e(C11170a.m74952a(C13852g.m88232k(e0Var))), false, (C14849g) null, 16, (Object) null));
        C14951m0 I = C11170a.m74959h(e0Var).mo72119I();
        C13706o.m87928e(I, "suspendFunType.builtIns.nullableAnyType");
        return C13852g.m88224c(h, annotations, j, e, r0, (List) null, I, false, 128, (Object) null).mo73022U0(e0Var.mo73021O0());
    }
}
