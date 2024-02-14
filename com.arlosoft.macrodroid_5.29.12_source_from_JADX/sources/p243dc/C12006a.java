package p243dc;

import kotlin.jvm.internal.C13706o;

/* renamed from: dc.a */
/* compiled from: CapturedTypeApproximation.kt */
public final class C12006a<T> {

    /* renamed from: a */
    private final T f58208a;

    /* renamed from: b */
    private final T f58209b;

    public C12006a(T t, T t2) {
        this.f58208a = t;
        this.f58209b = t2;
    }

    /* renamed from: a */
    public final T mo67452a() {
        return this.f58208a;
    }

    /* renamed from: b */
    public final T mo67453b() {
        return this.f58209b;
    }

    /* renamed from: c */
    public final T mo67454c() {
        return this.f58208a;
    }

    /* renamed from: d */
    public final T mo67455d() {
        return this.f58209b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12006a)) {
            return false;
        }
        C12006a aVar = (C12006a) obj;
        return C13706o.m87924a(this.f58208a, aVar.f58208a) && C13706o.m87924a(this.f58209b, aVar.f58209b);
    }

    public int hashCode() {
        T t = this.f58208a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f58209b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f58208a + ", upper=" + this.f58209b + ')';
    }
}
