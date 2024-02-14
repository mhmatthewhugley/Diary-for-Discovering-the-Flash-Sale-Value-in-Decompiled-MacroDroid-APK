package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzata {

    /* renamed from: d */
    public static final zzata f25533d = new zzata(1.0f, 1.0f);

    /* renamed from: a */
    public final float f25534a;

    /* renamed from: b */
    public final float f25535b = 1.0f;

    /* renamed from: c */
    private final int f25536c;

    public zzata(float f, float f2) {
        this.f25534a = f;
        this.f25536c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo41976a(long j) {
        return j * ((long) this.f25536c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzata.class == obj.getClass() && this.f25534a == ((zzata) obj).f25534a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f25534a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
