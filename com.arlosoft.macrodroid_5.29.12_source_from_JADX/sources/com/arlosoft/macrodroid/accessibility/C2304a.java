package com.arlosoft.macrodroid.accessibility;

import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.accessibility.a */
/* compiled from: AccessibilityServiceKeepRunningState.kt */
public final class C2304a {

    /* renamed from: a */
    private final String f7112a;

    /* renamed from: b */
    private final String f7113b;

    /* renamed from: c */
    private final boolean f7114c;

    public C2304a(String str, String str2, boolean z) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "id");
        this.f7112a = str;
        this.f7113b = str2;
        this.f7114c = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C2304a m9551b(C2304a aVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f7112a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f7113b;
        }
        if ((i & 4) != 0) {
            z = aVar.f7114c;
        }
        return aVar.mo24655a(str, str2, z);
    }

    /* renamed from: a */
    public final C2304a mo24655a(String str, String str2, boolean z) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "id");
        return new C2304a(str, str2, z);
    }

    /* renamed from: c */
    public final String mo24656c() {
        return this.f7113b;
    }

    /* renamed from: d */
    public final boolean mo24657d() {
        return this.f7114c;
    }

    /* renamed from: e */
    public final String mo24658e() {
        return this.f7112a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2304a)) {
            return false;
        }
        C2304a aVar = (C2304a) obj;
        return C13706o.m87924a(this.f7112a, aVar.f7112a) && C13706o.m87924a(this.f7113b, aVar.f7113b) && this.f7114c == aVar.f7114c;
    }

    public int hashCode() {
        int hashCode = ((this.f7112a.hashCode() * 31) + this.f7113b.hashCode()) * 31;
        boolean z = this.f7114c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "AccessibilityServiceKeepRunningState(name=" + this.f7112a + ", id=" + this.f7113b + ", keepRunning=" + this.f7114c + ')';
    }
}
