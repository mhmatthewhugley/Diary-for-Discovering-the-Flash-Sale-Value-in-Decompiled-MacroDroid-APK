package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: retrofit2.k */
/* compiled from: Invocation */
public final class C17258k {

    /* renamed from: a */
    private final Method f68826a;

    /* renamed from: b */
    private final List<?> f68827b;

    C17258k(Method method, List<?> list) {
        this.f68826a = method;
        this.f68827b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo80551a() {
        return this.f68826a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f68826a.getDeclaringClass().getName(), this.f68826a.getName(), this.f68827b});
    }
}
