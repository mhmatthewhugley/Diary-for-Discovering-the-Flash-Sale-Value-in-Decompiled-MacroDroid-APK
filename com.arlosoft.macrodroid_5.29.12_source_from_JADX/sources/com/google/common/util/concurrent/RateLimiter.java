package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Locale;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public abstract class RateLimiter {

    /* renamed from: a */
    private volatile Object f53637a;

    static abstract class SleepingStopwatch {
        protected SleepingStopwatch() {
        }
    }

    /* renamed from: c */
    private Object m74281c() {
        Object obj = this.f53637a;
        if (obj == null) {
            synchronized (this) {
                obj = this.f53637a;
                if (obj == null) {
                    obj = new Object();
                    this.f53637a = obj;
                }
            }
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract double mo61881a();

    /* renamed from: b */
    public final double mo61882b() {
        double a;
        synchronized (m74281c()) {
            a = mo61881a();
        }
        return a;
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", new Object[]{Double.valueOf(mo61882b())});
    }
}
