package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import p243dc.C12007b;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.y */
/* compiled from: utils.kt */
public final class C14882y {
    /* renamed from: a */
    private static final C14900e0 m92715a(C14900e0 e0Var) {
        return C12007b.m82436a(e0Var).mo67455d();
    }

    /* renamed from: b */
    private static final String m92716b(C14901e1 e1Var) {
        StringBuilder sb = new StringBuilder();
        m92717c("type: " + e1Var, sb);
        m92717c("hashCode: " + e1Var.hashCode(), sb);
        m92717c("javaClass: " + e1Var.getClass().getCanonicalName(), sb);
        for (C14064m c = e1Var.mo62183c(); c != null; c = c.mo62163b()) {
            m92717c("fqName: " + C14552c.f63483g.mo73527q(c), sb);
            m92717c("javaClass: " + c.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    private static final StringBuilder m92717c(String str, StringBuilder sb) {
        C13706o.m87929f(str, "<this>");
        sb.append(str);
        C13706o.m87928e(sb, "append(value)");
        sb.append(10);
        C13706o.m87928e(sb, "append('\\n')");
        return sb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.types.C14900e0 m92718d(kotlin.reflect.jvm.internal.impl.types.C14900e0 r9, kotlin.reflect.jvm.internal.impl.types.C14900e0 r10, kotlin.reflect.jvm.internal.impl.types.checker.C14870v r11) {
        /*
            java.lang.String r0 = "subtype"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "supertype"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "typeCheckingProcedureCallbacks"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.checker.s r1 = new kotlin.reflect.jvm.internal.impl.types.checker.s
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = r10.mo73702N0()
        L_0x0021:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x0123
            java.lang.Object r10 = r0.poll()
            kotlin.reflect.jvm.internal.impl.types.checker.s r10 = (kotlin.reflect.jvm.internal.impl.types.checker.C14867s) r10
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r10.mo74101b()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.mo73702N0()
            boolean r4 = r11.mo74102a(r3, r9)
            if (r4 == 0) goto L_0x0101
            boolean r0 = r1.mo73021O0()
            kotlin.reflect.jvm.internal.impl.types.checker.s r10 = r10.mo74100a()
        L_0x0043:
            if (r10 == 0) goto L_0x00bf
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = r10.mo74101b()
            java.util.List r4 = r3.mo73700L0()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x005b
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x005b
        L_0x0059:
            r4 = 0
            goto L_0x0079
        L_0x005b:
            java.util.Iterator r4 = r4.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.g1 r5 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r5
            kotlin.reflect.jvm.internal.impl.types.r1 r5 = r5.mo74185c()
            kotlin.reflect.jvm.internal.impl.types.r1 r8 = kotlin.reflect.jvm.internal.impl.types.C14970r1.INVARIANT
            if (r5 == r8) goto L_0x0075
            r5 = 1
            goto L_0x0076
        L_0x0075:
            r5 = 0
        L_0x0076:
            if (r5 == 0) goto L_0x005f
            r4 = 1
        L_0x0079:
            if (r4 == 0) goto L_0x0099
            kotlin.reflect.jvm.internal.impl.types.f1$a r4 = kotlin.reflect.jvm.internal.impl.types.C14911f1.f64041c
            kotlin.reflect.jvm.internal.impl.types.j1 r4 = r4.mo74160a(r3)
            kotlin.reflect.jvm.internal.impl.types.j1 r4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d.m91516f(r4, r7, r6, r2)
            kotlin.reflect.jvm.internal.impl.types.l1 r4 = r4.mo74203c()
            kotlin.reflect.jvm.internal.impl.types.r1 r5 = kotlin.reflect.jvm.internal.impl.types.C14970r1.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r4.mo74214n(r1, r5)
            java.lang.String r4 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = m92715a(r1)
            goto L_0x00ae
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.types.f1$a r4 = kotlin.reflect.jvm.internal.impl.types.C14911f1.f64041c
            kotlin.reflect.jvm.internal.impl.types.j1 r4 = r4.mo74160a(r3)
            kotlin.reflect.jvm.internal.impl.types.l1 r4 = r4.mo74203c()
            kotlin.reflect.jvm.internal.impl.types.r1 r5 = kotlin.reflect.jvm.internal.impl.types.C14970r1.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r4.mo74214n(r1, r5)
            java.lang.String r4 = "{\n                    Ty…ARIANT)\n                }"
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
        L_0x00ae:
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r3.mo73021O0()
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r0 = 0
            goto L_0x00ba
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            kotlin.reflect.jvm.internal.impl.types.checker.s r10 = r10.mo74100a()
            goto L_0x0043
        L_0x00bf:
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r1.mo73702N0()
            boolean r2 = r11.mo74102a(r10, r9)
            if (r2 == 0) goto L_0x00ce
            kotlin.reflect.jvm.internal.impl.types.e0 r9 = kotlin.reflect.jvm.internal.impl.types.C14956n1.m93001p(r1, r0)
            return r9
        L_0x00ce:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\nsubstitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = m92716b(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\nsupertype: "
            r1.append(r2)
            java.lang.String r2 = m92716b(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.mo74102a(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0101:
            java.util.Collection r1 = r3.mo72370l()
            java.util.Iterator r1 = r1.iterator()
        L_0x0109:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r3
            kotlin.reflect.jvm.internal.impl.types.checker.s r4 = new kotlin.reflect.jvm.internal.impl.types.checker.s
            java.lang.String r5 = "immediateSupertype"
            kotlin.jvm.internal.C13706o.m87928e(r3, r5)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L_0x0109
        L_0x0123:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.C14882y.m92718d(kotlin.reflect.jvm.internal.impl.types.e0, kotlin.reflect.jvm.internal.impl.types.e0, kotlin.reflect.jvm.internal.impl.types.checker.v):kotlin.reflect.jvm.internal.impl.types.e0");
    }
}
