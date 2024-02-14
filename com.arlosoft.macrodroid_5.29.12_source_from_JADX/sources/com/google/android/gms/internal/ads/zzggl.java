package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzggl {

    /* renamed from: a */
    private final Class f36820a;

    /* renamed from: b */
    private final zzgpc f36821b;

    /* synthetic */ zzggl(Class cls, zzgpc zzgpc, zzggk zzggk) {
        this.f36820a = cls;
        this.f36821b = zzgpc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggl)) {
            return false;
        }
        zzggl zzggl = (zzggl) obj;
        if (!zzggl.f36820a.equals(this.f36820a) || !zzggl.f36821b.equals(this.f36821b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36820a, this.f36821b});
    }

    public final String toString() {
        String simpleName = this.f36820a.getSimpleName();
        String valueOf = String.valueOf(this.f36821b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
