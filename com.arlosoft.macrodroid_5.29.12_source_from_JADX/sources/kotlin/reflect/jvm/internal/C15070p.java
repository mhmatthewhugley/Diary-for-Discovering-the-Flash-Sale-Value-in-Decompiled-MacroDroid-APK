package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14076q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;
import p370qa.C16254a;
import p389sb.C16519a;
import p433xa.C16881j;
import p433xa.C16887m;
import p433xa.C16888n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001501¢\u0006\u0004\b3\u00104J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010.¨\u00065"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/p;", "Lxa/j;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/f;", "a", "Lkotlin/reflect/jvm/internal/f;", "i", "()Lkotlin/reflect/jvm/internal/f;", "callable", "c", "I", "m", "()I", "index", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "f", "Lkotlin/reflect/jvm/internal/c0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "g", "getAnnotations", "()Ljava/util/List;", "annotations", "Lxa/j$a;", "kind", "Lxa/j$a;", "h", "()Lxa/j$a;", "getName", "()Ljava/lang/String;", "name", "Lxa/n;", "getType", "()Lxa/n;", "type", "k", "()Z", "isOptional", "isVararg", "Lkotlin/Function0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/f;ILxa/j$a;Lqa/a;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.p */
/* compiled from: KParameterImpl.kt */
public final class C15070p implements C16881j {

    /* renamed from: o */
    static final /* synthetic */ C16887m<Object>[] f64252o;

    /* renamed from: a */
    private final C13792f<?> f64253a;

    /* renamed from: c */
    private final int f64254c;

    /* renamed from: d */
    private final C16881j.C16882a f64255d;

    /* renamed from: f */
    private final C13724c0.C13725a f64256f;

    /* renamed from: g */
    private final C13724c0.C13725a f64257g = C13724c0.m87973d(new C15071a(this));

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.p$a */
    /* compiled from: KParameterImpl.kt */
    static final class C15071a extends C13708q implements C16254a<List<? extends Annotation>> {
        final /* synthetic */ C15070p this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15071a(C15070p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* renamed from: a */
        public final List<Annotation> invoke() {
            return C13841i0.m88199d(this.this$0.m93330l());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.p$b */
    /* compiled from: KParameterImpl.kt */
    static final class C15072b extends C13708q implements C16254a<Type> {
        final /* synthetic */ C15070p this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15072b(C15070p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* renamed from: a */
        public final Type invoke() {
            C14076q0 e = this.this$0.m93330l();
            if (!(e instanceof C14146w0) || !C13706o.m87924a(C13841i0.m88203h(this.this$0.mo74346i().mo72037v()), e) || this.this$0.mo74346i().mo72037v().mo72264h() != C13936b.C13937a.FAKE_OVERRIDE) {
                return this.this$0.mo74346i().mo72034s().mo71984a().get(this.this$0.mo74348m());
            }
            C14064m b = this.this$0.mo74346i().mo72037v().mo62163b();
            C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> o = C13841i0.m88210o((C13948e) b);
            if (o != null) {
                return o;
            }
            throw new C13719a0("Cannot determine receiver Java type of inherited declaration: " + e);
        }
    }

    static {
        Class<C15070p> cls = C15070p.class;
        f64252o = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C15070p(C13792f<?> fVar, int i, C16881j.C16882a aVar, C16254a<? extends C14076q0> aVar2) {
        C13706o.m87929f(fVar, "callable");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(aVar2, "computeDescriptor");
        this.f64253a = fVar;
        this.f64254c = i;
        this.f64255d = aVar;
        this.f64256f = C13724c0.m87973d(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final C14076q0 m93330l() {
        Object b = this.f64256f.mo71982b(this, f64252o[0]);
        C13706o.m87928e(b, "<get-descriptor>(...)");
        return (C14076q0) b;
    }

    /* renamed from: a */
    public boolean mo74340a() {
        C14076q0 l = m93330l();
        return (l instanceof C13966i1) && ((C13966i1) l).mo72306v0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15070p) {
            C15070p pVar = (C15070p) obj;
            return C13706o.m87924a(this.f64253a, pVar.f64253a) && mo74348m() == pVar.mo74348m();
        }
    }

    public String getName() {
        C14076q0 l = m93330l();
        C13966i1 i1Var = l instanceof C13966i1 ? (C13966i1) l : null;
        if (i1Var == null || i1Var.mo62163b().mo68653g0()) {
            return null;
        }
        C16157f name = i1Var.getName();
        C13706o.m87928e(name, "valueParameter.name");
        if (name.mo78588j()) {
            return null;
        }
        return name.mo78583d();
    }

    public C16888n getType() {
        C14900e0 type = m93330l().getType();
        C13706o.m87928e(type, "descriptor.type");
        return new C15097x(type, new C15072b(this));
    }

    /* renamed from: h */
    public C16881j.C16882a mo74344h() {
        return this.f64255d;
    }

    public int hashCode() {
        return (this.f64253a.hashCode() * 31) + Integer.valueOf(mo74348m()).hashCode();
    }

    /* renamed from: i */
    public final C13792f<?> mo74346i() {
        return this.f64253a;
    }

    /* renamed from: k */
    public boolean mo74347k() {
        C14076q0 l = m93330l();
        C13966i1 i1Var = l instanceof C13966i1 ? (C13966i1) l : null;
        if (i1Var != null) {
            return C16519a.m98608a(i1Var);
        }
        return false;
    }

    /* renamed from: m */
    public int mo74348m() {
        return this.f64254c;
    }

    public String toString() {
        return C13788e0.f62008a.mo72028f(this);
    }
}
