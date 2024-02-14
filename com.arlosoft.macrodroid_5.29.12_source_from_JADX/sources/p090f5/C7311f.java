package p090f5;

import android.os.SystemClock;

/* renamed from: f5.f */
/* compiled from: LogTime */
public final class C7311f {

    /* renamed from: a */
    private static final double f17887a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m30187a(long j) {
        return ((double) (m30188b() - j)) * f17887a;
    }

    /* renamed from: b */
    public static long m30188b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
