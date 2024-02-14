package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13707p;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p297ja.C13321g;
import p297ja.C13326k;
import p297ja.C13327l;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16877f;
import p433xa.C16887m;
import p433xa.C16890p;
import p441ya.C16977a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00048VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)²\u0006\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\nX\u0002"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/x;", "Lkotlin/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/impl/types/e0;", "type", "Lxa/f;", "i", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Lkotlin/reflect/jvm/internal/impl/types/e0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/c0$a;", "Ljava/lang/reflect/Type;", "c", "Lkotlin/reflect/jvm/internal/c0$a;", "getComputeJavaType$annotations", "()V", "computeJavaType", "d", "()Lxa/f;", "classifier", "", "Lxa/p;", "f", "getArguments", "()Ljava/util/List;", "arguments", "b", "()Ljava/lang/reflect/Type;", "javaType", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lqa/a;)V", "parameterizedTypeArguments", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.x */
/* compiled from: KTypeImpl.kt */
public final class C15097x implements C13707p {

    /* renamed from: g */
    static final /* synthetic */ C16887m<Object>[] f64281g;

    /* renamed from: a */
    private final C14900e0 f64282a;

    /* renamed from: c */
    private final C13724c0.C13725a<Type> f64283c;

    /* renamed from: d */
    private final C13724c0.C13725a f64284d;

    /* renamed from: f */
    private final C13724c0.C13725a f64285f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "Lxa/p;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.x$a */
    /* compiled from: KTypeImpl.kt */
    static final class C15098a extends C13708q implements C16254a<List<? extends C16890p>> {
        final /* synthetic */ C16254a<Type> $computeJavaType;
        final /* synthetic */ C15097x this$0;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.x$a$a */
        /* compiled from: KTypeImpl.kt */
        static final class C15099a extends C13708q implements C16254a<Type> {

            /* renamed from: $i */
            final /* synthetic */ int f64286$i;
            final /* synthetic */ C13321g<List<Type>> $parameterizedTypeArguments$delegate;
            final /* synthetic */ C15097x this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15099a(C15097x xVar, int i, C13321g<? extends List<? extends Type>> gVar) {
                super(0);
                this.this$0 = xVar;
                this.f64286$i = i;
                this.$parameterizedTypeArguments$delegate = gVar;
            }

            /* renamed from: a */
            public final Type invoke() {
                Type b = this.this$0.mo71961b();
                if (b instanceof Class) {
                    Class cls = (Class) b;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    C13706o.m87928e(componentType, "{\n                      …                        }");
                    return componentType;
                } else if (b instanceof GenericArrayType) {
                    if (this.f64286$i == 0) {
                        Type genericComponentType = ((GenericArrayType) b).getGenericComponentType();
                        C13706o.m87928e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new C13719a0("Array type has been queried for a non-0th argument: " + this.this$0);
                } else if (b instanceof ParameterizedType) {
                    Type type = (Type) C15098a.m93402c(this.$parameterizedTypeArguments$delegate).get(this.f64286$i);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        C13706o.m87928e(lowerBounds, "argument.lowerBounds");
                        Type type2 = (Type) C13596m.m87578C(lowerBounds);
                        if (type2 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            C13706o.m87928e(upperBounds, "argument.upperBounds");
                            type = (Type) C13596m.m87577B(upperBounds);
                        } else {
                            type = type2;
                        }
                    }
                    C13706o.m87928e(type, "{\n                      …                        }");
                    return type;
                } else {
                    throw new C13719a0("Non-generic type has been queried for arguments: " + this.this$0);
                }
            }
        }

        @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.x$a$b */
        /* compiled from: KTypeImpl.kt */
        public /* synthetic */ class C15100b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f64287a;

