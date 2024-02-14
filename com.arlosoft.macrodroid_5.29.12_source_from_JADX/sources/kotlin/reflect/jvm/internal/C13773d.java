package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import p349ob.C15831d;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d;", "", "", "a", "<init>", "()V", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/d$a;", "Lkotlin/reflect/jvm/internal/d$b;", "Lkotlin/reflect/jvm/internal/d$c;", "Lkotlin/reflect/jvm/internal/d$d;", "Lkotlin/reflect/jvm/internal/d$e;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.d */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C13773d {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d$a;", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.d$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13774a extends C13773d {

        /* renamed from: a */
        private final Class<?> f61987a;

        /* renamed from: b */
        private final List<Method> f61988b;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.d$a$a */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C13775a extends C13708q implements C16265l<Method, CharSequence> {

            /* renamed from: a */
            public static final C13775a f61989a = new C13775a();

            C13775a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                C13706o.m87928e(returnType, "it.returnType");
                return C14088d.m89398b(returnType);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.d$a$b */
        /* compiled from: Comparisons.kt */
        public static final class C13776b<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C15612b.m94865a(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13774a(Class<?> cls) {
            super((C13695i) null);
            C13706o.m87929f(cls, "jClass");
            this.f61987a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C13706o.m87928e(declaredMethods, "jClass.declaredMethods");
            this.f61988b = C13596m.m87600Y(declaredMethods, new C13776b());
        }

        /* renamed from: a */
        public String mo72005a() {
            return C13566b0.m87432g0(this.f61988b, "", "<init>(", ")V", 0, (CharSequence) null, C13775a.f61989a, 24, (Object) null);
        }

        /* renamed from: b */
        public final List<Method> mo72006b() {
            return this.f61988b;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d$b;", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.d$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13777b extends C13773d {

        /* renamed from: a */
        private final Constructor<?> f61990a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.d$b$a */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C13778a extends C13708q implements C16265l<Class<?>, CharSequence> {

            /* renamed from: a */
            public static final C13778a f61991a = new C13778a();

            C13778a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Class<?> cls) {
                C13706o.m87928e(cls, "it");
                return C14088d.m89398b(cls);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13777b(Constructor<?> constructor) {
            super((C13695i) null);
            C13706o.m87929f(constructor, "constructor");
            this.f61990a = constructor;
        }

        /* renamed from: a */
        public String mo72005a() {
            Class[] parameterTypes = this.f61990a.getParameterTypes();
            C13706o.m87928e(parameterTypes, "constructor.parameterTypes");
            return C13596m.m87590O(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C13778a.f61991a, 24, (Object) null);
        }

        /* renamed from: b */
        public final Constructor<?> mo72009b() {
            return this.f61990a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d$c;", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.d$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13779c extends C13773d {

        /* renamed from: a */
        private final Method f61992a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13779c(Method method) {
            super((C13695i) null);
            C13706o.m87929f(method, "method");
            this.f61992a = method;
        }

        /* renamed from: a */
        public String mo72005a() {
            return C13804g0.m88112b(this.f61992a);
        }

        /* renamed from: b */
        public final Method mo72011b() {
            return this.f61992a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d$d;", "Lkotlin/reflect/jvm/internal/d;", "", "a", "b", "Ljava/lang/String;", "_signature", "()Ljava/lang/String;", "constructorDesc", "Lob/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.d$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13780d extends C13773d {

        /* renamed from: a */
        private final C15831d.C15833b f61993a;

        /* renamed from: b */
        private final String f61994b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13780d(C15831d.C15833b bVar) {
            super((C13695i) null);
            C13706o.m87929f(bVar, "signature");
            this.f61993a = bVar;
            this.f61994b = bVar.mo75608a();
        }

        /* renamed from: a */
        public String mo72005a() {
            return this.f61994b;
        }

        /* renamed from: b */
        public final String mo72012b() {
            return this.f61993a.mo75609b();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\b¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/d$e;", "Lkotlin/reflect/jvm/internal/d;", "", "a", "b", "Ljava/lang/String;", "_signature", "c", "()Ljava/lang/String;", "methodName", "methodDesc", "Lob/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.d$e */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C13781e extends C13773d {

        /* renamed from: a */
        private final C15831d.C15833b f61995a;

        /* renamed from: b */
        private final String f61996b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13781e(C15831d.C15833b bVar) {
            super((C13695i) null);
            C13706o.m87929f(bVar, "signature");
            this.f61995a = bVar;
            this.f61996b = bVar.mo75608a();
        }

        /* renamed from: a */
        public String mo72005a() {
            return this.f61996b;
        }

        /* renamed from: b */
        public final String mo72013b() {
            return this.f61995a.mo75609b();
        }

        /* renamed from: c */
        public final String mo72014c() {
            return this.f61995a.mo75610c();
        }
    }

    private C13773d() {
    }

    public /* synthetic */ C13773d(C13695i iVar) {
        this();
    }

    /* renamed from: a */
    public abstract String mo72005a();
}
