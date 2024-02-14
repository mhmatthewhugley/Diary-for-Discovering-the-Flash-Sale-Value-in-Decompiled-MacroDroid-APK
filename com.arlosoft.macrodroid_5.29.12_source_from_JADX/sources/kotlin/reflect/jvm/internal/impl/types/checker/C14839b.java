package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13949e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14157z;
import kotlin.reflect.jvm.internal.impl.resolve.C14654f;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14604a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14628n;
import kotlin.reflect.jvm.internal.impl.types.C14884d0;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14911f1;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14935j0;
import kotlin.reflect.jvm.internal.impl.types.C14944l0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14952m1;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14961p;
import kotlin.reflect.jvm.internal.impl.types.C14963p0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14981v;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import p218bc.C11127b;
import p218bc.C11128c;
import p218bc.C11129d;
import p218bc.C11130e;
import p218bc.C11131f;
import p218bc.C11132g;
import p218bc.C11134i;
import p218bc.C11135j;
import p218bc.C11136k;
import p218bc.C11137l;
import p218bc.C11138m;
import p218bc.C11139n;
import p218bc.C11140o;
import p218bc.C11143q;
import p218bc.C11145r;
import p218bc.C11148t;
import p218bc.C11149u;
import p225cc.C11170a;
import p362pb.C16152c;
import p362pb.C16153d;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b */
/* compiled from: ClassicTypeSystemContext.kt */
public interface C14839b extends C14952m1, C11145r {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a */
    /* compiled from: ClassicTypeSystemContext.kt */
    public static final class C14840a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a */
        /* compiled from: ClassicTypeSystemContext.kt */
        public static final class C14841a extends C14889d1.C14893c.C14894a {

            /* renamed from: a */
            final /* synthetic */ C14839b f63965a;

            /* renamed from: b */
            final /* synthetic */ C14945l1 f63966b;

            C14841a(C14839b bVar, C14945l1 l1Var) {
                this.f63965a = bVar;
                this.f63966b = l1Var;
            }

            /* renamed from: a */
            public C11136k mo74058a(C14889d1 d1Var, C11134i iVar) {
                C13706o.m87929f(d1Var, "state");
                C13706o.m87929f(iVar, "type");
                C14839b bVar = this.f63965a;
                C14945l1 l1Var = this.f63966b;
                C11136k m0 = bVar.mo62314m0(iVar);
                C13706o.m87927d(m0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                C14900e0 n = l1Var.mo74214n((C14900e0) m0, C14970r1.INVARIANT);
                C13706o.m87928e(n, "substitutor.safeSubstitu…VARIANT\n                )");
                C11136k e = bVar.mo62298e(n);
                C13706o.m87926c(e);
                return e;
            }
        }

        /* renamed from: A */
        public static C11140o m92442A(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                if (c instanceof C13950e1) {
                    return (C13950e1) c;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: A0 */
        public static C11128c m92443A0(C14839b bVar, C11129d dVar) {
            C13706o.m87929f(dVar, "$receiver");
            if (dVar instanceof C14852i) {
                return ((C14852i) dVar).mo73702N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C13687e0.m87868b(dVar.getClass())).toString());
        }

        /* renamed from: B */
        public static C11134i m92444B(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return C14654f.m91646e((C14900e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: B0 */
        public static C11139n m92445B0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74897n(bVar, iVar);
        }

        /* renamed from: C */
        public static List<C11134i> m92446C(C14839b bVar, C11140o oVar) {
            C13706o.m87929f(oVar, "$receiver");
            if (oVar instanceof C13950e1) {
                List<C14900e0> upperBounds = ((C13950e1) oVar).getUpperBounds();
                C13706o.m87928e(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C13687e0.m87868b(oVar.getClass())).toString());
        }

        /* renamed from: C0 */
        public static C11139n m92447C0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return ((C14951m0) kVar).mo73702N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: D */
        public static C11149u m92448D(C14839b bVar, C11138m mVar) {
            C13706o.m87929f(mVar, "$receiver");
            if (mVar instanceof C14926g1) {
                C14970r1 c = ((C14926g1) mVar).mo74185c();
                C13706o.m87928e(c, "this.projectionKind");
                return C11143q.m74883a(c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C13687e0.m87868b(mVar.getClass())).toString());
        }

        /* renamed from: D0 */
        public static C11136k m92449D0(C14839b bVar, C11132g gVar) {
            C13706o.m87929f(gVar, "$receiver");
            if (gVar instanceof C14990y) {
                return ((C14990y) gVar).mo74252W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C13687e0.m87868b(gVar.getClass())).toString());
        }

        /* renamed from: E */
        public static C11149u m92450E(C14839b bVar, C11140o oVar) {
            C13706o.m87929f(oVar, "$receiver");
            if (oVar instanceof C13950e1) {
                C14970r1 l = ((C13950e1) oVar).mo72273l();
                C13706o.m87928e(l, "this.variance");
                return C11143q.m74883a(l);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C13687e0.m87868b(oVar.getClass())).toString());
        }

        /* renamed from: E0 */
        public static C11136k m92451E0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74898o(bVar, iVar);
        }

