package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13710s;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.renderer.C14548b;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16152c;
import p370qa.C16265l;
import p397ta.C16602a;
import p397ta.C16603b;
import p397ta.C16605d;
import p433xa.C16875d;
import p433xa.C16887m;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.g */
/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class C14582g implements C14580f {

    /* renamed from: X */
    static final /* synthetic */ C16887m<Object>[] f63527X;

    /* renamed from: A */
    private final C16605d f63528A;

    /* renamed from: B */
    private final C16605d f63529B;

    /* renamed from: C */
    private final C16605d f63530C;

    /* renamed from: D */
    private final C16605d f63531D;

    /* renamed from: E */
    private final C16605d f63532E;

    /* renamed from: F */
    private final C16605d f63533F;

    /* renamed from: G */
    private final C16605d f63534G;

    /* renamed from: H */
    private final C16605d f63535H;

    /* renamed from: I */
    private final C16605d f63536I;

    /* renamed from: J */
    private final C16605d f63537J;

    /* renamed from: K */
    private final C16605d f63538K;

    /* renamed from: L */
    private final C16605d f63539L;

    /* renamed from: M */
    private final C16605d f63540M;

    /* renamed from: N */
    private final C16605d f63541N;

    /* renamed from: O */
    private final C16605d f63542O;

    /* renamed from: P */
    private final C16605d f63543P;

    /* renamed from: Q */
    private final C16605d f63544Q;

    /* renamed from: R */
    private final C16605d f63545R;

    /* renamed from: S */
    private final C16605d f63546S;

    /* renamed from: T */
    private final C16605d f63547T;

    /* renamed from: U */
    private final C16605d f63548U;

    /* renamed from: V */
    private final C16605d f63549V;

    /* renamed from: W */
    private final C16605d f63550W;

    /* renamed from: a */
    private boolean f63551a;

    /* renamed from: b */
    private final C16605d f63552b = m91373m0(C14548b.C14551c.f63476a);

    /* renamed from: c */
    private final C16605d f63553c;

    /* renamed from: d */
    private final C16605d f63554d;

    /* renamed from: e */
    private final C16605d f63555e;

    /* renamed from: f */
    private final C16605d f63556f;

    /* renamed from: g */
    private final C16605d f63557g;

    /* renamed from: h */
    private final C16605d f63558h;

    /* renamed from: i */
    private final C16605d f63559i;

    /* renamed from: j */
    private final C16605d f63560j;

    /* renamed from: k */
    private final C16605d f63561k;

    /* renamed from: l */
    private final C16605d f63562l;

    /* renamed from: m */
    private final C16605d f63563m;

    /* renamed from: n */
    private final C16605d f63564n;

    /* renamed from: o */
    private final C16605d f63565o;

    /* renamed from: p */
    private final C16605d f63566p;

    /* renamed from: q */
    private final C16605d f63567q;

    /* renamed from: r */
    private final C16605d f63568r;

    /* renamed from: s */
    private final C16605d f63569s;

    /* renamed from: t */
    private final C16605d f63570t;

    /* renamed from: u */
    private final C16605d f63571u;

    /* renamed from: v */
    private final C16605d f63572v;

    /* renamed from: w */
    private final C16605d f63573w;

    /* renamed from: x */
    private final C16605d f63574x;

    /* renamed from: y */
    private final C16605d f63575y;

    /* renamed from: z */
    private final C16605d f63576z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.g$a */
    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class C14583a extends C13708q implements C16265l<C13966i1, String> {

        /* renamed from: a */
        public static final C14583a f63577a = new C14583a();

        C14583a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C13966i1 i1Var) {
            C13706o.m87929f(i1Var, "it");
            return "...";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.g$b */
    /* compiled from: Delegates.kt */
    public static final class C14584b extends C16603b<T> {

        /* renamed from: b */
        final /* synthetic */ C14582g f63578b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14584b(Object obj, C14582g gVar) {
            super(obj);
            this.f63578b = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo73686d(C16887m<?> mVar, T t, T t2) {
            C13706o.m87929f(mVar, "property");
            if (!this.f63578b.mo73673k0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.g$c */
    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class C14585c extends C13708q implements C16265l<C14900e0, C14900e0> {

        /* renamed from: a */
        public static final C14585c f63579a = new C14585c();

        C14585c() {
            super(1);
        }

        /* renamed from: a */
        public final C14900e0 invoke(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "it");
            return e0Var;
        }
    }

    static {
        Class<C14582g> cls = C14582g.class;
        f63527X = new C16887m[]{C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "withDefinedIn", "getWithDefinedIn()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "modifiers", "getModifiers()Ljava/util/Set;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "startFromName", "getStartFromName()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "debugMode", "getDebugMode()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "verbose", "getVerbose()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "unitReturnType", "getUnitReturnType()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "withoutReturnType", "getWithoutReturnType()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "enhancedTypes", "getEnhancedTypes()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderDefaultModality", "getRenderDefaultModality()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "includePropertyConstant", "getIncludePropertyConstant()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "receiverAfterName", "getReceiverAfterName()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C13687e0.m87871e(new C13710s(C13687e0.m87868b(cls), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public C14582g() {
        Boolean bool = Boolean.TRUE;
        this.f63553c = m91373m0(bool);
        this.f63554d = m91373m0(bool);
        this.f63555e = m91373m0(C14578e.f63519c);
        Boolean bool2 = Boolean.FALSE;
        this.f63556f = m91373m0(bool2);
        this.f63557g = m91373m0(bool2);
        this.f63558h = m91373m0(bool2);
        this.f63559i = m91373m0(bool2);
        this.f63560j = m91373m0(bool2);
        this.f63561k = m91373m0(bool);
        this.f63562l = m91373m0(bool2);
        this.f63563m = m91373m0(bool2);
        this.f63564n = m91373m0(bool2);
        this.f63565o = m91373m0(bool);
        this.f63566p = m91373m0(bool);
        this.f63567q = m91373m0(bool2);
        this.f63568r = m91373m0(bool2);
        this.f63569s = m91373m0(bool2);
        this.f63570t = m91373m0(bool2);
        this.f63571u = m91373m0(bool2);
        this.f63572v = m91373m0(bool2);
        this.f63573w = m91373m0(bool2);
        this.f63574x = m91373m0(C14585c.f63579a);
        this.f63575y = m91373m0(C14583a.f63577a);
        this.f63576z = m91373m0(bool);
        this.f63528A = m91373m0(C14588j.RENDER_OPEN);
        this.f63529B = m91373m0(C14552c.C14565l.C14566a.f63499a);
        this.f63530C = m91373m0(C14591m.f63595a);
        this.f63531D = m91373m0(C14589k.ALL);
        this.f63532E = m91373m0(bool2);
        this.f63533F = m91373m0(bool2);
        this.f63534G = m91373m0(C14590l.DEBUG);
        this.f63535H = m91373m0(bool2);
        this.f63536I = m91373m0(bool2);
        this.f63537J = m91373m0(C13627z0.m87806d());
        this.f63538K = m91373m0(C14586h.f63580a.mo73688a());
        this.f63539L = m91373m0((Object) null);
        this.f63540M = m91373m0(C14547a.NO_ARGUMENTS);
        this.f63541N = m91373m0(bool2);
        this.f63542O = m91373m0(bool);
        this.f63543P = m91373m0(bool);
        this.f63544Q = m91373m0(bool2);
        this.f63545R = m91373m0(bool);
        this.f63546S = m91373m0(bool);
        this.f63547T = m91373m0(bool2);
        this.f63548U = m91373m0(bool2);
        this.f63549V = m91373m0(bool2);
        this.f63550W = m91373m0(bool);
    }

    /* renamed from: m0 */
    private final <T> C16605d<C14582g, T> m91373m0(T t) {
        C16602a aVar = C16602a.f67429a;
        return new C14584b(t, this);
    }

    /* renamed from: A */
    public boolean mo73637A() {
        return ((Boolean) this.f63545R.mo32407a(this, f63527X[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean mo73638B() {
        return C14580f.C14581a.m91371a(this);
    }

    /* renamed from: C */
    public boolean mo73639C() {
        return C14580f.C14581a.m91372b(this);
    }

    /* renamed from: D */
    public boolean mo73640D() {
        return ((Boolean) this.f63571u.mo32407a(this, f63527X[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean mo73641E() {
        return ((Boolean) this.f63550W.mo32407a(this, f63527X[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<C14578e> mo73642F() {
        return (Set) this.f63555e.mo32407a(this, f63527X[3]);
    }

    /* renamed from: G */
    public boolean mo73643G() {
        return ((Boolean) this.f63564n.mo32407a(this, f63527X[12])).booleanValue();
    }

    /* renamed from: H */
    public C14588j mo73644H() {
        return (C14588j) this.f63528A.mo32407a(this, f63527X[25]);
    }

    /* renamed from: I */
    public C14589k mo73645I() {
        return (C14589k) this.f63531D.mo32407a(this, f63527X[28]);
    }

    /* renamed from: J */
    public boolean mo73646J() {
        return ((Boolean) this.f63546S.mo32407a(this, f63527X[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean mo73647K() {
        return ((Boolean) this.f63548U.mo32407a(this, f63527X[45])).booleanValue();
    }

    /* renamed from: L */
    public C14590l mo73648L() {
        return (C14590l) this.f63534G.mo32407a(this, f63527X[31]);
    }

    /* renamed from: M */
    public boolean mo73649M() {
        return ((Boolean) this.f63532E.mo32407a(this, f63527X[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean mo73650N() {
        return ((Boolean) this.f63533F.mo32407a(this, f63527X[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean mo73651O() {
        return ((Boolean) this.f63567q.mo32407a(this, f63527X[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean mo73652P() {
        return ((Boolean) this.f63542O.mo32407a(this, f63527X[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean mo73653Q() {
        return ((Boolean) this.f63535H.mo32407a(this, f63527X[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean mo73654R() {
        return ((Boolean) this.f63566p.mo32407a(this, f63527X[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean mo73655S() {
        return ((Boolean) this.f63565o.mo32407a(this, f63527X[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean mo73656T() {
        return ((Boolean) this.f63568r.mo32407a(this, f63527X[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean mo73657U() {
        return ((Boolean) this.f63544Q.mo32407a(this, f63527X[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean mo73658V() {
        return ((Boolean) this.f63543P.mo32407a(this, f63527X[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean mo73659W() {
        return ((Boolean) this.f63576z.mo32407a(this, f63527X[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean mo73660X() {
        return ((Boolean) this.f63557g.mo32407a(this, f63527X[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean mo73661Y() {
        return ((Boolean) this.f63556f.mo32407a(this, f63527X[4])).booleanValue();
    }

    /* renamed from: Z */
    public C14591m mo73662Z() {
        return (C14591m) this.f63530C.mo32407a(this, f63527X[27]);
    }

    /* renamed from: a */
    public void mo73573a(boolean z) {
        this.f63556f.mo79447b(this, f63527X[4], Boolean.valueOf(z));
    }

    /* renamed from: a0 */
    public C16265l<C14900e0, C14900e0> mo73663a0() {
        return (C16265l) this.f63574x.mo32407a(this, f63527X[22]);
    }

    /* renamed from: b */
    public void mo73576b(C14589k kVar) {
        C13706o.m87929f(kVar, "<set-?>");
        this.f63531D.mo79447b(this, f63527X[28], kVar);
    }

    /* renamed from: b0 */
    public boolean mo73664b0() {
        return ((Boolean) this.f63570t.mo32407a(this, f63527X[18])).booleanValue();
    }

    /* renamed from: c */
    public void mo73578c(boolean z) {
        this.f63553c.mo79447b(this, f63527X[1], Boolean.valueOf(z));
    }

    /* renamed from: c0 */
    public boolean mo73665c0() {
        return ((Boolean) this.f63561k.mo32407a(this, f63527X[9])).booleanValue();
    }

    /* renamed from: d */
    public boolean mo73580d() {
        return ((Boolean) this.f63563m.mo32407a(this, f63527X[11])).booleanValue();
    }

    /* renamed from: d0 */
    public C14552c.C14565l mo73666d0() {
        return (C14552c.C14565l) this.f63529B.mo32407a(this, f63527X[26]);
    }

    /* renamed from: e */
    public void mo73582e(boolean z) {
        this.f63573w.mo79447b(this, f63527X[21], Boolean.valueOf(z));
    }

    /* renamed from: e0 */
    public boolean mo73667e0() {
        return ((Boolean) this.f63560j.mo32407a(this, f63527X[8])).booleanValue();
    }

    /* renamed from: f */
    public void mo73584f(boolean z) {
        this.f63532E.mo79447b(this, f63527X[29], Boolean.valueOf(z));
    }

    /* renamed from: f0 */
    public boolean mo73668f0() {
        return ((Boolean) this.f63553c.mo32407a(this, f63527X[1])).booleanValue();
    }

    /* renamed from: g */
    public void mo73586g(C14591m mVar) {
        C13706o.m87929f(mVar, "<set-?>");
        this.f63530C.mo79447b(this, f63527X[27], mVar);
    }

    /* renamed from: g0 */
    public boolean mo73669g0() {
        return ((Boolean) this.f63554d.mo32407a(this, f63527X[2])).booleanValue();
    }

    /* renamed from: h */
    public Set<C16152c> mo73588h() {
        return (Set) this.f63538K.mo32407a(this, f63527X[35]);
    }

    /* renamed from: h0 */
    public boolean mo73670h0() {
        return ((Boolean) this.f63562l.mo32407a(this, f63527X[10])).booleanValue();
    }

    /* renamed from: i */
    public boolean mo73590i() {
        return ((Boolean) this.f63558h.mo32407a(this, f63527X[6])).booleanValue();
    }

    /* renamed from: i0 */
    public boolean mo73671i0() {
        return ((Boolean) this.f63573w.mo32407a(this, f63527X[21])).booleanValue();
    }

    /* renamed from: j */
    public C14547a mo73592j() {
        return (C14547a) this.f63540M.mo32407a(this, f63527X[37]);
    }

    /* renamed from: j0 */
    public boolean mo73672j0() {
        return ((Boolean) this.f63572v.mo32407a(this, f63527X[20])).booleanValue();
    }

    /* renamed from: k */
    public void mo73594k(Set<C16152c> set) {
        C13706o.m87929f(set, "<set-?>");
        this.f63538K.mo79447b(this, f63527X[35], set);
    }

    /* renamed from: k0 */
    public final boolean mo73673k0() {
        return this.f63551a;
    }

    /* renamed from: l */
    public void mo73596l(Set<? extends C14578e> set) {
        C13706o.m87929f(set, "<set-?>");
        this.f63555e.mo79447b(this, f63527X[3], set);
    }

    /* renamed from: l0 */
    public final void mo73674l0() {
        this.f63551a = true;
    }

    /* renamed from: m */
    public void mo73598m(C14548b bVar) {
        C13706o.m87929f(bVar, "<set-?>");
        this.f63552b.mo79447b(this, f63527X[0], bVar);
    }

    /* renamed from: n */
    public void mo73600n(boolean z) {
        this.f63558h.mo79447b(this, f63527X[6], Boolean.valueOf(z));
    }

    /* renamed from: o */
    public void mo73602o(boolean z) {
        this.f63533F.mo79447b(this, f63527X[30], Boolean.valueOf(z));
    }

    /* renamed from: p */
    public void mo73604p(boolean z) {
        this.f63572v.mo79447b(this, f63527X[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final C14582g mo73675q() {
        Class<C14582g> cls = C14582g.class;
        C14582g gVar = new C14582g();
        Field[] declaredFields = cls.getDeclaredFields();
        C13706o.m87928e(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                C16603b bVar = obj instanceof C16603b ? (C16603b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    C13706o.m87928e(name, "field.name");
                    boolean unused = C15176v.m93634I(name, "is", false, 2, (Object) null);
                    C16875d b = C13687e0.m87868b(cls);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    C13706o.m87928e(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(gVar, gVar.m91373m0(bVar.mo32407a(this, new C13716y(b, name2, sb.toString()))));
                }
            }
        }
        return gVar;
    }

    /* renamed from: r */
    public boolean mo73676r() {
        return ((Boolean) this.f63569s.mo32407a(this, f63527X[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean mo73677s() {
        return ((Boolean) this.f63541N.mo32407a(this, f63527X[38])).booleanValue();
    }

    /* renamed from: t */
    public C16265l<C13915c, Boolean> mo73678t() {
        return (C16265l) this.f63539L.mo32407a(this, f63527X[36]);
    }

    /* renamed from: u */
    public boolean mo73679u() {
        return ((Boolean) this.f63549V.mo32407a(this, f63527X[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean mo73680v() {
        return ((Boolean) this.f63559i.mo32407a(this, f63527X[7])).booleanValue();
    }

    /* renamed from: w */
    public C14548b mo73681w() {
        return (C14548b) this.f63552b.mo32407a(this, f63527X[0]);
    }

    /* renamed from: x */
    public C16265l<C13966i1, String> mo73682x() {
        return (C16265l) this.f63575y.mo32407a(this, f63527X[23]);
    }

    /* renamed from: y */
    public boolean mo73683y() {
        return ((Boolean) this.f63536I.mo32407a(this, f63527X[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<C16152c> mo73684z() {
        return (Set) this.f63537J.mo32407a(this, f63527X[34]);
    }
}
