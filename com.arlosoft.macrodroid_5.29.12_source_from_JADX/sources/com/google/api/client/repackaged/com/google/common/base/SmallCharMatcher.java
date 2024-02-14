package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtIncompatible;
import com.google.api.client.repackaged.com.google.common.base.CharMatcher;

@GwtIncompatible
final class SmallCharMatcher extends CharMatcher.FastMatcher {

    /* renamed from: r */
    private final char[] f52634r;

    /* renamed from: s */
    private final boolean f52635s;

    /* renamed from: t */
    private final long f52636t;

    /* renamed from: j */
    private boolean m72482j(int i) {
        return 1 == ((this.f52636t >> i) & 1);
    }

    /* renamed from: k */
    static int m72483k(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: f */
    public boolean mo60572f(char c) {
        if (c == 0) {
            return this.f52635s;
        }
        if (!m72482j(c)) {
            return false;
        }
        int length = this.f52634r.length - 1;
        int k = m72483k(c) & length;
        int i = k;
        do {
            char[] cArr = this.f52634r;
            if (cArr[i] == 0) {
                return false;
            }
            if (cArr[i] == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != k);
        return false;
    }
}
