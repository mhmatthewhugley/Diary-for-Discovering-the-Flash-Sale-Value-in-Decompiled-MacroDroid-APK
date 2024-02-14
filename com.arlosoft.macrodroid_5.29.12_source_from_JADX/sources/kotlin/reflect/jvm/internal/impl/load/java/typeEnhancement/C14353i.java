package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i */
/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
public final class C14353i {

    /* renamed from: a */
    private final C14352h f63140a;

    /* renamed from: b */
    private final boolean f63141b;

    public C14353i(C14352h hVar, boolean z) {
        C13706o.m87929f(hVar, "qualifier");
        this.f63140a = hVar;
        this.f63141b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C14353i m90345b(C14353i iVar, C14352h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = iVar.f63140a;
        }
        if ((i & 2) != 0) {
            z = iVar.f63141b;
        }
        return iVar.mo73029a(hVar, z);
    }

    /* renamed from: a */
    public final C14353i mo73029a(C14352h hVar, boolean z) {
        C13706o.m87929f(hVar, "qualifier");
        return new C14353i(hVar, z);
    }

    /* renamed from: c */
    public final C14352h mo73030c() {
        return this.f63140a;
    }

    /* renamed from: d */
    public final boolean mo73031d() {
        return this.f63141b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14353i)) {
            return false;
        }
        C14353i iVar = (C14353i) obj;
        return this.f63140a == iVar.f63140a && this.f63141b == iVar.f63141b;
    }

    public int hashCode() {
        int hashCode = this.f63140a.hashCode() * 31;
        boolean z = this.f63141b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f63140a + ", isForWarningOnly=" + this.f63141b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14353i(C14352h hVar, boolean z, int i, C13695i iVar) {
        this(hVar, (i & 2) != 0 ? false : z);
    }
}
