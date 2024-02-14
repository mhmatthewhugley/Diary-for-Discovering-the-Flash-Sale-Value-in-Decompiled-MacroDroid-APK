package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14972s0;
import kotlin.reflect.jvm.internal.impl.types.C14976t0;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d */
/* compiled from: JavaTypeResolver.kt */
public final class C14312d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C16152c f63086a = new C16152c("java.lang.Class");

    /* renamed from: b */
    public static final C14926g1 m90200b(C13950e1 e1Var, C14308a aVar) {
        C13706o.m87929f(e1Var, "typeParameter");
        C13706o.m87929f(aVar, "attr");
        if (aVar.mo72929e() == C14190k.SUPERTYPE) {
            return new C14933i1(C14976t0.m93117b(e1Var));
        }
        return new C14972s0(e1Var);
    }

    /* renamed from: c */
    public static final C14308a m90201c(C14190k kVar, boolean z, C13950e1 e1Var) {
        C13706o.m87929f(kVar, "<this>");
        return new C14308a(kVar, (C14309b) null, z, e1Var != null ? C13625y0.m87800c(e1Var) : null, (C14951m0) null, 18, (C13695i) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C14308a m90202d(C14190k kVar, boolean z, C13950e1 e1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            e1Var = null;
        }
        return m90201c(kVar, z, e1Var);
    }
}
