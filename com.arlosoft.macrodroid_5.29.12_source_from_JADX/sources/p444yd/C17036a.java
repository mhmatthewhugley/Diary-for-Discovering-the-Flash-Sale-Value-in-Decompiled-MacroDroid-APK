package p444yd;

import java.lang.reflect.Method;
import p220be.C11157b;

/* renamed from: yd.a */
/* compiled from: DelegatingMethod */
public class C17036a implements C11157b {

    /* renamed from: a */
    private final Method f68424a;

    /* renamed from: b */
    private final Class<?>[] f68425b;

    public C17036a(Method method) {
        this.f68424a = method;
        this.f68425b = C17037b.m100341a(method.getParameterTypes());
    }

    /* renamed from: a */
    public Class<?>[] mo62341a() {
        return this.f68425b;
    }

    /* renamed from: b */
    public Method mo62342b() {
        return this.f68424a;
    }

    /* renamed from: c */
    public boolean mo62343c() {
        return this.f68424a.isVarArgs();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17036a) {
            return this.f68424a.equals(((C17036a) obj).f68424a);
        }
        return this.f68424a.equals(obj);
    }

    public String getName() {
        return this.f68424a.getName();
    }

    public Class<?> getReturnType() {
        return this.f68424a.getReturnType();
    }

    public int hashCode() {
        return this.f68424a.hashCode();
    }
}
