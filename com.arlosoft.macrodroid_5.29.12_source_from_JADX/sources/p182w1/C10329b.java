package p182w1;

import kotlin.jvm.internal.C13706o;

/* renamed from: w1.b */
/* compiled from: ShellScriptResult.kt */
public final class C10329b extends C10328a {

    /* renamed from: b */
    private final int f23493b;

    /* renamed from: c */
    private final String f23494c;

    /* renamed from: d */
    private final boolean f23495d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10329b(int i, String str, boolean z) {
        super(i);
        C13706o.m87929f(str, "resultString");
        this.f23493b = i;
        this.f23494c = str;
        this.f23495d = z;
    }

    /* renamed from: b */
    public final boolean mo40954b() {
        return this.f23495d;
    }

    /* renamed from: c */
    public final String mo40955c() {
        return this.f23494c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10329b)) {
            return false;
        }
        C10329b bVar = (C10329b) obj;
        return this.f23493b == bVar.f23493b && C13706o.m87924a(this.f23494c, bVar.f23494c) && this.f23495d == bVar.f23495d;
    }

    public int hashCode() {
        int hashCode = ((this.f23493b * 31) + this.f23494c.hashCode()) * 31;
        boolean z = this.f23495d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ShellScriptResult(requestId=" + this.f23493b + ", resultString=" + this.f23494c + ", didTimeout=" + this.f23495d + ')';
    }
}
