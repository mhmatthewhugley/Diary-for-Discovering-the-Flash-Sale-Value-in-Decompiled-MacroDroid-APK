package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Hashing {
    private Hashing() {
    }

    /* renamed from: a */
    static int m27247a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        return i2 > 0 ? i2 : BasicMeasure.EXACTLY;
    }

    /* renamed from: b */
    static boolean m27248b(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    /* renamed from: c */
    static int m27249c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: d */
    static int m27250d(Object obj) {
        return m27249c(obj == null ? 0 : obj.hashCode());
    }
}
