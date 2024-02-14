package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzby {

    /* renamed from: d */
    public static final zzby f27965d = new zzby(1.0f, 1.0f);

    /* renamed from: e */
    public static final zzn f27966e = zzbx.f27909a;

    /* renamed from: a */
    public final float f27967a;

    /* renamed from: b */
    public final float f27968b;

    /* renamed from: c */
    private final int f27969c;

    public zzby(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        boolean z = true;
        zzdd.m47210d(f > 0.0f);
        zzdd.m47210d(f2 <= 0.0f ? false : z);
        this.f27967a = f;
        this.f27968b = f2;
        this.f27969c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo43204a(long j) {
        return j * ((long) this.f27969c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzby = (zzby) obj;
            return this.f27967a == zzby.f27967a && this.f27968b == zzby.f27968b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f27967a) + 527) * 31) + Float.floatToRawIntBits(this.f27968b);
    }

    public final String toString() {
        return zzen.m49168i("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f27967a), Float.valueOf(this.f27968b));
    }
}
