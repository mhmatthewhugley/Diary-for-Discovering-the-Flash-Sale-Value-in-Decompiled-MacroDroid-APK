package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: retrofit2.u */
/* compiled from: ServiceMethod */
abstract class C17304u<T> {
    C17304u() {
    }

    /* renamed from: b */
    static <T> C17304u<T> m100996b(C17301t tVar, Method method) {
        C17298r b = C17298r.m100960b(tVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C17307x.m101008j(genericReturnType)) {
            throw C17307x.m101011m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C17254j.m100876f(tVar, method, b);
        } else {
            throw C17307x.m101011m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo80549a(Object[] objArr);
}
