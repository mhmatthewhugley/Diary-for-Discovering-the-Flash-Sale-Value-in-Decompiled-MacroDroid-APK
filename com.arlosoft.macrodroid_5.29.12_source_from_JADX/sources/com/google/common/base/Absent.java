package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Absent<T> extends Optional<T> {

    /* renamed from: a */
    static final Absent<Object> f4088a = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    /* renamed from: g */
    static <T> Optional<T> m5136g() {
        return f4088a;
    }

    private Object readResolve() {
        return f4088a;
    }

    /* renamed from: b */
    public T mo22079b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: c */
    public boolean mo22080c() {
        return false;
    }

    /* renamed from: e */
    public T mo22081e(T t) {
        return Preconditions.m5393t(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public T mo22083f() {
        return null;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
