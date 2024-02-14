package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class SmoothRateLimiter extends RateLimiter {

    /* renamed from: b */
    double f53684b;

    static final class SmoothBursty extends SmoothRateLimiter {
    }

    static final class SmoothWarmingUp extends SmoothRateLimiter {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final double mo61881a() {
        return ((double) TimeUnit.SECONDS.toMicros(1)) / this.f53684b;
    }
}
