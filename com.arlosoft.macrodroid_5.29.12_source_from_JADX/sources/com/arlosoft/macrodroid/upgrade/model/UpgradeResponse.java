package com.arlosoft.macrodroid.upgrade.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: UpgradeResponse.kt */
public final class UpgradeResponse {
    private final String upgradeAuth;

    public UpgradeResponse(String str) {
        C13706o.m87929f(str, "upgradeAuth");
        this.upgradeAuth = str;
    }

    public static /* synthetic */ UpgradeResponse copy$default(UpgradeResponse upgradeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeResponse.upgradeAuth;
        }
        return upgradeResponse.copy(str);
    }

    public final String component1() {
        return this.upgradeAuth;
    }

    public final UpgradeResponse copy(String str) {
        C13706o.m87929f(str, "upgradeAuth");
        return new UpgradeResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpgradeResponse) && C13706o.m87924a(this.upgradeAuth, ((UpgradeResponse) obj).upgradeAuth);
    }

    public final String getUpgradeAuth() {
        return this.upgradeAuth;
    }

    public int hashCode() {
        return this.upgradeAuth.hashCode();
    }

    public String toString() {
        return "UpgradeResponse(upgradeAuth=" + this.upgradeAuth + ')';
    }
}
