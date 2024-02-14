package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzul {

    /* renamed from: a */
    public final long f38627a;

    /* renamed from: b */
    public final long f38628b;

    public zzul(long j, long j2) {
        this.f38627a = j;
        this.f38628b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzul)) {
            return false;
        }
        zzul zzul = (zzul) obj;
        return this.f38627a == zzul.f38627a && this.f38628b == zzul.f38628b;
    }

    public final int hashCode() {
        return (((int) this.f38627a) * 31) + ((int) this.f38628b);
    }
}
