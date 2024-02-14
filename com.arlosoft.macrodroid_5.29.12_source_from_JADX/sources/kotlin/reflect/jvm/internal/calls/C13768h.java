package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13719a0;
import kotlin.reflect.jvm.internal.C13841i0;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.resolve.C14654f;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import p389sb.C16519a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo71668d2 = {"Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lkotlin/reflect/jvm/internal/impl/types/e0;", "i", "Lkotlin/reflect/jvm/internal/impl/descriptors/m;", "h", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.h */
/* compiled from: InlineClassAwareCaller.kt */
public final class C13768h {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2 = m88023f((r0 = m88026i((r0 = m88022e(r2)))), r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m88018a(java.lang.Object r1, kotlin.reflect.jvm.internal.impl.descriptors.C13936b r2) {
        /*
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14140t0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C14048j1) r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91645d(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = m88022e(r2)
            if (r0 == 0) goto L_0x002d
            java.lang.Class r0 = m88026i(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.reflect.Method r2 = m88023f(r0, r2)
            if (r2 != 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13768h.m88018a(java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.b):java.lang.Object");
    }

    /* renamed from: b */
    public static final <M extends Member> C13738d<M> m88019b(C13738d<? extends M> dVar, C13936b bVar, boolean z) {
        boolean z2;
        C13706o.m87929f(dVar, "<this>");
        C13706o.m87929f(bVar, "descriptor");
        boolean z3 = true;
        if (!C14654f.m91642a(bVar)) {
            List<C13966i1> g = bVar.mo72235g();
            C13706o.m87928e(g, "descriptor.valueParameters");
            if (!(g instanceof Collection) || !g.isEmpty()) {
                Iterator<T> it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C14900e0 type = ((C13966i1) it.next()).getType();
                    C13706o.m87928e(type, "it.type");
                    if (C14654f.m91644c(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                C14900e0 returnType = bVar.getReturnType();
                if (!(returnType != null && C14654f.m91644c(returnType)) && ((dVar instanceof C13737c) || !m88024g(bVar))) {
                    z3 = false;
                }
            }
        }
        return z3 ? new C13766g(bVar, dVar, z) : dVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C13738d m88020c(C13738d dVar, C13936b bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m88019b(dVar, bVar, z);
    }

    /* renamed from: d */
    public static final Method m88021d(Class<?> cls, C13936b bVar) {
        C13706o.m87929f(cls, "<this>");
        C13706o.m87929f(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{m88023f(cls, bVar).getReturnType()});
            C13706o.m87928e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C13719a0("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    /* renamed from: e */
    private static final C14900e0 m88022e(C13936b bVar) {
        C14146w0 P = bVar.mo72232P();
        C14146w0 L = bVar.mo72231L();
        if (P != null) {
            return P.getType();
        }
        if (L == null) {
            return null;
        }
        if (bVar instanceof C14052l) {
            return L.getType();
        }
        C14064m b = bVar.mo62163b();
        C13948e eVar = b instanceof C13948e ? (C13948e) b : null;
        if (eVar != null) {
            return eVar.mo72274p();
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m88023f(Class<?> cls, C13936b bVar) {
        C13706o.m87929f(cls, "<this>");
        C13706o.m87929f(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C13706o.m87928e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C13719a0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    /* renamed from: g */
    private static final boolean m88024g(C13936b bVar) {
        C14900e0 e = m88022e(bVar);
        return e != null && C14654f.m91644c(e);
    }

    /* renamed from: h */
    public static final Class<?> m88025h(C14064m mVar) {
        if (!(mVar instanceof C13948e) || !C14654f.m91643b(mVar)) {
            return null;
        }
        C13948e eVar = (C13948e) mVar;
        Class<?> o = C13841i0.m88210o(eVar);
        if (o != null) {
            return o;
        }
        throw new C13719a0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + C16519a.m98614g((C13961h) mVar) + ')');
    }

    /* renamed from: i */
    public static final Class<?> m88026i(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        Class<?> h = m88025h(e0Var.mo73702N0().mo62183c());
        if (h == null) {
            return null;
        }
        if (!C14956n1.m92997l(e0Var)) {
            return h;
        }
        C14900e0 e = C14654f.m91646e(e0Var);
        if (e != null && !C14956n1.m92997l(e) && !C13853h.m88274r0(e)) {
            return h;
        }
        return null;
    }
}
