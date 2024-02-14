package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13773d;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.load.java.C14409z;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14445k;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14775j;
import p308kb.C13455c;
import p308kb.C13494n;
import p327mb.C15719c;
import p327mb.C15722e;
import p327mb.C15724g;
import p336nb.C15766a;
import p349ob.C15831d;
import p349ob.C15841i;
import p362pb.C16158g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lkotlin/reflect/jvm/internal/e$a;", "Lkotlin/reflect/jvm/internal/e$b;", "Lkotlin/reflect/jvm/internal/e$c;", "Lkotlin/reflect/jvm/internal/e$d;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.e */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C13783e {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e$a;", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13784a extends C13783e {

        /* renamed from: a */
        private final Field f61997a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13784a(Field field) {
            super((C13695i) null);
            C13706o.m87929f(field, "field");
            this.f61997a = field;
        }

        /* renamed from: a */
        public String mo72015a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f61997a.getName();
            C13706o.m87928e(name, "field.name");
            sb.append(C14409z.m90470b(name));
            sb.append("()");
            Class<?> type = this.f61997a.getType();
            C13706o.m87928e(type, "field.type");
            sb.append(C14088d.m89398b(type));
            return sb.toString();
        }

        /* renamed from: b */
        public final Field mo72016b() {
            return this.f61997a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e$b;", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "getterMethod", "c", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13785b extends C13783e {

        /* renamed from: a */
        private final Method f61998a;

        /* renamed from: b */
        private final Method f61999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13785b(Method method, Method method2) {
            super((C13695i) null);
            C13706o.m87929f(method, "getterMethod");
            this.f61998a = method;
            this.f61999b = method2;
        }

        /* renamed from: a */
        public String mo72015a() {
            return C13804g0.m88112b(this.f61998a);
        }

        /* renamed from: b */
        public final Method mo72017b() {
            return this.f61998a;
        }

        /* renamed from: c */
        public final Method mo72018c() {
            return this.f61999b;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e$c;", "Lkotlin/reflect/jvm/internal/e;", "", "c", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "f", "Ljava/lang/String;", "string", "Lkb/n;", "proto", "Lnb/a$d;", "signature", "Lmb/c;", "nameResolver", "Lmb/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13786c extends C13783e {

        /* renamed from: a */
        private final C14140t0 f62000a;

        /* renamed from: b */
        private final C13494n f62001b;

        /* renamed from: c */
        private final C15766a.C15774d f62002c;

        /* renamed from: d */
        private final C15719c f62003d;

        /* renamed from: e */
        private final C15724g f62004e;

        /* renamed from: f */
        private final String f62005f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13786c(C14140t0 t0Var, C13494n nVar, C15766a.C15774d dVar, C15719c cVar, C15724g gVar) {
            super((C13695i) null);
            String str;
            C13706o.m87929f(t0Var, "descriptor");
            C13706o.m87929f(nVar, "proto");
            C13706o.m87929f(dVar, "signature");
            C13706o.m87929f(cVar, "nameResolver");
            C13706o.m87929f(gVar, "typeTable");
            this.f62000a = t0Var;
            this.f62001b = nVar;
            this.f62002c = dVar;
            this.f62003d = cVar;
            this.f62004e = gVar;
            if (dVar.mo75450I()) {
                str = cVar.getString(dVar.mo75445D().mo75434z()) + cVar.getString(dVar.mo75445D().mo75433y());
            } else {
                C15831d.C15832a d = C15841i.m95457d(C15841i.f65291a, nVar, cVar, gVar, false, 8, (Object) null);
                if (d != null) {
                    String d2 = d.mo75612d();
                    str = C14409z.m90470b(d2) + m88064c() + "()" + d.mo75613e();
                } else {
                    throw new C13719a0("No field signature for property: " + t0Var);
                }
            }
            this.f62005f = str;
        }

        /* renamed from: c */
        private final String m88064c() {
            String str;
            C14064m b = this.f62000a.mo62163b();
            C13706o.m87928e(b, "descriptor.containingDeclaration");
            if (C13706o.m87924a(this.f62000a.getVisibility(), C14127t.f62753d) && (b instanceof C14730d)) {
                C13455c b1 = ((C14730d) b).mo73864b1();
                C14495h.C14502f<C13455c, Integer> fVar = C15766a.f65119i;
                C13706o.m87928e(fVar, "classModuleName");
                Integer num = (Integer) C15722e.m95026a(b1, fVar);
                if (num == null || (str = this.f62003d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + C16158g.m97026a(str);
            } else if (!C13706o.m87924a(this.f62000a.getVisibility(), C14127t.f62750a) || !(b instanceof C14050k0)) {
                return "";
            } else {
                C14140t0 t0Var = this.f62000a;
                C13706o.m87927d(t0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                C14750f J = ((C14775j) t0Var).mo73858J();
                if (!(J instanceof C14445k)) {
                    return "";
                }
                C14445k kVar = (C14445k) J;
                if (kVar.mo73173f() == null) {
                    return "";
                }
                return '$' + kVar.mo73175h().mo78583d();
            }
        }

        /* renamed from: a */
        public String mo72015a() {
            return this.f62005f;
        }

        /* renamed from: b */
        public final C14140t0 mo72019b() {
            return this.f62000a;
        }

        /* renamed from: d */
        public final C15719c mo72020d() {
            return this.f62003d;
        }

        /* renamed from: e */
        public final C13494n mo72021e() {
            return this.f62001b;
        }

        /* renamed from: f */
        public final C15766a.C15774d mo72022f() {
            return this.f62002c;
        }

        /* renamed from: g */
        public final C15724g mo72023g() {
            return this.f62004e;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/e$d;", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Lkotlin/reflect/jvm/internal/d$e;", "Lkotlin/reflect/jvm/internal/d$e;", "b", "()Lkotlin/reflect/jvm/internal/d$e;", "getterSignature", "c", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/d$e;Lkotlin/reflect/jvm/internal/d$e;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.e$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13787d extends C13783e {

        /* renamed from: a */
        private final C13773d.C13781e f62006a;

        /* renamed from: b */
        private final C13773d.C13781e f62007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13787d(C13773d.C13781e eVar, C13773d.C13781e eVar2) {
            super((C13695i) null);
            C13706o.m87929f(eVar, "getterSignature");
            this.f62006a = eVar;
            this.f62007b = eVar2;
        }

        /* renamed from: a */
        public String mo72015a() {
            return this.f62006a.mo72005a();
        }

        /* renamed from: b */
        public final C13773d.C13781e mo72024b() {
            return this.f62006a;
        }

        /* renamed from: c */
        public final C13773d.C13781e mo72025c() {
            return this.f62007b;
        }
    }

    private C13783e() {
    }

    public /* synthetic */ C13783e(C13695i iVar) {
        this();
    }

    /* renamed from: a */
    public abstract String mo72015a();
}
