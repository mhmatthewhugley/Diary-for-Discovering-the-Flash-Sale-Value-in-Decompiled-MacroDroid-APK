package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c */
/* compiled from: ReflectJavaMember.kt */
final class C14085c {

    /* renamed from: a */
    public static final C14085c f62706a = new C14085c();

    /* renamed from: b */
    private static C14086a f62707b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a */
    /* compiled from: ReflectJavaMember.kt */
    public static final class C14086a {

        /* renamed from: a */
        private final Method f62708a;

        /* renamed from: b */
        private final Method f62709b;

        public C14086a(Method method, Method method2) {
            this.f62708a = method;
            this.f62709b = method2;
        }

        /* renamed from: a */
        public final Method mo72601a() {
            return this.f62709b;
        }

        /* renamed from: b */
        public final Method mo72602b() {
            return this.f62708a;
        }
    }

    private C14085c() {
    }

    /* renamed from: a */
    public final C14086a mo72599a(Member member) {
        C13706o.m87929f(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C14086a(cls.getMethod("getParameters", new Class[0]), C14088d.m89402f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C14086a((Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    public final List<String> mo72600b(Member member) {
        Method a;
        C13706o.m87929f(member, "member");
        C14086a aVar = f62707b;
        if (aVar == null) {
            synchronized (this) {
                C14085c cVar = f62706a;
                C14086a aVar2 = f62707b;
                if (aVar2 == null) {
                    aVar = cVar.mo72599a(member);
                    f62707b = aVar;
                } else {
                    aVar = aVar2;
                }
            }
        }
        Method b = aVar.mo72602b();
        if (b == null || (a = aVar.mo72601a()) == null) {
            return null;
        }
        Object invoke = b.invoke(member, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke2 : objArr) {
            Object invoke3 = a.invoke(invoke2, new Object[0]);
            C13706o.m87927d(invoke3, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke3);
        }
        return arrayList;
    }
}
