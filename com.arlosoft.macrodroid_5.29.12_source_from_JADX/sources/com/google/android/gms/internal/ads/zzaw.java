package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaw {

    /* renamed from: f */
    public static final zzaw f25962f = new zzaw(new zzau());

    /* renamed from: g */
    public static final zzn f25963g = zzat.f25532a;

    /* renamed from: a */
    public final long f25964a;

    /* renamed from: b */
    public final long f25965b;

    /* renamed from: c */
    public final long f25966c;

    /* renamed from: d */
    public final float f25967d;

    /* renamed from: e */
    public final float f25968e;

    private zzaw(zzau zzau) {
        this.f25964a = -9223372036854775807L;
        this.f25965b = -9223372036854775807L;
        this.f25966c = -9223372036854775807L;
        this.f25967d = -3.4028235E38f;
        this.f25968e = -3.4028235E38f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        long j = ((zzaw) obj).f25964a;
        return true;
    }

    public final int hashCode() {
        int i = (int) -9223372034707292159L;
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
