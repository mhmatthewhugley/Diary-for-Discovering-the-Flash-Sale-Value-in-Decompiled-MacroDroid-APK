package p271gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p297ja.C13328m;
import p362pb.C16157f;
import p389sb.C16519a;

/* renamed from: gb.h */
/* compiled from: util.kt */
public final class C12337h {
    /* renamed from: a */
    public static final List<C13966i1> m83069a(Collection<? extends C14900e0> collection, Collection<? extends C13966i1> collection2, C13908a aVar) {
        C13706o.m87929f(collection, "newValueParameterTypes");
        C13706o.m87929f(collection2, "oldValueParameters");
        C13706o.m87929f(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<C13328m> N0 = C13566b0.m87413N0(collection, collection2);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(N0, 10));
        for (C13328m mVar : N0) {
            C14900e0 e0Var = (C14900e0) mVar.mo70152a();
            C13966i1 i1Var = (C13966i1) mVar.mo70153b();
            int i = i1Var.mo72303i();
            C13921g annotations = i1Var.getAnnotations();
            C16157f name = i1Var.getName();
            C13706o.m87928e(name, "oldParameter.name");
            boolean A0 = i1Var.mo72302A0();
            boolean r0 = i1Var.mo72305r0();
            boolean p0 = i1Var.mo72304p0();
            C14900e0 k = i1Var.mo72306v0() != null ? C16519a.m98619l(aVar).mo72296m().mo72138k(e0Var) : null;
            C14158z0 source = i1Var.getSource();
            C13706o.m87928e(source, "oldParameter.source");
            arrayList.add(new C14006l0(aVar, (C13966i1) null, i, annotations, name, e0Var, A0, r0, p0, k, source));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.reflect.jvm.internal.impl.resolve.scopes.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14289k m83070b(kotlin.reflect.jvm.internal.impl.descriptors.C13948e r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = p389sb.C16519a.m98623p(r3)
            r0 = 0
            if (r3 != 0) goto L_0x000d
            return r0
        L_0x000d:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r1 = r3.mo62176m0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14289k
            if (r2 == 0) goto L_0x0018
            r0 = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14289k) r0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k r0 = m83070b(r3)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p271gb.C12337h.m83070b(kotlin.reflect.jvm.internal.impl.descriptors.e):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k");
    }
}
