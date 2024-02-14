package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* renamed from: c */
    private final char[] f4195c;

    /* renamed from: d */
    private final boolean f4196d;

    /* renamed from: f */
    private final long f4197f;

    /* renamed from: x */
    private boolean m5420x(int i) {
        return 1 == ((this.f4197f >> i) & 1);
    }

    /* renamed from: y */
    static int m5421y(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: o */
    public boolean mo22108o(char c) {
        if (c == 0) {
            return this.f4196d;
        }
        if (!m5420x(c)) {
            return false;
        }
        int length = this.f4195c.length - 1;
        int y = m5421y(c) & length;
        int i = y;
        do {
            char[] cArr = this.f4195c;
            if (cArr[i] == 0) {
                return false;
            }
            if (cArr[i] == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != y);
        return false;
    }
}
