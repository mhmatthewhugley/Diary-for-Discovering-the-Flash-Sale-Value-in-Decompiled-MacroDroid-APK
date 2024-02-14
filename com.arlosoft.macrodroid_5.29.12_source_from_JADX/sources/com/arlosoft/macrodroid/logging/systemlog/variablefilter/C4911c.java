package com.arlosoft.macrodroid.logging.systemlog.variablefilter;

import com.arlosoft.macrodroid.common.MacroDroidVariable;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.c */
/* compiled from: VariableWithFilteredState.kt */
public final class C4911c {

    /* renamed from: a */
    private final MacroDroidVariable f12344a;

    /* renamed from: b */
    private final boolean f12345b;

    public C4911c(MacroDroidVariable macroDroidVariable, boolean z) {
        C13706o.m87929f(macroDroidVariable, "variable");
        this.f12344a = macroDroidVariable;
        this.f12345b = z;
    }

    /* renamed from: a */
    public final MacroDroidVariable mo29504a() {
        return this.f12344a;
    }

    /* renamed from: b */
    public final boolean mo29505b() {
        return this.f12345b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4911c)) {
            return false;
        }
        C4911c cVar = (C4911c) obj;
        return C13706o.m87924a(this.f12344a, cVar.f12344a) && this.f12345b == cVar.f12345b;
    }

    public int hashCode() {
        int hashCode = this.f12344a.hashCode() * 31;
        boolean z = this.f12345b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "VariableWithFilteredState(variable=" + this.f12344a + ", isEnabled=" + this.f12345b + ')';
    }
}
