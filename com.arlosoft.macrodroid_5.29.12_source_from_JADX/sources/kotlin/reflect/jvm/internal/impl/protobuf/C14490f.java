package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* compiled from: ExtensionRegistryLite */
public class C14490f {

    /* renamed from: b */
    private static final C14490f f63350b = new C14490f(true);

    /* renamed from: a */
    private final Map<C14491a, C14495h.C14502f<?, ?>> f63351a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C14491a {

        /* renamed from: a */
        private final Object f63352a;

        /* renamed from: b */
        private final int f63353b;

        C14491a(Object obj, int i) {
            this.f63352a = obj;
            this.f63353b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14491a)) {
                return false;
            }
            C14491a aVar = (C14491a) obj;
            if (this.f63352a == aVar.f63352a && this.f63353b == aVar.f63353b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f63352a) * 65535) + this.f63353b;
        }
    }

    C14490f() {
        this.f63351a = new HashMap();
    }

    /* renamed from: c */
    public static C14490f m90910c() {
        return f63350b;
    }

    /* renamed from: d */
    public static C14490f m90911d() {
        return new C14490f();
    }

    /* renamed from: a */
    public final void mo73362a(C14495h.C14502f<?, ?> fVar) {
        this.f63351a.put(new C14491a(fVar.mo73402b(), fVar.mo73404d()), fVar);
    }

    /* renamed from: b */
    public <ContainingType extends C14516o> C14495h.C14502f<ContainingType, ?> mo73363b(ContainingType containingtype, int i) {
        return this.f63351a.get(new C14491a(containingtype, i));
    }

    private C14490f(boolean z) {
        this.f63351a = Collections.emptyMap();
    }
}
