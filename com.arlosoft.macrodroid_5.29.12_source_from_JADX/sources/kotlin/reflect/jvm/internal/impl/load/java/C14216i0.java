package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import p271gb.C12331e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i0 */
/* compiled from: utils.kt */
public final class C14216i0 {
    /* renamed from: a */
    public static final boolean m89796a(C13936b bVar) {
        C13706o.m87929f(bVar, "memberDescriptor");
        return (bVar instanceof C14154y) && C13706o.m87924a(bVar.mo68665u0(C12331e.f59012Y), Boolean.TRUE);
    }

    /* renamed from: b */
    public static final boolean m89797b(C14403w wVar) {
        C13706o.m87929f(wVar, "javaTypeEnhancementState");
        return wVar.mo73093c().invoke(C14400u.m90449e()) == C14200f0.STRICT;
    }

    /* renamed from: c */
    public static final C14141u m89798c(C14068m1 m1Var) {
        C13706o.m87929f(m1Var, "<this>");
        C14141u g = C14331r.m90260g(m1Var);
        C13706o.m87928e(g, "toDescriptorVisibility(this)");
        return g;
    }
}
