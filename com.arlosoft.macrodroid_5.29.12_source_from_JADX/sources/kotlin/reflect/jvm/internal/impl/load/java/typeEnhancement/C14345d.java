package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14226c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14966q0;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d */
/* compiled from: typeEnhancement.kt */
public final class C14345d {

    /* renamed from: a */
    private final C14226c f63120a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a */
    /* compiled from: typeEnhancement.kt */
    private static final class C14346a {

        /* renamed from: a */
        private final C14900e0 f63121a;

        /* renamed from: b */
        private final int f63122b;

        public C14346a(C14900e0 e0Var, int i) {
            this.f63121a = e0Var;
            this.f63122b = i;
        }

        /* renamed from: a */
        public final int mo73010a() {
            return this.f63122b;
        }

        /* renamed from: b */
        public final C14900e0 mo73011b() {
            return this.f63121a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b */
    /* compiled from: typeEnhancement.kt */
    private static final class C14347b {

        /* renamed from: a */
        private final C14951m0 f63123a;

        /* renamed from: b */
        private final int f63124b;

        /* renamed from: c */
        private final boolean f63125c;

        public C14347b(C14951m0 m0Var, int i, boolean z) {
            this.f63123a = m0Var;
            this.f63124b = i;
            this.f63125c = z;
        }

        /* renamed from: a */
        public final boolean mo73012a() {
            return this.f63125c;
        }

        /* renamed from: b */
        public final int mo73013b() {
            return this.f63124b;
        }

        /* renamed from: c */
        public final C14951m0 mo73014c() {
            return this.f63123a;
        }
    }

    public C14345d(C14226c cVar) {
        C13706o.m87929f(cVar, "javaResolverSettings");
        this.f63120a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0174  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14345d.C14347b m90315b(kotlin.reflect.jvm.internal.impl.types.C14951m0 r19, p370qa.C16265l<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e> r20, int r21, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14394o r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14395p.m90429a(r22)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0015
            if (r23 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r7 = 0
            goto L_0x0016
        L_0x0015:
            r7 = 1
        L_0x0016:
            r8 = 0
            if (r4 != 0) goto L_0x0029
            java.util.List r4 = r19.mo73700L0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0029
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0029:
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r19.mo73702N0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.mo62183c()
            if (r4 != 0) goto L_0x0039
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0039:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r9 = r1.invoke(r9)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r9 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r9
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r.m90437g(r4, r9, r2)
            java.lang.Boolean r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r.m90438h(r9, r2)
            if (r4 == 0) goto L_0x0053
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r4.mo62171j()
            if (r10 != 0) goto L_0x0057
        L_0x0053:
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r19.mo73702N0()
        L_0x0057:
            r12 = r10
            java.lang.String r10 = "enhancedClassifier?.typeConstructor ?: constructor"
            kotlin.jvm.internal.C13706o.m87928e(r12, r10)
            int r10 = r21 + 1
            java.util.List r11 = r19.mo73700L0()
            java.util.List r13 = r12.getParameters()
            java.lang.String r14 = "typeConstructor.parameters"
            kotlin.jvm.internal.C13706o.m87928e(r13, r14)
            java.util.Iterator r14 = r11.iterator()
            java.util.Iterator r15 = r13.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r11 = kotlin.collections.C13616u.m87774u(r11, r5)
            int r13 = kotlin.collections.C13616u.m87774u(r13, r5)
            int r11 = java.lang.Math.min(r11, r13)
            r6.<init>(r11)
        L_0x0087:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x014c
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x014c
            java.lang.Object r11 = r14.next()
            java.lang.Object r13 = r15.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r13 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r13
            kotlin.reflect.jvm.internal.impl.types.g1 r11 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r11
            if (r7 != 0) goto L_0x00aa
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            r23 = r7
            r7 = 0
            r5.<init>(r8, r7)
            goto L_0x00fe
        L_0x00aa:
            r23 = r7
            boolean r5 = r11.mo74184b()
            if (r5 != 0) goto L_0x00bf
            kotlin.reflect.jvm.internal.impl.types.e0 r5 = r11.getType()
            kotlin.reflect.jvm.internal.impl.types.q1 r5 = r5.mo74145Q0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r5 = r0.m90317d(r5, r1, r10, r3)
            goto L_0x00fe
        L_0x00bf:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r1.invoke(r5)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r5 = r5.mo73017d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.FORCE_FLEXIBILITY
            if (r5 != r7) goto L_0x00f6
            kotlin.reflect.jvm.internal.impl.types.e0 r5 = r11.getType()
            kotlin.reflect.jvm.internal.impl.types.q1 r5 = r5.mo74145Q0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            kotlin.reflect.jvm.internal.impl.types.m0 r8 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92416c(r5)
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.m0 r8 = r8.mo73022U0(r1)
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92417d(r5)
            r5 = 1
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r1.mo73022U0(r5)
            kotlin.reflect.jvm.internal.impl.types.q1 r1 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92816d(r8, r1)
            r7.<init>(r1, r5)
            r5 = r7
            goto L_0x00fe
        L_0x00f6:
            r5 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            r7 = 0
            r1.<init>(r7, r5)
            r5 = r1
        L_0x00fe:
            int r1 = r5.mo73010a()
            int r10 = r10 + r1
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r5.mo73011b()
            java.lang.String r7 = "arg.projectionKind"
            if (r1 == 0) goto L_0x011b
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r5.mo73011b()
            kotlin.reflect.jvm.internal.impl.types.r1 r5 = r11.mo74185c()
            kotlin.jvm.internal.C13706o.m87928e(r5, r7)
            kotlin.reflect.jvm.internal.impl.types.g1 r7 = p225cc.C11170a.m74956e(r1, r5, r13)
            goto L_0x0140
        L_0x011b:
            if (r4 == 0) goto L_0x0138
            boolean r1 = r11.mo74184b()
            if (r1 != 0) goto L_0x0138
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r11.getType()
            java.lang.String r5 = "arg.type"
            kotlin.jvm.internal.C13706o.m87928e(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.r1 r5 = r11.mo74185c()
            kotlin.jvm.internal.C13706o.m87928e(r5, r7)
            kotlin.reflect.jvm.internal.impl.types.g1 r7 = p225cc.C11170a.m74956e(r1, r5, r13)
            goto L_0x0140
        L_0x0138:
            if (r4 == 0) goto L_0x013f
            kotlin.reflect.jvm.internal.impl.types.g1 r7 = kotlin.reflect.jvm.internal.impl.types.C14956n1.m93004s(r13)
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            r6.add(r7)
            r1 = r20
            r7 = r23
            r5 = 10
            r8 = 0
            goto L_0x0087
        L_0x014c:
            int r10 = r10 - r21
            if (r4 != 0) goto L_0x017c
            if (r2 != 0) goto L_0x017c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x015a
        L_0x0158:
            r7 = 1
            goto L_0x0172
        L_0x015a:
            java.util.Iterator r1 = r6.iterator()
        L_0x015e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0158
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.g1 r3 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r3
            if (r3 != 0) goto L_0x016e
            r7 = 1
            goto L_0x016f
        L_0x016e:
            r7 = 0
        L_0x016f:
            if (r7 != 0) goto L_0x015e
            r7 = 0
        L_0x0172:
            if (r7 == 0) goto L_0x017c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b
            r3 = 0
            r7 = 0
            r1.<init>(r7, r10, r3)
            return r1
        L_0x017c:
            r3 = 0
            r7 = 0
            r1 = 3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g[r1]
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r19.getAnnotations()
            r1[r3] = r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r.f63172b
            if (r4 == 0) goto L_0x018f
            r4 = 1
            goto L_0x0190
        L_0x018f:
            r4 = 0
        L_0x0190:
            if (r4 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r5 = r7
        L_0x0194:
            r4 = 1
            r1[r4] = r5
            r5 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r.f63171a
            if (r2 == 0) goto L_0x01a0
            r11 = 1
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            if (r11 == 0) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r8 = r7
        L_0x01a5:
            r1[r5] = r8
            java.util.List r1 = kotlin.collections.C13614t.m87753o(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r.m90436f(r1)
            kotlin.reflect.jvm.internal.impl.types.a1 r11 = kotlin.reflect.jvm.internal.impl.types.C14834b1.m92419b(r1)
            java.util.List r1 = r19.mo73700L0()
            java.util.Iterator r5 = r6.iterator()
            java.util.Iterator r7 = r1.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r8 = 10
            int r6 = kotlin.collections.C13616u.m87774u(r6, r8)
            int r1 = kotlin.collections.C13616u.m87774u(r1, r8)
            int r1 = java.lang.Math.min(r6, r1)
            r13.<init>(r1)
        L_0x01d2:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01f2
            java.lang.Object r1 = r5.next()
            java.lang.Object r6 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.g1 r6 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r6
            kotlin.reflect.jvm.internal.impl.types.g1 r1 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r1
            if (r1 != 0) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r6 = r1
        L_0x01ee:
            r13.add(r6)
            goto L_0x01d2
        L_0x01f2:
            if (r2 == 0) goto L_0x01f9
            boolean r1 = r2.booleanValue()
            goto L_0x01fd
        L_0x01f9:
            boolean r1 = r19.mo73021O0()
        L_0x01fd:
            r14 = r1
            r15 = 0
            r16 = 16
            r17 = 0
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92821i(r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = r9.mo73015b()
            if (r5 == 0) goto L_0x0211
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r0.m90318e(r1)
        L_0x0211:
            if (r2 == 0) goto L_0x021b
            boolean r2 = r9.mo73018e()
            if (r2 == 0) goto L_0x021b
            r5 = 1
            goto L_0x021c
        L_0x021b:
            r5 = 0
        L_0x021c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b
            r2.<init>(r1, r10, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14345d.m90315b(kotlin.reflect.jvm.internal.impl.types.m0, qa.l, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b");
    }

    /* renamed from: c */
    static /* synthetic */ C14347b m90316c(C14345d dVar, C14951m0 m0Var, C16265l lVar, int i, C14394o oVar, boolean z, boolean z2, int i2, Object obj) {
        return dVar.m90315b(m0Var, lVar, i, oVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14345d.C14346a m90317d(kotlin.reflect.jvm.internal.impl.types.C14967q1 r12, p370qa.C16265l<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.C14925g0.m92873a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.C14990y
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.C14944l0
            r9 = r12
            kotlin.reflect.jvm.internal.impl.types.y r9 = (kotlin.reflect.jvm.internal.impl.types.C14990y) r9
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = r9.mo74251V0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14394o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r10 = r2.m90315b(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = r9.mo74252W0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14394o.FLEXIBLE_UPPER
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r13 = r2.m90315b(r3, r4, r5, r6, r7, r8)
            r10.mo73013b()
            r13.mo73013b()
            kotlin.reflect.jvm.internal.impl.types.m0 r14 = r10.mo73014c()
            if (r14 != 0) goto L_0x0043
            kotlin.reflect.jvm.internal.impl.types.m0 r14 = r13.mo73014c()
            if (r14 != 0) goto L_0x0043
            goto L_0x00a3
        L_0x0043:
            boolean r14 = r10.mo73012a()
            if (r14 != 0) goto L_0x0085
            boolean r14 = r13.mo73012a()
            if (r14 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            if (r0 == 0) goto L_0x006c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f
            kotlin.reflect.jvm.internal.impl.types.m0 r12 = r10.mo73014c()
            if (r12 != 0) goto L_0x005e
            kotlin.reflect.jvm.internal.impl.types.m0 r12 = r9.mo74251V0()
        L_0x005e:
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r13.mo73014c()
            if (r13 != 0) goto L_0x0068
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r9.mo74252W0()
        L_0x0068:
            r1.<init>(r12, r13)
            goto L_0x00a3
        L_0x006c:
            kotlin.reflect.jvm.internal.impl.types.m0 r12 = r10.mo73014c()
            if (r12 != 0) goto L_0x0076
            kotlin.reflect.jvm.internal.impl.types.m0 r12 = r9.mo74251V0()
        L_0x0076:
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r13.mo73014c()
            if (r13 != 0) goto L_0x0080
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r9.mo74252W0()
        L_0x0080:
            kotlin.reflect.jvm.internal.impl.types.q1 r1 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92816d(r12, r13)
            goto L_0x00a3
        L_0x0085:
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r13.mo73014c()
            if (r13 == 0) goto L_0x0098
            kotlin.reflect.jvm.internal.impl.types.m0 r14 = r10.mo73014c()
            if (r14 != 0) goto L_0x0092
            r14 = r13
        L_0x0092:
            kotlin.reflect.jvm.internal.impl.types.q1 r13 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92816d(r14, r13)
            if (r13 != 0) goto L_0x009f
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.types.m0 r13 = r10.mo73014c()
            kotlin.jvm.internal.C13706o.m87926c(r13)
        L_0x009f:
            kotlin.reflect.jvm.internal.impl.types.q1 r1 = kotlin.reflect.jvm.internal.impl.types.C14964p1.m93057d(r12, r13)
        L_0x00a3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            int r13 = r10.mo73013b()
            r12.<init>(r1, r13)
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.C14951m0
            if (r0 == 0) goto L_0x00e0
            r2 = r12
            kotlin.reflect.jvm.internal.impl.types.m0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14951m0) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14394o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r13 = m90316c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r14 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            boolean r15 = r13.mo73012a()
            if (r15 == 0) goto L_0x00d3
            kotlin.reflect.jvm.internal.impl.types.m0 r15 = r13.mo73014c()
            kotlin.reflect.jvm.internal.impl.types.q1 r12 = kotlin.reflect.jvm.internal.impl.types.C14964p1.m93057d(r12, r15)
            goto L_0x00d7
        L_0x00d3:
            kotlin.reflect.jvm.internal.impl.types.m0 r12 = r13.mo73014c()
        L_0x00d7:
            int r13 = r13.mo73013b()
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00df:
            return r12
        L_0x00e0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14345d.m90317d(kotlin.reflect.jvm.internal.impl.types.q1, qa.l, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a");
    }

    /* renamed from: e */
    private final C14951m0 m90318e(C14951m0 m0Var) {
        if (this.f63120a.mo72787a()) {
            return C14966q0.m93070h(m0Var, true);
        }
        return new C14351g(m0Var);
    }

    /* renamed from: a */
    public final C14900e0 mo73009a(C14900e0 e0Var, C16265l<? super Integer, C14348e> lVar, boolean z) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(lVar, "qualifiers");
        return m90317d(e0Var.mo74145Q0(), lVar, 0, z).mo73011b();
    }
}
