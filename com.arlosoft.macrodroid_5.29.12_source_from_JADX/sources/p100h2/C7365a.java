package p100h2;

import kotlin.jvm.internal.C13706o;

/* renamed from: h2.a */
/* compiled from: NearbyHelper.kt */
public final class C7365a {

    /* renamed from: a */
    private final String f18010a;

    /* renamed from: b */
    private final String f18011b;

    public C7365a(String str, String str2) {
        C13706o.m87929f(str, "endPointId");
        C13706o.m87929f(str2, "deviceName");
        this.f18010a = str;
        this.f18011b = str2;
    }

    /* renamed from: a */
    public final String mo37347a() {
        return this.f18011b;
    }

    /* renamed from: b */
    public final String mo37348b() {
        return this.f18010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7365a)) {
            return false;
        }
        C7365a aVar = (C7365a) obj;
        return C13706o.m87924a(this.f18010a, aVar.f18010a) && C13706o.m87924a(this.f18011b, aVar.f18011b);
    }

    public int hashCode() {
        return (this.f18010a.hashCode() * 31) + this.f18011b.hashCode();
    }

    public String toString() {
        return "NearbyDevice(endPointId=" + this.f18010a + ", deviceName=" + this.f18011b + ')';
    }
}
