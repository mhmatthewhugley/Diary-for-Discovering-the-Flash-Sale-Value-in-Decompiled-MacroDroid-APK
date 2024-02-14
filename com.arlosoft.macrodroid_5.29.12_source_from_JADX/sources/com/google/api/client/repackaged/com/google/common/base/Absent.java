package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;

@GwtCompatible
final class Absent<T> extends Optional<T> {

    /* renamed from: a */
    static final Absent<Object> f52570a = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return f52570a;
    }

    /* renamed from: a */
    public T mo60559a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public boolean mo60560b() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 1502476572;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
