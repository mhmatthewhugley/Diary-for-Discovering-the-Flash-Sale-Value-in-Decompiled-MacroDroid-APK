package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import p362pb.C16151b;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.f */
/* compiled from: ClassLiteralValue.kt */
public final class C14616f {

    /* renamed from: a */
    private final C16151b f63615a;

    /* renamed from: b */
    private final int f63616b;

    public C14616f(C16151b bVar, int i) {
        C13706o.m87929f(bVar, "classId");
        this.f63615a = bVar;
        this.f63616b = i;
    }

    /* renamed from: a */
    public final C16151b mo73720a() {
        return this.f63615a;
    }

    /* renamed from: b */
    public final int mo73721b() {
        return this.f63616b;
    }

    /* renamed from: c */
    public final int mo73722c() {
        return this.f63616b;
    }

    /* renamed from: d */
    public final C16151b mo73723d() {
        return this.f63615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14616f)) {
            return false;
        }
        C14616f fVar = (C14616f) obj;
        return C13706o.m87924a(this.f63615a, fVar.f63615a) && this.f63616b == fVar.f63616b;
    }

    public int hashCode() {
        return (this.f63615a.hashCode() * 31) + this.f63616b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f63616b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f63615a);
        int i3 = this.f63616b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
