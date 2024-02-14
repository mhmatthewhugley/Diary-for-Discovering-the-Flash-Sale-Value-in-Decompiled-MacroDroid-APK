package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14157z;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.f */
/* compiled from: inlineClassesUtils.kt */
public final class C14654f {

    /* renamed from: a */
    private static final C16152c f63650a;

    /* renamed from: b */
    private static final C16151b f63651b;

    static {
        C16152c cVar = new C16152c("kotlin.jvm.JvmInline");
        f63650a = cVar;
        C16151b m = C16151b.m96975m(cVar);
        C13706o.m87928e(m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f63651b = m;
    }

    /* renamed from: a */
    public static final boolean m91642a(C13908a aVar) {
        C13706o.m87929f(aVar, "<this>");
        if (aVar instanceof C14142u0) {
            C14140t0 W = ((C14142u0) aVar).mo72327W();
            C13706o.m87928e(W, "correspondingProperty");
            if (m91645d(W)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m91643b(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return (mVar instanceof C13948e) && (((C13948e) mVar).mo62155U() instanceof C14157z);
    }

    /* renamed from: c */
    public static final boolean m91644c(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c != null) {
            return m91643b(c);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m91645d(C14048j1 j1Var) {
        C14157z<C14951m0> j;
        C13706o.m87929f(j1Var, "<this>");
        if (j1Var.mo72232P() == null) {
            C14064m b = j1Var.mo62163b();
            C16157f fVar = null;
            C13948e eVar = b instanceof C13948e ? (C13948e) b : null;
            if (!(eVar == null || (j = C16519a.m98617j(eVar)) == null)) {
                fVar = j.mo72668c();
            }
            if (C13706o.m87924a(fVar, j1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final C14900e0 m91646e(C14900e0 e0Var) {
        C14157z<C14951m0> j;
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (!(c instanceof C13948e)) {
            c = null;
        }
        C13948e eVar = (C13948e) c;
        if (eVar == null || (j = C16519a.m98617j(eVar)) == null) {
            return null;
        }
        return j.mo72669d();
    }
}
