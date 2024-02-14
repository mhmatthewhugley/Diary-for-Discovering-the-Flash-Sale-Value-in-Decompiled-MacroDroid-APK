package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.webkit.ProxyConfig;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.mail.Part;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13852g;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13941c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13953f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14073p;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14078r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14145w;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13913a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13918e;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q;
import kotlin.reflect.jvm.internal.impl.types.C14828a;
import kotlin.reflect.jvm.internal.impl.types.C14884d0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14961p;
import kotlin.reflect.jvm.internal.impl.types.C14966q0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14974s1;
import kotlin.reflect.jvm.internal.impl.types.C14980u0;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import org.apache.commons.p353io.FilenameUtils;
import p225cc.C11170a;
import p253ec.C12187a;
import p297ja.C13321g;
import p297ja.C13339u;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p362pb.C16159h;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p450zb.C17085h;
import p450zb.C17086i;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d */
/* compiled from: DescriptorRendererImpl.kt */
public final class C14567d extends C14552c implements C14580f {

    /* renamed from: l */
    private final C14582g f63500l;

    /* renamed from: m */
    private final C13321g f63501m = C13323i.m85669b(new C14572d(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a */
    /* compiled from: DescriptorRendererImpl.kt */
    private final class C14568a implements C14071o<C13339u, StringBuilder> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a$a */
        /* compiled from: DescriptorRendererImpl.kt */
        public /* synthetic */ class C14569a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63503a;

            static {
                int[] iArr = new int[C14590l.values().length];
                iArr[C14590l.PRETTY.ordinal()] = 1;
                iArr[C14590l.DEBUG.ordinal()] = 2;
                iArr[C14590l.f63593d.ordinal()] = 3;
                f63503a = iArr;
            }
        }

        public C14568a() {
        }

        /* renamed from: t */
        private final void m91320t(C14126s0 s0Var, StringBuilder sb, String str) {
            int i = C14569a.f63503a[C14567d.this.mo73599m0().ordinal()];
            if (i == 1) {
                C14567d.this.m91204S0(s0Var, sb);
                sb.append(str + " for ");
                C14567d dVar = C14567d.this;
                C14140t0 W = s0Var.mo72327W();
                C13706o.m87928e(W, "descriptor.correspondingProperty");
                dVar.m91168B1(W, sb);
            } else if (i == 2) {
                mo73620p(s0Var, sb);
            }
        }

        /* renamed from: A */
        public void mo73617A(C13966i1 i1Var, StringBuilder sb) {
            C13706o.m87929f(i1Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91207T1(i1Var, true, sb, true);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo72426a(C13948e eVar, Object obj) {
            mo73618n(eVar, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo72427b(C14074p0 p0Var, Object obj) {
            mo73623s(p0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo71973c(C14140t0 t0Var, Object obj) {
            mo73624u(t0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo72428d(C13947d1 d1Var, Object obj) {
            mo73628y(d1Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ Object mo72429e(C14144v0 v0Var, Object obj) {
            mo73626w(v0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo72430f(C13966i1 i1Var, Object obj) {
            mo73617A(i1Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ Object mo72431g(C14142u0 u0Var, Object obj) {
            mo73625v(u0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo72432h(C14050k0 k0Var, Object obj) {
            mo73622r(k0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ Object mo71974i(C14154y yVar, Object obj) {
            mo73620p(yVar, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo72103j(C14052l lVar, Object obj) {
            mo73619o(lVar, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Object mo72433k(C13958g0 g0Var, Object obj) {
            mo73621q(g0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo72434l(C14146w0 w0Var, Object obj) {
            mo73627x(w0Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ Object mo72435m(C13950e1 e1Var, Object obj) {
            mo73629z(e1Var, (StringBuilder) obj);
            return C13339u.f61331a;
        }

        /* renamed from: n */
        public void mo73618n(C13948e eVar, StringBuilder sb) {
            C13706o.m87929f(eVar, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91216Y0(eVar, sb);
        }

        /* renamed from: o */
        public void mo73619o(C14052l lVar, StringBuilder sb) {
            C13706o.m87929f(lVar, "constructorDescriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91224d1(lVar, sb);
        }

        /* renamed from: p */
        public void mo73620p(C14154y yVar, StringBuilder sb) {
            C13706o.m87929f(yVar, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91230j1(yVar, sb);
        }

        /* renamed from: q */
        public void mo73621q(C13958g0 g0Var, StringBuilder sb) {
            C13706o.m87929f(g0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91239t1(g0Var, sb, true);
        }

        /* renamed from: r */
        public void mo73622r(C14050k0 k0Var, StringBuilder sb) {
            C13706o.m87929f(k0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91243x1(k0Var, sb);
        }

        /* renamed from: s */
        public void mo73623s(C14074p0 p0Var, StringBuilder sb) {
            C13706o.m87929f(p0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91246z1(p0Var, sb);
        }

        /* renamed from: u */
        public void mo73624u(C14140t0 t0Var, StringBuilder sb) {
            C13706o.m87929f(t0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91168B1(t0Var, sb);
        }

        /* renamed from: v */
        public void mo73625v(C14142u0 u0Var, StringBuilder sb) {
            C13706o.m87929f(u0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            m91320t(u0Var, sb, "getter");
        }

        /* renamed from: w */
        public void mo73626w(C14144v0 v0Var, StringBuilder sb) {
            C13706o.m87929f(v0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            m91320t(v0Var, sb, "setter");
        }

        /* renamed from: x */
        public void mo73627x(C14146w0 w0Var, StringBuilder sb) {
            C13706o.m87929f(w0Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            sb.append(w0Var.getName());
        }

        /* renamed from: y */
        public void mo73628y(C13947d1 d1Var, StringBuilder sb) {
            C13706o.m87929f(d1Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91184J1(d1Var, sb);
        }

        /* renamed from: z */
        public void mo73629z(C13950e1 e1Var, StringBuilder sb) {
            C13706o.m87929f(e1Var, "descriptor");
            C13706o.m87929f(sb, "builder");
            C14567d.this.m91196O1(e1Var, sb, true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$b */
    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class C14570b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63504a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f63505b;

        static {
            int[] iArr = new int[C14591m.values().length];
            iArr[C14591m.f63595a.ordinal()] = 1;
            iArr[C14591m.f63596c.ordinal()] = 2;
            f63504a = iArr;
            int[] iArr2 = new int[C14589k.values().length];
            iArr2[C14589k.ALL.ordinal()] = 1;
            iArr2[C14589k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[C14589k.f63589d.ordinal()] = 3;
            f63505b = iArr2;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$c */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14571c extends C13708q implements C16265l<C14926g1, CharSequence> {
        final /* synthetic */ C14567d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14571c(C14567d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C14926g1 g1Var) {
            C13706o.m87929f(g1Var, "it");
            if (g1Var.mo74184b()) {
                return ProxyConfig.MATCH_ALL_SCHEMES;
            }
            C14567d dVar = this.this$0;
            C14900e0 type = g1Var.getType();
            C13706o.m87928e(type, "it.type");
            String w = dVar.mo73532w(type);
            if (g1Var.mo74185c() == C14970r1.INVARIANT) {
                return w;
            }
            return g1Var.mo74185c() + ' ' + w;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14572d extends C13708q implements C16254a<C14567d> {
        final /* synthetic */ C14567d this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d$a */
        /* compiled from: DescriptorRendererImpl.kt */
        static final class C14573a extends C13708q implements C16265l<C14580f, C13339u> {

            /* renamed from: a */
            public static final C14573a f63506a = new C14573a();

            C14573a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo73632a(C14580f fVar) {
                C13706o.m87929f(fVar, "$this$withOptions");
                fVar.mo73594k(C13563a1.m87391j(fVar.mo73588h(), C13614t.m87751m(C13902k.C13903a.f62207C, C13902k.C13903a.f62209D)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73632a((C14580f) obj);
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14572d(C14567d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C14567d invoke() {
            C14552c y = this.this$0.mo73534y(C14573a.f63506a);
            C13706o.m87927d(y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (C14567d) y;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$e */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14574e extends C13708q implements C16265l<C14617g<?>, CharSequence> {
        final /* synthetic */ C14567d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14574e(C14567d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C14617g<?> gVar) {
            C13706o.m87929f(gVar, "it");
            return this.this$0.m91223c1(gVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$f */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14575f extends C13708q implements C16265l<C13966i1, CharSequence> {

        /* renamed from: a */
        public static final C14575f f63507a = new C14575f();

        C14575f() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C13966i1 i1Var) {
            return "";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$g */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14576g extends C13708q implements C16265l<C14900e0, CharSequence> {
        final /* synthetic */ C14567d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14576g(C14567d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C14900e0 e0Var) {
            C14567d dVar = this.this$0;
            C13706o.m87928e(e0Var, "it");
            return dVar.mo73532w(e0Var);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$h */
    /* compiled from: DescriptorRendererImpl.kt */
    static final class C14577h extends C13708q implements C16265l<C14900e0, Object> {

        /* renamed from: a */
        public static final C14577h f63508a = new C14577h();

        C14577h() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "it");
            return e0Var instanceof C14980u0 ? ((C14980u0) e0Var).mo74142W0() : e0Var;
        }
    }

    public C14567d(C14582g gVar) {
        C13706o.m87929f(gVar, "options");
        this.f63500l = gVar;
        gVar.mo73673k0();
    }

    /* renamed from: A1 */
    private final void m91166A1(StringBuilder sb, C14078r0 r0Var) {
        C14078r0 c = r0Var.mo72575c();
        if (c != null) {
            m91166A1(sb, c);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            C16157f name = r0Var.mo72574b().getName();
            C13706o.m87928e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo73531v(name, false));
        } else {
            C14901e1 j = r0Var.mo72574b().mo62171j();
            C13706o.m87928e(j, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(mo73563L1(j));
        }
        sb.append(mo73562K1(r0Var.mo72573a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m91168B1(C14140t0 t0Var, StringBuilder sb) {
        if (!mo73616z0()) {
            if (!mo73615y0()) {
                m91170C1(t0Var, sb);
                List<C14146w0> x0 = t0Var.mo72238x0();
                C13706o.m87928e(x0, "property.contextReceiverParameters");
                m91225e1(x0, sb);
                C14141u visibility = t0Var.getVisibility();
                C13706o.m87928e(visibility, "property.visibility");
                m91213W1(visibility, sb);
                boolean z = false;
                m91238s1(sb, mo73585f0().contains(C14578e.CONST) && t0Var.mo68664b0(), "const");
                m91235o1(t0Var, sb);
                m91237r1(t0Var, sb);
                m91242w1(t0Var, sb);
                if (mo73585f0().contains(C14578e.LATEINIT) && t0Var.mo72349y0()) {
                    z = true;
                }
                m91238s1(sb, z, "lateinit");
                m91234n1(t0Var, sb);
            }
            m91205S1(this, t0Var, sb, false, 4, (Object) null);
            List<C13950e1> typeParameters = t0Var.getTypeParameters();
            C13706o.m87928e(typeParameters, "property.typeParameters");
            m91201Q1(typeParameters, sb, true);
            m91172D1(t0Var, sb);
        }
        m91239t1(t0Var, sb, true);
        sb.append(": ");
        C14900e0 type = t0Var.getType();
        C13706o.m87928e(type, "property.type");
        sb.append(mo73532w(type));
        m91174E1(t0Var, sb);
        m91232l1(t0Var, sb);
        List<C13950e1> typeParameters2 = t0Var.getTypeParameters();
        C13706o.m87928e(typeParameters2, "property.typeParameters");
        m91215X1(typeParameters2, sb);
    }

    /* renamed from: C1 */
    private final void m91170C1(C14140t0 t0Var, StringBuilder sb) {
        if (mo73585f0().contains(C14578e.ANNOTATIONS)) {
            m91212W0(this, sb, t0Var, (C13918e) null, 2, (Object) null);
            C14145w w0 = t0Var.mo72348w0();
            if (w0 != null) {
                m91210V0(sb, w0, C13918e.FIELD);
            }
            C14145w Q = t0Var.mo72336Q();
            if (Q != null) {
                m91210V0(sb, Q, C13918e.PROPERTY_DELEGATE_FIELD);
            }
            if (mo73599m0() == C14590l.f63593d) {
                C14142u0 f = t0Var.mo72346f();
                if (f != null) {
                    m91210V0(sb, f, C13918e.PROPERTY_GETTER);
                }
                C14144v0 H = t0Var.mo72334H();
                if (H != null) {
                    m91210V0(sb, H, C13918e.PROPERTY_SETTER);
                    List<C13966i1> g = H.mo72235g();
                    C13706o.m87928e(g, "setter.valueParameters");
                    C13966i1 i1Var = (C13966i1) C13566b0.m87446u0(g);
                    C13706o.m87928e(i1Var, "it");
                    m91210V0(sb, i1Var, C13918e.SETTER_PARAMETER);
                }
            }
        }
    }

    /* renamed from: D1 */
    private final void m91172D1(C13908a aVar, StringBuilder sb) {
        C14146w0 P = aVar.mo72232P();
        if (P != null) {
            m91210V0(sb, P, C13918e.RECEIVER);
            C14900e0 type = P.getType();
            C13706o.m87928e(type, "receiver.type");
            sb.append(m91228h1(type));
            sb.append(".");
        }
    }

    /* renamed from: E1 */
    private final void m91174E1(C13908a aVar, StringBuilder sb) {
        C14146w0 P;
        if (mo73601n0() && (P = aVar.mo72232P()) != null) {
            sb.append(" on ");
            C14900e0 type = P.getType();
            C13706o.m87928e(type, "receiver.type");
            sb.append(mo73532w(type));
        }
    }

    /* renamed from: F1 */
    private final void m91176F1(StringBuilder sb, C14951m0 m0Var) {
        if (C13706o.m87924a(m0Var, C14956n1.f64080b) || C14956n1.m92996k(m0Var)) {
            sb.append("???");
        } else if (C17088k.m100543o(m0Var)) {
            if (mo73553C0()) {
                C14901e1 N0 = m0Var.mo73702N0();
                C13706o.m87927d(N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(m91227g1(((C17086i) N0).mo80357f(0)));
                return;
            }
            sb.append("???");
        } else if (C14925g0.m92873a(m0Var)) {
            m91226f1(sb, m0Var);
        } else if (m91220Z1(m0Var)) {
            m91231k1(sb, m0Var);
        } else {
            m91226f1(sb, m0Var);
        }
    }

    /* renamed from: G1 */
    private final void m91178G1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: H1 */
    private final void m91180H1(C13948e eVar, StringBuilder sb) {
        if (!mo73560J0() && !C13853h.m88267m0(eVar.mo72274p())) {
            Collection<C14900e0> l = eVar.mo62171j().mo72370l();
            C13706o.m87928e(l, "klass.typeConstructor.supertypes");
            if (l.isEmpty()) {
                return;
            }
            if (l.size() != 1 || !C13853h.m88253b0(l.iterator().next())) {
                m91178G1(sb);
                sb.append(": ");
                Appendable unused = C13566b0.m87430e0(l, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C14576g(this), 60, (Object) null);
            }
        }
    }

    /* renamed from: I1 */
    private final void m91182I1(C14154y yVar, StringBuilder sb) {
        m91238s1(sb, yVar.isSuspend(), "suspend");
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m91184J1(C13947d1 d1Var, StringBuilder sb) {
        m91212W0(this, sb, d1Var, (C13918e) null, 2, (Object) null);
        C14141u visibility = d1Var.getVisibility();
        C13706o.m87928e(visibility, "typeAlias.visibility");
        m91213W1(visibility, sb);
        m91235o1(d1Var, sb);
        sb.append(m91233m1("typealias"));
        sb.append(" ");
        m91239t1(d1Var, sb, true);
        List<C13950e1> q = d1Var.mo62178q();
        C13706o.m87928e(q, "typeAlias.declaredTypeParameters");
        m91201Q1(q, sb, false);
        m91214X0(d1Var, sb);
        sb.append(" = ");
        sb.append(mo73532w(d1Var.mo72282t0()));
    }

    /* renamed from: L */
    private final void m91186L(StringBuilder sb, C14064m mVar) {
        C14064m b;
        String name;
        if (!(mVar instanceof C14050k0) && !(mVar instanceof C14074p0) && (b = mVar.mo62163b()) != null && !(b instanceof C13958g0)) {
            sb.append(" ");
            sb.append(mo73606p1("defined in"));
            sb.append(" ");
            C16153d m = C14650d.m91626m(b);
            C13706o.m87928e(m, "getFqName(containingDeclaration)");
            sb.append(m.mo78570e() ? "root package" : mo73530u(m));
            if (mo73558H0() && (b instanceof C14050k0) && (mVar instanceof C14073p) && (name = ((C14073p) mVar).getSource().mo67419b().getName()) != null) {
                sb.append(" ");
                sb.append(mo73606p1("in file"));
                sb.append(" ");
                sb.append(name);
            }
        }
    }

    /* renamed from: L0 */
    private final String m91187L0() {
        return m91197P(">");
    }

    /* renamed from: M */
    private final void m91188M(StringBuilder sb, List<? extends C14926g1> list) {
        Appendable unused = C13566b0.m87430e0(list, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C14571c(this), 60, (Object) null);
    }

    /* renamed from: M0 */
    private final boolean m91189M0(C14900e0 e0Var) {
        return C13852g.m88238q(e0Var) || !e0Var.getAnnotations().isEmpty();
    }

    /* renamed from: M1 */
    private final void m91190M1(StringBuilder sb, C14900e0 e0Var, C14901e1 e1Var) {
        C14078r0 a = C13953f1.m88585a(e0Var);
        if (a == null) {
            sb.append(mo73563L1(e1Var));
            sb.append(mo73562K1(e0Var.mo73700L0()));
            return;
        }
        m91166A1(sb, a);
    }

    /* renamed from: N */
    private final String m91191N() {
        int i = C14570b.f63504a[mo73551A0().ordinal()];
        if (i == 1) {
            return m91197P("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: N0 */
    private final C13945d0 m91192N0(C13941c0 c0Var) {
        if (c0Var instanceof C13948e) {
            return ((C13948e) c0Var).mo62168h() == C13951f.INTERFACE ? C13945d0.ABSTRACT : C13945d0.FINAL;
        }
        C14064m b = c0Var.mo62163b();
        C13948e eVar = b instanceof C13948e ? (C13948e) b : null;
        if (eVar == null) {
            return C13945d0.FINAL;
        }
        if (!(c0Var instanceof C13936b)) {
            return C13945d0.FINAL;
        }
        C13936b bVar = (C13936b) c0Var;
        Collection<? extends C13936b> d = bVar.mo72234d();
        C13706o.m87928e(d, "this.overriddenDescriptors");
        if ((!d.isEmpty()) && eVar.mo62179r() != C13945d0.FINAL) {
            return C13945d0.OPEN;
        }
        if (eVar.mo62168h() != C13951f.INTERFACE || C13706o.m87924a(bVar.getVisibility(), C14127t.f62750a)) {
            return C13945d0.FINAL;
        }
        C13945d0 r = bVar.mo62179r();
        C13945d0 d0Var = C13945d0.ABSTRACT;
        if (r == d0Var) {
            return d0Var;
        }
        return C13945d0.OPEN;
    }

    /* renamed from: N1 */
    static /* synthetic */ void m91193N1(C14567d dVar, StringBuilder sb, C14900e0 e0Var, C14901e1 e1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            e1Var = e0Var.mo73702N0();
        }
        dVar.m91190M1(sb, e0Var, e1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r7 + '?', r8) == false) goto L_0x0034;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m91194O(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = kotlin.text.C15176v.m93630E(r0, r1, r2, r3, r4, r5)
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r7, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0050
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = kotlin.text.C15176v.m93640u(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r8)
            if (r0 != 0) goto L_0x0050
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r7, r8)
            if (r7 == 0) goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C14567d.m91194O(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: O0 */
    private final boolean m91195O0(C13915c cVar) {
        return C13706o.m87924a(cVar.mo72241e(), C13902k.C13903a.f62211E);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m91196O1(C13950e1 e1Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m91198P0());
        }
        if (mo73556F0()) {
            sb.append("/*");
            sb.append(e1Var.mo72272i());
            sb.append("*/ ");
        }
        m91238s1(sb, e1Var.mo72276v(), "reified");
        String e = e1Var.mo72273l().mo74233e();
        boolean z2 = true;
        m91238s1(sb, e.length() > 0, e);
        m91212W0(this, sb, e1Var, (C13918e) null, 2, (Object) null);
        m91239t1(e1Var, sb, z);
        int size = e1Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            C14900e0 next = e1Var.getUpperBounds().iterator().next();
            if (!C13853h.m88263i0(next)) {
                sb.append(" : ");
                C13706o.m87928e(next, "upperBound");
                sb.append(mo73532w(next));
            }
        } else if (z) {
            for (C14900e0 next2 : e1Var.getUpperBounds()) {
                if (!C13853h.m88263i0(next2)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    C13706o.m87928e(next2, "upperBound");
                    sb.append(mo73532w(next2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m91187L0());
        }
    }

    /* renamed from: P */
    private final String m91197P(String str) {
        return mo73551A0().mo73689d(str);
    }

    /* renamed from: P0 */
    private final String m91198P0() {
        return m91197P("<");
    }

    /* renamed from: P1 */
    private final void m91199P1(StringBuilder sb, List<? extends C13950e1> list) {
        Iterator<? extends C13950e1> it = list.iterator();
        while (it.hasNext()) {
            m91196O1((C13950e1) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: Q0 */
    private final boolean m91200Q0(C13936b bVar) {
        return !bVar.mo72234d().isEmpty();
    }

    /* renamed from: Q1 */
    private final void m91201Q1(List<? extends C13950e1> list, StringBuilder sb, boolean z) {
        if (!mo73561K0() && (!list.isEmpty())) {
            sb.append(m91198P0());
            m91199P1(sb, list);
            sb.append(m91187L0());
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: R0 */
    private final void m91202R0(StringBuilder sb, C14828a aVar) {
        C14591m A0 = mo73551A0();
        C14591m mVar = C14591m.f63596c;
        if (A0 == mVar) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        m91241v1(sb, aVar.mo74032G());
        sb.append(" */");
        if (mo73551A0() == mVar) {
            sb.append("</i></font>");
        }
    }

    /* renamed from: R1 */
    private final void m91203R1(C14048j1 j1Var, StringBuilder sb, boolean z) {
        if (z || !(j1Var instanceof C13966i1)) {
            sb.append(m91233m1(j1Var.mo72440N() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m91204S0(C14126s0 s0Var, StringBuilder sb) {
        m91235o1(s0Var, sb);
    }

    /* renamed from: S1 */
    static /* synthetic */ void m91205S1(C14567d dVar, C14048j1 j1Var, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        dVar.m91203R1(j1Var, sb, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91206T0(kotlin.reflect.jvm.internal.impl.descriptors.C14154y r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003a
            java.util.Collection r0 = r6.mo72234d()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0019
        L_0x0017:
            r0 = 1
            goto L_0x0030
        L_0x0019:
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0017
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L_0x001d
            r0 = 0
        L_0x0030:
            if (r0 != 0) goto L_0x0038
            boolean r0 = r5.mo73565R()
            if (r0 == 0) goto L_0x003a
        L_0x0038:
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L_0x0070
            java.util.Collection r4 = r6.mo72234d()
            kotlin.jvm.internal.C13706o.m87928e(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0050
        L_0x004e:
            r1 = 1
            goto L_0x0067
        L_0x0050:
            java.util.Iterator r1 = r4.iterator()
        L_0x0054:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L_0x0054
            r1 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x006f
            boolean r1 = r5.mo73565R()
            if (r1 == 0) goto L_0x0070
        L_0x006f:
            r2 = 1
        L_0x0070:
            boolean r1 = r6.mo62204B()
            java.lang.String r3 = "tailrec"
            r5.m91238s1(r7, r1, r3)
            r5.m91182I1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.m91238s1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.m91238s1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.m91238s1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C14567d.m91206T0(kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.StringBuilder):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if ((mo73590i() ? r10.mo72302A0() : p389sb.C16519a.m98608a(r10)) != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m91207T1(kotlin.reflect.jvm.internal.impl.descriptors.C13966i1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m91233m1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.mo73556F0()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.mo72303i()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m91212W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo72305r0()
            java.lang.String r1 = "crossinline"
            r9.m91238s1(r12, r0, r1)
            boolean r0 = r10.mo72304p0()
            java.lang.String r1 = "noinline"
            r9.m91238s1(r12, r0, r1)
            boolean r0 = r9.mo73611u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0065
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.mo62163b()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13944d
            if (r3 == 0) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13944d) r0
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.mo72389c0()
            if (r0 != r1) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 == 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            if (r8 == 0) goto L_0x0071
            boolean r0 = r9.mo73564Q()
            java.lang.String r3 = "actual"
            r9.m91238s1(r12, r0, r3)
        L_0x0071:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.m91211V1(r4, r5, r6, r7, r8)
            qa.l r11 = r9.mo73570W()
            if (r11 == 0) goto L_0x0091
            boolean r11 = r9.mo73590i()
            if (r11 == 0) goto L_0x008a
            boolean r11 = r10.mo72302A0()
            goto L_0x008e
        L_0x008a:
            boolean r11 = p389sb.C16519a.m98608a(r10)
        L_0x008e:
            if (r11 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r1 == 0) goto L_0x00b5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            qa.l r13 = r9.mo73570W()
            kotlin.jvm.internal.C13706o.m87926c(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C14567d.m91207T1(kotlin.reflect.jvm.internal.impl.descriptors.i1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: U0 */
    private final List<String> m91208U0(C13915c cVar) {
        C13944d D;
        List<C13966i1> g;
        Map<C16157f, C14617g<?>> a = cVar.mo72240a();
        List list = null;
        C13948e e = mo73608r0() ? C16519a.m98612e(cVar) : null;
        if (!(e == null || (D = e.mo62149D()) == null || (g = D.mo72235g()) == null)) {
            ArrayList<C13966i1> arrayList = new ArrayList<>();
            for (T next : g) {
                if (((C13966i1) next).mo72302A0()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
            for (C13966i1 name : arrayList) {
                arrayList2.add(name.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList<C16157f> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            C16157f fVar = (C16157f) next2;
            C13706o.m87928e(fVar, "it");
            if (!a.containsKey(fVar)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C13616u.m87774u(arrayList3, 10));
        for (C16157f d : arrayList3) {
            arrayList4.add(d.mo78583d() + " = ...");
        }
        Set<Map.Entry<C16157f, C14617g<?>>> entrySet = a.entrySet();
        ArrayList arrayList5 = new ArrayList(C13616u.m87774u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            C16157f fVar2 = (C16157f) entry.getKey();
            C14617g gVar = (C14617g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar2.mo78583d());
            sb.append(" = ");
            sb.append(!list.contains(fVar2) ? m91223c1(gVar) : "...");
            arrayList5.add(sb.toString());
        }
        return C13566b0.m87449x0(C13566b0.m87442q0(arrayList4, arrayList5));
    }

    /* renamed from: U1 */
    private final void m91209U1(Collection<? extends C13966i1> collection, boolean z, StringBuilder sb) {
        boolean a2 = m91221a2(z);
        int size = collection.size();
        mo73555E0().mo73548b(size, sb);
        int i = 0;
        for (C13966i1 i1Var : collection) {
            mo73555E0().mo73547a(i1Var, i, size, sb);
            m91207T1(i1Var, a2, sb, false);
            mo73555E0().mo73549c(i1Var, i, size, sb);
            i++;
        }
        mo73555E0().mo73550d(size, sb);
    }

    /* renamed from: V0 */
    private final void m91210V0(StringBuilder sb, C13913a aVar, C13918e eVar) {
        if (mo73585f0().contains(C14578e.ANNOTATIONS)) {
            Set<C16152c> h = aVar instanceof C14900e0 ? mo73588h() : mo73572Y();
            C16265l<C13915c, Boolean> S = mo73566S();
            for (C13915c cVar : aVar.getAnnotations()) {
                if (!C13566b0.m87414O(h, cVar.mo72241e()) && !m91195O0(cVar)) {
                    if (S == null || S.invoke(cVar).booleanValue()) {
                        sb.append(mo73528r(cVar, eVar));
                        if (mo73571X()) {
                            sb.append(10);
                            C13706o.m87928e(sb, "append('\\n')");
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: V1 */
    private final void m91211V1(C14048j1 j1Var, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        C14900e0 type = j1Var.getType();
        C13706o.m87928e(type, "variable.type");
        C14900e0 e0Var = null;
        C13966i1 i1Var = j1Var instanceof C13966i1 ? (C13966i1) j1Var : null;
        if (i1Var != null) {
            e0Var = i1Var.mo72306v0();
        }
        C14900e0 e0Var2 = e0Var == null ? type : e0Var;
        m91238s1(sb, e0Var != null, "vararg");
        if (z3 || (z2 && !mo73616z0())) {
            m91203R1(j1Var, sb, z3);
        }
        if (z) {
            m91239t1(j1Var, sb, z2);
            sb.append(": ");
        }
        sb.append(mo73532w(e0Var2));
        m91232l1(j1Var, sb);
        if (mo73556F0() && e0Var != null) {
            sb.append(" /*");
            sb.append(mo73532w(type));
            sb.append("*/");
        }
    }

    /* renamed from: W0 */
    static /* synthetic */ void m91212W0(C14567d dVar, StringBuilder sb, C13913a aVar, C13918e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        dVar.m91210V0(sb, aVar, eVar);
    }

    /* renamed from: W1 */
    private final boolean m91213W1(C14141u uVar, StringBuilder sb) {
        if (!mo73585f0().contains(C14578e.VISIBILITY)) {
            return false;
        }
        if (mo73587g0()) {
            uVar = uVar.mo72572f();
        }
        if (!mo73610t0() && C13706o.m87924a(uVar, C14127t.f62761l)) {
            return false;
        }
        sb.append(m91233m1(uVar.mo72571c()));
        sb.append(" ");
        return true;
    }

    /* renamed from: X0 */
    private final void m91214X0(C13964i iVar, StringBuilder sb) {
        List<C13950e1> q = iVar.mo62178q();
        C13706o.m87928e(q, "classifier.declaredTypeParameters");
        List<C13950e1> parameters = iVar.mo62171j().getParameters();
        C13706o.m87928e(parameters, "classifier.typeConstructor.parameters");
        if (mo73556F0() && iVar.mo62182y() && parameters.size() > q.size()) {
            sb.append(" /*captured type parameters: ");
            m91199P1(sb, parameters.subList(q.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: X1 */
    private final void m91215X1(List<? extends C13950e1> list, StringBuilder sb) {
        if (!mo73561K0()) {
            ArrayList arrayList = new ArrayList(0);
            for (C13950e1 e1Var : list) {
                List<C14900e0> upperBounds = e1Var.getUpperBounds();
                C13706o.m87928e(upperBounds, "typeParameter.upperBounds");
                for (C14900e0 e0Var : C13566b0.m87416Q(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    C16157f name = e1Var.getName();
                    C13706o.m87928e(name, "typeParameter.name");
                    sb2.append(mo73531v(name, false));
                    sb2.append(" : ");
                    C13706o.m87928e(e0Var, "it");
                    sb2.append(mo73532w(e0Var));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(m91233m1("where"));
                sb.append(" ");
                Appendable unused = C13566b0.m87430e0(arrayList, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 124, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m91216Y0(C13948e eVar, StringBuilder sb) {
        C13944d D;
        boolean z = eVar.mo62168h() == C13951f.ENUM_ENTRY;
        if (!mo73616z0()) {
            m91212W0(this, sb, eVar, (C13918e) null, 2, (Object) null);
            List<C14146w0> Z = eVar.mo72286Z();
            C13706o.m87928e(Z, "klass.contextReceivers");
            m91225e1(Z, sb);
            if (!z) {
                C14141u visibility = eVar.getVisibility();
                C13706o.m87928e(visibility, "klass.visibility");
                m91213W1(visibility, sb);
            }
            if (!(eVar.mo62168h() == C13951f.INTERFACE && eVar.mo62179r() == C13945d0.ABSTRACT) && (!eVar.mo62168h().mo72288d() || eVar.mo62179r() != C13945d0.FINAL)) {
                C13945d0 r = eVar.mo62179r();
                C13706o.m87928e(r, "klass.modality");
                m91236q1(r, sb, m91192N0(eVar));
            }
            m91235o1(eVar, sb);
            m91238s1(sb, mo73585f0().contains(C14578e.INNER) && eVar.mo62182y(), "inner");
            m91238s1(sb, mo73585f0().contains(C14578e.DATA) && eVar.mo62150I0(), Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            m91238s1(sb, mo73585f0().contains(C14578e.INLINE) && eVar.isInline(), Part.INLINE);
            m91238s1(sb, mo73585f0().contains(C14578e.VALUE) && eVar.mo62172j0(), "value");
            m91238s1(sb, mo73585f0().contains(C14578e.FUN) && eVar.mo62164e0(), "fun");
            m91219Z0(eVar, sb);
        }
        if (!C14650d.m91637x(eVar)) {
            if (!mo73616z0()) {
                m91178G1(sb);
            }
            m91239t1(eVar, sb, true);
        } else {
            m91222b1(eVar, sb);
        }
        if (!z) {
            List<C13950e1> q = eVar.mo62178q();
            C13706o.m87928e(q, "klass.declaredTypeParameters");
            m91201Q1(q, sb, false);
            m91214X0(eVar, sb);
            if (!eVar.mo62168h().mo72288d() && mo73568U() && (D = eVar.mo62149D()) != null) {
                sb.append(" ");
                m91212W0(this, sb, D, (C13918e) null, 2, (Object) null);
                C14141u visibility2 = D.getVisibility();
                C13706o.m87928e(visibility2, "primaryConstructor.visibility");
                m91213W1(visibility2, sb);
                sb.append(m91233m1("constructor"));
                List<C13966i1> g = D.mo72235g();
                C13706o.m87928e(g, "primaryConstructor.valueParameters");
                m91209U1(g, D.mo68653g0(), sb);
            }
            m91180H1(eVar, sb);
            m91215X1(q, sb);
        }
    }

    /* renamed from: Y1 */
    private final String m91217Y1(String str, String str2, String str3, String str4, String str5) {
        if (C15176v.m93634I(str, str2, false, 2, (Object) null) && C15176v.m93634I(str3, str4, false, 2, (Object) null)) {
            String substring = str.substring(str2.length());
            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
            String str6 = str5 + substring;
            if (C13706o.m87924a(substring, substring2)) {
                return str6;
            }
            if (m91194O(substring, substring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    /* renamed from: Z */
    private final C14567d m91218Z() {
        return (C14567d) this.f63501m.getValue();
    }

    /* renamed from: Z0 */
    private final void m91219Z0(C13948e eVar, StringBuilder sb) {
        sb.append(m91233m1(C14552c.f63477a.mo73545a(eVar)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m91220Z1(kotlin.reflect.jvm.internal.impl.types.C14900e0 r4) {
        /*
            r3 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13852g.m88236o(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.mo73700L0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = 1
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r0
            boolean r0 = r0.mo74184b()
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C14567d.m91220Z1(kotlin.reflect.jvm.internal.impl.types.e0):boolean");
    }

    /* renamed from: a2 */
    private final boolean m91221a2(boolean z) {
        int i = C14570b.f63505b[mo73593j0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            } else if (!z) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b1 */
    private final void m91222b1(C14064m mVar, StringBuilder sb) {
        if (mo73603o0()) {
            if (mo73616z0()) {
                sb.append("companion object");
            }
            m91178G1(sb);
            C14064m b = mVar.mo62163b();
            if (b != null) {
                sb.append("of ");
                C16157f name = b.getName();
                C13706o.m87928e(name, "containingDeclaration.name");
                sb.append(mo73531v(name, false));
            }
        }
        if (mo73556F0() || !C13706o.m87924a(mVar.getName(), C16159h.f66305d)) {
            if (!mo73616z0()) {
                m91178G1(sb);
            }
            C16157f name2 = mVar.getName();
            C13706o.m87928e(name2, "descriptor.name");
            sb.append(mo73531v(name2, true));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public final String m91223c1(C14617g<?> gVar) {
        if (gVar instanceof C14612b) {
            return C13566b0.m87432g0((Iterable) ((C14612b) gVar).mo73727b(), ", ", "{", "}", 0, (CharSequence) null, new C14574e(this), 24, (Object) null);
        }
        if (gVar instanceof C14610a) {
            return C15177w.m93698q0(C14552c.m91136s(this, (C13915c) ((C14610a) gVar).mo73727b(), (C13918e) null, 2, (Object) null), "@");
        }
        if (!(gVar instanceof C14636q)) {
            return gVar.toString();
        }
        C14636q.C14638b bVar = (C14636q.C14638b) ((C14636q) gVar).mo73727b();
        if (bVar instanceof C14636q.C14638b.C14639a) {
            return ((C14636q.C14638b.C14639a) bVar).mo73750a() + "::class";
        } else if (bVar instanceof C14636q.C14638b.C14640b) {
            C14636q.C14638b.C14640b bVar2 = (C14636q.C14638b.C14640b) bVar;
            String b = bVar2.mo73755b().mo78544b().mo78556b();
            C13706o.m87928e(b, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < bVar2.mo73754a(); i++) {
                b = "kotlin.Array<" + b + '>';
            }
            return b + "::class";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m91224d1(kotlin.reflect.jvm.internal.impl.descriptors.C14052l r18, java.lang.StringBuilder r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r3 = 0
            r4 = 2
            r5 = 0
            r0 = r17
            r1 = r19
            r2 = r18
            m91212W0(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.renderer.g r0 = r6.f63500l
            boolean r0 = r0.mo73655S()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r18.mo72390d0()
            kotlin.reflect.jvm.internal.impl.descriptors.d0 r0 = r0.mo62179r()
            kotlin.reflect.jvm.internal.impl.descriptors.d0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.SEALED
            if (r0 == r3) goto L_0x0037
        L_0x0026:
            kotlin.reflect.jvm.internal.impl.descriptors.u r0 = r18.getVisibility()
            java.lang.String r3 = "constructor.visibility"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            boolean r0 = r6.m91213W1(r0, r7)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r17.m91234n1(r18, r19)
            boolean r3 = r17.mo73607q0()
            if (r3 != 0) goto L_0x004c
            boolean r3 = r18.mo72389c0()
            if (r3 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r6.m91233m1(r3)
            r7.append(r3)
        L_0x0058:
            kotlin.reflect.jvm.internal.impl.descriptors.i r3 = r18.mo62163b()
            java.lang.String r4 = "constructor.containingDeclaration"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            boolean r4 = r17.mo73614x0()
            java.lang.String r5 = "constructor.typeParameters"
            if (r4 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = " "
            r7.append(r0)
        L_0x0070:
            r6.m91239t1(r3, r7, r2)
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)
            r6.m91201Q1(r0, r7, r1)
        L_0x007d:
            java.util.List r0 = r18.mo72235g()
            java.lang.String r4 = "constructor.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)
            boolean r4 = r18.mo68653g0()
            r6.m91209U1(r0, r4, r7)
            boolean r0 = r17.mo73605p0()
            if (r0 == 0) goto L_0x0103
            boolean r0 = r18.mo72389c0()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r0 == 0) goto L_0x0103
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r3
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.mo62149D()
            if (r0 == 0) goto L_0x0103
            java.util.List r0 = r0.mo72235g()
            java.lang.String r3 = "primaryConstructor.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r0.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r4
            boolean r9 = r4.mo72302A0()
            if (r9 != 0) goto L_0x00d2
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = r4.mo72306v0()
            if (r4 != 0) goto L_0x00d2
            r4 = 1
            goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            if (r4 == 0) goto L_0x00b7
            r8.add(r3)
            goto L_0x00b7
        L_0x00d9:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = " : "
            r7.append(r0)
            java.lang.String r0 = "this"
            java.lang.String r0 = r6.m91233m1(r0)
            r7.append(r0)
            r12 = 0
            r13 = 0
            kotlin.reflect.jvm.internal.impl.renderer.d$f r14 = kotlin.reflect.jvm.internal.impl.renderer.C14567d.C14575f.f63507a
            r15 = 24
            r16 = 0
            java.lang.String r9 = ", "
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            java.lang.String r0 = kotlin.collections.C13566b0.m87432g0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.append(r0)
        L_0x0103:
            boolean r0 = r17.mo73614x0()
            if (r0 == 0) goto L_0x0113
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)
            r6.m91215X1(r0, r7)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.C14567d.m91224d1(kotlin.reflect.jvm.internal.impl.descriptors.l, java.lang.StringBuilder):void");
    }

    /* renamed from: e1 */
    private final void m91225e1(List<? extends C14146w0> list, StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i = 0;
            for (C14146w0 w0Var : list) {
                int i2 = i + 1;
                m91210V0(sb, w0Var, C13918e.RECEIVER);
                C14900e0 type = w0Var.getType();
                C13706o.m87928e(type, "contextReceiver.type");
                sb.append(m91228h1(type));
                if (i == C13614t.m87750l(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i = i2;
            }
        }
    }

    /* renamed from: f1 */
    private final void m91226f1(StringBuilder sb, C14900e0 e0Var) {
        m91212W0(this, sb, e0Var, (C13918e) null, 2, (Object) null);
        C14951m0 m0Var = null;
        C14961p pVar = e0Var instanceof C14961p ? (C14961p) e0Var : null;
        if (pVar != null) {
            m0Var = pVar.mo74226Z0();
        }
        if (C14925g0.m92873a(e0Var)) {
            if (C11170a.m74969r(e0Var) && mo73597l0()) {
                sb.append(((C17085h) e0Var).mo80353W0());
            } else if (!(e0Var instanceof C17085h) || mo73583e0()) {
                sb.append(e0Var.mo73702N0().toString());
            } else {
                sb.append(((C17085h) e0Var).mo80353W0());
            }
            sb.append(mo73562K1(e0Var.mo73700L0()));
        } else if (e0Var instanceof C14980u0) {
            sb.append(((C14980u0) e0Var).mo74142W0().toString());
        } else if (m0Var instanceof C14980u0) {
            sb.append(((C14980u0) m0Var).mo74142W0().toString());
        } else {
            m91193N1(this, sb, e0Var, (C14901e1) null, 2, (Object) null);
        }
        if (e0Var.mo73021O0()) {
            sb.append("?");
        }
        if (C14966q0.m93065c(e0Var)) {
            sb.append(" & Any");
        }
    }

    /* renamed from: g1 */
    private final String m91227g1(String str) {
        int i = C14570b.f63504a[mo73551A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h1 */
    private final String m91228h1(C14900e0 e0Var) {
        String w = mo73532w(e0Var);
        if (!m91220Z1(e0Var) || C14956n1.m92997l(e0Var)) {
            return w;
        }
        return '(' + w + ')';
    }

    /* renamed from: i1 */
    private final String m91229i1(List<C16157f> list) {
        return m91197P(C14594n.m91451c(list));
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public final void m91230j1(C14154y yVar, StringBuilder sb) {
        if (!mo73616z0()) {
            if (!mo73615y0()) {
                m91212W0(this, sb, yVar, (C13918e) null, 2, (Object) null);
                List<C14146w0> x0 = yVar.mo72238x0();
                C13706o.m87928e(x0, "function.contextReceiverParameters");
                m91225e1(x0, sb);
                C14141u visibility = yVar.getVisibility();
                C13706o.m87928e(visibility, "function.visibility");
                m91213W1(visibility, sb);
                m91237r1(yVar, sb);
                if (mo73574a0()) {
                    m91235o1(yVar, sb);
                }
                m91242w1(yVar, sb);
                if (mo73574a0()) {
                    m91206T0(yVar, sb);
                } else {
                    m91182I1(yVar, sb);
                }
                m91234n1(yVar, sb);
                if (mo73556F0()) {
                    if (yVar.mo72317C0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (yVar.mo72320F0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(m91233m1("fun"));
            sb.append(" ");
            List<C13950e1> typeParameters = yVar.getTypeParameters();
            C13706o.m87928e(typeParameters, "function.typeParameters");
            m91201Q1(typeParameters, sb, true);
            m91172D1(yVar, sb);
        }
        m91239t1(yVar, sb, true);
        List<C13966i1> g = yVar.mo72235g();
        C13706o.m87928e(g, "function.valueParameters");
        m91209U1(g, yVar.mo68653g0(), sb);
        m91174E1(yVar, sb);
        C14900e0 returnType = yVar.getReturnType();
        if (!mo73559I0() && (mo73554D0() || returnType == null || !C13853h.m88244B0(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : mo73532w(returnType));
        }
        List<C13950e1> typeParameters2 = yVar.getTypeParameters();
        C13706o.m87928e(typeParameters2, "function.typeParameters");
        m91215X1(typeParameters2, sb);
    }

    /* renamed from: k1 */
    private final void m91231k1(StringBuilder sb, C14900e0 e0Var) {
        C16157f fVar;
        int length = sb.length();
        m91212W0(m91218Z(), sb, e0Var, (C13918e) null, 2, (Object) null);
        boolean z = sb.length() != length;
        C14900e0 j = C13852g.m88231j(e0Var);
        List<C14900e0> e = C13852g.m88226e(e0Var);
        if (!e.isEmpty()) {
            sb.append("context(");
            for (C14900e0 u1 : e.subList(0, C13614t.m87750l(e))) {
                m91240u1(sb, u1);
                sb.append(", ");
            }
            m91240u1(sb, (C14900e0) C13566b0.m87434i0(e));
            sb.append(") ");
        }
        boolean q = C13852g.m88238q(e0Var);
        boolean O0 = e0Var.mo73021O0();
        boolean z2 = O0 || (z && j != null);
        if (z2) {
            if (q) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    boolean unused = C15145b.m93521c(C15182y.m93714W0(sb));
                    if (sb.charAt(C15177w.m93676U(sb) - 1) != ')') {
                        sb.insert(C15177w.m93676U(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m91238s1(sb, q, "suspend");
        if (j != null) {
            boolean z3 = (m91220Z1(j) && !j.mo73021O0()) || m91189M0(j);
            if (z3) {
                sb.append("(");
            }
            m91240u1(sb, j);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!C13852g.m88234m(e0Var) || e0Var.mo73700L0().size() > 1) {
            int i = 0;
            for (C14926g1 next : C13852g.m88233l(e0Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (mo73595k0()) {
                    C14900e0 type = next.getType();
                    C13706o.m87928e(type, "typeProjection.type");
                    fVar = C13852g.m88225d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb.append(mo73531v(fVar, false));
                    sb.append(": ");
                }
                sb.append(mo73533x(next));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(m91191N());
        sb.append(" ");
        m91240u1(sb, C13852g.m88232k(e0Var));
        if (z2) {
            sb.append(")");
        }
        if (O0) {
            sb.append("?");
        }
    }

    /* renamed from: l1 */
    private final void m91232l1(C14048j1 j1Var, StringBuilder sb) {
        C14617g<?> o0;
        if (mo73581d0() && (o0 = j1Var.mo72441o0()) != null) {
            sb.append(" = ");
            sb.append(m91197P(m91223c1(o0)));
        }
    }

    /* renamed from: m1 */
    private final String m91233m1(String str) {
        int i = C14570b.f63504a[mo73551A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (mo73567T()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    /* renamed from: n1 */
    private final void m91234n1(C13936b bVar, StringBuilder sb) {
        if (mo73585f0().contains(C14578e.MEMBER_KIND) && mo73556F0() && bVar.mo72264h() != C13936b.C13937a.DECLARATION) {
            sb.append("/*");
            sb.append(C12187a.m82855f(bVar.mo72264h().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: o1 */
    private final void m91235o1(C13941c0 c0Var, StringBuilder sb) {
        m91238s1(sb, c0Var.isExternal(), "external");
        boolean z = true;
        m91238s1(sb, mo73585f0().contains(C14578e.EXPECT) && c0Var.mo62175l0(), "expect");
        if (!mo73585f0().contains(C14578e.ACTUAL) || !c0Var.mo62160Y()) {
            z = false;
        }
        m91238s1(sb, z, "actual");
    }

    /* renamed from: q1 */
    private final void m91236q1(C13945d0 d0Var, StringBuilder sb, C13945d0 d0Var2) {
        if (mo73609s0() || d0Var != d0Var2) {
            m91238s1(sb, mo73585f0().contains(C14578e.MODALITY), C12187a.m82855f(d0Var.name()));
        }
    }

    /* renamed from: r1 */
    private final void m91237r1(C13936b bVar, StringBuilder sb) {
        if (C14650d.m91610J(bVar) && bVar.mo62179r() == C13945d0.FINAL) {
            return;
        }
        if (mo73591i0() != C14588j.RENDER_OVERRIDE || bVar.mo62179r() != C13945d0.OPEN || !m91200Q0(bVar)) {
            C13945d0 r = bVar.mo62179r();
            C13706o.m87928e(r, "callable.modality");
            m91236q1(r, sb, m91192N0(bVar));
        }
    }

    /* renamed from: s1 */
    private final void m91238s1(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m91233m1(str));
            sb.append(" ");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m91239t1(C14064m mVar, StringBuilder sb, boolean z) {
        C16157f name = mVar.getName();
        C13706o.m87928e(name, "descriptor.name");
        sb.append(mo73531v(name, z));
    }

    /* renamed from: u1 */
    private final void m91240u1(StringBuilder sb, C14900e0 e0Var) {
        C14967q1 Q0 = e0Var.mo74145Q0();
        C14828a aVar = Q0 instanceof C14828a ? (C14828a) Q0 : null;
        if (aVar == null) {
            m91241v1(sb, e0Var);
        } else if (mo73612v0()) {
            m91241v1(sb, aVar.mo74032G());
        } else {
            m91241v1(sb, aVar.mo74034Z0());
            if (mo73613w0()) {
                m91202R0(sb, aVar);
            }
        }
    }

    /* renamed from: v1 */
    private final void m91241v1(StringBuilder sb, C14900e0 e0Var) {
        if (!(e0Var instanceof C14974s1) || !mo73590i() || ((C14974s1) e0Var).mo74188S0()) {
            C14967q1 Q0 = e0Var.mo74145Q0();
            if (Q0 instanceof C14990y) {
                sb.append(((C14990y) Q0).mo72951X0(this, this));
            } else if (Q0 instanceof C14951m0) {
                m91176F1(sb, (C14951m0) Q0);
            }
        } else {
            sb.append("<Not computed yet>");
        }
    }

    /* renamed from: w1 */
    private final void m91242w1(C13936b bVar, StringBuilder sb) {
        if (mo73585f0().contains(C14578e.OVERRIDE) && m91200Q0(bVar) && mo73591i0() != C14588j.RENDER_OPEN) {
            m91238s1(sb, true, "override");
            if (mo73556F0()) {
                sb.append("/*");
                sb.append(bVar.mo72234d().size());
                sb.append("*/ ");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m91243x1(C14050k0 k0Var, StringBuilder sb) {
        m91244y1(k0Var.mo72551e(), "package-fragment", sb);
        if (mo73590i()) {
            sb.append(" in ");
            m91239t1(k0Var.mo62163b(), sb, false);
        }
    }

    /* renamed from: y1 */
    private final void m91244y1(C16152c cVar, String str, StringBuilder sb) {
        sb.append(m91233m1(str));
        C16153d j = cVar.mo78566j();
        C13706o.m87928e(j, "fqName.toUnsafe()");
        String u = mo73530u(j);
        if (u.length() > 0) {
            sb.append(" ");
            sb.append(u);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m91246z1(C14074p0 p0Var, StringBuilder sb) {
        m91244y1(p0Var.mo72519e(), "package", sb);
        if (mo73590i()) {
            sb.append(" in context of ");
            m91239t1(p0Var.mo72515B0(), sb, false);
        }
    }

    /* renamed from: A0 */
    public C14591m mo73551A0() {
        return this.f63500l.mo73662Z();
    }

    /* renamed from: B0 */
    public C16265l<C14900e0, C14900e0> mo73552B0() {
        return this.f63500l.mo73663a0();
    }

    /* renamed from: C0 */
    public boolean mo73553C0() {
        return this.f63500l.mo73664b0();
    }

    /* renamed from: D0 */
    public boolean mo73554D0() {
        return this.f63500l.mo73665c0();
    }

    /* renamed from: E0 */
    public C14552c.C14565l mo73555E0() {
        return this.f63500l.mo73666d0();
    }

    /* renamed from: F0 */
    public boolean mo73556F0() {
        return this.f63500l.mo73667e0();
    }

    /* renamed from: G0 */
    public boolean mo73557G0() {
        return this.f63500l.mo73668f0();
    }

    /* renamed from: H0 */
    public boolean mo73558H0() {
        return this.f63500l.mo73669g0();
    }

    /* renamed from: I0 */
    public boolean mo73559I0() {
        return this.f63500l.mo73670h0();
    }

    /* renamed from: J0 */
    public boolean mo73560J0() {
        return this.f63500l.mo73671i0();
    }

    /* renamed from: K0 */
    public boolean mo73561K0() {
        return this.f63500l.mo73672j0();
    }

    /* renamed from: K1 */
    public String mo73562K1(List<? extends C14926g1> list) {
        C13706o.m87929f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m91198P0());
        m91188M(sb, list);
        sb.append(m91187L0());
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: L1 */
    public String mo73563L1(C14901e1 e1Var) {
        C13706o.m87929f(e1Var, "typeConstructor");
        C13961h c = e1Var.mo62183c();
        boolean z = true;
        if (!(c instanceof C13950e1 ? true : c instanceof C13948e)) {
            z = c instanceof C13947d1;
        }
        if (z) {
            return mo73575a1(c);
        }
        if (c != null) {
            throw new IllegalStateException(("Unexpected classifier: " + c.getClass()).toString());
        } else if (e1Var instanceof C14884d0) {
            return ((C14884d0) e1Var).mo74117h(C14577h.f63508a);
        } else {
            return e1Var.toString();
        }
    }

    /* renamed from: Q */
    public boolean mo73564Q() {
        return this.f63500l.mo73676r();
    }

    /* renamed from: R */
    public boolean mo73565R() {
        return this.f63500l.mo73677s();
    }

    /* renamed from: S */
    public C16265l<C13915c, Boolean> mo73566S() {
        return this.f63500l.mo73678t();
    }

    /* renamed from: T */
    public boolean mo73567T() {
        return this.f63500l.mo73679u();
    }

    /* renamed from: U */
    public boolean mo73568U() {
        return this.f63500l.mo73680v();
    }

    /* renamed from: V */
    public C14548b mo73569V() {
        return this.f63500l.mo73681w();
    }

    /* renamed from: W */
    public C16265l<C13966i1, String> mo73570W() {
        return this.f63500l.mo73682x();
    }

    /* renamed from: X */
    public boolean mo73571X() {
        return this.f63500l.mo73683y();
    }

    /* renamed from: Y */
    public Set<C16152c> mo73572Y() {
        return this.f63500l.mo73684z();
    }

    /* renamed from: a */
    public void mo73573a(boolean z) {
        this.f63500l.mo73573a(z);
    }

    /* renamed from: a0 */
    public boolean mo73574a0() {
        return this.f63500l.mo73637A();
    }

    /* renamed from: a1 */
    public String mo73575a1(C13961h hVar) {
        C13706o.m87929f(hVar, "klass");
        if (C17088k.m100541m(hVar)) {
            return hVar.mo62171j().toString();
        }
        return mo73569V().mo73526a(hVar, this);
    }

    /* renamed from: b */
    public void mo73576b(C14589k kVar) {
        C13706o.m87929f(kVar, "<set-?>");
        this.f63500l.mo73576b(kVar);
    }

    /* renamed from: b0 */
    public boolean mo73577b0() {
        return this.f63500l.mo73638B();
    }

    /* renamed from: c */
    public void mo73578c(boolean z) {
        this.f63500l.mo73578c(z);
    }

    /* renamed from: c0 */
    public boolean mo73579c0() {
        return this.f63500l.mo73639C();
    }

    /* renamed from: d */
    public boolean mo73580d() {
        return this.f63500l.mo73580d();
    }

    /* renamed from: d0 */
    public boolean mo73581d0() {
        return this.f63500l.mo73640D();
    }

    /* renamed from: e */
    public void mo73582e(boolean z) {
        this.f63500l.mo73582e(z);
    }

    /* renamed from: e0 */
    public boolean mo73583e0() {
        return this.f63500l.mo73641E();
    }

    /* renamed from: f */
    public void mo73584f(boolean z) {
        this.f63500l.mo73584f(z);
    }

    /* renamed from: f0 */
    public Set<C14578e> mo73585f0() {
        return this.f63500l.mo73642F();
    }

    /* renamed from: g */
    public void mo73586g(C14591m mVar) {
        C13706o.m87929f(mVar, "<set-?>");
        this.f63500l.mo73586g(mVar);
    }

    /* renamed from: g0 */
    public boolean mo73587g0() {
        return this.f63500l.mo73643G();
    }

    /* renamed from: h */
    public Set<C16152c> mo73588h() {
        return this.f63500l.mo73588h();
    }

    /* renamed from: h0 */
    public final C14582g mo73589h0() {
        return this.f63500l;
    }

    /* renamed from: i */
    public boolean mo73590i() {
        return this.f63500l.mo73590i();
    }

    /* renamed from: i0 */
    public C14588j mo73591i0() {
        return this.f63500l.mo73644H();
    }

    /* renamed from: j */
    public C14547a mo73592j() {
        return this.f63500l.mo73592j();
    }

    /* renamed from: j0 */
    public C14589k mo73593j0() {
        return this.f63500l.mo73645I();
    }

    /* renamed from: k */
    public void mo73594k(Set<C16152c> set) {
        C13706o.m87929f(set, "<set-?>");
        this.f63500l.mo73594k(set);
    }

    /* renamed from: k0 */
    public boolean mo73595k0() {
        return this.f63500l.mo73646J();
    }

    /* renamed from: l */
    public void mo73596l(Set<? extends C14578e> set) {
        C13706o.m87929f(set, "<set-?>");
        this.f63500l.mo73596l(set);
    }

    /* renamed from: l0 */
    public boolean mo73597l0() {
        return this.f63500l.mo73647K();
    }

    /* renamed from: m */
    public void mo73598m(C14548b bVar) {
        C13706o.m87929f(bVar, "<set-?>");
        this.f63500l.mo73598m(bVar);
    }

    /* renamed from: m0 */
    public C14590l mo73599m0() {
        return this.f63500l.mo73648L();
    }

    /* renamed from: n */
    public void mo73600n(boolean z) {
        this.f63500l.mo73600n(z);
    }

    /* renamed from: n0 */
    public boolean mo73601n0() {
        return this.f63500l.mo73649M();
    }

    /* renamed from: o */
    public void mo73602o(boolean z) {
        this.f63500l.mo73602o(z);
    }

    /* renamed from: o0 */
    public boolean mo73603o0() {
        return this.f63500l.mo73650N();
    }

    /* renamed from: p */
    public void mo73604p(boolean z) {
        this.f63500l.mo73604p(z);
    }

    /* renamed from: p0 */
    public boolean mo73605p0() {
        return this.f63500l.mo73651O();
    }

    /* renamed from: p1 */
    public String mo73606p1(String str) {
        C13706o.m87929f(str, "message");
        int i = C14570b.f63504a[mo73551A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<i>" + str + "</i>";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: q */
    public String mo73527q(C14064m mVar) {
        C13706o.m87929f(mVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        mVar.mo72277x(new C14568a(), sb);
        if (mo73557G0()) {
            m91186L(sb, mVar);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: q0 */
    public boolean mo73607q0() {
        return this.f63500l.mo73652P();
    }

    /* renamed from: r */
    public String mo73528r(C13915c cVar, C13918e eVar) {
        C13706o.m87929f(cVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.mo72245d() + ':');
        }
        C14900e0 type = cVar.getType();
        sb.append(mo73532w(type));
        if (mo73577b0()) {
            List<String> U0 = m91208U0(cVar);
            if (mo73579c0() || (!U0.isEmpty())) {
                Appendable unused = C13566b0.m87430e0(U0, sb, ", ", "(", ")", 0, (CharSequence) null, (C16265l) null, 112, (Object) null);
            }
        }
        if (mo73556F0() && (C14925g0.m92873a(type) || (type.mo73702N0().mo62183c() instanceof C14043j0.C14045b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r0 */
    public boolean mo73608r0() {
        return this.f63500l.mo73653Q();
    }

    /* renamed from: s0 */
    public boolean mo73609s0() {
        return this.f63500l.mo73654R();
    }

    /* renamed from: t */
    public String mo73529t(String str, String str2, C13853h hVar) {
        String str3 = str;
        String str4 = str2;
        C13706o.m87929f(str3, "lowerRendered");
        C13706o.m87929f(str4, "upperRendered");
        C13706o.m87929f(hVar, "builtIns");
        if (!m91194O(str, str2)) {
            C14548b V = mo73569V();
            C13948e w = hVar.mo72148w();
            C13706o.m87928e(w, "builtIns.collection");
            String O0 = C15177w.m93666O0(V.mo73526a(w, this), "Collection", (String) null, 2, (Object) null);
            String Y1 = m91217Y1(str, O0 + "Mutable", str2, O0, O0 + '(' + "Mutable" + ')');
            if (Y1 != null) {
                return Y1;
            }
            String Y12 = m91217Y1(str, O0 + "MutableMap.MutableEntry", str2, O0 + "Map.Entry", O0 + "(Mutable)Map.(Mutable)Entry");
            if (Y12 != null) {
                return Y12;
            }
            C14548b V2 = mo73569V();
            C13948e j = hVar.mo72137j();
            C13706o.m87928e(j, "builtIns.array");
            String O02 = C15177w.m93666O0(V2.mo73526a(j, this), "Array", (String) null, 2, (Object) null);
            String Y13 = m91217Y1(str, O02 + m91197P("Array<"), str2, O02 + m91197P("Array<out "), O02 + m91197P("Array<(out) "));
            if (Y13 != null) {
                return Y13;
            }
            return '(' + str3 + ".." + str4 + ')';
        } else if (C15176v.m93634I(str4, "(", false, 2, (Object) null)) {
            return '(' + str3 + ")!";
        } else {
            return str3 + '!';
        }
    }

    /* renamed from: t0 */
    public boolean mo73610t0() {
        return this.f63500l.mo73655S();
    }

    /* renamed from: u */
    public String mo73530u(C16153d dVar) {
        C13706o.m87929f(dVar, "fqName");
        List<C16157f> h = dVar.mo78574h();
        C13706o.m87928e(h, "fqName.pathSegments()");
        return m91229i1(h);
    }

    /* renamed from: u0 */
    public boolean mo73611u0() {
        return this.f63500l.mo73656T();
    }

    /* renamed from: v */
    public String mo73531v(C16157f fVar, boolean z) {
        C13706o.m87929f(fVar, "name");
        String P = m91197P(C14594n.m91450b(fVar));
        if (!mo73567T() || mo73551A0() != C14591m.f63596c || !z) {
            return P;
        }
        return "<b>" + P + "</b>";
    }

    /* renamed from: v0 */
    public boolean mo73612v0() {
        return this.f63500l.mo73657U();
    }

    /* renamed from: w */
    public String mo73532w(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
        StringBuilder sb = new StringBuilder();
        m91240u1(sb, mo73552B0().invoke(e0Var));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: w0 */
    public boolean mo73613w0() {
        return this.f63500l.mo73658V();
    }

    /* renamed from: x */
    public String mo73533x(C14926g1 g1Var) {
        C13706o.m87929f(g1Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        m91188M(sb, C13612s.m87736e(g1Var));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: x0 */
    public boolean mo73614x0() {
        return this.f63500l.mo73659W();
    }

    /* renamed from: y0 */
    public boolean mo73615y0() {
        return this.f63500l.mo73660X();
    }

    /* renamed from: z0 */
    public boolean mo73616z0() {
        return this.f63500l.mo73661Y();
    }
}