            static {
                int[] iArr = new int[C14970r1.values().length];
                iArr[C14970r1.INVARIANT.ordinal()] = 1;
                iArr[C14970r1.IN_VARIANCE.ordinal()] = 2;
                iArr[C14970r1.OUT_VARIANCE.ordinal()] = 3;
                f64287a = iArr;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.x$a$c */
        /* compiled from: KTypeImpl.kt */
        static final class C15101c extends C13708q implements C16254a<List<? extends Type>> {
            final /* synthetic */ C15097x this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15101c(C15097x xVar) {
                super(0);
                this.this$0 = xVar;
            }

            /* renamed from: a */
            public final List<Type> invoke() {
                Type b = this.this$0.mo71961b();
                C13706o.m87926c(b);
                return C14088d.m89400d(b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15098a(C15097x xVar, C16254a<? extends Type> aVar) {
            super(0);
            this.this$0 = xVar;
            this.$computeJavaType = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List<Type> m93402c(C13321g<? extends List<? extends Type>> gVar) {
            return (List) gVar.getValue();
        }

        /* renamed from: b */
        public final List<C16890p> invoke() {
            C16890p pVar;
            List<C14926g1> L0 = this.this$0.mo74393l().mo73700L0();
            if (L0.isEmpty()) {
                return C13614t.m87748j();
            }
            C13321g a = C13323i.m85668a(C13326k.PUBLICATION, new C15101c(this.this$0));
            C16254a<Type> aVar = this.$computeJavaType;
            C15097x xVar = this.this$0;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(L0, 10));
            int i = 0;
            for (T next : L0) {
                int i2 = i + 1;
                if (i < 0) {
                    C13614t.m87758t();
                }
                C14926g1 g1Var = (C14926g1) next;
                if (g1Var.mo74184b()) {
                    pVar = C16890p.f68129c.mo80050c();
                } else {
                    C14900e0 type = g1Var.getType();
                    C13706o.m87928e(type, "typeProjection.type");
                    C15097x xVar2 = new C15097x(type, aVar == null ? null : new C15099a(xVar, i, a));
                    int i3 = C15100b.f64287a[g1Var.mo74185c().ordinal()];
                    if (i3 == 1) {
                        pVar = C16890p.f68129c.mo80051d(xVar2);
                    } else if (i3 == 2) {
                        pVar = C16890p.f68129c.mo80048a(xVar2);
                    } else if (i3 == 3) {
                        pVar = C16890p.f68129c.mo80049b(xVar2);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(pVar);
                i = i2;
            }
            return arrayList;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lxa/f;", "a", "()Lxa/f;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.x$b */
    /* compiled from: KTypeImpl.kt */
    static final class C15102b extends C13708q implements C16254a<C16877f> {
        final /* synthetic */ C15097x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15102b(C15097x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* renamed from: a */
        public final C16877f invoke() {
            C15097x xVar = this.this$0;
            return xVar.m93397i(xVar.mo74393l());
        }
    }

    static {
        Class<C15097x> cls = C15097x.class;
        f64281g = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C15097x(C14900e0 e0Var, C16254a<? extends Type> aVar) {
        C13706o.m87929f(e0Var, "type");
        this.f64282a = e0Var;
        C13724c0.C13725a<Type> aVar2 = null;
        C13724c0.C13725a<Type> aVar3 = aVar instanceof C13724c0.C13725a ? aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = C13724c0.m87973d(aVar);
        }
        this.f64283c = aVar2;
        this.f64284d = C13724c0.m87973d(new C15102b(this));
        this.f64285f = C13724c0.m87973d(new C15098a(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C16877f m93397i(C14900e0 e0Var) {
        C14900e0 type;
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c instanceof C13948e) {
            Class<?> o = C13841i0.m88210o((C13948e) c);
            if (o == null) {
                return null;
            }
            if (o.isArray()) {
                C14926g1 g1Var = (C14926g1) C13566b0.m87448w0(e0Var.mo73700L0());
                if (g1Var == null || (type = g1Var.getType()) == null) {
                    return new C13806h(o);
                }
                C16877f i = m93397i(type);
                if (i != null) {
                    return new C13806h(C13841i0.m88200e(C16147a.m96968b(C16977a.m100215a(i))));
                }
                throw new C13719a0("Cannot determine classifier for array element type: " + this);
            } else if (C14956n1.m92997l(e0Var)) {
                return new C13806h(o);
            } else {
                Class<?> e = C14088d.m89401e(o);
                if (e != null) {
                    o = e;
                }
                return new C13806h(o);
            }
        } else if (c instanceof C13950e1) {
            return new C15103y((C15106z) null, (C13950e1) c);
        } else {
            if (!(c instanceof C13947d1)) {
                return null;
            }
            throw new C13327l("An operation is not implemented: " + "Type alias classifiers are not yet supported");
        }
    }

    /* renamed from: b */
    public Type mo71961b() {
        C13724c0.C13725a<Type> aVar = this.f64283c;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    /* renamed from: c */
    public C16877f mo74389c() {
        return (C16877f) this.f64284d.mo71982b(this, f64281g[0]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15097x) && C13706o.m87924a(this.f64282a, ((C15097x) obj).f64282a);
    }

    public List<C16890p> getArguments() {
        Object b = this.f64285f.mo71982b(this, f64281g[1]);
        C13706o.m87928e(b, "<get-arguments>(...)");
        return (List) b;
    }

    public int hashCode() {
        return this.f64282a.hashCode();
    }

    /* renamed from: l */
    public final C14900e0 mo74393l() {
        return this.f64282a;
    }

    public String toString() {
        return C13788e0.f62008a.mo72030h(this.f64282a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15097x(C14900e0 e0Var, C16254a aVar, int i, C13695i iVar) {
        this(e0Var, (i & 2) != 0 ? null : aVar);
    }
}
