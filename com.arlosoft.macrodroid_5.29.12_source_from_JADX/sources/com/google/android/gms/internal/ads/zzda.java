package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzda {

    /* renamed from: e */
    public static final zzda f31939e = new zzda(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final zzn f31940f = zzcz.f31884a;
    @IntRange(from = 0)

    /* renamed from: a */
    public final int f31941a;
    @IntRange(from = 0)

    /* renamed from: b */
    public final int f31942b;
    @IntRange(from = 0, mo610to = 359)

    /* renamed from: c */
    public final int f31943c;
    @FloatRange(from = 0.0d, fromInclusive = false)

    /* renamed from: d */
    public final float f31944d;

    public zzda(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, mo610to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.f31941a = i;
        this.f31942b = i2;
        this.f31943c = i3;
        this.f31944d = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzda = (zzda) obj;
            return this.f31941a == zzda.f31941a && this.f31942b == zzda.f31942b && this.f31943c == zzda.f31943c && this.f31944d == zzda.f31944d;
        }
    }

    public final int hashCode() {
        return ((((((this.f31941a + Opcodes.RSUB_INT_LIT8) * 31) + this.f31942b) * 31) + this.f31943c) * 31) + Float.floatToRawIntBits(this.f31944d);
    }
}
