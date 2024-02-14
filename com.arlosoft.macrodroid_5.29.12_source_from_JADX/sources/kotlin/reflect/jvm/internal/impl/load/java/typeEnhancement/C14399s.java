package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.types.C14952m1;
import p218bc.C11134i;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s */
/* compiled from: typeEnhancementUtils.kt */
public final class C14399s {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        if (r6 == false) goto L_0x00d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e m90440a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e r6, java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "superQualifiers"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = m90441b(r2)
            if (r2 == 0) goto L_0x0013
            r0.add(r2)
            goto L_0x0013
        L_0x0029:
            java.util.Set r0 = kotlin.collections.C13566b0.m87407K0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = m90441b(r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = m90444e(r0, r1, r8)
            if (r0 != 0) goto L_0x0063
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0040:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r3 = r3.mo73017d()
            if (r3 == 0) goto L_0x0040
            r1.add(r3)
            goto L_0x0040
        L_0x0056:
            java.util.Set r1 = kotlin.collections.C13566b0.m87407K0(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = r6.mo73017d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = m90444e(r1, r2, r8)
            goto L_0x0064
        L_0x0063:
            r1 = r0
        L_0x0064:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x006d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r4
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r4 = r4.mo73016c()
            if (r4 == 0) goto L_0x006d
            r2.add(r4)
            goto L_0x006d
        L_0x0083:
            java.util.Set r2 = kotlin.collections.C13566b0.m87407K0(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14350f.MUTABLE
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14350f.READ_ONLY
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r5 = r6.mo73016c()
            java.lang.Object r8 = m90443d(r2, r3, r4, r5, r8)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14350f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00a9
            if (r10 != 0) goto L_0x00a5
            if (r9 == 0) goto L_0x00a3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            if (r1 != r9) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r9 = 0
            goto L_0x00a6
        L_0x00a5:
            r9 = 1
        L_0x00a6:
            if (r9 != 0) goto L_0x00a9
            r2 = r1
        L_0x00a9:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            if (r2 != r9) goto L_0x00d6
            boolean r6 = r6.mo73015b()
            if (r6 != 0) goto L_0x00d4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x00bb
        L_0x00b9:
            r6 = 0
            goto L_0x00d2
        L_0x00bb:
            java.util.Iterator r6 = r7.iterator()
        L_0x00bf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r7 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r7
            boolean r7 = r7.mo73015b()
            if (r7 == 0) goto L_0x00bf
            r6 = 1
        L_0x00d2:
            if (r6 == 0) goto L_0x00d6
        L_0x00d4:
            r6 = 1
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            if (r0 == r1) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r3 = 0
        L_0x00dd:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14399s.m90440a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e, java.util.Collection, boolean, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e");
    }

    /* renamed from: b */
    private static final C14352h m90441b(C14348e eVar) {
        if (eVar.mo73018e()) {
            return null;
        }
        return eVar.mo73017d();
    }

    /* renamed from: c */
    public static final boolean m90442c(C14952m1 m1Var, C11134i iVar) {
        C13706o.m87929f(m1Var, "<this>");
        C13706o.m87929f(iVar, "type");
        C16152c cVar = C14163a0.f62804u;
        C13706o.m87928e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return m1Var.mo73781P(iVar, cVar);
    }

    /* renamed from: d */
    private static final <T> T m90443d(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> K0;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (!C13706o.m87924a(t4, t) || !C13706o.m87924a(t3, t2)) {
                return t3 == null ? t4 : t3;
            }
            return null;
        }
        if (!(t3 == null || (K0 = C13566b0.m87407K0(C13563a1.m87392k(set, t3))) == null)) {
            set = K0;
        }
        return C13566b0.m87447v0(set);
    }

    /* renamed from: e */
    private static final C14352h m90444e(Set<? extends C14352h> set, C14352h hVar, boolean z) {
        C14352h hVar2 = C14352h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (C14352h) m90443d(set, C14352h.NOT_NULL, C14352h.NULLABLE, hVar, z);
    }
}
