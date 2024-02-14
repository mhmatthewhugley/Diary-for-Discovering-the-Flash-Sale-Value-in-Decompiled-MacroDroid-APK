package kotlin.reflect.jvm.internal.impl.types;

import androidx.webkit.ProxyConfig;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.h1 */
/* compiled from: TypeProjectionBase */
public abstract class C14930h1 implements C14926g1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14926g1)) {
            return false;
        }
        C14926g1 g1Var = (C14926g1) obj;
        return mo74184b() == g1Var.mo74184b() && mo74185c() == g1Var.mo74185c() && getType().equals(g1Var.getType());
    }

    public int hashCode() {
        int hashCode = mo74185c().hashCode();
        if (C14956n1.m93007v(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (mo74184b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo74184b()) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        if (mo74185c() == C14970r1.INVARIANT) {
            return getType().toString();
        }
        return mo74185c() + " " + getType();
    }
}
