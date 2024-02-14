package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfiv {
    @NonNull

    /* renamed from: a */
    public final String f35859a;
    @NonNull

    /* renamed from: b */
    public final String f35860b;

    public zzfiv(@NonNull String str, @NonNull String str2) {
        this.f35859a = str;
        this.f35860b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfiv)) {
            return false;
        }
        zzfiv zzfiv = (zzfiv) obj;
        return this.f35859a.equals(zzfiv.f35859a) && this.f35860b.equals(zzfiv.f35860b);
    }

    public final int hashCode() {
        return String.valueOf(this.f35859a).concat(String.valueOf(this.f35860b)).hashCode();
    }
}
