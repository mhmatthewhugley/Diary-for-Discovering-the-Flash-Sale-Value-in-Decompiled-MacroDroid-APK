package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14911f1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p225cc.C11170a;
import p297ja.C13321g;
import p297ja.C13328m;
import p297ja.C13337s;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C16986f;
import p442yb.C17004g;
import p450zb.C17085h;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g */
/* compiled from: TypeParameterUpperBoundEraser.kt */
public final class C14319g {

    /* renamed from: a */
    private final C16986f f63093a;

    /* renamed from: b */
    private final C13321g f63094b;

    /* renamed from: c */
    private final C14313e f63095c;

    /* renamed from: d */
    private final C17004g<C14320a, C14900e0> f63096d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g$a */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    private static final class C14320a {

        /* renamed from: a */
        private final C13950e1 f63097a;

        /* renamed from: b */
        private final boolean f63098b;

        /* renamed from: c */
        private final C14308a f63099c;

        public C14320a(C13950e1 e1Var, boolean z, C14308a aVar) {
            C13706o.m87929f(e1Var, "typeParameter");
            C13706o.m87929f(aVar, "typeAttr");
            this.f63097a = e1Var;
            this.f63098b = z;
            this.f63099c = aVar;
        }

        /* renamed from: a */
        public final C14308a mo72958a() {
            return this.f63099c;
        }

        /* renamed from: b */
        public final C13950e1 mo72959b() {
            return this.f63097a;
        }

        /* renamed from: c */
        public final boolean mo72960c() {
            return this.f63098b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14320a)) {
                return false;
            }
            C14320a aVar = (C14320a) obj;
            if (C13706o.m87924a(aVar.f63097a, this.f63097a) && aVar.f63098b == this.f63098b && aVar.f63099c.mo72928d() == this.f63099c.mo72928d() && aVar.f63099c.mo72929e() == this.f63099c.mo72929e() && aVar.f63099c.mo72932g() == this.f63099c.mo72932g() && C13706o.m87924a(aVar.f63099c.mo72927c(), this.f63099c.mo72927c())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f63097a.hashCode();
            int i = hashCode + (hashCode * 31) + (this.f63098b ? 1 : 0);
            int hashCode2 = i + (i * 31) + this.f63099c.mo72928d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f63099c.mo72929e().hashCode();
            int i2 = hashCode3 + (hashCode3 * 31) + (this.f63099c.mo72932g() ? 1 : 0);
            int i3 = i2 * 31;
            C14951m0 c = this.f63099c.mo72927c();
            return i2 + i3 + (c != null ? c.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f63097a + ", isRaw=" + this.f63098b + ", typeAttr=" + this.f63099c + ')';
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g$b */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    static final class C14321b extends C13708q implements C16254a<C17085h> {
        final /* synthetic */ C14319g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14321b(C14319g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final C17085h invoke() {
            return C17088k.m100540d(C17087j.CANNOT_COMPUTE_ERASED_BOUND, this.this$0.toString());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g$c */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    static final class C14322c extends C13708q implements C16265l<C14320a, C14900e0> {
        final /* synthetic */ C14319g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14322c(C14319g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C14320a aVar) {
            return this.this$0.m90229d(aVar.mo72959b(), aVar.mo72960c(), aVar.mo72958a());
        }
    }

    public C14319g(C14313e eVar) {
        C16986f fVar = new C16986f("Type parameter upper bound erasion results");
        this.f63093a = fVar;
        this.f63094b = C13323i.m85669b(new C14321b(this));
        this.f63095c = eVar == null ? new C14313e(this) : eVar;
        C17004g<C14320a, C14900e0> h = fVar.mo80223h(new C14322c(this));
        C13706o.m87928e(h, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f63096d = h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = p225cc.C11170a.m74974w(r1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.types.C14900e0 m90228b(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14308a r1) {
        /*
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r1.mo72927c()
            if (r1 == 0) goto L_0x000c
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = p225cc.C11170a.m74974w(r1)
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            zb.h r1 = r0.m90230e()
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14319g.m90228b(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a):kotlin.reflect.jvm.internal.impl.types.e0");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C14900e0 m90229d(C13950e1 e1Var, boolean z, C14308a aVar) {
        C14926g1 g1Var;
        C14308a aVar2;
        Set<C13950e1> f = aVar.mo72931f();
        if (f != null && f.contains(e1Var.mo72233a())) {
            return m90228b(aVar);
        }
        C14951m0 p = e1Var.mo72274p();
        C13706o.m87928e(p, "typeParameter.defaultType");
        Set<C13950e1> f2 = C11170a.m74957f(p, f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(f2, 10)), 16));
        for (C13950e1 e1Var2 : f2) {
            if (f == null || !f.contains(e1Var2)) {
                C14313e eVar = this.f63095c;
                if (z) {
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar.mo72935i(C14309b.INFLEXIBLE);
                }
                C14900e0 c = mo72957c(e1Var2, z, aVar.mo72936j(e1Var));
                C13706o.m87928e(c, "getErasedUpperBound(it, …Parameter(typeParameter))");
                g1Var = eVar.mo72943j(e1Var2, aVar2, c);
            } else {
                g1Var = C14312d.m90200b(e1Var2, aVar);
            }
            C13328m a = C13337s.m85692a(e1Var2.mo62171j(), g1Var);
            linkedHashMap.put(a.mo70154c(), a.mo70155d());
        }
        C14945l1 g = C14945l1.m92939g(C14911f1.C14912a.m92833e(C14911f1.f64041c, linkedHashMap, false, 2, (Object) null));
        C13706o.m87928e(g, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<C14900e0> upperBounds = e1Var.getUpperBounds();
        C13706o.m87928e(upperBounds, "typeParameter.upperBounds");
        C14900e0 e0Var = (C14900e0) C13566b0.m87422W(upperBounds);
        if (e0Var.mo73702N0().mo62183c() instanceof C13948e) {
            C13706o.m87928e(e0Var, "firstUpperBound");
            return C11170a.m74973v(e0Var, g, linkedHashMap, C14970r1.OUT_VARIANCE, aVar.mo72931f());
        }
        Set<C13950e1> f3 = aVar.mo72931f();
        if (f3 == null) {
            f3 = C13625y0.m87800c(this);
        }
        C13961h c2 = e0Var.mo73702N0().mo62183c();
        C13706o.m87927d(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            C13950e1 e1Var3 = (C13950e1) c2;
            if (f3.contains(e1Var3)) {
                return m90228b(aVar);
            }
            List<C14900e0> upperBounds2 = e1Var3.getUpperBounds();
            C13706o.m87928e(upperBounds2, "current.upperBounds");
            C14900e0 e0Var2 = (C14900e0) C13566b0.m87422W(upperBounds2);
            if (e0Var2.mo73702N0().mo62183c() instanceof C13948e) {
                C13706o.m87928e(e0Var2, "nextUpperBound");
                return C11170a.m74973v(e0Var2, g, linkedHashMap, C14970r1.OUT_VARIANCE, aVar.mo72931f());
            }
            c2 = e0Var2.mo73702N0().mo62183c();
            C13706o.m87927d(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: e */
    private final C17085h m90230e() {
        return (C17085h) this.f63094b.getValue();
    }

    /* renamed from: c */
    public final C14900e0 mo72957c(C13950e1 e1Var, boolean z, C14308a aVar) {
        C13706o.m87929f(e1Var, "typeParameter");
        C13706o.m87929f(aVar, "typeAttr");
        return this.f63096d.invoke(new C14320a(e1Var, z, aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14319g(C14313e eVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : eVar);
    }
}
