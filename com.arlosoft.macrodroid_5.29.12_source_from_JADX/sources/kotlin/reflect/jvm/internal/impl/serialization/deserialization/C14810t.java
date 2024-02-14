package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import p362pb.C16151b;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.t */
/* compiled from: IncompatibleVersionErrorData.kt */
public final class C14810t<T> {

    /* renamed from: a */
    private final T f63934a;

    /* renamed from: b */
    private final T f63935b;

    /* renamed from: c */
    private final String f63936c;

    /* renamed from: d */
    private final C16151b f63937d;

    public C14810t(T t, T t2, String str, C16151b bVar) {
        C13706o.m87929f(str, "filePath");
        C13706o.m87929f(bVar, "classId");
        this.f63934a = t;
        this.f63935b = t2;
        this.f63936c = str;
        this.f63937d = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14810t)) {
            return false;
        }
        C14810t tVar = (C14810t) obj;
        return C13706o.m87924a(this.f63934a, tVar.f63934a) && C13706o.m87924a(this.f63935b, tVar.f63935b) && C13706o.m87924a(this.f63936c, tVar.f63936c) && C13706o.m87924a(this.f63937d, tVar.f63937d);
    }

    public int hashCode() {
        T t = this.f63934a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f63935b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f63936c.hashCode()) * 31) + this.f63937d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f63934a + ", expectedVersion=" + this.f63935b + ", filePath=" + this.f63936c + ", classId=" + this.f63937d + ')';
    }
}
