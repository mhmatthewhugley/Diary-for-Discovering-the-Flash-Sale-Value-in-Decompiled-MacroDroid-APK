package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CacheStats {

    /* renamed from: a */
    private final long f4327a;

    /* renamed from: b */
    private final long f4328b;

    /* renamed from: c */
    private final long f4329c;

    /* renamed from: d */
    private final long f4330d;

    /* renamed from: e */
    private final long f4331e;

    /* renamed from: f */
    private final long f4332f;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z = true;
        Preconditions.m5377d(j7 >= 0);
        Preconditions.m5377d(j8 >= 0);
        Preconditions.m5377d(j9 >= 0);
        Preconditions.m5377d(j10 >= 0);
        Preconditions.m5377d(j11 >= 0);
        Preconditions.m5377d(j12 < 0 ? false : z);
        this.f4327a = j7;
        this.f4328b = j8;
        this.f4329c = j9;
        this.f4330d = j10;
        this.f4331e = j11;
        this.f4332f = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        if (this.f4327a == cacheStats.f4327a && this.f4328b == cacheStats.f4328b && this.f4329c == cacheStats.f4329c && this.f4330d == cacheStats.f4330d && this.f4331e == cacheStats.f4331e && this.f4332f == cacheStats.f4332f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m5350b(Long.valueOf(this.f4327a), Long.valueOf(this.f4328b), Long.valueOf(this.f4329c), Long.valueOf(this.f4330d), Long.valueOf(this.f4331e), Long.valueOf(this.f4332f));
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22193c("hitCount", this.f4327a).mo22193c("missCount", this.f4328b).mo22193c("loadSuccessCount", this.f4329c).mo22193c("loadExceptionCount", this.f4330d).mo22193c("totalLoadTime", this.f4331e).mo22193c("evictionCount", this.f4332f).toString();
    }
}
