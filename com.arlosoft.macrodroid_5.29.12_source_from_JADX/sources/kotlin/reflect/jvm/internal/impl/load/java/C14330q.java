package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.q */
/* compiled from: AnnotationQualifiersFqNames.kt */
public final class C14330q {

    /* renamed from: a */
    private final C14353i f63107a;

    /* renamed from: b */
    private final Collection<C14164b> f63108b;

    /* renamed from: c */
    private final boolean f63109c;

    public C14330q(C14353i iVar, Collection<? extends C14164b> collection, boolean z) {
        C13706o.m87929f(iVar, "nullabilityQualifier");
        C13706o.m87929f(collection, "qualifierApplicabilityTypes");
        this.f63107a = iVar;
        this.f63108b = collection;
        this.f63109c = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C14330q m90249b(C14330q qVar, C14353i iVar, Collection<C14164b> collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = qVar.f63107a;
        }
        if ((i & 2) != 0) {
            collection = qVar.f63108b;
        }
        if ((i & 4) != 0) {
            z = qVar.f63109c;
        }
        return qVar.mo72972a(iVar, collection, z);
    }

    /* renamed from: a */
    public final C14330q mo72972a(C14353i iVar, Collection<? extends C14164b> collection, boolean z) {
        C13706o.m87929f(iVar, "nullabilityQualifier");
        C13706o.m87929f(collection, "qualifierApplicabilityTypes");
        return new C14330q(iVar, collection, z);
    }

    /* renamed from: c */
    public final boolean mo72973c() {
        return this.f63109c;
    }

    /* renamed from: d */
    public final C14353i mo72974d() {
        return this.f63107a;
    }

    /* renamed from: e */
    public final Collection<C14164b> mo72975e() {
        return this.f63108b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14330q)) {
            return false;
        }
        C14330q qVar = (C14330q) obj;
        return C13706o.m87924a(this.f63107a, qVar.f63107a) && C13706o.m87924a(this.f63108b, qVar.f63108b) && this.f63109c == qVar.f63109c;
    }

    public int hashCode() {
        int hashCode = ((this.f63107a.hashCode() * 31) + this.f63108b.hashCode()) * 31;
        boolean z = this.f63109c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f63107a + ", qualifierApplicabilityTypes=" + this.f63108b + ", definitelyNotNull=" + this.f63109c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14330q(C14353i iVar, Collection collection, boolean z, int i, C13695i iVar2) {
        this(iVar, collection, (i & 4) != 0 ? iVar.mo73030c() == C14352h.NOT_NULL : z);
    }
}
