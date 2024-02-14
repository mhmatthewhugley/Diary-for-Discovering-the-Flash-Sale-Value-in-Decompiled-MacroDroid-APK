package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.math.BigDecimal;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class BigDecimalMath {

    private static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {

        /* renamed from: a */
        static final BigDecimalToDoubleRounder f53023a = new BigDecimalToDoubleRounder();

        private BigDecimalToDoubleRounder() {
        }
    }

    private BigDecimalMath() {
    }
}
