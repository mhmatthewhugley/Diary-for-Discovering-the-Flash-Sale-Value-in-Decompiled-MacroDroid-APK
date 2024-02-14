package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfxs extends zzfxt {
    /* renamed from: a */
    public static int m51254a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(zzftm.m50971b("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: b */
    public static int m51255b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* renamed from: c */
    public static int m51256c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
