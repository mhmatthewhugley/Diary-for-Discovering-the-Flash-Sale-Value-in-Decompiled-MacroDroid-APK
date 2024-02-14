package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DoubleUtils {
    private DoubleUtils() {
    }

    /* renamed from: a */
    static double m73464a(double d) {
        Preconditions.m5377d(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }
}
