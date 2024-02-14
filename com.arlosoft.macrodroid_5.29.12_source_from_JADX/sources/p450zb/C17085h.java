package p450zb;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: zb.h */
/* compiled from: ErrorType.kt */
public final class C17085h extends C14951m0 {

    /* renamed from: c */
    private final C14901e1 f68549c;

    /* renamed from: d */
    private final C14692h f68550d;

    /* renamed from: f */
    private final C17087j f68551f;

    /* renamed from: g */
    private final List<C14926g1> f68552g;

    /* renamed from: o */
    private final boolean f68553o;

    /* renamed from: p */
    private final String[] f68554p;

    /* renamed from: s */
    private final String f68555s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17085h(C14901e1 e1Var, C14692h hVar, C17087j jVar, List list, boolean z, String[] strArr, int i, C13695i iVar) {
        this(e1Var, hVar, jVar, (i & 8) != 0 ? C13614t.m87748j() : list, (i & 16) != 0 ? false : z, strArr);
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return this.f68552g;
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return C14830a1.f63959c.mo74051h();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return this.f68549c;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return this.f68553o;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        C14901e1 N0 = mo73702N0();
        C14692h n = mo72955n();
        C17087j jVar = this.f68551f;
        List<C14926g1> L0 = mo73700L0();
        String[] strArr = this.f68554p;
        return new C17085h(N0, n, jVar, L0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final String mo80353W0() {
        return this.f68555s;
    }

    /* renamed from: X0 */
    public final C17087j mo80354X0() {
        return this.f68551f;
    }

    /* renamed from: Y0 */
    public C17085h mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return this.f68550d;
    }

    public C17085h(C14901e1 e1Var, C14692h hVar, C17087j jVar, List<? extends C14926g1> list, boolean z, String... strArr) {
        C13706o.m87929f(e1Var, "constructor");
        C13706o.m87929f(hVar, "memberScope");
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(strArr, "formatParams");
        this.f68549c = e1Var;
        this.f68550d = hVar;
        this.f68551f = jVar;
        this.f68552g = list;
        this.f68553o = z;
        this.f68554p = strArr;
        C13696i0 i0Var = C13696i0.f61931a;
        String d = jVar.mo80359d();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(d, Arrays.copyOf(copyOf, copyOf.length));
        C13706o.m87928e(format, "format(format, *args)");
        this.f68555s = format;
    }
}
