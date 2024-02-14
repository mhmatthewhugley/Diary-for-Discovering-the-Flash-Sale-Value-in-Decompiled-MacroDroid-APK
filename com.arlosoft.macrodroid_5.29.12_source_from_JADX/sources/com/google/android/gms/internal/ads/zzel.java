package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.core.location.LocationRequestCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzel {
    @GuardedBy("this")

    /* renamed from: a */
    private long f34341a;
    @GuardedBy("this")

    /* renamed from: b */
    private long f34342b;
    @GuardedBy("this")

    /* renamed from: c */
    private long f34343c;

    /* renamed from: d */
    private final ThreadLocal f34344d = new ThreadLocal();

    public zzel(long j) {
        mo45361f(0);
    }

    /* renamed from: a */
    public final synchronized long mo45356a(long j) {
        if (this.f34342b == -9223372036854775807L) {
            long j2 = this.f34341a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.f34344d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f34342b = j2 - j;
            notifyAll();
        }
        this.f34343c = j;
        return j + this.f34342b;
    }

    /* renamed from: b */
    public final synchronized long mo45357b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f34343c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((-1 + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo45356a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo45358c() {
        long j = this.f34341a;
        if (j == LocationRequestCompat.PASSIVE_INTERVAL || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo45359d() {
        long j;
        j = this.f34343c;
        return j != -9223372036854775807L ? j + this.f34342b : mo45358c();
    }

    /* renamed from: e */
    public final synchronized long mo45360e() {
        return this.f34342b;
    }

    /* renamed from: f */
    public final synchronized void mo45361f(long j) {
        this.f34341a = j;
        this.f34342b = j == LocationRequestCompat.PASSIVE_INTERVAL ? 0 : -9223372036854775807L;
        this.f34343c = -9223372036854775807L;
    }
}
