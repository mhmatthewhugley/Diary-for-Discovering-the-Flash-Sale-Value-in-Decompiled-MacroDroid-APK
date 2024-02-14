package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a */
/* compiled from: JavaTypeResolver.kt */
public final class C14308a {

    /* renamed from: a */
    private final C14190k f63073a;

    /* renamed from: b */
    private final C14309b f63074b;

    /* renamed from: c */
    private final boolean f63075c;

    /* renamed from: d */
    private final Set<C13950e1> f63076d;

    /* renamed from: e */
    private final C14951m0 f63077e;

    public C14308a(C14190k kVar, C14309b bVar, boolean z, Set<? extends C13950e1> set, C14951m0 m0Var) {
        C13706o.m87929f(kVar, "howThisTypeIsUsed");
        C13706o.m87929f(bVar, "flexibility");
        this.f63073a = kVar;
        this.f63074b = bVar;
        this.f63075c = z;
        this.f63076d = set;
        this.f63077e = m0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C14308a m90171b(C14308a aVar, C14190k kVar, C14309b bVar, boolean z, Set<C13950e1> set, C14951m0 m0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = aVar.f63073a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f63074b;
        }
        C14309b bVar2 = bVar;
        if ((i & 4) != 0) {
            z = aVar.f63075c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = aVar.f63076d;
        }
        Set<C13950e1> set2 = set;
        if ((i & 16) != 0) {
            m0Var = aVar.f63077e;
        }
        return aVar.mo72926a(kVar, bVar2, z2, set2, m0Var);
    }

    /* renamed from: a */
    public final C14308a mo72926a(C14190k kVar, C14309b bVar, boolean z, Set<? extends C13950e1> set, C14951m0 m0Var) {
        C13706o.m87929f(kVar, "howThisTypeIsUsed");
        C13706o.m87929f(bVar, "flexibility");
        return new C14308a(kVar, bVar, z, set, m0Var);
    }

    /* renamed from: c */
    public final C14951m0 mo72927c() {
        return this.f63077e;
    }

    /* renamed from: d */
    public final C14309b mo72928d() {
        return this.f63074b;
    }

    /* renamed from: e */
    public final C14190k mo72929e() {
        return this.f63073a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14308a)) {
            return false;
        }
        C14308a aVar = (C14308a) obj;
        return this.f63073a == aVar.f63073a && this.f63074b == aVar.f63074b && this.f63075c == aVar.f63075c && C13706o.m87924a(this.f63076d, aVar.f63076d) && C13706o.m87924a(this.f63077e, aVar.f63077e);
    }

    /* renamed from: f */
    public final Set<C13950e1> mo72931f() {
        return this.f63076d;
    }

    /* renamed from: g */
    public final boolean mo72932g() {
        return this.f63075c;
    }

    /* renamed from: h */
    public final C14308a mo72933h(C14951m0 m0Var) {
        return m90171b(this, (C14190k) null, (C14309b) null, false, (Set) null, m0Var, 15, (Object) null);
    }

    public int hashCode() {
        int hashCode = ((this.f63073a.hashCode() * 31) + this.f63074b.hashCode()) * 31;
        boolean z = this.f63075c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Set<C13950e1> set = this.f63076d;
        int i2 = 0;
        int hashCode2 = (i + (set == null ? 0 : set.hashCode())) * 31;
        C14951m0 m0Var = this.f63077e;
        if (m0Var != null) {
            i2 = m0Var.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: i */
    public final C14308a mo72935i(C14309b bVar) {
        C13706o.m87929f(bVar, "flexibility");
        return m90171b(this, (C14190k) null, bVar, false, (Set) null, (C14951m0) null, 29, (Object) null);
    }

    /* renamed from: j */
    public final C14308a mo72936j(C13950e1 e1Var) {
        C13706o.m87929f(e1Var, "typeParameter");
        Set<C13950e1> set = this.f63076d;
        return m90171b(this, (C14190k) null, (C14309b) null, false, set != null ? C13563a1.m87392k(set, e1Var) : C13625y0.m87800c(e1Var), (C14951m0) null, 23, (Object) null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f63073a + ", flexibility=" + this.f63074b + ", isForAnnotationParameter=" + this.f63075c + ", visitedTypeParameters=" + this.f63076d + ", defaultType=" + this.f63077e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14308a(C14190k kVar, C14309b bVar, boolean z, Set set, C14951m0 m0Var, int i, C13695i iVar) {
        this(kVar, (i & 2) != 0 ? C14309b.INFLEXIBLE : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : m0Var);
    }
}
