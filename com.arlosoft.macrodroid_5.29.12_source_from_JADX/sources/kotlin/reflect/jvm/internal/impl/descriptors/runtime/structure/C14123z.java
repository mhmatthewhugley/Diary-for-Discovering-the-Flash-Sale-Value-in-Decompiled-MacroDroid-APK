package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12479a;
import p288ib.C12510x;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z */
/* compiled from: ReflectJavaType.kt */
public abstract class C14123z implements C12510x {

    /* renamed from: a */
    public static final C14124a f62749a = new C14124a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z$a */
    /* compiled from: ReflectJavaType.kt */
    public static final class C14124a {
        private C14124a() {
        }

        public /* synthetic */ C14124a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14123z mo72656a(Type type) {
            C14123z zVar;
            C13706o.m87929f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C14121x(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                zVar = new C14099k(type);
            } else if (type instanceof WildcardType) {
                zVar = new C14087c0((WildcardType) type);
            } else {
                zVar = new C14110n(type);
            }
            return zVar;
        }
    }

    /* renamed from: H */
    public C12479a mo68961H(C16152c cVar) {
        return C12510x.C12511a.m83617a(this, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract Type mo72603N();

    public boolean equals(Object obj) {
        return (obj instanceof C14123z) && C13706o.m87924a(mo72603N(), ((C14123z) obj).mo72603N());
    }

    public int hashCode() {
        return mo72603N().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo72603N();
    }
}
