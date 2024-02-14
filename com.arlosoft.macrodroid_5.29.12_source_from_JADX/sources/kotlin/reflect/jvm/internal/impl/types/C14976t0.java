package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.t0 */
/* compiled from: StarProjectionImpl.kt */
public final class C14976t0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.t0$a */
    /* compiled from: StarProjectionImpl.kt */
    public static final class C14977a extends C14911f1 {

        /* renamed from: d */
        final /* synthetic */ List<C14901e1> f64100d;

        C14977a(List<? extends C14901e1> list) {
            this.f64100d = list;
        }

        /* renamed from: k */
        public C14926g1 mo67460k(C14901e1 e1Var) {
            C13706o.m87929f(e1Var, "key");
            if (!this.f64100d.contains(e1Var)) {
                return null;
            }
            C13961h c = e1Var.mo62183c();
            C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return C14956n1.m93004s((C13950e1) c);
        }
    }

    /* renamed from: a */
    private static final C14900e0 m93116a(List<? extends C14901e1> list, List<? extends C14900e0> list2, C13853h hVar) {
        C14900e0 p = C14945l1.m92939g(new C14977a(list)).mo74215p((C14900e0) C13566b0.m87422W(list2), C14970r1.OUT_VARIANCE);
        if (p == null) {
            p = hVar.mo72150y();
        }
        C13706o.m87928e(p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p;
    }

    /* renamed from: b */
    public static final C14900e0 m93117b(C13950e1 e1Var) {
        C13706o.m87929f(e1Var, "<this>");
        C14064m b = e1Var.mo62163b();
        C13706o.m87928e(b, "this.containingDeclaration");
        if (b instanceof C13964i) {
            List<C13950e1> parameters = ((C13964i) b).mo62171j().getParameters();
            C13706o.m87928e(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
            for (C13950e1 j : parameters) {
                C14901e1 j2 = j.mo62171j();
                C13706o.m87928e(j2, "it.typeConstructor");
                arrayList.add(j2);
            }
            List<C14900e0> upperBounds = e1Var.getUpperBounds();
            C13706o.m87928e(upperBounds, "upperBounds");
            return m93116a(arrayList, upperBounds, C16519a.m98613f(e1Var));
        } else if (b instanceof C14154y) {
            List<C13950e1> typeParameters = ((C14154y) b).getTypeParameters();
            C13706o.m87928e(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(typeParameters, 10));
            for (C13950e1 j3 : typeParameters) {
                C14901e1 j4 = j3.mo62171j();
                C13706o.m87928e(j4, "it.typeConstructor");
                arrayList2.add(j4);
            }
            List<C14900e0> upperBounds2 = e1Var.getUpperBounds();
            C13706o.m87928e(upperBounds2, "upperBounds");
            return m93116a(arrayList2, upperBounds2, C16519a.m98613f(e1Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
