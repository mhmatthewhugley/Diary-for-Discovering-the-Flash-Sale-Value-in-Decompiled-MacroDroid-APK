package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
final class MathPreconditions {
    private MathPreconditions() {
    }

    /* renamed from: a */
    static void m73477a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: b */
    static void m73478b(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: c */
    static int m73479c(String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static int m73480d(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static void m73481e(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
