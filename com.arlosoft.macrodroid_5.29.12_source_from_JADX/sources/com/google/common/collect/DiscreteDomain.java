package com.google.common.collect;

import androidx.core.location.LocationRequestCompat;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    private static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* renamed from: a */
        private static final BigIntegerDomain f16555a = new BigIntegerDomain();

        /* renamed from: c */
        private static final BigInteger f16556c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d */
        private static final BigInteger f16557d = BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL);
        private static final long serialVersionUID = 0;

        BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f16555a;
        }

        /* renamed from: g */
        public long mo35002a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f16556c).min(f16557d).longValue();
        }

        /* renamed from: h */
        public BigInteger mo35005d(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public BigInteger mo35006e(BigInteger bigInteger, long j) {
            CollectPreconditions.m26536c(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        /* renamed from: j */
        public BigInteger mo35007f(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    private static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* renamed from: a */
        private static final IntegerDomain f16558a = new IntegerDomain();
        private static final long serialVersionUID = 0;

        IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f16558a;
        }

        /* renamed from: g */
        public long mo35002a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        /* renamed from: h */
        public Integer mo35003b() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: i */
        public Integer mo35004c() {
            return Integer.MIN_VALUE;
        }

        /* renamed from: j */
        public Integer mo35005d(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public Integer mo35006e(Integer num, long j) {
            CollectPreconditions.m26536c(j, "distance");
            return Integer.valueOf(Ints.m73614c(num.longValue() + j));
        }

        /* renamed from: l */
        public Integer mo35007f(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    private static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* renamed from: a */
        private static final LongDomain f16559a = new LongDomain();
        private static final long serialVersionUID = 0;

        LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return f16559a;
        }

        /* renamed from: g */
        public long mo35002a(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        /* renamed from: h */
        public Long mo35003b() {
            return Long.valueOf(LocationRequestCompat.PASSIVE_INTERVAL);
        }

        /* renamed from: i */
        public Long mo35004c() {
            return Long.MIN_VALUE;
        }

        /* renamed from: j */
        public Long mo35005d(Long l) {
            long longValue = l.longValue();
            if (longValue == LocationRequestCompat.PASSIVE_INTERVAL) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public Long mo35006e(Long l, long j) {
            CollectPreconditions.m26536c(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                Preconditions.m5378e(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        /* renamed from: l */
        public Long mo35007f(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    /* renamed from: a */
    public abstract long mo35002a(C c, C c2);

    @CanIgnoreReturnValue
    /* renamed from: b */
    public C mo35003b() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public C mo35004c() {
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public abstract C mo35005d(C c);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C mo35006e(C c, long j) {
        CollectPreconditions.m26536c(j, "distance");
        long j2 = 0;
        C c2 = c;
        while (j2 < j) {
            c2 = mo35005d(c2);
            if (c2 != null) {
                j2++;
            } else {
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 51);
                sb.append("overflowed computing offset(");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(j);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return c2;
    }

    /* renamed from: f */
    public abstract C mo35007f(C c);

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }
}
