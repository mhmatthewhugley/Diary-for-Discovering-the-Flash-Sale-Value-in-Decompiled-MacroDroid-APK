package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13700k0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14445k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14751g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p242db.C11995f;
import p297ja.C13339u;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16875d;
import p433xa.C16887m;
import p433xa.C16888n;
import p433xa.C16889o;
import p433xa.C16893q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004*\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0006H\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/y;", "Lxa/o;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Lkotlin/reflect/jvm/internal/h;", "c", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/g;", "Ljava/lang/Class;", "a", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/impl/descriptors/e1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e1;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "descriptor", "", "Lxa/n;", "Lkotlin/reflect/jvm/internal/c0$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lkotlin/reflect/jvm/internal/z;", "d", "Lkotlin/reflect/jvm/internal/z;", "container", "getName", "()Ljava/lang/String;", "name", "Lxa/q;", "l", "()Lxa/q;", "variance", "<init>", "(Lkotlin/reflect/jvm/internal/z;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.y */
/* compiled from: KTypeParameterImpl.kt */
public final class C15103y implements C16889o {

    /* renamed from: f */
    static final /* synthetic */ C16887m<Object>[] f64288f = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C15103y.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a */
    private final C13950e1 f64289a;

    /* renamed from: c */
    private final C13724c0.C13725a f64290c = C13724c0.m87973d(new C15105b(this));

    /* renamed from: d */
    private final C15106z f64291d;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.y$a */
    /* compiled from: KTypeParameterImpl.kt */
    public /* synthetic */ class C15104a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64292a;

        static {
            int[] iArr = new int[C14970r1.values().length];
            iArr[C14970r1.INVARIANT.ordinal()] = 1;
            iArr[C14970r1.IN_VARIANCE.ordinal()] = 2;
            iArr[C14970r1.OUT_VARIANCE.ordinal()] = 3;
            f64292a = iArr;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "Lkotlin/reflect/jvm/internal/x;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.y$b */
    /* compiled from: KTypeParameterImpl.kt */
    static final class C15105b extends C13708q implements C16254a<List<? extends C15097x>> {
        final /* synthetic */ C15103y this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15105b(C15103y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* renamed from: a */
        public final List<C15097x> invoke() {
            List<C14900e0> upperBounds = this.this$0.mo74399b().getUpperBounds();
            C13706o.m87928e(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(upperBounds, 10));
            for (C14900e0 xVar : upperBounds) {
                arrayList.add(new C15097x(xVar, (C16254a) null, 2, (C13695i) null));
            }
            return arrayList;
        }
    }

    public C15103y(C15106z zVar, C13950e1 e1Var) {
        Object obj;
        C13806h<?> hVar;
        C13706o.m87929f(e1Var, "descriptor");
        this.f64289a = e1Var;
        if (zVar == null) {
            C14064m b = mo74399b().mo62163b();
            C13706o.m87928e(b, "descriptor.containingDeclaration");
            if (b instanceof C13948e) {
                obj = m93408c((C13948e) b);
            } else if (b instanceof C13936b) {
                C14064m b2 = ((C13936b) b).mo62163b();
                C13706o.m87928e(b2, "declaration.containingDeclaration");
                if (b2 instanceof C13948e) {
                    hVar = m93408c((C13948e) b2);
                } else {
                    C14751g gVar = b instanceof C14751g ? (C14751g) b : null;
                    if (gVar != null) {
                        C16875d<?> e = C16147a.m96971e(m93407a(gVar));
                        C13706o.m87927d(e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        hVar = (C13806h) e;
                    } else {
                        throw new C13719a0("Non-class callable descriptor must be deserialized: " + b);
                    }
                }
                obj = b.mo72277x(new C13718a(hVar), C13339u.f61331a);
            } else {
                throw new C13719a0("Unknown type parameter container: " + b);
            }
            C13706o.m87928e(obj, "when (val declaration = … $declaration\")\n        }");
            zVar = (C15106z) obj;
        }
        this.f64291d = zVar;
    }

    /* renamed from: a */
    private final Class<?> m93407a(C14751g gVar) {
        Class<?> e;
        C14750f J = gVar.mo73858J();
        Object obj = null;
        if (!(J instanceof C14445k)) {
            J = null;
        }
        C14445k kVar = (C14445k) J;
        Object g = kVar != null ? kVar.mo73174g() : null;
        if (g instanceof C11995f) {
            obj = g;
        }
        C11995f fVar = (C11995f) obj;
        if (fVar != null && (e = fVar.mo67430e()) != null) {
            return e;
        }
        throw new C13719a0("Container of deserialized member is not resolved: " + gVar);
    }

    /* renamed from: c */
    private final C13806h<?> m93408c(C13948e eVar) {
        Class<?> o = C13841i0.m88210o(eVar);
        C13806h<?> hVar = (C13806h) (o != null ? C16147a.m96971e(o) : null);
        if (hVar != null) {
            return hVar;
        }
        throw new C13719a0("Type parameter container is not resolved: " + eVar.mo62163b());
    }

    /* renamed from: b */
    public C13950e1 mo74399b() {
        return this.f64289a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15103y) {
            C15103y yVar = (C15103y) obj;
            return C13706o.m87924a(this.f64291d, yVar.f64291d) && C13706o.m87924a(getName(), yVar.getName());
        }
    }

    public String getName() {
        String d = mo74399b().getName().mo78583d();
        C13706o.m87928e(d, "descriptor.name.asString()");
        return d;
    }

    public List<C16888n> getUpperBounds() {
        Object b = this.f64290c.mo71982b(this, f64288f[0]);
        C13706o.m87928e(b, "<get-upperBounds>(...)");
        return (List) b;
    }

    public int hashCode() {
        return (this.f64291d.hashCode() * 31) + getName().hashCode();
    }

    /* renamed from: l */
    public C16893q mo74404l() {
        int i = C15104a.f64292a[mo74399b().mo72273l().ordinal()];
        if (i == 1) {
            return C16893q.INVARIANT;
        }
        if (i == 2) {
            return C16893q.IN;
        }
        if (i == 3) {
            return C16893q.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return C13700k0.f61932a.mo71953a(this);
    }
}
