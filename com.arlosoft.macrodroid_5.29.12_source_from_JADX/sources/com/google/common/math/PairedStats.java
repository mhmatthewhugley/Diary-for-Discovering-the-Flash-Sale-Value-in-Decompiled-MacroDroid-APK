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
public final class PairedStats implements Serializable {
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    /* renamed from: a */
    public long mo61153a() {
        return this.xStats.mo61158a();
    }

    /* renamed from: b */
    public double mo61154b() {
        Preconditions.m5398y(mo61153a() != 0);
        return this.sumOfProductsOfDeltas / ((double) mo61153a());
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        if (!this.xStats.equals(pairedStats.xStats) || !this.yStats.equals(pairedStats.yStats) || Double.doubleToLongBits(this.sumOfProductsOfDeltas) != Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public String toString() {
        if (mo61153a() > 0) {
            return MoreObjects.m5334c(this).mo22194d("xStats", this.xStats).mo22194d("yStats", this.yStats).mo22191a("populationCovariance", mo61154b()).toString();
        }
        return MoreObjects.m5334c(this).mo22194d("xStats", this.xStats).mo22194d("yStats", this.yStats).toString();
    }
}
