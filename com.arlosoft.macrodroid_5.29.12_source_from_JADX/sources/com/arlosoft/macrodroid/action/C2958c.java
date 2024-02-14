package com.arlosoft.macrodroid.action;

import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.action.c */
/* compiled from: AccessibilityServiceAction.kt */
public final class C2958c {

    /* renamed from: a */
    private final String f8080a;

    /* renamed from: b */
    private final String f8081b;

    public C2958c(String str, String str2) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "name");
        this.f8080a = str;
        this.f8081b = str2;
    }

    /* renamed from: a */
    public final String mo26339a() {
        return this.f8080a;
    }

    /* renamed from: b */
    public final String mo26340b() {
        return this.f8081b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2958c)) {
            return false;
        }
        C2958c cVar = (C2958c) obj;
        return C13706o.m87924a(this.f8080a, cVar.f8080a) && C13706o.m87924a(this.f8081b, cVar.f8081b);
    }

    public int hashCode() {
        return (this.f8080a.hashCode() * 31) + this.f8081b.hashCode();
    }

    public String toString() {
        return "AccessibilityServiceData(id=" + this.f8080a + ", name=" + this.f8081b + ')';
    }
}
