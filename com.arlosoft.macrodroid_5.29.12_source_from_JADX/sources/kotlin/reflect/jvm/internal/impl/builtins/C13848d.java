package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p362pb.C16151b;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.d */
/* compiled from: CompanionObjectMappingUtils.kt */
public final class C13848d {
    /* renamed from: a */
    public static final boolean m88219a(C13847c cVar, C13948e eVar) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(eVar, "classDescriptor");
        if (C14650d.m91637x(eVar)) {
            Set<C16151b> b = cVar.mo72109b();
            C16151b g = C16519a.m98614g(eVar);
            if (C13566b0.m87414O(b, g != null ? g.mo78548g() : null)) {
                return true;
            }
        }
        return false;
    }
}
