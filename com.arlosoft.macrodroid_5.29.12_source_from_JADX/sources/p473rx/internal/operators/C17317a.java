package p473rx.internal.operators;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.a */
/* compiled from: BackpressureUtils */
public final class C17317a {
    /* renamed from: a */
    public static long m101036a(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j3;
    }

    /* renamed from: b */
    public static long m101037b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, m101036a(j2, j)));
        return j2;
    }

    /* renamed from: c */
    public static long m101038c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                throw new IllegalStateException("More produced than requested: " + j3);
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
