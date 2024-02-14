package p218bc;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;

/* renamed from: bc.p */
/* compiled from: TypeSystemContext.kt */
public interface C11141p extends C11147s {

    /* renamed from: bc.p$a */
    /* compiled from: TypeSystemContext.kt */
    public static final class C11142a {
        /* renamed from: a */
        public static List<C11136k> m74868a(C11141p pVar, C11136k kVar, C11139n nVar) {
            C13706o.m87929f(kVar, "$receiver");
            C13706o.m87929f(nVar, "constructor");
            return null;
        }

        /* renamed from: b */
        public static C11138m m74869b(C11141p pVar, C11137l lVar, int i) {
            C13706o.m87929f(lVar, "$receiver");
            if (lVar instanceof C11136k) {
                return pVar.mo62265A((C11134i) lVar, i);
            }
            if (lVar instanceof C11126a) {
                Object obj = ((C11126a) lVar).get(i);
                C13706o.m87928e(obj, "get(index)");
                return (C11138m) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C13687e0.m87868b(lVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C11138m m74870c(C11141p pVar, C11136k kVar, int i) {
            C13706o.m87929f(kVar, "$receiver");
            boolean z = false;
            if (i >= 0 && i < pVar.mo62322r0(kVar)) {
                z = true;
            }
            if (z) {
                return pVar.mo62265A(kVar, i);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m74871d(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return pVar.mo62332x0(pVar.mo62314m0(iVar)) != pVar.mo62332x0(pVar.mo62301f0(iVar));
        }

        /* renamed from: e */
        public static boolean m74872e(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            C11136k e = pVar.mo62298e(iVar);
            return (e != null ? pVar.mo62296d(e) : null) != null;
        }

        /* renamed from: f */
        public static boolean m74873f(C11141p pVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            return pVar.mo62330w0(pVar.mo62292b(kVar));
        }

        /* renamed from: g */
        public static boolean m74874g(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            C11136k e = pVar.mo62298e(iVar);
            return (e != null ? pVar.mo62282N(e) : null) != null;
        }

        /* renamed from: h */
        public static boolean m74875h(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            C11132g L = pVar.mo62281L(iVar);
            return (L != null ? pVar.mo62321r(L) : null) != null;
        }

        /* renamed from: i */
        public static boolean m74876i(C11141p pVar, C11136k kVar) {
            C13706o.m87929f(kVar, "$receiver");
            return pVar.mo62269C(pVar.mo62292b(kVar));
        }

        /* renamed from: j */
        public static boolean m74877j(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return (iVar instanceof C11136k) && pVar.mo62332x0((C11136k) iVar);
        }

        /* renamed from: k */
        public static boolean m74878k(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            return pVar.mo62319p0(pVar.mo62285T(iVar)) && !pVar.mo62327u0(iVar);
        }

        /* renamed from: l */
        public static C11136k m74879l(C11141p pVar, C11134i iVar) {
            C11136k c;
            C13706o.m87929f(iVar, "$receiver");
            C11132g L = pVar.mo62281L(iVar);
            if (L != null && (c = pVar.mo62294c(L)) != null) {
                return c;
            }
            C11136k e = pVar.mo62298e(iVar);
            C13706o.m87926c(e);
            return e;
        }

        /* renamed from: m */
        public static int m74880m(C11141p pVar, C11137l lVar) {
            C13706o.m87929f(lVar, "$receiver");
            if (lVar instanceof C11136k) {
                return pVar.mo62322r0((C11134i) lVar);
            }
            if (lVar instanceof C11126a) {
                return ((C11126a) lVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C13687e0.m87868b(lVar.getClass())).toString());
        }

        /* renamed from: n */
        public static C11139n m74881n(C11141p pVar, C11134i iVar) {
            C13706o.m87929f(iVar, "$receiver");
            C11136k e = pVar.mo62298e(iVar);
            if (e == null) {
                e = pVar.mo62314m0(iVar);
            }
            return pVar.mo62292b(e);
        }

        /* renamed from: o */
        public static C11136k m74882o(C11141p pVar, C11134i iVar) {
            C11136k g;
            C13706o.m87929f(iVar, "$receiver");
            C11132g L = pVar.mo62281L(iVar);
            if (L != null && (g = pVar.mo62302g(L)) != null) {
                return g;
            }
            C11136k e = pVar.mo62298e(iVar);
            C13706o.m87926c(e);
            return e;
        }
    }

    /* renamed from: A */
    C11138m mo62265A(C11134i iVar, int i);

    /* renamed from: A0 */
    boolean mo62266A0(C11134i iVar);

    /* renamed from: B */
    C11128c mo62267B(C11129d dVar);

    /* renamed from: B0 */
    C11137l mo62268B0(C11136k kVar);

    /* renamed from: C */
    boolean mo62269C(C11139n nVar);

    /* renamed from: C0 */
    C11138m mo62270C0(C11128c cVar);

    /* renamed from: D */
    C11134i mo62271D(C11129d dVar);

    /* renamed from: D0 */
    C11135j mo62272D0(C11132g gVar);

    /* renamed from: E */
    Collection<C11134i> mo62273E(C11139n nVar);

    /* renamed from: E0 */
    List<C11136k> mo62274E0(C11136k kVar, C11139n nVar);

    /* renamed from: F */
    C11136k mo62275F(C11130e eVar);

    /* renamed from: G */
    C11140o mo62276G(C11139n nVar, int i);

    /* renamed from: H */
    boolean mo62277H(C11139n nVar);

    /* renamed from: I */
    boolean mo62278I(C11139n nVar);

    /* renamed from: J */
    boolean mo62279J(C11129d dVar);

    /* renamed from: K */
    boolean mo62280K(C11134i iVar);

    /* renamed from: L */
    C11132g mo62281L(C11134i iVar);

    /* renamed from: N */
    C11130e mo62282N(C11136k kVar);

    /* renamed from: O */
    List<C11134i> mo62283O(C11140o oVar);

    /* renamed from: S */
    C11127b mo62284S(C11129d dVar);

    /* renamed from: T */
    C11139n mo62285T(C11134i iVar);

    /* renamed from: U */
    boolean mo62286U(C11140o oVar, C11139n nVar);

    /* renamed from: V */
    boolean mo62287V(C11134i iVar);

    /* renamed from: W */
    boolean mo62288W(C11129d dVar);

    /* renamed from: X */
    boolean mo62289X(C11139n nVar, C11139n nVar2);

    /* renamed from: Y */
    C11134i mo62290Y(C11134i iVar);

    /* renamed from: a */
    C11136k mo62291a(C11136k kVar, boolean z);

    /* renamed from: b */
    C11139n mo62292b(C11136k kVar);

    /* renamed from: b0 */
    boolean mo62293b0(C11136k kVar);

    /* renamed from: c */
    C11136k mo62294c(C11132g gVar);

    /* renamed from: c0 */
    Collection<C11134i> mo62295c0(C11136k kVar);

    /* renamed from: d */
    C11129d mo62296d(C11136k kVar);

    /* renamed from: d0 */
    boolean mo62297d0(C11136k kVar);

    /* renamed from: e */
    C11136k mo62298e(C11134i iVar);

    /* renamed from: e0 */
    boolean mo62299e0(C11134i iVar);

    /* renamed from: f */
    boolean mo62300f(C11136k kVar);

    /* renamed from: f0 */
    C11136k mo62301f0(C11134i iVar);

    /* renamed from: g */
    C11136k mo62302g(C11132g gVar);

    /* renamed from: g0 */
    boolean mo62303g0(C11136k kVar);

    /* renamed from: h */
    C11149u mo62304h(C11140o oVar);

    /* renamed from: h0 */
    boolean mo62305h0(C11134i iVar);

    /* renamed from: i */
    List<C11138m> mo62306i(C11134i iVar);

    /* renamed from: i0 */
    int mo62307i0(C11139n nVar);

    /* renamed from: j */
    int mo62308j(C11137l lVar);

    /* renamed from: j0 */
    C11134i mo62309j0(List<? extends C11134i> list);

    /* renamed from: k */
    boolean mo62310k(C11134i iVar);

    /* renamed from: k0 */
    C11138m mo62311k0(C11136k kVar, int i);

    /* renamed from: l */
    C11134i mo62312l(C11134i iVar, boolean z);

    /* renamed from: l0 */
    C11149u mo62313l0(C11138m mVar);

    /* renamed from: m0 */
    C11136k mo62314m0(C11134i iVar);

    /* renamed from: n */
    C11138m mo62315n(C11137l lVar, int i);

    /* renamed from: o */
    boolean mo62316o(C11136k kVar);

    /* renamed from: o0 */
    boolean mo62317o0(C11139n nVar);

    /* renamed from: p */
    boolean mo62318p(C11134i iVar);

    /* renamed from: p0 */
    boolean mo62319p0(C11139n nVar);

    /* renamed from: q0 */
    boolean mo62320q0(C11136k kVar);

    /* renamed from: r */
    C11131f mo62321r(C11132g gVar);

    /* renamed from: r0 */
    int mo62322r0(C11134i iVar);

    /* renamed from: s */
    C11136k mo62323s(C11136k kVar, C11127b bVar);

    /* renamed from: t */
    C14889d1.C14893c mo62324t(C11136k kVar);

    /* renamed from: t0 */
    boolean mo62325t0(C11134i iVar);

    /* renamed from: u */
    C11134i mo62326u(C11138m mVar);

    /* renamed from: u0 */
    boolean mo62327u0(C11134i iVar);

    /* renamed from: v */
    boolean mo62328v(C11139n nVar);

    /* renamed from: w */
    boolean mo62329w(C11134i iVar);

    /* renamed from: w0 */
    boolean mo62330w0(C11139n nVar);

    /* renamed from: x */
    C11140o mo62331x(C11148t tVar);

    /* renamed from: x0 */
    boolean mo62332x0(C11136k kVar);

    /* renamed from: y */
    C11138m mo62333y(C11134i iVar);

    /* renamed from: y0 */
    C11140o mo62334y0(C11139n nVar);

    /* renamed from: z */
    List<C11140o> mo62335z(C11139n nVar);

    /* renamed from: z0 */
    boolean mo62336z0(C11138m mVar);
}
