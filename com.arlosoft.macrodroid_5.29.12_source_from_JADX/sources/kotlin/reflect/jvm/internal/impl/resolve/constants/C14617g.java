package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.g */
/* compiled from: constantValues.kt */
public abstract class C14617g<T> {

    /* renamed from: a */
    private final T f63617a;

    public C14617g(T t) {
        this.f63617a = t;
    }

    /* renamed from: a */
    public abstract C14900e0 mo73715a(C13958g0 g0Var);

    /* renamed from: b */
    public T mo73727b() {
        return this.f63617a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b = mo73727b();
            Object obj2 = null;
            C14617g gVar = obj instanceof C14617g ? (C14617g) obj : null;
            if (gVar != null) {
                obj2 = gVar.mo73727b();
            }
            return C13706o.m87924a(b, obj2);
        }
    }

    public int hashCode() {
        Object b = mo73727b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo73727b());
    }
}
