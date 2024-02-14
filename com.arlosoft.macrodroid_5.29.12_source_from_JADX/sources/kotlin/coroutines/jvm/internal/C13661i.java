package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/i;", "", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/i$a;", "a", "", "b", "Lkotlin/coroutines/jvm/internal/i$a;", "notOnJava9", "c", "cache", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.i */
/* compiled from: DebugMetadata.kt */
final class C13661i {

    /* renamed from: a */
    public static final C13661i f61905a = new C13661i();

    /* renamed from: b */
    private static final C13662a f61906b = new C13662a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C13662a f61907c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/i$a;", "", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getModuleMethod", "b", "getDescriptorMethod", "c", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C13662a {

        /* renamed from: a */
        public final Method f61908a;

        /* renamed from: b */
        public final Method f61909b;

        /* renamed from: c */
        public final Method f61910c;

        public C13662a(Method method, Method method2, Method method3) {
            this.f61908a = method;
            this.f61909b = method2;
            this.f61910c = method3;
        }
    }

    private C13661i() {
    }

    /* renamed from: a */
    private final C13662a m87848a(C13653a aVar) {
        try {
            C13662a aVar2 = new C13662a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f61907c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C13662a aVar3 = f61906b;
            f61907c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo71898b(C13653a aVar) {
        C13706o.m87929f(aVar, "continuation");
        C13662a aVar2 = f61907c;
        if (aVar2 == null) {
            aVar2 = m87848a(aVar);
        }
        if (aVar2 == f61906b) {
            return null;
        }
        Method method = aVar2.f61908a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f61909b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f61910c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
