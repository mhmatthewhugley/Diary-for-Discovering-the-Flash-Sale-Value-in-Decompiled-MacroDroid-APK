package com.arlosoft.macrodroid.upgrade.model;

import com.arlosoft.macrodroid.common.DontObfuscate;

@DontObfuscate
/* compiled from: ProUserStatus.kt */
public final class ProUserStatus {
    private final int statusCode;

    public ProUserStatus(int i) {
        this.statusCode = i;
    }

    public static /* synthetic */ ProUserStatus copy$default(ProUserStatus proUserStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = proUserStatus.statusCode;
        }
        return proUserStatus.copy(i);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final ProUserStatus copy(int i) {
        return new ProUserStatus(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProUserStatus) && this.statusCode == ((ProUserStatus) obj).statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.statusCode;
    }

    public String toString() {
        return "ProUserStatus(statusCode=" + this.statusCode + ')';
    }
}
