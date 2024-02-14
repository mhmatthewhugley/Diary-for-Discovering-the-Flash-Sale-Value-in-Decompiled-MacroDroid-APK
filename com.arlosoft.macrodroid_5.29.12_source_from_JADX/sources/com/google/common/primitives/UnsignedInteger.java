package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* renamed from: a */
    public static final UnsignedInteger f53255a = m73676d(0);

    /* renamed from: c */
    public static final UnsignedInteger f53256c = m73676d(1);

    /* renamed from: d */
    public static final UnsignedInteger f53257d = m73676d(-1);
    private final int value;

    private UnsignedInteger(int i) {
        this.value = i & -1;
    }

    /* renamed from: d */
    public static UnsignedInteger m73676d(int i) {
        return new UnsignedInteger(i);
    }

    /* renamed from: b */
    public int compareTo(UnsignedInteger unsignedInteger) {
        Preconditions.m5392s(unsignedInteger);
        return UnsignedInts.m73679a(this.value, unsignedInteger.value);
    }

    public double doubleValue() {
        return (double) longValue();
    }

    /* renamed from: e */
    public String mo61408e(int i) {
        return UnsignedInts.m73682d(this.value, i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnsignedInteger) || this.value != ((UnsignedInteger) obj).value) {
            return false;
        }
        return true;
    }

    public float floatValue() {
        return (float) longValue();
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return UnsignedInts.m73681c(this.value);
    }

    public String toString() {
        return mo61408e(10);
    }
}
