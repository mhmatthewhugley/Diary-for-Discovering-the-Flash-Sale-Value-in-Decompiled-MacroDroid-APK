package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class Stats implements Serializable {
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    /* renamed from: a */
    public long mo61158a() {
        return this.count;
    }

    /* renamed from: b */
    public double mo61159b() {
        return Math.sqrt(mo61160c());
    }

    /* renamed from: c */
    public double mo61160c() {
        Preconditions.m5398y(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.m73464a(this.sumOfSquaresOfDeltas) / ((double) mo61158a());
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        if (this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m5350b(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public String toString() {
        if (mo61158a() > 0) {
            return MoreObjects.m5334c(this).mo22193c("count", this.count).mo22191a("mean", this.mean).mo22191a("populationStandardDeviation", mo61159b()).mo22191a("min", this.min).mo22191a("max", this.max).toString();
        }
        return MoreObjects.m5334c(this).mo22193c("count", this.count).toString();
    }
}
