package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14838a;
import kotlin.reflect.jvm.internal.impl.types.checker.C14839b;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import kotlin.reflect.jvm.internal.impl.types.checker.C14846f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
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
import p218bc.C11148t;
import p218bc.C11149u;
import p362pb.C16152c;
import p362pb.C16153d;
import p370qa.C16269p;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.k */
/* compiled from: OverridingUtilTypeSystemContext.kt */
public final class C14669k implements C14839b {

    /* renamed from: a */
    private final Map<C14901e1, C14901e1> f63674a;

    /* renamed from: b */
    private final C14844e.C14845a f63675b;

    /* renamed from: c */
    private final C14849g f63676c;

    /* renamed from: d */
    private final C14846f f63677d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16269p<C14900e0, C14900e0, Boolean> f63678e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.k$a */
    /* compiled from: OverridingUtilTypeSystemContext.kt */
    public static final class C14670a extends C14889d1 {

        /* renamed from: k */
        final /* synthetic */ C14669k f63679k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14670a(boolean z, boolean z2, C14669k kVar, C14846f fVar, C14849g gVar) {
            super(z, z2, true, kVar, fVar, gVar);
            this.f63679k = kVar;
        }

        /* renamed from: f */
        public boolean mo73790f(C11134i iVar, C11134i iVar2) {
            C13706o.m87929f(iVar, "subType");
            C13706o.m87929f(iVar2, "superType");
            if (!(iVar instanceof C14900e0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (iVar2 instanceof C14900e0) {
                return ((Boolean) this.f63679k.f63678e.invoke(iVar, iVar2)).booleanValue();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public C14669k(Map<C14901e1, ? extends C14901e1> map, C14844e.C14845a aVar, C14849g gVar, C14846f fVar, C16269p<? super C14900e0, ? super C14900e0, Boolean> pVar) {
        C13706o.m87929f(aVar, "equalityAxioms");
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C13706o.m87929f(fVar, "kotlinTypePreparator");
        this.f63674a = map;
        this.f63675b = aVar;
        this.f63676c = gVar;
        this.f63677d = fVar;
        this.f63678e = pVar;
    }

    /* renamed from: G0 */
    private final boolean m91709G0(C14901e1 e1Var, C14901e1 e1Var2) {
        if (this.f63675b.mo73697a(e1Var, e1Var2)) {
            return true;
        }
        Map<C14901e1, C14901e1> map = this.f63674a;
        if (map == null) {
            return false;
        }
        C14901e1 e1Var3 = map.get(e1Var);
        C14901e1 e1Var4 = this.f63674a.get(e1Var2);
        if (e1Var3 != null && C13706o.m87924a(e1Var3, e1Var2)) {
            return true;
        }
        if (e1Var4 == null || !C13706o.m87924a(e1Var4, e1Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public C11138m mo62265A(C11134i iVar, int i) {
        return C14839b.C14840a.m92505p(this, iVar, i);
    }

    /* renamed from: A0 */
    public boolean mo62266A0(C11134i iVar) {
        return C14839b.C14840a.m92474Z(this, iVar);
    }

    /* renamed from: B */
    public C11128c mo62267B(C11129d dVar) {
        return C14839b.C14840a.m92443A0(this, dVar);
    }

    /* renamed from: B0 */
    public C11137l mo62268B0(C11136k kVar) {
        return C14839b.C14840a.m92479c(this, kVar);
    }

    /* renamed from: C */
    public boolean mo62269C(C11139n nVar) {
        return C14839b.C14840a.m92470V(this, nVar);
    }

    /* renamed from: C0 */
    public C11138m mo62270C0(C11128c cVar) {
        return C14839b.C14840a.m92520w0(this, cVar);
    }

    /* renamed from: D */
    public C11134i mo62271D(C11129d dVar) {
        return C14839b.C14840a.m92506p0(this, dVar);
    }

    /* renamed from: D0 */
    public C11135j mo62272D0(C11132g gVar) {
        return C14839b.C14840a.m92489h(this, gVar);
    }

    /* renamed from: E */
    public Collection<C11134i> mo62273E(C11139n nVar) {
        return C14839b.C14840a.m92526z0(this, nVar);
    }

    /* renamed from: E0 */
    public List<C11136k> mo62274E0(C11136k kVar, C11139n nVar) {
        return C14839b.C14840a.m92501n(this, kVar, nVar);
    }

    /* renamed from: F */
    public C11136k mo62275F(C11130e eVar) {
        return C14839b.C14840a.m92514t0(this, eVar);
    }

    /* renamed from: G */
    public C11140o mo62276G(C11139n nVar, int i) {
        return C14839b.C14840a.m92513t(this, nVar, i);
    }

    /* renamed from: H */
    public boolean mo62277H(C11139n nVar) {
        return C14839b.C14840a.m92459K(this, nVar);
    }

    /* renamed from: H0 */
    public C14889d1 mo73779H0(boolean z, boolean z2) {
        if (this.f63678e == null) {
            return C14838a.m92432a(z, z2, this, this.f63677d, this.f63676c);
        }
        return new C14670a(z, z2, this, this.f63677d, this.f63676c);
    }

    /* renamed from: I */
    public boolean mo62278I(C11139n nVar) {
        return C14839b.C14840a.m92465Q(this, nVar);
    }

    /* renamed from: J */
    public boolean mo62279J(C11129d dVar) {
        return C14839b.C14840a.m92482d0(this, dVar);
    }

    /* renamed from: K */
    public boolean mo62280K(C11134i iVar) {
        return C14839b.C14840a.m92464P(this, iVar);
    }

    /* renamed from: L */
    public C11132g mo62281L(C11134i iVar) {
        return C14839b.C14840a.m92487g(this, iVar);
    }

    /* renamed from: M */
    public C11134i mo73780M(C11134i iVar) {
        return C14839b.C14840a.m92444B(this, iVar);
    }

    /* renamed from: N */
    public C11130e mo62282N(C11136k kVar) {
        return C14839b.C14840a.m92483e(this, kVar);
    }

    /* renamed from: O */
    public List<C11134i> mo62283O(C11140o oVar) {
        return C14839b.C14840a.m92446C(this, oVar);
    }

    /* renamed from: P */
    public boolean mo73781P(C11134i iVar, C16152c cVar) {
        return C14839b.C14840a.m92452F(this, iVar, cVar);
    }

    /* renamed from: Q */
    public boolean mo73782Q(C11139n nVar) {
        return C14839b.C14840a.m92468T(this, nVar);
    }

    /* renamed from: R */
    public C11134i mo73783R(C11140o oVar) {
        return C14839b.C14840a.m92521x(this, oVar);
    }

    /* renamed from: S */
    public C11127b mo62284S(C11129d dVar) {
        return C14839b.C14840a.m92497l(this, dVar);
    }

    /* renamed from: T */
    public C11139n mo62285T(C11134i iVar) {
        return C14839b.C14840a.m92445B0(this, iVar);
    }

    /* renamed from: U */
    public boolean mo62286U(C11140o oVar, C11139n nVar) {
        return C14839b.C14840a.m92456H(this, oVar, nVar);
    }

    /* renamed from: V */
    public boolean mo62287V(C11134i iVar) {
        return C14839b.C14840a.m92498l0(this, iVar);
    }

    /* renamed from: W */
    public boolean mo62288W(C11129d dVar) {
        return C14839b.C14840a.m92486f0(this, dVar);
    }

    /* renamed from: X */
    public boolean mo62289X(C11139n nVar, C11139n nVar2) {
        C13706o.m87929f(nVar, "c1");
        C13706o.m87929f(nVar2, "c2");
        if (!(nVar instanceof C14901e1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (nVar2 instanceof C14901e1) {
            return C14839b.C14840a.m92475a(this, nVar, nVar2) || m91709G0((C14901e1) nVar, (C14901e1) nVar2);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: Y */
    public C11134i mo62290Y(C11134i iVar) {
        return C14839b.C14840a.m92508q0(this, iVar);
    }

    /* renamed from: Z */
    public C11134i mo73784Z(C11134i iVar) {
        return C14839b.C14840a.m92510r0(this, iVar);
    }

    /* renamed from: a */
    public C11136k mo62291a(C11136k kVar, boolean z) {
        return C14839b.C14840a.m92455G0(this, kVar, z);
    }

    /* renamed from: a0 */
    public C13859i mo73785a0(C11139n nVar) {
        return C14839b.C14840a.m92517v(this, nVar);
    }

    /* renamed from: b */
    public C11139n mo62292b(C11136k kVar) {
        return C14839b.C14840a.m92447C0(this, kVar);
    }

    /* renamed from: b0 */
    public boolean mo62293b0(C11136k kVar) {
        return C14839b.C14840a.m92469U(this, kVar);
    }

    /* renamed from: c */
    public C11136k mo62294c(C11132g gVar) {
        return C14839b.C14840a.m92502n0(this, gVar);
    }

    /* renamed from: c0 */
    public Collection<C11134i> mo62295c0(C11136k kVar) {
        return C14839b.C14840a.m92518v0(this, kVar);
    }

    /* renamed from: d */
    public C11129d mo62296d(C11136k kVar) {
        return C14839b.C14840a.m92481d(this, kVar);
    }

    /* renamed from: d0 */
    public boolean mo62297d0(C11136k kVar) {
        return C14839b.C14840a.m92496k0(this, kVar);
    }

    /* renamed from: e */
    public C11136k mo62298e(C11134i iVar) {
        return C14839b.C14840a.m92491i(this, iVar);
    }

    /* renamed from: e0 */
    public boolean mo62299e0(C11134i iVar) {
        return C14839b.C14840a.m92460L(this, iVar);
    }

    /* renamed from: f */
    public boolean mo62300f(C11136k kVar) {
        return C14839b.C14840a.m92488g0(this, kVar);
    }

    /* renamed from: f0 */
    public C11136k mo62301f0(C11134i iVar) {
        return C14839b.C14840a.m92451E0(this, iVar);
    }

    /* renamed from: g */
    public C11136k mo62302g(C11132g gVar) {
        return C14839b.C14840a.m92449D0(this, gVar);
    }

    /* renamed from: g0 */
    public boolean mo62303g0(C11136k kVar) {
        return C14839b.C14840a.m92494j0(this, kVar);
    }

    /* renamed from: h */
    public C11149u mo62304h(C11140o oVar) {
        return C14839b.C14840a.m92450E(this, oVar);
    }

    /* renamed from: h0 */
    public boolean mo62305h0(C11134i iVar) {
        return C14839b.C14840a.m92476a0(this, iVar);
    }

    /* renamed from: i */
    public List<C11138m> mo62306i(C11134i iVar) {
        return C14839b.C14840a.m92509r(this, iVar);
    }

    /* renamed from: i0 */
    public int mo62307i0(C11139n nVar) {
        return C14839b.C14840a.m92516u0(this, nVar);
    }

    /* renamed from: j */
    public int mo62308j(C11137l lVar) {
        return C14839b.C14840a.m92522x0(this, lVar);
    }

    /* renamed from: j0 */
    public C11134i mo62309j0(List<? extends C11134i> list) {
        return C14839b.C14840a.m92458J(this, list);
    }

    /* renamed from: k */
    public boolean mo62310k(C11134i iVar) {
        return C14839b.C14840a.m92467S(this, iVar);
    }

    /* renamed from: k0 */
    public C11138m mo62311k0(C11136k kVar, int i) {
        return C14839b.C14840a.m92507q(this, kVar, i);
    }

    /* renamed from: l */
    public C11134i mo62312l(C11134i iVar, boolean z) {
        return C14839b.C14840a.m92453F0(this, iVar, z);
    }

    /* renamed from: l0 */
    public C11149u mo62313l0(C11138m mVar) {
        return C14839b.C14840a.m92448D(this, mVar);
    }

    /* renamed from: m */
    public C13859i mo73786m(C11139n nVar) {
        return C14839b.C14840a.m92519w(this, nVar);
    }

    /* renamed from: m0 */
    public C11136k mo62314m0(C11134i iVar) {
        return C14839b.C14840a.m92504o0(this, iVar);
    }

    /* renamed from: n */
    public C11138m mo62315n(C11137l lVar, int i) {
        return C14839b.C14840a.m92503o(this, lVar, i);
    }

    /* renamed from: n0 */
    public C11134i mo73787n0(C11136k kVar, C11136k kVar2) {
        return C14839b.C14840a.m92499m(this, kVar, kVar2);
    }

    /* renamed from: o */
    public boolean mo62316o(C11136k kVar) {
        return C14839b.C14840a.m92484e0(this, kVar);
    }

    /* renamed from: o0 */
    public boolean mo62317o0(C11139n nVar) {
        return C14839b.C14840a.m92471W(this, nVar);
    }

    /* renamed from: p */
    public boolean mo62318p(C11134i iVar) {
        return C14839b.C14840a.m92472X(this, iVar);
    }

    /* renamed from: p0 */
    public boolean mo62319p0(C11139n nVar) {
        return C14839b.C14840a.m92478b0(this, nVar);
    }

    /* renamed from: q */
    public boolean mo62337q(C11136k kVar, C11136k kVar2) {
        return C14839b.C14840a.m92457I(this, kVar, kVar2);
    }

    /* renamed from: q0 */
    public boolean mo62320q0(C11136k kVar) {
        return C14839b.C14840a.m92461M(this, kVar);
    }

    /* renamed from: r */
    public C11131f mo62321r(C11132g gVar) {
        return C14839b.C14840a.m92485f(this, gVar);
    }

    /* renamed from: r0 */
    public int mo62322r0(C11134i iVar) {
        return C14839b.C14840a.m92477b(this, iVar);
    }

    /* renamed from: s */
    public C11136k mo62323s(C11136k kVar, C11127b bVar) {
        return C14839b.C14840a.m92495k(this, kVar, bVar);
    }

    /* renamed from: s0 */
    public C16153d mo73788s0(C11139n nVar) {
        return C14839b.C14840a.m92511s(this, nVar);
    }

    /* renamed from: t */
    public C14889d1.C14893c mo62324t(C11136k kVar) {
        return C14839b.C14840a.m92524y0(this, kVar);
    }

    /* renamed from: t0 */
    public boolean mo62325t0(C11134i iVar) {
        return C14839b.C14840a.m92454G(this, iVar);
    }

    /* renamed from: u */
    public C11134i mo62326u(C11138m mVar) {
        return C14839b.C14840a.m92523y(this, mVar);
    }

    /* renamed from: u0 */
    public boolean mo62327u0(C11134i iVar) {
        return C14839b.C14840a.m92480c0(this, iVar);
    }

    /* renamed from: v */
    public boolean mo62328v(C11139n nVar) {
        return C14839b.C14840a.m92463O(this, nVar);
    }

    /* renamed from: v0 */
    public boolean mo73789v0(C11139n nVar) {
        return C14839b.C14840a.m92500m0(this, nVar);
    }

    /* renamed from: w */
    public boolean mo62329w(C11134i iVar) {
        return C14839b.C14840a.m92466R(this, iVar);
    }

    /* renamed from: w0 */
    public boolean mo62330w0(C11139n nVar) {
        return C14839b.C14840a.m92462N(this, nVar);
    }

    /* renamed from: x */
    public C11140o mo62331x(C11148t tVar) {
        return C14839b.C14840a.m92525z(this, tVar);
    }

    /* renamed from: x0 */
    public boolean mo62332x0(C11136k kVar) {
        return C14839b.C14840a.m92473Y(this, kVar);
    }

    /* renamed from: y */
    public C11138m mo62333y(C11134i iVar) {
        return C14839b.C14840a.m92493j(this, iVar);
    }

    /* renamed from: y0 */
    public C11140o mo62334y0(C11139n nVar) {
        return C14839b.C14840a.m92442A(this, nVar);
    }

    /* renamed from: z */
    public List<C11140o> mo62335z(C11139n nVar) {
        return C14839b.C14840a.m92515u(this, nVar);
    }

    /* renamed from: z0 */
    public boolean mo62336z0(C11138m mVar) {
        return C14839b.C14840a.m92492i0(this, mVar);
    }
}
