package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14927h;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14964p1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import p218bc.C11134i;
import p370qa.C16265l;
import p433xa.C16878g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.f */
/* compiled from: KotlinTypePreparator.kt */
public abstract class C14846f extends C14927h {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.f$a */
    /* compiled from: KotlinTypePreparator.kt */
    public static final class C14847a extends C14846f {

        /* renamed from: a */
        public static final C14847a f63968a = new C14847a();

        private C14847a() {
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.f$b */
    /* compiled from: KotlinTypePreparator.kt */
    /* synthetic */ class C14848b extends C13703l implements C16265l<C11134i, C14967q1> {
        C14848b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "prepareType";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14846f.class);
        }

        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        /* renamed from: l */
        public final C14967q1 invoke(C11134i iVar) {
            C13706o.m87929f(iVar, "p0");
            return ((C14846f) this.receiver).mo74061a(iVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.reflect.jvm.internal.impl.types.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlin.reflect.jvm.internal.impl.types.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.reflect.jvm.internal.impl.types.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.reflect.jvm.internal.impl.types.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.reflect.jvm.internal.impl.types.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlin.reflect.jvm.internal.impl.types.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: kotlin.reflect.jvm.internal.impl.types.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlin.reflect.jvm.internal.impl.types.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: kotlin.reflect.jvm.internal.impl.types.q1} */
    /* JADX WARNING: type inference failed for: r5v3, types: [kotlin.reflect.jvm.internal.impl.types.d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.types.C14951m0 m92534c(kotlin.reflect.jvm.internal.impl.types.C14951m0 r17) {
        /*
            r16 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r17.mo73702N0()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14606c
            r2 = 1
            r3 = 0
            r4 = 10
            r5 = 0
            if (r1 == 0) goto L_0x0085
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r0 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14606c) r0
            kotlin.reflect.jvm.internal.impl.types.g1 r1 = r0.mo73707U0()
            kotlin.reflect.jvm.internal.impl.types.r1 r6 = r1.mo74185c()
            kotlin.reflect.jvm.internal.impl.types.r1 r7 = kotlin.reflect.jvm.internal.impl.types.C14970r1.IN_VARIANCE
            if (r6 != r7) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r5
        L_0x0021:
            if (r1 == 0) goto L_0x002d
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r1.getType()
            if (r1 == 0) goto L_0x002d
            kotlin.reflect.jvm.internal.impl.types.q1 r5 = r1.mo74145Q0()
        L_0x002d:
            r9 = r5
            kotlin.reflect.jvm.internal.impl.types.checker.j r1 = r0.mo73709f()
            if (r1 != 0) goto L_0x0069
            kotlin.reflect.jvm.internal.impl.types.g1 r11 = r0.mo73707U0()
            java.util.Collection r1 = r0.mo72370l()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = kotlin.collections.C13616u.m87774u(r1, r4)
            r12.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r2
            kotlin.reflect.jvm.internal.impl.types.q1 r2 = r2.mo74145Q0()
            r12.add(r2)
            goto L_0x0049
        L_0x005d:
            r13 = 0
            r14 = 4
            r15 = 0
            kotlin.reflect.jvm.internal.impl.types.checker.j r1 = new kotlin.reflect.jvm.internal.impl.types.checker.j
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.mo73711h(r1)
        L_0x0069:
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            bc.b r7 = p218bc.C11127b.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.j r8 = r0.mo73709f()
            kotlin.jvm.internal.C13706o.m87926c(r8)
            kotlin.reflect.jvm.internal.impl.types.a1 r10 = r17.mo73701M0()
            boolean r11 = r17.mo73021O0()
            r12 = 0
            r13 = 32
            r14 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x0085:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C14635p
            if (r1 == 0) goto L_0x00cf
            kotlin.reflect.jvm.internal.impl.resolve.constants.p r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C14635p) r0
            java.util.Collection r0 = r0.mo72370l()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C13616u.m87774u(r0, r4)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r2
            boolean r4 = r17.mo73021O0()
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = kotlin.reflect.jvm.internal.impl.types.C14956n1.m93001p(r2, r4)
            java.lang.String r4 = "makeNullableAsSpecified(it, type.isMarkedNullable)"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            r1.add(r2)
            goto L_0x009c
        L_0x00b9:
            kotlin.reflect.jvm.internal.impl.types.d0 r0 = new kotlin.reflect.jvm.internal.impl.types.d0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.a1 r1 = r17.mo73701M0()
            java.util.List r2 = kotlin.collections.C13614t.m87748j()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r4 = r17.mo72955n()
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92822j(r1, r0, r2, r3, r4)
            return r0
        L_0x00cf:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.C14884d0
            if (r1 == 0) goto L_0x0120
            boolean r1 = r17.mo73021O0()
            if (r1 == 0) goto L_0x0120
            kotlin.reflect.jvm.internal.impl.types.d0 r0 = (kotlin.reflect.jvm.internal.impl.types.C14884d0) r0
            java.util.Collection r1 = r0.mo72370l()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = kotlin.collections.C13616u.m87774u(r1, r4)
            r6.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ec:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0101
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r3
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = p225cc.C11170a.m74971t(r3)
            r6.add(r3)
            r3 = 1
            goto L_0x00ec
        L_0x0101:
            if (r3 != 0) goto L_0x0104
            goto L_0x0117
        L_0x0104:
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r0.mo74116g()
            if (r1 == 0) goto L_0x010e
            kotlin.reflect.jvm.internal.impl.types.e0 r5 = p225cc.C11170a.m74971t(r1)
        L_0x010e:
            kotlin.reflect.jvm.internal.impl.types.d0 r1 = new kotlin.reflect.jvm.internal.impl.types.d0
            r1.<init>(r6)
            kotlin.reflect.jvm.internal.impl.types.d0 r5 = r1.mo74120k(r5)
        L_0x0117:
            if (r5 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r0 = r5
        L_0x011b:
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = r0.mo74115f()
            return r0
        L_0x0120:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.C14846f.m92534c(kotlin.reflect.jvm.internal.impl.types.m0):kotlin.reflect.jvm.internal.impl.types.m0");
    }

    /* renamed from: b */
    public C14967q1 mo74061a(C11134i iVar) {
        C14967q1 q1Var;
        C13706o.m87929f(iVar, "type");
        if (iVar instanceof C14900e0) {
            C14967q1 Q0 = ((C14900e0) iVar).mo74145Q0();
            if (Q0 instanceof C14951m0) {
                q1Var = m92534c((C14951m0) Q0);
            } else if (Q0 instanceof C14990y) {
                C14990y yVar = (C14990y) Q0;
                C14951m0 c = m92534c(yVar.mo74251V0());
                C14951m0 c2 = m92534c(yVar.mo74252W0());
                if (c == yVar.mo74251V0() && c2 == yVar.mo74252W0()) {
                    q1Var = Q0;
                } else {
                    q1Var = C14906f0.m92816d(c, c2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return C14964p1.m93056c(q1Var, Q0, new C14848b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
