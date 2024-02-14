package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzghr {

    /* renamed from: a */
    private final zzgbc f36852a;

    /* renamed from: b */
    private final int f36853b;

    /* renamed from: c */
    private final zzgbl f36854c;

    /* synthetic */ zzghr(zzgbc zzgbc, int i, zzgbl zzgbl, zzghq zzghq) {
        this.f36852a = zzgbc;
        this.f36853b = i;
        this.f36854c = zzgbl;
    }

    /* renamed from: a */
    public final int mo46814a() {
        return this.f36853b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghr)) {
            return false;
        }
        zzghr zzghr = (zzghr) obj;
        if (this.f36852a == zzghr.f36852a && this.f36853b == zzghr.f36853b && this.f36854c.equals(zzghr.f36854c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36852a, Integer.valueOf(this.f36853b), Integer.valueOf(this.f36854c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f36852a, Integer.valueOf(this.f36853b), this.f36854c});
    }
}
