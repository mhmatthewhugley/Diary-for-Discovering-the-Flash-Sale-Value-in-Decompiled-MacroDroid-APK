package p292io.reactivex.internal.util;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p262fa.C12251a;

/* renamed from: io.reactivex.internal.util.d */
/* compiled from: BackpressureHelper */
public final class C13218d {
    /* renamed from: a */
    public static long m85541a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        } while (!atomicLong.compareAndSet(j2, m85542b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m85542b(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j3;
    }

    /* renamed from: c */
    public static long m85543c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C12251a.m82985p(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
