package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    Present(T t) {
        this.reference = t;
    }

    /* renamed from: b */
    public T mo22079b() {
        return this.reference;
    }

    /* renamed from: c */
    public boolean mo22080c() {
        return true;
    }

    /* renamed from: e */
    public T mo22081e(T t) {
        Preconditions.m5393t(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    /* renamed from: f */
    public T mo22083f() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
