package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Ordering<? super T> forwardOrder;

    ReverseOrdering(Ordering<? super T> ordering) {
        this.forwardOrder = (Ordering) Preconditions.m5392s(ordering);
    }

    /* renamed from: c */
    public <E extends T> E mo36265c(@ParametricNullness E e, @ParametricNullness E e2) {
        return this.forwardOrder.mo36266d(e, e2);
    }

    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    /* renamed from: d */
    public <E extends T> E mo36266d(@ParametricNullness E e, @ParametricNullness E e2) {
        return this.forwardOrder.mo36265c(e, e2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    /* renamed from: j */
    public <S extends T> Ordering<S> mo34739j() {
        return this.forwardOrder;
    }

    public String toString() {
        String valueOf = String.valueOf(this.forwardOrder);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
