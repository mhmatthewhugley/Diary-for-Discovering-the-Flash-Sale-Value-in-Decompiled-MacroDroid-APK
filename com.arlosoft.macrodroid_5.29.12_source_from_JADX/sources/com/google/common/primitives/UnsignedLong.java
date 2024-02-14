package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class UnsignedLong extends Number implements Comparable<UnsignedLong> {

    /* renamed from: a */
    public static final UnsignedLong f53260a = new UnsignedLong(0);

    /* renamed from: c */
    public static final UnsignedLong f53261c = new UnsignedLong(1);

    /* renamed from: d */
    public static final UnsignedLong f53262d = new UnsignedLong(-1);
    private final long value;

    private UnsignedLong(long j) {
        this.value = j;
    }

    /* renamed from: b */
    public int compareTo(UnsignedLong unsignedLong) {
        Preconditions.m5392s(unsignedLong);
        return UnsignedLongs.m73686a(this.value, unsignedLong.value);
    }

    public double doubleValue() {
        long j = this.value;
        if (j >= 0) {
            return (double) j;
        }
        return ((double) ((j & 1) | (j >>> 1))) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnsignedLong) || this.value != ((UnsignedLong) obj).value) {
            return false;
        }
        return true;
    }

    public float floatValue() {
        long j = this.value;
        if (j >= 0) {
            return (float) j;
        }
        return ((float) ((j & 1) | (j >>> 1))) * 2.0f;
    }

    public int hashCode() {
        return Longs.m73635e(this.value);
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public String toString() {
        return UnsignedLongs.m73690e(this.value);
    }
}
