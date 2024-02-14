package com.arlosoft.macrodroid.actionblock.common;

import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

/* renamed from: com.arlosoft.macrodroid.actionblock.common.d */
/* compiled from: RunnableItem.kt */
public final class C3671d {

    /* renamed from: a */
    private final String f9719a;

    /* renamed from: b */
    private final long f9720b;

    /* renamed from: c */
    private final boolean f9721c;

    public C3671d(String str, long j, boolean z) {
        C13706o.m87929f(str, "name");
        this.f9719a = str;
        this.f9720b = j;
        this.f9721c = z;
    }

    /* renamed from: a */
    public final String mo27102a() {
        return this.f9719a;
    }

    /* renamed from: b */
    public final long mo27103b() {
        return this.f9720b;
    }

    /* renamed from: c */
    public final boolean mo27104c() {
        return this.f9721c;
    }

    /* renamed from: d */
    public final long mo27105d() {
        return this.f9720b;
    }

    /* renamed from: e */
    public final boolean mo27106e() {
        return this.f9721c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3671d)) {
            return false;
        }
        C3671d dVar = (C3671d) obj;
        return C13706o.m87924a(this.f9719a, dVar.f9719a) && this.f9720b == dVar.f9720b && this.f9721c == dVar.f9721c;
    }

    public int hashCode() {
        int hashCode = ((this.f9719a.hashCode() * 31) + C1405a.m633a(this.f9720b)) * 31;
        boolean z = this.f9721c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "RunnableItem(name=" + this.f9719a + ", guid=" + this.f9720b + ", isActionBlock=" + this.f9721c + ')';
    }
}
