package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14313e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14317f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14319g;
import kotlin.reflect.jvm.internal.impl.resolve.C14651e;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.sequences.C15118h;
import p271gb.C12331e;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.l */
/* compiled from: ErasedOverridabilityCondition.kt */
public final class C14219l implements C14651e {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.l$a */
    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class C14220a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62925a;

        static {
            int[] iArr = new int[C14658j.C14667i.C14668a.values().length];
            iArr[C14658j.C14667i.C14668a.OVERRIDABLE.ordinal()] = 1;
            f62925a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.l$b */
    /* compiled from: ErasedOverridabilityCondition.kt */
    static final class C14221b extends C13708q implements C16265l<C13966i1, C14900e0> {

        /* renamed from: a */
        public static final C14221b f62926a = new C14221b();

        C14221b() {
            super(1);
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13966i1 i1Var) {
            return i1Var.getType();
        }
    }

    /* renamed from: a */
    public C14651e.C14652a mo72758a() {
        return C14651e.C14652a.SUCCESS_ONLY;
    }

    /* renamed from: b */
    public C14651e.C14653b mo72759b(C13908a aVar, C13908a aVar2, C13948e eVar) {
        boolean z;
        boolean z2;
        C13706o.m87929f(aVar, "superDescriptor");
        C13706o.m87929f(aVar2, "subDescriptor");
        if (aVar2 instanceof C12331e) {
            C12331e eVar2 = (C12331e) aVar2;
            List<C13950e1> typeParameters = eVar2.getTypeParameters();
            C13706o.m87928e(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                C14658j.C14667i w = C14658j.m91687w(aVar, aVar2);
                if ((w != null ? w.mo73778c() : null) != null) {
                    return C14651e.C14653b.UNKNOWN;
                }
                List<C13966i1> g = eVar2.mo72235g();
                C13706o.m87928e(g, "subDescriptor.valueParameters");
                C15118h w2 = C15132p.m93494w(C13566b0.m87412N(g), C14221b.f62926a);
                C14900e0 returnType = eVar2.getReturnType();
                C13706o.m87926c(returnType);
                C15118h z3 = C15132p.m93497z(w2, returnType);
                C14146w0 P = eVar2.mo72232P();
                Iterator it = C15132p.m93496y(z3, C13614t.m87752n(P != null ? P.getType() : null)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C14900e0 e0Var = (C14900e0) it.next();
                    if (!(!e0Var.mo73700L0().isEmpty()) || (e0Var.mo74145Q0() instanceof C14317f)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return C14651e.C14653b.UNKNOWN;
                }
                C13908a aVar3 = (C13908a) aVar.mo72267c(new C14313e((C14319g) null, 1, (C13695i) null).mo74203c());
                if (aVar3 == null) {
                    return C14651e.C14653b.UNKNOWN;
                }
                if (aVar3 instanceof C14156y0) {
                    C14156y0 y0Var = (C14156y0) aVar3;
                    List<C13950e1> typeParameters2 = y0Var.getTypeParameters();
                    C13706o.m87928e(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        aVar3 = y0Var.mo72401t().mo72510p(C13614t.m87748j()).build();
                        C13706o.m87926c(aVar3);
                    }
                }
                C14658j.C14667i.C14668a c = C14658j.f63654f.mo73770F(aVar3, aVar2, false).mo73778c();
                C13706o.m87928e(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (C14220a.f62925a[c.ordinal()] == 1) {
                    return C14651e.C14653b.OVERRIDABLE;
                }
                return C14651e.C14653b.UNKNOWN;
            }
        }
        return C14651e.C14653b.UNKNOWN;
    }
}
