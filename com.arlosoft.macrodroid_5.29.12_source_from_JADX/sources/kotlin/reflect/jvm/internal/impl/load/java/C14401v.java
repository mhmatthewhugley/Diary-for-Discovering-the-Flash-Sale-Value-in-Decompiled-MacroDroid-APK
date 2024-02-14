package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13318e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.v */
/* compiled from: JavaNullabilityAnnotationsStatus.kt */
public final class C14401v {

    /* renamed from: d */
    public static final C14402a f63178d = new C14402a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C14401v f63179e = new C14401v(C14200f0.STRICT, (C13318e) null, (C14200f0) null, 6, (C13695i) null);

    /* renamed from: a */
    private final C14200f0 f63180a;

    /* renamed from: b */
    private final C13318e f63181b;

    /* renamed from: c */
    private final C14200f0 f63182c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.v$a */
    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class C14402a {
        private C14402a() {
        }

        public /* synthetic */ C14402a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14401v mo73091a() {
            return C14401v.f63179e;
        }
    }

    public C14401v(C14200f0 f0Var, C13318e eVar, C14200f0 f0Var2) {
        C13706o.m87929f(f0Var, "reportLevelBefore");
        C13706o.m87929f(f0Var2, "reportLevelAfter");
        this.f63180a = f0Var;
        this.f63181b = eVar;
        this.f63182c = f0Var2;
    }

    /* renamed from: b */
    public final C14200f0 mo73085b() {
        return this.f63182c;
    }

    /* renamed from: c */
    public final C14200f0 mo73086c() {
        return this.f63180a;
    }

    /* renamed from: d */
    public final C13318e mo73087d() {
        return this.f63181b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14401v)) {
            return false;
        }
        C14401v vVar = (C14401v) obj;
        return this.f63180a == vVar.f63180a && C13706o.m87924a(this.f63181b, vVar.f63181b) && this.f63182c == vVar.f63182c;
    }

    public int hashCode() {
        int hashCode = this.f63180a.hashCode() * 31;
        C13318e eVar = this.f63181b;
        return ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f63182c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f63180a + ", sinceVersion=" + this.f63181b + ", reportLevelAfter=" + this.f63182c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14401v(C14200f0 f0Var, C13318e eVar, C14200f0 f0Var2, int i, C13695i iVar) {
        this(f0Var, (i & 2) != 0 ? new C13318e(1, 0) : eVar, (i & 4) != 0 ? f0Var : f0Var2);
    }
}