        /* renamed from: F */
        public static boolean m92452F(C14839b bVar, C11134i iVar, C16152c cVar) {
            C13706o.m87929f(iVar, "$receiver");
            C13706o.m87929f(cVar, "fqName");
            if (iVar instanceof C14900e0) {
                return ((C14900e0) iVar).getAnnotations().mo72249n1(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: F0 */
        public static C11134i m92453F0(C14839b bVar, C11134i iVar, boolean z) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C11136k) {
                return bVar.mo62291a((C11136k) iVar, z);
            }
            if (iVar instanceof C11132g) {
                C11132g gVar = (C11132g) iVar;
                return bVar.mo73787n0(bVar.mo62291a(bVar.mo62294c(gVar), z), bVar.mo62291a(bVar.mo62302g(gVar), z));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: G */
        public static boolean m92454G(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74887d(bVar, iVar);
        }

        /* renamed from: G0 */
        public static C11136k m92455G0(C14839b bVar, C11136k kVar, boolean z) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return ((C14951m0) kVar).mo73022U0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: H */
        public static boolean m92456H(C14839b bVar, C11140o oVar, C11139n nVar) {
            boolean z;
            C13706o.m87929f(oVar, "$receiver");
            if (oVar instanceof C13950e1) {
                if (nVar == null) {
                    z = true;
                } else {
                    z = nVar instanceof C14901e1;
                }
                if (z) {
                    return C11170a.m74963l((C13950e1) oVar, (C14901e1) nVar, (Set) null, 4, (Object) null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C13687e0.m87868b(oVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C13687e0.m87868b(oVar.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m92457I(C14839b bVar, C11136k kVar, C11136k kVar2) {
            C13706o.m87929f(kVar, "a");
            C13706o.m87929f(kVar2, "b");
            if (!(kVar instanceof C14951m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
            } else if (kVar2 instanceof C14951m0) {
                return ((C14951m0) kVar).mo73700L0() == ((C14951m0) kVar2).mo73700L0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar2 + ", " + C13687e0.m87868b(kVar2.getClass())).toString());
            }
        }

        /* renamed from: J */
        public static C11134i m92458J(C14839b bVar, List<? extends C11134i> list) {
            C13706o.m87929f(list, "types");
            return C14843d.m92530a(list);
        }

        /* renamed from: K */
        public static boolean m92459K(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return C13853h.m88278v0((C14901e1) nVar, C13902k.C13903a.f62241b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: L */
        public static boolean m92460L(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74888e(bVar, iVar);
        }

        /* renamed from: M */
        public static boolean m92461M(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            return C11145r.C11146a.m74889f(bVar, kVar);
        }

        /* renamed from: N */
        public static boolean m92462N(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return ((C14901e1) nVar).mo62183c() instanceof C13948e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: O */
        public static boolean m92463O(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
                if (eVar == null || !C13949e0.m88575a(eVar) || eVar.mo62168h() == C13951f.ENUM_ENTRY || eVar.mo62168h() == C13951f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: P */
        public static boolean m92464P(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74890g(bVar, iVar);
        }

        /* renamed from: Q */
        public static boolean m92465Q(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return ((C14901e1) nVar).mo62184d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m92466R(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74891h(bVar, iVar);
        }

        /* renamed from: S */
        public static boolean m92467S(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return C14925g0.m92873a((C14900e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: T */
        public static boolean m92468T(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                C13960g1<C14951m0> g1Var = null;
                C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
                if (eVar != null) {
                    g1Var = eVar.mo62155U();
                }
                return g1Var instanceof C14157z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m92469U(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            return C11145r.C11146a.m74892i(bVar, kVar);
        }

        /* renamed from: V */
        public static boolean m92470V(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return nVar instanceof C14628n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: W */
        public static boolean m92471W(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return nVar instanceof C14884d0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: X */
        public static boolean m92472X(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74893j(bVar, iVar);
        }

        /* renamed from: Y */
        public static boolean m92473Y(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return ((C14951m0) kVar).mo73021O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: Z */
        public static boolean m92474Z(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return iVar instanceof C14935j0;
        }

        /* renamed from: a */
        public static boolean m92475a(C14839b bVar, C11139n nVar, C11139n nVar2) {
            C13706o.m87929f(nVar, "c1");
            C13706o.m87929f(nVar2, "c2");
            if (!(nVar instanceof C14901e1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
            } else if (nVar2 instanceof C14901e1) {
                return C13706o.m87924a(nVar, nVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar2 + ", " + C13687e0.m87868b(nVar2.getClass())).toString());
            }
        }

        /* renamed from: a0 */
        public static boolean m92476a0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74894k(bVar, iVar);
        }

        /* renamed from: b */
        public static int m92477b(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return ((C14900e0) iVar).mo73700L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: b0 */
        public static boolean m92478b0(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return C13853h.m88278v0((C14901e1) nVar, C13902k.C13903a.f62243c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C11137l m92479c(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return (C11137l) kVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: c0 */
        public static boolean m92480c0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return C14956n1.m92997l((C14900e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: d */
        public static C11129d m92481d(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (!(kVar instanceof C14951m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
            } else if (kVar instanceof C14963p0) {
                return bVar.mo62296d(((C14963p0) kVar).mo74038G0());
            } else {
                if (kVar instanceof C14852i) {
                    return (C14852i) kVar;
                }
                return null;
            }
        }

        /* renamed from: d0 */
        public static boolean m92482d0(C14839b bVar, C11129d dVar) {
            C13706o.m87929f(dVar, "$receiver");
            return dVar instanceof C14604a;
        }

        /* renamed from: e */
        public static C11130e m92483e(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (!(kVar instanceof C14951m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
            } else if (kVar instanceof C14961p) {
                return (C14961p) kVar;
            } else {
                return null;
            }
        }

        /* renamed from: e0 */
        public static boolean m92484e0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14900e0) {
                return C13853h.m88274r0((C14900e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: f */
        public static C11131f m92485f(C14839b bVar, C11132g gVar) {
            C13706o.m87929f(gVar, "$receiver");
            if (!(gVar instanceof C14990y)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C13687e0.m87868b(gVar.getClass())).toString());
            } else if (gVar instanceof C14981v) {
                return (C14981v) gVar;
            } else {
                return null;
            }
        }

        /* renamed from: f0 */
        public static boolean m92486f0(C14839b bVar, C11129d dVar) {
            C13706o.m87929f(dVar, "$receiver");
            if (dVar instanceof C14852i) {
                return ((C14852i) dVar).mo74076Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C13687e0.m87868b(dVar.getClass())).toString());
        }

        /* renamed from: g */
        public static C11132g m92487g(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                C14967q1 Q0 = ((C14900e0) iVar).mo74145Q0();
                if (Q0 instanceof C14990y) {
                    return (C14990y) Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: g0 */
        public static boolean m92488g0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                if (!C14925g0.m92873a((C14900e0) kVar)) {
                    C14951m0 m0Var = (C14951m0) kVar;
                    return !(m0Var.mo73702N0().mo62183c() instanceof C13947d1) && (m0Var.mo73702N0().mo62183c() != null || (kVar instanceof C14604a) || (kVar instanceof C14852i) || (kVar instanceof C14961p) || (m0Var.mo73702N0() instanceof C14628n) || m92490h0(bVar, kVar));
                }
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: h */
        public static C11135j m92489h(C14839b bVar, C11132g gVar) {
            C13706o.m87929f(gVar, "$receiver");
            if (!(gVar instanceof C14990y)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C13687e0.m87868b(gVar.getClass())).toString());
            } else if (gVar instanceof C14944l0) {
                return (C14944l0) gVar;
            } else {
                return null;
            }
        }

        /* renamed from: h0 */
        private static boolean m92490h0(C14839b bVar, C11136k kVar) {
            return (kVar instanceof C14963p0) && bVar.mo62300f(((C14963p0) kVar).mo74038G0());
        }

        /* renamed from: i */
        public static C11136k m92491i(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                C14967q1 Q0 = ((C14900e0) iVar).mo74145Q0();
                if (Q0 instanceof C14951m0) {
                    return (C14951m0) Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: i0 */
        public static boolean m92492i0(C14839b bVar, C11138m mVar) {
            C13706o.m87929f(mVar, "$receiver");
            if (mVar instanceof C14926g1) {
                return ((C14926g1) mVar).mo74184b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C13687e0.m87868b(mVar.getClass())).toString());
        }

        /* renamed from: j */
        public static C11138m m92493j(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return C11170a.m74952a((C14900e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: j0 */
        public static boolean m92494j0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return C11170a.m74964m((C14900e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: k */
        public static C11136k m92495k(C14839b bVar, C11136k kVar, C11127b bVar2) {
            C13706o.m87929f(kVar, "type");
            C13706o.m87929f(bVar2, NotificationCompat.CATEGORY_STATUS);
            if (kVar instanceof C14951m0) {
                return C14858k.m92589b((C14951m0) kVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: k0 */
        public static boolean m92496k0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            if (kVar instanceof C14951m0) {
                return C11170a.m74965n((C14900e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: l */
        public static C11127b m92497l(C14839b bVar, C11129d dVar) {
            C13706o.m87929f(dVar, "$receiver");
            if (dVar instanceof C14852i) {
                return ((C14852i) dVar).mo74073W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C13687e0.m87868b(dVar.getClass())).toString());
        }

        /* renamed from: l0 */
        public static boolean m92498l0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return (iVar instanceof C14967q1) && (((C14967q1) iVar).mo73702N0() instanceof C14862n);
        }

        /* renamed from: m */
        public static C11134i m92499m(C14839b bVar, C11136k kVar, C11136k kVar2) {
            C13706o.m87929f(kVar, "lowerBound");
            C13706o.m87929f(kVar2, "upperBound");
            if (!(kVar instanceof C14951m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C13687e0.m87868b(bVar.getClass())).toString());
            } else if (kVar2 instanceof C14951m0) {
                return C14906f0.m92816d((C14951m0) kVar, (C14951m0) kVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C13687e0.m87868b(bVar.getClass())).toString());
            }
        }

        /* renamed from: m0 */
        public static boolean m92500m0(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                return c != null && C13853h.m88243A0(c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: n */
        public static List<C11136k> m92501n(C14839b bVar, C11136k kVar, C11139n nVar) {
            C13706o.m87929f(kVar, "$receiver");
            C13706o.m87929f(nVar, "constructor");
            return C11145r.C11146a.m74884a(bVar, kVar, nVar);
        }

        /* renamed from: n0 */
        public static C11136k m92502n0(C14839b bVar, C11132g gVar) {
            C13706o.m87929f(gVar, "$receiver");
            if (gVar instanceof C14990y) {
                return ((C14990y) gVar).mo74251V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C13687e0.m87868b(gVar.getClass())).toString());
        }

        /* renamed from: o */
        public static C11138m m92503o(C14839b bVar, C11137l lVar, int i) {
            C13706o.m87929f(lVar, "$receiver");
            return C11145r.C11146a.m74885b(bVar, lVar, i);
        }

        /* renamed from: o0 */
        public static C11136k m92504o0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C11145r.C11146a.m74895l(bVar, iVar);
        }

        /* renamed from: p */
        public static C11138m m92505p(C14839b bVar, C11134i iVar, int i) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return ((C14900e0) iVar).mo73700L0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: p0 */
        public static C11134i m92506p0(C14839b bVar, C11129d dVar) {
            C13706o.m87929f(dVar, "$receiver");
            if (dVar instanceof C14852i) {
                return ((C14852i) dVar).mo74075Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C13687e0.m87868b(dVar.getClass())).toString());
        }

        /* renamed from: q */
        public static C11138m m92507q(C14839b bVar, C11136k kVar, int i) {
            C13706o.m87929f(kVar, "$receiver");
            return C11145r.C11146a.m74886c(bVar, kVar, i);
        }

        /* renamed from: q0 */
        public static C11134i m92508q0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14967q1) {
                return C14842c.m92529b((C14967q1) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: r */
        public static List<C11138m> m92509r(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            if (iVar instanceof C14900e0) {
                return ((C14900e0) iVar).mo73700L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C13687e0.m87868b(iVar.getClass())).toString());
        }

        /* renamed from: r0 */
        public static C11134i m92510r0(C14839b bVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return C14952m1.C14953a.m92971a(bVar, iVar);
        }

        /* renamed from: s */
        public static C16153d m92511s(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C16519a.m98616i((C13948e) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: s0 */
        public static C14889d1 m92512s0(C14839b bVar, boolean z, boolean z2) {
            return C14838a.m92433b(z, z2, bVar, (C14846f) null, (C14849g) null, 24, (Object) null);
        }

        /* renamed from: t */
        public static C11140o m92513t(C14839b bVar, C11139n nVar, int i) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13950e1 e1Var = ((C14901e1) nVar).getParameters().get(i);
                C13706o.m87928e(e1Var, "this.parameters[index]");
                return e1Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: t0 */
        public static C11136k m92514t0(C14839b bVar, C11130e eVar) {
            C13706o.m87929f(eVar, "$receiver");
            if (eVar instanceof C14961p) {
                return ((C14961p) eVar).mo74226Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + C13687e0.m87868b(eVar.getClass())).toString());
        }

        /* renamed from: u */
        public static List<C11140o> m92515u(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                List<C13950e1> parameters = ((C14901e1) nVar).getParameters();
                C13706o.m87928e(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: u0 */
        public static int m92516u0(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                return ((C14901e1) nVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: v */
        public static C13859i m92517v(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C13853h.m88247P((C13948e) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: v0 */
        public static Collection<C11134i> m92518v0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            C11139n b = bVar.mo62292b(kVar);
            if (b instanceof C14628n) {
                return ((C14628n) b).mo73741i();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: w */
        public static C13859i m92519w(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                C13961h c = ((C14901e1) nVar).mo62183c();
                C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C13853h.m88249S((C13948e) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }

        /* renamed from: w0 */
        public static C11138m m92520w0(C14839b bVar, C11128c cVar) {
            C13706o.m87929f(cVar, "$receiver");
            if (cVar instanceof C14853j) {
                return ((C14853j) cVar).mo73707U0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + C13687e0.m87868b(cVar.getClass())).toString());
        }

        /* renamed from: x */
        public static C11134i m92521x(C14839b bVar, C11140o oVar) {
            C13706o.m87929f(oVar, "$receiver");
            if (oVar instanceof C13950e1) {
                return C11170a.m74960i((C13950e1) oVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C13687e0.m87868b(oVar.getClass())).toString());
        }

        /* renamed from: x0 */
        public static int m92522x0(C14839b bVar, C11137l lVar) {
            C13706o.m87929f(lVar, "$receiver");
            return C11145r.C11146a.m74896m(bVar, lVar);
        }

        /* renamed from: y */
        public static C11134i m92523y(C14839b bVar, C11138m mVar) {
            C13706o.m87929f(mVar, "$receiver");
            if (mVar instanceof C14926g1) {
                return ((C14926g1) mVar).getType().mo74145Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C13687e0.m87868b(mVar.getClass())).toString());
        }

        /* renamed from: y0 */
        public static C14889d1.C14893c m92524y0(C14839b bVar, C11136k kVar) {
            C13706o.m87929f(kVar, "type");
            if (kVar instanceof C14951m0) {
                return new C14841a(bVar, C14911f1.f64041c.mo74160a((C14900e0) kVar).mo74203c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C13687e0.m87868b(kVar.getClass())).toString());
        }

        /* renamed from: z */
        public static C11140o m92525z(C14839b bVar, C11148t tVar) {
            C13706o.m87929f(tVar, "$receiver");
            if (tVar instanceof C14862n) {
                return ((C14862n) tVar).mo74095b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + tVar + ", " + C13687e0.m87868b(tVar.getClass())).toString());
        }

        /* renamed from: z0 */
        public static Collection<C11134i> m92526z0(C14839b bVar, C11139n nVar) {
            C13706o.m87929f(nVar, "$receiver");
            if (nVar instanceof C14901e1) {
                Collection<C14900e0> l = ((C14901e1) nVar).mo72370l();
                C13706o.m87928e(l, "this.supertypes");
                return l;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C13687e0.m87868b(nVar.getClass())).toString());
        }
    }

    /* renamed from: a */
    C11136k mo62291a(C11136k kVar, boolean z);

    /* renamed from: b */
    C11139n mo62292b(C11136k kVar);

    /* renamed from: c */
    C11136k mo62294c(C11132g gVar);

    /* renamed from: d */
    C11129d mo62296d(C11136k kVar);

    /* renamed from: e */
    C11136k mo62298e(C11134i iVar);

    /* renamed from: f */
    boolean mo62300f(C11136k kVar);

    /* renamed from: g */
    C11136k mo62302g(C11132g gVar);

    /* renamed from: n0 */
    C11134i mo73787n0(C11136k kVar, C11136k kVar2);
}
