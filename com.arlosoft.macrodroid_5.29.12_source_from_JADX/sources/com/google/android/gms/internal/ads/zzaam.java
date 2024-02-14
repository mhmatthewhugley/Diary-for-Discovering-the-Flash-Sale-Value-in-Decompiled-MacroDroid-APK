package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaam {

    /* renamed from: c */
    public static final zzaam f23738c = new zzaam(0, 0);

    /* renamed from: a */
    public final long f23739a;

    /* renamed from: b */
    public final long f23740b;

    public zzaam(long j, long j2) {
        this.f23739a = j;
        this.f23740b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaam.class == obj.getClass()) {
            zzaam zzaam = (zzaam) obj;
            return this.f23739a == zzaam.f23739a && this.f23740b == zzaam.f23740b;
        }
    }

    public final int hashCode() {
        return (((int) this.f23739a) * 31) + ((int) this.f23740b);
    }

    public final String toString() {
        long j = this.f23739a;
        long j2 = this.f23740b;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
